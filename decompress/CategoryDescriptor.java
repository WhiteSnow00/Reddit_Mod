// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import ag0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/CategoryDescriptor;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CategoryDescriptor
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ListingsQueryDescriptor f;
    
    public CategoryDescriptor(final String a, final String b, final String c, final String d, final String e, final ListingsQueryDescriptor f) {
        ah2.f.f((Object)a, "id");
        ah2.f.f((Object)b, "title");
        ah2.f.f((Object)c, "subtitle");
        ah2.f.f((Object)d, "description");
        ah2.f.f((Object)f, "data");
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
        if (!(o instanceof CategoryDescriptor)) {
            return false;
        }
        final CategoryDescriptor categoryDescriptor = (CategoryDescriptor)o;
        return ah2.f.a((Object)this.a, (Object)categoryDescriptor.a) && ah2.f.a((Object)this.b, (Object)categoryDescriptor.b) && ah2.f.a((Object)this.c, (Object)categoryDescriptor.c) && ah2.f.a((Object)this.d, (Object)categoryDescriptor.d) && ah2.f.a((Object)this.e, (Object)categoryDescriptor.e) && ah2.f.a((Object)this.f, (Object)categoryDescriptor.f);
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.d, ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
        final String e = this.e;
        int hashCode;
        if (e == null) {
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
        }
        return this.f.hashCode() + (f + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CategoryDescriptor(id=");
        k.append(this.a);
        k.append(", title=");
        k.append(this.b);
        k.append(", subtitle=");
        k.append(this.c);
        k.append(", description=");
        k.append(this.d);
        k.append(", image=");
        k.append(this.e);
        k.append(", data=");
        k.append(this.f);
        k.append(')');
        return k.toString();
    }
}
