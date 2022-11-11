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
@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ-\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001¨\u0006\u000b" }, d2 = { "Lcom/reddit/data/snoovatar/entity/ClosetJson;", "", "", "Lcom/reddit/data/snoovatar/entity/AccessoryJson;", "accessories", "", "maxSlots", "occupiedSlots", "copy", "<init>", "(Ljava/util/List;II)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ClosetJson
{
    public final List<AccessoryJson> a;
    public final int b;
    public final int c;
    
    public ClosetJson(final List<AccessoryJson> a, @n(name = "max_slots") final int b, @n(name = "occupied_slots") final int c) {
        e.f((Object)a, "accessories");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final ClosetJson copy(final List<AccessoryJson> list, @n(name = "max_slots") final int n, @n(name = "occupied_slots") final int n2) {
        e.f((Object)list, "accessories");
        return new ClosetJson(list, n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClosetJson)) {
            return false;
        }
        final ClosetJson closetJson = (ClosetJson)o;
        return e.a((Object)this.a, (Object)closetJson.a) && this.b == closetJson.b && this.c == closetJson.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + a.c(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ClosetJson(accessories=");
        r.append(this.a);
        r.append(", maxSlots=");
        r.append(this.b);
        r.append(", occupiedSlots=");
        return d.l(r, this.c, ')');
    }
}
