// 
// Decompiled by Procyon v0.6.0
// 

package gc2;

import java.util.concurrent.ThreadFactory;

public final class c implements ThreadFactory
{
    public final String f;
    public final boolean g;
    
    public c(final String f, final boolean g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = new Thread(runnable, this.f);
        thread.setDaemon(this.g);
        return thread;
    }
}
