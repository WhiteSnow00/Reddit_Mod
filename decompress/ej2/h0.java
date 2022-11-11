// 
// Decompiled by Procyon v0.6.0
// 

package ej2;

import kotlin.coroutines.CoroutineContext;
import hg2.j;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext$b;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.internal.ThreadContextKt;
import jj2.g;
import lg.e0;
import kotlinx.coroutines.CoroutinesInternalError;
import sg2.e;
import lw0.b;
import lg2.c;
import java.util.concurrent.CancellationException;
import mj2.f;

public abstract class h0<T> extends f
{
    public int h;
    
    public h0(final int h) {
        this.h = h;
    }
    
    public void a(final CancellationException ex, final Object o) {
    }
    
    public abstract c<T> b();
    
    public Throwable c(final Object o) {
        final boolean b = o instanceof v;
        Throwable a = null;
        v v;
        if (b) {
            v = (v)o;
        }
        else {
            v = null;
        }
        if (v != null) {
            a = v.a;
        }
        return a;
    }
    
    public <T> T d(final Object o) {
        return (T)o;
    }
    
    public final void e(final Throwable t, final Throwable t2) {
        if (t == null && t2 == null) {
            return;
        }
        if (t != null && t2 != null) {
            b.u(t, t2);
        }
        Throwable t3;
        if ((t3 = t) == null) {
            t3 = t2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        final String string = sb.toString();
        e.c((Object)t3);
        e0.V(this.b().getContext(), (Throwable)new CoroutinesInternalError(string, t3));
    }
    
    public abstract Object f();
    
    public final void run() {
        final mj2.g g = super.g;
        try {
            final g g2 = (g)this.b();
            final c j = g2.j;
            final Object l = g2.l;
            final CoroutineContext context = j.getContext();
            final Object c = ThreadContextKt.c(context, l);
            w1 d;
            if (c != ThreadContextKt.a) {
                d = CoroutineContextKt.d(j, context, c);
            }
            else {
                d = null;
            }
        Block_12_Outer:
            while (true) {
                Label_0203: {
                    try {
                        final CoroutineContext context2 = j.getContext();
                        final Object f = this.f();
                        final Throwable c2 = this.c(f);
                        z0 z0 = null;
                        Label_0149: {
                            if (c2 == null) {
                                final int h = this.h;
                                int n = 1;
                                if (h != 1) {
                                    if (h == 2) {
                                        n = n;
                                    }
                                    else {
                                        n = 0;
                                    }
                                }
                                if (n != 0) {
                                    z0 = (z0)context2.get((CoroutineContext$b)ej2.z0.b.f);
                                    break Label_0149;
                                }
                            }
                            z0 = null;
                        }
                        if (z0 != null && !z0.isActive()) {
                            final CancellationException g3 = z0.G();
                            this.a(g3, f);
                            j.resumeWith(Result.constructor-impl((Object)yd.b.o((Throwable)g3)));
                            break Label_0240;
                        }
                        break Label_0203;
                    }
                    finally {
                        if (d == null || d.G0()) {
                            ThreadContextKt.a(context, c);
                        }
                        final j a = hg2.j.a;
                        iftrue(Label_0263:)(d != null && !d.G0());
                        Label_0256: {
                            break Label_0256;
                            while (true) {
                                final Throwable c2;
                                j.resumeWith(Result.constructor-impl((Object)yd.b.o(c2)));
                                continue Block_12_Outer;
                                Label_0225: {
                                    final Object f;
                                    j.resumeWith(Result.constructor-impl(this.d(f)));
                                }
                                continue Block_12_Outer;
                                iftrue(Label_0225:)(c2 == null);
                                continue;
                            }
                        }
                        ThreadContextKt.a(context, c);
                        Object constructor-impl;
                        try {
                            Label_0263: {
                                g.a();
                            }
                            Result.constructor-impl((Object)hg2.j.a);
                        }
                        finally {
                            final Throwable t;
                            constructor-impl = Result.constructor-impl((Object)yd.b.o(t));
                        }
                        this.e(null, Result.exceptionOrNull-impl(constructor-impl));
                    }
                }
                break;
            }
        }
        finally {
            Object constructor-impl2;
            try {
                g.a();
                Result.constructor-impl((Object)j.a);
            }
            finally {
                final Throwable t2;
                constructor-impl2 = Result.constructor-impl((Object)yd.b.o(t2));
            }
            final Throwable t3;
            this.e(t3, Result.exceptionOrNull-impl(constructor-impl2));
        }
    }
}
