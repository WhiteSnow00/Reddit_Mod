// 
// Decompiled by Procyon v0.6.0
// 

package zd;

import android.os.Process;

public final class a extends Thread
{
    public a(final ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(19);
        monitorenter(this);
        try {
            try {
                while (true) {
                    this.wait();
                }
            }
            finally {
                monitorexit(this);
            }
        }
        catch (final InterruptedException ex) {}
    }
}
