// 
// Decompiled by Procyon v0.6.0
// 

package ff2;

import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleFlatMapPublisher;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.internal.operators.single.SingleFlatMapMaybe;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.internal.operators.single.SingleFlatMap;
import uf2.e;
import io.reactivex.internal.operators.single.SingleDoFinally;
import io.reactivex.internal.operators.single.SingleCache;
import of2.f;
import io.reactivex.internal.operators.single.SingleToObservable;
import nf2.d;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.operators.single.SingleTimeout;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import uf2.m;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.flowable.b;
import uf2.j;
import java.util.concurrent.Callable;
import uf2.i;
import io.reactivex.internal.functions.Functions$w;
import io.reactivex.internal.operators.single.SingleCreate;
import qf2.k;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.operators.single.SingleInternalHelper;
import java.util.List;
import io.reactivex.internal.operators.single.SingleZipArray;
import java.util.NoSuchElementException;
import kf2.c;
import kf2.h;
import kf2.o;
import io.reactivex.internal.functions.Functions;
import kf2.n;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.single.SingleTimer;
import eg2.a;
import java.util.concurrent.TimeUnit;

public abstract class c0<T> implements g0<T>
{
    public static c0<Long> J(final long n, final TimeUnit timeUnit) {
        final b0 a = eg2.a.a();
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (a != null) {
            return RxJavaPlugins.onAssembly((c0<Long>)new SingleTimer(n, timeUnit, a));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static c0 O(final c0 c0, final c0 c2, final c0 c3, final c0 c4, final c0 c5, final c0 c6, final c0 c7, final c0 c8, final c0 c9, final n n) {
        if (c4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (c5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (c6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (c7 == null) {
            throw new NullPointerException("source7 is null");
        }
        if (c8 == null) {
            throw new NullPointerException("source8 is null");
        }
        if (c9 != null) {
            return R((kf2.o<? super Object[], ?>)Functions.j(n), (ff2.g0<?>[])new g0[] { (g0)c0, (g0)c2, (g0)c3, (g0)c4, (g0)c5, (g0)c6, (g0)c7, (g0)c8, (g0)c9 });
        }
        throw new NullPointerException("source9 is null");
    }
    
    public static c0 P(final c0 c0, final c0 c2, final c0 c3, final h h) {
        if (c0 != null) {
            return R((kf2.o<? super Object[], ?>)Functions.d(h), (ff2.g0<?>[])new g0[] { (g0)c0, (g0)c2, (g0)c3 });
        }
        throw new NullPointerException("source1 is null");
    }
    
    public static <T1, T2, R> c0<R> Q(final g0<? extends T1> g0, final g0<? extends T2> g2, final c<? super T1, ? super T2, ? extends R> c) {
        if (g0 == null) {
            throw new NullPointerException("source1 is null");
        }
        if (g2 != null) {
            return R((kf2.o<? super Object[], ? extends R>)Functions.c(c), (ff2.g0<?>[])new g0[] { g0, g2 });
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T, R> c0<R> R(final o<? super Object[], ? extends R> o, final g0<? extends T>... array) {
        if (array.length == 0) {
            return o(new NoSuchElementException());
        }
        return RxJavaPlugins.onAssembly((c0<R>)new SingleZipArray((o)o, (g0[])array));
    }
    
    public static g g(final List list) {
        final g<Object> fromIterable = g.fromIterable((Iterable<?>)list);
        if (fromIterable != null) {
            mf2.a.c(2, "prefetch");
            return RxJavaPlugins.onAssembly((g<Object>)new k((g)fromIterable, (o)SingleInternalHelper.a(), ErrorMode.IMMEDIATE));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> c0<T> h(final f0<T> f0) {
        return RxJavaPlugins.onAssembly((c0<T>)new SingleCreate((f0)f0));
    }
    
    public static <T> c0<T> o(final Throwable t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly(new i<T>(new Functions$w((Object)t)));
        }
        throw new NullPointerException("exception is null");
    }
    
    public static <T> c0<T> u(final Callable<? extends T> callable) {
        return RxJavaPlugins.onAssembly(new j<T>(callable));
    }
    
    public static <T> c0<T> v(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly(new uf2.k<T>(t));
        }
        throw new NullPointerException("item is null");
    }
    
    public static g x(final g g) {
        if (g != null) {
            return RxJavaPlugins.onAssembly((g<Object>)new b(g, SingleInternalHelper.a(), g.bufferSize()));
        }
        throw new NullPointerException("sources is null");
    }
    
    public final c0<T> A(final o<? super Throwable, ? extends g0<? extends T>> o) {
        return RxJavaPlugins.onAssembly((c0<T>)new SingleResumeNext((g0)this, (o)o));
    }
    
    public final c0<T> B(final o<Throwable, ? extends T> o) {
        return RxJavaPlugins.onAssembly(new m<T>((ff2.g0<? extends T>)this, o, null));
    }
    
    public final c0<T> C(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly(new m<T>((ff2.g0<? extends T>)this, null, t));
        }
        throw new NullPointerException("value is null");
    }
    
    public final g<T> D(final o<? super g<Object>, ? extends qt2.b<?>> o) {
        return this.L().repeatWhen(o);
    }
    
    public final if2.a E() {
        return this.F((kf2.g<? super T>)Functions.d, (kf2.g<? super Throwable>)Functions.e);
    }
    
    public final if2.a F(final kf2.g<? super T> g, final kf2.g<? super Throwable> g2) {
        if (g == null) {
            throw new NullPointerException("onSuccess is null");
        }
        if (g2 != null) {
            final ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver((kf2.g)g, (kf2.g)g2);
            this.b((e0<? super T>)consumerSingleObserver);
            return (if2.a)consumerSingleObserver;
        }
        throw new NullPointerException("onError is null");
    }
    
    public abstract void G(final e0<? super T> p0);
    
    public final c0<T> H(final b0 b0) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((c0<T>)new SingleSubscribeOn((g0)this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final c0<T> I(final long n, final TimeUnit timeUnit) {
        final b0 a = eg2.a.a();
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (a != null) {
            return RxJavaPlugins.onAssembly((c0<T>)new SingleTimeout((g0)this, n, timeUnit, a));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    @Deprecated
    public final ff2.a K() {
        return RxJavaPlugins.onAssembly((ff2.a)new pf2.h((g0)this));
    }
    
    public final g<T> L() {
        if (this instanceof nf2.b) {
            return ((nf2.b)this).d();
        }
        return RxJavaPlugins.onAssembly((g<T>)new SingleToFlowable((g0)this));
    }
    
    public final ff2.n<T> M() {
        if (this instanceof nf2.c) {
            return (ff2.n<T>)((nf2.c)this).c();
        }
        return RxJavaPlugins.onAssembly((ff2.n<T>)new rf2.h((g0)this));
    }
    
    public final t<T> N() {
        if (this instanceof d) {
            return (t<T>)((d)this).a();
        }
        return RxJavaPlugins.onAssembly((ff2.t<T>)new SingleToObservable((g0)this));
    }
    
    public final void b(final e0<? super T> e0) {
        if (e0 != null) {
            final ff2.e0<? super Object> onSubscribe = RxJavaPlugins.onSubscribe((c0<Object>)this, (ff2.e0<? super Object>)e0);
            mf2.a.b((Object)onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            try {
                this.G(onSubscribe);
                return;
            }
            catch (final NullPointerException ex) {
                throw ex;
            }
            finally {
                final Throwable t;
                ej2.c0.i4(t);
                final NullPointerException ex2 = new NullPointerException("subscribeActual failed");
                ex2.initCause(t);
                throw ex2;
            }
        }
        throw new NullPointerException("observer is null");
    }
    
    public final T e() {
        final f f = new f();
        this.b((e0<? super T>)f);
        return (T)f.a();
    }
    
    public final c0<T> f() {
        return RxJavaPlugins.onAssembly((c0<T>)new SingleCache((g0)this));
    }
    
    public final c0 i(final long n, final TimeUnit timeUnit, final b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly(new uf2.b<Object>((g0)this, n, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final c0<T> j(final kf2.a a) {
        return RxJavaPlugins.onAssembly(new uf2.d<T>((ff2.g0<T>)this, a));
    }
    
    public final c0<T> k(final kf2.a a) {
        return RxJavaPlugins.onAssembly((c0<T>)new SingleDoFinally((g0)this, a));
    }
    
    public final c0<T> l(final kf2.g<? super Throwable> g) {
        return RxJavaPlugins.onAssembly(new e<T>((ff2.g0<T>)this, g));
    }
    
    public final c0<T> m(final kf2.g<? super if2.a> g) {
        return RxJavaPlugins.onAssembly(new uf2.g<T>((ff2.g0<T>)this, g));
    }
    
    public final c0<T> n(final kf2.g<? super T> g) {
        return RxJavaPlugins.onAssembly(new uf2.h<T>((ff2.g0<T>)this, g));
    }
    
    public final <R> c0<R> p(final o<? super T, ? extends g0<? extends R>> o) {
        return RxJavaPlugins.onAssembly((c0<R>)new SingleFlatMap((g0)this, (o)o));
    }
    
    public final ff2.a q(final o<? super T, ? extends ff2.e> o) {
        return RxJavaPlugins.onAssembly((ff2.a)new SingleFlatMapCompletable((g0)this, (o)o));
    }
    
    public final <R> ff2.n<R> r(final o<? super T, ? extends r<? extends R>> o) {
        return RxJavaPlugins.onAssembly((ff2.n<R>)new SingleFlatMapMaybe((g0)this, (o)o));
    }
    
    public final <R> t<R> s(final o<? super T, ? extends y<? extends R>> o) {
        return RxJavaPlugins.onAssembly((ff2.t<R>)new SingleFlatMapObservable((ff2.g0<Object>)this, (kf2.o<? super Object, ? extends ff2.y<?>>)o));
    }
    
    public final <R> g<R> t(final o<? super T, ? extends qt2.b<? extends R>> o) {
        return RxJavaPlugins.onAssembly((g<R>)new SingleFlatMapPublisher((g0)this, (o)o));
    }
    
    public final <R> c0<R> w(final o<? super T, ? extends R> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((c0<R>)new io.reactivex.internal.operators.single.a((g0)this, (o)o));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final c0<T> y(final b0 b0) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((c0<T>)new SingleObserveOn((g0)this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final c0<T> z(final c0<? extends T> c0) {
        if (c0 != null) {
            return RxJavaPlugins.onAssembly((c0<T>)new SingleResumeNext((g0)this, (o)new Functions$w((Object)c0)));
        }
        throw new NullPointerException("resumeSingleInCaseOfError is null");
    }
}
