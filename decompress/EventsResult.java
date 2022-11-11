// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models;

import sg2.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015" }, d2 = { "Lcom/reddit/data/events/models/EventsResult;", "", "ids", "", "", "events", "Lcom/reddit/data/events/models/Event;", "(Ljava/util/List;Ljava/util/List;)V", "getEvents", "()Ljava/util/List;", "getIds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class EventsResult
{
    private final List<Event> events;
    private final List<Long> ids;
    
    public EventsResult(final List<Long> ids, final List<Event> events) {
        e.f((Object)ids, "ids");
        e.f((Object)events, "events");
        this.ids = ids;
        this.events = events;
    }
    
    public final List<Long> component1() {
        return this.ids;
    }
    
    public final List<Event> component2() {
        return this.events;
    }
    
    public final EventsResult copy(final List<Long> list, final List<Event> list2) {
        e.f((Object)list, "ids");
        e.f((Object)list2, "events");
        return new EventsResult(list, list2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EventsResult)) {
            return false;
        }
        final EventsResult eventsResult = (EventsResult)o;
        return e.a((Object)this.ids, (Object)eventsResult.ids) && e.a((Object)this.events, (Object)eventsResult.events);
    }
    
    public final List<Event> getEvents() {
        return this.events;
    }
    
    public final List<Long> getIds() {
        return this.ids;
    }
    
    @Override
    public int hashCode() {
        return this.events.hashCode() + this.ids.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("EventsResult(ids=");
        r.append(this.ids);
        r.append(", events=");
        return d.o(r, (List)this.events, ')');
    }
}
