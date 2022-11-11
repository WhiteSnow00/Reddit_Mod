// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import al0.f0;
import sg2.e;
import al0.b;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001¨\u0006\n" }, d2 = { "Lcom/reddit/data/snoovatar/entity/CategorySectionJson;", "", "", "id", "name", "categoryId", "colorPickerCustomizableClass", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CategorySectionJson
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    
    public CategorySectionJson(final String a, final String b, @n(name = "category_id") final String c, @n(name = "color_picker_customizable_class") final String d) {
        al0.b.q(a, "id", b, "name", c, "categoryId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final CategorySectionJson copy(final String s, final String s2, @n(name = "category_id") final String s3, @n(name = "color_picker_customizable_class") final String s4) {
        e.f((Object)s, "id");
        e.f((Object)s2, "name");
        e.f((Object)s3, "categoryId");
        return new CategorySectionJson(s, s2, s3, s4);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CategorySectionJson)) {
            return false;
        }
        final CategorySectionJson categorySectionJson = (CategorySectionJson)o;
        return e.a((Object)this.a, (Object)categorySectionJson.a) && e.a((Object)this.b, (Object)categorySectionJson.b) && e.a((Object)this.c, (Object)categorySectionJson.c) && e.a((Object)this.d, (Object)categorySectionJson.d);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31);
        final String d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        return c + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CategorySectionJson(id=");
        r.append(this.a);
        r.append(", name=");
        r.append(this.b);
        r.append(", categoryId=");
        r.append(this.c);
        r.append(", colorPickerCustomizableClass=");
        return f0.n(r, this.d, ')');
    }
}
