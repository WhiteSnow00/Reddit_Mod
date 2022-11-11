// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import ak0.m;
import ah2.f;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/CategoriesBody;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CategoriesBody
{
    public final String a;
    public final List<CategoryDescriptor> b;
    
    public CategoriesBody(final String a, final List<CategoryDescriptor> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CategoriesBody)) {
            return false;
        }
        final CategoriesBody categoriesBody = (CategoriesBody)o;
        return f.a((Object)this.a, (Object)categoriesBody.a) && f.a((Object)this.b, (Object)categoriesBody.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CategoriesBody(title=");
        k.append(this.a);
        k.append(", content=");
        return m.n(k, (List)this.b, ')');
    }
}
