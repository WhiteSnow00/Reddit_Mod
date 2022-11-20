// 
// Decompiled by Procyon v0.6.0
// 

package af2;

import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import ff2.q;
import kf2.i;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.functions.Functions$o;
import io.reactivex.internal.functions.Functions$p;
import ff2.g;
import kf2.j;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.internal.operators.mixed.CompletableAndThenObservable;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import kf2.m;
import io.reactivex.internal.operators.completable.CompletableTimer;
import java.util.concurrent.TimeUnit;
import kf2.b;
import io.reactivex.internal.operators.completable.CompletableMergeArray;
import kf2.h;
import kf2.f;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import kf2.c;

public abstract class a implements e
{
    public static a h() {
        return RxJavaPlugins.onAssembly((a)c.f);
    }
    
    public static a j(final d d) {
        return RxJavaPlugins.onAssembly((a)new CompletableCreate(d));
    }
    
    public static a n(final Throwable t) {
        return RxJavaPlugins.onAssembly((a)new kf2.d(t));
    }
    
    public static a o(final ff2.a a) {
        return RxJavaPlugins.onAssembly((a)new kf2.e(a));
    }
    
    public static a p(final Callable<?> callable) {
        return RxJavaPlugins.onAssembly((a)new f(callable));
    }
    
    public static <T> a q(final g0<T> g0) {
        if (g0 != null) {
            return RxJavaPlugins.onAssembly((a)new h<Object>(g0));
        }
        throw new NullPointerException("single is null");
    }
    
    public static a r(final e... array) {
        if (array.length == 0) {
            return h();
        }
        if (array.length != 1) {
            return RxJavaPlugins.onAssembly((a)new CompletableMergeArray(array));
        }
        final e e = array[0];
        if (e != null) {
            a a;
            if (e instanceof a) {
                a = RxJavaPlugins.onAssembly((a)e);
            }
            else {
                a = RxJavaPlugins.onAssembly((a)new b(e, 1));
            }
            return a;
        }
        throw new NullPointerException("source is null");
    }
    
    public static a y(final long n, final TimeUnit timeUnit) {
        return z(n, timeUnit, zf2.a.a());
    }
    
    public static a z(final long n, final TimeUnit timeUnit, final b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((a)new CompletableTimer(n, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <T> c0<T> A(final Callable<? extends T> callable) {
        return RxJavaPlugins.onAssembly((c0)new m((e)this, callable, null));
    }
    
    public final <T> c0<T> B(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((c0)new m((e)this, null, t));
        }
        throw new NullPointerException("completionValue is null");
    }
    
    public final void a(af2.c onSubscribe) {
        if (onSubscribe != null) {
            try {
                onSubscribe = RxJavaPlugins.onSubscribe(this, onSubscribe);
                hf2.a.b((Object)onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
                this.w(onSubscribe);
                return;
            }
            catch (final NullPointerException ex) {
                throw ex;
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                RxJavaPlugins.onError(t);
                final NullPointerException ex2 = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                ex2.initCause(t);
                throw ex2;
            }
        }
        throw new NullPointerException("observer is null");
    }
    
    public final a e(final e e) {
        if (e != null) {
            return RxJavaPlugins.onAssembly((a)new CompletableAndThenCompletable((e)this, e));
        }
        throw new NullPointerException("next is null");
    }
    
    public final t f(final t t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((t)new CompletableAndThenObservable((e)this, t));
        }
        throw new NullPointerException("next is null");
    }
    
    public final c0 g(final c0 c0) {
        if (c0 != null) {
            return RxJavaPlugins.onAssembly((c0)new SingleDelayWithCompletable(c0, (e)this));
        }
        throw new NullPointerException("next is null");
    }
    
    public final a i(final e e) {
        if (e != null) {
            return RxJavaPlugins.onAssembly((a)new CompletableAndThenCompletable((e)this, e));
        }
        throw new NullPointerException("other is null");
    }
    
    public final a k(final ff2.a a) {
        final Functions$p d = Functions.d;
        return RxJavaPlugins.onAssembly((a)new j((e)this, (g)d, (g)d, a, (ff2.a)Functions.c));
    }
    
    public final a l(final g<? super Throwable> g) {
        final Functions$p d = Functions.d;
        final Functions$o c = Functions.c;
        return RxJavaPlugins.onAssembly((a)new j((e)this, (g)d, g, (ff2.a)c, (ff2.a)c));
    }
    
    public final a m(final g<? super df2.a> g) {
        final Functions$p d = Functions.d;
        final Functions$o c = Functions.c;
        return RxJavaPlugins.onAssembly((a)new j((e)this, g, (g)d, (ff2.a)c, (ff2.a)c));
    }
    
    public final a s(final b0 b0) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((a)new CompletableObserveOn((e)this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final a t() {
        return RxJavaPlugins.onAssembly((a)new i((e)this, (q<? super Throwable>)Functions.g));
    }
    
    public final df2.a u() {
        final EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        this.a((af2.c)emptyCompletableObserver);
        return (df2.a)emptyCompletableObserver;
    }
    
    public final CallbackCompletableObserver v(final g g, final ff2.a a) {
        if (a != null) {
            final CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(g, a);
            this.a((af2.c)callbackCompletableObserver);
            return callbackCompletableObserver;
        }
        throw new NullPointerException("onComplete is null");
    }
    
    public abstract void w(final af2.c p0);
    
    public final a x(final b0 b0) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((a)new CompletableSubscribeOn((e)this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
}
