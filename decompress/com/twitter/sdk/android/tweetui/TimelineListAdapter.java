// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import android.database.DataSetObserver;
import com.twitter.sdk.android.core.Callback;
import android.content.Context;
import android.widget.BaseAdapter;
import com.twitter.sdk.android.core.models.Identifiable;

abstract class TimelineListAdapter<T extends Identifiable> extends BaseAdapter
{
    public final Context context;
    public final TimelineDelegate<T> delegate;
    
    public TimelineListAdapter(final Context context, final Timeline<T> timeline) {
        this(context, (TimelineDelegate)new TimelineDelegate(timeline));
    }
    
    public TimelineListAdapter(final Context context, final TimelineDelegate<T> delegate) {
        if (context != null) {
            this.context = context;
            (this.delegate = delegate).refresh(null);
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
    
    public int getCount() {
        return this.delegate.getCount();
    }
    
    public T getItem(final int n) {
        return this.delegate.getItem(n);
    }
    
    public /* bridge */ Object getItem(final int n) {
        return this.getItem(n);
    }
    
    public long getItemId(final int n) {
        return this.delegate.getItemId(n);
    }
    
    public void notifyDataSetChanged() {
        this.delegate.notifyDataSetChanged();
    }
    
    public void notifyDataSetInvalidated() {
        this.delegate.notifyDataSetInvalidated();
    }
    
    public void refresh(final Callback<TimelineResult<T>> callback) {
        this.delegate.refresh(callback);
    }
    
    public void registerDataSetObserver(final DataSetObserver dataSetObserver) {
        this.delegate.registerDataSetObserver(dataSetObserver);
    }
    
    public void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
        this.delegate.unregisterDataSetObserver(dataSetObserver);
    }
}
