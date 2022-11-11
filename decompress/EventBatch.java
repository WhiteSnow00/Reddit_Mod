// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models;

import java.io.IOException;
import ft.e;
import al0.g7;
import java.util.Collections;
import java.util.List;
import et.a;

public final class EventBatch
{
    public static final a<EventBatch, EventBatch.EventBatch$Builder> ADAPTER;
    public final List<Event> events;
    
    static {
        ADAPTER = (a)new EventBatch.EventBatch$EventBatchAdapter((EventBatch$1)null);
    }
    
    private EventBatch(final EventBatch.EventBatch$Builder eventBatch$Builder) {
        this.events = Collections.unmodifiableList((List<? extends Event>)EventBatch.EventBatch$Builder.access$100(eventBatch$Builder));
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof EventBatch)) {
            return false;
        }
        final EventBatch eventBatch = (EventBatch)o;
        final List<Event> events = this.events;
        final List<Event> events2 = eventBatch.events;
        boolean b2 = b;
        if (events != events2) {
            b2 = (events.equals(events2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        return (this.events.hashCode() ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return g7.k(a.r("EventBatch{events="), (List)this.events, "}");
    }
    
    public void write(final e e) throws IOException {
        EventBatch.ADAPTER.write(e, (Object)this);
    }
}
