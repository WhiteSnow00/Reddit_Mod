// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class AdPixel
{
    public static final a<AdPixel, AdPixel.AdPixel$Builder> ADAPTER;
    public final Boolean deferred;
    public final Long event_timestamp;
    public final Integer tracking_type;
    
    static {
        ADAPTER = (a)new AdPixel.AdPixel$AdPixelAdapter((AdPixel$1)null);
    }
    
    private AdPixel(final AdPixel.AdPixel$Builder adPixel$Builder) {
        this.event_timestamp = AdPixel.AdPixel$Builder.access$100(adPixel$Builder);
        this.deferred = AdPixel.AdPixel$Builder.access$200(adPixel$Builder);
        this.tracking_type = AdPixel.AdPixel$Builder.access$300(adPixel$Builder);
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
        if (!(o instanceof AdPixel)) {
            return false;
        }
        final AdPixel adPixel = (AdPixel)o;
        final Long event_timestamp = this.event_timestamp;
        final Long event_timestamp2 = adPixel.event_timestamp;
        if (event_timestamp == event_timestamp2 || (event_timestamp != null && event_timestamp.equals(event_timestamp2))) {
            final Boolean deferred = this.deferred;
            final Boolean deferred2 = adPixel.deferred;
            if (deferred == deferred2 || (deferred != null && deferred.equals(deferred2))) {
                final Integer tracking_type = this.tracking_type;
                final Integer tracking_type2 = adPixel.tracking_type;
                boolean b2 = b;
                if (tracking_type == tracking_type2) {
                    return b2;
                }
                if (tracking_type != null && tracking_type.equals(tracking_type2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Long event_timestamp = this.event_timestamp;
        int hashCode = 0;
        int hashCode2;
        if (event_timestamp == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = event_timestamp.hashCode();
        }
        final Boolean deferred = this.deferred;
        int hashCode3;
        if (deferred == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = deferred.hashCode();
        }
        final Integer tracking_type = this.tracking_type;
        if (tracking_type != null) {
            hashCode = tracking_type.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdPixel{event_timestamp=");
        k.append(this.event_timestamp);
        k.append(", deferred=");
        k.append(this.deferred);
        k.append(", tracking_type=");
        k.append(this.tracking_type);
        k.append("}");
        return k.toString();
    }
    
    public void write(final e e) throws IOException {
        AdPixel.ADAPTER.write(e, (Object)this);
    }
}
