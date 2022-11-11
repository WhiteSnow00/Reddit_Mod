// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import sg2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/JsonArtistsCarouselBody;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class JsonArtistsCarouselBody
{
    public final String a;
    public final String b;
    public final JsonArtistsQueryDescriptor c;
    
    public JsonArtistsCarouselBody(final String a, final String b, final JsonArtistsQueryDescriptor c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonArtistsCarouselBody)) {
            return false;
        }
        final JsonArtistsCarouselBody jsonArtistsCarouselBody = (JsonArtistsCarouselBody)o;
        return e.a((Object)this.a, (Object)jsonArtistsCarouselBody.a) && e.a((Object)this.b, (Object)jsonArtistsCarouselBody.b) && e.a((Object)this.c, (Object)jsonArtistsCarouselBody.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + b.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("JsonArtistsCarouselBody(title=");
        r.append(this.a);
        r.append(", cta=");
        r.append(this.b);
        r.append(", data=");
        r.append(this.c);
        r.append(')');
        return r.toString();
    }
}
