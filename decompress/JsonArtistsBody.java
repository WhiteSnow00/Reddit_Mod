// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import sg2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/JsonArtistsBody;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class JsonArtistsBody
{
    public final String a;
    public final JsonArtistsQueryDescriptor b;
    
    public JsonArtistsBody(final String a, final JsonArtistsQueryDescriptor b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonArtistsBody)) {
            return false;
        }
        final JsonArtistsBody jsonArtistsBody = (JsonArtistsBody)o;
        return e.a((Object)this.a, (Object)jsonArtistsBody.a) && e.a((Object)this.b, (Object)jsonArtistsBody.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("JsonArtistsBody(cta=");
        r.append(this.a);
        r.append(", data=");
        r.append(this.b);
        r.append(')');
        return r.toString();
    }
}
