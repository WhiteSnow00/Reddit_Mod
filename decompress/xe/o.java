// 
// Decompiled by Procyon v0.6.0
// 

package xe;

import com.android.billingclient.api.m0;
import java.util.concurrent.Executor;

public final class o<TResult, TContinuationResult> implements e<TContinuationResult>, d, b, t
{
    public final Executor a;
    public final a<TResult, g<TContinuationResult>> b;
    public final x<TContinuationResult> c;
    
    public o(final Executor a, final a<TResult, g<TContinuationResult>> b, final x<TContinuationResult> c) {
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
        this.a.execute(new m0(this, g, 5));
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