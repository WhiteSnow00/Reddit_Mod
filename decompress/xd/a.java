// 
// Decompiled by Procyon v0.6.0
// 

package xd;

import com.android.billingclient.api.l0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory
{
    public final String f;
    public final ThreadFactory g;
    
    public a(final String f) {
        this.g = Executors.defaultThreadFactory();
        this.f = f;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.g.newThread(new l0(runnable));
        thread.setName(this.f);
        return thread;
    }
}
