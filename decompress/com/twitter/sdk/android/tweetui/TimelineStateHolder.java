// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import java.util.concurrent.atomic.AtomicBoolean;

class TimelineStateHolder
{
    public TimelineCursor nextCursor;
    public TimelineCursor previousCursor;
    public final AtomicBoolean requestInFlight;
    
    public TimelineStateHolder() {
        this.requestInFlight = new AtomicBoolean(false);
    }
    
    public TimelineStateHolder(final TimelineCursor nextCursor, final TimelineCursor previousCursor) {
        this.requestInFlight = new AtomicBoolean(false);
        this.nextCursor = nextCursor;
        this.previousCursor = previousCursor;
    }
    
    public void finishTimelineRequest() {
        this.requestInFlight.set(false);
    }
    
    public Long positionForNext() {
        final TimelineCursor nextCursor = this.nextCursor;
        Long maxPosition;
        if (nextCursor == null) {
            maxPosition = null;
        }
        else {
            maxPosition = nextCursor.maxPosition;
        }
        return maxPosition;
    }
    
    public Long positionForPrevious() {
        final TimelineCursor previousCursor = this.previousCursor;
        Long minPosition;
        if (previousCursor == null) {
            minPosition = null;
        }
        else {
            minPosition = previousCursor.minPosition;
        }
        return minPosition;
    }
    
    public void resetCursors() {
        this.nextCursor = null;
        this.previousCursor = null;
    }
    
    public void setCursorsIfNull(final TimelineCursor timelineCursor) {
        if (this.nextCursor == null) {
            this.nextCursor = timelineCursor;
        }
        if (this.previousCursor == null) {
            this.previousCursor = timelineCursor;
        }
    }
    
    public void setNextCursor(final TimelineCursor nextCursor) {
        this.setCursorsIfNull(this.nextCursor = nextCursor);
    }
    
    public void setPreviousCursor(final TimelineCursor previousCursor) {
        this.setCursorsIfNull(this.previousCursor = previousCursor);
    }
    
    public boolean startTimelineRequest() {
        return this.requestInFlight.compareAndSet(false, true);
    }
}
