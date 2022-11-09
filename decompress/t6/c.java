// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import android.graphics.Color;
import x6.b;
import b7.j;

public final class c implements a
{
    public final a a;
    public final t6.a<Integer, Integer> b;
    public final t6.d c;
    public final t6.d d;
    public final t6.d e;
    public final t6.d f;
    public boolean g;
    
    public c(final a a, final com.airbnb.lottie.model.layer.a a2, final j j) {
        this.g = true;
        this.a = a;
        final t6.a b = ((x6.a)j.f).b();
        (this.b = b).a((a)this);
        a2.d(b);
        final t6.a<Float, Float> b2 = ((x6.b)j.g).b();
        this.c = (t6.d)b2;
        b2.a((a)this);
        a2.d(b2);
        final t6.a<Float, Float> b3 = ((x6.b)j.h).b();
        this.d = (t6.d)b3;
        b3.a((a)this);
        a2.d(b3);
        final t6.a<Float, Float> b4 = ((x6.b)j.i).b();
        this.e = (t6.d)b4;
        b4.a((a)this);
        a2.d(b4);
        final t6.a<Float, Float> b5 = ((x6.b)j.j).b();
        this.f = (t6.d)b5;
        b5.a((a)this);
        a2.d(b5);
    }
    
    public final void a(final r6.a a) {
        if (!this.g) {
            return;
        }
        this.g = false;
        final double n = ((t6.a<K, Float>)this.d).f() * 0.017453292519943295;
        final float floatValue = ((t6.a<K, Float>)this.e).f();
        final float n2 = (float)Math.sin(n);
        final float n3 = (float)Math.cos(n + 3.141592653589793);
        final int intValue = this.b.f();
        a.setShadowLayer((float)((t6.a<K, Float>)this.f).f(), n2 * floatValue, n3 * floatValue, Color.argb(Math.round(((t6.a<K, Float>)this.c).f()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }
    
    public final void b(final d7.c<Float> c) {
        if (c == null) {
            ((t6.a<K, Object>)this.c).k(null);
            return;
        }
        ((t6.a<Object, Object>)this.c).k((d7.c<Object>)new d7.c<Float>() {
            public final Object a(final d7.b b) {
                final Float n = (Float)c.a(b);
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
    public final void g() {
        this.g = true;
        this.a.g();
    }
}
