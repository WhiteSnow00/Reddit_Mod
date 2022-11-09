// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import kt.c;
import java.util.ArrayList;
import jt.b;
import java.io.IOException;
import kt.e;
import ak0.n;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class EventBatch
{
    public static final a<EventBatch, Builder> ADAPTER;
    public final List<Event> events;
    
    static {
        ADAPTER = (a)new EventBatchAdapter(null);
    }
    
    private EventBatch(final Builder builder) {
        this.events = Collections.unmodifiableList((List<? extends Event>)Builder.access$100(builder));
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
        return n.r(a.k("EventBatch{events="), (List)this.events, "}");
    }
    
    public void write(final e e) throws IOException {
        EventBatch.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<EventBatch>
    {
        private List<Event> events;
        
        public Builder() {
        }
        
        public Builder(final EventBatch eventBatch) {
            this.events = eventBatch.events;
        }
        
        public static /* synthetic */ List access$100(final Builder builder) {
            return builder.events;
        }
        
        public EventBatch build() {
            if (this.events != null) {
                return new EventBatch(this, null);
            }
            throw new IllegalStateException("Required field 'events' is missing");
        }
        
        public Builder events(final List<Event> events) {
            if (events != null) {
                this.events = events;
                return this;
            }
            throw new NullPointerException("Required field 'events' cannot be null");
        }
        
        public void reset() {
            this.events = null;
        }
    }
    
    public static final class EventBatchAdapter implements a<EventBatch, Builder>
    {
        private EventBatchAdapter() {
        }
        
        public EventBatch read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public EventBatch read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                if (q.b != 1) {
                    mt.a.a(e, a);
                }
                else if (a == 15) {
                    final c w = e.w();
                    final ArrayList list = new ArrayList<Event>(w.b);
                    for (int i = 0; i < w.b; ++i) {
                        list.add((Event)Event.ADAPTER.read(e));
                    }
                    e.x();
                    builder.events((List<Event>)list);
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final EventBatch eventBatch) throws IOException {
            e.a0();
            e.N(1, (byte)15);
            e.V((byte)12, eventBatch.events.size());
            final Iterator<Event> iterator = eventBatch.events.iterator();
            while (iterator.hasNext()) {
                Event.ADAPTER.write(e, (Object)iterator.next());
            }
            e.X();
            e.O();
            e.P();
            e.b0();
        }
    }
}
