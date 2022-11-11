// 
// Decompiled by Procyon v0.6.0
// 

package ad;

import android.os.SystemClock;

public final class e
{
    public boolean a;
    
    public final void a() throws InterruptedException {
        synchronized (this) {
            while (!this.a) {
                this.wait();
            }
        }
    }
    
    public final boolean b(long elapsedRealtime) throws InterruptedException {
        monitorenter(this);
        Label_0022: {
            if (elapsedRealtime <= 0L) {
                Label_0089: {
                    try {
                        final boolean a = this.a;
                        monitorexit(this);
                        return a;
                    }
                    finally {
                        break Label_0089;
                    }
                    break Label_0022;
                }
                monitorexit(this);
            }
        }
        final long elapsedRealtime2 = SystemClock.elapsedRealtime();
        final long n = elapsedRealtime + elapsedRealtime2;
        elapsedRealtime = elapsedRealtime2;
        if (n < elapsedRealtime2) {
            this.a();
        }
        else {
            while (!this.a && elapsedRealtime < n) {
                this.wait(n - elapsedRealtime);
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        final boolean a2 = this.a;
        monitorexit(this);
        return a2;
    }
    
    public final void c() {
        monitorenter(this);
        boolean b = false;
        try {
            while (!this.a) {
                try {
                    this.wait();
                }
                catch (final InterruptedException ex) {
                    b = true;
                }
            }
            if (b) {
                Thread.currentThread().interrupt();
            }
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.a = false;
        }
    }
    
    public final boolean e() {
        synchronized (this) {
            if (this.a) {
                return false;
            }
            this.a = true;
            this.notifyAll();
            return true;
        }
    }
}
