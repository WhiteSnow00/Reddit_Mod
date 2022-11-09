// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import mj2.c0;
import ah2.f;

public final class e0<T, V extends i> implements a<T, V>
{
    public final i0<V> a;
    public final g0<T, V> b;
    public final T c;
    public final T d;
    public final V e;
    public final V f;
    public final V g;
    public final long h;
    public final V i;
    
    public e0() {
        throw null;
    }
    
    public e0(final d<T> d, final g0<T, V> b, final T c, final T d2, final V v) {
        ah2.f.f((Object)d, "animationSpec");
        ah2.f.f((Object)b, "typeConverter");
        final i0<V> a = d.a(b);
        ah2.f.f((Object)a, "animationSpec");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d2;
        final i e = (i)b.a().invoke((Object)c);
        this.e = (V)e;
        final i f = (i)b.a().invoke((Object)d2);
        this.f = (V)f;
        i g;
        if (v != null) {
            g = c0.y((i)v);
        }
        else {
            final i i = (i)b.a().invoke((Object)c);
            ah2.f.f((Object)i, "<this>");
            g = i.c();
        }
        this.g = (V)g;
        this.h = a.b((V)e, (V)f, (V)g);
        this.i = a.d((V)e, (V)f, (V)g);
    }
    
    @Override
    public final boolean a() {
        return this.a.a();
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
        Object o;
        if (!this.b(n)) {
            o = this.b.b().invoke((Object)this.a.c(n, this.e, this.f, this.g));
        }
        else {
            o = this.d;
        }
        return (T)o;
    }
    
    @Override
    public final T f() {
        return this.d;
    }
    
    @Override
    public final V g(final long n) {
        i i;
        if (!this.b(n)) {
            i = this.a.g(n, this.e, this.f, this.g);
        }
        else {
            i = this.i;
        }
        return (V)i;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("TargetBasedAnimation: ");
        k.append(this.c);
        k.append(" -> ");
        k.append(this.d);
        k.append(",initial velocity: ");
        k.append(this.g);
        k.append(", duration: ");
        k.append(this.c() / 1000000L);
        k.append(" ms");
        return k.toString();
    }
}
