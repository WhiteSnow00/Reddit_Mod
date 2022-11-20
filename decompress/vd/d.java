// 
// Decompiled by Procyon v0.6.0
// 

package vd;

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
        if (vd.d.a == null) {
            vd.d.a = packageManager.hasSystemFeature("android.hardware.type.watch");
        }
        if (vd.d.a) {
            if (vd.d.b == null) {
                vd.d.b = context.getPackageManager().hasSystemFeature("cn.google");
            }
            if (vd.d.b) {
                if (!f.a()) {
                    return true;
                }
            }
        }
        return false;
    }
}
