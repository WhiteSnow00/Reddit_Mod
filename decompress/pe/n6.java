// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import ie.w0;

public final class n6 implements Runnable
{
    public final /* synthetic */ w0 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ AppMeasurementDynamiteService j;
    
    public n6(final AppMeasurementDynamiteService j, final w0 f, final String g, final String h, final boolean i) {
        this.j = j;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        final l6 v = this.j.a.v();
        final w0 f = this.f;
        final String g = this.g;
        final String h = this.h;
        final boolean i = this.i;
        v.M();
        v.N();
        v.Y(new z5(v, g, h, v.V(false), i, f));
    }
}
