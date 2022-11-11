// 
// Decompiled by Procyon v0.6.0
// 

package androidx.room;

import android.os.IBinder;
import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import java.util.HashMap;
import android.app.Service;

public class MultiInstanceInvalidationService extends Service
{
    public int f;
    public final HashMap<Integer, String> g;
    public final MultiInstanceInvalidationService$a h;
    public final MultiInstanceInvalidationService$b i;
    
    public MultiInstanceInvalidationService() {
        this.f = 0;
        this.g = new HashMap<Integer, String>();
        this.h = new RemoteCallbackList<c>() {
            public final void onCallbackDied(final IInterface interface1, final Object o) {
                final c c = (c)interface1;
                MultiInstanceInvalidationService.this.g.remove((int)o);
            }
        };
        this.i = new MultiInstanceInvalidationService$b(this);
    }
    
    public final IBinder onBind(final Intent intent) {
        return (IBinder)this.i;
    }
}
