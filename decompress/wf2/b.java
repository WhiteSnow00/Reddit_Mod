// 
// Decompiled by Procyon v0.6.0
// 

package wf2;

import java.util.concurrent.TimeUnit;
import if2.a;
import ff2.b0;

public final class b extends b0
{
    public static final b b;
    public static final a c;
    public static final if2.a d;
    
    static {
        b = new b();
        c = new a();
        (d = io.reactivex.disposables.a.a()).dispose();
    }
    
    public final b0.c a() {
        return wf2.b.c;
    }
    
    public final if2.a c(final Runnable runnable) {
        runnable.run();
        return wf2.b.d;
    }
    
    public final if2.a d(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }
    
    public final if2.a e(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }
    
    public static final class a extends c
    {
        @Override
        public final if2.a b(final Runnable runnable) {
            runnable.run();
            return wf2.b.d;
        }
        
        @Override
        public final if2.a c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }
        
        @Override
        public final if2.a d(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }
        
        public final void dispose() {
        }
        
        public final boolean isDisposed() {
            return false;
        }
    }
}
