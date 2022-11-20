// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver;

public class b
{
    public SolverVariable a;
    public float b;
    public final a c;
    public boolean d;
    
    public b(final g3.a a) {
        this.a = null;
        this.b = 0.0f;
        this.d = false;
        this.c = new a(this, a);
    }
    
    public final void a(final c c, final int n) {
        this.c.f(c.i(n), 1.0f);
        this.c.f(c.i(n), -1.0f);
    }
    
    public final void b(final SolverVariable solverVariable, final SolverVariable solverVariable2, final SolverVariable solverVariable3, final int n) {
        int n2 = 0;
        final int n3 = 0;
        if (n != 0) {
            n2 = n3;
            int n4;
            if ((n4 = n) < 0) {
                n4 = n * -1;
                n2 = 1;
            }
            this.b = (float)n4;
        }
        if (n2 == 0) {
            this.c.f(solverVariable, -1.0f);
            this.c.f(solverVariable2, 1.0f);
            this.c.f(solverVariable3, 1.0f);
        }
        else {
            this.c.f(solverVariable, 1.0f);
            this.c.f(solverVariable2, -1.0f);
            this.c.f(solverVariable3, -1.0f);
        }
    }
    
    public final void c(final SolverVariable solverVariable, final SolverVariable solverVariable2, final SolverVariable solverVariable3, final int n) {
        int n2 = 0;
        final int n3 = 0;
        if (n != 0) {
            n2 = n3;
            int n4;
            if ((n4 = n) < 0) {
                n4 = n * -1;
                n2 = 1;
            }
            this.b = (float)n4;
        }
        if (n2 == 0) {
            this.c.f(solverVariable, -1.0f);
            this.c.f(solverVariable2, 1.0f);
            this.c.f(solverVariable3, -1.0f);
        }
        else {
            this.c.f(solverVariable, 1.0f);
            this.c.f(solverVariable2, -1.0f);
            this.c.f(solverVariable3, 1.0f);
        }
    }
    
    public final void d(final SolverVariable a) {
        final SolverVariable a2 = this.a;
        if (a2 != null) {
            this.c.f(a2, -1.0f);
            this.a = null;
        }
        final float n = this.c.g(a, true) * -1.0f;
        this.a = a;
        if (n == 1.0f) {
            return;
        }
        this.b /= n;
        final a c = this.c;
        for (int h = c.h, n2 = 0; h != -1 && n2 < c.a; h = c.f[h], ++n2) {
            final float[] g = c.g;
            g[h] /= n;
        }
    }
    
    @Override
    public final String toString() {
        String string;
        if (this.a == null) {
            string = "0";
        }
        else {
            final StringBuilder t = a.t("");
            t.append(this.a);
            string = t.toString();
        }
        String s = b.l(string, " = ");
        int n;
        if (this.b != 0.0f) {
            final StringBuilder t2 = a.t(s);
            t2.append(this.b);
            s = t2.toString();
            n = 1;
        }
        else {
            n = 0;
        }
    Label_0331:
        for (int a = this.c.a, i = 0; i < a; ++i) {
            if (this.c.e(i) != null) {
                final a c = this.c;
                int h = c.h;
                int n2 = 0;
                while (true) {
                    while (h != -1 && n2 < c.a) {
                        if (n2 == i) {
                            final float n3 = c.g[h];
                            final float n4 = fcmpl(n3, 0.0f);
                            if (n4 == 0) {
                                continue Label_0331;
                            }
                            String s2 = null;
                            float n5 = 0.0f;
                            Label_0264: {
                                if (n == 0) {
                                    s2 = s;
                                    n5 = n3;
                                    if (n3 >= 0.0f) {
                                        break Label_0264;
                                    }
                                    s2 = b.l(s, "- ");
                                }
                                else {
                                    if (n4 > 0) {
                                        s2 = b.l(s, " + ");
                                        n5 = n3;
                                        break Label_0264;
                                    }
                                    s2 = b.l(s, " - ");
                                }
                                n5 = n3 * -1.0f;
                            }
                            if (n5 == 1.0f) {
                                s = b.l(s2, "null");
                            }
                            else {
                                final StringBuilder sb = new StringBuilder();
                                sb.append(s2);
                                sb.append(n5);
                                sb.append(" ");
                                sb.append("null");
                                s = sb.toString();
                            }
                            n = 1;
                            continue Label_0331;
                        }
                        else {
                            h = c.f[h];
                            ++n2;
                        }
                    }
                    final float n3 = 0.0f;
                    continue;
                }
            }
        }
        String l = s;
        if (n == 0) {
            l = b.l(s, "0.0");
        }
        return l;
    }
}
