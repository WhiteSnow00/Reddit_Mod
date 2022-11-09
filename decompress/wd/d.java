// 
// Decompiled by Procyon v0.6.0
// 

package wd;

import android.content.pm.PackageManager;
import android.content.Context;

public final class d
{
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    
    public static boolean a(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        if (wd.d.a == null) {
            wd.d.a = packageManager.hasSystemFeature("android.hardware.type.watch");
        }
        if (wd.d.a) {
            if (wd.d.b == null) {
                wd.d.b = context.getPackageManager().hasSystemFeature("cn.google");
            }
            if (wd.d.b) {
                if (!f.a()) {
                    return true;
                }
            }
        }
        return false;
    }
}
