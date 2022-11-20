// 
// Decompiled by Procyon v0.6.0
// 

package se;

import android.os.IInterface;
import android.os.IBinder;
import pd.l;
import com.google.android.gms.common.api.c;
import qd.d;
import android.os.Looper;
import android.content.Context;
import qd.g;

public final class j extends g<a>
{
    public j(final Context context, final Looper looper, final d d, final c.b b, final c.c c) {
        super(context, looper, 185, d, (pd.d)b, (l)c);
    }
    
    public final String D() {
        return "com.google.android.gms.oss.licenses.IOSSLicenseService";
    }
    
    public final String E() {
        return "com.google.android.gms.oss.licenses.service.START";
    }
    
    public final int k() {
        return 12600000;
    }
    
    public final IInterface w(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.oss.licenses.IOSSLicenseService");
        if (queryLocalInterface instanceof a) {
            return queryLocalInterface;
        }
        return (IInterface)new b(binder);
    }
}
