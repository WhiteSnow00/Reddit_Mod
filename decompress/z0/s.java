// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import kotlinx.coroutines.JobSupport;
import zi2.b1;
import zi2.z0;
import mg.d0;
import zi2.w;
import ah0.b;
import kotlin.coroutines.CoroutineContext$b;
import zi2.z0$b;
import ej2.f;
import kotlin.coroutines.EmptyCoroutineContext;
import mg2.a;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import mg2.p;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import mg2.l;

public final class s
{
    public static final q a;
    
    static {
        a = new q();
    }
    
    public static final void a(Object b, final Object o, final Object o2, final l l, final d d) {
        e.f((Object)l, "effect");
        d.A(-1239538271);
        final mg2.q a = ComposerKt.a;
        d.A(1618982084);
        final boolean m = d.m(b);
        final boolean i = d.m(o);
        final boolean j = d.m(o2);
        b = d.B();
        if ((m | i | j) || b == d$a.a) {
            d.w((Object)new o(l));
        }
        d.H();
        d.H();
    }
    
    public static final void b(Object b, final Object o, final l l, final d d) {
        e.f((Object)l, "effect");
        d.A(1429097729);
        final mg2.q a = ComposerKt.a;
        d.A(511388516);
        final boolean m = d.m(b);
        final boolean i = d.m(o);
        b = d.B();
        if ((m | i) || b == d$a.a) {
            d.w((Object)new o(l));
        }
        d.H();
        d.H();
    }
    
    public static final void c(Object b, final l l, final d d) {
        e.f((Object)l, "effect");
        d.A(-1371986847);
        final mg2.q a = ComposerKt.a;
        d.A(1157296644);
        final boolean m = d.m(b);
        b = d.B();
        if (m || b == d$a.a) {
            d.w((Object)new o(l));
        }
        d.H();
        d.H();
    }
    
    public static final void d(Object b, final Object o, final Object o2, final p p5, final d d) {
        d.A(-54093371);
        final mg2.q a = ComposerKt.a;
        final CoroutineContext v = d.v();
        d.A(1618982084);
        final boolean m = d.m(b);
        final boolean i = d.m(o);
        final boolean j = d.m(o2);
        b = d.B();
        if ((m | i | j) || b == d$a.a) {
            d.w((Object)new a0(v, p5));
        }
        d.H();
        d.H();
    }
    
    public static final void e(Object b, final Object o, final p p4, final d d) {
        e.f((Object)p4, "block");
        d.A(590241125);
        final mg2.q a = ComposerKt.a;
        final CoroutineContext v = d.v();
        d.A(511388516);
        final boolean m = d.m(b);
        final boolean i = d.m(o);
        b = d.B();
        if ((m | i) || b == d$a.a) {
            d.w((Object)new a0(v, p4));
        }
        d.H();
        d.H();
    }
    
    public static final void f(Object b, final p p3, final d d) {
        e.f((Object)p3, "block");
        d.A(1179185413);
        final mg2.q a = ComposerKt.a;
        final CoroutineContext v = d.v();
        d.A(1157296644);
        final boolean m = d.m(b);
        b = d.B();
        if (m || b == d$a.a) {
            d.w((Object)new a0(v, p3));
        }
        d.H();
        d.H();
    }
    
    public static final void g(Object[] copy, final p p3, final d d) {
        e.f((Object)copy, "keys");
        e.f((Object)p3, "block");
        d.A(-139560008);
        final mg2.q a = ComposerKt.a;
        final CoroutineContext v = d.v();
        copy = Arrays.copyOf(copy, copy.length);
        d.A(-568225417);
        final int length = copy.length;
        int i = 0;
        boolean b = false;
        while (i < length) {
            b |= d.m(copy[i]);
            ++i;
        }
        final Object b2 = d.B();
        if (b || b2 == d$a.a) {
            d.w((Object)new a0(v, p3));
        }
        d.H();
        final mg2.q a2 = ComposerKt.a;
        d.H();
    }
    
    public static final void h(final a a, final d d) {
        e.f((Object)a, "effect");
        d.A(-1288466761);
        final mg2.q a2 = ComposerKt.a;
        d.I(a);
        d.H();
    }
    
    public static final f i(final EmptyCoroutineContext emptyCoroutineContext, final d d) {
        e.f((Object)emptyCoroutineContext, "coroutineContext");
        e.f((Object)d, "composer");
        final z0$b f = z0$b.f;
        f f2;
        if (((CoroutineContext)emptyCoroutineContext).get((CoroutineContext$b)f) != null) {
            final b1 m = b.m();
            ((JobSupport)m).q0((Object)new w(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
            f2 = d0.c((CoroutineContext)m);
        }
        else {
            final CoroutineContext v = d.v();
            f2 = d0.c(v.plus((CoroutineContext)new b1((z0)v.get((CoroutineContext$b)f))).plus((CoroutineContext)emptyCoroutineContext));
        }
        return f2;
    }
}
