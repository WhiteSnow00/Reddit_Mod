// 
// Decompiled by Procyon v0.6.0
// 

package we;

import java.util.concurrent.CountDownLatch;

public final class l implements e, d, b
{
    public final CountDownLatch a;
    
    public l() {
        this.a = new CountDownLatch(1);
    }
    
    public final void a(final Exception ex) {
        this.a.countDown();
    }
    
    public final void onCanceled() {
        this.a.countDown();
    }
    
    public final void onSuccess(final Object o) {
        this.a.countDown();
    }
}
