// 
// Decompiled by Procyon v0.6.0
// 

package n1;

import ah2.f;

public final class e
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    
    static {
        final long b = a.b;
        at1.a.g(a.b(b), a.c(b));
    }
    
    public e(final float a, final float b, final float c, final float d, final long e, final long f, final long g, final long h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return ah2.f.a((Object)this.a, (Object)e.a) && ah2.f.a((Object)this.b, (Object)e.b) && ah2.f.a((Object)this.c, (Object)e.c) && ah2.f.a((Object)this.d, (Object)e.d) && n1.a.a(this.e, e.e) && n1.a.a(this.f, e.f) && n1.a.a(this.g, e.g) && n1.a.a(this.h, e.h);
    }
    
    @Override
    public final int hashCode() {
        final int a = a.a(this.d, a.a(this.c, a.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        final long e = this.e;
        final int c = n1.a.c;
        return Long.hashCode(this.h) + b.c(this.g, b.c(this.f, b.c(e, a, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final long e = this.e;
        final long f = this.f;
        final long g = this.g;
        final long h = this.h;
        final StringBuilder sb = new StringBuilder();
        sb.append(a80.a.M0(this.a));
        sb.append(", ");
        sb.append(a80.a.M0(this.b));
        sb.append(", ");
        sb.append(a80.a.M0(this.c));
        sb.append(", ");
        sb.append(a80.a.M0(this.d));
        final String string = sb.toString();
        if (!n1.a.a(e, f) || !n1.a.a(f, g) || !n1.a.a(g, h)) {
            final StringBuilder l = b.l("RoundRect(rect=", string, ", topLeft=");
            l.append((Object)n1.a.d(e));
            l.append(", topRight=");
            l.append((Object)n1.a.d(f));
            l.append(", bottomRight=");
            l.append((Object)n1.a.d(g));
            l.append(", bottomLeft=");
            l.append((Object)n1.a.d(h));
            l.append(')');
            return l.toString();
        }
        if (n1.a.b(e) == n1.a.c(e)) {
            final StringBuilder i = b.l("RoundRect(rect=", string, ", radius=");
            i.append(a80.a.M0(n1.a.b(e)));
            i.append(')');
            return i.toString();
        }
        final StringBuilder j = b.l("RoundRect(rect=", string, ", x=");
        j.append(a80.a.M0(n1.a.b(e)));
        j.append(", y=");
        j.append(a80.a.M0(n1.a.c(e)));
        j.append(')');
        return j.toString();
    }
}
