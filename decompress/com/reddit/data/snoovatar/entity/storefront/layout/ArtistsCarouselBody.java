// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import ag0.a;
import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/ArtistsCarouselBody;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ArtistsCarouselBody
{
    public final String a;
    public final String b;
    public final ArtistsQueryDescriptor c;
    
    public ArtistsCarouselBody(final String a, final String b, final ArtistsQueryDescriptor c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArtistsCarouselBody)) {
            return false;
        }
        final ArtistsCarouselBody artistsCarouselBody = (ArtistsCarouselBody)o;
        return f.a((Object)this.a, (Object)artistsCarouselBody.a) && f.a((Object)this.b, (Object)artistsCarouselBody.b) && f.a((Object)this.c, (Object)artistsCarouselBody.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + ag0.a.f(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ArtistsCarouselBody(title=");
        k.append(this.a);
        k.append(", cta=");
        k.append(this.b);
        k.append(", data=");
        k.append(this.c);
        k.append(')');
        return k.toString();
    }
}
