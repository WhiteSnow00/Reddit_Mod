// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class AdMetadata
{
    public static final a<AdMetadata, AdMetadata.AdMetadata$Builder> ADAPTER;
    public final String impression_id;
    
    static {
        ADAPTER = (a)new AdMetadata.AdMetadata$AdMetadataAdapter((AdMetadata$1)null);
    }
    
    private AdMetadata(final AdMetadata.AdMetadata$Builder adMetadata$Builder) {
        this.impression_id = AdMetadata.AdMetadata$Builder.access$100(adMetadata$Builder);
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
        if (!(o instanceof AdMetadata)) {
            return false;
        }
        final AdMetadata adMetadata = (AdMetadata)o;
        final String impression_id = this.impression_id;
        final String impression_id2 = adMetadata.impression_id;
        boolean b2 = b;
        if (impression_id != impression_id2) {
            b2 = (impression_id != null && impression_id.equals(impression_id2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String impression_id = this.impression_id;
        int hashCode;
        if (impression_id == null) {
            hashCode = 0;
        }
        else {
            hashCode = impression_id.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return b.j(a.k("AdMetadata{impression_id="), this.impression_id, "}");
    }
    
    public void write(final e e) throws IOException {
        AdMetadata.ADAPTER.write(e, (Object)this);
    }
}
