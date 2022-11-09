// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import f3.b$b;
import java.util.Iterator;
import java.util.HashMap;
import androidx.compose.ui.unit.LayoutDirection;
import zg2.l;
import u2.i;
import c2.e0;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.Collection;
import java.util.HashSet;
import f3.h;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.analyzer.d;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.state.State;
import java.util.Map;
import c3.c;
import u2.a;
import ah2.f;
import c2.t;
import c2.r;
import java.util.List;
import c2.u;
import z0.h0;
import c2.s;

public final class ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1 implements s
{
    public final /* synthetic */ Measurer a;
    public final /* synthetic */ ConstraintSetForInlineDsl b;
    public final /* synthetic */ int c;
    public final /* synthetic */ h0<Boolean> d;
    
    public ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1(final Measurer a, final ConstraintSetForInlineDsl b, final h0 d) {
        this.a = a;
        this.b = b;
        this.c = 257;
        this.d = d;
    }
    
    @Override
    public final t c(final u u, final List<? extends r> list, long c) {
        f.f((Object)u, "$this$MeasurePolicy");
        f.f((Object)list, "measurables");
        final Measurer a = this.a;
        final LayoutDirection layoutDirection = u.getLayoutDirection();
        final ConstraintSetForInlineDsl b = this.b;
        final int c2 = this.c;
        a.getClass();
        f.f((Object)layoutDirection, "layoutDirection");
        f.f((Object)b, "constraintSet");
        a.e = u;
        a.f = u;
        final y2.g c3 = a.c();
        c3.a a2;
        if (u2.a.f(c)) {
            final int h = u2.a.h(c);
            a2 = new c3.a(c3.a.g);
            a2.e = null;
            a2.d = h;
        }
        else {
            final c3.a a3 = new c3.a(c3.a.h);
            final int j = u2.a.j(c);
            a2 = a3;
            if (j >= 0) {
                a3.a = j;
                a2 = a3;
            }
        }
        c3.d.A = a2;
        final y2.g c4 = a.c();
        c3.a b2;
        if (u2.a.e(c)) {
            final int g = u2.a.g(c);
            b2 = new c3.a(c3.a.g);
            b2.e = null;
            b2.d = g;
        }
        else {
            final c3.a a4 = new c3.a(c3.a.h);
            final int i = u2.a.i(c);
            b2 = a4;
            if (i >= 0) {
                a4.a = i;
                b2 = a4;
            }
        }
        c4.d.B = b2;
        a.c().g = c;
        final y2.g c5 = a.c();
        c5.getClass();
        c5.h = layoutDirection;
        a.b.clear();
        a.c.clear();
        a.d.clear();
        if (b.e(list)) {
            final y2.g c6 = a.c();
            final HashMap<Object, c> a5 = c6.a;
            f.e((Object)a5, "mReferences");
            final Iterator<Map.Entry<Object, c>> iterator = a5.entrySet().iterator();
            while (iterator.hasNext()) {
                final c c7 = ((Map.Entry<K, c>)iterator.next()).getValue();
                if (c7 == null) {
                    continue;
                }
                final ConstraintWidget a6 = c7.a();
                if (a6 == null) {
                    continue;
                }
                a6.w();
            }
            c6.a.clear();
            final HashMap<Object, c> a7 = c6.a;
            f.e((Object)a7, "mReferences");
            a7.put(State.e, c6.d);
            c6.i.clear();
            c6.j = true;
            c6.b.clear();
            c6.c.clear();
            b.b(a.c(), list);
            androidx.constraintlayout.compose.b.a(a.c(), list);
            final y2.g c8 = a.c();
            final androidx.constraintlayout.core.widgets.d a8 = a.a;
            c8.getClass();
            ((e3.c)a8).o0.clear();
            c8.d.A.b((ConstraintWidget)a8, 0);
            c8.d.B.b((ConstraintWidget)a8, 1);
            final Iterator<Object> iterator2 = c8.b.keySet().iterator();
            while (iterator2.hasNext()) {
                c8.b.get(iterator2.next()).getClass();
            }
            final Iterator<Object> iterator3 = c8.a.keySet().iterator();
            while (iterator3.hasNext()) {
                final c c9 = c8.a.get(iterator3.next());
                if (c9 != c8.d && c9.c() instanceof c3.b) {
                    ((c3.b)c9.c()).getClass();
                }
            }
            final Iterator<Object> iterator4 = c8.a.keySet().iterator();
            while (iterator4.hasNext()) {
                final c c10 = c8.a.get(iterator4.next());
                if (c10 != c8.d) {
                    final ConstraintWidget a9 = c10.a();
                    a9.g0 = c10.getKey().toString();
                    a9.S = null;
                    if (c10.c() instanceof d3.b) {
                        c10.apply();
                    }
                    ((e3.c)a8).o0.add(a9);
                    final ConstraintWidget s = a9.S;
                    if (s != null) {
                        ((e3.c)s).o0.remove(a9);
                        a9.w();
                    }
                    a9.S = (ConstraintWidget)a8;
                }
                else {
                    c10.b((ConstraintWidget)a8);
                }
            }
            final Iterator<Object> iterator5 = c8.b.keySet().iterator();
            while (iterator5.hasNext()) {
                c8.b.get(iterator5.next()).getClass();
            }
            final Iterator<Object> iterator6 = c8.a.keySet().iterator();
            while (iterator6.hasNext()) {
                final c c11 = c8.a.get(iterator6.next());
                if (c11 != c8.d && c11.c() instanceof c3.b) {
                    ((c3.b)c11.c()).getClass();
                }
            }
            for (final Object next : c8.a.keySet()) {
                final c c12 = c8.a.get(next);
                c12.apply();
                final ConstraintWidget a10 = c12.a();
                if (a10 != null && next != null) {
                    a10.l = next.toString();
                }
            }
        }
        else {
            androidx.constraintlayout.compose.b.a(a.c(), list);
        }
        ((ConstraintWidget)a.a).E(u2.a.h(c));
        ((ConstraintWidget)a.a).B(u2.a.g(c));
        a.a.getClass();
        a.a.getClass();
        final androidx.constraintlayout.core.widgets.d a11 = a.a;
        a11.p0.c(a11);
        final androidx.constraintlayout.core.widgets.d a12 = a.a;
        a12.A0 = c2;
        androidx.constraintlayout.core.c.p = a12.L(512);
        final androidx.constraintlayout.core.widgets.d a13 = a.a;
        final int a14 = a13.A0;
        a13.u0 = 0;
        a13.v0 = 0;
        final f3.b p3 = a13.p0;
        p3.getClass();
        final b$b s2 = a13.s0;
        final int size = ((e3.c)a13).o0.size();
        final int l = ((ConstraintWidget)a13).l();
        final int k = ((ConstraintWidget)a13).i();
        final boolean b3 = (a14 & 0x80) == 0x80;
        int n;
        final boolean b4 = (n = ((b3 || (a14 & 0x40) == 0x40) ? 1 : 0)) != 0;
        Label_1527: {
            if (b4) {
                int n2 = 0;
                while (true) {
                    n = (b4 ? 1 : 0);
                    if (n2 >= size) {
                        break Label_1527;
                    }
                    final ConstraintWidget constraintWidget = ((e3.c)a13).o0.get(n2);
                    final ConstraintWidget.DimensionBehaviour[] r = constraintWidget.R;
                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour = r[0];
                    final ConstraintWidget.DimensionBehaviour match_CONSTRAINT = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    final boolean b5 = dimensionBehaviour == match_CONSTRAINT;
                    final boolean b6 = r[1] == match_CONSTRAINT;
                    final boolean b7 = b5 && b6 && constraintWidget.V > 0.0f;
                    if (constraintWidget.r() && b7) {
                        break;
                    }
                    if (constraintWidget.s() && b7) {
                        break;
                    }
                    if (constraintWidget instanceof g) {
                        break;
                    }
                    if (constraintWidget.r()) {
                        break;
                    }
                    if (constraintWidget.s()) {
                        break;
                    }
                    ++n2;
                }
                n = 0;
            }
        }
        int n3 = n & (b3 ? 1 : 0);
        int n5;
        Measurer measurer2;
        b$b b$b2;
        int n9;
        f3.b b8;
        if (n3 != 0) {
            Math.min(((ConstraintWidget)a13).D[0], 0);
            Math.min(((ConstraintWidget)a13).D[1], 0);
            final f3.e q0 = a13.q0;
            if (q0.b) {
                for (final ConstraintWidget constraintWidget2 : ((e3.c)q0.a).o0) {
                    if (constraintWidget2.d == null) {
                        constraintWidget2.d = new androidx.constraintlayout.core.widgets.analyzer.c(constraintWidget2);
                    }
                    if (constraintWidget2.e == null) {
                        constraintWidget2.e = new d(constraintWidget2);
                    }
                    constraintWidget2.a = false;
                    final androidx.constraintlayout.core.widgets.analyzer.c d = constraintWidget2.d;
                    ((DependencyNode)((WidgetRun)d).e).j = false;
                    ((WidgetRun)d).g = false;
                    ((WidgetRun)d).h.c();
                    ((WidgetRun)d).h.j = false;
                    ((WidgetRun)d).i.c();
                    ((WidgetRun)d).i.j = false;
                    ((DependencyNode)((WidgetRun)d).e).j = false;
                    final d e = constraintWidget2.e;
                    ((DependencyNode)((WidgetRun)e).e).j = false;
                    ((WidgetRun)e).g = false;
                    e.j();
                }
                final androidx.constraintlayout.core.widgets.d a15 = q0.a;
                if (((ConstraintWidget)a15).d == null) {
                    ((ConstraintWidget)a15).d = new androidx.constraintlayout.core.widgets.analyzer.c((ConstraintWidget)a15);
                }
                if (((ConstraintWidget)a15).e == null) {
                    ((ConstraintWidget)a15).e = new d((ConstraintWidget)a15);
                }
                final androidx.constraintlayout.core.widgets.d a16 = q0.a;
                ((ConstraintWidget)a16).a = false;
                final androidx.constraintlayout.core.widgets.analyzer.c d2 = ((ConstraintWidget)a16).d;
                ((DependencyNode)((WidgetRun)d2).e).j = false;
                ((WidgetRun)d2).g = false;
                ((WidgetRun)d2).h.c();
                ((WidgetRun)d2).h.j = false;
                ((WidgetRun)d2).i.c();
                ((WidgetRun)d2).i.j = false;
                ((DependencyNode)((WidgetRun)d2).e).j = false;
                final d e2 = ((ConstraintWidget)q0.a).e;
                ((DependencyNode)((WidgetRun)e2).e).j = false;
                ((WidgetRun)e2).g = false;
                e2.j();
                final ArrayList d3 = q0.d;
                d3.clear();
                ((ConstraintWidget)q0.c).d.e();
                ((ConstraintWidget)q0.c).e.e();
                d3.add(((ConstraintWidget)q0.c).d);
                d3.add(((ConstraintWidget)q0.c).e);
                final Iterator iterator9 = ((e3.c)q0.c).o0.iterator();
                Collection<f3.c> collection = null;
                while (iterator9.hasNext()) {
                    final ConstraintWidget constraintWidget3 = (ConstraintWidget)iterator9.next();
                    if (constraintWidget3 instanceof e) {
                        d3.add(new h(constraintWidget3));
                    }
                    else {
                        if (constraintWidget3.r()) {
                            if (constraintWidget3.b == null) {
                                constraintWidget3.b = new f3.c(0, constraintWidget3);
                            }
                            HashSet<f3.c> set;
                            if ((set = (HashSet<f3.c>)collection) == null) {
                                set = new HashSet<f3.c>();
                            }
                            set.add(constraintWidget3.b);
                            collection = set;
                        }
                        else {
                            d3.add(constraintWidget3.d);
                        }
                        if (constraintWidget3.s()) {
                            if (constraintWidget3.c == null) {
                                constraintWidget3.c = new f3.c(1, constraintWidget3);
                            }
                            HashSet<f3.c> set2;
                            if ((set2 = (HashSet<f3.c>)collection) == null) {
                                set2 = new HashSet<f3.c>();
                            }
                            set2.add(constraintWidget3.c);
                            collection = set2;
                        }
                        else {
                            d3.add(constraintWidget3.e);
                        }
                        if (!(constraintWidget3 instanceof e3.b)) {
                            continue;
                        }
                        d3.add(new androidx.constraintlayout.core.widgets.analyzer.b(constraintWidget3));
                    }
                }
                if (collection != null) {
                    d3.addAll(collection);
                }
                final Iterator iterator10 = d3.iterator();
                while (iterator10.hasNext()) {
                    ((WidgetRun)iterator10.next()).e();
                }
                for (final WidgetRun widgetRun : d3) {
                    if (widgetRun.b == q0.c) {
                        continue;
                    }
                    widgetRun.d();
                }
                q0.g.clear();
                q0.b((WidgetRun)((ConstraintWidget)q0.a).d, 0, q0.g);
                q0.b((WidgetRun)((ConstraintWidget)q0.a).e, 1, q0.g);
                q0.b = false;
            }
            final androidx.constraintlayout.core.widgets.d c13 = q0.c;
            final Iterator iterator12 = ((e3.c)c13).o0.iterator();
            final int n4 = k;
            n5 = l;
            final b$b b$b = s2;
            final Iterator iterator13 = iterator12;
            final int n6 = n3;
            final Measurer measurer = a;
            while (iterator13.hasNext()) {
                final ConstraintWidget constraintWidget4 = (ConstraintWidget)iterator13.next();
                final ConstraintWidget.DimensionBehaviour[] r2 = constraintWidget4.R;
                ConstraintWidget.DimensionBehaviour d4 = r2[0];
                ConstraintWidget.DimensionBehaviour d5 = r2[1];
                if (constraintWidget4.f0 == 8) {
                    constraintWidget4.a = true;
                }
                else {
                    final float x = constraintWidget4.x;
                    if (x < 1.0f && d4 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget4.s = 2;
                    }
                    final float a17 = constraintWidget4.A;
                    if (a17 < 1.0f && d5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget4.t = 2;
                    }
                    if (constraintWidget4.V > 0.0f) {
                        final ConstraintWidget.DimensionBehaviour match_CONSTRAINT2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (d4 == match_CONSTRAINT2 && (d5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || d5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                            constraintWidget4.s = 3;
                        }
                        else if (d5 == match_CONSTRAINT2 && (d4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || d4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                            constraintWidget4.t = 3;
                        }
                        else if (d4 == match_CONSTRAINT2 && d5 == match_CONSTRAINT2) {
                            if (constraintWidget4.s == 0) {
                                constraintWidget4.s = 3;
                            }
                            if (constraintWidget4.t == 0) {
                                constraintWidget4.t = 3;
                            }
                        }
                    }
                    final ConstraintWidget.DimensionBehaviour match_CONSTRAINT3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (d4 == match_CONSTRAINT3 && constraintWidget4.s == 1 && (constraintWidget4.G.f == null || constraintWidget4.I.f == null)) {
                        d4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (d5 == match_CONSTRAINT3 && constraintWidget4.t == 1 && (constraintWidget4.H.f == null || constraintWidget4.J.f == null)) {
                        d5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    final androidx.constraintlayout.core.widgets.analyzer.c d6 = constraintWidget4.d;
                    ((WidgetRun)d6).d = d4;
                    final int s3 = constraintWidget4.s;
                    ((WidgetRun)d6).a = s3;
                    final d e3 = constraintWidget4.e;
                    ((WidgetRun)e3).d = d5;
                    final int t = constraintWidget4.t;
                    ((WidgetRun)e3).a = t;
                    final ConstraintWidget.DimensionBehaviour match_PARENT = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                    if ((d4 == match_PARENT || d4 == ConstraintWidget.DimensionBehaviour.FIXED || d4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (d5 == match_PARENT || d5 == ConstraintWidget.DimensionBehaviour.FIXED || d5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                        int m = constraintWidget4.l();
                        if (d4 == match_PARENT) {
                            final int l2 = ((ConstraintWidget)c13).l();
                            final int g2 = constraintWidget4.G.g;
                            final int g3 = constraintWidget4.I.g;
                            d4 = ConstraintWidget.DimensionBehaviour.FIXED;
                            m = l2 - g2 - g3;
                        }
                        int i2 = constraintWidget4.i();
                        if (d5 == match_PARENT) {
                            final int i3 = ((ConstraintWidget)c13).i();
                            final int g4 = constraintWidget4.H.g;
                            final int g5 = constraintWidget4.J.g;
                            d5 = ConstraintWidget.DimensionBehaviour.FIXED;
                            i2 = i3 - g4 - g5;
                        }
                        q0.c(constraintWidget4, d4, m, d5, i2);
                        ((WidgetRun)constraintWidget4.d).e.d(constraintWidget4.l());
                        ((WidgetRun)constraintWidget4.e).e.d(constraintWidget4.i());
                        constraintWidget4.a = true;
                    }
                    else {
                        Label_3234: {
                            if (d4 == match_CONSTRAINT3) {
                                final ConstraintWidget.DimensionBehaviour wrap_CONTENT = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                Label_2897: {
                                    if (d5 == wrap_CONTENT || d5 == ConstraintWidget.DimensionBehaviour.FIXED) {
                                        if (s3 == 3) {
                                            if (d5 == wrap_CONTENT) {
                                                q0.c(constraintWidget4, wrap_CONTENT, 0, wrap_CONTENT, 0);
                                            }
                                            final int i4 = constraintWidget4.i();
                                            final int n7 = (int)(i4 * constraintWidget4.V + 0.5f);
                                            final ConstraintWidget.DimensionBehaviour fixed = ConstraintWidget.DimensionBehaviour.FIXED;
                                            q0.c(constraintWidget4, fixed, n7, fixed, i4);
                                            ((WidgetRun)constraintWidget4.d).e.d(constraintWidget4.l());
                                            ((WidgetRun)constraintWidget4.e).e.d(constraintWidget4.i());
                                            constraintWidget4.a = true;
                                        }
                                        else if (s3 == 1) {
                                            q0.c(constraintWidget4, wrap_CONTENT, 0, d5, 0);
                                            ((WidgetRun)constraintWidget4.d).e.m = constraintWidget4.l();
                                        }
                                        else if (s3 == 2) {
                                            final ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ((ConstraintWidget)c13).R[0];
                                            final ConstraintWidget.DimensionBehaviour fixed2 = ConstraintWidget.DimensionBehaviour.FIXED;
                                            if (dimensionBehaviour2 != fixed2 && dimensionBehaviour2 != match_PARENT) {
                                                break Label_2897;
                                            }
                                            q0.c(constraintWidget4, fixed2, (int)(x * ((ConstraintWidget)c13).l() + 0.5f), d5, constraintWidget4.i());
                                            ((WidgetRun)constraintWidget4.d).e.d(constraintWidget4.l());
                                            ((WidgetRun)constraintWidget4.e).e.d(constraintWidget4.i());
                                            constraintWidget4.a = true;
                                        }
                                        else {
                                            final ConstraintAnchor[] o = constraintWidget4.O;
                                            if (o[0].f != null && o[1].f != null) {
                                                break Label_3234;
                                            }
                                            q0.c(constraintWidget4, wrap_CONTENT, 0, d5, 0);
                                            ((WidgetRun)constraintWidget4.d).e.d(constraintWidget4.l());
                                            ((WidgetRun)constraintWidget4.e).e.d(constraintWidget4.i());
                                            constraintWidget4.a = true;
                                        }
                                        continue;
                                    }
                                }
                            }
                        }
                        if (d5 == match_CONSTRAINT3) {
                            final ConstraintWidget.DimensionBehaviour wrap_CONTENT2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            if (d4 == wrap_CONTENT2 || d4 == ConstraintWidget.DimensionBehaviour.FIXED) {
                                if (t == 3) {
                                    if (d4 == wrap_CONTENT2) {
                                        q0.c(constraintWidget4, wrap_CONTENT2, 0, wrap_CONTENT2, 0);
                                    }
                                    final int l3 = constraintWidget4.l();
                                    float v = constraintWidget4.V;
                                    if (constraintWidget4.W == -1) {
                                        v = 1.0f / v;
                                    }
                                    final int n8 = (int)(l3 * v + 0.5f);
                                    final ConstraintWidget.DimensionBehaviour fixed3 = ConstraintWidget.DimensionBehaviour.FIXED;
                                    q0.c(constraintWidget4, fixed3, l3, fixed3, n8);
                                    ((WidgetRun)constraintWidget4.d).e.d(constraintWidget4.l());
                                    ((WidgetRun)constraintWidget4.e).e.d(constraintWidget4.i());
                                    constraintWidget4.a = true;
                                    continue;
                                }
                                if (t == 1) {
                                    q0.c(constraintWidget4, d4, 0, wrap_CONTENT2, 0);
                                    ((WidgetRun)constraintWidget4.e).e.m = constraintWidget4.i();
                                    continue;
                                }
                                if (t == 2) {
                                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ((ConstraintWidget)c13).R[1];
                                    final ConstraintWidget.DimensionBehaviour fixed4 = ConstraintWidget.DimensionBehaviour.FIXED;
                                    if (dimensionBehaviour3 == fixed4 || dimensionBehaviour3 == match_PARENT) {
                                        q0.c(constraintWidget4, d4, constraintWidget4.l(), fixed4, (int)(a17 * ((ConstraintWidget)c13).i() + 0.5f));
                                        ((WidgetRun)constraintWidget4.d).e.d(constraintWidget4.l());
                                        ((WidgetRun)constraintWidget4.e).e.d(constraintWidget4.i());
                                        constraintWidget4.a = true;
                                        continue;
                                    }
                                }
                                else {
                                    final ConstraintAnchor[] o2 = constraintWidget4.O;
                                    if (o2[2].f == null || o2[3].f == null) {
                                        q0.c(constraintWidget4, wrap_CONTENT2, 0, d5, 0);
                                        ((WidgetRun)constraintWidget4.d).e.d(constraintWidget4.l());
                                        ((WidgetRun)constraintWidget4.e).e.d(constraintWidget4.i());
                                        constraintWidget4.a = true;
                                        continue;
                                    }
                                }
                            }
                        }
                        if (d4 != match_CONSTRAINT3 || d5 != match_CONSTRAINT3) {
                            continue;
                        }
                        if (s3 != 1 && t != 1) {
                            if (t != 2 || s3 != 2) {
                                continue;
                            }
                            final ConstraintWidget.DimensionBehaviour[] r3 = ((ConstraintWidget)c13).R;
                            final ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = r3[0];
                            final ConstraintWidget.DimensionBehaviour fixed5 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour4 != fixed5 || r3[1] != fixed5) {
                                continue;
                            }
                            q0.c(constraintWidget4, fixed5, (int)(x * ((ConstraintWidget)c13).l() + 0.5f), fixed5, (int)(a17 * ((ConstraintWidget)c13).i() + 0.5f));
                            ((WidgetRun)constraintWidget4.d).e.d(constraintWidget4.l());
                            ((WidgetRun)constraintWidget4.e).e.d(constraintWidget4.i());
                            constraintWidget4.a = true;
                        }
                        else {
                            final ConstraintWidget.DimensionBehaviour wrap_CONTENT3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            q0.c(constraintWidget4, wrap_CONTENT3, 0, wrap_CONTENT3, 0);
                            ((WidgetRun)constraintWidget4.d).e.m = constraintWidget4.l();
                            ((WidgetRun)constraintWidget4.e).e.m = constraintWidget4.i();
                        }
                    }
                }
            }
            final androidx.constraintlayout.core.widgets.d a18 = q0.a;
            ((ConstraintWidget)a18).X = 0;
            ((ConstraintWidget)a18).Y = 0;
            ((WidgetRun)((ConstraintWidget)a18).d).h.d(0);
            ((WidgetRun)((ConstraintWidget)q0.a).e).h.d(0);
            a13.F(false, false);
            measurer2 = measurer;
            n3 = n6;
            b$b2 = b$b;
            n9 = n4;
            b8 = p3;
        }
        else {
            b8 = p3;
            b$b2 = s2;
            n5 = l;
            n9 = k;
            measurer2 = a;
        }
        final int a19 = a13.A0;
        if (size > 0) {
            final int size2 = ((e3.c)a13).o0.size();
            final boolean l4 = a13.L(64);
            final b$b s4 = a13.s0;
            for (int n10 = 0; n10 < size2; ++n10) {
                final ConstraintWidget constraintWidget5 = ((e3.c)a13).o0.get(n10);
                if (!(constraintWidget5 instanceof e)) {
                    if (!(constraintWidget5 instanceof androidx.constraintlayout.core.widgets.a)) {
                        constraintWidget5.getClass();
                        if (l4) {
                            final androidx.constraintlayout.core.widgets.analyzer.c d7 = constraintWidget5.d;
                            if (d7 != null) {
                                final d e4 = constraintWidget5.e;
                                if (e4 != null && ((DependencyNode)((WidgetRun)d7).e).j && ((DependencyNode)((WidgetRun)e4).e).j) {
                                    continue;
                                }
                            }
                        }
                        final ConstraintWidget.DimensionBehaviour h2 = constraintWidget5.h(0);
                        final ConstraintWidget.DimensionBehaviour h3 = constraintWidget5.h(1);
                        final ConstraintWidget.DimensionBehaviour match_CONSTRAINT4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        boolean b9;
                        if (h2 == match_CONSTRAINT4 && constraintWidget5.s != 1 && h3 == match_CONSTRAINT4 && constraintWidget5.t != 1) {
                            b9 = true;
                        }
                        else {
                            b9 = false;
                        }
                        int n11 = b9 ? 1 : 0;
                        Label_4470: {
                            if (!b9) {
                                n11 = (b9 ? 1 : 0);
                                if (a13.L(1)) {
                                    n11 = (b9 ? 1 : 0);
                                    if (!(constraintWidget5 instanceof g)) {
                                        int n12 = b9 ? 1 : 0;
                                        if (h2 == match_CONSTRAINT4) {
                                            n12 = (b9 ? 1 : 0);
                                            if (constraintWidget5.s == 0) {
                                                n12 = (b9 ? 1 : 0);
                                                if (h3 != match_CONSTRAINT4) {
                                                    n12 = (b9 ? 1 : 0);
                                                    if (!constraintWidget5.r()) {
                                                        n12 = 1;
                                                    }
                                                }
                                            }
                                        }
                                        int n13 = n12;
                                        if (h3 == match_CONSTRAINT4) {
                                            n13 = n12;
                                            if (constraintWidget5.t == 0) {
                                                n13 = n12;
                                                if (h2 != match_CONSTRAINT4) {
                                                    n13 = n12;
                                                    if (!constraintWidget5.r()) {
                                                        n13 = 1;
                                                    }
                                                }
                                            }
                                        }
                                        if (h2 != match_CONSTRAINT4) {
                                            n11 = n13;
                                            if (h3 != match_CONSTRAINT4) {
                                                break Label_4470;
                                            }
                                        }
                                        n11 = n13;
                                        if (constraintWidget5.V > 0.0f) {
                                            n11 = 1;
                                        }
                                    }
                                }
                            }
                        }
                        if (n11 == 0) {
                            b8.a(0, constraintWidget5, s4);
                        }
                    }
                }
            }
            s4.b();
        }
        b8.c(a13);
        final int size3 = b8.a.size();
        final int n14 = n5;
        if (size > 0) {
            b8.b(a13, 0, n14, n9);
        }
        int a21;
        if (size3 > 0) {
            final ConstraintWidget.DimensionBehaviour[] r4 = ((ConstraintWidget)a13).R;
            final ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = r4[0];
            final ConstraintWidget.DimensionBehaviour wrap_CONTENT4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            final boolean b10 = dimensionBehaviour5 == wrap_CONTENT4;
            final boolean b11 = r4[1] == wrap_CONTENT4;
            int max = Math.max(((ConstraintWidget)a13).l(), ((ConstraintWidget)b8.c).a0);
            int max2 = Math.max(((ConstraintWidget)a13).i(), ((ConstraintWidget)b8.c).b0);
            int n15 = 0;
            int n16 = 0;
            final int n17 = a19;
            while (n15 < size3) {
                final ConstraintWidget constraintWidget6 = b8.a.get(n15);
                if (constraintWidget6 instanceof g) {
                    final int l5 = constraintWidget6.l();
                    final int i5 = constraintWidget6.i();
                    final boolean a20 = b8.a(1, constraintWidget6, b$b2);
                    final int l6 = constraintWidget6.l();
                    final int i6 = constraintWidget6.i();
                    int n19;
                    if (l6 != l5) {
                        constraintWidget6.E(l6);
                        int max3 = max;
                        if (b10 && constraintWidget6.m() + constraintWidget6.T > (max3 = max)) {
                            max3 = Math.max(max, constraintWidget6.g(ConstraintAnchor.Type.RIGHT).d() + (constraintWidget6.m() + constraintWidget6.T));
                        }
                        final int n18 = 1;
                        max = max3;
                        n19 = n18;
                    }
                    else {
                        n19 = (n16 | (a20 ? 1 : 0));
                    }
                    int n20 = n19;
                    int max4 = max2;
                    if (i6 != i5) {
                        constraintWidget6.B(i6);
                        max4 = max2;
                        if (b11 && constraintWidget6.n() + constraintWidget6.U > (max4 = max2)) {
                            max4 = Math.max(max2, constraintWidget6.g(ConstraintAnchor.Type.BOTTOM).d() + (constraintWidget6.n() + constraintWidget6.U));
                        }
                        n20 = 1;
                    }
                    final g g6 = (g)constraintWidget6;
                    final int n21 = n20 | 0x0;
                    max2 = max4;
                    n16 = n21;
                }
                ++n15;
            }
            final int n22 = n17;
            int n23 = 0;
            int n24 = n16;
            final int n25 = n14;
            final int n26 = size3;
            while (true) {
                a21 = n22;
                if (n23 >= 2) {
                    break;
                }
                int n27 = 0;
                int n28 = n24;
                while (n27 < n26) {
                    final ConstraintWidget constraintWidget7 = b8.a.get(n27);
                    int max5 = 0;
                    Label_5370: {
                        if ((!(constraintWidget7 instanceof e3.a) || constraintWidget7 instanceof g) && !(constraintWidget7 instanceof e)) {
                            if (constraintWidget7.f0 != 8) {
                                if (n3 == 0 || !((DependencyNode)((WidgetRun)constraintWidget7.d).e).j || !((DependencyNode)((WidgetRun)constraintWidget7.e).e).j) {
                                    if (!(constraintWidget7 instanceof g)) {
                                        final int l7 = constraintWidget7.l();
                                        final int i7 = constraintWidget7.i();
                                        final int z = constraintWidget7.Z;
                                        int n29 = 1;
                                        if (n23 == 1) {
                                            n29 = 2;
                                        }
                                        final boolean a22 = b8.a(n29, constraintWidget7, b$b2);
                                        final int l8 = constraintWidget7.l();
                                        n28 |= (a22 ? 1 : 0);
                                        final int i8 = constraintWidget7.i();
                                        max5 = max;
                                        if (l8 != l7) {
                                            constraintWidget7.E(l8);
                                            max5 = max;
                                            if (b10 && constraintWidget7.m() + constraintWidget7.T > (max5 = max)) {
                                                max5 = Math.max(max, constraintWidget7.g(ConstraintAnchor.Type.RIGHT).d() + (constraintWidget7.m() + constraintWidget7.T));
                                            }
                                            n28 = (true ? 1 : 0);
                                        }
                                        int max6 = max2;
                                        if (i8 != i7) {
                                            constraintWidget7.B(i8);
                                            max6 = max2;
                                            if (b11 && constraintWidget7.n() + constraintWidget7.U > (max6 = max2)) {
                                                max6 = Math.max(max2, constraintWidget7.g(ConstraintAnchor.Type.BOTTOM).d() + (constraintWidget7.n() + constraintWidget7.U));
                                            }
                                            n28 = (true ? 1 : 0);
                                        }
                                        if (constraintWidget7.F && z != constraintWidget7.Z) {
                                            n28 = (true ? 1 : 0);
                                            max2 = max6;
                                            break Label_5370;
                                        }
                                        max2 = max6;
                                        break Label_5370;
                                    }
                                }
                            }
                        }
                        max5 = max;
                    }
                    ++n27;
                    max = max5;
                }
                a21 = n22;
                if (n28 == 0) {
                    break;
                }
                ++n23;
                b8.b(a13, n23, n25, n9);
                n24 = (false ? 1 : 0);
            }
        }
        else {
            a21 = a19;
        }
        a13.A0 = a21;
        androidx.constraintlayout.core.c.p = a13.L(512);
        for (final ConstraintWidget constraintWidget8 : ((e3.c)measurer2.a).o0) {
            final Object e5 = constraintWidget8.e0;
            if (!(e5 instanceof r)) {
                continue;
            }
            final e0 e6 = measurer2.b.get(e5);
            Integer value;
            if (e6 == null) {
                value = null;
            }
            else {
                value = e6.f;
            }
            Integer value2;
            if (e6 == null) {
                value2 = null;
            }
            else {
                value2 = e6.g;
            }
            final int l9 = constraintWidget8.l();
            if (value != null) {
                if (l9 == value) {
                    final int i9 = constraintWidget8.i();
                    if (value2 != null) {
                        if (i9 == value2) {
                            continue;
                        }
                    }
                }
            }
            measurer2.b.put(e5, ((r)e5).I(u2.a.a.c(constraintWidget8.l(), constraintWidget8.i())));
        }
        c = yl.a.c(((ConstraintWidget)measurer2.a).l(), ((ConstraintWidget)measurer2.a).i());
        this.d.getValue();
        return u.E0(u, (int)(c >> 32), i.b(c), (l)new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1(this.a, (List)list));
    }
    
    @Override
    public final int d(final LayoutNode.LayoutNode$f u, final List list, final int n) {
        f.f((Object)u, "receiver");
        return s.e(this, u, list, n);
    }
    
    @Override
    public final int f(final LayoutNode.LayoutNode$f u, final List list, final int n) {
        f.f((Object)u, "receiver");
        return s.b(this, u, list, n);
    }
    
    @Override
    public final int g(final LayoutNode.LayoutNode$f u, final List list, final int n) {
        f.f((Object)u, "receiver");
        return s.a(this, u, list, n);
    }
    
    @Override
    public final int h(final LayoutNode.LayoutNode$f u, final List list, final int n) {
        f.f((Object)u, "receiver");
        return s.i(this, u, list, n);
    }
}
