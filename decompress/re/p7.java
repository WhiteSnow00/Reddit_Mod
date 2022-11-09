// 
// Decompiled by Procyon v0.6.0
// 

package re;

import android.os.RemoteException;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import ke.x0;

public final class p7 implements w4
{
    public final x0 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;
    
    public p7(final AppMeasurementDynamiteService b, final x0 a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final long n, final Bundle bundle, final String s, final String s2) {
        try {
            this.a.Y(n, bundle, s, s2);
        }
        catch (final RemoteException ex) {
            final h4 a = this.b.a;
            if (a != null) {
                a.f().n.b(ex, "Event listener threw exception");
            }
        }
    }
}
