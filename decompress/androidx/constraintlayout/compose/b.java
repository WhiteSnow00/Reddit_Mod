// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import z0.d$a$a;
import z0.d$a;
import kotlin.Pair;
import z0.d;
import z0.h0;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.state.a;
import p2.e;
import aj2.c;
import ah2.f;
import c2.r;
import java.util.List;
import y2.g;

public final class b
{
    public static final void a(final g g, final List<? extends r> list) {
        f.f((Object)g, "state");
        f.f((Object)list, "measurables");
        final int n = list.size() - 1;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                final int n3 = n2 + 1;
                final r r = list.get(n2);
                final Object c = r.c();
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
                    o = aj2.c.Z(r);
                }
                else {
                    o = f.a;
                }
                Object o2 = o;
                if (o == null) {
                    o2 = new e();
                }
                final a a2 = g.a(o2);
                if (a2 instanceof a) {
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
    
    public static final Pair b(final y2.c c, final h0 h0, final Measurer measurer, final d d) {
        f.f((Object)c, "scope");
        f.f((Object)h0, "remeasureRequesterState");
        f.f((Object)measurer, "measurer");
        d.A(-441911125);
        d.A(-3687241);
        final Object b = d.B();
        final d$a$a a = d$a.a;
        Object o = b;
        if (b == a) {
            o = new ConstraintSetForInlineDsl(c);
            d.v(o);
        }
        d.I();
        final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl)o;
        d.A(-3686930);
        final boolean l = d.l(257);
        final Object b2 = d.B();
        Pair pair;
        if (l || (pair = (Pair)b2) == a) {
            pair = new Pair((Object)new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1(measurer, constraintSetForInlineDsl, h0), (Object)new ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1(h0, constraintSetForInlineDsl));
            d.v(pair);
        }
        d.I();
        final Pair pair2 = pair;
        d.I();
        return pair2;
    }
}
