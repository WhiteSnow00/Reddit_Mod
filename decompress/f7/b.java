// 
// Decompiled by Procyon v0.6.0
// 

package f7;

import android.os.BaseBundle;
import android.os.RemoteException;
import android.os.Bundle;
import android.content.ServiceConnection;
import android.content.Context;

public final class b extends a
{
    public int a;
    public final Context b;
    public dd.a c;
    public b.b$a d;
    
    public b(final Context context) {
        this.a = 0;
        this.b = context.getApplicationContext();
    }
    
    public final void a() {
        this.a = 3;
        if (this.d != null) {
            vl.a.d0("Unbinding from service.");
            this.b.unbindService((ServiceConnection)this.d);
            this.d = null;
        }
        this.c = null;
    }
    
    public final y6.a b() throws RemoteException {
        if (this.a == 2 && this.c != null && this.d != null) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("package_name", this.b.getPackageName());
            try {
                return new y6.a((Object)this.c.E(bundle));
            }
            catch (final RemoteException ex) {
                vl.a.e0("RemoteException getting install referrer information");
                this.a = 0;
                throw ex;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }
}
