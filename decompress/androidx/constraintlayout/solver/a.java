// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver;

import ak0.m;
import java.util.Arrays;

public final class a
{
    public int a;
    public final b b;
    public final g3.a c;
    public int d;
    public int[] e;
    public int[] f;
    public float[] g;
    public int h;
    public int i;
    public boolean j;
    
    public a(final b b, final g3.a c) {
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
    
    public final void a(final SolverVariable solverVariable, float n, final boolean b) {
        if (n == 0.0f) {
            return;
        }
        int h = this.h;
        if (h == -1) {
            this.h = 0;
            this.g[0] = n;
            this.e[0] = solverVariable.a;
            this.f[0] = -1;
            ++solverVariable.i;
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
            final int a = solverVariable.a;
            if (n4 == a) {
                final float[] g = this.g;
                n += g[h];
                g[h] = n;
                if (n == 0.0f) {
                    if (h == this.h) {
                        this.h = this.f[h];
                    }
                    else {
                        final int[] f = this.f;
                        f[n3] = f[h];
                    }
                    if (b) {
                        solverVariable.b(this.b);
                    }
                    if (this.j) {
                        this.i = h;
                    }
                    --solverVariable.i;
                    --this.a;
                }
                return;
            }
            if (n4 < a) {
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
        this.e[length] = solverVariable.a;
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
        ++solverVariable.i;
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
    
    public final void b() {
        for (int h = this.h, n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            final SolverVariable solverVariable = ((SolverVariable[])this.c.c)[this.e[h]];
            if (solverVariable != null) {
                solverVariable.b(this.b);
            }
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }
    
    public final float c(final SolverVariable solverVariable) {
        for (int h = this.h, n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            if (this.e[h] == solverVariable.a) {
                return this.g[h];
            }
        }
        return 0.0f;
    }
    
    public final SolverVariable d(final boolean[] array, final SolverVariable solverVariable) {
        int h = this.h;
        int n = 0;
        SolverVariable solverVariable2 = null;
        float n2 = 0.0f;
        while (h != -1 && n < this.a) {
            final float n3 = this.g[h];
            SolverVariable solverVariable3 = solverVariable2;
            float n4 = n2;
            Label_0161: {
                if (n3 < 0.0f) {
                    final SolverVariable solverVariable4 = ((SolverVariable[])this.c.c)[this.e[h]];
                    if (array != null) {
                        solverVariable3 = solverVariable2;
                        n4 = n2;
                        if (array[solverVariable4.a]) {
                            break Label_0161;
                        }
                    }
                    solverVariable3 = solverVariable2;
                    n4 = n2;
                    if (solverVariable4 != solverVariable) {
                        final SolverVariable.Type f = solverVariable4.f;
                        if (f != SolverVariable.Type.SLACK) {
                            solverVariable3 = solverVariable2;
                            n4 = n2;
                            if (f != SolverVariable.Type.ERROR) {
                                break Label_0161;
                            }
                        }
                        solverVariable3 = solverVariable2;
                        n4 = n2;
                        if (n3 < n2) {
                            n4 = n3;
                            solverVariable3 = solverVariable4;
                        }
                    }
                }
            }
            h = this.f[h];
            ++n;
            solverVariable2 = solverVariable3;
            n2 = n4;
        }
        return solverVariable2;
    }
    
    public final SolverVariable e(final int n) {
        for (int h = this.h, n2 = 0; h != -1 && n2 < this.a; h = this.f[h], ++n2) {
            if (n2 == n) {
                return ((SolverVariable[])this.c.c)[this.e[h]];
            }
        }
        return null;
    }
    
    public final void f(final SolverVariable solverVariable, final float n) {
        if (n == 0.0f) {
            this.g(solverVariable, true);
            return;
        }
        int h = this.h;
        if (h == -1) {
            this.h = 0;
            this.g[0] = n;
            this.e[0] = solverVariable.a;
            this.f[0] = -1;
            ++solverVariable.i;
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
            final int a = solverVariable.a;
            if (n4 == a) {
                this.g[h] = n;
                return;
            }
            if (n4 < a) {
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
        this.e[length] = solverVariable.a;
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
        ++solverVariable.i;
        solverVariable.a(this.b);
        final int a2 = this.a + 1;
        this.a = a2;
        if (!this.j) {
            ++this.i;
        }
        final int[] e6 = this.e;
        if (a2 >= e6.length) {
            this.j = true;
        }
        if (this.i >= e6.length) {
            this.j = true;
            this.i = e6.length - 1;
        }
    }
    
    public final float g(final SolverVariable solverVariable, final boolean b) {
        int h = this.h;
        if (h == -1) {
            return 0.0f;
        }
        int n = 0;
        int n2 = -1;
        while (h != -1 && n < this.a) {
            if (this.e[h] == solverVariable.a) {
                if (h == this.h) {
                    this.h = this.f[h];
                }
                else {
                    final int[] f = this.f;
                    f[n2] = f[h];
                }
                if (b) {
                    solverVariable.b(this.b);
                }
                --solverVariable.i;
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
    
    @Override
    public final String toString() {
        int h = this.h;
        String string = "";
        for (int n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            final StringBuilder k = a.k(m.l(string, " -> "));
            k.append(this.g[h]);
            k.append(" : ");
            final StringBuilder i = a.k(k.toString());
            i.append(((SolverVariable[])this.c.c)[this.e[h]]);
            string = i.toString();
        }
        return string;
    }
}
