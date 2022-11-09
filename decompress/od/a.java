// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.content.ComponentName;
import java.util.concurrent.TimeoutException;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import android.content.ServiceConnection;

public final class a implements ServiceConnection
{
    public boolean f;
    public final LinkedBlockingQueue g;
    
    public a() {
        this.f = false;
        this.g = new LinkedBlockingQueue();
    }
    
    public final IBinder a(final TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        yd.a.R0("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f = true;
        final IBinder binder = this.g.poll(10000L, timeUnit);
        if (binder != null) {
            return binder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        this.g.add(binder);
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
    }
}
