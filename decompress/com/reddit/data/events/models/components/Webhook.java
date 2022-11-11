// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Webhook
{
    public static final a<Webhook, Webhook.Webhook$Builder> ADAPTER;
    public final String id;
    public final String type;
    
    static {
        ADAPTER = (a)new Webhook.Webhook$WebhookAdapter((Webhook$1)null);
    }
    
    private Webhook(final Webhook.Webhook$Builder webhook$Builder) {
        this.id = Webhook.Webhook$Builder.access$100(webhook$Builder);
        this.type = Webhook.Webhook$Builder.access$200(webhook$Builder);
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
        final StringBuilder r = a.r("Webhook{id=");
        r.append(this.id);
        r.append(", type=");
        return a.o(r, this.type, "}");
    }
    
    public void write(final e e) throws IOException {
        Webhook.ADAPTER.write(e, (Object)this);
    }
}
