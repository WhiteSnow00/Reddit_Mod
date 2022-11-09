// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class MessengerRequest
{
    public static final a<MessengerRequest, Builder> ADAPTER;
    public final String dropped_reason;
    public final String message_type;
    public final String queue_name;
    
    static {
        ADAPTER = (a)new MessengerRequestAdapter(null);
    }
    
    private MessengerRequest(final Builder builder) {
        this.message_type = Builder.access$100(builder);
        this.dropped_reason = Builder.access$200(builder);
        this.queue_name = Builder.access$300(builder);
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
        if (!(o instanceof MessengerRequest)) {
            return false;
        }
        final MessengerRequest messengerRequest = (MessengerRequest)o;
        final String message_type = this.message_type;
        final String message_type2 = messengerRequest.message_type;
        if (message_type == message_type2 || (message_type != null && message_type.equals(message_type2))) {
            final String dropped_reason = this.dropped_reason;
            final String dropped_reason2 = messengerRequest.dropped_reason;
            if (dropped_reason == dropped_reason2 || (dropped_reason != null && dropped_reason.equals(dropped_reason2))) {
                final String queue_name = this.queue_name;
                final String queue_name2 = messengerRequest.queue_name;
                boolean b2 = b;
                if (queue_name == queue_name2) {
                    return b2;
                }
                if (queue_name != null && queue_name.equals(queue_name2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String message_type = this.message_type;
        int hashCode = 0;
        int hashCode2;
        if (message_type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = message_type.hashCode();
        }
        final String dropped_reason = this.dropped_reason;
        int hashCode3;
        if (dropped_reason == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = dropped_reason.hashCode();
        }
        final String queue_name = this.queue_name;
        if (queue_name != null) {
            hashCode = queue_name.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("MessengerRequest{message_type=");
        k.append(this.message_type);
        k.append(", dropped_reason=");
        k.append(this.dropped_reason);
        k.append(", queue_name=");
        return b.j(k, this.queue_name, "}");
    }
    
    public void write(final e e) throws IOException {
        MessengerRequest.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<MessengerRequest>
    {
        private String dropped_reason;
        private String message_type;
        private String queue_name;
        
        public Builder() {
        }
        
        public Builder(final MessengerRequest messengerRequest) {
            this.message_type = messengerRequest.message_type;
            this.dropped_reason = messengerRequest.dropped_reason;
            this.queue_name = messengerRequest.queue_name;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.message_type;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.dropped_reason;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.queue_name;
        }
        
        public MessengerRequest build() {
            return new MessengerRequest(this, null);
        }
        
        public Builder dropped_reason(final String dropped_reason) {
            this.dropped_reason = dropped_reason;
            return this;
        }
        
        public Builder message_type(final String message_type) {
            this.message_type = message_type;
            return this;
        }
        
        public Builder queue_name(final String queue_name) {
            this.queue_name = queue_name;
            return this;
        }
        
        public void reset() {
            this.message_type = null;
            this.dropped_reason = null;
            this.queue_name = null;
        }
    }
    
    public static final class MessengerRequestAdapter implements a<MessengerRequest, Builder>
    {
        private MessengerRequestAdapter() {
        }
        
        public MessengerRequest read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public MessengerRequest read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            mt.a.a(e, a);
                        }
                        else if (a == 11) {
                            builder.queue_name(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.dropped_reason(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.message_type(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final MessengerRequest messengerRequest) throws IOException {
            e.a0();
            if (messengerRequest.message_type != null) {
                e.N(1, (byte)11);
                e.Z(messengerRequest.message_type);
                e.O();
            }
            if (messengerRequest.dropped_reason != null) {
                e.N(2, (byte)11);
                e.Z(messengerRequest.dropped_reason);
                e.O();
            }
            if (messengerRequest.queue_name != null) {
                e.N(3, (byte)11);
                e.Z(messengerRequest.queue_name);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
