// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import sg2.e;
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
        sg2.e.f((Object)a, "id");
        sg2.e.f((Object)b, "name");
        sg2.e.f((Object)c, "iconUrl");
        sg2.e.f((Object)d, "iconActiveUrl");
        sg2.e.f((Object)e, "sections");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final CategoryJson copy(final String s, final String s2, @n(name = "icon_url") final String s3, @n(name = "icon_active_url") final String s4, final List<CategorySectionJson> list) {
        sg2.e.f((Object)s, "id");
        sg2.e.f((Object)s2, "name");
        sg2.e.f((Object)s3, "iconUrl");
        sg2.e.f((Object)s4, "iconActiveUrl");
        sg2.e.f((Object)list, "sections");
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
        return sg2.e.a((Object)this.a, (Object)categoryJson.a) && sg2.e.a((Object)this.b, (Object)categoryJson.b) && sg2.e.a((Object)this.c, (Object)categoryJson.c) && sg2.e.a((Object)this.d, (Object)categoryJson.d) && sg2.e.a((Object)this.e, (Object)categoryJson.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + b.c(this.d, b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CategoryJson(id=");
        r.append(this.a);
        r.append(", name=");
        r.append(this.b);
        r.append(", iconUrl=");
        r.append(this.c);
        r.append(", iconActiveUrl=");
        r.append(this.d);
        r.append(", sections=");
        return d.o(r, (List)this.e, ')');
    }
}
