// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core;

import java.util.Arrays;

public final class a implements b$a
{
    public int a;
    public final b b;
    public final z2.a c;
    public int d;
    public int[] e;
    public int[] f;
    public float[] g;
    public int h;
    public int i;
    public boolean j;
    
    public a(final b b, final z2.a c) {
        this.a = 0;
        this.d = 8;
        this.e = new int[8];
        this.f = new int[8];
        this.g = new float[8];
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final SolverVariable solverVariable) {
        int h = this.h;
        if (h == -1) {
            return false;
        }
        for (int n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            if (this.e[h] == solverVariable.g) {
                return true;
            }
        }
        return false;
    }
    
    public final SolverVariable b(final int n) {
        for (int h = this.h, n2 = 0; h != -1 && n2 < this.a; h = this.f[h], ++n2) {
            if (n2 == n) {
                return ((SolverVariable[])this.c.d)[this.e[h]];
            }
        }
        return null;
    }
    
    public final void c(final SolverVariable solverVariable, final float n) {
        if (n == 0.0f) {
            this.h(solverVariable, true);
            return;
        }
        int h = this.h;
        if (h == -1) {
            this.h = 0;
            this.g[0] = n;
            this.e[0] = solverVariable.g;
            this.f[0] = -1;
            ++solverVariable.q;
            solverVariable.a(this.b);
            ++this.a;
            if (!this.j) {
                final int i = this.i + 1;
                this.i = i;
                final int[] e = this.e;
                if (i >= e.length) {
                    this.j = true;
                    this.i = e.length - 1;
                }
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (h != -1 && n2 < this.a) {
            final int n4 = this.e[h];
            final int g = solverVariable.g;
            if (n4 == g) {
                this.g[h] = n;
                return;
            }
            if (n4 < g) {
                n3 = h;
            }
            h = this.f[h];
            ++n2;
        }
        int n5 = this.i;
        if (this.j) {
            final int[] e2 = this.e;
            if (e2[n5] != -1) {
                n5 = e2.length;
            }
        }
        else {
            ++n5;
        }
        final int[] e3 = this.e;
        int n6 = n5;
        if (n5 >= e3.length) {
            n6 = n5;
            if (this.a < e3.length) {
                int n7 = 0;
                while (true) {
                    final int[] e4 = this.e;
                    n6 = n5;
                    if (n7 >= e4.length) {
                        break;
                    }
                    if (e4[n7] == -1) {
                        n6 = n7;
                        break;
                    }
                    ++n7;
                }
            }
        }
        final int[] e5 = this.e;
        int length;
        if ((length = n6) >= e5.length) {
            length = e5.length;
            final int d = this.d * 2;
            this.d = d;
            this.j = false;
            this.i = length - 1;
            this.g = Arrays.copyOf(this.g, d);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[length] = solverVariable.g;
        this.g[length] = n;
        if (n3 != -1) {
            final int[] f = this.f;
            f[length] = f[n3];
            f[n3] = length;
        }
        else {
            this.f[length] = this.h;
            this.h = length;
        }
        ++solverVariable.q;
        solverVariable.a(this.b);
        final int a = this.a + 1;
        this.a = a;
        if (!this.j) {
            ++this.i;
        }
        final int[] e6 = this.e;
        if (a >= e6.length) {
            this.j = true;
        }
        if (this.i >= e6.length) {
            this.j = true;
            this.i = e6.length - 1;
        }
    }
    
    public final void clear() {
        for (int h = this.h, n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            final SolverVariable solverVariable = ((SolverVariable[])this.c.d)[this.e[h]];
            if (solverVariable != null) {
                solverVariable.c(this.b);
            }
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }
    
    public final float d(final SolverVariable solverVariable) {
        for (int h = this.h, n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            if (this.e[h] == solverVariable.g) {
                return this.g[h];
            }
        }
        return 0.0f;
    }
    
    public final void e(final float n) {
        for (int h = this.h, n2 = 0; h != -1 && n2 < this.a; h = this.f[h], ++n2) {
            final float[] g = this.g;
            g[h] /= n;
        }
    }
    
    public final void f(final SolverVariable solverVariable, float n, final boolean b) {
        if (n > -0.001f && n < 0.001f) {
            return;
        }
        int h = this.h;
        if (h == -1) {
            this.h = 0;
            this.g[0] = n;
            this.e[0] = solverVariable.g;
            this.f[0] = -1;
            ++solverVariable.q;
            solverVariable.a(this.b);
            ++this.a;
            if (!this.j) {
                final int i = this.i + 1;
                this.i = i;
                final int[] e = this.e;
                if (i >= e.length) {
                    this.j = true;
                    this.i = e.length - 1;
                }
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (h != -1 && n2 < this.a) {
            final int n4 = this.e[h];
            final int g = solverVariable.g;
            if (n4 == g) {
                final float[] g2 = this.g;
                final float n5 = n += g2[h];
                if (n5 > -0.001f) {
                    n = n5;
                    if (n5 < 0.001f) {
                        n = 0.0f;
                    }
                }
                g2[h] = n;
                if (n == 0.0f) {
                    if (h == this.h) {
                        this.h = this.f[h];
                    }
                    else {
                        final int[] f = this.f;
                        f[n3] = f[h];
                    }
                    if (b) {
                        solverVariable.c(this.b);
                    }
                    if (this.j) {
                        this.i = h;
                    }
                    --solverVariable.q;
                    --this.a;
                }
                return;
            }
            if (n4 < g) {
                n3 = h;
            }
            h = this.f[h];
            ++n2;
        }
        int n6 = this.i;
        if (this.j) {
            final int[] e2 = this.e;
            if (e2[n6] != -1) {
                n6 = e2.length;
            }
        }
        else {
            ++n6;
        }
        final int[] e3 = this.e;
        int n7 = n6;
        if (n6 >= e3.length) {
            n7 = n6;
            if (this.a < e3.length) {
                int n8 = 0;
                while (true) {
                    final int[] e4 = this.e;
                    n7 = n6;
                    if (n8 >= e4.length) {
                        break;
                    }
                    if (e4[n8] == -1) {
                        n7 = n8;
                        break;
                    }
                    ++n8;
                }
            }
        }
        final int[] e5 = this.e;
        int length;
        if ((length = n7) >= e5.length) {
            length = e5.length;
            final int d = this.d * 2;
            this.d = d;
            this.j = false;
            this.i = length - 1;
            this.g = Arrays.copyOf(this.g, d);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[length] = solverVariable.g;
        this.g[length] = n;
        if (n3 != -1) {
            final int[] f2 = this.f;
            f2[length] = f2[n3];
            f2[n3] = length;
        }
        else {
            this.f[length] = this.h;
            this.h = length;
        }
        ++solverVariable.q;
        solverVariable.a(this.b);
        ++this.a;
        if (!this.j) {
            ++this.i;
        }
        final int j = this.i;
        final int[] e6 = this.e;
        if (j >= e6.length) {
            this.j = true;
            this.i = e6.length - 1;
        }
    }
    
    public final void g() {
        for (int h = this.h, n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            final float[] g = this.g;
            g[h] *= -1.0f;
        }
    }
    
    public final float h(final SolverVariable solverVariable, final boolean b) {
        int h = this.h;
        if (h == -1) {
            return 0.0f;
        }
        int n = 0;
        int n2 = -1;
        while (h != -1 && n < this.a) {
            if (this.e[h] == solverVariable.g) {
                if (h == this.h) {
                    this.h = this.f[h];
                }
                else {
                    final int[] f = this.f;
                    f[n2] = f[h];
                }
                if (b) {
                    solverVariable.c(this.b);
                }
                --solverVariable.q;
                --this.a;
                this.e[h] = -1;
                if (this.j) {
                    this.i = h;
                }
                return this.g[h];
            }
            final int n3 = this.f[h];
            ++n;
            n2 = h;
            h = n3;
        }
        return 0.0f;
    }
    
    public final int i() {
        return this.a;
    }
    
    public final float j(final b b, final boolean b2) {
        final float d = this.d(b.a);
        this.h(b.a, b2);
        final b.b$a d2 = b.d;
        for (int i = d2.i(), j = 0; j < i; ++j) {
            final SolverVariable b3 = d2.b(j);
            this.f(b3, d2.d(b3) * d, b2);
        }
        return d;
    }
    
    public final float k(final int n) {
        for (int h = this.h, n2 = 0; h != -1 && n2 < this.a; h = this.f[h], ++n2) {
            if (n2 == n) {
                return this.g[h];
            }
        }
        return 0.0f;
    }
    
    @Override
    public final String toString() {
        int h = this.h;
        String string = "";
        for (int n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            final StringBuilder t = a.t(b.l(string, " -> "));
            t.append(this.g[h]);
            t.append(" : ");
            final StringBuilder t2 = a.t(t.toString());
            t2.append(((SolverVariable[])this.c.d)[this.e[h]]);
            string = t2.toString();
        }
        return string;
    }
}
