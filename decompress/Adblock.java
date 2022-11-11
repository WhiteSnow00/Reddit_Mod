// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class Adblock
{
    public static final a<Adblock, Adblock.Adblock$Builder> ADAPTER;
    public final Boolean acceptable_ads;
    public final Boolean enabled;
    
    static {
        ADAPTER = (a)new Adblock.Adblock$AdblockAdapter((Adblock$1)null);
    }
    
    private Adblock(final Adblock.Adblock$Builder adblock$Builder) {
        this.enabled = Adblock.Adblock$Builder.access$100(adblock$Builder);
        this.acceptable_ads = Adblock.Adblock$Builder.access$200(adblock$Builder);
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
        if (!(o instanceof Adblock)) {
            return false;
        }
        final Adblock adblock = (Adblock)o;
        final Boolean enabled = this.enabled;
        final Boolean enabled2 = adblock.enabled;
        if (enabled == enabled2 || (enabled != null && enabled.equals(enabled2))) {
            final Boolean acceptable_ads = this.acceptable_ads;
            final Boolean acceptable_ads2 = adblock.acceptable_ads;
            boolean b2 = b;
            if (acceptable_ads == acceptable_ads2) {
                return b2;
            }
            if (acceptable_ads != null && acceptable_ads.equals(acceptable_ads2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Boolean enabled = this.enabled;
        int hashCode = 0;
        int hashCode2;
        if (enabled == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = enabled.hashCode();
        }
        final Boolean acceptable_ads = this.acceptable_ads;
        if (acceptable_ads != null) {
            hashCode = acceptable_ads.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Adblock{enabled=");
        k.append(this.enabled);
        k.append(", acceptable_ads=");
        k.append(this.acceptable_ads);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        Adblock.ADAPTER.write(e, (Object)this);
    }
}
