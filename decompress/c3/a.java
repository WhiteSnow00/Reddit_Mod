// 
// Decompiled by Procyon v0.6.0
// 

package c3;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

public final class a
{
    public static final Object g;
    public static final Object h;
    public static final Object i;
    public static final Object j;
    public static final Object k;
    public int a;
    public int b;
    public float c;
    public int d;
    public Object e;
    public boolean f;
    
    static {
        g = new Object();
        h = new Object();
        i = new Object();
        j = new Object();
        k = new Object();
    }
    
    public a() {
        this.a = 0;
        this.b = Integer.MAX_VALUE;
        this.c = 1.0f;
        this.d = 0;
        this.e = c3.a.h;
        this.f = false;
    }
    
    public a(final Object e) {
        this.a = 0;
        this.b = Integer.MAX_VALUE;
        this.c = 1.0f;
        this.d = 0;
        this.f = false;
        this.e = e;
    }
    
    public static a a() {
        final Object h = a.h;
        final a a = new a(c3.a.g);
        a.e = h;
        if (h instanceof Integer) {
            a.d = (int)h;
            a.e = null;
        }
        return a;
    }
    
    public final void b(final ConstraintWidget constraintWidget, int n) {
        int z = 0;
        final int n2 = 0;
        final int n3 = 1;
        final int n4 = 1;
        if (n == 0) {
            if (this.f) {
                constraintWidget.C(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                final Object e = this.e;
                if (e == c3.a.h) {
                    n = n4;
                }
                else if (e == c3.a.k) {
                    n = 2;
                }
                else {
                    n = 0;
                }
                final int a = this.a;
                int b = this.b;
                final float c = this.c;
                constraintWidget.s = n;
                constraintWidget.v = a;
                if (b == Integer.MAX_VALUE) {
                    b = n2;
                }
                constraintWidget.w = b;
                constraintWidget.x = c;
                if (c > 0.0f && c < 1.0f && n == 0) {
                    constraintWidget.s = 2;
                }
            }
            else {
                n = this.a;
                if (n > 0) {
                    if (n < 0) {
                        constraintWidget.a0 = 0;
                    }
                    else {
                        constraintWidget.a0 = n;
                    }
                }
                n = this.b;
                if (n < Integer.MAX_VALUE) {
                    constraintWidget.D[0] = n;
                }
                final Object e2 = this.e;
                if (e2 == c3.a.h) {
                    constraintWidget.C(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
                else if (e2 == c3.a.j) {
                    constraintWidget.C(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                else if (e2 == null) {
                    constraintWidget.C(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.E(this.d);
                }
            }
        }
        else if (this.f) {
            constraintWidget.D(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            final Object e3 = this.e;
            if (e3 == c3.a.h) {
                n = n3;
            }
            else if (e3 == c3.a.k) {
                n = 2;
            }
            else {
                n = 0;
            }
            final int a2 = this.a;
            final int b2 = this.b;
            final float c2 = this.c;
            constraintWidget.t = n;
            constraintWidget.y = a2;
            if (b2 != Integer.MAX_VALUE) {
                z = b2;
            }
            constraintWidget.z = z;
            constraintWidget.A = c2;
            if (c2 > 0.0f && c2 < 1.0f && n == 0) {
                constraintWidget.t = 2;
            }
        }
        else {
            n = this.a;
            if (n > 0) {
                if (n < 0) {
                    constraintWidget.b0 = 0;
                }
                else {
                    constraintWidget.b0 = n;
                }
            }
            n = this.b;
            if (n < Integer.MAX_VALUE) {
                constraintWidget.D[1] = n;
            }
            final Object e4 = this.e;
            if (e4 == c3.a.h) {
                constraintWidget.D(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
            else if (e4 == c3.a.j) {
                constraintWidget.D(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            else if (e4 == null) {
                constraintWidget.D(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.B(this.d);
            }
        }
    }
}
