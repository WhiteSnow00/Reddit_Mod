// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class AdPreview
{
    public static final a<AdPreview, AdPreview.AdPreview$Builder> ADAPTER;
    public final String platform;
    public final String view_mode;
    
    static {
        ADAPTER = (a)new AdPreview.AdPreview$AdPreviewAdapter((AdPreview$1)null);
    }
    
    private AdPreview(final AdPreview.AdPreview$Builder adPreview$Builder) {
        this.view_mode = AdPreview.AdPreview$Builder.access$100(adPreview$Builder);
        this.platform = AdPreview.AdPreview$Builder.access$200(adPreview$Builder);
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
        if (!(o instanceof AdPreview)) {
            return false;
        }
        final AdPreview adPreview = (AdPreview)o;
        final String view_mode = this.view_mode;
        final String view_mode2 = adPreview.view_mode;
        if (view_mode == view_mode2 || (view_mode != null && view_mode.equals(view_mode2))) {
            final String platform = this.platform;
            final String platform2 = adPreview.platform;
            boolean b2 = b;
            if (platform == platform2) {
                return b2;
            }
            if (platform != null && platform.equals(platform2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String view_mode = this.view_mode;
        int hashCode = 0;
        int hashCode2;
        if (view_mode == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = view_mode.hashCode();
        }
        final String platform = this.platform;
        if (platform != null) {
            hashCode = platform.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdPreview{view_mode=");
        k.append(this.view_mode);
        k.append(", platform=");
        return b.j(k, this.platform, "}");
    }
    
    public void write(final e e) throws IOException {
        AdPreview.ADAPTER.write(e, (Object)this);
    }
}
