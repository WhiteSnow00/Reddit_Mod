// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import aq2.a;
import ng2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/JsonOutfitsBody;", "", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class JsonOutfitsBody
{
    public final String a;
    public final String b;
    public final JsonListingsQueryDescriptor c;
    
    public JsonOutfitsBody(final String a, final String b, final JsonListingsQueryDescriptor c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonOutfitsBody)) {
            return false;
        }
        final JsonOutfitsBody jsonOutfitsBody = (JsonOutfitsBody)o;
        return e.a((Object)this.a, (Object)jsonOutfitsBody.a) && e.a((Object)this.b, (Object)jsonOutfitsBody.b) && e.a((Object)this.c, (Object)jsonOutfitsBody.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + aq2.a.e(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("JsonOutfitsBody(title=");
        t.append(this.a);
        t.append(", cta=");
        t.append(this.b);
        t.append(", data=");
        t.append(this.c);
        t.append(')');
        return t.toString();
    }
}
