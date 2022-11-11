// 
// Decompiled by Procyon v0.6.0
// 

package c7;

import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import q6.h;
import android.view.Choreographer$FrameCallback;

public final class d extends a implements Choreographer$FrameCallback
{
    public float h;
    public boolean i;
    public long j;
    public float k;
    public int l;
    public float m;
    public float n;
    public h o;
    public boolean p;
    
    public d() {
        this.h = 1.0f;
        this.i = false;
        this.j = 0L;
        this.k = 0.0f;
        this.l = 0;
        this.m = -2.14748365E9f;
        this.n = 2.14748365E9f;
        this.p = false;
    }
    
    public final void cancel() {
        final Iterator iterator = super.g.iterator();
        while (iterator.hasNext()) {
            ((Animator$AnimatorListener)iterator.next()).onAnimationCancel((Animator)this);
        }
        this.b(this.f());
        this.g(true);
    }
    
    public final float d() {
        final h o = this.o;
        if (o == null) {
            return 0.0f;
        }
        float n;
        if ((n = this.n) == 2.14748365E9f) {
            n = o.l;
        }
        return n;
    }
    
    public final void doFrame(final long n) {
        if (this.p) {
            this.g(false);
            Choreographer.getInstance().postFrameCallback((Choreographer$FrameCallback)this);
        }
        final h o = this.o;
        if (o != null && this.p) {
            final long j = this.j;
            long n2 = 0L;
            if (j != 0L) {
                n2 = n - j;
            }
            final float n3 = n2 / (1.0E9f / o.m / Math.abs(this.h));
            final float k = this.k;
            float n4 = n3;
            if (this.f()) {
                n4 = -n3;
            }
            final float i = k + n4;
            this.k = i;
            final float e = this.e();
            final float d = this.d();
            final PointF a = c7.f.a;
            final boolean b = i >= e && i <= d;
            this.k = c7.f.b(this.k, this.e(), this.d());
            this.j = n;
            this.c();
            if (b ^ true) {
                if (this.getRepeatCount() != -1 && this.l >= this.getRepeatCount()) {
                    float l;
                    if (this.h < 0.0f) {
                        l = this.e();
                    }
                    else {
                        l = this.d();
                    }
                    this.k = l;
                    this.g(true);
                    this.b(this.f());
                }
                else {
                    final Iterator iterator = super.g.iterator();
                    while (iterator.hasNext()) {
                        ((Animator$AnimatorListener)iterator.next()).onAnimationRepeat((Animator)this);
                    }
                    ++this.l;
                    if (this.getRepeatMode() == 2) {
                        this.i ^= true;
                        this.h = -this.h;
                    }
                    else {
                        float m;
                        if (this.f()) {
                            m = this.d();
                        }
                        else {
                            m = this.e();
                        }
                        this.k = m;
                    }
                    this.j = n;
                }
            }
            if (this.o != null) {
                final float k2 = this.k;
                if (k2 < this.m || k2 > this.n) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", this.m, this.n, this.k));
                }
            }
            ml0.a.A();
        }
    }
    
    public final float e() {
        final h o = this.o;
        if (o == null) {
            return 0.0f;
        }
        float n;
        if ((n = this.m) == -2.14748365E9f) {
            n = o.k;
        }
        return n;
    }
    
    public final boolean f() {
        return this.h < 0.0f;
    }
    
    public final void g(final boolean b) {
        Choreographer.getInstance().removeFrameCallback((Choreographer$FrameCallback)this);
        if (b) {
            this.p = false;
        }
    }
    
    public final float getAnimatedFraction() {
        if (this.o == null) {
            return 0.0f;
        }
        float n;
        float n2;
        float n3;
        if (this.f()) {
            n = this.d() - this.k;
            n2 = this.d();
            n3 = this.e();
        }
        else {
            n = this.k - this.e();
            n2 = this.d();
            n3 = this.e();
        }
        return n / (n2 - n3);
    }
    
    public final Object getAnimatedValue() {
        final h o = this.o;
        float n;
        if (o == null) {
            n = 0.0f;
        }
        else {
            final float k = this.k;
            final float i = o.k;
            n = (k - i) / (o.l - i);
        }
        return n;
    }
    
    public final long getDuration() {
        final h o = this.o;
        long n;
        if (o == null) {
            n = 0L;
        }
        else {
            n = (long)o.b();
        }
        return n;
    }
    
    public final void h(final float n) {
        if (this.k == n) {
            return;
        }
        this.k = c7.f.b(n, this.e(), this.d());
        this.j = 0L;
        this.c();
    }
    
    public final void i(float b, float b2) {
        if (b <= b2) {
            final h o = this.o;
            float k;
            if (o == null) {
                k = -3.4028235E38f;
            }
            else {
                k = o.k;
            }
            float l;
            if (o == null) {
                l = Float.MAX_VALUE;
            }
            else {
                l = o.l;
            }
            b = c7.f.b(b, k, l);
            b2 = c7.f.b(b2, k, l);
            if (b != this.m || b2 != this.n) {
                this.m = b;
                this.n = b2;
                this.h((float)(int)c7.f.b(this.k, b, b2));
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", b, b2));
    }
    
    public final boolean isRunning() {
        return this.p;
    }
    
    public final void setRepeatMode(final int repeatMode) {
        super.setRepeatMode(repeatMode);
        if (repeatMode != 2 && this.i) {
            this.i = false;
            this.h = -this.h;
        }
    }
}
