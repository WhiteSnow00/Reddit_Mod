// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver;

import java.util.Arrays;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import g3.d;
import g3.a;
import g3.b;

public final class c
{
    public static int o = 1000;
    public int a;
    public b b;
    public int c;
    public int d;
    public androidx.constraintlayout.solver.b[] e;
    public boolean f;
    public boolean[] g;
    public int h;
    public int i;
    public int j;
    public final a k;
    public SolverVariable[] l;
    public int m;
    public final androidx.constraintlayout.solver.b n;
    
    public c() {
        this.a = 0;
        this.c = 32;
        this.d = 32;
        this.e = null;
        this.f = false;
        this.g = new boolean[32];
        this.h = 1;
        this.i = 0;
        this.j = 32;
        this.l = new SolverVariable[androidx.constraintlayout.solver.c.o];
        this.m = 0;
        this.e = new androidx.constraintlayout.solver.b[32];
        int n = 0;
        while (true) {
            final androidx.constraintlayout.solver.b[] e = this.e;
            if (n >= e.length) {
                break;
            }
            final androidx.constraintlayout.solver.b b = e[n];
            if (b != null) {
                final d d = (d)this.k.a;
                final int b2 = d.b;
                final Object[] array = (Object)d.c;
                if (b2 < array.length) {
                    array[b2] = b;
                    d.b = b2 + 1;
                }
            }
            e[n] = null;
            ++n;
        }
        final a k = new a(0);
        this.k = k;
        this.b = new b(k);
        this.n = new androidx.constraintlayout.solver.b(k);
    }
    
    public static int m(final ConstraintAnchor constraintAnchor) {
        final SolverVariable i = constraintAnchor.i;
        if (i != null) {
            return (int)(i.d + 0.5f);
        }
        return 0;
    }
    
    public final SolverVariable a(final SolverVariable.Type type) {
        final d d = (d)this.k.b;
        int b = d.b;
        Object o = null;
        if (b > 0) {
            --b;
            final Object[] array = (Object)d.c;
            o = array[b];
            array[b] = null;
            d.b = b;
        }
        final SolverVariable solverVariable = (SolverVariable)o;
        SolverVariable solverVariable3;
        if (solverVariable == null) {
            final SolverVariable solverVariable2 = new SolverVariable(type);
            solverVariable2.f = type;
            solverVariable3 = solverVariable2;
        }
        else {
            solverVariable.c();
            solverVariable.f = type;
            solverVariable3 = solverVariable;
        }
        final int m = this.m;
        final int o2 = androidx.constraintlayout.solver.c.o;
        if (m >= o2) {
            this.l = Arrays.copyOf(this.l, androidx.constraintlayout.solver.c.o = o2 * 2);
        }
        return this.l[this.m++] = solverVariable3;
    }
    
    public final void b(final SolverVariable solverVariable, final SolverVariable solverVariable2, final int n, final float n2, final SolverVariable solverVariable3, final SolverVariable solverVariable4, final int n3, final int n4) {
        final androidx.constraintlayout.solver.b k = this.k();
        if (solverVariable2 == solverVariable3) {
            k.c.f(solverVariable, 1.0f);
            k.c.f(solverVariable4, 1.0f);
            k.c.f(solverVariable2, -2.0f);
        }
        else if (n2 == 0.5f) {
            k.c.f(solverVariable, 1.0f);
            k.c.f(solverVariable2, -1.0f);
            k.c.f(solverVariable3, -1.0f);
            k.c.f(solverVariable4, 1.0f);
            if (n > 0 || n3 > 0) {
                k.b = (float)(-n + n3);
            }
        }
        else if (n2 <= 0.0f) {
            k.c.f(solverVariable, -1.0f);
            k.c.f(solverVariable2, 1.0f);
            k.b = (float)n;
        }
        else if (n2 >= 1.0f) {
            k.c.f(solverVariable3, -1.0f);
            k.c.f(solverVariable4, 1.0f);
            k.b = (float)n3;
        }
        else {
            final androidx.constraintlayout.solver.a c = k.c;
            final float n5 = 1.0f - n2;
            c.f(solverVariable, n5 * 1.0f);
            k.c.f(solverVariable2, n5 * -1.0f);
            k.c.f(solverVariable3, -1.0f * n2);
            k.c.f(solverVariable4, 1.0f * n2);
            if (n > 0 || n3 > 0) {
                k.b = n3 * n2 + -n * n5;
            }
        }
        if (n4 != 6) {
            k.a(this, n4);
        }
        this.c(k);
    }
    
    public final void c(final androidx.constraintlayout.solver.b b) {
        final int i = this.i;
        final boolean b2 = true;
        if (i + 1 >= this.j || this.h + 1 >= this.d) {
            this.n();
        }
        boolean b7;
        if (!b.d) {
            this.r(b);
            if (b.a == null && b.b == 0.0f && b.c.a == 0) {
                return;
            }
            final float b3 = b.b;
            if (b3 < 0.0f) {
                b.b = b3 * -1.0f;
                final androidx.constraintlayout.solver.a c = b.c;
                for (int h = c.h, n = 0; h != -1 && n < c.a; h = c.f[h], ++n) {
                    final float[] g = c.g;
                    g[h] *= -1.0f;
                }
            }
            final androidx.constraintlayout.solver.a c2 = b.c;
            int h2 = c2.h;
            float n2 = 0.0f;
            float n3 = 0.0f;
            int n4 = 0;
            SolverVariable solverVariable = null;
            SolverVariable solverVariable2 = null;
            int n5 = 0;
            int n6 = 0;
            while (h2 != -1 && n4 < c2.a) {
                final float[] g2 = c2.g;
                final float n7 = g2[h2];
                final SolverVariable solverVariable3 = ((SolverVariable[])c2.c.c)[c2.e[h2]];
                float n8 = 0.0f;
                Label_0328: {
                    if (n7 < 0.0f) {
                        n8 = n7;
                        if (n7 <= -0.001f) {
                            break Label_0328;
                        }
                        g2[h2] = 0.0f;
                        solverVariable3.b(c2.b);
                    }
                    else {
                        n8 = n7;
                        if (n7 >= 0.001f) {
                            break Label_0328;
                        }
                        g2[h2] = 0.0f;
                        solverVariable3.b(c2.b);
                    }
                    n8 = 0.0f;
                }
                SolverVariable solverVariable4 = solverVariable;
                SolverVariable solverVariable5 = solverVariable2;
                float n9 = n2;
                int n10 = n5;
                float n11 = n3;
                int n12 = n6;
                Label_0712: {
                    if (n8 != 0.0f) {
                        if (solverVariable3.f == SolverVariable.Type.UNRESTRICTED) {
                            int n13 = 0;
                            Label_0410: {
                                Label_0407: {
                                    if (solverVariable2 == null) {
                                        if (solverVariable3.i > 1) {
                                            break Label_0407;
                                        }
                                    }
                                    else if (n2 > n8) {
                                        if (solverVariable3.i > 1) {
                                            break Label_0407;
                                        }
                                    }
                                    else {
                                        solverVariable4 = solverVariable;
                                        solverVariable5 = solverVariable2;
                                        n9 = n2;
                                        n10 = n5;
                                        n11 = n3;
                                        n12 = n6;
                                        if (n5 != 0) {
                                            break Label_0712;
                                        }
                                        final boolean b4 = solverVariable3.i <= 1;
                                        solverVariable4 = solverVariable;
                                        solverVariable5 = solverVariable2;
                                        n9 = n2;
                                        n10 = n5;
                                        n11 = n3;
                                        n12 = n6;
                                        if (b4) {
                                            n13 = 1;
                                            break Label_0410;
                                        }
                                        break Label_0712;
                                    }
                                    n13 = 1;
                                    break Label_0410;
                                }
                                n13 = 0;
                            }
                            solverVariable4 = solverVariable;
                            solverVariable5 = solverVariable3;
                            n9 = n8;
                            n10 = n13;
                            n11 = n3;
                            n12 = n6;
                        }
                        else {
                            solverVariable4 = solverVariable;
                            solverVariable5 = solverVariable2;
                            n9 = n2;
                            n10 = n5;
                            n11 = n3;
                            n12 = n6;
                            if (solverVariable2 == null) {
                                solverVariable4 = solverVariable;
                                solverVariable5 = solverVariable2;
                                n9 = n2;
                                n10 = n5;
                                n11 = n3;
                                n12 = n6;
                                if (n8 < 0.0f) {
                                    Label_0613: {
                                        Label_0610: {
                                            if (solverVariable == null) {
                                                if (solverVariable3.i > 1) {
                                                    break Label_0610;
                                                }
                                            }
                                            else if (n3 > n8) {
                                                if (solverVariable3.i > 1) {
                                                    break Label_0610;
                                                }
                                            }
                                            else {
                                                solverVariable4 = solverVariable;
                                                solverVariable5 = solverVariable2;
                                                n9 = n2;
                                                n10 = n5;
                                                n11 = n3;
                                                if ((n12 = n6) != 0) {
                                                    break Label_0712;
                                                }
                                                final boolean b5 = solverVariable3.i <= 1;
                                                solverVariable4 = solverVariable;
                                                solverVariable5 = solverVariable2;
                                                n9 = n2;
                                                n10 = n5;
                                                n11 = n3;
                                                n12 = n6;
                                                if (b5) {
                                                    n12 = 1;
                                                    break Label_0613;
                                                }
                                                break Label_0712;
                                            }
                                            n12 = 1;
                                            break Label_0613;
                                        }
                                        n12 = 0;
                                    }
                                    solverVariable4 = solverVariable3;
                                    n11 = n8;
                                    n10 = n5;
                                    n9 = n2;
                                    solverVariable5 = solverVariable2;
                                }
                            }
                        }
                    }
                }
                h2 = c2.f[h2];
                ++n4;
                solverVariable = solverVariable4;
                solverVariable2 = solverVariable5;
                n2 = n9;
                n5 = n10;
                n3 = n11;
                n6 = n12;
            }
            if (solverVariable2 != null) {
                solverVariable = solverVariable2;
            }
            boolean b6;
            if (solverVariable == null) {
                b6 = true;
            }
            else {
                b.d(solverVariable);
                b6 = false;
            }
            if (b.c.a == 0) {
                b.d = true;
            }
            if (b6) {
                if (this.h + 1 >= this.d) {
                    this.n();
                }
                final SolverVariable a = this.a(SolverVariable.Type.SLACK);
                final int n14 = this.a + 1;
                this.a = n14;
                ++this.h;
                a.a = n14;
                ((SolverVariable[])this.k.c)[n14] = a;
                b.a = a;
                this.h(b);
                final androidx.constraintlayout.solver.b n15 = this.n;
                n15.getClass();
                n15.a = null;
                n15.c.b();
                int n16 = 0;
            Label_0912:
                while (true) {
                    final androidx.constraintlayout.solver.a c3 = b.c;
                    if (n16 < c3.a) {
                        final SolverVariable e = c3.e(n16);
                        final androidx.constraintlayout.solver.a c4 = b.c;
                        while (true) {
                            for (int h3 = c4.h, n17 = 0; h3 != -1 && n17 < c4.a; h3 = c4.f[h3], ++n17) {
                                if (n17 == n16) {
                                    final float n18 = c4.g[h3];
                                    n15.c.a(e, n18, true);
                                    ++n16;
                                    continue Label_0912;
                                }
                            }
                            final float n18 = 0.0f;
                            continue;
                        }
                    }
                    break;
                }
                this.p(this.n);
                if (a.b == -1) {
                    if (b.a == a) {
                        final SolverVariable d = b.c.d(null, a);
                        if (d != null) {
                            b.d(d);
                        }
                    }
                    if (!b.d) {
                        b.a.d(b);
                    }
                    --this.i;
                }
                b7 = true;
            }
            else {
                b7 = false;
            }
            final SolverVariable a2 = b.a;
            int n19 = 0;
            Label_1152: {
                if (a2 != null) {
                    n19 = (b2 ? 1 : 0);
                    if (a2.f == SolverVariable.Type.UNRESTRICTED) {
                        break Label_1152;
                    }
                    if (b.b >= 0.0f) {
                        n19 = (b2 ? 1 : 0);
                        break Label_1152;
                    }
                }
                n19 = 0;
            }
            if (n19 == 0) {
                return;
            }
        }
        else {
            b7 = false;
        }
        if (!b7) {
            this.h(b);
        }
    }
    
    public final void d(final SolverVariable a, final int n) {
        final int b = a.b;
        if (b != -1) {
            final androidx.constraintlayout.solver.b b2 = this.e[b];
            if (b2.d) {
                b2.b = (float)n;
            }
            else if (b2.c.a == 0) {
                b2.d = true;
                b2.b = (float)n;
            }
            else {
                final androidx.constraintlayout.solver.b k = this.k();
                if (n < 0) {
                    k.b = (float)(n * -1);
                    k.c.f(a, 1.0f);
                }
                else {
                    k.b = (float)n;
                    k.c.f(a, -1.0f);
                }
                this.c(k);
            }
        }
        else {
            final androidx.constraintlayout.solver.b i = this.k();
            i.a = a;
            final float n2 = (float)n;
            a.d = n2;
            i.b = n2;
            i.d = true;
            this.c(i);
        }
    }
    
    public final void e(final SolverVariable solverVariable, final SolverVariable solverVariable2, final int n, final int n2) {
        final androidx.constraintlayout.solver.b k = this.k();
        int n3 = 0;
        final int n4 = 0;
        if (n != 0) {
            n3 = n4;
            int n5;
            if ((n5 = n) < 0) {
                n5 = n * -1;
                n3 = 1;
            }
            k.b = (float)n5;
        }
        if (n3 == 0) {
            k.c.f(solverVariable, -1.0f);
            k.c.f(solverVariable2, 1.0f);
        }
        else {
            k.c.f(solverVariable, 1.0f);
            k.c.f(solverVariable2, -1.0f);
        }
        if (n2 != 6) {
            k.a(this, n2);
        }
        this.c(k);
    }
    
    public final void f(SolverVariable i, final SolverVariable solverVariable, int n, final int n2) {
        final androidx.constraintlayout.solver.b k = this.k();
        final SolverVariable l = this.l();
        l.c = 0;
        k.b(i, solverVariable, l, n);
        if (n2 != 6) {
            n = (int)(k.c.c(l) * -1.0f);
            i = this.i(n2);
            k.c.f(i, (float)n);
        }
        this.c(k);
    }
    
    public final void g(SolverVariable i, final SolverVariable solverVariable, int n, final int n2) {
        final androidx.constraintlayout.solver.b k = this.k();
        final SolverVariable l = this.l();
        l.c = 0;
        k.c(i, solverVariable, l, n);
        if (n2 != 6) {
            n = (int)(k.c.c(l) * -1.0f);
            i = this.i(n2);
            k.c.f(i, (float)n);
        }
        this.c(k);
    }
    
    public final void h(final androidx.constraintlayout.solver.b b) {
        final androidx.constraintlayout.solver.b[] e = this.e;
        final int i = this.i;
        final androidx.constraintlayout.solver.b b2 = e[i];
        if (b2 != null) {
            final d d = (d)this.k.a;
            final int b3 = d.b;
            final Object[] array = (Object)d.c;
            if (b3 < array.length) {
                array[b3] = b2;
                d.b = b3 + 1;
            }
        }
        e[i] = b;
        final SolverVariable a = b.a;
        a.b = i;
        this.i = i + 1;
        a.d(b);
    }
    
    public final SolverVariable i(final int c) {
        if (this.h + 1 >= this.d) {
            this.n();
        }
        final SolverVariable a = this.a(SolverVariable.Type.ERROR);
        final int n = this.a + 1;
        this.a = n;
        ++this.h;
        a.a = n;
        a.c = c;
        ((SolverVariable[])this.k.c)[n] = a;
        this.b.e(a);
        return a;
    }
    
    public final SolverVariable j(final Object o) {
        SolverVariable solverVariable = null;
        if (o == null) {
            return null;
        }
        if (this.h + 1 >= this.d) {
            this.n();
        }
        if (o instanceof ConstraintAnchor) {
            final ConstraintAnchor constraintAnchor = (ConstraintAnchor)o;
            SolverVariable solverVariable2;
            if ((solverVariable2 = constraintAnchor.i) == null) {
                constraintAnchor.e();
                solverVariable2 = constraintAnchor.i;
            }
            final int a = solverVariable2.a;
            if (a != -1 && a <= this.a) {
                solverVariable = solverVariable2;
                if (((SolverVariable[])this.k.c)[a] != null) {
                    return solverVariable;
                }
            }
            if (a != -1) {
                solverVariable2.c();
            }
            final int n = this.a + 1;
            this.a = n;
            ++this.h;
            solverVariable2.a = n;
            solverVariable2.f = SolverVariable.Type.UNRESTRICTED;
            ((SolverVariable[])this.k.c)[n] = solverVariable2;
            solverVariable = solverVariable2;
        }
        return solverVariable;
    }
    
    public final androidx.constraintlayout.solver.b k() {
        final a k = this.k;
        final d d = (d)k.a;
        int b = d.b;
        Object o;
        if (b > 0) {
            --b;
            final Object[] array = (Object)d.c;
            o = array[b];
            array[b] = null;
            d.b = b;
        }
        else {
            o = null;
        }
        androidx.constraintlayout.solver.b b2 = (androidx.constraintlayout.solver.b)o;
        if (b2 == null) {
            b2 = new androidx.constraintlayout.solver.b(k);
        }
        else {
            b2.a = null;
            b2.c.b();
            b2.b = 0.0f;
            b2.d = false;
        }
        return b2;
    }
    
    public final SolverVariable l() {
        if (this.h + 1 >= this.d) {
            this.n();
        }
        final SolverVariable a = this.a(SolverVariable.Type.SLACK);
        final int n = this.a + 1;
        this.a = n;
        ++this.h;
        a.a = n;
        return ((SolverVariable[])this.k.c)[n] = a;
    }
    
    public final void n() {
        final int c = this.c * 2;
        this.c = c;
        this.e = Arrays.copyOf(this.e, c);
        final a k = this.k;
        k.c = Arrays.copyOf((SolverVariable[])k.c, this.c);
        final int c2 = this.c;
        this.g = new boolean[c2];
        this.d = c2;
        this.j = c2;
    }
    
    public final void o(final b b) throws Exception {
        this.r((androidx.constraintlayout.solver.b)b);
        while (true) {
            for (int i = 0; i < this.i; ++i) {
                final androidx.constraintlayout.solver.b b2 = this.e[i];
                if (b2.a.f != SolverVariable.Type.UNRESTRICTED) {
                    if (b2.b < 0.0f) {
                        final boolean b3 = true;
                        if (b3) {
                            int j = 0;
                            int n = 0;
                            while (j == 0) {
                                final int n2 = n + 1;
                                float n3 = Float.MAX_VALUE;
                                int b4 = -1;
                                int n4 = -1;
                                int k = 0;
                                int n5 = 0;
                                while (k < this.i) {
                                    final androidx.constraintlayout.solver.b b5 = this.e[k];
                                    float n6;
                                    int n7;
                                    int n8;
                                    int n9;
                                    if (b5.a.f == SolverVariable.Type.UNRESTRICTED) {
                                        n6 = n3;
                                        n7 = b4;
                                        n8 = n4;
                                        n9 = n5;
                                    }
                                    else if (b5.d) {
                                        n6 = n3;
                                        n7 = b4;
                                        n8 = n4;
                                        n9 = n5;
                                    }
                                    else {
                                        n6 = n3;
                                        n7 = b4;
                                        n8 = n4;
                                        n9 = n5;
                                        if (b5.b < 0.0f) {
                                            int n10 = 1;
                                            while (true) {
                                                n6 = n3;
                                                n7 = b4;
                                                n8 = n4;
                                                n9 = n5;
                                                if (n10 >= this.h) {
                                                    break;
                                                }
                                                final SolverVariable solverVariable = ((SolverVariable[])this.k.c)[n10];
                                                final float c = b5.c.c(solverVariable);
                                                float n11;
                                                int n12;
                                                int n13;
                                                int n14;
                                                if (c <= 0.0f) {
                                                    n11 = n3;
                                                    n12 = b4;
                                                    n13 = n4;
                                                    n14 = n5;
                                                }
                                                else {
                                                    final int n15 = 0;
                                                    int n16 = n4;
                                                    int n17 = n15;
                                                    while (true) {
                                                        n11 = n3;
                                                        n12 = b4;
                                                        n13 = n16;
                                                        n14 = n5;
                                                        if (n17 >= 7) {
                                                            break;
                                                        }
                                                        final float n18 = solverVariable.e[n17] / c;
                                                        int n19;
                                                        if ((n18 < n3 && n17 == n5) || n17 > (n19 = n5)) {
                                                            n19 = n17;
                                                            n3 = n18;
                                                            b4 = k;
                                                            n16 = n10;
                                                        }
                                                        ++n17;
                                                        n5 = n19;
                                                    }
                                                }
                                                ++n10;
                                                n3 = n11;
                                                b4 = n12;
                                                n4 = n13;
                                                n5 = n14;
                                            }
                                        }
                                    }
                                    ++k;
                                    n3 = n6;
                                    b4 = n7;
                                    n4 = n8;
                                    n5 = n9;
                                }
                                if (b4 != -1) {
                                    final androidx.constraintlayout.solver.b b6 = this.e[b4];
                                    b6.a.b = -1;
                                    b6.d(((SolverVariable[])this.k.c)[n4]);
                                    final SolverVariable a = b6.a;
                                    a.b = b4;
                                    a.d(b6);
                                }
                                else {
                                    j = 1;
                                }
                                if (n2 > this.h / 2) {
                                    j = 1;
                                }
                                n = n2;
                            }
                        }
                        this.p((androidx.constraintlayout.solver.b)b);
                        for (int l = 0; l < this.i; ++l) {
                            final androidx.constraintlayout.solver.b b7 = this.e[l];
                            b7.a.d = b7.b;
                        }
                        return;
                    }
                }
            }
            final boolean b3 = false;
            continue;
        }
    }
    
    public final void p(final androidx.constraintlayout.solver.b b) {
        for (int i = 0; i < this.h; ++i) {
            this.g[i] = false;
        }
        int j = 0;
        int n = 0;
        while (j == 0) {
            final int n2 = n + 1;
            if (n2 >= this.h * 2) {
                return;
            }
            final SolverVariable a = b.a;
            if (a != null) {
                this.g[a.a] = true;
            }
            final SolverVariable d = b.c.d(this.g, null);
            if (d != null) {
                final boolean[] g = this.g;
                final int a2 = d.a;
                if (g[a2]) {
                    return;
                }
                g[a2] = true;
            }
            Label_0420: {
                if (d != null) {
                    float n3 = Float.MAX_VALUE;
                    int k = 0;
                    int b2 = -1;
                    while (k < this.i) {
                        final androidx.constraintlayout.solver.b b3 = this.e[k];
                        float n4;
                        int n5;
                        if (b3.a.f == SolverVariable.Type.UNRESTRICTED) {
                            n4 = n3;
                            n5 = b2;
                        }
                        else if (b3.d) {
                            n4 = n3;
                            n5 = b2;
                        }
                        else {
                            final androidx.constraintlayout.solver.a c = b3.c;
                            int h = c.h;
                            boolean b4 = false;
                            Label_0283: {
                                if (h != -1) {
                                    for (int n6 = 0; h != -1 && n6 < c.a; h = c.f[h], ++n6) {
                                        if (c.e[h] == d.a) {
                                            b4 = true;
                                            break Label_0283;
                                        }
                                    }
                                }
                                b4 = false;
                            }
                            n4 = n3;
                            n5 = b2;
                            if (b4) {
                                final float c2 = b3.c.c(d);
                                n4 = n3;
                                n5 = b2;
                                if (c2 < 0.0f) {
                                    final float n7 = -b3.b / c2;
                                    n4 = n3;
                                    n5 = b2;
                                    if (n7 < n3) {
                                        n5 = k;
                                        n4 = n7;
                                    }
                                }
                            }
                        }
                        ++k;
                        n3 = n4;
                        b2 = n5;
                    }
                    if (b2 > -1) {
                        final androidx.constraintlayout.solver.b b5 = this.e[b2];
                        b5.a.b = -1;
                        b5.d(d);
                        final SolverVariable a3 = b5.a;
                        a3.b = b2;
                        a3.d(b5);
                        break Label_0420;
                    }
                }
                j = 1;
            }
            n = n2;
        }
    }
    
    public final void q() {
        int n = 0;
        a k;
        while (true) {
            k = this.k;
            final SolverVariable[] array = (SolverVariable[])k.c;
            if (n >= array.length) {
                break;
            }
            final SolverVariable solverVariable = array[n];
            if (solverVariable != null) {
                solverVariable.c();
            }
            ++n;
        }
        final d d = (d)k.b;
        final SolverVariable[] l = this.l;
        final int m = this.m;
        d.getClass();
        int length;
        if ((length = m) > l.length) {
            length = l.length;
        }
        for (final SolverVariable solverVariable2 : l) {
            final int b = d.b;
            final Object[] array2 = (Object)d.c;
            if (b < array2.length) {
                array2[b] = solverVariable2;
                d.b = b + 1;
            }
        }
        this.m = 0;
        Arrays.fill((Object[])this.k.c, null);
        this.a = 0;
        final b b2 = this.b;
        ((androidx.constraintlayout.solver.b)b2).c.b();
        ((androidx.constraintlayout.solver.b)b2).a = null;
        ((androidx.constraintlayout.solver.b)b2).b = 0.0f;
        this.h = 1;
        for (int j = 0; j < this.i; ++j) {
            this.e[j].getClass();
        }
        int n2 = 0;
        while (true) {
            final androidx.constraintlayout.solver.b[] e = this.e;
            if (n2 >= e.length) {
                break;
            }
            final androidx.constraintlayout.solver.b b3 = e[n2];
            if (b3 != null) {
                final d d2 = (d)this.k.a;
                final int b4 = d2.b;
                final Object[] array3 = (Object)d2.c;
                if (b4 < array3.length) {
                    array3[b4] = b3;
                    d2.b = b4 + 1;
                }
            }
            e[n2] = null;
            ++n2;
        }
        this.i = 0;
    }
    
    public final void r(final androidx.constraintlayout.solver.b b) {
        if (this.i > 0) {
            final androidx.constraintlayout.solver.a c = b.c;
            final androidx.constraintlayout.solver.b[] e = this.e;
            int n = c.h;
        Label_0026:
            while (true) {
                for (int n2 = 0; n != -1 && n2 < c.a; n = c.f[n], ++n2) {
                    final SolverVariable solverVariable = ((SolverVariable[])c.c.c)[c.e[n]];
                    if (solverVariable.b != -1) {
                        final float n3 = c.g[n];
                        c.g(solverVariable, true);
                        final androidx.constraintlayout.solver.b b2 = e[solverVariable.b];
                        if (!b2.d) {
                            final androidx.constraintlayout.solver.a c2 = b2.c;
                            for (int h = c2.h, n4 = 0; h != -1 && n4 < c2.a; h = c2.f[h], ++n4) {
                                c.a(((SolverVariable[])c.c.c)[c2.e[h]], c2.g[h] * n3, true);
                            }
                        }
                        b.b += b2.b * n3;
                        b2.a.b(b);
                        n = c.h;
                        continue Label_0026;
                    }
                }
                break;
            }
            if (b.c.a == 0) {
                b.d = true;
            }
        }
    }
}
