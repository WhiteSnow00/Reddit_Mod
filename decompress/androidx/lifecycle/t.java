// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public class t extends Service implements q
{
    public final j0 f;
    
    public t() {
        this.f = new j0((q)this);
    }
    
    public final Lifecycle getLifecycle() {
        return this.f.a;
    }
    
    public final IBinder onBind(final Intent intent) {
        final j0 f = this.f;
        f.getClass();
        f.a(Lifecycle.Event.ON_START);
        return null;
    }
    
    public void onCreate() {
        final j0 f = this.f;
        f.getClass();
        f.a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }
    
    public void onDestroy() {
        final j0 f = this.f;
        f.getClass();
        f.a(Lifecycle.Event.ON_STOP);
        f.a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }
    
    public final void onStart(final Intent intent, final int n) {
        final j0 f = this.f;
        f.getClass();
        f.a(Lifecycle.Event.ON_START);
        super.onStart(intent, n);
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        return super.onStartCommand(intent, n, n2);
    }
}
