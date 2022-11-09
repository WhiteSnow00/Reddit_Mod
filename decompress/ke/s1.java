// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.os.RemoteException;
import android.os.SystemClock;

public abstract class s1 implements Runnable
{
    public final long f;
    public final long g;
    public final boolean h;
    public final /* synthetic */ x1 i;
    
    public s1(final x1 i, final boolean h) {
        this.i = i;
        i.getClass();
        this.f = System.currentTimeMillis();
        this.g = SystemClock.elapsedRealtime();
        this.h = h;
    }
    
    public abstract void a() throws RemoteException;
    
    public void b() {
    }
    
    @Override
    public final void run() {
        if (this.i.e) {
            this.b();
            return;
        }
        try {
            this.a();
        }
        catch (final Exception ex) {
            this.i.a(ex, false, this.h);
            this.b();
        }
    }
}
