// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import ej2.c0;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.util.ExceptionHelper;
import qt2.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.util.AtomicThrowable;
import ff2.l;
import ff2.c;
import ff2.e;
import kf2.o;
import ff2.g;
import ff2.a;

public final class FlowableSwitchMapCompletable<T> extends a
{
    public final g<T> f;
    public final o<? super T, ? extends e> g;
    public final boolean h;
    
    public FlowableSwitchMapCompletable(final g<T> f, final o<? super T, ? extends e> g, final boolean h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void w(final c c) {
        this.f.subscribe((ff2.l<? super T>)new SwitchMapCompletableObserver(c, (kf2.o<? super Object, ? extends e>)this.g, this.h));
    }
    
    public static final class SwitchMapCompletableObserver<T> implements l<T>, if2.a
    {
        public static final SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver m;
        public final c f;
        public final o<? super T, ? extends e> g;
        public final boolean h;
        public final AtomicThrowable i;
        public final AtomicReference<SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver> j;
        public volatile boolean k;
        public d l;
        
        static {
            m = new SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver((SwitchMapCompletableObserver)null);
        }
        
        public SwitchMapCompletableObserver(final c f, final o<? super T, ? extends e> g, final boolean h) {
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = new AtomicThrowable();
            this.j = new AtomicReference<SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver>();
        }
        
        public final void dispose() {
            this.l.cancel();
            final AtomicReference<SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver> j = this.j;
            final SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver m = SwitchMapCompletableObserver.m;
            final SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver = j.getAndSet(m);
            if (flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver != null && flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver != m) {
                flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver.dispose();
            }
        }
        
        public final boolean isDisposed() {
            return this.j.get() == SwitchMapCompletableObserver.m;
        }
        
        public final void onComplete() {
            this.k = true;
            if (this.j.get() == null) {
                final Throwable terminate = this.i.terminate();
                if (terminate == null) {
                    this.f.onComplete();
                }
                else {
                    this.f.onError(terminate);
                }
            }
        }
        
        public final void onError(Throwable terminate) {
            if (this.i.addThrowable(terminate)) {
                if (this.h) {
                    this.onComplete();
                }
                else {
                    final AtomicReference<SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver> j = this.j;
                    final SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver m = SwitchMapCompletableObserver.m;
                    final SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver = j.getAndSet(m);
                    if (flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver != null && flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver != m) {
                        flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver.dispose();
                    }
                    terminate = this.i.terminate();
                    if (terminate != ExceptionHelper.a) {
                        this.f.onError(terminate);
                    }
                }
            }
            else {
                RxJavaPlugins.onError(terminate);
            }
        }
        
        public final void onNext(final T t) {
            try {
                final Object apply = this.g.apply((Object)t);
                mf2.a.b(apply, "The mapper returned a null CompletableSource");
                final e e = (e)apply;
                final SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver = new SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver(this);
                boolean b;
                SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver2 = null;
            Label_0086:
                do {
                    flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver2 = this.j.get();
                    if (flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver2 == SwitchMapCompletableObserver.m) {
                        return;
                    }
                    final AtomicReference<SwitchMapCompletableObserver.FlowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver> j = this.j;
                    while (!j.compareAndSet(flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver2, flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver)) {
                        if (j.get() != flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver2) {
                            b = false;
                            continue Label_0086;
                        }
                    }
                    b = true;
                } while (!b);
                if (flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver2 != null) {
                    flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver2.dispose();
                }
                e.b((c)flowableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver);
            }
            finally {
                final Throwable t2;
                c0.i4(t2);
                this.l.cancel();
                this.onError(t2);
            }
        }
        
        public final void onSubscribe(final d l) {
            if (SubscriptionHelper.validate(this.l, l)) {
                this.l = l;
                this.f.onSubscribe((if2.a)this);
                l.request(Long.MAX_VALUE);
            }
        }
    }
}
