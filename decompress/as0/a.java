// 
// Decompiled by Procyon v0.6.0
// 

package as0;

import sg2.e;
import com.reddit.domain.model.MerchandisingFormat;

public final class a
{
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final MerchandisingFormat h;
    
    public a(final String a, final String b, final String c, final boolean e, final boolean f, final boolean g, final MerchandisingFormat h) {
        sg2.e.f((Object)h, "size");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = 2131232584;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return sg2.e.a((Object)this.a, (Object)a.a) && sg2.e.a((Object)this.b, (Object)a.b) && sg2.e.a((Object)this.c, (Object)a.c) && this.d == a.d && this.e == a.e && this.f == a.f && this.g == a.g && this.h == a.h;
    }
    
    @Override
    public final int hashCode() {
        final int c = a.c(this.d, b.c(this.c, b.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
        final int e = this.e ? 1 : 0;
        int n = 1;
        int n2 = e;
        if (e != 0) {
            n2 = 1;
        }
        int f;
        if ((f = (this.f ? 1 : 0)) != 0) {
            f = 1;
        }
        final int g = this.g ? 1 : 0;
        if (g == 0) {
            n = g;
        }
        return this.h.hashCode() + (((c + n2) * 31 + f) * 31 + n) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("MerchandiseViewState(title=");
        r.append(this.a);
        r.append(", description=");
        r.append(this.b);
        r.append(", ctaText=");
        r.append(this.c);
        r.append(", imageResource=");
        r.append(this.d);
        r.append(", imageVisible=");
        r.append(this.e);
        r.append(", ctaButtonVisible=");
        r.append(this.f);
        r.append(", classicViewEnabled=");
        r.append(this.g);
        r.append(", size=");
        r.append(this.h);
        r.append(')');
        return r.toString();
    }
}
