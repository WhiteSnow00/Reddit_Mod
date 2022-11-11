// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/JsonCategoryDescriptor;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class JsonCategoryDescriptor
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final JsonListingsQueryDescriptor f;
    
    public JsonCategoryDescriptor(final String a, final String b, final String c, final String d, final String e, final JsonListingsQueryDescriptor f) {
        sg2.e.f((Object)a, "id");
        sg2.e.f((Object)b, "title");
        sg2.e.f((Object)c, "subtitle");
        sg2.e.f((Object)d, "description");
        sg2.e.f((Object)f, "data");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonCategoryDescriptor)) {
            return false;
        }
        final JsonCategoryDescriptor jsonCategoryDescriptor = (JsonCategoryDescriptor)o;
        return sg2.e.a((Object)this.a, (Object)jsonCategoryDescriptor.a) && sg2.e.a((Object)this.b, (Object)jsonCategoryDescriptor.b) && sg2.e.a((Object)this.c, (Object)jsonCategoryDescriptor.c) && sg2.e.a((Object)this.d, (Object)jsonCategoryDescriptor.d) && sg2.e.a((Object)this.e, (Object)jsonCategoryDescriptor.e) && sg2.e.a((Object)this.f, (Object)jsonCategoryDescriptor.f);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.d, b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
        final String e = this.e;
        int hashCode;
        if (e == null) {
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
        }
        return this.f.hashCode() + (c + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("JsonCategoryDescriptor(id=");
        r.append(this.a);
        r.append(", title=");
        r.append(this.b);
        r.append(", subtitle=");
        r.append(this.c);
        r.append(", description=");
        r.append(this.d);
        r.append(", image=");
        r.append(this.e);
        r.append(", data=");
        r.append(this.f);
        r.append(')');
        return r.toString();
    }
}
