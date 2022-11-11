// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class ZendeskTicket
{
    public static final a<ZendeskTicket, ZendeskTicket.ZendeskTicket$Builder> ADAPTER;
    public final Long id;
    public final String source;
    
    static {
        ADAPTER = (a)new ZendeskTicket.ZendeskTicket$ZendeskTicketAdapter((ZendeskTicket$1)null);
    }
    
    private ZendeskTicket(final ZendeskTicket.ZendeskTicket$Builder zendeskTicket$Builder) {
        this.id = ZendeskTicket.ZendeskTicket$Builder.access$100(zendeskTicket$Builder);
        this.source = ZendeskTicket.ZendeskTicket$Builder.access$200(zendeskTicket$Builder);
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
        if (!(o instanceof ZendeskTicket)) {
            return false;
        }
        final ZendeskTicket zendeskTicket = (ZendeskTicket)o;
        final Long id = this.id;
        final Long id2 = zendeskTicket.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String source = this.source;
            final String source2 = zendeskTicket.source;
            boolean b2 = b;
            if (source == source2) {
                return b2;
            }
            if (source != null && source.equals(source2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Long id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String source = this.source;
        if (source != null) {
            hashCode = source.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("ZendeskTicket{id=");
        r.append(this.id);
        r.append(", source=");
        return a.o(r, this.source, "}");
    }
    
    public void write(final e e) throws IOException {
        ZendeskTicket.ADAPTER.write(e, (Object)this);
    }
}
