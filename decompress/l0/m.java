// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import mj2.c0;
import ah2.f;

public final class m<T, V extends i> implements a<T, V>
{
    public final l0<V> a;
    public final g0<T, V> b;
    public final T c;
    public final V d;
    public final V e;
    public final V f;
    public final T g;
    public final long h;
    
    public m(final n<T> n, final g0<T, V> b, final T c, final V v) {
        ah2.f.f((Object)n, "animationSpec");
        ah2.f.f((Object)b, "typeConverter");
        ah2.f.f((Object)v, "initialVelocityVector");
        final p0 a = n.a(b);
        ah2.f.f((Object)a, "animationSpec");
        this.a = a;
        this.b = b;
        this.c = c;
        final i d = (i)b.a().invoke((Object)c);
        this.d = (V)d;
        this.e = (V)c0.y((i)v);
        this.g = (T)b.b().invoke((Object)a.e(d, v));
        final long d2 = a.d(d, v);
        this.h = d2;
        final i y = c0.y(a.b(d2, d, v));
        this.f = (V)y;
        for (int b2 = y.b(), i = 0; i < b2; ++i) {
            final i f = this.f;
            f.e(yl.a.J(f.a(i), -this.a.a(), this.a.a()), i);
        }
    }
    
    @Override
    public final boolean a() {
        return false;
    }
    
    @Override
    public final long c() {
        return this.h;
    }
    
    @Override
    public final g0<T, V> d() {
        return this.b;
    }
    
    @Override
    public final T e(final long n) {
        if (!this.b(n)) {
            return (T)this.b.b().invoke((Object)this.a.c(n, this.d, this.e));
        }
        return this.g;
    }
    
    @Override
    public final T f() {
        return this.g;
    }
    
    @Override
    public final V g(final long n) {
        if (!this.b(n)) {
            return this.a.b(n, this.d, this.e);
        }
        return this.f;
    }
}
