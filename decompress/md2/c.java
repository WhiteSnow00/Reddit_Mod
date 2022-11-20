// 
// Decompiled by Procyon v0.6.0
// 

package md2;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class c extends BroadcastReceiver
{
    public final e a;
    
    public c(final e a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (context != null && intent != null) {
            final String action = intent.getAction();
            if (action != null) {
                if (action.hashCode() == -1500940653) {
                    if (action.equals("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET") && !this.a.h) {
                        this.a.getClass();
                        if (ng2.e.a((Object)this.a.u, (Object)intent.getStringExtra("com.tonyodev.fetch2.extra.NAMESPACE"))) {
                            this.a.b();
                        }
                    }
                }
            }
        }
    }
}
