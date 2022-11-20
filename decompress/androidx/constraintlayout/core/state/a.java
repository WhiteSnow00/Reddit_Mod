// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.state;

import y2.g;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import java.util.Iterator;
import c3.d;
import java.util.HashMap;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import c3.c;

public class a implements c
{
    public c3.a A;
    public c3.a B;
    public Object C;
    public ConstraintWidget D;
    public HashMap<String, Integer> E;
    public HashMap<String, Float> F;
    public Object a;
    public final State b;
    public d3.a c;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public float y;
    public State$Constraint z;
    
    public a(final State b) {
        this.c = null;
        this.d = 0.5f;
        this.e = 0.5f;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.z = null;
        this.A = c3.a.a();
        this.B = c3.a.a();
        this.E = new HashMap<String, Integer>();
        this.F = new HashMap<String, Float>();
        this.b = b;
    }
    
    @Override
    public ConstraintWidget a() {
        if (this.D == null) {
            final ConstraintWidget d = new ConstraintWidget(this.A.d, this.B.d);
            this.D = d;
            d.e0 = this.C;
        }
        return this.D;
    }
    
    @Override
    public void apply() {
        if (this.D == null) {
            return;
        }
        final d3.a c = this.c;
        if (c != null) {
            c.apply();
        }
        this.A.b(this.D, 0);
        this.B.b(this.D, 1);
        this.l = this.e(this.l);
        this.m = this.e(this.m);
        this.n = this.e(this.n);
        this.o = this.e(this.o);
        this.p = this.e(this.p);
        this.q = this.e(this.q);
        this.r = this.e(this.r);
        this.s = this.e(this.s);
        this.t = this.e(this.t);
        this.u = this.e(this.u);
        this.v = this.e(this.v);
        this.w = this.e(this.w);
        this.x = this.e(this.x);
        this.d(this.D, this.l, State$Constraint.LEFT_TO_LEFT);
        this.d(this.D, this.m, State$Constraint.LEFT_TO_RIGHT);
        this.d(this.D, this.n, State$Constraint.RIGHT_TO_LEFT);
        this.d(this.D, this.o, State$Constraint.RIGHT_TO_RIGHT);
        this.d(this.D, this.p, State$Constraint.START_TO_START);
        this.d(this.D, this.q, State$Constraint.START_TO_END);
        this.d(this.D, this.r, State$Constraint.END_TO_START);
        this.d(this.D, this.s, State$Constraint.END_TO_END);
        this.d(this.D, this.t, State$Constraint.TOP_TO_TOP);
        this.d(this.D, this.u, State$Constraint.TOP_TO_BOTTOM);
        this.d(this.D, this.v, State$Constraint.BOTTOM_TO_TOP);
        this.d(this.D, this.w, State$Constraint.BOTTOM_TO_BOTTOM);
        this.d(this.D, this.x, State$Constraint.BASELINE_TO_BASELINE);
        this.d(this.D, null, State$Constraint.CIRCULAR_CONSTRAINT);
        final ConstraintWidget d = this.D;
        d.c0 = this.d;
        d.d0 = this.e;
        final d k = d.k;
        k.f = Float.NaN;
        k.g = Float.NaN;
        k.h = Float.NaN;
        k.i = Float.NaN;
        k.j = Float.NaN;
        k.k = Float.NaN;
        k.l = Float.NaN;
        k.m = Float.NaN;
        k.n = Float.NaN;
        k.o = Float.NaN;
        k.p = Float.NaN;
        d.f0 = 0;
        final HashMap<String, Integer> e = this.E;
        if (e != null) {
            for (final String s : e.keySet()) {
                final Integer n = this.E.get(s);
                final d i = this.D.k;
                final int intValue = n;
                if (i.r.containsKey(s)) {
                    i.r.get(s).c = intValue;
                }
                else {
                    i.r.put(s, new a3.a(s, intValue));
                }
            }
        }
        final HashMap<String, Float> f = this.F;
        if (f != null) {
            for (final String s2 : f.keySet()) {
                final float floatValue = this.F.get(s2);
                final d j = this.D.k;
                if (j.r.containsKey(s2)) {
                    j.r.get(s2).d = floatValue;
                }
                else {
                    j.r.put(s2, new a3.a(s2, floatValue));
                }
            }
        }
    }
    
    @Override
    public final void b(final ConstraintWidget d) {
        if (d == null) {
            return;
        }
        this.D = d;
        d.e0 = this.C;
    }
    
    @Override
    public final d3.a c() {
        return this.c;
    }
    
    public final void d(final ConstraintWidget constraintWidget, final Object o, final State$Constraint state$Constraint) {
        ConstraintWidget a;
        if (o instanceof c) {
            a = ((c)o).a();
        }
        else {
            a = null;
        }
        if (a == null) {
            return;
        }
        final int[] a2 = a$a.a;
        final int n = a2[((Enum)state$Constraint).ordinal()];
        switch (a2[((Enum)state$Constraint).ordinal()]) {
            case 14: {
                final int n2 = (int)this.y;
                constraintWidget.getClass();
                final ConstraintAnchor.Type center = ConstraintAnchor.Type.CENTER;
                constraintWidget.g(center).a(a.g(center), n2, true);
                constraintWidget.E = 0.0f;
                break;
            }
            case 13: {
                final ConstraintAnchor.Type baseline = ConstraintAnchor.Type.BASELINE;
                constraintWidget.g(baseline).a(a.g(baseline), 0, true);
                break;
            }
            case 12: {
                final ConstraintAnchor.Type bottom = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.g(bottom).a(a.g(bottom), this.k, false);
                break;
            }
            case 11: {
                constraintWidget.g(ConstraintAnchor.Type.BOTTOM).a(a.g(ConstraintAnchor.Type.TOP), this.k, false);
                break;
            }
            case 10: {
                constraintWidget.g(ConstraintAnchor.Type.TOP).a(a.g(ConstraintAnchor.Type.BOTTOM), this.j, false);
                break;
            }
            case 9: {
                final ConstraintAnchor.Type top = ConstraintAnchor.Type.TOP;
                constraintWidget.g(top).a(a.g(top), this.j, false);
                break;
            }
            case 8: {
                final ConstraintAnchor.Type right = ConstraintAnchor.Type.RIGHT;
                constraintWidget.g(right).a(a.g(right), this.i, false);
                break;
            }
            case 7: {
                constraintWidget.g(ConstraintAnchor.Type.RIGHT).a(a.g(ConstraintAnchor.Type.LEFT), this.i, false);
                break;
            }
            case 6: {
                constraintWidget.g(ConstraintAnchor.Type.LEFT).a(a.g(ConstraintAnchor.Type.RIGHT), this.h, false);
                break;
            }
            case 5: {
                final ConstraintAnchor.Type left = ConstraintAnchor.Type.LEFT;
                constraintWidget.g(left).a(a.g(left), this.h, false);
                break;
            }
            case 4: {
                final ConstraintAnchor.Type right2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.g(right2).a(a.g(right2), this.g, false);
                break;
            }
            case 3: {
                constraintWidget.g(ConstraintAnchor.Type.RIGHT).a(a.g(ConstraintAnchor.Type.LEFT), this.g, false);
                break;
            }
            case 2: {
                constraintWidget.g(ConstraintAnchor.Type.LEFT).a(a.g(ConstraintAnchor.Type.RIGHT), this.f, false);
                break;
            }
            case 1: {
                final ConstraintAnchor.Type left2 = ConstraintAnchor.Type.LEFT;
                constraintWidget.g(left2).a(a.g(left2), this.f, false);
                break;
            }
        }
    }
    
    public final Object e(final Object o) {
        if (o == null) {
            return null;
        }
        Object o2 = o;
        if (!(o instanceof a)) {
            o2 = this.b.a.get(o);
        }
        return o2;
    }
    
    public final void f(final u2.d d) {
        final int w0 = ((g)this.b).f.w0(d.f);
        final State$Constraint z = this.z;
        if (z != null) {
            switch (a$a.a[((Enum)z).ordinal()]) {
                case 14: {
                    this.y = (float)w0;
                    break;
                }
                case 11:
                case 12: {
                    this.k = w0;
                    break;
                }
                case 9:
                case 10: {
                    this.j = w0;
                    break;
                }
                case 7:
                case 8: {
                    this.i = w0;
                    break;
                }
                case 5:
                case 6: {
                    this.h = w0;
                    break;
                }
                case 3:
                case 4: {
                    this.g = w0;
                    break;
                }
                case 1:
                case 2: {
                    this.f = w0;
                    break;
                }
            }
        }
        else {
            this.f = w0;
            this.g = w0;
            this.h = w0;
            this.i = w0;
            this.j = w0;
            this.k = w0;
        }
    }
    
    @Override
    public final Object getKey() {
        return this.a;
    }
}
