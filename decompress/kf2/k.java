// 
// Decompiled by Procyon v0.6.0
// 

package kf2;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.disposables.CompositeDisposable;
import af2.c;
import af2.b0;
import java.util.concurrent.TimeUnit;
import af2.e;
import af2.a;

public final class k extends af2.a
{
    public final e f;
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    public final e j;
    
    public k(final af2.a f, final long g, final TimeUnit h, final b0 i) {
        this.f = (e)f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = null;
    }
    
    @Override
    public final void w(final c c) {
        final CompositeDisposable compositeDisposable = new CompositeDisposable();
        c.onSubscribe((df2.a)compositeDisposable);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        compositeDisposable.add(this.i.d((Runnable)new a(atomicBoolean, compositeDisposable, c), this.g, this.h));
        this.f.a((c)new b(c, compositeDisposable, atomicBoolean));
    }
    
    public final class a implements Runnable
    {
        public final AtomicBoolean f;
        public final CompositeDisposable g;
        public final c h;
        public final k i;
        
        public a(final k i, final AtomicBoolean f, final CompositeDisposable g, final c h) {
            this.i = i;
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        @Override
        public final void run() {
            if (this.f.compareAndSet(false, true)) {
                this.g.clear();
                final e j = this.i.j;
                if (j == null) {
                    final c h = this.h;
                    final k i = this.i;
                    h.onError((Throwable)new TimeoutException(ExceptionHelper.c(i.g, i.h)));
                }
                else {
                    j.a((c)new k.a.a());
                }
            }
        }
        
        public final class a implements c
        {
            public final k.a f;
            
            public a(final k.a f) {
                this.f = f;
            }
            
            public final void onComplete() {
                this.f.g.dispose();
                this.f.h.onComplete();
            }
            
            public final void onError(final Throwable t) {
                this.f.g.dispose();
                this.f.h.onError(t);
            }
            
            public final void onSubscribe(final df2.a a) {
                this.f.g.add(a);
            }
        }
    }
    
    public static final class b implements c
    {
        public final CompositeDisposable f;
        public final AtomicBoolean g;
        public final c h;
        
        public b(final c h, final CompositeDisposable f, final AtomicBoolean g) {
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        public final void onComplete() {
            if (this.g.compareAndSet(false, true)) {
                this.f.dispose();
                this.h.onComplete();
            }
        }
        
        public final void onError(final Throwable t) {
            if (this.g.compareAndSet(false, true)) {
                this.f.dispose();
                this.h.onError(t);
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public final void onSubscribe(final df2.a a) {
            this.f.add(a);
        }
    }
}
