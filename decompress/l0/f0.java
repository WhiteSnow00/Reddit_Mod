// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ng2.e;

public final class f0<T, V extends i> implements a<T, V>
{
    public final j0<V> a;
    public final h0<T, V> b;
    public final T c;
    public final T d;
    public final V e;
    public final V f;
    public final V g;
    public final long h;
    public final V i;
    
    public f0() {
        throw null;
    }
    
    public f0(final d d, final h0 h0, final Object o, final Object o2) {
        this((l0.d<Object>)d, (l0.h0<Object, i>)h0, o, o2, null);
    }
    
    public f0(final d<T> d, final h0<T, V> b, final T c, final T d2, final V v) {
        ng2.e.f((Object)d, "animationSpec");
        ng2.e.f((Object)b, "typeConverter");
        final j0 a = d.a((h0)b);
        ng2.e.f((Object)a, "animationSpec");
        this.a = (j0<V>)a;
        this.b = b;
        this.c = c;
        this.d = d2;
        final i e = (i)b.a().invoke((Object)c);
        this.e = (V)e;
        final i f = (i)b.a().invoke((Object)d2);
        this.f = (V)f;
        i g;
        if (v != null) {
            g = xd.a.L((i)v);
        }
        else {
            g = xd.a.w0((i)b.a().invoke((Object)c));
        }
        this.g = (V)g;
        this.h = a.b(e, f, g);
        this.i = (V)a.e(e, f, g);
    }
    
    public final boolean a() {
        return this.a.a();
    }
    
    public final long c() {
        return this.h;
    }
    
    public final h0<T, V> d() {
        return this.b;
    }
    
    public final T e(final long n) {
        Object o;
        if (!((a)this).b(n)) {
            final i c = this.a.c(n, (i)this.e, (i)this.f, (i)this.g);
            for (int i = 0; i < c.b(); ++i) {
                if (!(Float.isNaN(c.a(i)) ^ true)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("AnimationVector cannot contain a NaN. ");
                    sb.append(c);
                    sb.append(". Animation: ");
                    sb.append(this);
                    sb.append(", playTimeNanos: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            o = this.b.b().invoke((Object)c);
        }
        else {
            o = this.d;
        }
        return (T)o;
    }
    
    public final T f() {
        return this.d;
    }
    
    public final V g(final long n) {
        i i;
        if (!((a)this).b(n)) {
            i = this.a.g(n, (i)this.e, (i)this.f, (i)this.g);
        }
        else {
            i = this.i;
        }
        return (V)i;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("TargetBasedAnimation: ");
        t.append(this.c);
        t.append(" -> ");
        t.append(this.d);
        t.append(",initial velocity: ");
        t.append(this.g);
        t.append(", duration: ");
        t.append(((a)this).c() / 1000000L);
        t.append(" ms,animationSpec: ");
        t.append(this.a);
        return t.toString();
    }
}
