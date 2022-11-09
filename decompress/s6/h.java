// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.graphics.Matrix;
import android.graphics.Canvas;
import q6.g0;
import d7.c;
import android.graphics.PointF;
import java.util.List;
import com.airbnb.lottie.LottieDrawable;
import t6.g;
import com.airbnb.lottie.model.content.GradientType;
import android.graphics.RectF;
import android.graphics.RadialGradient;
import android.graphics.LinearGradient;
import j0.f;
import t6.r;
import t6.k;

public final class h extends a
{
    public final k A;
    public r B;
    public final String r;
    public final boolean s;
    public final f<LinearGradient> t;
    public final f<RadialGradient> u;
    public final RectF v;
    public final GradientType w;
    public final int x;
    public final g y;
    public final k z;
    
    public h(final LottieDrawable lottieDrawable, final com.airbnb.lottie.model.layer.a a, final com.airbnb.lottie.model.content.a a2) {
        super(lottieDrawable, a, a2.h.toPaintCap(), a2.i.toPaintJoin(), a2.j, a2.d, a2.g, (List)a2.k, a2.l);
        this.t = (f<LinearGradient>)new f();
        this.u = (f<RadialGradient>)new f();
        this.v = new RectF();
        this.r = a2.a;
        this.w = a2.b;
        this.s = a2.m;
        this.x = (int)(lottieDrawable.f.b() / 32.0f);
        final t6.a b = a2.c.b();
        this.y = (g)b;
        b.a((t6.a.a)this);
        a.d(b);
        final t6.a<PointF, PointF> b2 = a2.e.b();
        this.z = (k)b2;
        b2.a((t6.a.a)this);
        a.d(b2);
        final t6.a<PointF, PointF> b3 = a2.f.b();
        this.A = (k)b3;
        b3.a((t6.a.a)this);
        a.d(b3);
    }
    
    public final void a(final c c, final Object o) {
        super.a(c, o);
        if (o == g0.L) {
            final r b = this.B;
            if (b != null) {
                super.f.p(b);
            }
            if (c == null) {
                this.B = null;
            }
            else {
                (this.B = new r((c<A>)c, null)).a((t6.a.a)this);
                super.f.d(this.B);
            }
        }
    }
    
    public final int[] d(int[] array) {
        final r b = this.B;
        int[] array2 = array;
        if (b != null) {
            final Integer[] array3 = b.f();
            final int length = array.length;
            final int length2 = array3.length;
            final int n = 0;
            int n2 = 0;
            if (length == length2) {
                while (true) {
                    array2 = array;
                    if (n2 >= array.length) {
                        break;
                    }
                    array[n2] = array3[n2];
                    ++n2;
                }
            }
            else {
                array = new int[array3.length];
                int n3 = n;
                while (true) {
                    array2 = array;
                    if (n3 >= array3.length) {
                        break;
                    }
                    array[n3] = array3[n3];
                    ++n3;
                }
            }
        }
        return array2;
    }
    
    public final void e(final Canvas canvas, final Matrix localMatrix, final int n) {
        if (this.s) {
            return;
        }
        this.c(this.v, localMatrix, false);
        Object shader;
        if (this.w == GradientType.LINEAR) {
            final int j = this.j();
            final f<LinearGradient> t = this.t;
            final long n2 = j;
            shader = t.e(n2, (Long)null);
            if (shader == null) {
                final PointF pointF = ((t6.a<K, PointF>)this.z).f();
                final PointF pointF2 = ((t6.a<K, PointF>)this.A).f();
                final y6.c c = (y6.c)this.y.f();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, this.d(c.b), c.a, Shader$TileMode.CLAMP);
                this.t.g(n2, shader);
            }
        }
        else {
            final int i = this.j();
            final f<RadialGradient> u = this.u;
            final long n3 = i;
            shader = u.e(n3, (Long)null);
            if (shader == null) {
                final PointF pointF3 = ((t6.a<K, PointF>)this.z).f();
                final PointF pointF4 = ((t6.a<K, PointF>)this.A).f();
                final y6.c c2 = (y6.c)this.y.f();
                final int[] d = this.d(c2.b);
                final float[] a = c2.a;
                final float x = pointF3.x;
                final float y = pointF3.y;
                shader = new RadialGradient(x, y, (float)Math.hypot(pointF4.x - x, pointF4.y - y), d, a, Shader$TileMode.CLAMP);
                this.u.g(n3, shader);
            }
        }
        ((Shader)shader).setLocalMatrix(localMatrix);
        super.i.setShader((Shader)shader);
        super.e(canvas, localMatrix, n);
    }
    
    public final String getName() {
        return this.r;
    }
    
    public final int j() {
        final int round = Math.round(((t6.a)this.z).d * this.x);
        final int round2 = Math.round(((t6.a)this.A).d * this.x);
        final int round3 = Math.round(this.y.d * this.x);
        int n;
        if (round != 0) {
            n = round * 527;
        }
        else {
            n = 17;
        }
        int n2 = n;
        if (round2 != 0) {
            n2 = n * 31 * round2;
        }
        int n3 = n2;
        if (round3 != 0) {
            n3 = n2 * 31 * round3;
        }
        return n3;
    }
}
