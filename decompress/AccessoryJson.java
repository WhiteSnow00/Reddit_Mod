// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import al0.g7;
import sg2.e;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010Jm\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\fH\u00c6\u0001¨\u0006\u0011" }, d2 = { "Lcom/reddit/data/snoovatar/entity/AccessoryJson;", "", "", "id", "sectionId", "", "customizableClasses", "capabilityRequired", "state", "Lcom/reddit/data/snoovatar/entity/AccessoryAssetsJson;", "assets", "tags", "", "availableForCloset", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccessoryJson
{
    public final String a;
    public final String b;
    public final List<String> c;
    public final String d;
    public final String e;
    public final List<AccessoryAssetsJson> f;
    public final List<String> g;
    public final boolean h;
    
    public AccessoryJson(final String a, @n(name = "section_id") final String b, @n(name = "customizable_classes") final List<String> c, @n(name = "capability_required") final String d, final String e, final List<AccessoryAssetsJson> f, final List<String> g, @n(name = "available_for_closet") final boolean h) {
        sg2.e.f((Object)a, "id");
        sg2.e.f((Object)b, "sectionId");
        sg2.e.f((Object)c, "customizableClasses");
        sg2.e.f((Object)e, "state");
        sg2.e.f((Object)f, "assets");
        sg2.e.f((Object)g, "tags");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final AccessoryJson copy(final String s, @n(name = "section_id") final String s2, @n(name = "customizable_classes") final List<String> list, @n(name = "capability_required") final String s3, final String s4, final List<AccessoryAssetsJson> list2, final List<String> list3, @n(name = "available_for_closet") final boolean b) {
        sg2.e.f((Object)s, "id");
        sg2.e.f((Object)s2, "sectionId");
        sg2.e.f((Object)list, "customizableClasses");
        sg2.e.f((Object)s4, "state");
        sg2.e.f((Object)list2, "assets");
        sg2.e.f((Object)list3, "tags");
        return new AccessoryJson(s, s2, list, s3, s4, list2, list3, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessoryJson)) {
            return false;
        }
        final AccessoryJson accessoryJson = (AccessoryJson)o;
        return sg2.e.a((Object)this.a, (Object)accessoryJson.a) && sg2.e.a((Object)this.b, (Object)accessoryJson.b) && sg2.e.a((Object)this.c, (Object)accessoryJson.c) && sg2.e.a((Object)this.d, (Object)accessoryJson.d) && sg2.e.a((Object)this.e, (Object)accessoryJson.e) && sg2.e.a((Object)this.f, (Object)accessoryJson.f) && sg2.e.a((Object)this.g, (Object)accessoryJson.g) && this.h == accessoryJson.h;
    }
    
    @Override
    public final int hashCode() {
        final int c = aw.b.c((List)this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31);
        final String d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        final int c2 = aw.b.c((List)this.g, aw.b.c((List)this.f, b.c(this.e, (c + hashCode) * 31, 31), 31), 31);
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        return c2 + h;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("AccessoryJson(id=");
        r.append(this.a);
        r.append(", sectionId=");
        r.append(this.b);
        r.append(", customizableClasses=");
        r.append(this.c);
        r.append(", capabilityRequired=");
        r.append(this.d);
        r.append(", state=");
        r.append(this.e);
        r.append(", assets=");
        r.append(this.f);
        r.append(", tags=");
        r.append(this.g);
        r.append(", availableForCloset=");
        return g7.m(r, this.h, ')');
    }
}
