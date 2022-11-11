// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.os.Bundle;
import android.os.IBinder;

public final class z0 extends n0
{
    public final IBinder g;
    public final /* synthetic */ b h;
    
    public z0(final b h, final int n, final IBinder g, final Bundle bundle) {
        this.h = h;
        super(h, n, bundle);
        this.g = g;
    }
    
    public final void c(final md.b b) {
        final b$b z = this.h.z;
        if (z != null) {
            z.o(b);
        }
        this.h.G(b);
    }
    
    public final boolean d() {
        try {
            final IBinder g = this.g;
            lw0.b.R((Object)g);
            final String interfaceDescriptor = g.getInterfaceDescriptor();
            if (!this.h.D().equals(interfaceDescriptor)) {
                final String d = this.h.D();
                Log.w("GmsClient", b.j(new StringBuilder(String.valueOf(d).length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", d, " vs. ", interfaceDescriptor));
                return false;
            }
            final IInterface w = this.h.w(this.g);
            if (w != null && (b.I(this.h, 2, 4, w) || b.I(this.h, 3, 4, w))) {
                final b h = this.h;
                h.D = null;
                final b$a y = h.y;
                if (y != null) {
                    y.b();
                }
                return true;
            }
            return false;
        }
        catch (final RemoteException ex) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
