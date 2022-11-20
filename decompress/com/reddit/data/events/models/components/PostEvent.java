// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import b5.k;
import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class PostEvent
{
    public static final a<PostEvent, Builder> ADAPTER;
    public final Long event_end_timestamp;
    public final Long event_start_timestamp;
    public final String event_state;
    public final String type;
    
    static {
        ADAPTER = (a)new PostEventAdapter(null);
    }
    
    private PostEvent(final Builder builder) {
        this.type = Builder.access$100(builder);
        this.event_state = Builder.access$200(builder);
        this.event_start_timestamp = Builder.access$300(builder);
        this.event_end_timestamp = Builder.access$400(builder);
    }
    
    public PostEvent(final Builder builder, final PostEvent$1 object) {
        this(builder);
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
        if (!(o instanceof PostEvent)) {
            return false;
        }
        final PostEvent postEvent = (PostEvent)o;
        final String type = this.type;
        final String type2 = postEvent.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final String event_state = this.event_state;
            final String event_state2 = postEvent.event_state;
            if (event_state == event_state2 || (event_state != null && event_state.equals(event_state2))) {
                final Long event_start_timestamp = this.event_start_timestamp;
                final Long event_start_timestamp2 = postEvent.event_start_timestamp;
                if (event_start_timestamp == event_start_timestamp2 || (event_start_timestamp != null && event_start_timestamp.equals(event_start_timestamp2))) {
                    final Long event_end_timestamp = this.event_end_timestamp;
                    final Long event_end_timestamp2 = postEvent.event_end_timestamp;
                    boolean b2 = b;
                    if (event_end_timestamp == event_end_timestamp2) {
                        return b2;
                    }
                    if (event_end_timestamp != null && event_end_timestamp.equals(event_end_timestamp2)) {
                        b2 = b;
                        return b2;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final String event_state = this.event_state;
        int hashCode3;
        if (event_state == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = event_state.hashCode();
        }
        final Long event_start_timestamp = this.event_start_timestamp;
        int hashCode4;
        if (event_start_timestamp == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = event_start_timestamp.hashCode();
        }
        final Long event_end_timestamp = this.event_end_timestamp;
        if (event_end_timestamp != null) {
            hashCode = event_end_timestamp.hashCode();
        }
        return ((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PostEvent{type=");
        t.append(this.type);
        t.append(", event_state=");
        t.append(this.event_state);
        t.append(", event_start_timestamp=");
        t.append(this.event_start_timestamp);
        t.append(", event_end_timestamp=");
        return d.l(t, this.event_end_timestamp, "}");
    }
    
    public void write(final e e) throws IOException {
        PostEvent.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<PostEvent>
    {
        private Long event_end_timestamp;
        private Long event_start_timestamp;
        private String event_state;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final PostEvent postEvent) {
            this.type = postEvent.type;
            this.event_state = postEvent.event_state;
            this.event_start_timestamp = postEvent.event_start_timestamp;
            this.event_end_timestamp = postEvent.event_end_timestamp;
        }
        
        public static String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static String access$200(final Builder builder) {
            return builder.event_state;
        }
        
        public static Long access$300(final Builder builder) {
            return builder.event_start_timestamp;
        }
        
        public static Long access$400(final Builder builder) {
            return builder.event_end_timestamp;
        }
        
        public PostEvent build() {
            return new PostEvent(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder event_end_timestamp(final Long event_end_timestamp) {
            this.event_end_timestamp = event_end_timestamp;
            return this;
        }
        
        public Builder event_start_timestamp(final Long event_start_timestamp) {
            this.event_start_timestamp = event_start_timestamp;
            return this;
        }
        
        public Builder event_state(final String event_state) {
            this.event_state = event_state;
            return this;
        }
        
        public void reset() {
            this.type = null;
            this.event_state = null;
            this.event_start_timestamp = null;
            this.event_end_timestamp = null;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class PostEventAdapter implements a<PostEvent, Builder>
    {
        private PostEventAdapter() {
        }
        
        public PostEventAdapter(final PostEvent$1 object) {
            this();
        }
        
        public PostEvent read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public PostEvent read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                ht.a.a(e, a);
                            }
                            else if (a == 10) {
                                builder.event_end_timestamp(e.v());
                            }
                            else {
                                ht.a.a(e, a);
                            }
                        }
                        else if (a == 10) {
                            builder.event_start_timestamp(e.v());
                        }
                        else {
                            ht.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.event_state(e.F());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.type(e.F());
                }
                else {
                    ht.a.a(e, a);
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final PostEvent postEvent) throws IOException {
            e.X();
            if (postEvent.type != null) {
                e.O(1, (byte)11);
                e.W(postEvent.type);
                e.P();
            }
            if (postEvent.event_state != null) {
                e.O(2, (byte)11);
                e.W(postEvent.event_state);
                e.P();
            }
            if (postEvent.event_start_timestamp != null) {
                e.O(3, (byte)10);
                k.w(postEvent.event_start_timestamp, e);
            }
            if (postEvent.event_end_timestamp != null) {
                e.O(4, (byte)10);
                k.w(postEvent.event_end_timestamp, e);
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (PostEvent)o);
        }
    }
}
