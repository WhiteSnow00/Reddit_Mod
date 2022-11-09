// 
// Decompiled by Procyon v0.6.0
// 

package q2;

import android.graphics.Paint;
import n1.c;
import o1.r;
import o1.j0;
import o1.m0;
import android.graphics.Shader;
import n1.f;
import o1.n;
import o1.k0;
import t2.e;
import android.text.TextPaint;

public final class a extends TextPaint
{
    public e a;
    public k0 b;
    public n c;
    public f d;
    
    public a(final float density) {
        super(1);
        super.density = density;
        this.a = e.b;
        this.b = k0.d;
    }
    
    public final void a(final n c, final long n) {
        if (c == null) {
            ((Paint)this).setShader((Shader)null);
            return;
        }
        final boolean a = ah2.f.a((Object)this.c, (Object)c);
        boolean b = false;
        if (a) {
            final f d = this.d;
            if (d != null && f.b(d.a, n)) {
                return;
            }
        }
        this.c = c;
        this.d = new f(n);
        if (c instanceof m0) {
            ((Paint)this).setShader((Shader)null);
            this.b(((m0)c).a);
        }
        else if (c instanceof j0) {
            final int d2 = f.d;
            if (n != f.c) {
                b = true;
            }
            if (b) {
                ((Paint)this).setShader(((j0)c).b(n));
            }
        }
    }
    
    public final void b(final long n) {
        final int m = r.m;
        if (n != r.l) {
            final int x1 = at1.a.X1(n);
            if (((Paint)this).getColor() != x1) {
                ((Paint)this).setColor(x1);
            }
        }
    }
    
    public final void c(k0 k0) {
        k0 d = k0;
        if (k0 == null) {
            k0 = k0.d;
            d = k0.d;
        }
        if (!ah2.f.a((Object)this.b, (Object)d)) {
            this.b = d;
            k0 = k0.d;
            if (ah2.f.a((Object)d, (Object)k0.d)) {
                ((Paint)this).clearShadowLayer();
            }
            else {
                k0 = this.b;
                ((Paint)this).setShadowLayer(k0.c, n1.c.c(k0.b), n1.c.d(this.b.b), at1.a.X1(this.b.a));
            }
        }
    }
    
    public final void d(final e e) {
        e b = e;
        if (e == null) {
            b = e.b;
        }
        if (!ah2.f.a((Object)this.a, (Object)b)) {
            this.a = b;
            ((Paint)this).setUnderlineText(b.a(e.c));
            ((Paint)this).setStrikeThruText(this.a.a(e.d));
        }
    }
}
