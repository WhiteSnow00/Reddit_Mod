// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.State;
import c2.i;
import z0.d$a$a;
import z0.d$a;
import kotlin.Pair;
import z0.d;
import z0.h0;
import y2.c;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import vl.a;
import sg2.e;
import c2.r;
import java.util.List;
import y2.g;

public final class b
{
    public static final void a(final g g, final List<? extends r> list) {
        e.f((Object)g, "state");
        e.f((Object)list, "measurables");
        final int n = list.size() - 1;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                final int n3 = n2 + 1;
                final r r = list.get(n2);
                final Object c = ((i)r).c();
                final boolean b = c instanceof y2.b;
                final y2.a a = null;
                y2.b b2;
                if (b) {
                    b2 = (y2.b)c;
                }
                else {
                    b2 = null;
                }
                y2.a f;
                if (b2 == null) {
                    f = a;
                }
                else {
                    f = b2.f;
                }
                Object o;
                if (f == null) {
                    o = vl.a.R(r);
                }
                else {
                    o = f.a;
                }
                Object o2 = o;
                if (o == null) {
                    o2 = new pd.r();
                }
                final androidx.constraintlayout.core.state.a a2 = ((State)g).a(o2);
                if (a2 instanceof androidx.constraintlayout.core.state.a) {
                    a2.C = r;
                    final ConstraintWidget d = a2.D;
                    if (d != null) {
                        d.e0 = r;
                    }
                }
                if (n3 > n) {
                    break;
                }
                n2 = n3;
            }
        }
    }
    
    public static final Pair b(final c c, final h0 h0, final Measurer measurer, final d d) {
        e.f((Object)c, "scope");
        e.f((Object)h0, "remeasureRequesterState");
        e.f((Object)measurer, "measurer");
        d.A(-441911125);
        d.A(-3687241);
        final Object b = d.B();
        final d$a$a a = d$a.a;
        Object o = b;
        if (b == a) {
            o = new ConstraintSetForInlineDsl(c);
            d.w(o);
        }
        d.I();
        final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl)o;
        d.A(-3686930);
        final boolean m = d.m((Object)257);
        final Object b2 = d.B();
        Pair pair;
        if (m || (pair = (Pair)b2) == a) {
            pair = new Pair((Object)new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1(measurer, constraintSetForInlineDsl, h0), (Object)new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1((h0<Boolean>)h0, constraintSetForInlineDsl));
            d.w((Object)pair);
        }
        d.I();
        final Pair pair2 = pair;
        d.I();
        return pair2;
    }
}
