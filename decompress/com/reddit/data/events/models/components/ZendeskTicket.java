// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class ZendeskTicket
{
    public static final a<ZendeskTicket, Builder> ADAPTER;
    public final Long id;
    public final String source;
    
    static {
        ADAPTER = (a)new ZendeskTicketAdapter(null);
    }
    
    private ZendeskTicket(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.source = Builder.access$200(builder);
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
        final StringBuilder k = a.k("ZendeskTicket{id=");
        k.append(this.id);
        k.append(", source=");
        return b.j(k, this.source, "}");
    }
    
    public void write(final e e) throws IOException {
        ZendeskTicket.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<ZendeskTicket>
    {
        private Long id;
        private String source;
        
        public Builder() {
        }
        
        public Builder(final ZendeskTicket zendeskTicket) {
            this.id = zendeskTicket.id;
            this.source = zendeskTicket.source;
        }
        
        public static /* synthetic */ Long access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.source;
        }
        
        public ZendeskTicket build() {
            return new ZendeskTicket(this, null);
        }
        
        public Builder id(final Long id) {
            this.id = id;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.source = null;
        }
        
        public Builder source(final String source) {
            this.source = source;
            return this;
        }
    }
    
    public static final class ZendeskTicketAdapter implements a<ZendeskTicket, Builder>
    {
        private ZendeskTicketAdapter() {
        }
        
        public ZendeskTicket read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ZendeskTicket read(final e e, final Builder builder) throws IOException {
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
                        mt.a.a(e, a);
                    }
                    else if (a == 11) {
                        builder.source(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 10) {
                    builder.id(e.v());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final ZendeskTicket zendeskTicket) throws IOException {
            e.a0();
            if (zendeskTicket.id != null) {
                e.N(1, (byte)10);
                a.r(zendeskTicket.id, e);
            }
            if (zendeskTicket.source != null) {
                e.N(2, (byte)11);
                e.Z(zendeskTicket.source);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
