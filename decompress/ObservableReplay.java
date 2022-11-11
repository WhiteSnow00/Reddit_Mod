// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.ExceptionHelper;
import ej2.c0;
import ff2.a0;
import kf2.g;
import ff2.t;
import java.util.concurrent.Callable;
import kf2.o;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import ff2.y;
import lf2.c;
import zf2.a;

public final class ObservableReplay<T> extends zf2.a<T> implements c
{
    public static final ObservableReplay.ObservableReplay$i j;
    public final y<T> f;
    public final AtomicReference<ObservableReplay.ObservableReplay$ReplayObserver<T>> g;
    public final a<T> h;
    public final y<T> i;
    
    static {
        j = new ObservableReplay.ObservableReplay$i();
    }
    
    public ObservableReplay(final ObservableReplay.ObservableReplay$g i, final y f, final AtomicReference g, final a h) {
        this.i = (y<T>)i;
        this.f = (y<T>)f;
        this.g = g;
        this.h = h;
    }
    
    public static <T> zf2.a<T> e(final y<T> y, final a<T> a) {
        final AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly(new ObservableReplay<T>(new ObservableReplay.ObservableReplay$g(atomicReference, (a)a), y, atomicReference, a));
    }
    
    public static t f(final o o, final Callable callable) {
        return RxJavaPlugins.onAssembly((ff2.t<Object>)new ObservableReplay.ObservableReplay$c(o, callable));
    }
    
    public final void b(final if2.a a) {
        final AtomicReference<ObservableReplay.ObservableReplay$ReplayObserver<T>> g = this.g;
        final ObservableReplay.ObservableReplay$ReplayObserver observableReplay$ReplayObserver = (ObservableReplay.ObservableReplay$ReplayObserver)a;
        while (!g.compareAndSet((ObservableReplay.ObservableReplay$ReplayObserver<T>)observableReplay$ReplayObserver, null)) {
            if (g.get() != observableReplay$ReplayObserver) {
                return;
            }
        }
    }
    
    public final void c(final g<? super if2.a> g) {
        ObservableReplay.ObservableReplay$ReplayObserver observableReplay$ReplayObserver2 = null;
    Label_0083:
        while (true) {
            final ObservableReplay.ObservableReplay$ReplayObserver observableReplay$ReplayObserver = this.g.get();
            if (observableReplay$ReplayObserver != null) {
                observableReplay$ReplayObserver2 = observableReplay$ReplayObserver;
                if (!observableReplay$ReplayObserver.isDisposed()) {
                    break;
                }
            }
            observableReplay$ReplayObserver2 = new ObservableReplay.ObservableReplay$ReplayObserver((e)this.h.call());
            final AtomicReference<ObservableReplay.ObservableReplay$ReplayObserver<T>> g2 = this.g;
            while (true) {
                while (!g2.compareAndSet((ObservableReplay.ObservableReplay$ReplayObserver<T>)observableReplay$ReplayObserver, (ObservableReplay.ObservableReplay$ReplayObserver<T>)observableReplay$ReplayObserver2)) {
                    if (g2.get() != observableReplay$ReplayObserver) {
                        final boolean b = false;
                        if (!b) {
                            continue Label_0083;
                        }
                        break Label_0083;
                    }
                }
                final boolean b = true;
                continue;
            }
        }
        boolean b2;
        if (!observableReplay$ReplayObserver2.shouldConnect.get() && observableReplay$ReplayObserver2.shouldConnect.compareAndSet(false, true)) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        try {
            g.accept((Object)observableReplay$ReplayObserver2);
            if (b2) {
                this.f.subscribe((a0)observableReplay$ReplayObserver2);
            }
        }
        finally {
            if (b2) {
                observableReplay$ReplayObserver2.shouldConnect.compareAndSet(true, false);
            }
            final Throwable t;
            c0.i4(t);
            throw ExceptionHelper.d(t);
        }
    }
    
    public final void subscribeActual(final a0<? super T> a0) {
        this.i.subscribe((a0)a0);
    }
    
    public static final class Node extends AtomicReference<Node>
    {
        private static final long serialVersionUID = 245354315435971818L;
        public final Object value;
        
        public Node(final Object value) {
            this.value = value;
        }
    }
    
    public interface a<T>
    {
        e<T> call();
    }
    
    public static final class d<T> extends zf2.a<T>
    {
        public final zf2.a<T> f;
        public final t<T> g;
        
        public d(final zf2.a<T> f, final t<T> g) {
            this.f = f;
            this.g = g;
        }
        
        public final void c(final g<? super if2.a> g) {
            this.f.c((g)g);
        }
        
        public final void subscribeActual(final a0<? super T> a0) {
            this.g.subscribe((a0)a0);
        }
    }
    
    public interface e<T>
    {
        void complete();
        
        void error(final Throwable p0);
        
        void next(final T p0);
        
        void replay(final ObservableReplay$InnerDisposable<T> p0);
    }
}
