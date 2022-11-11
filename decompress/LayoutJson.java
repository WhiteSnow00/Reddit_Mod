// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import ah2.f;
import t60.a;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/LayoutJson;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class LayoutJson
{
    public final List<a> a;
    public final LayoutMetadata b;
    
    public LayoutJson(final List<? extends a> a, final LayoutMetadata b) {
        this.a = (List<a>)a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LayoutJson)) {
            return false;
        }
        final LayoutJson layoutJson = (LayoutJson)o;
        return f.a((Object)this.a, (Object)layoutJson.a) && f.a((Object)this.b, (Object)layoutJson.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("LayoutJson(sections=");
        k.append(this.a);
        k.append(", metadata=");
        k.append(this.b);
        k.append(')');
        return k.toString();
    }
}
