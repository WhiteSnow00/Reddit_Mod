// 
// Decompiled by Procyon v0.6.0
// 

package zi2;

import kotlinx.coroutines.JobSupport;
import mg2.l;
import kotlin.Result;
import kotlinx.coroutines.internal.ThreadContextKt;
import ej2.q;
import p2.b;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.CoroutineContext$b;
import gg2.d$a;
import yi2.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg.d;
import cg2.j;
import gg2.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlin.coroutines.EmptyCoroutineContext;
import mg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.CoroutineDispatcher;

public final class g
{
    public static t a() {
        return new t((z0)null);
    }
    
    public static g0 b(final c0 c0, CoroutineDispatcher instance, CoroutineStart default1, final p p5, final int n) {
        if ((n & 0x1) != 0x0) {
            instance = (CoroutineDispatcher)EmptyCoroutineContext.INSTANCE;
        }
        if ((n & 0x2) != 0x0) {
            default1 = CoroutineStart.DEFAULT;
        }
        final CoroutineContext c2 = CoroutineContextKt.c(c0, (CoroutineContext)instance);
        Object o;
        if (default1.isLazy()) {
            o = new e1(c2, p5);
        }
        else {
            o = new g0(c2, true);
        }
        default1.invoke((mg2.p<? super Object, ? super c<? super Object>, ?>)p5, o, (c<? super Object>)o);
        return (g0)o;
    }
    
    public static final Object c(final long n, final c c) {
        if (n <= 0L) {
            return j.a;
        }
        final m m = new m(1, d.e3(c));
        m.r();
        if (n < Long.MAX_VALUE) {
            e(m.j).y(n, m);
        }
        final Object q = m.q();
        if (q == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return q;
        }
        return j.a;
    }
    
    public static final Object d(long n, final c c) {
        long e = 0L;
        if (a.d(n, 0L) > 0) {
            n = (e = a.e(n));
            if (n < 1L) {
                e = 1L;
            }
        }
        final Object c2 = c(e, c);
        if (c2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return c2;
        }
        return j.a;
    }
    
    public static final h0 e(final CoroutineContext coroutineContext) {
        final int w2 = gg2.d.W2;
        final CoroutineContext$a value = coroutineContext.get((CoroutineContext$b)d$a.f);
        h0 h0;
        if (value instanceof h0) {
            h0 = (h0)value;
        }
        else {
            h0 = null;
        }
        h0 a = h0;
        if (h0 == null) {
            a = e0.a;
        }
        return a;
    }
    
    public static final q1 f(final c0 c0, final CoroutineContext coroutineContext, final CoroutineStart coroutineStart, final p p4) {
        final CoroutineContext c2 = CoroutineContextKt.c(c0, coroutineContext);
        Object o;
        if (coroutineStart.isLazy()) {
            o = new f1(c2, p4);
        }
        else {
            o = new q1(c2, true);
        }
        coroutineStart.invoke((mg2.p<? super f1, ? super c<? super Object>, ?>)p4, (f1)o, (c<? super Object>)o);
        return (q1)o;
    }
    
    public static q1 g(final c0 c0, CoroutineContext instance, CoroutineStart default1, final p p5, final int n) {
        if ((n & 0x1) != 0x0) {
            instance = (CoroutineContext)EmptyCoroutineContext.INSTANCE;
        }
        if ((n & 0x2) != 0x0) {
            default1 = CoroutineStart.DEFAULT;
        }
        return f(c0, instance, default1, p5);
    }
    
    public static final Object h(CoroutineContext coroutineContext, final p p2) throws InterruptedException {
        final Thread currentThread = Thread.currentThread();
        final gg2.d d = (gg2.d)coroutineContext.get((CoroutineContext$b)d$a.f);
        p0 p3;
        CoroutineContext c2;
        if (d == null) {
            final p0 a = u1.a();
            final CoroutineContext c = CoroutineContextKt.c((c0)s0.f, coroutineContext.plus((CoroutineContext)a));
            p3 = a;
            c2 = c;
        }
        else {
            if (d instanceof p0) {
                final p0 p4 = (p0)d;
            }
            final p0 p5 = u1.a.get();
            c2 = CoroutineContextKt.c((c0)s0.f, coroutineContext);
            p3 = p5;
        }
        coroutineContext = (CoroutineContext)new e(c2, currentThread, p3);
        CoroutineStart.DEFAULT.invoke((mg2.p<? super CoroutineContext, ? super c<? super Object>, ?>)p2, coroutineContext, (c<? super Object>)coroutineContext);
        try {
            final p0 i = ((e)coroutineContext).i;
            if (i != null) {
                final int k = p0.k;
                i.X(false);
            }
            try {
                while (!Thread.interrupted()) {
                    final p0 j = ((e)coroutineContext).i;
                    long z;
                    if (j != null) {
                        z = j.Z();
                    }
                    else {
                        z = Long.MAX_VALUE;
                    }
                    if (!((JobSupport)coroutineContext).b()) {
                        LockSupport.parkNanos(coroutineContext, z);
                    }
                    else {
                        final p0 l = ((e)coroutineContext).i;
                        if (l != null) {
                            final int m = p0.k;
                            l.V(false);
                        }
                        final Object t = b.T(((JobSupport)coroutineContext).k0());
                        if (t instanceof w) {
                            coroutineContext = (CoroutineContext)t;
                        }
                        else {
                            coroutineContext = null;
                        }
                        if (coroutineContext == null) {
                            return t;
                        }
                        throw ((w)coroutineContext).a;
                    }
                }
                final InterruptedException ex = new InterruptedException();
                ((JobSupport)coroutineContext).V((Object)ex);
                throw ex;
            }
            finally {
                final p0 i2 = ((e)coroutineContext).i;
                if (i2 != null) {
                    final int k2 = p0.k;
                    i2.V(false);
                }
            }
        }
        finally {}
    }
    
    public static Object i(final p p) throws InterruptedException {
        return h((CoroutineContext)EmptyCoroutineContext.INSTANCE, p);
    }
    
    public static final Object j(CoroutineContext coroutineContext, final p p2, c c) {
        final CoroutineContext context = ((c)c).getContext();
        if (!CoroutineContextKt.b(coroutineContext)) {
            coroutineContext = context.plus(coroutineContext);
        }
        else {
            coroutineContext = CoroutineContextKt.a(context, coroutineContext, false);
        }
        ah0.b.X(coroutineContext);
        Label_0163: {
            if (coroutineContext == context) {
                final q q = new q((c)c, coroutineContext);
                coroutineContext = (CoroutineContext)zg.a.o0(q, q, p2);
                break Label_0163;
            }
            final d$a f = d$a.f;
            if (ng2.e.a((Object)coroutineContext.get((CoroutineContext$b)f), (Object)context.get((CoroutineContext$b)f))) {
                final x1 x1 = new x1((c)c, coroutineContext);
                c = ThreadContextKt.c(coroutineContext, null);
                try {
                    final Object o0 = zg.a.o0((q)x1, (q)x1, p2);
                    ThreadContextKt.a(coroutineContext, c);
                    coroutineContext = (CoroutineContext)o0;
                    break Label_0163;
                }
                finally {
                    ThreadContextKt.a(coroutineContext, c);
                }
            }
            coroutineContext = (CoroutineContext)new kotlinx.coroutines.c((c)c, coroutineContext);
            try {
                zg.a.h0(d.e3(d.A1(p2, (Object)coroutineContext, (c)coroutineContext)), Result.constructor-impl((Object)j.a), (l)null);
                coroutineContext = (CoroutineContext)((kotlinx.coroutines.c)coroutineContext).G0();
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                return coroutineContext;
            }
            finally {
                final Throwable t;
                ((zi2.a)coroutineContext).resumeWith(Result.constructor-impl((Object)d.B1(t)));
            }
        }
    }
}
