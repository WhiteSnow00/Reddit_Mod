// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory
{
    @Override
    public final Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable(runnable) {
            public final Runnable f;
            
            @Override
            public final void run() {
                Process.setThreadPriority(10);
                this.f.run();
            }
        }, "glide-active-resources");
    }
}
