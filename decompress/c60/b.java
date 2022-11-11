// 
// Decompiled by Procyon v0.6.0
// 

package c60;

import sg2.e;
import b60.k;
import b60.j;

public final class b
{
    public final j a;
    public final k b;
    public final Boolean c;
    
    public b(final j a, final k b, final Boolean c) {
        e.f((Object)a, "link");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return e.a((Object)this.a, (Object)b.a) && e.a((Object)this.b, (Object)b.b) && e.a((Object)this.c, (Object)b.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final k b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Boolean c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("LinkQueryModel(link=");
        r.append(this.a);
        r.append(", mutation=");
        r.append(this.b);
        r.append(", userIsSubscriber=");
        return android.support.v4.media.a.j(r, this.c, ')');
    }
}
