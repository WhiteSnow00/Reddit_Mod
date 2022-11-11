// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.pm.PackageManager;
import android.app.AppOpsManager;
import android.os.Build$VERSION;
import android.os.Process;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 06y
{
    static {
        Covode.recordClassIndex(761);
    }
    
    public static int LIZ(final Context context, final String s) {
        return LIZ(context, s, Process.myPid(), Process.myUid(), context.getPackageName());
    }
    
    public static int LIZ(final Context context, String permissionToOp, final int n, final int n2, final String s) {
        if (context.checkPermission(permissionToOp, n, n2) == -1) {
            return -1;
        }
        if (Build$VERSION.SDK_INT >= 23) {
            permissionToOp = AppOpsManager.permissionToOp(permissionToOp);
        }
        else {
            permissionToOp = null;
        }
        if (permissionToOp == null) {
            return 0;
        }
        String s2;
        if ((s2 = s) == null) {
            final PackageManager packageManager = context.getPackageManager();
            final 5an liz = new 5aq().LIZ(101310, "android/content/pm/PackageManager", "getPackagesForUid", (Object)packageManager, new Object[] { n2 }, "java.lang.String[]", new 5dv(false));
            String[] packagesForUid;
            if (liz.LIZ) {
                packagesForUid = (String[])liz.LIZIZ;
            }
            else {
                packagesForUid = packageManager.getPackagesForUid(n2);
            }
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            s2 = packagesForUid[0];
        }
        if (Build$VERSION.SDK_INT < 23 || ((AppOpsManager)context.getSystemService((Class)AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, s2) != 0) {
            return -2;
        }
        return 0;
    }
}
