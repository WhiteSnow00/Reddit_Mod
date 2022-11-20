// 
// Decompiled by Procyon v0.6.0
// 

package d3;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.e;
import c3.c;

public final class b implements a, c
{
    public int a;
    public e b;
    public int c;
    public int d;
    public float e;
    public Object f;
    
    public b() {
        this.c = -1;
        this.d = -1;
        this.e = 0.0f;
    }
    
    public final ConstraintWidget a() {
        if (this.b == null) {
            this.b = new e();
        }
        return this.b;
    }
    
    public final void apply() {
        final e b = this.b;
        final int a = this.a;
        if (b.s0 != a) {
            b.s0 = a;
            b.P.clear();
            if (b.s0 == 1) {
                b.r0 = b.G;
            }
            else {
                b.r0 = b.H;
            }
            b.P.add(b.r0);
            for (int length = b.O.length, i = 0; i < length; ++i) {
                b.O[i] = b.r0;
            }
        }
        final int c = this.c;
        if (c != -1) {
            final e b2 = this.b;
            if (c > -1) {
                b2.o0 = -1.0f;
                b2.p0 = c;
                b2.q0 = -1;
            }
            else {
                b2.getClass();
            }
        }
        else {
            final int d = this.d;
            if (d != -1) {
                final e b3 = this.b;
                if (d > -1) {
                    b3.o0 = -1.0f;
                    b3.p0 = -1;
                    b3.q0 = d;
                }
                else {
                    b3.getClass();
                }
            }
            else {
                final e b4 = this.b;
                final float e = this.e;
                if (e > -1.0f) {
                    b4.o0 = e;
                    b4.p0 = -1;
                    b4.q0 = -1;
                }
                else {
                    b4.getClass();
                }
            }
        }
    }
    
    public final void b(final ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof e) {
            this.b = (e)constraintWidget;
        }
        else {
            this.b = null;
        }
    }
    
    public final a c() {
        return null;
    }
    
    public final Object getKey() {
        return this.f;
    }
}
