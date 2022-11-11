// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import qd.a;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import ie.w0;

public final class j5 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ w0 g;
    public final /* synthetic */ AppMeasurementDynamiteService h;
    
    @Override
    public final void run() {
        final int f = this.f;
        boolean b = true;
        switch (f) {
            default: {
                final n7 y = this.h.a.y();
                final w0 g = this.g;
                final h4 a = this.h.a;
                if (a.F == null || !a.F) {
                    b = false;
                }
                y.e0(g, b);
                return;
            }
            case 0: {
                final l6 v = this.h.a.v();
                final w0 g2 = this.g;
                v.M();
                v.N();
                v.Y(new q4(v, v.V(false), g2, 1));
            }
        }
    }
}
