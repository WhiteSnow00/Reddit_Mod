// 
// Decompiled by Procyon v0.6.0
// 

package xe;

import java.util.concurrent.Executor;

public abstract class g<TResult>
{
    public void a(final Executor executor, final b b) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }
    
    public void b(final Executor executor, final c c) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
    
    public abstract x c(final Executor p0, final d p1);
    
    public abstract x d(final Executor p0, final e p1);
    
    public abstract x e(final e p0);
    
    public <TContinuationResult> g<TContinuationResult> f(final Executor executor, final a<TResult, TContinuationResult> a) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }
    
    public <TContinuationResult> g<TContinuationResult> g(final a<TResult, TContinuationResult> a) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }
    
    public <TContinuationResult> g<TContinuationResult> h(final Executor executor, final a<TResult, g<TContinuationResult>> a) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
    
    public abstract Exception i();
    
    public abstract TResult j();
    
    public abstract <X extends Throwable> TResult k(final Class<X> p0) throws X, Throwable;
    
    public abstract boolean l();
    
    public abstract boolean m();
    
    public abstract boolean n();
    
    public <TContinuationResult> g<TContinuationResult> o(final Executor executor, final f<TResult, TContinuationResult> f) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
    
    public <TContinuationResult> g<TContinuationResult> p(final f<TResult, TContinuationResult> f) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
