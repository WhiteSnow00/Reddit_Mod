// 
// Decompiled by Procyon v0.6.0
// 

package nd;

import android.content.pm.ApplicationInfo;
import android.os.StrictMode$ThreadPolicy;
import android.content.pm.PackageManager$NameNotFoundException;
import vl.a;
import android.os.IBinder;
import yd.b;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import android.os.RemoteException;
import android.os.StrictMode;
import android.content.pm.Signature;
import android.content.pm.PackageInfo;
import android.util.Log;
import mg.d0;
import android.content.Context;

public final class h
{
    public static h c;
    public final Context a;
    public volatile String b;
    
    public h(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    public static h a(final Context context) {
        d0.y((Object)context);
        synchronized (h.class) {
            if (h.c == null) {
                final p a = v.a;
                synchronized (v.class) {
                    if (v.e == null) {
                        v.e = context.getApplicationContext();
                        monitorexit(v.class);
                    }
                    else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                        monitorexit(v.class);
                    }
                    h.c = new h(context);
                }
            }
            return h.c;
        }
    }
    
    public static final r c(final PackageInfo packageInfo, final r... array) {
        final Signature[] signatures = packageInfo.signatures;
        if (signatures == null) {
            return null;
        }
        if (signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        final Signature[] signatures2 = packageInfo.signatures;
        int i = 0;
        final s s = new s(signatures2[0].toByteArray());
        while (i < array.length) {
            if (array[i].equals((Object)s)) {
                return array[i];
            }
            ++i;
        }
        return null;
    }
    
    public static final boolean d(final PackageInfo packageInfo, final boolean b) {
        if (packageInfo != null && packageInfo.signatures != null) {
            r r;
            if (b) {
                r = c(packageInfo, u.a);
            }
            else {
                r = c(packageInfo, u.a[0]);
            }
            if (r != null) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean b(int i) {
        final String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        nd.d0 d0 = null;
        Label_0701: {
            if (packagesForUid != null) {
                final int length = packagesForUid.length;
                if (length != 0) {
                    d0 = null;
                    String b;
                    p a;
                    StrictMode$ThreadPolicy allowThreadDiskReads;
                    boolean b2;
                    final RemoteException ex;
                    StrictMode$ThreadPolicy allowThreadDiskReads2;
                    w w;
                    y u0;
                    nd.d0 d2;
                    String g;
                    String value;
                    String concat;
                    PackageInfo packageInfo;
                    Signature[] signatures;
                    s s;
                    String packageName;
                    Object o;
                    nd.d0 a2;
                    nd.d0 a3;
                    String concat2;
                    for (i = 0; i < length; ++i) {
                        b = packagesForUid[i];
                        Label_0669: {
                            if (b == null) {
                                d0 = nd.d0.b("null pkg");
                            }
                            else if (!b.equals(this.b)) {
                                a = v.a;
                                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                try {
                                    try {
                                        v.b();
                                        b2 = v.c.d();
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    }
                                    finally {}
                                }
                                catch (final RemoteException ex) {}
                                catch (final DynamiteModule$LoadingException ex2) {}
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                b2 = false;
                                Label_0594: {
                                    if (b2) {
                                        b2 = nd.g.honorsDebugCertificates(this.a);
                                        allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                        try {
                                            mg.d0.y((Object)v.e);
                                            Label_0369: {
                                                try {
                                                    v.b();
                                                    w = new w(b, b2, false, (IBinder)new b(v.e), false);
                                                    try {
                                                        u0 = v.c.u0(w);
                                                        if (u0.f) {
                                                            d2 = nd.d0.d;
                                                            break Label_0369;
                                                        }
                                                        if ((g = u0.g) == null) {
                                                            g = "error checking package certificate";
                                                        }
                                                        if (vl.a.B3(u0.h) == 4) {
                                                            nd.d0.c(g, (Exception)new PackageManager$NameNotFoundException());
                                                            break Label_0369;
                                                        }
                                                        nd.d0.b(g);
                                                        break Label_0369;
                                                    }
                                                    catch (final RemoteException ex3) {
                                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex3);
                                                        nd.d0.c("module call", (Exception)ex3);
                                                        break Label_0369;
                                                    }
                                                    break Label_0369;
                                                }
                                                catch (final DynamiteModule$LoadingException ex4) {
                                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex4);
                                                    value = String.valueOf(((Throwable)ex4).getMessage());
                                                    if (value.length() != 0) {
                                                        concat = "module init: ".concat(value);
                                                    }
                                                    else {
                                                        concat = new String("module init: ");
                                                    }
                                                    nd.d0.c(concat, (Exception)ex4);
                                                }
                                            }
                                            break Label_0594;
                                        }
                                        finally {
                                            StrictMode.setThreadPolicy(allowThreadDiskReads2);
                                        }
                                    }
                                    try {
                                        packageInfo = this.a.getPackageManager().getPackageInfo(b, 64);
                                        b2 = nd.g.honorsDebugCertificates(this.a);
                                        if (packageInfo == null) {
                                            d0 = nd.d0.b("null pkg");
                                        }
                                        else {
                                            signatures = packageInfo.signatures;
                                            if (signatures != null) {
                                                if (signatures.length == 1) {
                                                    s = new s(packageInfo.signatures[0].toByteArray());
                                                    packageName = packageInfo.packageName;
                                                    o = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        a2 = v.a(packageName, (r)s, b2, false);
                                                        StrictMode.setThreadPolicy((StrictMode$ThreadPolicy)o);
                                                        if (a2.a) {
                                                            o = packageInfo.applicationInfo;
                                                            if (o != null && (((ApplicationInfo)o).flags & 0x2) != 0x0) {
                                                                o = StrictMode.allowThreadDiskReads();
                                                                try {
                                                                    a3 = v.a(packageName, (r)s, false, true);
                                                                    StrictMode.setThreadPolicy((StrictMode$ThreadPolicy)o);
                                                                    if (a3.a) {
                                                                        nd.d0.b("debuggable release cert app rejected");
                                                                    }
                                                                }
                                                                finally {
                                                                    StrictMode.setThreadPolicy((StrictMode$ThreadPolicy)o);
                                                                }
                                                            }
                                                        }
                                                        break Label_0594;
                                                    }
                                                    finally {
                                                        StrictMode.setThreadPolicy((StrictMode$ThreadPolicy)o);
                                                    }
                                                }
                                            }
                                            d0 = nd.d0.b("single cert required");
                                        }
                                        if (d0.a) {
                                            this.b = b;
                                        }
                                    }
                                    catch (final PackageManager$NameNotFoundException ex5) {
                                        if (b.length() != 0) {
                                            concat2 = "no pkg ".concat(b);
                                        }
                                        else {
                                            concat2 = new String("no pkg ");
                                        }
                                        d0 = nd.d0.c(concat2, (Exception)ex5);
                                    }
                                }
                                break Label_0669;
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            }
                            else {
                                d0 = nd.d0.d;
                            }
                        }
                        if (d0.a) {
                            break Label_0701;
                        }
                    }
                    mg.d0.y((Object)d0);
                    break Label_0701;
                }
            }
            d0 = nd.d0.b("no pkgs");
        }
        if (!d0.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (d0.c != null) {
                Log.d("GoogleCertificatesRslt", d0.a(), d0.c);
            }
            else {
                Log.d("GoogleCertificatesRslt", d0.a());
            }
        }
        return d0.a;
    }
}
