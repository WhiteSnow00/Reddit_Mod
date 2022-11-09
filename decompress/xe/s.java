// 
// Decompiled by Procyon v0.6.0
// 

package xe;

import qd.h1;
import java.util.concurrent.Executor;

public final class s<TResult, TContinuationResult> implements e<TContinuationResult>, d, b, t
{
    public final Executor a;
    public final f<TResult, TContinuationResult> b;
    public final x<TContinuationResult> c;
    
    public s(final Executor a, final f<TResult, TContinuationResult> b, final x<TContinuationResult> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final Exception ex) {
        this.c.s(ex);
    }
    
    @Override
    public final void b(final g<TResult> g) {
        this.a.execute((Runnable)new h1((Object)this, (Object)g, 9));
    }
    
    @Override
    public final void onCanceled() {
        this.c.u();
    }
    
    @Override
    public final void onSuccess(final TContinuationResult tContinuationResult) {
        this.c.t(tContinuationResult);
    }
}
