// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import u2.i;
import n1.d;
import wd.a;
import lw0.b;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;

public final class n
{
    public final m a;
    public final c b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;
    
    public n(final m a, final c b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
        final boolean empty = b.h.isEmpty();
        final float n = 0.0f;
        float d;
        if (empty) {
            d = 0.0f;
        }
        else {
            d = b.h.get(0).a.d();
        }
        this.d = d;
        float e;
        if (b.h.isEmpty()) {
            e = n;
        }
        else {
            final e e2 = (e)CollectionsKt___CollectionsKt.K3((List)b.h);
            e = e2.a.p() + e2.f;
        }
        this.e = e;
        this.f = b.g;
    }
    
    public final ResolvedTextDirection a(final int n) {
        final c b = this.b;
        b.b(n);
        int n2;
        if (n == b.a.a.length()) {
            n2 = lw0.b.L0((List)b.h);
        }
        else {
            n2 = wd.a.G(n, b.h);
        }
        final e e = b.h.get(n2);
        return e.a.r(e.b(n));
    }
    
    public final d b(final int n) {
        final c b = this.b;
        if (n >= 0 && n < b.a.a.f.length()) {
            final e e = b.h.get(wd.a.G(n, b.h));
            return e.a(e.a.s(e.b(n)));
        }
        b.getClass();
        final StringBuilder sb = new StringBuilder();
        sb.append("offset(");
        sb.append(n);
        sb.append(") is out of bounds [0, ");
        sb.append(b.a.a.length());
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final d c(final int n) {
        final c b = this.b;
        b.b(n);
        int n2;
        if (n == b.a.a.length()) {
            n2 = lw0.b.L0((List)b.h);
        }
        else {
            n2 = wd.a.G(n, b.h);
        }
        final e e = b.h.get(n2);
        return e.a(e.a.l(e.b(n)));
    }
    
    public final float d(final int n) {
        final c b = this.b;
        b.c(n);
        final e e = b.h.get(wd.a.H(n, b.h));
        return e.a.k(n - e.d) + e.f;
    }
    
    public final int e(final int n, final boolean b) {
        final c b2 = this.b;
        b2.c(n);
        final e e = b2.h.get(wd.a.H(n, b2.h));
        return e.a.g(n - e.d, b) + e.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n)) {
            return false;
        }
        final m a = this.a;
        final n n = (n)o;
        return sg2.e.a((Object)a, (Object)n.a) && sg2.e.a((Object)this.b, (Object)n.b) && i.a(this.c, n.c) && this.d == n.d && this.e == n.e && sg2.e.a((Object)this.f, (Object)n.f);
    }
    
    public final int f(final int n) {
        final c b = this.b;
        b.b(n);
        int n2;
        if (n == b.a.a.length()) {
            n2 = lw0.b.L0((List)b.h);
        }
        else {
            n2 = wd.a.G(n, b.h);
        }
        final e e = b.h.get(n2);
        return e.a.q(e.b(n)) + e.d;
    }
    
    public final int g(final float n) {
        final c b = this.b;
        int n2;
        if (n <= 0.0f) {
            n2 = 0;
        }
        else if (n >= b.e) {
            n2 = lw0.b.L0((List)b.h);
        }
        else {
            n2 = wd.a.I(b.h, n);
        }
        final e e = b.h.get(n2);
        final int c = e.c;
        final int b2 = e.b;
        int max;
        if (c - b2 == 0) {
            max = Math.max(0, b2 - 1);
        }
        else {
            max = e.a.h(n - e.f) + e.d;
        }
        return max;
    }
    
    public final float h(final int n) {
        final c b = this.b;
        b.c(n);
        final e e = b.h.get(wd.a.H(n, b.h));
        return e.a.i(n - e.d);
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode() + d.d(this.e, d.d(this.d, b.b(this.c, (this.b.hashCode() + this.a.hashCode() * 31) * 31, 31), 31), 31);
    }
    
    public final float i(final int n) {
        final c b = this.b;
        b.c(n);
        final e e = b.h.get(wd.a.H(n, b.h));
        return e.a.m(n - e.d);
    }
    
    public final int j(final int n) {
        final c b = this.b;
        b.c(n);
        final e e = b.h.get(wd.a.H(n, b.h));
        return e.a.f(n - e.d) + e.b;
    }
    
    public final float k(final int n) {
        final c b = this.b;
        b.c(n);
        final e e = b.h.get(wd.a.H(n, b.h));
        return e.a.b(n - e.d) + e.f;
    }
    
    public final int l(final long n) {
        final c b = this.b;
        b.getClass();
        int n2;
        if (n1.c.d(n) <= 0.0f) {
            n2 = 0;
        }
        else if (n1.c.d(n) >= b.e) {
            n2 = lw0.b.L0((List)b.h);
        }
        else {
            n2 = wd.a.I(b.h, n1.c.d(n));
        }
        final e e = b.h.get(n2);
        final int c = e.c;
        final int b2 = e.b;
        int max;
        if (c - b2 == 0) {
            max = Math.max(0, b2 - 1);
        }
        else {
            max = e.a.e(wd.a.f(n1.c.c(n), n1.c.d(n) - e.f)) + e.b;
        }
        return max;
    }
    
    public final ResolvedTextDirection m(final int n) {
        final c b = this.b;
        b.b(n);
        int n2;
        if (n == b.a.a.length()) {
            n2 = lw0.b.L0((List)b.h);
        }
        else {
            n2 = wd.a.G(n, b.h);
        }
        final e e = b.h.get(n2);
        return e.a.a(e.b(n));
    }
    
    public final long n(int c) {
        final c b = this.b;
        b.b(c);
        int n;
        if (c == b.a.a.length()) {
            n = lw0.b.L0((List)b.h);
        }
        else {
            n = wd.a.G(c, b.h);
        }
        final e e = b.h.get(n);
        final long c2 = e.a.c(e.b(c));
        c = o.c;
        return wd.a.i((int)(c2 >> 32) + e.b, o.c(c2) + e.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("TextLayoutResult(layoutInput=");
        r.append(this.a);
        r.append(", multiParagraph=");
        r.append(this.b);
        r.append(", size=");
        r.append((Object)i.c(this.c));
        r.append(", firstBaseline=");
        r.append(this.d);
        r.append(", lastBaseline=");
        r.append(this.e);
        r.append(", placeholderRects=");
        r.append(this.f);
        r.append(')');
        return r.toString();
    }
}
