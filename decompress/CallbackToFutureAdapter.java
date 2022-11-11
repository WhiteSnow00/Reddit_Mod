// 
// Decompiled by Procyon v0.6.0
// 

package androidx.concurrent.futures;

import x2.a;

public final class CallbackToFutureAdapter
{
    public static CallbackToFutureAdapter$c a(final b b) {
        final a a = new a();
        final CallbackToFutureAdapter$c b2 = new CallbackToFutureAdapter$c(a);
        a.b = (CallbackToFutureAdapter$c<T>)b2;
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
        public CallbackToFutureAdapter$c<T> b;
        public x2.a<Void> c;
        public boolean d;
        
        public a() {
            this.c = (x2.a<Void>)new x2.a();
        }
        
        public final boolean a(final T t) {
            boolean b = true;
            this.d = true;
            final CallbackToFutureAdapter$c<T> b2 = this.b;
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
                        AbstractResolvableFuture.c((AbstractResolvableFuture)g);
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
            final CallbackToFutureAdapter$c<T> b2 = this.b;
            Label_0075: {
                if (b2 != null) {
                    final CallbackToFutureAdapter$c$a g = b2.g;
                    g.getClass();
                    t.getClass();
                    boolean b3;
                    if (AbstractResolvableFuture.k.b((AbstractResolvableFuture<?>)g, null, new AbstractResolvableFuture.Failure(t))) {
                        AbstractResolvableFuture.c((AbstractResolvableFuture)g);
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
            final CallbackToFutureAdapter$c<T> b = this.b;
            if (b != null && !b.isDone()) {
                final StringBuilder r = a.r("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                r.append(this.a);
                final FutureGarbageCollectedException ex = new FutureGarbageCollectedException(r.toString());
                final CallbackToFutureAdapter$c$a g = b.g;
                g.getClass();
                if (AbstractResolvableFuture.k.b((AbstractResolvableFuture<?>)g, null, new AbstractResolvableFuture.Failure(ex))) {
                    AbstractResolvableFuture.c((AbstractResolvableFuture)g);
                }
            }
            if (!this.d) {
                final x2.a<Void> c = this.c;
                if (c != null) {
                    c.h((Object)null);
                }
            }
        }
    }
    
    public interface b<T>
    {
        String a(final a p0) throws Exception;
    }
}
