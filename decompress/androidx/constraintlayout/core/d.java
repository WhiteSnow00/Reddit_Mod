// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core;

import java.util.Comparator;
import java.util.Arrays;
import z2.a;

public final class d extends b
{
    public SolverVariable[] f;
    public SolverVariable[] g;
    public int h;
    public d.d$b i;
    
    public d(final a a) {
        super(a);
        this.f = new SolverVariable[128];
        this.g = new SolverVariable[128];
        this.h = 0;
        this.i = new d.d$b(this);
    }
    
    @Override
    public final SolverVariable a(final boolean[] array) {
        int n = -1;
        SolverVariable[] f;
        SolverVariable a;
        d.d$b j;
        int k;
        int n2;
        int n3;
        float n4;
        int n5;
        SolverVariable solverVariable;
        float n6;
        float n7;
        int n8;
        Label_0196:Label_0187_Outer:
        for (int i = 0; i < this.h; ++i) {
            f = this.f;
            a = f[i];
            if (!array[a.g]) {
                j = this.i;
                j.a = a;
                k = 8;
                n2 = 1;
                n3 = 1;
                Label_0192: {
                    if (n == -1) {
                        while (true) {
                            while (k >= 0) {
                                n4 = j.a.m[k];
                                if (n4 > 0.0f) {
                                    break;
                                }
                                if (n4 < 0.0f) {
                                    n5 = n3;
                                    if (n5 != 0) {
                                        break Label_0192;
                                    }
                                    continue Label_0196;
                                }
                                else {
                                    --k;
                                }
                            }
                            n5 = 0;
                            continue Label_0187_Outer;
                        }
                    }
                    solverVariable = f[n];
                    while (true) {
                        while (k >= 0) {
                            n6 = solverVariable.m[k];
                            n7 = j.a.m[k];
                            if (n7 == n6) {
                                --k;
                            }
                            else {
                                if (n7 >= n6) {
                                    break;
                                }
                                n8 = n2;
                                if (n8 != 0) {
                                    break Label_0192;
                                }
                                continue Label_0196;
                            }
                        }
                        n8 = 0;
                        continue;
                    }
                }
                n = i;
            }
        }
        if (n == -1) {
            return null;
        }
        return this.f[n];
    }
    
    @Override
    public final boolean d() {
        return this.h == 0;
    }
    
    @Override
    public final void h(final c c, final b b, final boolean b2) {
        final SolverVariable a = b.a;
        if (a == null) {
            return;
        }
        final b.b$a d = b.d;
        for (int i = d.i(), j = 0; j < i; ++j) {
            final SolverVariable b3 = d.b(j);
            final float k = d.k(j);
            final d.d$b l = this.i;
            l.a = b3;
            final boolean f = b3.f;
            final int n = 1;
            boolean b4 = true;
            int n4;
            if (f) {
                for (int n2 = 0; n2 < 9; ++n2) {
                    final float[] m = l.a.m;
                    final float n3 = a.m[n2] * k + m[n2];
                    m[n2] = n3;
                    if (Math.abs(n3) < 1.0E-4f) {
                        l.a.m[n2] = 0.0f;
                    }
                    else {
                        b4 = false;
                    }
                }
                if (b4) {
                    l.b.j(l.a);
                }
                n4 = 0;
            }
            else {
                int n5 = 0;
                while (true) {
                    n4 = n;
                    if (n5 >= 9) {
                        break;
                    }
                    final float n6 = a.m[n5];
                    if (n6 != 0.0f) {
                        float n7;
                        if (Math.abs(n7 = n6 * k) < 1.0E-4f) {
                            n7 = 0.0f;
                        }
                        l.a.m[n5] = n7;
                    }
                    else {
                        l.a.m[n5] = 0.0f;
                    }
                    ++n5;
                }
            }
            if (n4 != 0) {
                this.i(b3);
            }
            super.b += b.b * k;
        }
        this.j(a);
    }
    
    public final void i(final SolverVariable solverVariable) {
        final int h = this.h;
        final SolverVariable[] f = this.f;
        if (h + 1 > f.length) {
            final SolverVariable[] f2 = Arrays.copyOf(f, f.length * 2);
            this.f = f2;
            this.g = Arrays.copyOf(f2, f2.length * 2);
        }
        final SolverVariable[] f3 = this.f;
        int h2 = this.h;
        f3[h2] = solverVariable;
        ++h2;
        this.h = h2;
        if (h2 > 1 && f3[h2 - 1].g > solverVariable.g) {
            final int n = 0;
            int n2 = 0;
            int h3;
            while (true) {
                h3 = this.h;
                if (n2 >= h3) {
                    break;
                }
                this.g[n2] = this.f[n2];
                ++n2;
            }
            Arrays.sort(this.g, 0, h3, (Comparator<? super SolverVariable>)new d$a());
            for (int i = n; i < this.h; ++i) {
                this.f[i] = this.g[i];
            }
        }
        solverVariable.f = true;
        solverVariable.a((b)this);
    }
    
    public final void j(final SolverVariable solverVariable) {
        for (int i = 0; i < this.h; ++i) {
            if (this.f[i] == solverVariable) {
                int h;
                while (true) {
                    h = this.h;
                    if (i >= h - 1) {
                        break;
                    }
                    final SolverVariable[] f = this.f;
                    final int n = i + 1;
                    f[i] = f[n];
                    i = n;
                }
                this.h = h - 1;
                solverVariable.f = false;
                return;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder q = android.support.v4.media.a.q("", " goal -> (");
        q.append(super.b);
        q.append(") : ");
        String s = q.toString();
        for (int i = 0; i < this.h; ++i) {
            this.i.a = this.f[i];
            final StringBuilder t = a.t(s);
            t.append(this.i);
            t.append(" ");
            s = t.toString();
        }
        return s;
    }
}
