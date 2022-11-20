// 
// Decompiled by Procyon v0.6.0
// 

package qb2;

import aq2.a;
import ng2.e;

public final class b
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    
    public b(final String a, final String b, final String c, final String d, final String e, final boolean f, final boolean g, final boolean h, final boolean i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static b a(final b b, String a, String b2, String c, String d, String e, boolean f, boolean g, boolean h, boolean i, final int n) {
        if ((n & 0x1) != 0x0) {
            a = b.a;
        }
        if ((n & 0x2) != 0x0) {
            b2 = b.b;
        }
        if ((n & 0x4) != 0x0) {
            c = b.c;
        }
        if ((n & 0x8) != 0x0) {
            d = b.d;
        }
        if ((n & 0x10) != 0x0) {
            e = b.e;
        }
        if ((n & 0x20) != 0x0) {
            f = b.f;
        }
        if ((n & 0x40) != 0x0) {
            g = b.g;
        }
        if ((n & 0x80) != 0x0) {
            h = b.h;
        }
        if ((n & 0x100) != 0x0) {
            i = b.i;
        }
        b.getClass();
        e.f((Object)a, "viewersShorten");
        e.f((Object)b2, "viewers");
        e.f((Object)c, "subreddit");
        e.f((Object)e, "title");
        return new b(a, b2, c, d, e, f, g, h, i);
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
        return ng2.e.a((Object)this.a, (Object)b.a) && ng2.e.a((Object)this.b, (Object)b.b) && ng2.e.a((Object)this.c, (Object)b.c) && ng2.e.a((Object)this.d, (Object)b.d) && ng2.e.a((Object)this.e, (Object)b.e) && this.f == b.f && this.g == b.g && this.h == b.h && this.i == b.i;
    }
    
    @Override
    public final int hashCode() {
        final int e = aq2.a.e(this.c, aq2.a.e(this.b, this.a.hashCode() * 31, 31), 31);
        final String d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        final int e2 = aq2.a.e(this.e, (e + hashCode) * 31, 31);
        final int f = this.f ? 1 : 0;
        int n = 1;
        int n2 = f;
        if (f != 0) {
            n2 = 1;
        }
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        final int i = this.i ? 1 : 0;
        if (i == 0) {
            n = i;
        }
        return (((e2 + n2) * 31 + g) * 31 + h) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("LivePillViewState(viewersShorten=");
        t.append(this.a);
        t.append(", viewers=");
        t.append(this.b);
        t.append(", subreddit=");
        t.append(this.c);
        t.append(", subredditIcon=");
        t.append(this.d);
        t.append(", title=");
        t.append(this.e);
        t.append(", shouldShowTooltip=");
        t.append(this.f);
        t.append(", isOpened=");
        t.append(this.g);
        t.append(", isCommunityMember=");
        t.append(this.h);
        t.append(", isPostSaved=");
        return d.n(t, this.i, ')');
    }
}
