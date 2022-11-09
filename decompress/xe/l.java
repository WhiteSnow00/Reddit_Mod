// 
// Decompiled by Procyon v0.6.0
// 

package xe;

import java.util.concurrent.CountDownLatch;

public final class l implements e, d, b
{
    public final CountDownLatch a = new CountDownLatch(1);
    
    @Override
    public final void a(final Exception ex) {
        this.a.countDown();
    }
    
    @Override
    public final void onCanceled() {
        this.a.countDown();
    }
    
    @Override
    public final void onSuccess(final Object o) {
        this.a.countDown();
    }
}
