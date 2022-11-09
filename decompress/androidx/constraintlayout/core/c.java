// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core;

import java.util.Arrays;
import a2.f;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import z2.a;

public final class c
{
    public static boolean p = false;
    public static int q = 1000;
    public boolean a;
    public int b;
    public d c;
    public int d;
    public int e;
    public b[] f;
    public boolean g;
    public boolean[] h;
    public int i;
    public int j;
    public int k;
    public final z2.a l;
    public SolverVariable[] m;
    public int n;
    public b o;
    
    public c() {
        this.a = false;
        this.b = 0;
        this.d = 32;
        this.e = 32;
        this.f = null;
        this.g = false;
        this.h = new boolean[32];
        this.i = 1;
        this.j = 0;
        this.k = 32;
        this.m = new SolverVariable[androidx.constraintlayout.core.c.q];
        this.n = 0;
        this.f = new b[32];
        this.s();
        final z2.a l = new z2.a();
        this.l = l;
        this.c = new d(l);
        this.o = new b(l);
    }
    
    public static int n(final ConstraintAnchor constraintAnchor) {
        final SolverVariable i = constraintAnchor.i;
        if (i != null) {
            return (int)(i.j + 0.5f);
        }
        return 0;
    }
    
    public final SolverVariable a(final SolverVariable.Type type) {
        final f f = (f)this.l.h;
        int a = f.a;
        Object o = null;
        if (a > 0) {
            --a;
            final Object[] array = (Object[])f.b;
            o = array[a];
            array[a] = null;
            f.a = a;
        }
        final SolverVariable solverVariable = (SolverVariable)o;
        SolverVariable solverVariable3;
        if (solverVariable == null) {
            final SolverVariable solverVariable2 = new SolverVariable(type);
            solverVariable2.n = type;
            solverVariable3 = solverVariable2;
        }
        else {
            solverVariable.c();
            solverVariable.n = type;
            solverVariable3 = solverVariable;
        }
        final int n = this.n;
        final int q = androidx.constraintlayout.core.c.q;
        if (n >= q) {
            this.m = Arrays.copyOf(this.m, androidx.constraintlayout.core.c.q = q * 2);
        }
        return this.m[this.n++] = solverVariable3;
    }
    
    public final void b(final SolverVariable solverVariable, final SolverVariable solverVariable2, final int n, final float n2, final SolverVariable solverVariable3, final SolverVariable solverVariable4, final int n3, final int n4) {
        final b l = this.l();
        if (solverVariable2 == solverVariable3) {
            l.d.c(solverVariable, 1.0f);
            l.d.c(solverVariable4, 1.0f);
            l.d.c(solverVariable2, -2.0f);
        }
        else if (n2 == 0.5f) {
            l.d.c(solverVariable, 1.0f);
            l.d.c(solverVariable2, -1.0f);
            l.d.c(solverVariable3, -1.0f);
            l.d.c(solverVariable4, 1.0f);
            if (n > 0 || n3 > 0) {
                l.b = (float)(-n + n3);
            }
        }
        else if (n2 <= 0.0f) {
            l.d.c(solverVariable, -1.0f);
            l.d.c(solverVariable2, 1.0f);
            l.b = (float)n;
        }
        else if (n2 >= 1.0f) {
            l.d.c(solverVariable4, -1.0f);
            l.d.c(solverVariable3, 1.0f);
            l.b = (float)(-n3);
        }
        else {
            final b.a d = l.d;
            final float n5 = 1.0f - n2;
            d.c(solverVariable, n5 * 1.0f);
            l.d.c(solverVariable2, n5 * -1.0f);
            l.d.c(solverVariable3, -1.0f * n2);
            l.d.c(solverVariable4, 1.0f * n2);
            if (n > 0 || n3 > 0) {
                l.b = n3 * n2 + -n * n5;
            }
        }
        if (n4 != 8) {
            l.b(this, n4);
        }
        this.c(l);
    }
    
    public final void c(final b b) {
        final int j = this.j;
        final boolean b2 = true;
        if (j + 1 >= this.k || this.i + 1 >= this.e) {
            this.o();
        }
        boolean b9 = false;
        if (!b.e) {
            if (this.f.length != 0) {
                int i = 0;
                while (i == 0) {
                    for (int k = b.d.i(), l = 0; l < k; ++l) {
                        final SolverVariable b3 = b.d.b(l);
                        if (b3.h != -1 || b3.k) {
                            b.c.add(b3);
                        }
                    }
                    final int size = b.c.size();
                    if (size > 0) {
                        for (int n = 0; n < size; ++n) {
                            final SolverVariable solverVariable = b.c.get(n);
                            if (solverVariable.k) {
                                b.g(this, solverVariable, true);
                            }
                            else {
                                b.h(this, this.f[solverVariable.h], true);
                            }
                        }
                        b.c.clear();
                    }
                    else {
                        i = 1;
                    }
                }
                if (b.a != null && b.d.i() == 0) {
                    b.e = true;
                    this.a = true;
                }
            }
            if (b.d()) {
                return;
            }
            final float b4 = b.b;
            if (b4 < 0.0f) {
                b.b = b4 * -1.0f;
                b.d.g();
            }
            final int m = b.d.i();
            float n3;
            float n2 = n3 = 0.0f;
            int n4 = 0;
            SolverVariable solverVariable2 = null;
            SolverVariable solverVariable3 = null;
            int n5 = 0;
            int n6 = 0;
            while (n4 < m) {
                final float k2 = b.d.k(n4);
                final SolverVariable b5 = b.d.b(n4);
                SolverVariable solverVariable4 = null;
                SolverVariable solverVariable5 = null;
                float n7 = 0.0f;
                int n8 = 0;
                float n9 = 0.0f;
                int n10 = 0;
                Label_0706: {
                    if (b5.n == SolverVariable.Type.UNRESTRICTED) {
                        Label_0485: {
                            Label_0483: {
                                if (solverVariable2 == null) {
                                    if (b5.q <= 1) {
                                        break Label_0483;
                                    }
                                }
                                else if (n2 > k2) {
                                    if (b5.q <= 1) {
                                        break Label_0483;
                                    }
                                }
                                else {
                                    solverVariable4 = solverVariable2;
                                    solverVariable5 = solverVariable3;
                                    n7 = n2;
                                    n8 = n5;
                                    n9 = n3;
                                    n10 = n6;
                                    if (n5 != 0) {
                                        break Label_0706;
                                    }
                                    final boolean b6 = b5.q <= 1;
                                    solverVariable4 = solverVariable2;
                                    solverVariable5 = solverVariable3;
                                    n7 = n2;
                                    n8 = n5;
                                    n9 = n3;
                                    n10 = n6;
                                    if (b6) {
                                        break Label_0483;
                                    }
                                    break Label_0706;
                                }
                                n8 = 0;
                                break Label_0485;
                            }
                            n8 = 1;
                        }
                        solverVariable4 = b5;
                        solverVariable5 = solverVariable3;
                        n7 = k2;
                        n9 = n3;
                        n10 = n6;
                    }
                    else {
                        solverVariable4 = solverVariable2;
                        solverVariable5 = solverVariable3;
                        n7 = n2;
                        n8 = n5;
                        n9 = n3;
                        n10 = n6;
                        if (solverVariable2 == null) {
                            solverVariable4 = solverVariable2;
                            solverVariable5 = solverVariable3;
                            n7 = n2;
                            n8 = n5;
                            n9 = n3;
                            n10 = n6;
                            if (k2 < 0.0f) {
                                int n11 = 0;
                                Label_0684: {
                                    Label_0682: {
                                        if (solverVariable3 == null) {
                                            if (b5.q <= 1) {
                                                break Label_0682;
                                            }
                                        }
                                        else if (n3 > k2) {
                                            if (b5.q <= 1) {
                                                break Label_0682;
                                            }
                                        }
                                        else {
                                            solverVariable4 = solverVariable2;
                                            solverVariable5 = solverVariable3;
                                            n7 = n2;
                                            n8 = n5;
                                            n9 = n3;
                                            if ((n10 = n6) != 0) {
                                                break Label_0706;
                                            }
                                            final boolean b7 = b5.q <= 1;
                                            solverVariable4 = solverVariable2;
                                            solverVariable5 = solverVariable3;
                                            n7 = n2;
                                            n8 = n5;
                                            n9 = n3;
                                            n10 = n6;
                                            if (b7) {
                                                break Label_0682;
                                            }
                                            break Label_0706;
                                        }
                                        n11 = 0;
                                        break Label_0684;
                                    }
                                    n11 = 1;
                                }
                                n9 = k2;
                                n10 = n11;
                                n8 = n5;
                                n7 = n2;
                                solverVariable5 = b5;
                                solverVariable4 = solverVariable2;
                            }
                        }
                    }
                }
                ++n4;
                solverVariable2 = solverVariable4;
                solverVariable3 = solverVariable5;
                n2 = n7;
                n5 = n8;
                n3 = n9;
                n6 = n10;
            }
            if (solverVariable2 != null) {
                solverVariable3 = solverVariable2;
            }
            boolean b8;
            if (solverVariable3 == null) {
                b8 = true;
            }
            else {
                b.f(solverVariable3);
                b8 = false;
            }
            if (b.d.i() == 0) {
                b.e = true;
            }
            Label_1061: {
                if (b8) {
                    if (this.i + 1 >= this.e) {
                        this.o();
                    }
                    final SolverVariable a = this.a(SolverVariable.Type.SLACK);
                    final int n12 = this.b + 1;
                    this.b = n12;
                    ++this.i;
                    a.g = n12;
                    ((SolverVariable[])this.l.i)[n12] = a;
                    b.a = a;
                    final int j2 = this.j;
                    this.h(b);
                    if (this.j == j2 + 1) {
                        final b o = this.o;
                        o.getClass();
                        o.a = null;
                        o.d.clear();
                        for (int n13 = 0; n13 < b.d.i(); ++n13) {
                            o.d.f(b.d.b(n13), b.d.k(n13), true);
                        }
                        this.r(this.o);
                        if (a.h == -1) {
                            if (b.a == a) {
                                final SolverVariable e = b.e(null, a);
                                if (e != null) {
                                    b.f(e);
                                }
                            }
                            if (!b.e) {
                                b.a.f(this, b);
                            }
                            ((f)this.l.g).c(b);
                            --this.j;
                        }
                        b9 = true;
                        break Label_1061;
                    }
                }
                b9 = false;
            }
            final SolverVariable a2 = b.a;
            int n14 = 0;
            Label_1104: {
                if (a2 != null) {
                    n14 = (b2 ? 1 : 0);
                    if (a2.n == SolverVariable.Type.UNRESTRICTED) {
                        break Label_1104;
                    }
                    if (b.b >= 0.0f) {
                        n14 = (b2 ? 1 : 0);
                        break Label_1104;
                    }
                }
                n14 = 0;
            }
            if (n14 == 0) {
                return;
            }
        }
        else {
            b9 = false;
        }
        if (!b9) {
            this.h(b);
        }
    }
    
    public final void d(SolverVariable a, int i) {
        final int h = a.h;
        if (h == -1) {
            a.d(this, (float)i);
            for (i = 0; i < this.b + 1; ++i) {
                a = ((SolverVariable[])this.l.i)[i];
            }
            return;
        }
        if (h != -1) {
            final b b = this.f[h];
            if (b.e) {
                b.b = (float)i;
            }
            else if (b.d.i() == 0) {
                b.e = true;
                b.b = (float)i;
            }
            else {
                final b l = this.l();
                if (i < 0) {
                    l.b = (float)(i * -1);
                    l.d.c(a, 1.0f);
                }
                else {
                    l.b = (float)i;
                    l.d.c(a, -1.0f);
                }
                this.c(l);
            }
        }
        else {
            final b j = this.l();
            j.a = a;
            final float n = (float)i;
            a.j = n;
            j.b = n;
            j.e = true;
            this.c(j);
        }
    }
    
    public final void e(final SolverVariable solverVariable, final SolverVariable solverVariable2, final int n, final int n2) {
        if (n2 == 8 && solverVariable2.k && solverVariable.h == -1) {
            solverVariable.d(this, solverVariable2.j + n);
            return;
        }
        final b l = this.l();
        int n3 = 0;
        final int n4 = 0;
        if (n != 0) {
            n3 = n4;
            int n5;
            if ((n5 = n) < 0) {
                n5 = n * -1;
                n3 = 1;
            }
            l.b = (float)n5;
        }
        if (n3 == 0) {
            l.d.c(solverVariable, -1.0f);
            l.d.c(solverVariable2, 1.0f);
        }
        else {
            l.d.c(solverVariable, 1.0f);
            l.d.c(solverVariable2, -1.0f);
        }
        if (n2 != 8) {
            l.b(this, n2);
        }
        this.c(l);
    }
    
    public final void f(SolverVariable j, final SolverVariable solverVariable, int n, final int n2) {
        final b l = this.l();
        final SolverVariable m = this.m();
        int n3 = 0;
        final int n4 = 0;
        m.i = 0;
        if (n != 0) {
            n3 = n4;
            int n5;
            if ((n5 = n) < 0) {
                n5 = n * -1;
                n3 = 1;
            }
            l.b = (float)n5;
        }
        if (n3 == 0) {
            l.d.c(j, -1.0f);
            l.d.c(solverVariable, 1.0f);
            l.d.c(m, 1.0f);
        }
        else {
            l.d.c(j, 1.0f);
            l.d.c(solverVariable, -1.0f);
            l.d.c(m, -1.0f);
        }
        if (n2 != 8) {
            n = (int)(l.d.d(m) * -1.0f);
            j = this.j(n2);
            l.d.c(j, (float)n);
        }
        this.c(l);
    }
    
    public final void g(SolverVariable j, final SolverVariable solverVariable, int n, final int n2) {
        final b l = this.l();
        final SolverVariable m = this.m();
        m.i = 0;
        l.c(j, solverVariable, m, n);
        if (n2 != 8) {
            n = (int)(l.d.d(m) * -1.0f);
            j = this.j(n2);
            l.d.c(j, (float)n);
        }
        this.c(l);
    }
    
    public final void h(b b) {
        if (b.e) {
            b.a.d(this, b.b);
        }
        else {
            final b[] f = this.f;
            final int j = this.j;
            f[j] = b;
            final SolverVariable a = b.a;
            a.h = j;
            this.j = j + 1;
            a.f(this, b);
        }
        if (this.a) {
            int n;
            for (int i = 0; i < this.j; i = n + 1) {
                if (this.f[i] == null) {
                    System.out.println("WTF");
                }
                b = this.f[i];
                n = i;
                if (b != null) {
                    n = i;
                    if (b.e) {
                        b.a.d(this, b.b);
                        ((f)this.l.g).c(b);
                        this.f[i] = null;
                        int n3;
                        int n2 = n3 = i + 1;
                        int k;
                        while (true) {
                            k = this.j;
                            if (n2 >= k) {
                                break;
                            }
                            final b[] f2 = this.f;
                            final int h = n2 - 1;
                            final b b2 = f2[n2];
                            f2[h] = b2;
                            final SolverVariable a2 = b2.a;
                            if (a2.h == n2) {
                                a2.h = h;
                            }
                            n3 = n2;
                            ++n2;
                        }
                        if (n3 < k) {
                            this.f[n3] = null;
                        }
                        this.j = k - 1;
                        n = i - 1;
                    }
                }
            }
            this.a = false;
        }
    }
    
    public final void i() {
        for (int i = 0; i < this.j; ++i) {
            final b b = this.f[i];
            b.a.j = b.b;
        }
    }
    
    public final SolverVariable j(final int i) {
        if (this.i + 1 >= this.e) {
            this.o();
        }
        final SolverVariable a = this.a(SolverVariable.Type.ERROR);
        final int n = this.b + 1;
        this.b = n;
        ++this.i;
        a.g = n;
        a.i = i;
        ((SolverVariable[])this.l.i)[n] = a;
        final d c = this.c;
        c.i.a = a;
        Arrays.fill(a.m, 0.0f);
        a.m[a.i] = 1.0f;
        c.i(a);
        return a;
    }
    
    public final SolverVariable k(final Object o) {
        SolverVariable solverVariable = null;
        if (o == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            this.o();
        }
        if (o instanceof ConstraintAnchor) {
            final ConstraintAnchor constraintAnchor = (ConstraintAnchor)o;
            SolverVariable solverVariable2;
            if ((solverVariable2 = constraintAnchor.i) == null) {
                constraintAnchor.h();
                solverVariable2 = constraintAnchor.i;
            }
            final int g = solverVariable2.g;
            if (g != -1 && g <= this.b) {
                solverVariable = solverVariable2;
                if (((SolverVariable[])this.l.i)[g] != null) {
                    return solverVariable;
                }
            }
            if (g != -1) {
                solverVariable2.c();
            }
            final int n = this.b + 1;
            this.b = n;
            ++this.i;
            solverVariable2.g = n;
            solverVariable2.n = SolverVariable.Type.UNRESTRICTED;
            ((SolverVariable[])this.l.i)[n] = solverVariable2;
            solverVariable = solverVariable2;
        }
        return solverVariable;
    }
    
    public final b l() {
        final z2.a l = this.l;
        final f f = (f)l.g;
        int a = f.a;
        Object o;
        if (a > 0) {
            --a;
            final Object[] array = (Object[])f.b;
            o = array[a];
            array[a] = null;
            f.a = a;
        }
        else {
            o = null;
        }
        b b = (b)o;
        if (b == null) {
            b = new b(l);
        }
        else {
            b.a = null;
            b.d.clear();
            b.b = 0.0f;
            b.e = false;
        }
        return b;
    }
    
    public final SolverVariable m() {
        if (this.i + 1 >= this.e) {
            this.o();
        }
        final SolverVariable a = this.a(SolverVariable.Type.SLACK);
        final int n = this.b + 1;
        this.b = n;
        ++this.i;
        a.g = n;
        return ((SolverVariable[])this.l.i)[n] = a;
    }
    
    public final void o() {
        final int d = this.d * 2;
        this.d = d;
        this.f = Arrays.copyOf(this.f, d);
        final z2.a l = this.l;
        l.i = Arrays.copyOf((SolverVariable[])l.i, this.d);
        final int d2 = this.d;
        this.h = new boolean[d2];
        this.e = d2;
        this.k = d2;
    }
    
    public final void p() throws Exception {
        if (this.c.d()) {
            this.i();
            return;
        }
        if (this.g) {
            final int n = 0;
            int i = 0;
            while (true) {
                while (i < this.j) {
                    if (!this.f[i].e) {
                        final int n2 = n;
                        if (n2 == 0) {
                            this.q(this.c);
                            return;
                        }
                        this.i();
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                final int n2 = 1;
                continue;
            }
        }
        this.q(this.c);
    }
    
    public final void q(final d d) throws Exception {
        while (true) {
            for (int i = 0; i < this.j; ++i) {
                final b b = this.f[i];
                if (b.a.n != SolverVariable.Type.UNRESTRICTED) {
                    if (b.b < 0.0f) {
                        final boolean b2 = true;
                        if (b2) {
                            int j = 0;
                            int n = 0;
                            while (j == 0) {
                                final int n2 = n + 1;
                                float n3 = Float.MAX_VALUE;
                                int g;
                                int h = g = -1;
                                int k = 0;
                                int n4 = 0;
                                while (k < this.j) {
                                    final b b3 = this.f[k];
                                    float n5;
                                    int n6;
                                    int n7;
                                    int n8;
                                    if (b3.a.n == SolverVariable.Type.UNRESTRICTED) {
                                        n5 = n3;
                                        n6 = h;
                                        n7 = g;
                                        n8 = n4;
                                    }
                                    else if (b3.e) {
                                        n5 = n3;
                                        n6 = h;
                                        n7 = g;
                                        n8 = n4;
                                    }
                                    else {
                                        n5 = n3;
                                        n6 = h;
                                        n7 = g;
                                        n8 = n4;
                                        if (b3.b < 0.0f) {
                                            final int l = b3.d.i();
                                            int n9 = 0;
                                            while (true) {
                                                n5 = n3;
                                                n6 = h;
                                                n7 = g;
                                                n8 = n4;
                                                if (n9 >= l) {
                                                    break;
                                                }
                                                final SolverVariable b4 = b3.d.b(n9);
                                                final float d2 = b3.d.d(b4);
                                                float n10;
                                                int n11;
                                                int n12;
                                                int n13;
                                                if (d2 <= 0.0f) {
                                                    n10 = n3;
                                                    n11 = h;
                                                    n12 = g;
                                                    n13 = n4;
                                                }
                                                else {
                                                    final int n14 = 0;
                                                    int n15 = n4;
                                                    int n16 = n14;
                                                    while (true) {
                                                        n10 = n3;
                                                        n11 = h;
                                                        n12 = g;
                                                        n13 = n15;
                                                        if (n16 >= 9) {
                                                            break;
                                                        }
                                                        final float n17 = b4.l[n16] / d2;
                                                        int n18;
                                                        if ((n17 < n3 && n16 == n15) || n16 > (n18 = n15)) {
                                                            g = b4.g;
                                                            n18 = n16;
                                                            n3 = n17;
                                                            h = k;
                                                        }
                                                        ++n16;
                                                        n15 = n18;
                                                    }
                                                }
                                                ++n9;
                                                n3 = n10;
                                                h = n11;
                                                g = n12;
                                                n4 = n13;
                                            }
                                        }
                                    }
                                    ++k;
                                    n3 = n5;
                                    h = n6;
                                    g = n7;
                                    n4 = n8;
                                }
                                if (h != -1) {
                                    final b b5 = this.f[h];
                                    b5.a.h = -1;
                                    b5.f(((SolverVariable[])this.l.i)[g]);
                                    final SolverVariable a = b5.a;
                                    a.h = h;
                                    a.f(this, b5);
                                }
                                else {
                                    j = 1;
                                }
                                if (n2 > this.i / 2) {
                                    j = 1;
                                }
                                n = n2;
                            }
                        }
                        this.r((b)d);
                        this.i();
                        return;
                    }
                }
            }
            final boolean b2 = false;
            continue;
        }
    }
    
    public final void r(final b b) {
        for (int i = 0; i < this.i; ++i) {
            this.h[i] = false;
        }
        int n;
        int j = n = 0;
        while (j == 0) {
            final int n2 = n + 1;
            if (n2 >= this.i * 2) {
                return;
            }
            final SolverVariable a = b.a;
            if (a != null) {
                this.h[a.g] = true;
            }
            final SolverVariable a2 = ((a)b).a(this.h);
            if (a2 != null) {
                final boolean[] h = this.h;
                final int g = a2.g;
                if (h[g]) {
                    return;
                }
                h[g] = true;
            }
            if (a2 != null) {
                float n3 = Float.MAX_VALUE;
                int k = 0;
                int h2 = -1;
                while (k < this.j) {
                    final b b2 = this.f[k];
                    float n4;
                    int n5;
                    if (b2.a.n == SolverVariable.Type.UNRESTRICTED) {
                        n4 = n3;
                        n5 = h2;
                    }
                    else if (b2.e) {
                        n4 = n3;
                        n5 = h2;
                    }
                    else {
                        n4 = n3;
                        n5 = h2;
                        if (b2.d.a(a2)) {
                            final float d = b2.d.d(a2);
                            n4 = n3;
                            n5 = h2;
                            if (d < 0.0f) {
                                final float n6 = -b2.b / d;
                                n4 = n3;
                                n5 = h2;
                                if (n6 < n3) {
                                    n5 = k;
                                    n4 = n6;
                                }
                            }
                        }
                    }
                    ++k;
                    n3 = n4;
                    h2 = n5;
                }
                n = n2;
                if (h2 <= -1) {
                    continue;
                }
                final b b3 = this.f[h2];
                b3.a.h = -1;
                b3.f(a2);
                final SolverVariable a3 = b3.a;
                a3.h = h2;
                a3.f(this, b3);
                n = n2;
            }
            else {
                j = 1;
                n = n2;
            }
        }
    }
    
    public final void s() {
        for (int i = 0; i < this.j; ++i) {
            final b b = this.f[i];
            if (b != null) {
                ((f)this.l.g).c(b);
            }
            this.f[i] = null;
        }
    }
    
    public final void t() {
        int n = 0;
        z2.a l;
        while (true) {
            l = this.l;
            final SolverVariable[] array = (SolverVariable[])l.i;
            if (n >= array.length) {
                break;
            }
            final SolverVariable solverVariable = array[n];
            if (solverVariable != null) {
                solverVariable.c();
            }
            ++n;
        }
        final f f = (f)l.h;
        final SolverVariable[] m = this.m;
        final int n2 = this.n;
        f.getClass();
        int length;
        if ((length = n2) > m.length) {
            length = m.length;
        }
        for (final SolverVariable solverVariable2 : m) {
            final int a = f.a;
            final Object[] array2 = (Object[])f.b;
            if (a < array2.length) {
                array2[a] = solverVariable2;
                f.a = a + 1;
            }
        }
        this.n = 0;
        Arrays.fill((Object[])this.l.i, null);
        this.b = 0;
        final d c = this.c;
        c.h = 0;
        ((b)c).b = 0.0f;
        this.i = 1;
        for (int j = 0; j < this.j; ++j) {
            final b b = this.f[j];
        }
        this.s();
        this.j = 0;
        this.o = new b(this.l);
    }
    
    public interface a
    {
        SolverVariable a(final boolean[] p0);
    }
}
