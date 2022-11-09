// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import java.util.Iterator;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.c;
import java.util.Set;
import java.util.concurrent.Semaphore;
import qd.n;
import x4.a;

public final class g extends a<Void> implements n
{
    public Semaphore k;
    public Set<c> l;
    
    public g(final SignInHubActivity signInHubActivity, final Set l) {
        super((Context)signInHubActivity);
        this.k = new Semaphore(0);
        this.l = l;
    }
    
    public final void c() {
        this.k.drainPermits();
        this.a();
        super.i = new a();
        this.e();
    }
    
    @Override
    public final Object f() {
        final Iterator<c> iterator = this.l.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (iterator.next().a((n)this)) {
                ++n;
            }
        }
        try {
            this.k.tryAcquire(n, 5L, TimeUnit.SECONDS);
        }
        catch (final InterruptedException ex) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", (Throwable)ex);
            Thread.currentThread().interrupt();
        }
        return null;
    }
    
    public final void onComplete() {
        this.k.release();
    }
}
