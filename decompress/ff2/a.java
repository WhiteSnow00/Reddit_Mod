// 
// Decompiled by Procyon v0.6.0
// 

package ff2;

import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import kf2.q;
import pf2.j;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import kf2.g;
import pf2.k;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.internal.operators.mixed.CompletableAndThenObservable;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import pf2.n;
import io.reactivex.internal.operators.completable.CompletableTimer;
import java.util.concurrent.TimeUnit;
import pf2.i;
import io.reactivex.internal.operators.completable.CompletableMergeArray;
import pf2.h;
import pf2.f;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import pf2.c;

public abstract class a implements e
{
    public static a h() {
        return RxJavaPlugins.onAssembly((a)c.f);
    }
    
    public static a j(final d d) {
        return RxJavaPlugins.onAssembly((a)new CompletableCreate(d));
    }
    
    public static a n(final Throwable t) {
        return RxJavaPlugins.onAssembly((a)new pf2.d(t));
    }
    
    public static a o(final kf2.a a) {
        return RxJavaPlugins.onAssembly((a)new pf2.e(a));
    }
    
    public static a p(final Callable<?> callable) {
        return RxJavaPlugins.onAssembly((a)new f((Callable)callable));
    }
    
    public static <T> a q(final g0<T> g0) {
        if (g0 != null) {
            return RxJavaPlugins.onAssembly((a)new h((g0)g0));
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
                a = RxJavaPlugins.onAssembly((a)new i(e));
            }
            return a;
        }
        throw new NullPointerException("source is null");
    }
    
    public static a y(final long n, final TimeUnit timeUnit) {
        return z(n, timeUnit, eg2.a.a());
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
        return RxJavaPlugins.onAssembly((c0<T>)new n((e)this, (Callable)callable, (Object)null));
    }
    
    public final <T> c0<T> B(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((c0<T>)new n((e)this, (Callable)null, (Object)t));
        }
        throw new NullPointerException("completionValue is null");
    }
    
    public final void b(ff2.c onSubscribe) {
        if (onSubscribe != null) {
            try {
                onSubscribe = RxJavaPlugins.onSubscribe(this, onSubscribe);
                mf2.a.b((Object)onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
                this.w(onSubscribe);
                return;
            }
            catch (final NullPointerException ex) {
                throw ex;
            }
            finally {
                final Throwable t;
                ej2.c0.i4(t);
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
            return RxJavaPlugins.onAssembly(new CompletableAndThenObservable<Object>((e)this, t));
        }
        throw new NullPointerException("next is null");
    }
    
    public final c0 g(final c0 c0) {
        if (c0 != null) {
            return RxJavaPlugins.onAssembly((c0<Object>)new SingleDelayWithCompletable(c0, (e)this));
        }
        throw new NullPointerException("next is null");
    }
    
    public final a i(final e e) {
        if (e != null) {
            return RxJavaPlugins.onAssembly((a)new CompletableAndThenCompletable((e)this, e));
        }
        throw new NullPointerException("other is null");
    }
    
    public final a k(final kf2.a a) {
        final Functions.Functions$p d = Functions.d;
        return RxJavaPlugins.onAssembly((a)new k((e)this, (g)d, (g)d, a, (kf2.a)Functions.c));
    }
    
    public final a l(final g<? super Throwable> g) {
        final Functions.Functions$p d = Functions.d;
        final Functions.Functions$o c = Functions.c;
        return RxJavaPlugins.onAssembly((a)new k((e)this, (g)d, (g)g, (kf2.a)c, (kf2.a)c));
    }
    
    public final a m(final g<? super if2.a> g) {
        final Functions.Functions$p d = Functions.d;
        final Functions.Functions$o c = Functions.c;
        return RxJavaPlugins.onAssembly((a)new k((e)this, (g)g, (g)d, (kf2.a)c, (kf2.a)c));
    }
    
    public final a s(final b0 b0) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((a)new CompletableObserveOn((e)this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final a t() {
        return RxJavaPlugins.onAssembly((a)new j((e)this, (q)Functions.g));
    }
    
    public final if2.a u() {
        final EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        this.b((ff2.c)emptyCompletableObserver);
        return (if2.a)emptyCompletableObserver;
    }
    
    public final CallbackCompletableObserver v(final g g, final kf2.a a) {
        if (a != null) {
            final CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(g, a);
            this.b((ff2.c)callbackCompletableObserver);
            return callbackCompletableObserver;
        }
        throw new NullPointerException("onComplete is null");
    }
    
    public abstract void w(final ff2.c p0);
    
    public final a x(final b0 b0) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((a)new CompletableSubscribeOn((e)this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
}
