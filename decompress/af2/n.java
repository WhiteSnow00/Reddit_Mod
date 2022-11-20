// 
// Decompiled by Procyon v0.6.0
// 

package af2;

import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingle;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.reactivex.internal.functions.Functions$o;
import io.reactivex.internal.functions.Functions$p;
import io.reactivex.internal.operators.maybe.MaybeConcatArray;
import jf2.f;
import hf2.a;
import mf2.m;
import mf2.g;
import java.util.concurrent.Callable;
import mf2.d;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.maybe.MaybeZipArray;
import ff2.o;
import io.reactivex.internal.functions.Functions;
import ff2.c;

public abstract class n<T> implements r<T>
{
    public static n A(final r r, final n n, final c c) {
        if (r == null) {
            throw new NullPointerException("source1 is null");
        }
        if (n != null) {
            return B((ff2.o<? super Object[], ?>)Functions.c(c), (af2.r<?>[])new r[] { r, (r)n });
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T, R> n<R> B(final o<? super Object[], ? extends R> o, final r<? extends T>... array) {
        if (array.length == 0) {
            return i();
        }
        return RxJavaPlugins.onAssembly((n)new MaybeZipArray((o)o, (r[])array));
    }
    
    public static <T> n<T> f(final q<T> q) {
        return RxJavaPlugins.onAssembly((n)new MaybeCreate((q)q));
    }
    
    public static <T> n<T> i() {
        return RxJavaPlugins.onAssembly((n)mf2.c.f);
    }
    
    public static <T> n<T> j(final Throwable t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((n)new d(t));
        }
        throw new NullPointerException("exception is null");
    }
    
    public static <T> n<T> n(final Callable<? extends T> callable) {
        return RxJavaPlugins.onAssembly((n)new g(callable));
    }
    
    public static <T> n<T> o(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((n)new m(t));
        }
        throw new NullPointerException("item is null");
    }
    
    public final n C(final n n, final c c) {
        if (n != null) {
            return A((r)this, n, c);
        }
        throw new NullPointerException("other is null");
    }
    
    public final void a(final p<? super T> p) {
        if (p != null) {
            final p onSubscribe = RxJavaPlugins.onSubscribe(this, (p)p);
            a.b((Object)onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            try {
                this.t((p<? super T>)onSubscribe);
                return;
            }
            catch (final NullPointerException ex) {
                throw ex;
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                final NullPointerException ex2 = new NullPointerException("subscribeActual failed");
                ex2.initCause(t);
                throw ex2;
            }
        }
        throw new NullPointerException("observer is null");
    }
    
    public final T c() {
        final f<T> f = new f<T>();
        this.a((p<? super T>)f);
        return f.a();
    }
    
    public final af2.g<T> e(final r<? extends T> r) {
        if (r != null) {
            return RxJavaPlugins.onAssembly((af2.g)new MaybeConcatArray(new r[] { (r)this, r }));
        }
        throw new NullPointerException("other is null");
    }
    
    public final n<T> g(final T t) {
        if (t != null) {
            return this.v(o(t));
        }
        throw new NullPointerException("defaultItem is null");
    }
    
    public final n<T> h(final ff2.g<? super T> g) {
        final Functions$p d = Functions.d;
        final Functions$o c = Functions.c;
        return RxJavaPlugins.onAssembly((n)new mf2.q((r)this, (ff2.g)g, (ff2.g)d, (ff2.a)c, (ff2.a)c));
    }
    
    public final <R> n<R> k(final o<? super T, ? extends r<? extends R>> o) {
        return RxJavaPlugins.onAssembly((n)new MaybeFlatten((r)this, (o)o));
    }
    
    public final af2.a l(final o<? super T, ? extends e> o) {
        return RxJavaPlugins.onAssembly((af2.a)new MaybeFlatMapCompletable((r)this, (o)o));
    }
    
    public final <R> c0<R> m(final o<? super T, ? extends g0<? extends R>> o) {
        return RxJavaPlugins.onAssembly((c0)new MaybeFlatMapSingle((r)this, (o)o));
    }
    
    public final <R> n<R> p(final o<? super T, ? extends R> o) {
        return RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((r)this, (o)o));
    }
    
    public final n<T> q(final b0 b0) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((n)new MaybeObserveOn((r)this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final n<T> r(final o<? super Throwable, ? extends T> o) {
        return RxJavaPlugins.onAssembly((n)new mf2.p((r)this, (o)o));
    }
    
    public final df2.a s(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2, final ff2.a a) {
        if (g == null) {
            throw new NullPointerException("onSuccess is null");
        }
        if (g2 == null) {
            throw new NullPointerException("onError is null");
        }
        if (a != null) {
            final MaybeCallbackObserver maybeCallbackObserver = new MaybeCallbackObserver((ff2.g)g, (ff2.g)g2, a);
            this.a((p<? super T>)maybeCallbackObserver);
            return (df2.a)maybeCallbackObserver;
        }
        throw new NullPointerException("onComplete is null");
    }
    
    public abstract void t(final p<? super T> p0);
    
    public final n<T> u(final b0 b0) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((n)new MaybeSubscribeOn((r)this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final n v(final n n) {
        if (n != null) {
            return RxJavaPlugins.onAssembly((n)new MaybeSwitchIfEmpty((r)this, n));
        }
        throw new NullPointerException("other is null");
    }
    
    public final c0 w(final c0 c0) {
        if (c0 != null) {
            return RxJavaPlugins.onAssembly((c0)new MaybeSwitchIfEmptySingle((r)this, c0));
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<T> x() {
        if (this instanceof if2.d) {
            return ((if2.d)this).b();
        }
        return RxJavaPlugins.onAssembly((t)new MaybeToObservable(this));
    }
    
    public final c0<T> y() {
        return RxJavaPlugins.onAssembly((c0)new mf2.r((r)this, null));
    }
    
    public final c0<T> z(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((c0)new mf2.r((r)this, t));
        }
        throw new NullPointerException("defaultValue is null");
    }
}
