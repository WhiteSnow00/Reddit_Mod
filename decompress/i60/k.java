// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ah2.f;

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
        ah2.f.f((Object)a, "parentLinkId");
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
        f.f((Object)a, "parentLinkId");
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
        return ah2.f.a((Object)this.a, (Object)k.a) && this.b == k.b && this.c == k.c && ah2.f.a((Object)this.d, (Object)k.d) && ah2.f.a((Object)this.e, (Object)k.e) && ah2.f.a((Object)this.f, (Object)k.f) && ah2.f.a((Object)this.g, (Object)k.g);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        final int c = b.c(this.c, (hashCode * 31 + b) * 31, 31);
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
        return (((c + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("LinkMutationDataModel(parentLinkId=");
        k.append(this.a);
        k.append(", isRead=");
        k.append(this.b);
        k.append(", readTimestampUtc=");
        k.append(this.c);
        k.append(", isHidden=");
        k.append(this.d);
        k.append(", isSubscribed=");
        k.append(this.e);
        k.append(", isSaved=");
        k.append(this.f);
        k.append(", isFollowed=");
        return d.m(k, this.g, ')');
    }
}
