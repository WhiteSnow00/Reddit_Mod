// 
// Decompiled by Procyon v0.6.0
// 

package kf2;

import java.util.Iterator;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import af2.c;
import af2.e;

public final class a extends a
{
    public final e[] f;
    public final Iterable<? extends e> g;
    
    public a(final e[] f) {
        this.f = f;
        this.g = null;
    }
    
    @Override
    public final void w(final c c) {
        e[] f = this.f;
        int length = 0;
        Label_0148: {
            if (f == null) {
                e[] array = new e[8];
                try {
                    final Iterator<? extends e> iterator = this.g.iterator();
                    int n = 0;
                    while (true) {
                        f = array;
                        length = n;
                        if (!iterator.hasNext()) {
                            break Label_0148;
                        }
                        final e e = iterator.next();
                        if (e == null) {
                            break;
                        }
                        f = array;
                        if (n == array.length) {
                            f = new e[(n >> 2) + n];
                            System.arraycopy(array, 0, f, 0, n);
                        }
                        f[n] = e;
                        ++n;
                        array = f;
                    }
                    EmptyDisposable.error(new NullPointerException("One of the sources is null"), c);
                    return;
                }
                finally {
                    final Throwable t;
                    xd.a.t1(t);
                    EmptyDisposable.error(t, c);
                    return;
                }
            }
            length = f.length;
        }
        final CompositeDisposable compositeDisposable = new CompositeDisposable();
        c.onSubscribe((df2.a)compositeDisposable);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (final e e2 : f) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (e2 == null) {
                final NullPointerException ex = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    compositeDisposable.dispose();
                    c.onError((Throwable)ex);
                }
                else {
                    RxJavaPlugins.onError((Throwable)ex);
                }
                return;
            }
            e2.a((c)new a(c, compositeDisposable, atomicBoolean));
        }
        if (length == 0) {
            c.onComplete();
        }
    }
    
    public static final class a implements c
    {
        public final AtomicBoolean f;
        public final CompositeDisposable g;
        public final c h;
        public df2.a i;
        
        public a(final c h, final CompositeDisposable g, final AtomicBoolean f) {
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        public final void onComplete() {
            if (this.f.compareAndSet(false, true)) {
                this.g.delete(this.i);
                this.g.dispose();
                this.h.onComplete();
            }
        }
        
        public final void onError(final Throwable t) {
            if (this.f.compareAndSet(false, true)) {
                this.g.delete(this.i);
                this.g.dispose();
                this.h.onError(t);
            }
            else {
                RxJavaPlugins.onError(t);
            }
        }
        
        public final void onSubscribe(final df2.a i) {
            this.i = i;
            this.g.add(i);
        }
    }
}
