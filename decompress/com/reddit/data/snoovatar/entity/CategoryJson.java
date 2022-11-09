// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import ak0.m;
import ag0.a;
import ah2.f;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJA\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001¨\u0006\r" }, d2 = { "Lcom/reddit/data/snoovatar/entity/CategoryJson;", "", "", "id", "name", "iconUrl", "iconActiveUrl", "", "Lcom/reddit/data/snoovatar/entity/CategorySectionJson;", "sections", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CategoryJson
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List<CategorySectionJson> e;
    
    public CategoryJson(final String a, final String b, @n(name = "icon_url") final String c, @n(name = "icon_active_url") final String d, final List<CategorySectionJson> e) {
        f.f((Object)a, "id");
        f.f((Object)b, "name");
        f.f((Object)c, "iconUrl");
        f.f((Object)d, "iconActiveUrl");
        f.f((Object)e, "sections");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final CategoryJson copy(final String s, final String s2, @n(name = "icon_url") final String s3, @n(name = "icon_active_url") final String s4, final List<CategorySectionJson> list) {
        f.f((Object)s, "id");
        f.f((Object)s2, "name");
        f.f((Object)s3, "iconUrl");
        f.f((Object)s4, "iconActiveUrl");
        f.f((Object)list, "sections");
        return new CategoryJson(s, s2, s3, s4, list);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CategoryJson)) {
            return false;
        }
        final CategoryJson categoryJson = (CategoryJson)o;
        return f.a((Object)this.a, (Object)categoryJson.a) && f.a((Object)this.b, (Object)categoryJson.b) && f.a((Object)this.c, (Object)categoryJson.c) && f.a((Object)this.d, (Object)categoryJson.d) && f.a((Object)this.e, (Object)categoryJson.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + ag0.a.f(this.d, ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CategoryJson(id=");
        k.append(this.a);
        k.append(", name=");
        k.append(this.b);
        k.append(", iconUrl=");
        k.append(this.c);
        k.append(", iconActiveUrl=");
        k.append(this.d);
        k.append(", sections=");
        return m.n(k, (List)this.e, ')');
    }
}
