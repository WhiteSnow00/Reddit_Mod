// 
// Decompiled by Procyon v0.6.0
// 

package nd;

import android.os.IInterface;
import android.os.IBinder;
import qd.p0;
import qd.q0;
import com.google.android.gms.dynamite.DynamiteModule$a;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import android.os.RemoteException;
import android.util.Log;
import yd.b;
import android.content.Context;
import qd.r0;

public final class v
{
    public static final p a;
    public static final q b;
    public static volatile r0 c;
    public static final Object d;
    public static Context e;
    
    static {
        new n(r.m("0\u0082\u0005\u00c80\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bs\u00f9/\u008eQ\u00ed"));
        new o(r.m("0\u0082\u0006\u00040\u0082\u0003\u00ec \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad\u00d7\u00e1r\u00cak\u00ec"));
        a = new p(r.m("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"));
        b = new q(r.m("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085¸l}\u00d3N\u00f50"));
        d = new Object();
    }
    
    public static d0 a(String o, final r r, final boolean b, final boolean b2) {
        try {
            b();
            mg.d0.y((Object)v.e);
            final a0 a0 = new a0((String)o, r, b, b2);
            try {
                if (v.c.c0(a0, new b((T)v.e.getPackageManager()))) {
                    return d0.d;
                }
                return (d0)new c0(new m(b, (String)o, r));
            }
            catch (final RemoteException ex) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
                return d0.c("module call", (Exception)ex);
            }
        }
        catch (final DynamiteModule$LoadingException ex2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex2);
            o = String.valueOf(((Throwable)ex2).getMessage());
            if (((String)o).length() != 0) {
                o = "module init: ".concat((String)o);
            }
            else {
                o = new String("module init: ");
            }
            return d0.c((String)o, (Exception)ex2);
        }
    }
    
    public static void b() throws DynamiteModule$LoadingException {
        if (v.c != null) {
            return;
        }
        mg.d0.y((Object)v.e);
        synchronized (v.d) {
            if (v.c == null) {
                final IBinder b = DynamiteModule.c(v.e, (DynamiteModule$a)DynamiteModule.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                final int a = q0.a;
                Object c;
                if (b == null) {
                    c = null;
                }
                else {
                    final IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    if (queryLocalInterface instanceof r0) {
                        c = queryLocalInterface;
                    }
                    else {
                        c = new p0(b);
                    }
                }
                v.c = (r0)c;
            }
        }
    }
}
