// 
// Decompiled by Procyon v0.6.0
// 

package vd;

import xd.b;
import android.app.AppOpsManager;
import xd.c;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import nd.g;
import nd.h;
import android.content.Context;

public final class i
{
    public static boolean a(final Context context, final int n) {
        final boolean b = b(context, n, "com.google.android.gms");
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final PackageManager packageManager = context.getPackageManager();
        try {
            final PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
            final h a = h.a(context);
            a.getClass();
            boolean b3;
            if (packageInfo == null) {
                b3 = b2;
            }
            else {
                if (!h.d(packageInfo, false)) {
                    b3 = b2;
                    if (!h.d(packageInfo, true)) {
                        return b3;
                    }
                    if (!g.honorsDebugCertificates(a.a)) {
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        b3 = b2;
                        return b3;
                    }
                }
                b3 = true;
            }
            return b3;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }
    
    public static boolean b(final Context context, final int n, final String s) {
        final b a = c.a(context);
        a.getClass();
        boolean b;
        try {
            final AppOpsManager appOpsManager = (AppOpsManager)a.a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(n, s);
            b = true;
        }
        catch (final SecurityException ex) {
            b = false;
        }
        return b;
    }
}
