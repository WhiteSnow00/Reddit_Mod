// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Ticket
{
    public static final a<Ticket, Ticket.Ticket$Builder> ADAPTER;
    public final String id;
    public final String queue_id;
    public final String status;
    public final String type;
    
    static {
        ADAPTER = (a)new Ticket.Ticket$TicketAdapter((Ticket$1)null);
    }
    
    private Ticket(final Ticket.Ticket$Builder ticket$Builder) {
        this.id = Ticket.Ticket$Builder.access$100(ticket$Builder);
        this.type = Ticket.Ticket$Builder.access$200(ticket$Builder);
        this.queue_id = Ticket.Ticket$Builder.access$300(ticket$Builder);
        this.status = Ticket.Ticket$Builder.access$400(ticket$Builder);
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
        final StringBuilder r = a.r("Ticket{id=");
        r.append(this.id);
        r.append(", type=");
        r.append(this.type);
        r.append(", queue_id=");
        r.append(this.queue_id);
        r.append(", status=");
        return a.o(r, this.status, "}");
    }
    
    public void write(final e e) throws IOException {
        Ticket.ADAPTER.write(e, (Object)this);
    }
}
