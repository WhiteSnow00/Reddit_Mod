// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Ticket
{
    public static final a<Ticket, Builder> ADAPTER;
    public final String id;
    public final String queue_id;
    public final String status;
    public final String type;
    
    static {
        ADAPTER = (a)new TicketAdapter(null);
    }
    
    private Ticket(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.type = Builder.access$200(builder);
        this.queue_id = Builder.access$300(builder);
        this.status = Builder.access$400(builder);
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
        if (!(o instanceof Ticket)) {
            return false;
        }
        final Ticket ticket = (Ticket)o;
        final String id = this.id;
        final String id2 = ticket.id;
        if (id == id2 || id.equals(id2)) {
            final String type = this.type;
            final String type2 = ticket.type;
            if (type == type2 || (type != null && type.equals(type2))) {
                final String queue_id = this.queue_id;
                final String queue_id2 = ticket.queue_id;
                if (queue_id == queue_id2 || (queue_id != null && queue_id.equals(queue_id2))) {
                    final String status = this.status;
                    final String status2 = ticket.status;
                    boolean b2 = b;
                    if (status == status2) {
                        return b2;
                    }
                    if (status != null && status.equals(status2)) {
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
        final int hashCode = this.id.hashCode();
        final String type = this.type;
        int hashCode2 = 0;
        int hashCode3;
        if (type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = type.hashCode();
        }
        final String queue_id = this.queue_id;
        int hashCode4;
        if (queue_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = queue_id.hashCode();
        }
        final String status = this.status;
        if (status != null) {
            hashCode2 = status.hashCode();
        }
        return ((((hashCode ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode2) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Ticket{id=");
        k.append(this.id);
        k.append(", type=");
        k.append(this.type);
        k.append(", queue_id=");
        k.append(this.queue_id);
        k.append(", status=");
        return b.j(k, this.status, "}");
    }
    
    public void write(final e e) throws IOException {
        Ticket.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Ticket>
    {
        private String id;
        private String queue_id;
        private String status;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final Ticket ticket) {
            this.id = ticket.id;
            this.type = ticket.type;
            this.queue_id = ticket.queue_id;
            this.status = ticket.status;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.queue_id;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.status;
        }
        
        public Ticket build() {
            if (this.id != null) {
                return new Ticket(this, null);
            }
            throw new IllegalStateException("Required field 'id' is missing");
        }
        
        public Builder id(final String id) {
            if (id != null) {
                this.id = id;
                return this;
            }
            throw new NullPointerException("Required field 'id' cannot be null");
        }
        
        public Builder queue_id(final String queue_id) {
            this.queue_id = queue_id;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.type = null;
            this.queue_id = null;
            this.status = null;
        }
        
        public Builder status(final String status) {
            this.status = status;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class TicketAdapter implements a<Ticket, Builder>
    {
        private TicketAdapter() {
        }
        
        public Ticket read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Ticket read(final e e, final Builder builder) throws IOException {
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
                            if (b != 4) {
                                mt.a.a(e, a);
                            }
                            else if (a == 11) {
                                builder.status(e.F());
                            }
                            else {
                                mt.a.a(e, a);
                            }
                        }
                        else if (a == 11) {
                            builder.queue_id(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.type(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.id(e.F());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Ticket ticket) throws IOException {
            e.a0();
            e.N(1, (byte)11);
            e.Z(ticket.id);
            e.O();
            if (ticket.type != null) {
                e.N(2, (byte)11);
                e.Z(ticket.type);
                e.O();
            }
            if (ticket.queue_id != null) {
                e.N(3, (byte)11);
                e.Z(ticket.queue_id);
                e.O();
            }
            if (ticket.status != null) {
                e.N(4, (byte)11);
                e.Z(ticket.status);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
