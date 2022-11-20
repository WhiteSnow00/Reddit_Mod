// 
// Decompiled by Procyon v0.6.0
// 

package w3;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class n implements ThreadFactory
{
    public String f;
    public int g;
    
    public n() {
        this.f = "fonts-androidx";
        this.g = 10;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        return new a(runnable, this.f, this.g);
    }
    
    public static final class a extends Thread
    {
        public final int f;
        
        public a(final Runnable runnable, final String s, final int f) {
            super(runnable, s);
            this.f = f;
        }
        
        @Override
        public final void run() {
            Process.setThreadPriority(this.f);
            super.run();
        }
    }
}
