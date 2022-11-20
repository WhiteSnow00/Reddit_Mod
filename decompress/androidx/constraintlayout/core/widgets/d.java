// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets;

import java.lang.ref.Reference;
import java.util.Arrays;
import java.io.PrintStream;
import java.util.Iterator;
import androidx.constraintlayout.core.SolverVariable;
import f3.j;
import java.util.ArrayList;
import f3.f;
import f3.b$b;
import f3.e;
import f3.b;
import f3.b$a;
import java.util.HashSet;
import java.lang.ref.WeakReference;
import e3.c;

public final class d extends c
{
    public int A0;
    public WeakReference<ConstraintAnchor> B0;
    public WeakReference<ConstraintAnchor> C0;
    public WeakReference<ConstraintAnchor> D0;
    public WeakReference<ConstraintAnchor> E0;
    public HashSet<ConstraintWidget> F0;
    public b$a G0;
    public b p0;
    public e q0;
    public int r0;
    public b$b s0;
    public androidx.constraintlayout.core.c t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public androidx.constraintlayout.core.widgets.c[] y0;
    public androidx.constraintlayout.core.widgets.c[] z0;
    
    public d() {
        this.p0 = new b(this);
        this.q0 = new e(this);
        this.s0 = null;
        this.t0 = new androidx.constraintlayout.core.c();
        this.w0 = 0;
        this.x0 = 0;
        this.y0 = new androidx.constraintlayout.core.widgets.c[4];
        this.z0 = new androidx.constraintlayout.core.widgets.c[4];
        this.A0 = 257;
        this.B0 = null;
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = new HashSet<ConstraintWidget>();
        this.G0 = new b$a();
    }
    
    public d(final int n) {
        super(0);
        this.p0 = new b(this);
        this.q0 = new e(this);
        this.s0 = null;
        this.t0 = new androidx.constraintlayout.core.c();
        this.w0 = 0;
        this.x0 = 0;
        this.y0 = new androidx.constraintlayout.core.widgets.c[4];
        this.z0 = new androidx.constraintlayout.core.widgets.c[4];
        this.A0 = 257;
        this.B0 = null;
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = new HashSet<ConstraintWidget>();
        this.G0 = new b$a();
    }
    
    public static void K(final ConstraintWidget constraintWidget, final b$b b$b, final b$a b$a) {
        if (b$b == null) {
            return;
        }
        if (constraintWidget.f0 != 8 && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.e) && !(constraintWidget instanceof a)) {
            final ConstraintWidget.DimensionBehaviour[] r = constraintWidget.R;
            b$a.a = r[0];
            boolean f = true;
            b$a.b = r[1];
            b$a.c = constraintWidget.l();
            b$a.d = constraintWidget.i();
            b$a.i = false;
            b$a.j = 0;
            final ConstraintWidget.DimensionBehaviour a = b$a.a;
            final ConstraintWidget.DimensionBehaviour match_CONSTRAINT = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            final boolean b = a == match_CONSTRAINT;
            final boolean b2 = b$a.b == match_CONSTRAINT;
            final boolean b3 = b && constraintWidget.V > 0.0f;
            final boolean b4 = b2 && constraintWidget.V > 0.0f;
            int n;
            if ((n = (b ? 1 : 0)) != 0) {
                n = (b ? 1 : 0);
                if (constraintWidget.o(0)) {
                    n = (b ? 1 : 0);
                    if (constraintWidget.s == 0) {
                        n = (b ? 1 : 0);
                        if (!b3) {
                            b$a.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            if (b2 && constraintWidget.t == 0) {
                                b$a.a = ConstraintWidget.DimensionBehaviour.FIXED;
                            }
                            n = 0;
                        }
                    }
                }
            }
            boolean b5;
            if (b5 = b2) {
                b5 = b2;
                if (constraintWidget.o(1)) {
                    b5 = b2;
                    if (constraintWidget.t == 0) {
                        b5 = b2;
                        if (!b4) {
                            b$a.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            if (n != 0 && constraintWidget.s == 0) {
                                b$a.b = ConstraintWidget.DimensionBehaviour.FIXED;
                            }
                            b5 = false;
                        }
                    }
                }
            }
            if (constraintWidget.u()) {
                b$a.a = ConstraintWidget.DimensionBehaviour.FIXED;
                n = 0;
            }
            if (constraintWidget.v()) {
                b$a.b = ConstraintWidget.DimensionBehaviour.FIXED;
                b5 = false;
            }
            if (b3) {
                if (constraintWidget.u[0] == 4) {
                    b$a.a = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                else if (!b5) {
                    final ConstraintWidget.DimensionBehaviour b6 = b$a.b;
                    final ConstraintWidget.DimensionBehaviour fixed = ConstraintWidget.DimensionBehaviour.FIXED;
                    int n2;
                    if (b6 == fixed) {
                        n2 = b$a.d;
                    }
                    else {
                        b$a.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        b$b.a(constraintWidget, b$a);
                        n2 = b$a.f;
                    }
                    b$a.a = fixed;
                    b$a.c = (int)(constraintWidget.V * n2);
                }
            }
            if (b4) {
                if (constraintWidget.u[1] == 4) {
                    b$a.b = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                else if (n == 0) {
                    final ConstraintWidget.DimensionBehaviour a2 = b$a.a;
                    final ConstraintWidget.DimensionBehaviour fixed2 = ConstraintWidget.DimensionBehaviour.FIXED;
                    int n3;
                    if (a2 == fixed2) {
                        n3 = b$a.c;
                    }
                    else {
                        b$a.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        b$b.a(constraintWidget, b$a);
                        n3 = b$a.e;
                    }
                    b$a.b = fixed2;
                    if (constraintWidget.W == -1) {
                        b$a.d = (int)(n3 / constraintWidget.V);
                    }
                    else {
                        b$a.d = (int)(constraintWidget.V * n3);
                    }
                }
            }
            b$b.a(constraintWidget, b$a);
            constraintWidget.E(b$a.e);
            constraintWidget.B(b$a.f);
            constraintWidget.F = b$a.h;
            if ((constraintWidget.Z = b$a.g) <= 0) {
                f = false;
            }
            constraintWidget.F = f;
            b$a.j = 0;
            return;
        }
        b$a.e = 0;
        b$a.f = 0;
    }
    
    public final void F(final boolean b, final boolean b2) {
        super.F(b, b2);
        for (int size = super.o0.size(), i = 0; i < size; ++i) {
            ((ConstraintWidget)super.o0.get(i)).F(b, b2);
        }
    }
    
    public final void H() {
        ((ConstraintWidget)this).X = 0;
        ((ConstraintWidget)this).Y = 0;
        final int size = super.o0.size();
        final int max = Math.max(0, ((ConstraintWidget)this).l());
        int n = Math.max(0, ((ConstraintWidget)this).i());
        final ConstraintWidget.DimensionBehaviour[] r = ((ConstraintWidget)this).R;
        final ConstraintWidget.DimensionBehaviour dimensionBehaviour = r[1];
        final ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = r[0];
        if (this.r0 == 0 && (this.A0 & 0x1) == 0x1) {
            final b$b s0 = this.s0;
            ((ConstraintWidget)this).x();
            final ArrayList o0 = super.o0;
            final int size2 = o0.size();
            for (int i = 0; i < size2; ++i) {
                ((ConstraintWidget)o0.get(i)).x();
            }
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED) {
                ((ConstraintWidget)this).z(0, ((ConstraintWidget)this).l());
            }
            else {
                ((ConstraintWidget)this).G.i(0);
                ((ConstraintWidget)this).X = 0;
            }
            int j = 0;
            int n3;
            int n2 = n3 = 0;
            while (j < size2) {
                final ConstraintWidget constraintWidget = o0.get(j);
                int n4;
                int n5;
                if (constraintWidget instanceof androidx.constraintlayout.core.widgets.e) {
                    final androidx.constraintlayout.core.widgets.e e = (androidx.constraintlayout.core.widgets.e)constraintWidget;
                    n4 = n2;
                    n5 = n3;
                    if (e.s0 == 1) {
                        final int p0 = e.p0;
                        if (p0 != -1) {
                            e.H(p0);
                        }
                        else if (e.q0 != -1 && ((ConstraintWidget)this).u()) {
                            e.H(((ConstraintWidget)this).l() - e.q0);
                        }
                        else if (((ConstraintWidget)this).u()) {
                            e.H((int)(e.o0 * ((ConstraintWidget)this).l() + 0.5f));
                        }
                        n4 = 1;
                        n5 = n3;
                    }
                }
                else {
                    n4 = n2;
                    n5 = n3;
                    if (constraintWidget instanceof a) {
                        ((a)constraintWidget).getClass();
                        n5 = 1;
                        n4 = n2;
                    }
                }
                ++j;
                n2 = n4;
                n3 = n5;
            }
            if (n2 != 0) {
                for (int k = 0; k < size2; ++k) {
                    final ConstraintWidget constraintWidget2 = o0.get(k);
                    if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.e) {
                        final androidx.constraintlayout.core.widgets.e e2 = (androidx.constraintlayout.core.widgets.e)constraintWidget2;
                        if (e2.s0 == 1) {
                            f.b(0, (ConstraintWidget)e2, s0);
                        }
                    }
                }
            }
            f.b(0, (ConstraintWidget)this, s0);
            if (n3 != 0) {
                for (int l = 0; l < size2; ++l) {
                    final ConstraintWidget constraintWidget3 = o0.get(l);
                    if (constraintWidget3 instanceof a) {
                        final a a = (a)constraintWidget3;
                        a.getClass();
                        if (a.I()) {
                            f.b(1, (ConstraintWidget)a, s0);
                        }
                    }
                }
            }
            if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
                ((ConstraintWidget)this).A(0, ((ConstraintWidget)this).i());
            }
            else {
                ((ConstraintWidget)this).H.i(0);
                ((ConstraintWidget)this).Y = 0;
            }
            int n6 = 0;
            int n7 = 0;
            while (n6 < size2) {
                final ConstraintWidget constraintWidget4 = o0.get(n6);
                int n8;
                if (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.e) {
                    final androidx.constraintlayout.core.widgets.e e3 = (androidx.constraintlayout.core.widgets.e)constraintWidget4;
                    if (e3.s0 == 0) {
                        final int p2 = e3.p0;
                        if (p2 != -1) {
                            e3.H(p2);
                        }
                        else if (e3.q0 != -1 && ((ConstraintWidget)this).v()) {
                            e3.H(((ConstraintWidget)this).i() - e3.q0);
                        }
                        else if (((ConstraintWidget)this).v()) {
                            e3.H((int)(e3.o0 * ((ConstraintWidget)this).i() + 0.5f));
                        }
                        n8 = 1;
                    }
                    else {
                        n8 = n7;
                    }
                }
                else {
                    n8 = n7;
                    if (constraintWidget4 instanceof a) {
                        ((a)constraintWidget4).getClass();
                        n8 = n7;
                    }
                }
                ++n6;
                n7 = n8;
            }
            if (n7 != 0) {
                for (int n9 = 0; n9 < size2; ++n9) {
                    final ConstraintWidget constraintWidget5 = o0.get(n9);
                    if (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.e) {
                        final androidx.constraintlayout.core.widgets.e e4 = (androidx.constraintlayout.core.widgets.e)constraintWidget5;
                        if (e4.s0 == 0) {
                            f.g(1, (ConstraintWidget)e4, s0);
                        }
                    }
                }
            }
            f.g(0, (ConstraintWidget)this, s0);
            for (int n10 = 0; n10 < size2; ++n10) {
                final ConstraintWidget constraintWidget6 = o0.get(n10);
                if (constraintWidget6.t() && f.a(constraintWidget6)) {
                    K(constraintWidget6, s0, f.a);
                    if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.e) {
                        if (((androidx.constraintlayout.core.widgets.e)constraintWidget6).s0 == 0) {
                            f.g(0, constraintWidget6, s0);
                        }
                        else {
                            f.b(0, constraintWidget6, s0);
                        }
                    }
                    else {
                        f.b(0, constraintWidget6, s0);
                        f.g(0, constraintWidget6, s0);
                    }
                }
            }
            for (int n11 = 0; n11 < size; ++n11) {
                final ConstraintWidget constraintWidget7 = super.o0.get(n11);
                if (constraintWidget7.t() && !(constraintWidget7 instanceof androidx.constraintlayout.core.widgets.e) && !(constraintWidget7 instanceof a) && !(constraintWidget7 instanceof g)) {
                    final ConstraintWidget.DimensionBehaviour h = constraintWidget7.h(0);
                    final ConstraintWidget.DimensionBehaviour h2 = constraintWidget7.h(1);
                    final ConstraintWidget.DimensionBehaviour match_CONSTRAINT = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (h != match_CONSTRAINT || constraintWidget7.s == 1 || h2 != match_CONSTRAINT || constraintWidget7.t == 1) {
                        K(constraintWidget7, this.s0, new b$a());
                    }
                }
            }
        }
        int n17 = 0;
        int n18 = 0;
        int n19 = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = null;
        int n20 = 0;
        Label_3163: {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = null;
            int n16 = 0;
            int m = 0;
            Label_3144: {
                if (size > 2) {
                    final ConstraintWidget.DimensionBehaviour wrap_CONTENT = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if ((dimensionBehaviour2 == wrap_CONTENT || dimensionBehaviour == wrap_CONTENT) && (this.A0 & 0x400) == 0x400) {
                        final b$b s2 = this.s0;
                        final ArrayList o2 = super.o0;
                        final int size3 = o2.size();
                        int n12 = 0;
                        while (true) {
                            while (true) {
                                while (n12 < size3) {
                                    final ConstraintWidget constraintWidget8 = o2.get(n12);
                                    final ConstraintWidget.DimensionBehaviour[] r2 = ((ConstraintWidget)this).R;
                                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = r2[0];
                                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = r2[1];
                                    final ConstraintWidget.DimensionBehaviour[] r3 = constraintWidget8.R;
                                    if (!f3.g.b(dimensionBehaviour3, dimensionBehaviour4, r3[0], r3[1])) {
                                        dimensionBehaviour5 = dimensionBehaviour;
                                        final int n13 = size;
                                        final int n14 = n;
                                        final int n15 = max;
                                        final boolean b = false;
                                        n16 = n13;
                                        n = n14;
                                        m = n15;
                                        if (b) {
                                            final ConstraintWidget.DimensionBehaviour wrap_CONTENT2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                            if (dimensionBehaviour2 == wrap_CONTENT2) {
                                                if (m < ((ConstraintWidget)this).l() && m > 0) {
                                                    ((ConstraintWidget)this).E(m);
                                                }
                                                else {
                                                    m = ((ConstraintWidget)this).l();
                                                }
                                            }
                                            if (dimensionBehaviour5 == wrap_CONTENT2) {
                                                if (n < ((ConstraintWidget)this).i() && n > 0) {
                                                    ((ConstraintWidget)this).B(n);
                                                }
                                                else {
                                                    n = ((ConstraintWidget)this).i();
                                                }
                                            }
                                            n17 = n;
                                            n18 = 1;
                                            n19 = m;
                                            dimensionBehaviour6 = dimensionBehaviour5;
                                            n20 = n16;
                                            break Label_3163;
                                        }
                                        break Label_3144;
                                    }
                                    else {
                                        ++n12;
                                    }
                                }
                                final int n21 = 0;
                                ArrayList list = null;
                                ArrayList list2 = null;
                                ArrayList list3 = null;
                                ArrayList list4 = null;
                                ArrayList<a> list5 = null;
                                ArrayList<a> list6 = null;
                                final int n22 = size;
                                ArrayList list7;
                                ArrayList list8;
                                ArrayList list11;
                                ArrayList list12;
                                ArrayList<a> list14;
                                ArrayList<a> list16;
                                for (int n23 = n21; n23 < size3; ++n23, list = list7, list2 = list11, list3 = list8, list4 = list12, list5 = list14, list6 = list16) {
                                    final ConstraintWidget constraintWidget9 = o2.get(n23);
                                    final ConstraintWidget.DimensionBehaviour[] r4 = ((ConstraintWidget)this).R;
                                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = r4[0];
                                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = r4[1];
                                    final ConstraintWidget.DimensionBehaviour[] r5 = constraintWidget9.R;
                                    if (!f3.g.b(dimensionBehaviour7, dimensionBehaviour8, r5[0], r5[1])) {
                                        K(constraintWidget9, s2, this.G0);
                                    }
                                    final boolean b2 = constraintWidget9 instanceof androidx.constraintlayout.core.widgets.e;
                                    list7 = list;
                                    list8 = list3;
                                    if (b2) {
                                        final androidx.constraintlayout.core.widgets.e e5 = (androidx.constraintlayout.core.widgets.e)constraintWidget9;
                                        ArrayList list9 = list3;
                                        if (e5.s0 == 0) {
                                            if ((list9 = list3) == null) {
                                                list9 = new ArrayList();
                                            }
                                            list9.add(e5);
                                        }
                                        list7 = list;
                                        list8 = list9;
                                        if (e5.s0 == 1) {
                                            ArrayList list10;
                                            if ((list10 = list) == null) {
                                                list10 = new ArrayList();
                                            }
                                            list10.add(e5);
                                            list8 = list9;
                                            list7 = list10;
                                        }
                                    }
                                    list11 = list2;
                                    list12 = list4;
                                    if (constraintWidget9 instanceof e3.b) {
                                        if (constraintWidget9 instanceof a) {
                                            final a a2 = (a)constraintWidget9;
                                            if ((list11 = list2) == null) {
                                                list11 = new ArrayList();
                                            }
                                            list11.add(a2);
                                            list12 = list4;
                                        }
                                        else {
                                            final e3.b b3 = (e3.b)constraintWidget9;
                                            if ((list11 = list2) == null) {
                                                list11 = new ArrayList();
                                            }
                                            list11.add(b3);
                                            ArrayList list13;
                                            if ((list13 = list4) == null) {
                                                list13 = new ArrayList();
                                            }
                                            list13.add(b3);
                                            list12 = list13;
                                        }
                                    }
                                    list14 = list5;
                                    if (constraintWidget9.G.f == null) {
                                        list14 = list5;
                                        if (constraintWidget9.I.f == null) {
                                            list14 = list5;
                                            if (!b2) {
                                                list14 = list5;
                                                if (!(constraintWidget9 instanceof a)) {
                                                    ArrayList<a> list15;
                                                    if (list5 == null) {
                                                        list15 = new ArrayList<a>();
                                                    }
                                                    else {
                                                        list15 = list5;
                                                    }
                                                    list15.add((a)constraintWidget9);
                                                    list14 = list15;
                                                }
                                            }
                                        }
                                    }
                                    list16 = list6;
                                    if (constraintWidget9.H.f == null) {
                                        list16 = list6;
                                        if (constraintWidget9.J.f == null) {
                                            list16 = list6;
                                            if (constraintWidget9.K.f == null) {
                                                list16 = list6;
                                                if (!b2) {
                                                    list16 = list6;
                                                    if (!(constraintWidget9 instanceof a)) {
                                                        ArrayList<a> list17;
                                                        if (list6 == null) {
                                                            list17 = new ArrayList<a>();
                                                        }
                                                        else {
                                                            list17 = list6;
                                                        }
                                                        list17.add((a)constraintWidget9);
                                                        list16 = list17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                m = max;
                                n16 = n22;
                                final ArrayList list18 = new ArrayList();
                                if (list != null) {
                                    final Iterator iterator = list.iterator();
                                    while (iterator.hasNext()) {
                                        f3.g.a((ConstraintWidget)iterator.next(), 0, list18, (j)null);
                                    }
                                }
                                if (list2 != null) {
                                    for (final e3.b b4 : list2) {
                                        final j a3 = f3.g.a((ConstraintWidget)b4, 0, list18, (j)null);
                                        b4.H(0, a3, list18);
                                        a3.b(list18);
                                    }
                                }
                                final HashSet<ConstraintAnchor> a4 = ((ConstraintWidget)this).g(ConstraintAnchor.Type.LEFT).a;
                                if (a4 != null) {
                                    final Iterator<ConstraintAnchor> iterator3 = a4.iterator();
                                    while (iterator3.hasNext()) {
                                        f3.g.a(iterator3.next().d, 0, list18, (j)null);
                                    }
                                }
                                final HashSet<ConstraintAnchor> a5 = ((ConstraintWidget)this).g(ConstraintAnchor.Type.RIGHT).a;
                                if (a5 != null) {
                                    final Iterator<ConstraintAnchor> iterator4 = a5.iterator();
                                    while (iterator4.hasNext()) {
                                        f3.g.a(iterator4.next().d, 0, list18, (j)null);
                                    }
                                }
                                final HashSet<ConstraintAnchor> a6 = ((ConstraintWidget)this).g(ConstraintAnchor.Type.CENTER).a;
                                if (a6 != null) {
                                    final Iterator<ConstraintAnchor> iterator5 = a6.iterator();
                                    while (iterator5.hasNext()) {
                                        f3.g.a(iterator5.next().d, 0, list18, (j)null);
                                    }
                                }
                                if (list5 != null) {
                                    final Iterator<a> iterator6 = list5.iterator();
                                    while (iterator6.hasNext()) {
                                        f3.g.a((ConstraintWidget)iterator6.next(), 0, list18, (j)null);
                                    }
                                }
                                if (list3 != null) {
                                    final Iterator iterator7 = list3.iterator();
                                    while (iterator7.hasNext()) {
                                        f3.g.a((ConstraintWidget)iterator7.next(), 1, list18, (j)null);
                                    }
                                }
                                if (list4 != null) {
                                    for (final e3.b b5 : list4) {
                                        final j a7 = f3.g.a((ConstraintWidget)b5, 1, list18, (j)null);
                                        b5.H(1, a7, list18);
                                        a7.b(list18);
                                    }
                                }
                                final HashSet<ConstraintAnchor> a8 = ((ConstraintWidget)this).g(ConstraintAnchor.Type.TOP).a;
                                if (a8 != null) {
                                    final Iterator<ConstraintAnchor> iterator9 = a8.iterator();
                                    while (iterator9.hasNext()) {
                                        f3.g.a(iterator9.next().d, 1, list18, (j)null);
                                    }
                                }
                                final HashSet<ConstraintAnchor> a9 = ((ConstraintWidget)this).g(ConstraintAnchor.Type.BASELINE).a;
                                if (a9 != null) {
                                    final Iterator<ConstraintAnchor> iterator10 = a9.iterator();
                                    while (iterator10.hasNext()) {
                                        f3.g.a(iterator10.next().d, 1, list18, (j)null);
                                    }
                                }
                                final HashSet<ConstraintAnchor> a10 = ((ConstraintWidget)this).g(ConstraintAnchor.Type.BOTTOM).a;
                                if (a10 != null) {
                                    final Iterator<ConstraintAnchor> iterator11 = a10.iterator();
                                    while (iterator11.hasNext()) {
                                        f3.g.a(iterator11.next().d, 1, list18, (j)null);
                                    }
                                }
                                final HashSet<ConstraintAnchor> a11 = ((ConstraintWidget)this).g(ConstraintAnchor.Type.CENTER).a;
                                if (a11 != null) {
                                    final Iterator<ConstraintAnchor> iterator12 = a11.iterator();
                                    while (iterator12.hasNext()) {
                                        f3.g.a(iterator12.next().d, 1, list18, (j)null);
                                    }
                                }
                                if (list6 != null) {
                                    final Iterator<a> iterator13 = list6.iterator();
                                    while (iterator13.hasNext()) {
                                        f3.g.a((ConstraintWidget)iterator13.next(), 1, list18, (j)null);
                                    }
                                }
                            Label_2711:
                                for (int n24 = 0; n24 < size3; ++n24) {
                                    final ConstraintWidget constraintWidget10 = o2.get(n24);
                                    final ConstraintWidget.DimensionBehaviour[] r6 = constraintWidget10.R;
                                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = r6[0];
                                    final ConstraintWidget.DimensionBehaviour match_CONSTRAINT2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                                    if (dimensionBehaviour9 == match_CONSTRAINT2 && r6[1] == match_CONSTRAINT2) {
                                        final int m2 = constraintWidget10.m0;
                                        while (true) {
                                            for (int size4 = list18.size(), n25 = 0; n25 < size4; ++n25) {
                                                final j j2 = list18.get(n25);
                                                if (m2 == j2.b) {
                                                    final int n26 = constraintWidget10.n0;
                                                    final int size5 = list18.size();
                                                    int n27 = 0;
                                                    while (true) {
                                                        while (n27 < size5) {
                                                            final j j3 = list18.get(n27);
                                                            if (n26 == j3.b) {
                                                                if (j2 != null && j3 != null) {
                                                                    j2.d(0, j3);
                                                                    j3.c = 2;
                                                                    list18.remove(j2);
                                                                }
                                                                continue Label_2711;
                                                            }
                                                            else {
                                                                ++n27;
                                                            }
                                                        }
                                                        final j j3 = null;
                                                        continue;
                                                    }
                                                }
                                            }
                                            final j j2 = null;
                                            continue;
                                        }
                                    }
                                }
                                if (list18.size() <= 1) {
                                    final int n13 = n16;
                                    final int n14 = n;
                                    dimensionBehaviour5 = dimensionBehaviour;
                                    final int n15 = m;
                                    continue;
                                }
                                j j6 = null;
                                Label_2859: {
                                    if (((ConstraintWidget)this).R[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                        final Iterator iterator14 = list18.iterator();
                                        int n28 = 0;
                                        j j4 = null;
                                        while (iterator14.hasNext()) {
                                            final j j5 = (j)iterator14.next();
                                            if (j5.c == 1) {
                                                continue;
                                            }
                                            final int c = j5.c(this.t0, 0);
                                            if (c <= n28) {
                                                continue;
                                            }
                                            j4 = j5;
                                            n28 = c;
                                        }
                                        if (j4 != null) {
                                            ((ConstraintWidget)this).C(ConstraintWidget.DimensionBehaviour.FIXED);
                                            ((ConstraintWidget)this).E(n28);
                                            j6 = j4;
                                            break Label_2859;
                                        }
                                    }
                                    j6 = null;
                                }
                                j j9 = null;
                                Label_2975: {
                                    if (((ConstraintWidget)this).R[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                        final Iterator iterator15 = list18.iterator();
                                        int n29 = 0;
                                        j j7 = null;
                                        while (iterator15.hasNext()) {
                                            final j j8 = (j)iterator15.next();
                                            if (j8.c == 0) {
                                                continue;
                                            }
                                            final int c2 = j8.c(this.t0, 1);
                                            if (c2 <= n29) {
                                                continue;
                                            }
                                            j7 = j8;
                                            n29 = c2;
                                        }
                                        if (j7 != null) {
                                            ((ConstraintWidget)this).D(ConstraintWidget.DimensionBehaviour.FIXED);
                                            ((ConstraintWidget)this).B(n29);
                                            j9 = j7;
                                            break Label_2975;
                                        }
                                    }
                                    j9 = null;
                                }
                                if (j6 == null) {
                                    final int n13 = n16;
                                    final int n14 = n;
                                    dimensionBehaviour5 = dimensionBehaviour;
                                    final int n15 = m;
                                    if (j9 == null) {
                                        continue;
                                    }
                                }
                                break;
                            }
                            final boolean b = true;
                            dimensionBehaviour5 = dimensionBehaviour;
                            continue;
                        }
                    }
                }
                final int n30 = size;
                m = max;
                dimensionBehaviour5 = dimensionBehaviour;
                n16 = n30;
            }
            final int n31 = 0;
            n20 = n16;
            n17 = n;
            dimensionBehaviour6 = dimensionBehaviour5;
            n19 = m;
            n18 = n31;
        }
        final boolean b6 = this.L(64) || this.L(128);
        final androidx.constraintlayout.core.c t0 = this.t0;
        t0.getClass();
        t0.g = false;
        if (this.A0 != 0 && b6) {
            t0.g = true;
        }
        final ArrayList o3 = super.o0;
        Object o4 = ((ConstraintWidget)this).R;
        final ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = o4[0];
        final ConstraintWidget.DimensionBehaviour wrap_CONTENT3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        final boolean b7 = dimensionBehaviour10 == wrap_CONTENT3 || o4[1] == wrap_CONTENT3;
        this.w0 = 0;
        this.x0 = 0;
        for (int n32 = 0; n32 < n20; ++n32) {
            o4 = super.o0.get(n32);
            if (o4 instanceof c) {
                ((c)o4).H();
            }
        }
        final boolean l2 = this.L(64);
        int n33 = n18;
        int n34 = 1;
        int n35 = 0;
        while (n34 != 0) {
            final int n36 = n35 + 1;
            Label_3800: {
                try {
                    this.t0.t();
                    this.w0 = 0;
                    this.x0 = 0;
                    ((ConstraintWidget)this).f(this.t0);
                    for (int n37 = 0; n37 < n20; ++n37) {
                        ((ConstraintWidget)super.o0.get(n37)).f(this.t0);
                    }
                    this.J(this.t0);
                    Label_3733: {
                        while (true) {
                            try {
                                final WeakReference<ConstraintAnchor> b8 = this.B0;
                                Label_3500: {
                                    if (b8 != null) {
                                        try {
                                            if (b8.get() != null) {
                                                this.t0.f(this.t0.k((Object)this.B0.get()), this.t0.k((Object)((ConstraintWidget)this).H), 0, 5);
                                                this.B0 = null;
                                            }
                                        }
                                        catch (final Exception o4) {
                                            break Label_3649;
                                        }
                                        break Label_3500;
                                        break Label_3733;
                                    }
                                }
                                final WeakReference<ConstraintAnchor> d0 = this.D0;
                                if (d0 != null && d0.get() != null) {
                                    this.t0.f(this.t0.k((Object)((ConstraintWidget)this).J), this.t0.k((Object)this.D0.get()), 0, 5);
                                    this.D0 = null;
                                }
                                final WeakReference<ConstraintAnchor> c3 = this.C0;
                                if (c3 != null && c3.get() != null) {
                                    this.t0.f(this.t0.k((Object)this.C0.get()), this.t0.k((Object)((ConstraintWidget)this).G), 0, 5);
                                    this.C0 = null;
                                }
                                o4 = this.E0;
                                if (o4 != null && ((Reference)o4).get() != null) {
                                    final ConstraintAnchor constraintAnchor = this.E0.get();
                                    o4 = this.t0.k((Object)((ConstraintWidget)this).I);
                                    this.t0.f((SolverVariable)o4, this.t0.k((Object)constraintAnchor), 0, 5);
                                    final d d2 = this;
                                    final WeakReference<ConstraintAnchor> weakReference = null;
                                    d2.E0 = weakReference;
                                    break Label_3733;
                                }
                                break Label_3733;
                            }
                            catch (final Exception o4) {
                                continue;
                            }
                            break;
                        }
                        try {
                            final d d2 = this;
                            final WeakReference<ConstraintAnchor> weakReference = null;
                            d2.E0 = weakReference;
                            this.t0.p();
                            n34 = 1;
                            break Label_3800;
                        }
                        catch (final Exception ex) {}
                    }
                    n34 = 1;
                }
                catch (final Exception ex2) {}
                ((Throwable)o4).printStackTrace();
                final PrintStream out = System.out;
                final StringBuilder sb = new StringBuilder();
                sb.append("EXCEPTION : ");
                sb.append(o4);
                out.println(sb.toString());
            }
            boolean b9;
            if (n34 != 0) {
                o4 = this.t0;
                androidx.constraintlayout.core.widgets.f.a[2] = false;
                final boolean l3 = this.L(64);
                ((ConstraintWidget)this).G((androidx.constraintlayout.core.c)o4, l3);
                final int size6 = super.o0.size();
                int n38 = 0;
                b9 = false;
                while (n38 < size6) {
                    final ConstraintWidget constraintWidget11 = super.o0.get(n38);
                    constraintWidget11.G((androidx.constraintlayout.core.c)o4, l3);
                    if (constraintWidget11.i != -1 || constraintWidget11.j != -1) {
                        b9 = true;
                    }
                    ++n38;
                }
            }
            else {
                ((ConstraintWidget)this).G(this.t0, l2);
                for (int n39 = 0; n39 < n20; ++n39) {
                    ((ConstraintWidget)super.o0.get(n39)).G(this.t0, l2);
                }
                b9 = false;
            }
            int n40 = n33;
            int n41 = b9 ? 1 : 0;
            if (b7) {
                n40 = n33;
                n41 = (b9 ? 1 : 0);
                if (n36 < 8) {
                    n40 = n33;
                    n41 = (b9 ? 1 : 0);
                    if (androidx.constraintlayout.core.widgets.f.a[2]) {
                        int n42 = 0;
                        int max2 = 0;
                        int max3 = 0;
                        while (n42 < n20) {
                            final ConstraintWidget constraintWidget12 = super.o0.get(n42);
                            max3 = Math.max(max3, constraintWidget12.l() + constraintWidget12.X);
                            max2 = Math.max(max2, constraintWidget12.i() + constraintWidget12.Y);
                            ++n42;
                        }
                        final int max4 = Math.max(((ConstraintWidget)this).a0, max3);
                        final int max5 = Math.max(((ConstraintWidget)this).b0, max2);
                        o4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        int n43 = n33;
                        int n44 = b9 ? 1 : 0;
                        if (dimensionBehaviour2 == o4) {
                            n43 = n33;
                            n44 = (b9 ? 1 : 0);
                            if (((ConstraintWidget)this).l() < max4) {
                                ((ConstraintWidget)this).E(max4);
                                ((ConstraintWidget)this).R[0] = (ConstraintWidget.DimensionBehaviour)o4;
                                n43 = 1;
                                n44 = 1;
                            }
                        }
                        n40 = n43;
                        n41 = n44;
                        if (dimensionBehaviour6 == o4) {
                            n40 = n43;
                            n41 = n44;
                            if (((ConstraintWidget)this).i() < max5) {
                                ((ConstraintWidget)this).B(max5);
                                ((ConstraintWidget)this).R[1] = (ConstraintWidget.DimensionBehaviour)o4;
                                n40 = 1;
                                n41 = 1;
                            }
                        }
                    }
                }
            }
            final int max6 = Math.max(((ConstraintWidget)this).a0, ((ConstraintWidget)this).l());
            int n45 = n41;
            if (max6 > ((ConstraintWidget)this).l()) {
                ((ConstraintWidget)this).E(max6);
                ((ConstraintWidget)this).R[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                n40 = 1;
                n45 = 1;
            }
            final int max7 = Math.max(((ConstraintWidget)this).b0, ((ConstraintWidget)this).i());
            int n46;
            if (max7 > ((ConstraintWidget)this).i()) {
                ((ConstraintWidget)this).B(max7);
                ((ConstraintWidget)this).R[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                n46 = 1;
                n45 = 1;
            }
            else {
                n46 = n40;
            }
            int n47 = n46;
            int n48 = n45;
            Label_4411: {
                if (n46 == 0) {
                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ((ConstraintWidget)this).R[0];
                    o4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    int n49;
                    int n50;
                    if (dimensionBehaviour11 == o4 && n19 > 0 && ((ConstraintWidget)this).l() > n19) {
                        ((ConstraintWidget)this).R[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                        ((ConstraintWidget)this).E(n19);
                        n49 = 1;
                        n50 = 1;
                    }
                    else {
                        final int n51 = n46;
                        n50 = n45;
                        n49 = n51;
                    }
                    if (((ConstraintWidget)this).R[1] == o4 && n17 > 0 && ((ConstraintWidget)this).i() > n17) {
                        ((ConstraintWidget)this).R[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                        ((ConstraintWidget)this).B(n17);
                        n33 = 1;
                        n48 = 1;
                        break Label_4411;
                    }
                    n48 = n50;
                    n47 = n49;
                }
                n33 = n47;
            }
            if (n36 > 8) {
                n34 = 0;
            }
            else {
                n34 = n48;
            }
            n35 = n36;
        }
        super.o0 = o3;
        if (n33 != 0) {
            final ConstraintWidget.DimensionBehaviour[] r7 = ((ConstraintWidget)this).R;
            r7[0] = dimensionBehaviour2;
            r7[1] = dimensionBehaviour6;
        }
        this.y(this.t0.l);
    }
    
    public final void I(int n, final ConstraintWidget constraintWidget) {
        if (n == 0) {
            n = this.w0;
            final androidx.constraintlayout.core.widgets.c[] z0 = this.z0;
            if (n + 1 >= z0.length) {
                this.z0 = Arrays.copyOf(z0, z0.length * 2);
            }
            final androidx.constraintlayout.core.widgets.c[] z2 = this.z0;
            n = this.w0;
            z2[n] = new androidx.constraintlayout.core.widgets.c(constraintWidget, 0, false);
            this.w0 = n + 1;
        }
        else if (n == 1) {
            n = this.x0;
            final androidx.constraintlayout.core.widgets.c[] y0 = this.y0;
            if (n + 1 >= y0.length) {
                this.y0 = Arrays.copyOf(y0, y0.length * 2);
            }
            final androidx.constraintlayout.core.widgets.c[] y2 = this.y0;
            n = this.x0;
            y2[n] = new androidx.constraintlayout.core.widgets.c(constraintWidget, 1, false);
            this.x0 = n + 1;
        }
    }
    
    public final void J(final androidx.constraintlayout.core.c c) {
        final boolean l = this.L(64);
        ((ConstraintWidget)this).c(c, l);
        final int size = super.o0.size();
        int i = 0;
        boolean b = false;
        while (i < size) {
            final ConstraintWidget constraintWidget = super.o0.get(i);
            final boolean[] q = constraintWidget.Q;
            q[1] = (q[0] = false);
            if (constraintWidget instanceof a) {
                b = true;
            }
            ++i;
        }
        if (b) {
            for (int j = 0; j < size; ++j) {
                final ConstraintWidget constraintWidget2 = super.o0.get(j);
                if (constraintWidget2 instanceof a) {
                    final a a = (a)constraintWidget2;
                    for (int k = 0; k < a.p0; ++k) {
                        final ConstraintWidget constraintWidget3 = a.o0[k];
                        if (a.q0 || constraintWidget3.d()) {
                            constraintWidget3.Q[0] = true;
                        }
                    }
                }
            }
        }
        this.F0.clear();
        for (int n = 0; n < size; ++n) {
            final ConstraintWidget constraintWidget4 = super.o0.get(n);
            constraintWidget4.getClass();
            if (constraintWidget4 instanceof g || constraintWidget4 instanceof androidx.constraintlayout.core.widgets.e) {
                if (constraintWidget4 instanceof g) {
                    this.F0.add(constraintWidget4);
                }
                else {
                    constraintWidget4.c(c, l);
                }
            }
        }
        while (this.F0.size() > 0) {
            final int size2 = this.F0.size();
        Label_0397:
            for (final g g : this.F0) {
                final HashSet<ConstraintWidget> f0 = this.F0;
                int n2 = 0;
                while (true) {
                    while (n2 < g.p0) {
                        if (f0.contains(g.o0[n2])) {
                            final boolean b2 = true;
                            if (b2) {
                                ((ConstraintWidget)g).c(c, l);
                                this.F0.remove(g);
                                break Label_0397;
                            }
                            continue Label_0397;
                        }
                        else {
                            ++n2;
                        }
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
            if (size2 == this.F0.size()) {
                final Iterator<ConstraintWidget> iterator2 = this.F0.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().c(c, l);
                }
                this.F0.clear();
            }
        }
        if (androidx.constraintlayout.core.c.p) {
            final HashSet<ConstraintWidget> set = new HashSet<ConstraintWidget>();
            for (int n3 = 0; n3 < size; ++n3) {
                final ConstraintWidget constraintWidget5 = super.o0.get(n3);
                constraintWidget5.getClass();
                if (!(constraintWidget5 instanceof g) && !(constraintWidget5 instanceof androidx.constraintlayout.core.widgets.e)) {
                    set.add(constraintWidget5);
                }
            }
            int n4;
            if (((ConstraintWidget)this).R[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                n4 = 0;
            }
            else {
                n4 = 1;
            }
            ((ConstraintWidget)this).b(this, c, set, n4, false);
            for (final ConstraintWidget constraintWidget6 : set) {
                androidx.constraintlayout.core.widgets.f.a(this, c, constraintWidget6);
                constraintWidget6.c(c, l);
            }
        }
        else {
            for (int n5 = 0; n5 < size; ++n5) {
                final ConstraintWidget constraintWidget7 = super.o0.get(n5);
                if (constraintWidget7 instanceof d) {
                    final ConstraintWidget.DimensionBehaviour[] r = constraintWidget7.R;
                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour = r[0];
                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = r[1];
                    final ConstraintWidget.DimensionBehaviour wrap_CONTENT = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == wrap_CONTENT) {
                        constraintWidget7.C(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == wrap_CONTENT) {
                        constraintWidget7.D(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget7.c(c, l);
                    if (dimensionBehaviour == wrap_CONTENT) {
                        constraintWidget7.C(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == wrap_CONTENT) {
                        constraintWidget7.D(dimensionBehaviour2);
                    }
                }
                else {
                    androidx.constraintlayout.core.widgets.f.a(this, c, constraintWidget7);
                    if (!(constraintWidget7 instanceof g) && !(constraintWidget7 instanceof androidx.constraintlayout.core.widgets.e)) {
                        constraintWidget7.c(c, l);
                    }
                }
            }
        }
        if (this.w0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(this, c, null, 0);
        }
        if (this.x0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(this, c, null, 1);
        }
    }
    
    public final boolean L(final int n) {
        return (this.A0 & n) == n;
    }
    
    public final void w() {
        this.t0.t();
        this.u0 = 0;
        this.v0 = 0;
        super.w();
    }
}
