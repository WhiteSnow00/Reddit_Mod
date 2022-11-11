// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import android.os.IBinder;
import android.content.Intent;
import X.0CC;
import com.bytedance.covode.number.Covode;
import X.0Bn;
import X.0CH;
import android.app.Service;

public class LifecycleService extends Service implements 0CH
{
    public final 0Bn LIZ;
    
    static {
        Covode.recordClassIndex(1201);
    }
    
    public LifecycleService() {
        this.LIZ = new 0Bn(this);
    }
    
    public 0CC getLifecycle() {
        return this.LIZ.LIZ;
    }
    
    public IBinder onBind(final Intent intent) {
        this.LIZ.LIZ(0CC.a.ON_START);
        return null;
    }
    
    public void onCreate() {
        this.LIZ.LIZ(0CC.a.ON_CREATE);
        super.onCreate();
    }
    
    public void onDestroy() {
        final 0Bn liz = this.LIZ;
        liz.LIZ(0CC.a.ON_STOP);
        liz.LIZ(0CC.a.ON_DESTROY);
        super.onDestroy();
    }
    
    public void onStart(final Intent intent, final int n) {
        this.LIZ.LIZ(0CC.a.ON_START);
        super.onStart(intent, n);
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        return super.onStartCommand(intent, n, n2);
    }
}
