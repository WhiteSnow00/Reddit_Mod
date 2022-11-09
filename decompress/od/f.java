// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.net.Uri$Builder;
import android.app.PendingIntent;
import android.content.pm.PackageManager$NameNotFoundException;
import yd.c;
import android.text.TextUtils;
import wd.d;
import android.net.Uri;
import rd.i1;
import android.content.Intent;
import android.content.Context;

public class f
{
    public static final int a;
    public static final f b;
    
    static {
        a = g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        b = new f();
    }
    
    public Intent a(final Context context, int n, String string) {
        if (n != 1 && n != 2) {
            if (n != 3) {
                return null;
            }
            n = i1.a;
            final Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String)null);
            final Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        else {
            if (context != null && d.a(context)) {
                n = i1.a;
                final Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
                intent2.setPackage("com.google.android.wearable.app");
                return intent2;
            }
            Object o = a.k("gcore_");
            ((StringBuilder)o).append(f.a);
            ((StringBuilder)o).append("-");
            if (!TextUtils.isEmpty((CharSequence)string)) {
                ((StringBuilder)o).append(string);
            }
            ((StringBuilder)o).append("-");
            if (context != null) {
                ((StringBuilder)o).append(context.getPackageName());
            }
            ((StringBuilder)o).append("-");
            while (true) {
                if (context == null) {
                    break Label_0178;
                }
                try {
                    ((StringBuilder)o).append(c.a(context).b(0, context.getPackageName()).versionCode);
                    string = ((StringBuilder)o).toString();
                    n = i1.a;
                    final Intent intent3 = new Intent("android.intent.action.VIEW");
                    o = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                    if (!TextUtils.isEmpty((CharSequence)string)) {
                        ((Uri$Builder)o).appendQueryParameter("pcampaignid", string);
                    }
                    intent3.setData(((Uri$Builder)o).build());
                    intent3.setPackage("com.android.vending");
                    intent3.addFlags(524288);
                    return intent3;
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final PendingIntent b(final int n, final int n2, final Context context, final String s) {
        final Intent a = this.a(context, n, s);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, n2, a, he.d.a | 0x8000000);
    }
    
    public int c(final Context context, int googlePlayServicesAvailable) {
        googlePlayServicesAvailable = g.isGooglePlayServicesAvailable(context, googlePlayServicesAvailable);
        if (g.isPlayServicesPossiblyUpdating(context, googlePlayServicesAvailable)) {
            return 18;
        }
        return googlePlayServicesAvailable;
    }
}
