// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import android.graphics.Paint;
import c7.b;
import android.graphics.Color;
import a7.j;

public final class c implements a
{
    public final a a;
    public final g b;
    public final s6.d c;
    public final s6.d d;
    public final s6.d e;
    public final s6.d f;
    public boolean g;
    
    public c(final a a, final com.airbnb.lottie.model.layer.a a2, final j j) {
        this.g = true;
        this.a = a;
        final s6.a b = j.a.b();
        this.b = (g)b;
        b.a((a)this);
        a2.c(b);
        final s6.a<Float, Float> b2 = j.b.b();
        this.c = (s6.d)b2;
        b2.a((a)this);
        a2.c((s6.a)b2);
        final s6.a<Float, Float> b3 = j.c.b();
        this.d = (s6.d)b3;
        b3.a((a)this);
        a2.c((s6.a)b3);
        final s6.a<Float, Float> b4 = j.d.b();
        this.e = (s6.d)b4;
        b4.a((a)this);
        a2.c((s6.a)b4);
        final s6.a<Float, Float> b5 = j.e.b();
        this.f = (s6.d)b5;
        b5.a((a)this);
        a2.c((s6.a)b5);
    }
    
    public final void a(final q6.a a) {
        if (!this.g) {
            return;
        }
        this.g = false;
        final double n = ((s6.a<K, Float>)this.d).f() * 0.017453292519943295;
        final float floatValue = ((s6.a<K, Float>)this.e).f();
        final float n2 = (float)Math.sin(n);
        final float n3 = (float)Math.cos(n + 3.141592653589793);
        final int intValue = (int)this.b.f();
        ((Paint)a).setShadowLayer((float)((s6.a<K, Float>)this.f).f(), n2 * floatValue, n3 * floatValue, Color.argb(Math.round(((s6.a<K, Float>)this.c).f()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }
    
    public final void b(final c7.c<Float> c) {
        if (c == null) {
            ((s6.a<K, Object>)this.c).k(null);
            return;
        }
        ((s6.a<Object, Object>)this.c).k((c7.c<Object>)new c7.c<Float>(c) {
            public final c c;
            
            @Override
            public final Object a(final c7.b b) {
                final Float n = this.c.a(b);
                Object value;
                if (n == null) {
                    value = null;
                }
                else {
                    value = n * 2.55f;
                }
                return value;
            }
        });
    }
    
    @Override
    public final void e() {
        this.g = true;
        this.a.e();
    }
}
