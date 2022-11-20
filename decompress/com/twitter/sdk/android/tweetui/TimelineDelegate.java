// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import android.database.Observable;
import java.util.Collection;
import com.twitter.sdk.android.core.Result;
import android.database.DataSetObserver;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.Callback;
import java.util.ArrayList;
import android.database.DataSetObservable;
import java.util.List;
import com.twitter.sdk.android.core.models.Identifiable;

class TimelineDelegate<T extends Identifiable>
{
    public static final long CAPACITY = 200L;
    public List<T> itemList;
    public final DataSetObservable listAdapterObservable;
    public final Timeline<T> timeline;
    public final TimelineStateHolder timelineStateHolder;
    
    public TimelineDelegate(final Timeline<T> timeline) {
        this(timeline, null, null);
    }
    
    public TimelineDelegate(final Timeline<T> timeline, final DataSetObservable listAdapterObservable, final List<T> itemList) {
        if (timeline != null) {
            this.timeline = timeline;
            this.timelineStateHolder = new TimelineStateHolder();
            if (listAdapterObservable == null) {
                this.listAdapterObservable = new DataSetObservable();
            }
            else {
                this.listAdapterObservable = listAdapterObservable;
            }
            if (itemList == null) {
                this.itemList = new ArrayList<T>();
            }
            else {
                this.itemList = itemList;
            }
            return;
        }
        throw new IllegalArgumentException("Timeline must not be null");
    }
    
    public int getCount() {
        return this.itemList.size();
    }
    
    public T getItem(final int n) {
        if (this.isLastPosition(n)) {
            this.previous();
        }
        return this.itemList.get(n);
    }
    
    public long getItemId(final int n) {
        return this.itemList.get(n).getId();
    }
    
    public Timeline getTimeline() {
        return this.timeline;
    }
    
    public boolean isLastPosition(final int n) {
        final int size = this.itemList.size();
        boolean b = true;
        if (n != size - 1) {
            b = false;
        }
        return b;
    }
    
    public void loadNext(final Long n, final Callback<TimelineResult<T>> callback) {
        if (this.withinMaxCapacity()) {
            if (this.timelineStateHolder.startTimelineRequest()) {
                this.timeline.next(n, callback);
            }
            else {
                callback.failure(new TwitterException("Request already in flight"));
            }
        }
        else {
            callback.failure(new TwitterException("Max capacity reached"));
        }
    }
    
    public void loadPrevious(final Long n, final Callback<TimelineResult<T>> callback) {
        if (this.withinMaxCapacity()) {
            if (this.timelineStateHolder.startTimelineRequest()) {
                this.timeline.previous(n, callback);
            }
            else {
                callback.failure(new TwitterException("Request already in flight"));
            }
        }
        else {
            callback.failure(new TwitterException("Max capacity reached"));
        }
    }
    
    public void next(final Callback<TimelineResult<T>> callback) {
        this.loadNext(this.timelineStateHolder.positionForNext(), (Callback<TimelineResult<T>>)new NextCallback(callback, this.timelineStateHolder));
    }
    
    public void notifyDataSetChanged() {
        this.listAdapterObservable.notifyChanged();
    }
    
    public void notifyDataSetInvalidated() {
        this.listAdapterObservable.notifyInvalidated();
    }
    
    public void previous() {
        this.loadPrevious(this.timelineStateHolder.positionForPrevious(), (Callback<TimelineResult<T>>)new PreviousCallback(this.timelineStateHolder));
    }
    
    public void refresh(final Callback<TimelineResult<T>> callback) {
        this.timelineStateHolder.resetCursors();
        this.loadNext(this.timelineStateHolder.positionForNext(), (Callback<TimelineResult<T>>)new TimelineDelegate.TimelineDelegate$RefreshCallback(this, (Callback)callback, this.timelineStateHolder));
    }
    
    public void registerDataSetObserver(final DataSetObserver dataSetObserver) {
        ((Observable)this.listAdapterObservable).registerObserver((Object)dataSetObserver);
    }
    
    public void setItemById(final T t) {
        for (int i = 0; i < this.itemList.size(); ++i) {
            if (t.getId() == this.itemList.get(i).getId()) {
                this.itemList.set(i, t);
            }
        }
        this.notifyDataSetChanged();
    }
    
    public void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
        ((Observable)this.listAdapterObservable).unregisterObserver((Object)dataSetObserver);
    }
    
    public boolean withinMaxCapacity() {
        return this.itemList.size() < 200L;
    }
    
    public class NextCallback extends TimelineDelegate$DefaultCallback
    {
        public final TimelineDelegate this$0;
        
        public NextCallback(final TimelineDelegate this$0, final Callback<TimelineResult<T>> callback, final TimelineStateHolder timelineStateHolder) {
            super(this.this$0 = this$0, (Callback)callback, timelineStateHolder);
        }
        
        public void success(final Result<TimelineResult<T>> result) {
            if (((TimelineResult)result.data).items.size() > 0) {
                final ArrayList itemList = new ArrayList((Collection<? extends E>)((TimelineResult)result.data).items);
                itemList.addAll(this.this$0.itemList);
                final TimelineDelegate this$0 = this.this$0;
                this$0.itemList = itemList;
                this$0.notifyDataSetChanged();
                super.timelineStateHolder.setNextCursor(((TimelineResult)result.data).timelineCursor);
            }
            super.success((Result)result);
        }
    }
    
    public class PreviousCallback extends TimelineDelegate$DefaultCallback
    {
        public final TimelineDelegate this$0;
        
        public PreviousCallback(final TimelineDelegate this$0, final TimelineStateHolder timelineStateHolder) {
            super(this.this$0 = this$0, (Callback)null, timelineStateHolder);
        }
        
        public void success(final Result<TimelineResult<T>> result) {
            if (((TimelineResult)result.data).items.size() > 0) {
                this.this$0.itemList.addAll((Collection<? extends T>)((TimelineResult)result.data).items);
                this.this$0.notifyDataSetChanged();
                super.timelineStateHolder.setPreviousCursor(((TimelineResult)result.data).timelineCursor);
            }
            super.success((Result)result);
        }
    }
}
