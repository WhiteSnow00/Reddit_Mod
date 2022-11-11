// 
// Decompiled by Procyon v0.6.0
// 

package uf2;

import if2.a;
import io.reactivex.internal.disposables.SequentialDisposable;
import ff2.e0;
import ff2.b0;
import java.util.concurrent.TimeUnit;
import ff2.g0;
import ff2.c0;

public final class b<T> extends c0<T>
{
    public final g0<? extends T> f;
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    public final boolean j;
    
    public b(final g0 f, final long g, final TimeUnit h, final b0 i) {
        this.f = (g0<? extends T>)f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = false;
    }
    
    @Override
    public final void G(final e0<? super T> e0) {
        final SequentialDisposable sequentialDisposable = new SequentialDisposable();
        e0.onSubscribe((if2.a)sequentialDisposable);
        this.f.b((e0)new a(sequentialDisposable, e0));
    }
    
    public final class a implements e0<T>
    {
        public final SequentialDisposable f;
        public final e0<? super T> g;
        
        public a(final SequentialDisposable f, final e0<? super T> g) {
            this.f = f;
            this.g = g;
        }
        
        public final void onError(final Throwable t) {
            final SequentialDisposable f = this.f;
            final b h = b.this;
            final b0 i = h.i;
            final a.b$a$a b$a$a = new a.b$a$a(this, t);
            long g;
            if (h.j) {
                g = h.g;
            }
            else {
                g = 0L;
            }
            f.replace(i.d((Runnable)b$a$a, g, h.h));
        }
        
        public final void onSubscribe(final if2.a a) {
            this.f.replace(a);
        }
        
        public final void onSuccess(final T t) {
            final SequentialDisposable f = this.f;
            final b h = b.this;
            f.replace(h.i.d((Runnable)new a.b$a$b(this, (Object)t), h.g, h.h));
        }
    }
}
