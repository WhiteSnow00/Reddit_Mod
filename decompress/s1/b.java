// 
// Decompiled by Procyon v0.6.0
// 

package s1;

import o1.b0;
import java.util.Collection;
import cg2.j;
import mg2.a;
import o1.h;
import java.util.List;
import java.util.ArrayList;

public final class b extends f
{
    public float[] b;
    public final ArrayList c;
    public List<? extends d> d;
    public boolean e;
    public h f;
    public e g;
    public a<j> h;
    public String i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public boolean q;
    
    public b() {
        this.c = new ArrayList();
        this.d = (List<? extends d>)s1.j.a;
        this.e = true;
        this.i = "";
        this.m = 1.0f;
        this.n = 1.0f;
        this.q = true;
    }
    
    @Override
    public final void a(final q1.e e) {
        ng2.e.f((Object)e, "<this>");
        final boolean q = this.q;
        int i = 0;
        if (q) {
            float[] b = this.b;
            if (b == null) {
                b = if0.a.m();
                this.b = b;
            }
            else {
                if0.a.V(b);
            }
            if0.a.g0(b, this.k + this.o, this.l + this.p);
            final double n = this.j * 3.141592653589793 / 180.0;
            final float n2 = (float)Math.cos(n);
            final float n3 = (float)Math.sin(n);
            final float n4 = b[0];
            final float n5 = b[4];
            final float n6 = n3 * n5 + n2 * n4;
            final float n7 = -n3;
            final float n8 = n5 * n2 + n4 * n7;
            final float n9 = b[1];
            final float n10 = b[5];
            final float n11 = n3 * n10 + n2 * n9;
            final float n12 = n10 * n2 + n9 * n7;
            final float n13 = b[2];
            final float n14 = b[6];
            final float n15 = n3 * n14 + n2 * n13;
            final float n16 = n14 * n2 + n13 * n7;
            final float n17 = b[3];
            final float n18 = b[7];
            final float n19 = n3 * n18 + n2 * n17;
            final float n20 = n2 * n18 + n7 * n17;
            b[0] = n6;
            b[1] = n11;
            b[2] = n15;
            b[3] = n19;
            b[4] = n8;
            b[5] = n12;
            b[6] = n16;
            b[7] = n20;
            final float m = this.m;
            final float n21 = this.n;
            b[0] = n6 * m;
            b[1] = n11 * m;
            b[2] = n15 * m;
            b[3] = n19 * m;
            b[4] = n8 * n21;
            b[5] = n12 * n21;
            b[6] = n16 * n21;
            b[7] = n20 * n21;
            b[8] *= 1.0f;
            b[9] *= 1.0f;
            b[10] *= 1.0f;
            b[11] *= 1.0f;
            if0.a.g0(b, -this.k, -this.l);
            this.q = false;
        }
        if (this.e) {
            if (this.d.isEmpty() ^ true) {
                e g = this.g;
                if (g == null) {
                    g = new e();
                    this.g = g;
                }
                else {
                    g.a.clear();
                }
                h f = this.f;
                if (f == null) {
                    f = xd.a.j();
                    this.f = f;
                }
                else {
                    f.reset();
                }
                final List<? extends d> d = this.d;
                ng2.e.f((Object)d, "nodes");
                g.a.addAll(d);
                g.c((b0)f);
            }
            this.e = false;
        }
        final q1.d c0 = (q1.d)e.c0();
        final long e2 = c0.e();
        c0.a().save();
        final q1.b a = c0.a;
        final float[] b2 = this.b;
        if (b2 != null) {
            a.f(b2);
        }
        final h f2 = this.f;
        if ((this.d.isEmpty() ^ true) && f2 != null) {
            a.a(f2, 1);
        }
        for (ArrayList c2 = this.c; i < c2.size(); ++i) {
            ((f)c2.get(i)).a(e);
        }
        c0.a().restore();
        c0.b(e2);
    }
    
    @Override
    public final a<j> b() {
        return this.h;
    }
    
    @Override
    public final void d(final a<j> h) {
        this.h = h;
        final ArrayList c = this.c;
        for (int size = c.size(), i = 0; i < size; ++i) {
            ((f)c.get(i)).d(h);
        }
    }
    
    public final void e(final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            if (n < this.c.size()) {
                this.c.get(n).d(null);
                this.c.remove(n);
            }
        }
        this.c();
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("VGroup: ");
        t.append(this.i);
        final ArrayList c = this.c;
        for (int size = c.size(), i = 0; i < size; ++i) {
            final f f = (f)c.get(i);
            t.append("\t");
            t.append(f.toString());
            t.append("\n");
        }
        final String string = t.toString();
        ng2.e.e((Object)string, "sb.toString()");
        return string;
    }
}
