// 
// Decompiled by Procyon v0.6.0
// 

package sd;

import android.os.BaseBundle;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Bundle;
import pd.l;
import android.os.Looper;
import android.content.Context;
import qd.r;
import qd.g;

public final class d extends g<a>
{
    public final r L;
    
    public d(final Context context, final Looper looper, final qd.d d, final r l, final pd.d d2, final l i) {
        super(context, looper, 270, d, d2, i);
        this.L = l;
    }
    
    public final Bundle A() {
        final r l = this.L;
        l.getClass();
        final Bundle bundle = new Bundle();
        final String f = l.f;
        if (f != null) {
            ((BaseBundle)bundle).putString("api", f);
        }
        return bundle;
    }
    
    public final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }
    
    public final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }
    
    public final boolean F() {
        return true;
    }
    
    public final int k() {
        return 203400000;
    }
    
    public final IInterface w(final IBinder binder) {
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
            if (queryLocalInterface instanceof a) {
                o = queryLocalInterface;
            }
            else {
                o = new a(binder);
            }
        }
        return (IInterface)o;
    }
    
    public final nd.d[] y() {
        return ee.d.b;
    }
}
