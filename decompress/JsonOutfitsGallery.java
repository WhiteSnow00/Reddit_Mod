// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import sg2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;
import m60.b;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/JsonOutfitsGallery;", "Lm60/b;", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class JsonOutfitsGallery implements b
{
    public final String a;
    public final JsonOutfitsBody b;
    
    public JsonOutfitsGallery(final String a, final JsonOutfitsBody b) {
        this.a = a;
        this.b = b;
    }
    
    public final JsonOutfitsBody a() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonOutfitsGallery)) {
            return false;
        }
        final JsonOutfitsGallery jsonOutfitsGallery = (JsonOutfitsGallery)o;
        return e.a((Object)this.a, (Object)jsonOutfitsGallery.a) && e.a((Object)this.b, (Object)jsonOutfitsGallery.b);
    }
    
    public final String getId() {
        return this.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("JsonOutfitsGallery(id=");
        r.append(this.a);
        r.append(", body=");
        r.append(this.b);
        r.append(')');
        return r.toString();
    }
}
