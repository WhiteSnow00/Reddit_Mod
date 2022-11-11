// 
// Decompiled by Procyon v0.6.0
// 

package w0;

import n1.f;
import o2.t;
import lw0.b;
import i2.o;
import java.util.List;
import o2.d;
import rg2.l;
import i2.n;
import sg2.e;
import o2.m;
import v0.q;
import androidx.compose.ui.text.input.TextFieldValue;

public final class h extends a<h>
{
    public final TextFieldValue h;
    public final q i;
    
    public h(final TextFieldValue h, final m m, final q i, final k k) {
        e.f((Object)h, "currentValue");
        e.f((Object)m, "offsetMapping");
        e.f((Object)k, "state");
        final i2.a a = h.a;
        final long b = h.b;
        n a2;
        if (i != null) {
            a2 = i.a;
        }
        else {
            a2 = null;
        }
        super(a, b, a2, m, k);
        this.h = h;
        this.i = i;
    }
    
    public final List<d> x(final l<? super h, ? extends d> l) {
        e.f((Object)l, "or");
        List list;
        if (o.b(super.f)) {
            final d d = (d)l.invoke(this);
            if (d != null) {
                list = b.r1((Object)d);
            }
            else {
                list = null;
            }
        }
        else {
            list = b.s1((Object[])new d[] { new o2.a("", 0), new t(o.f(super.f), o.f(super.f)) });
        }
        return list;
    }
    
    public final int y(final q q, final int n) {
        final c2.l b = q.b;
        n1.d e = null;
        Label_0048: {
            if (b != null) {
                final c2.l c = q.c;
                n1.d a = null;
                if (c != null) {
                    a = c.A(b, true);
                }
                if ((e = a) != null) {
                    break Label_0048;
                }
            }
            e = n1.d.e;
        }
        final n1.d c2 = q.a.c(super.d.b(o.c(this.h.b)));
        return super.d.a(q.a.l(wd.a.f(c2.a, f.d(bg.d.q(e.c - e.a, e.d - e.b)) * n + c2.b)));
    }
}
