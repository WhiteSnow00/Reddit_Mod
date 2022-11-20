// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.Identifiable;
import java.util.List;

public class TimelineCursor
{
    public final Long maxPosition;
    public final Long minPosition;
    
    public TimelineCursor(final Long minPosition, final Long maxPosition) {
        this.minPosition = minPosition;
        this.maxPosition = maxPosition;
    }
    
    public TimelineCursor(final List<? extends Identifiable> list) {
        final int size = list.size();
        final Long n = null;
        Long value;
        if (size > 0) {
            value = list.get(list.size() - 1).getId();
        }
        else {
            value = null;
        }
        this.minPosition = value;
        Long value2 = n;
        if (list.size() > 0) {
            value2 = list.get(0).getId();
        }
        this.maxPosition = value2;
    }
}
