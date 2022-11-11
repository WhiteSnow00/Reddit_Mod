// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import sg2.e;

public final class k
{
    public final String a;
    public final boolean b;
    public final long c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    
    public k() {
        this(null, 127);
    }
    
    public k(final String a, final boolean b, final long c, final Boolean d, final Boolean e, final Boolean f, final Boolean g) {
        sg2.e.f((Object)a, "parentLinkId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static k a(final k k, boolean b, long c, Boolean d, Boolean e, Boolean f, Boolean g, final int n) {
        String a;
        if ((n & 0x1) != 0x0) {
            a = k.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = k.b;
        }
        if ((n & 0x4) != 0x0) {
            c = k.c;
        }
        if ((n & 0x8) != 0x0) {
            d = k.d;
        }
        if ((n & 0x10) != 0x0) {
            e = k.e;
        }
        if ((n & 0x20) != 0x0) {
            f = k.f;
        }
        if ((n & 0x40) != 0x0) {
            g = k.g;
        }
        k.getClass();
        e.f((Object)a, "parentLinkId");
        return new k(a, b, c, d, e, f, g);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k)) {
            return false;
        }
        final k k = (k)o;
        return sg2.e.a((Object)this.a, (Object)k.a) && this.b == k.b && this.c == k.c && sg2.e.a((Object)this.d, (Object)k.d) && sg2.e.a((Object)this.e, (Object)k.e) && sg2.e.a((Object)this.f, (Object)k.f) && sg2.e.a((Object)this.g, (Object)k.g);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        final int b2 = b.b(this.c, (hashCode * 31 + b) * 31, 31);
        final Boolean d = this.d;
        int hashCode2 = 0;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final Boolean e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final Boolean f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final Boolean g = this.g;
        if (g != null) {
            hashCode2 = g.hashCode();
        }
        return (((b2 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("LinkMutationDataModel(parentLinkId=");
        r.append(this.a);
        r.append(", isRead=");
        r.append(this.b);
        r.append(", readTimestampUtc=");
        r.append(this.c);
        r.append(", isHidden=");
        r.append(this.d);
        r.append(", isSubscribed=");
        r.append(this.e);
        r.append(", isSaved=");
        r.append(this.f);
        r.append(", isFollowed=");
        return android.support.v4.media.a.j(r, this.g, ')');
    }
}
