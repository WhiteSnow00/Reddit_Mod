// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Webhook
{
    public static final a<Webhook, Builder> ADAPTER;
    public final String id;
    public final String type;
    
    static {
        ADAPTER = (a)new WebhookAdapter(null);
    }
    
    private Webhook(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.type = Builder.access$200(builder);
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
        if (!(o instanceof Webhook)) {
            return false;
        }
        final Webhook webhook = (Webhook)o;
        final String id = this.id;
        final String id2 = webhook.id;
        if (id == id2 || id.equals(id2)) {
            final String type = this.type;
            final String type2 = webhook.type;
            boolean b2 = b;
            if (type == type2) {
                return b2;
            }
            if (type.equals(type2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return ((this.id.hashCode() ^ 0x1000193) * -2128831035 ^ this.type.hashCode()) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Webhook{id=");
        k.append(this.id);
        k.append(", type=");
        return b.j(k, this.type, "}");
    }
    
    public void write(final e e) throws IOException {
        Webhook.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Webhook>
    {
        private String id;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final Webhook webhook) {
            this.id = webhook.id;
            this.type = webhook.type;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.type;
        }
        
        public Webhook build() {
            if (this.id == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            if (this.type != null) {
                return new Webhook(this, null);
            }
            throw new IllegalStateException("Required field 'type' is missing");
        }
        
        public Builder id(final String id) {
            if (id != null) {
                this.id = id;
                return this;
            }
            throw new NullPointerException("Required field 'id' cannot be null");
        }
        
        public void reset() {
            this.id = null;
            this.type = null;
        }
        
        public Builder type(final String type) {
            if (type != null) {
                this.type = type;
                return this;
            }
            throw new NullPointerException("Required field 'type' cannot be null");
        }
    }
    
    public static final class WebhookAdapter implements a<Webhook, Builder>
    {
        private WebhookAdapter() {
        }
        
        public Webhook read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Webhook read(final e e, final Builder builder) throws IOException {
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
        
        public void write(final e e, final Webhook webhook) throws IOException {
            e.a0();
            e.N(1, (byte)11);
            e.Z(webhook.id);
            e.O();
            e.N(2, (byte)11);
            e.Z(webhook.type);
            e.O();
            e.P();
            e.b0();
        }
    }
}
