// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import android.graphics.Paint$Style;
import android.graphics.PathEffect;
import a4.u1;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import android.graphics.ColorFilter;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.os.Build$VERSION;
import at1.a;
import android.graphics.Shader;
import android.graphics.Paint;

public final class f implements a0
{
    public Paint a;
    public int b;
    public Shader c;
    public s d;
    
    public f() {
        this.a = new Paint(7);
        this.b = 3;
    }
    
    public final long a() {
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        return at1.a.e(a.getColor());
    }
    
    public final void b(int n) {
        final Paint a = this.a;
        ah2.f.f((Object)a, "$this$setNativeFilterQuality");
        if (n == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        a.setFilterBitmap((boolean)((n ^ 0x1) != 0x0));
    }
    
    public final void c(final long n) {
        final Paint a = this.a;
        ah2.f.f((Object)a, "$this$setNativeColor");
        a.setColor(at1.a.X1(n));
    }
    
    public final void d(final float n) {
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        a.setAlpha((int)(float)Math.rint(n * 255.0f));
    }
    
    public final Paint e() {
        return this.a;
    }
    
    public final Shader f() {
        return this.c;
    }
    
    public final void g(final int b) {
        this.b = b;
        final Paint a = this.a;
        ah2.f.f((Object)a, "$this$setNativeBlendMode");
        if (Build$VERSION.SDK_INT >= 29) {
            r0.a.a(a, b);
        }
        else {
            a.setXfermode((Xfermode)new PorterDuffXfermode(o1.a.b(b)));
        }
    }
    
    public final s h() {
        return this.d;
    }
    
    public final int i() {
        return this.b;
    }
    
    public final void j(final s d) {
        this.d = d;
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        ColorFilter a2;
        if (d != null) {
            a2 = d.a;
        }
        else {
            a2 = null;
        }
        a.setColorFilter(a2);
    }
    
    public final void k(final Shader shader) {
        this.c = shader;
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        a.setShader(shader);
    }
    
    public final int l() {
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        return a.isFilterBitmap() ? 1 : 0;
    }
    
    public final int m() {
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        final Paint$Cap strokeCap = a.getStrokeCap();
        int n;
        if (strokeCap == null) {
            n = -1;
        }
        else {
            n = g.a[((Enum)strokeCap).ordinal()];
        }
        int n2 = 0;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    n2 = n2;
                }
                else {
                    n2 = 2;
                }
            }
            else {
                n2 = 1;
            }
        }
        return n2;
    }
    
    public final int n() {
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        final Paint$Join strokeJoin = a.getStrokeJoin();
        int n;
        if (strokeJoin == null) {
            n = -1;
        }
        else {
            n = g.b[((Enum)strokeJoin).ordinal()];
        }
        int n2 = 0;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    n2 = n2;
                }
                else {
                    n2 = 1;
                }
            }
            else {
                n2 = 2;
            }
        }
        return n2;
    }
    
    public final float o() {
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        return a.getStrokeMiter();
    }
    
    public final float p() {
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        return a.getStrokeWidth();
    }
    
    public final void q(final u1 u1) {
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        a.setPathEffect((PathEffect)null);
    }
    
    public final void r(final int n) {
        final Paint a = this.a;
        ah2.f.f((Object)a, "$this$setNativeStrokeCap");
        final int n2 = 0;
        Paint$Cap strokeCap;
        if (n == 2) {
            strokeCap = Paint$Cap.SQUARE;
        }
        else if (n == 1) {
            strokeCap = Paint$Cap.ROUND;
        }
        else {
            int n3 = n2;
            if (n == 0) {
                n3 = 1;
            }
            if (n3 != 0) {
                strokeCap = Paint$Cap.BUTT;
            }
            else {
                strokeCap = Paint$Cap.BUTT;
            }
        }
        a.setStrokeCap(strokeCap);
    }
    
    public final void s(final int n) {
        final Paint a = this.a;
        ah2.f.f((Object)a, "$this$setNativeStrokeJoin");
        final int n2 = 0;
        Paint$Join strokeJoin;
        if (n == 0) {
            strokeJoin = Paint$Join.MITER;
        }
        else if (n == 2) {
            strokeJoin = Paint$Join.BEVEL;
        }
        else {
            int n3 = n2;
            if (n == 1) {
                n3 = 1;
            }
            if (n3 != 0) {
                strokeJoin = Paint$Join.ROUND;
            }
            else {
                strokeJoin = Paint$Join.MITER;
            }
        }
        a.setStrokeJoin(strokeJoin);
    }
    
    public final void t(final float strokeMiter) {
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        a.setStrokeMiter(strokeMiter);
    }
    
    public final float u() {
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        return a.getAlpha() / 255.0f;
    }
    
    public final void v(final float strokeWidth) {
        final Paint a = this.a;
        ah2.f.f((Object)a, "<this>");
        a.setStrokeWidth(strokeWidth);
    }
    
    public final void w(int n) {
        final Paint a = this.a;
        ah2.f.f((Object)a, "$this$setNativeStyle");
        final int n2 = 1;
        if (n == 1) {
            n = n2;
        }
        else {
            n = 0;
        }
        Paint$Style style;
        if (n != 0) {
            style = Paint$Style.STROKE;
        }
        else {
            style = Paint$Style.FILL;
        }
        a.setStyle(style);
    }
}
