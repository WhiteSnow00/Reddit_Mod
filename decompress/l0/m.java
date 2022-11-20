// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import zd.b;
import ng2.e;

public final class m<T, V extends i> implements a<T, V>
{
    public final m0<V> a;
    public final h0<T, V> b;
    public final T c;
    public final V d;
    public final V e;
    public final V f;
    public final T g;
    public final long h;
    
    public m(final n<T> n, final h0<T, V> b, final T c, final V v) {
        ng2.e.f((Object)n, "animationSpec");
        ng2.e.f((Object)b, "typeConverter");
        ng2.e.f((Object)v, "initialVelocityVector");
        final q0 a = n.a((h0)b);
        ng2.e.f((Object)a, "animationSpec");
        this.a = (m0<V>)a;
        this.b = b;
        this.c = c;
        final i d = (i)b.a().invoke((Object)c);
        this.d = (V)d;
        this.e = (V)xd.a.L((i)v);
        this.g = (T)b.b().invoke((Object)a.e(d, v));
        final long d2 = a.d(d, v);
        this.h = d2;
        final i l = xd.a.L((i)a.b(d2, d, v));
        this.f = (V)l;
        for (int b2 = l.b(), i = 0; i < b2; ++i) {
            final i f = this.f;
            f.e(zd.b.w(f.a(i), -this.a.a(), this.a.a()), i);
        }
    }
    
    public final boolean a() {
        return false;
    }
    
    public final long c() {
        return this.h;
    }
    
    public final h0<T, V> d() {
        return this.b;
    }
    
    public final T e(final long n) {
        if (!((a)this).b(n)) {
            return (T)this.b.b().invoke((Object)this.a.c(n, (i)this.d, (i)this.e));
        }
        return this.g;
    }
    
    public final T f() {
        return this.g;
    }
    
    public final V g(final long n) {
        if (!((a)this).b(n)) {
            return (V)this.a.b(n, (i)this.d, (i)this.e);
        }
        return this.f;
    }
}
