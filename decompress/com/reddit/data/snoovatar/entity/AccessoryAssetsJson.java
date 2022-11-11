// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import sg2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001¨\u0006\n" }, d2 = { "Lcom/reddit/data/snoovatar/entity/AccessoryAssetsJson;", "", "", "id", "imageUrl", "", "slot", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccessoryAssetsJson
{
    public final String a;
    public final String b;
    public final int c;
    
    public AccessoryAssetsJson(@n(name = "accessory_id") final String a, @n(name = "image_url") final String b, final int c) {
        e.f((Object)a, "id");
        e.f((Object)b, "imageUrl");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final AccessoryAssetsJson copy(@n(name = "accessory_id") final String s, @n(name = "image_url") final String s2, final int n) {
        e.f((Object)s, "id");
        e.f((Object)s2, "imageUrl");
        return new AccessoryAssetsJson(s, s2, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessoryAssetsJson)) {
            return false;
        }
        final AccessoryAssetsJson accessoryAssetsJson = (AccessoryAssetsJson)o;
        return e.a((Object)this.a, (Object)accessoryAssetsJson.a) && e.a((Object)this.b, (Object)accessoryAssetsJson.b) && this.c == accessoryAssetsJson.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + b.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("AccessoryAssetsJson(id=");
        r.append(this.a);
        r.append(", imageUrl=");
        r.append(this.b);
        r.append(", slot=");
        return d.l(r, this.c, ')');
    }
}
