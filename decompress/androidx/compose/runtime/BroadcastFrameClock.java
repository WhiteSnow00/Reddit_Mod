// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import rg2.l;
import kotlin.coroutines.CoroutineContext$DefaultImpls;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext$b;
import sg2.e;
import kotlin.coroutines.CoroutineContext$a;
import rg2.p;
import lg2.c;
import yd.b;
import kotlin.Result;
import java.util.ArrayList;
import java.util.List;
import hg2.j;
import rg2.a;
import z0.d0;

public final class BroadcastFrameClock implements d0
{
    public final rg2.a<j> f;
    public final Object g;
    public Throwable h;
    public List<a<?>> i;
    public List<a<?>> j;
    
    public BroadcastFrameClock(final rg2.a<j> f) {
        this.f = f;
        this.g = new Object();
        this.i = new ArrayList<a<?>>();
        this.j = new ArrayList<a<?>>();
    }
    
    public final boolean d() {
        synchronized (this.g) {
            final boolean empty = this.i.isEmpty();
            monitorexit(this.g);
            return empty ^ true;
        }
    }
    
    public final void e(final long n) {
        synchronized (this.g) {
            final List<a<?>> i = this.i;
            this.i = this.j;
            this.j = i;
            for (int j = 0; j < i.size(); ++j) {
                final a a = i.get(j);
                final c<R> b = a.b;
                Object constructor-impl = null;
                try {
                    Result.constructor-impl((Object)a.a.invoke(n));
                }
                finally {
                    final Throwable t;
                    constructor-impl = Result.constructor-impl((Object)yd.b.o(t));
                }
                b.resumeWith(constructor-impl);
            }
            i.clear();
            final j a2 = hg2.j.a;
        }
    }
    
    public final <R> R fold(final R r, final p<? super R, ? super CoroutineContext$a, ? extends R> p2) {
        e.f((Object)p2, "operation");
        return (R)p2.invoke(r, (Object)this);
    }
    
    public final <E extends CoroutineContext$a> E get(final CoroutineContext$b<E> coroutineContext$b) {
        e.f((Object)coroutineContext$b, "key");
        return (E)CoroutineContext$a$a.a((CoroutineContext$a)this, (CoroutineContext$b)coroutineContext$b);
    }
    
    public final CoroutineContext minusKey(final CoroutineContext$b<?> coroutineContext$b) {
        e.f((Object)coroutineContext$b, "key");
        return CoroutineContext$a$a.b((CoroutineContext$a)this, (CoroutineContext$b)coroutineContext$b);
    }
    
    public final CoroutineContext plus(final CoroutineContext coroutineContext) {
        e.f((Object)coroutineContext, "context");
        return CoroutineContext$DefaultImpls.a((CoroutineContext)this, coroutineContext);
    }
    
    public final <R> Object t(final l<? super Long, ? extends R> l, final c<? super R> c) {
        final ej2.l i = new ej2.l(1, ml0.a.V((c)c));
        i.q();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object h = this.g;
        synchronized (h) {
            final Throwable h2 = this.h;
            Label_0288: {
                if (h2 != null) {
                    i.resumeWith(Result.constructor-impl((Object)b.o(h2)));
                    monitorexit(h);
                }
                else {
                    ref$ObjectRef.element = new a(l, i);
                    final boolean empty = this.i.isEmpty();
                    final int n = 0;
                    final boolean b = !empty;
                    final List<a<?>> j = this.i;
                    final Object element = ref$ObjectRef.element;
                    if (element == null) {
                        e.n("awaiter");
                        throw null;
                    }
                    j.add((a<?>)element);
                    monitorexit(h);
                    i.F((l)new BroadcastFrameClock$withFrameNanos$2.BroadcastFrameClock$withFrameNanos$2$1(this, ref$ObjectRef));
                    if (b ^ true) {
                        final rg2.a<j> f = this.f;
                        if (f != null) {
                            try {
                                f.invoke();
                            }
                            finally {
                                synchronized (this.g) {
                                    if (this.h != null) {
                                        break Label_0288;
                                    }
                                    this.h = (Throwable)h;
                                    final List<a<?>> k = this.i;
                                    for (int size = k.size(), n2 = n; n2 < size; ++n2) {
                                        ((a)k.get(n2)).b.resumeWith(Result.constructor-impl((Object)yd.b.o((Throwable)h)));
                                    }
                                    this.i.clear();
                                    h = hg2.j.a;
                                }
                            }
                        }
                    }
                }
            }
            final Object p2 = i.p();
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            return p2;
        }
    }
    
    public static final class a<R>
    {
        public final l<Long, R> a;
        public final c<R> b;
        
        public a(final l a, final ej2.l b) {
            e.f((Object)a, "onFrame");
            this.a = a;
            this.b = (c<R>)b;
        }
    }
}
