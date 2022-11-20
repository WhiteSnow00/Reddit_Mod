// 
// Decompiled by Procyon v0.6.0
// 

package qe;

import cg.j;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import je.u0;

public final class z5 implements Runnable
{
    public final int f;
    public final u0 g;
    public final String h;
    public final Object i;
    public final Object j;
    
    public z5(final AppMeasurementDynamiteService j, final u0 g, final String h, final String i) {
        this.f = 1;
        this.j = j;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public z5(final g6 j, final t i, final String h, final u0 g) {
        this.f = 0;
        this.j = j;
        this.i = i;
        this.h = h;
        this.g = g;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final g6 w = ((AppMeasurementDynamiteService)this.j).a.w();
                final u0 g = this.g;
                final String h = this.h;
                final String s = (String)this.i;
                ((p2)w).t();
                ((m3)w).zza();
                w.E((Runnable)new d6(w, h, s, w.B(false), g));
                return;
            }
            case 0: {
                Object z;
                final Object o = z = null;
                try {
                    try {
                        final g6 g2 = (g6)this.j;
                        z = o;
                        final y2 k = g2.k;
                        if (k == null) {
                            z = o;
                            ((j4)((j)g2).g).c().m.a("Discarding data. Failed to send event to service to bundle");
                            z = ((j)this.j).g;
                        }
                        z = o;
                        z = k.z((t)this.i, this.h);
                        ((g6)this.j).D();
                        z = ((j)this.j).g;
                    }
                    finally {}
                }
                catch (final RemoteException ex) {
                    ((j4)((j)this.j).g).c().m.b((Object)ex, "Failed to send event to the service to bundle");
                    z = ((j)this.j).g;
                }
                final byte[] array;
                ((j4)z).y().O(this.g, array);
                return;
                ((j4)((j)this.j).g).y().O(this.g, (byte[])z);
                break;
            }
        }
    }
}
