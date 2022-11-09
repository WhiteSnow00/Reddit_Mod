// 
// Decompiled by Procyon v0.6.0
// 

package androidx.concurrent.futures;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.lang.ref.WeakReference;
import yg.c;
import x2.a;

public final class CallbackToFutureAdapter
{
    public static c a(final b b) {
        final a a = new a();
        final c b2 = new c(a);
        a.b = (c<T>)b2;
        a.a = b.getClass();
        try {
            final String a2 = b.a(a);
            if (a2 != null) {
                a.a = a2;
            }
        }
        catch (final Exception ex) {
            final CallbackToFutureAdapter$c$a g = b2.g;
            g.getClass();
            if (AbstractResolvableFuture.k.b((AbstractResolvableFuture<?>)g, null, new AbstractResolvableFuture.Failure(ex))) {
                AbstractResolvableFuture.c((AbstractResolvableFuture)g);
            }
        }
        return b2;
    }
    
    public static final class FutureGarbageCollectedException extends Throwable
    {
        public FutureGarbageCollectedException(final String s) {
            super(s);
        }
        
        @Override
        public Throwable fillInStackTrace() {
            monitorenter(this);
            monitorexit(this);
            return this;
        }
    }
    
    public static final class a<T>
    {
        public Object a;
        public c<T> b;
        public x2.a<Void> c;
        public boolean d;
        
        public a() {
            this.c = new x2.a<Void>();
        }
        
        public final boolean a(final T t) {
            boolean b = true;
            this.d = true;
            final c<T> b2 = this.b;
            Label_0075: {
                if (b2 != null) {
                    final CallbackToFutureAdapter$c$a g = b2.g;
                    g.getClass();
                    Object l;
                    if ((l = t) == null) {
                        l = AbstractResolvableFuture.l;
                    }
                    boolean b3;
                    if (AbstractResolvableFuture.k.b((AbstractResolvableFuture<?>)g, null, l)) {
                        AbstractResolvableFuture.c((AbstractResolvableFuture<?>)g);
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    if (b3) {
                        break Label_0075;
                    }
                }
                b = false;
            }
            if (b) {
                this.a = null;
                this.b = null;
                this.c = null;
            }
            return b;
        }
        
        public final boolean b(final Throwable t) {
            boolean b = true;
            this.d = true;
            final c<T> b2 = this.b;
            Label_0075: {
                if (b2 != null) {
                    final CallbackToFutureAdapter$c$a g = b2.g;
                    g.getClass();
                    t.getClass();
                    boolean b3;
                    if (AbstractResolvableFuture.k.b((AbstractResolvableFuture<?>)g, null, new AbstractResolvableFuture.Failure(t))) {
                        AbstractResolvableFuture.c((AbstractResolvableFuture<?>)g);
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    if (b3) {
                        break Label_0075;
                    }
                }
                b = false;
            }
            if (b) {
                this.a = null;
                this.b = null;
                this.c = null;
            }
            return b;
        }
        
        public final void finalize() {
            final c<T> b = this.b;
            if (b != null && !b.isDone()) {
                final StringBuilder k = a.k("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                k.append(this.a);
                final FutureGarbageCollectedException ex = new FutureGarbageCollectedException(k.toString());
                final CallbackToFutureAdapter$c$a g = b.g;
                g.getClass();
                if (AbstractResolvableFuture.k.b((AbstractResolvableFuture<?>)g, null, new AbstractResolvableFuture.Failure(ex))) {
                    AbstractResolvableFuture.c((AbstractResolvableFuture)g);
                }
            }
            if (!this.d) {
                final x2.a<Void> c = this.c;
                if (c != null) {
                    c.h(null);
                }
            }
        }
    }
    
    public interface b<T>
    {
        String a(final a p0) throws Exception;
    }
    
    public static final class c<T> implements yg.c<T>
    {
        public final WeakReference<a<T>> f;
        public final CallbackToFutureAdapter$c$a g;
        
        public c(final a<T> a) {
            this.g = new CallbackToFutureAdapter$c$a(this);
            this.f = new WeakReference<a<T>>(a);
        }
        
        public final void a(final Runnable runnable, final Executor executor) {
            ((AbstractResolvableFuture)this.g).a(runnable, executor);
        }
        
        public final boolean cancel(final boolean b) {
            final a a = (a)this.f.get();
            final boolean cancel = ((AbstractResolvableFuture)this.g).cancel(b);
            if (cancel && a != null) {
                a.a = null;
                a.b = null;
                a.c.h(null);
            }
            return cancel;
        }
        
        public final T get() throws InterruptedException, ExecutionException {
            return ((AbstractResolvableFuture<T>)this.g).get();
        }
        
        public final T get(final long n, final TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return ((AbstractResolvableFuture<T>)this.g).get(n, timeUnit);
        }
        
        public final boolean isCancelled() {
            return ((AbstractResolvableFuture)this.g).f instanceof AbstractResolvableFuture.b;
        }
        
        public final boolean isDone() {
            return ((AbstractResolvableFuture)this.g).isDone();
        }
        
        @Override
        public final String toString() {
            return ((AbstractResolvableFuture)this.g).toString();
        }
    }
}
