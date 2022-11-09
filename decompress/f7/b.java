// 
// Decompiled by Procyon v0.6.0
// 

package f7;

import android.os.BaseBundle;
import android.os.RemoteException;
import android.os.Bundle;
import u5.w;
import android.content.ServiceConnection;
import aj2.c;
import android.content.Context;

public final class b extends a
{
    public int a;
    public final Context b;
    public ed.a c;
    public b.b$a d;
    
    public b(final Context context) {
        this.a = 0;
        this.b = context.getApplicationContext();
    }
    
    public final void a() {
        this.a = 3;
        if (this.d != null) {
            aj2.c.l0("Unbinding from service.");
            this.b.unbindService((ServiceConnection)this.d);
            this.d = null;
        }
        this.c = null;
    }
    
    public final w b() throws RemoteException {
        if (this.a == 2 && this.c != null && this.d != null) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("package_name", this.b.getPackageName());
            try {
                return new w(this.c.B(bundle));
            }
            catch (final RemoteException ex) {
                aj2.c.m0("RemoteException getting install referrer information");
                this.a = 0;
                throw ex;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }
}
