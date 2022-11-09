// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import kotlinx.coroutines.JobSupport;
import mj2.b1;
import mj2.z0;
import mj2.g;
import mj2.v;
import kotlin.coroutines.CoroutineContext$b;
import mj2.z0$b;
import kotlin.coroutines.EmptyCoroutineContext;
import zg2.a;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import pg2.j;
import tg2.c;
import ah2.f;
import zg2.l;

public final class s
{
    public static final q a;
    
    static {
        a = new q();
    }
    
    public static final void a(Object b, final Object o, final Object o2, final l l, final d d) {
        f.f((Object)l, "effect");
        d.A(-1239538271);
        d.A(1618982084);
        final boolean i = d.l(b);
        final boolean j = d.l(o);
        final boolean k = d.l(o2);
        b = d.B();
        if ((i | j | k) || b == d$a.a) {
            d.v(new o((l<? super q, ? extends p>)l));
        }
        d.I();
        d.I();
    }
    
    public static final void b(Object b, final Object o, final l l, final d d) {
        f.f((Object)l, "effect");
        d.A(1429097729);
        d.A(511388516);
        final boolean i = d.l(b);
        final boolean j = d.l(o);
        b = d.B();
        if ((i | j) || b == d$a.a) {
            d.v(new o((l<? super q, ? extends p>)l));
        }
        d.I();
        d.I();
    }
    
    public static final void c(Object b, final l l, final d d) {
        f.f((Object)l, "effect");
        d.A(-1371986847);
        d.A(1157296644);
        final boolean i = d.l(b);
        b = d.B();
        if (i || b == d$a.a) {
            d.v(new o((l<? super q, ? extends p>)l));
        }
        d.I();
        d.I();
    }
    
    public static final void d(Object b, final Object o, final Object o2, final zg2.p p5, final d d) {
        d.A(-54093371);
        final CoroutineContext u = d.u();
        d.A(1618982084);
        final boolean l = d.l(b);
        final boolean i = d.l(o);
        final boolean j = d.l(o2);
        b = d.B();
        if ((l | i | j) || b == d$a.a) {
            d.v(new b0(u, (zg2.p<? super mj2.b0, ? super c<? super j>, ?>)p5));
        }
        d.I();
        d.I();
    }
    
    public static final void e(Object b, final Object o, final zg2.p p4, final d d) {
        f.f((Object)p4, "block");
        d.A(590241125);
        final CoroutineContext u = d.u();
        d.A(511388516);
        final boolean l = d.l(b);
        final boolean i = d.l(o);
        b = d.B();
        if ((l | i) || b == d$a.a) {
            d.v(new b0(u, (zg2.p<? super mj2.b0, ? super c<? super j>, ?>)p4));
        }
        d.I();
        d.I();
    }
    
    public static final void f(Object b, final zg2.p p3, final d d) {
        f.f((Object)p3, "block");
        d.A(1179185413);
        final CoroutineContext u = d.u();
        d.A(1157296644);
        final boolean l = d.l(b);
        b = d.B();
        if (l || b == d$a.a) {
            d.v(new b0(u, (zg2.p<? super mj2.b0, ? super c<? super j>, ?>)p3));
        }
        d.I();
        d.I();
    }
    
    public static final void g(Object[] copy, final zg2.p p3, final d d) {
        f.f((Object)copy, "keys");
        f.f((Object)p3, "block");
        d.A(-139560008);
        final CoroutineContext u = d.u();
        copy = Arrays.copyOf(copy, copy.length);
        d.A(-568225417);
        final int length = copy.length;
        int i = 0;
        boolean b = false;
        while (i < length) {
            b |= d.l(copy[i]);
            ++i;
        }
        final Object b2 = d.B();
        if (b || b2 == d$a.a) {
            d.v(new b0(u, (zg2.p<? super mj2.b0, ? super c<? super j>, ?>)p3));
        }
        d.I();
        d.I();
    }
    
    public static final void h(final a a, final d d) {
        f.f((Object)a, "effect");
        d.A(-1288466761);
        d.F((a<j>)a);
        d.I();
    }
    
    public static final rj2.f i(final EmptyCoroutineContext emptyCoroutineContext, final d d) {
        f.f((Object)emptyCoroutineContext, "coroutineContext");
        f.f((Object)d, "composer");
        final z0$b f = z0$b.f;
        rj2.f f2;
        if (((CoroutineContext)emptyCoroutineContext).get((CoroutineContext$b)f) != null) {
            final b1 i = at1.a.i();
            ((JobSupport)i).q0((Object)new v((Throwable)new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
            f2 = g.a((CoroutineContext)i);
        }
        else {
            final CoroutineContext u = d.u();
            f2 = g.a(u.plus((CoroutineContext)new b1((z0)u.get((CoroutineContext$b)f))).plus((CoroutineContext)emptyCoroutineContext));
        }
        return f2;
    }
}
