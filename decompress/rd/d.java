// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.BaseBundle;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Bundle;
import od.l;
import android.os.Looper;
import android.content.Context;
import pd.s;
import pd.g;

public final class d extends g<a>
{
    public final s L;
    
    public d(final Context context, final Looper looper, final pd.d d, final s l, final od.d d2, final l i) {
        super(context, looper, 270, d, d2, i);
        this.L = l;
    }
    
    public final Bundle A() {
        final s l = this.L;
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
    
    public final int o() {
        return 203400000;
    }
    
    public final md.d[] y() {
        return de.d.b;
    }
}
