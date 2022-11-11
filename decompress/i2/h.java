// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import u2.k;
import sg2.e;
import ej2.c0;
import u2.j;
import t2.c;
import t2.f;
import t2.d;

public final class h
{
    public final d a;
    public final f b;
    public final long c;
    public final t2.h d;
    
    public h(final d a, final f b, final long c, final t2.h d, final c c2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (!j.a(c, j.c) && j.c(c) < 0.0f) {
            final StringBuilder r = a.r("lineHeight can't be negative (");
            r.append(j.c(c));
            r.append(')');
            throw new IllegalStateException(r.toString().toString());
        }
    }
    
    public final h a(final h h) {
        if (h == null) {
            return this;
        }
        long n;
        if (c0.A3(h.c)) {
            n = this.c;
        }
        else {
            n = h.c;
        }
        t2.h h2;
        if ((h2 = h.d) == null) {
            h2 = this.d;
        }
        d d;
        if ((d = h.a) == null) {
            d = this.a;
        }
        f f;
        if ((f = h.b) == null) {
            f = this.b;
        }
        h.getClass();
        return new h(d, f, n, h2, null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final d a = this.a;
        final h h = (h)o;
        if (!e.a((Object)a, (Object)h.a)) {
            return false;
        }
        if (!e.a((Object)this.b, (Object)h.b)) {
            return false;
        }
        if (!j.a(this.c, h.c)) {
            return false;
        }
        if (!e.a((Object)this.d, (Object)h.d)) {
            return false;
        }
        h.getClass();
        if (!e.a((Object)null, (Object)null)) {
            return false;
        }
        h.getClass();
        return e.a((Object)null, (Object)null);
    }
    
    @Override
    public final int hashCode() {
        final d a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = Integer.hashCode(a.a);
        }
        else {
            hashCode = 0;
        }
        final f b = this.b;
        int hashCode2;
        if (b != null) {
            hashCode2 = Integer.hashCode(b.a);
        }
        else {
            hashCode2 = 0;
        }
        final long c = this.c;
        final k[] b2 = j.b;
        final int b3 = b.b(c, (hashCode * 31 + hashCode2) * 31, 31);
        final t2.h d = this.d;
        int hashCode3;
        if (d != null) {
            hashCode3 = d.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return ((b3 + hashCode3) * 31 + 0) * 31 + 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ParagraphStyle(textAlign=");
        r.append(this.a);
        r.append(", textDirection=");
        r.append(this.b);
        r.append(", lineHeight=");
        r.append((Object)j.d(this.c));
        r.append(", textIndent=");
        r.append(this.d);
        r.append(", platformStyle=");
        r.append((Object)null);
        r.append(", lineHeightStyle=");
        r.append((Object)null);
        r.append(')');
        return r.toString();
    }
}
