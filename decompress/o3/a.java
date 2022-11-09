// 
// Decompiled by Procyon v0.6.0
// 

package o3;

import a4.t0;
import android.content.pm.PackageManager;
import a4.u0;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;

public final class a
{
    public static Signature[] a(final SigningInfo signingInfo) {
        return signingInfo.getApkContentsSigners();
    }
    
    public static long b(final PackageInfo packageInfo) {
        return u0.a(packageInfo);
    }
    
    public static Signature[] c(final SigningInfo signingInfo) {
        return signingInfo.getSigningCertificateHistory();
    }
    
    public static boolean d(final SigningInfo signingInfo) {
        return signingInfo.hasMultipleSigners();
    }
    
    public static boolean e(final PackageManager packageManager, final String s, final byte[] array, final int n) {
        return t0.j(packageManager, s, array, n);
    }
}
