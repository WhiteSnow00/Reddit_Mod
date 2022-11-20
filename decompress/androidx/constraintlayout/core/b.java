// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core;

import z2.a;
import java.util.ArrayList;

public class b implements c$a
{
    public SolverVariable a;
    public float b;
    public ArrayList<SolverVariable> c;
    public b.b$a d;
    public boolean e;
    
    public b() {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList<SolverVariable>();
        this.e = false;
    }
    
    public b(final a a) {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList<SolverVariable>();
        this.e = false;
        this.d = (b.b$a)new androidx.constraintlayout.core.a(this, a);
    }
    
    public SolverVariable a(final boolean[] array) {
        return this.e(array, null);
    }
    
    public final void b(final c c, final int n) {
        this.d.c(c.j(n), 1.0f);
        this.d.c(c.j(n), -1.0f);
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
            this.d.c(solverVariable, -1.0f);
            this.d.c(solverVariable2, 1.0f);
            this.d.c(solverVariable3, -1.0f);
        }
        else {
            this.d.c(solverVariable, 1.0f);
            this.d.c(solverVariable2, -1.0f);
            this.d.c(solverVariable3, 1.0f);
        }
    }
    
    public boolean d() {
        return this.a == null && this.b == 0.0f && this.d.i() == 0;
    }
    
    public final SolverVariable e(final boolean[] array, final SolverVariable solverVariable) {
        final int i = this.d.i();
        SolverVariable solverVariable2 = null;
        int j = 0;
        float n = 0.0f;
        while (j < i) {
            final float k = this.d.k(j);
            SolverVariable solverVariable3 = solverVariable2;
            float n2 = n;
            Label_0153: {
                if (k < 0.0f) {
                    final SolverVariable b = this.d.b(j);
                    if (array != null) {
                        solverVariable3 = solverVariable2;
                        n2 = n;
                        if (array[b.g]) {
                            break Label_0153;
                        }
                    }
                    solverVariable3 = solverVariable2;
                    n2 = n;
                    if (b != solverVariable) {
                        final SolverVariable$Type n3 = b.n;
                        if (n3 != SolverVariable$Type.SLACK) {
                            solverVariable3 = solverVariable2;
                            n2 = n;
                            if (n3 != SolverVariable$Type.ERROR) {
                                break Label_0153;
                            }
                        }
                        solverVariable3 = solverVariable2;
                        n2 = n;
                        if (k < n) {
                            n2 = k;
                            solverVariable3 = b;
                        }
                    }
                }
            }
            ++j;
            solverVariable2 = solverVariable3;
            n = n2;
        }
        return solverVariable2;
    }
    
    public final void f(final SolverVariable a) {
        final SolverVariable a2 = this.a;
        if (a2 != null) {
            this.d.c(a2, -1.0f);
            this.a.h = -1;
            this.a = null;
        }
        final float n = this.d.h(a, true) * -1.0f;
        this.a = a;
        if (n == 1.0f) {
            return;
        }
        this.b /= n;
        this.d.e(n);
    }
    
    public final void g(final c c, final SolverVariable solverVariable, final boolean b) {
        if (solverVariable != null) {
            if (solverVariable.k) {
                this.b += solverVariable.j * this.d.d(solverVariable);
                this.d.h(solverVariable, b);
                if (b) {
                    solverVariable.c(this);
                }
                if (this.d.i() == 0) {
                    this.e = true;
                    c.a = true;
                }
            }
        }
    }
    
    public void h(final c c, final b b, final boolean b2) {
        this.b += b.b * this.d.j(b, b2);
        if (b2) {
            b.a.c(this);
        }
        if (this.a != null && this.d.i() == 0) {
            this.e = true;
            c.a = true;
        }
    }
    
    @Override
    public String toString() {
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
        final float b = this.b;
        int i = 0;
        int n;
        if (b != 0.0f) {
            final StringBuilder t2 = a.t(s);
            t2.append(this.b);
            s = t2.toString();
            n = 1;
        }
        else {
            n = 0;
        }
        while (i < this.d.i()) {
            final SolverVariable b2 = this.d.b(i);
            if (b2 != null) {
                final float k = this.d.k(i);
                final float n2 = fcmpl(k, 0.0f);
                if (n2 != 0) {
                    final String string2 = b2.toString();
                    String s2 = null;
                    float n3 = 0.0f;
                    Label_0224: {
                        if (n == 0) {
                            s2 = s;
                            n3 = k;
                            if (k >= 0.0f) {
                                break Label_0224;
                            }
                            s2 = b.l(s, "- ");
                        }
                        else {
                            if (n2 > 0) {
                                s2 = b.l(s, " + ");
                                n3 = k;
                                break Label_0224;
                            }
                            s2 = b.l(s, " - ");
                        }
                        n3 = k * -1.0f;
                    }
                    if (n3 == 1.0f) {
                        s = b.l(s2, string2);
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(s2);
                        sb.append(n3);
                        sb.append(" ");
                        sb.append(string2);
                        s = sb.toString();
                    }
                    n = 1;
                }
            }
            ++i;
        }
        String l = s;
        if (n == 0) {
            l = b.l(s, "0.0");
        }
        return l;
    }
}
