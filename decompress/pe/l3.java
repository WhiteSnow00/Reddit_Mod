// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class l3 extends BroadcastReceiver
{
    public final g7 a;
    public boolean b;
    public boolean c;
    
    public l3(final g7 a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.c();
        this.a.b().M();
        this.a.b().M();
        if (this.b) {
            this.a.h().s.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            final Context f = this.a.q.f;
            try {
                f.unregisterReceiver((BroadcastReceiver)this);
            }
            catch (final IllegalArgumentException ex) {
                this.a.h().k.b((Object)ex, "Failed to unregister the network broadcast receiver");
            }
        }
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        this.a.c();
        final String action = intent.getAction();
        this.a.h().s.b((Object)action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            final j3 g = this.a.g;
            g7.H((b7)g);
            final boolean q = g.Q();
            if (this.c != q) {
                this.c = q;
                this.a.b().U(new k3(this, q));
            }
            return;
        }
        this.a.h().n.b((Object)action, "NetworkBroadcastReceiver received unknown action");
    }
}
