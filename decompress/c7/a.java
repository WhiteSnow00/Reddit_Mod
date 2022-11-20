// 
// Decompiled by Procyon v0.6.0
// 

package c7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import p6.h;

public class a<T>
{
    public final h a;
    public final T b;
    public T c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public float m;
    public float n;
    public PointF o;
    public PointF p;
    
    public a(final T t) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = t;
        this.c = t;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.MAX_VALUE;
    }
    
    public a(final h a, final PointF b, final PointF c, final Interpolator d, final Interpolator e, final Interpolator f, final float g, final Float h) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = a;
        this.b = (T)b;
        this.c = (T)c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public a(final h a, final T b, final T c, final Interpolator d, final float g, final Float h) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = null;
        this.f = null;
        this.g = g;
        this.h = h;
    }
    
    public a(final h a, final Object b, final Object c, final Interpolator e, final Interpolator f, final float g) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = a;
        this.b = (T)b;
        this.c = (T)c;
        this.d = null;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = null;
    }
    
    public final float a() {
        if (this.a == null) {
            return 1.0f;
        }
        if (this.n == Float.MIN_VALUE) {
            if (this.h == null) {
                this.n = 1.0f;
            }
            else {
                final float b = this.b();
                final float floatValue = this.h;
                final float g = this.g;
                final h a = this.a;
                this.n = (floatValue - g) / (a.l - a.k) + b;
            }
        }
        return this.n;
    }
    
    public final float b() {
        final h a = this.a;
        if (a == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            final float g = this.g;
            final float k = a.k;
            this.m = (g - k) / (a.l - k);
        }
        return this.m;
    }
    
    public final boolean c() {
        return this.d == null && this.e == null && this.f == null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Keyframe{startValue=");
        t.append(this.b);
        t.append(", endValue=");
        t.append(this.c);
        t.append(", startFrame=");
        t.append(this.g);
        t.append(", endFrame=");
        t.append(this.h);
        t.append(", interpolator=");
        t.append(this.d);
        t.append('}');
        return t.toString();
    }
}
