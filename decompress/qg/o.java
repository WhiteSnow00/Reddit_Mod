// 
// Decompiled by Procyon v0.6.0
// 

package qg;

import java.util.concurrent.CountDownLatch;

public final class o implements c, b
{
    public final CountDownLatch f = new CountDownLatch(1);
    
    public final void a(final Exception ex) {
        this.f.countDown();
    }
    
    public final void onSuccess(final Object o) {
        this.f.countDown();
    }
}
