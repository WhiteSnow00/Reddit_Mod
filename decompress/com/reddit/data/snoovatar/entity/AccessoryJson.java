// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import androidx.appcompat.widget.s0;
import a2.b;
import ag0.a;
import ah2.f;
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
        ah2.f.f((Object)a, "id");
        ah2.f.f((Object)b, "sectionId");
        ah2.f.f((Object)c, "customizableClasses");
        ah2.f.f((Object)e, "state");
        ah2.f.f((Object)f, "assets");
        ah2.f.f((Object)g, "tags");
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
        ah2.f.f((Object)s, "id");
        ah2.f.f((Object)s2, "sectionId");
        ah2.f.f((Object)list, "customizableClasses");
        ah2.f.f((Object)s4, "state");
        ah2.f.f((Object)list2, "assets");
        ah2.f.f((Object)list3, "tags");
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
        return ah2.f.a((Object)this.a, (Object)accessoryJson.a) && ah2.f.a((Object)this.b, (Object)accessoryJson.b) && ah2.f.a((Object)this.c, (Object)accessoryJson.c) && ah2.f.a((Object)this.d, (Object)accessoryJson.d) && ah2.f.a((Object)this.e, (Object)accessoryJson.e) && ah2.f.a((Object)this.f, (Object)accessoryJson.f) && ah2.f.a((Object)this.g, (Object)accessoryJson.g) && this.h == accessoryJson.h;
    }
    
    @Override
    public final int hashCode() {
        final int a = a2.b.a((List)this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31);
        final String d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        final int a2 = a2.b.a((List)this.g, a2.b.a((List)this.f, ag0.a.f(this.e, (a + hashCode) * 31, 31), 31), 31);
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        return a2 + h;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("AccessoryJson(id=");
        k.append(this.a);
        k.append(", sectionId=");
        k.append(this.b);
        k.append(", customizableClasses=");
        k.append(this.c);
        k.append(", capabilityRequired=");
        k.append(this.d);
        k.append(", state=");
        k.append(this.e);
        k.append(", assets=");
        k.append(this.f);
        k.append(", tags=");
        k.append(this.g);
        k.append(", availableForCloset=");
        return s0.o(k, this.h, ')');
    }
}
