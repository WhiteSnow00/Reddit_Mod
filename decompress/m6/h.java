// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.Context;
import c6.i;

public final class h
{
    public static final String a;
    
    static {
        a = i.e("PackageManagerHelper");
    }
    
    public static void a(final Context context, final Class<?> clazz, final boolean b) {
        final String s = "enabled";
        try {
            final PackageManager packageManager = context.getPackageManager();
            final ComponentName componentName = new ComponentName(context, clazz.getName());
            int n;
            if (b) {
                n = 1;
            }
            else {
                n = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, n, 1);
            final i c = i.c();
            final String a = h.a;
            final String name = clazz.getName();
            String s2;
            if (b) {
                s2 = "enabled";
            }
            else {
                s2 = "disabled";
            }
            c.a(a, String.format("%s %s", name, s2), new Throwable[0]);
        }
        catch (final Exception ex) {
            final i c2 = i.c();
            final String a2 = h.a;
            final String name2 = clazz.getName();
            String s3;
            if (b) {
                s3 = s;
            }
            else {
                s3 = "disabled";
            }
            c2.a(a2, String.format("%s could not be %s", name2, s3), ex);
        }
    }
}
