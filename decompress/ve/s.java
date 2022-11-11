// 
// Decompiled by Procyon v0.6.0
// 

package ve;

import com.android.billingclient.api.m0;
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
    
    public final void a(final Exception ex) {
        this.c.s(ex);
    }
    
    public final void b(final g<TResult> g) {
        this.a.execute((Runnable)new m0((Object)this, (Object)g, 10));
    }
    
    public final void onCanceled() {
        this.c.u();
    }
    
    public final void onSuccess(final TContinuationResult tContinuationResult) {
        this.c.t(tContinuationResult);
    }
}
