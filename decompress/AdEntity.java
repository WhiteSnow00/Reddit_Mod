// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class AdEntity
{
    public static final a<AdEntity, AdEntity.AdEntity$Builder> ADAPTER;
    public final String connector;
    public final String id;
    
    static {
        ADAPTER = (a)new AdEntity.AdEntity$AdEntityAdapter((AdEntity$1)null);
    }
    
    private AdEntity(final AdEntity.AdEntity$Builder adEntity$Builder) {
        this.id = AdEntity.AdEntity$Builder.access$100(adEntity$Builder);
        this.connector = AdEntity.AdEntity$Builder.access$200(adEntity$Builder);
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
        if (!(o instanceof AdEntity)) {
            return false;
        }
        final AdEntity adEntity = (AdEntity)o;
        final String id = this.id;
        final String id2 = adEntity.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final String connector = this.connector;
            final String connector2 = adEntity.connector;
            boolean b2 = b;
            if (connector == connector2) {
                return b2;
            }
            if (connector != null && connector.equals(connector2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final String connector = this.connector;
        if (connector != null) {
            hashCode = connector.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdEntity{id=");
        k.append(this.id);
        k.append(", connector=");
        return b.j(k, this.connector, "}");
    }
    
    public void write(final e e) throws IOException {
        AdEntity.ADAPTER.write(e, (Object)this);
    }
}
