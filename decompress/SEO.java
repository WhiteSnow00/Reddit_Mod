// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class SEO
{
    public static final a<SEO, SEO.SEO$Builder> ADAPTER;
    public final String internal_link_url;
    
    static {
        ADAPTER = (a)new SEO.SEO$SEOAdapter((SEO$1)null);
    }
    
    private SEO(final SEO.SEO$Builder seo$Builder) {
        this.internal_link_url = SEO.SEO$Builder.access$100(seo$Builder);
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
        if (!(o instanceof SEO)) {
            return false;
        }
        final SEO seo = (SEO)o;
        final String internal_link_url = this.internal_link_url;
        final String internal_link_url2 = seo.internal_link_url;
        boolean b2 = b;
        if (internal_link_url != internal_link_url2) {
            b2 = (internal_link_url != null && internal_link_url.equals(internal_link_url2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String internal_link_url = this.internal_link_url;
        int hashCode;
        if (internal_link_url == null) {
            hashCode = 0;
        }
        else {
            hashCode = internal_link_url.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return b.j(a.k("SEO{internal_link_url="), this.internal_link_url, "}");
    }
    
    public void write(final e e) throws IOException {
        SEO.ADAPTER.write(e, (Object)this);
    }
}
