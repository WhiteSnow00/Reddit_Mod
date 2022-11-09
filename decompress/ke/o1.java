// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class o1 implements ThreadFactory
{
    public final ThreadFactory f;
    
    public o1() {
        this.f = Executors.defaultThreadFactory();
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.f.newThread(runnable);
        thread.setName("ScionFrontendApi");
        return thread;
    }
}
