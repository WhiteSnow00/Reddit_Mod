// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.net.Uri;
import android.content.Intent;
import android.support.v4.media.b;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class b1 extends BroadcastReceiver
{
    public Context a;
    public final b b;
    
    public b1(final b b) {
        this.b = b;
    }
    
    public final void onReceive(Context a, final Intent intent) {
        final Uri data = intent.getData();
        String schemeSpecificPart;
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        }
        else {
            schemeSpecificPart = null;
        }
        if ("com.google.android.gms".equals(schemeSpecificPart)) {
            this.b.a1();
            synchronized (this) {
                a = this.a;
                if (a != null) {
                    a.unregisterReceiver((BroadcastReceiver)this);
                }
                this.a = null;
            }
        }
    }
}
