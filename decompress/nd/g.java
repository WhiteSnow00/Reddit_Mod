// 
// Decompiled by Procyon v0.6.0
// 

package nd;

import android.os.BaseBundle;
import java.util.Iterator;
import android.content.pm.PackageInstaller$SessionInfo;
import android.os.UserManager;
import vd.i;
import android.content.pm.PackageManager;
import mg.d0;
import vd.d;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import qd.s0;
import android.os.Build;
import android.content.res.Resources;
import android.app.PendingIntent;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import xd.c;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Intent;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import android.util.Log;
import android.app.NotificationManager;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public class g
{
    public static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    public static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static final AtomicBoolean sCanceledAvailabilityNotification;
    public static boolean zza;
    private static boolean zzb;
    private static final AtomicBoolean zzc;
    
    static {
        sCanceledAvailabilityNotification = new AtomicBoolean();
        zzc = new AtomicBoolean();
    }
    
    @Deprecated
    public static void cancelAvailabilityErrorNotifications(final Context context) {
        if (g.sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            final NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        }
        catch (final SecurityException ex) {}
    }
    
    public static void enableUsingApkIndependentContext() {
        g.zzc.set(true);
    }
    
    @Deprecated
    public static void ensurePlayServicesAvailable(final Context context, int c) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        final f b = f.b;
        c = b.c(context, c);
        if (c == 0) {
            return;
        }
        final Intent a = b.a(context, c, "e");
        final StringBuilder sb = new StringBuilder(57);
        sb.append("GooglePlayServices not available due to error ");
        sb.append(c);
        Log.e("GooglePlayServicesUtil", sb.toString());
        if (a == null) {
            throw new GooglePlayServicesNotAvailableException(c);
        }
        throw new GooglePlayServicesRepairableException(c, "Google Play Services not available", a);
    }
    
    @Deprecated
    public static int getApkVersion(final Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }
    
    @Deprecated
    public static int getClientVersion(final Context context) {
        final String packageName = context.getPackageName();
        PackageInfo b;
        try {
            b = c.a(context).b(128, packageName);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            b = null;
        }
        int int1;
        final int n = int1 = -1;
        if (b != null) {
            final ApplicationInfo applicationInfo = b.applicationInfo;
            if (applicationInfo == null) {
                int1 = n;
            }
            else {
                final Bundle metaData = applicationInfo.metaData;
                int1 = n;
                if (metaData != null) {
                    int1 = ((BaseBundle)metaData).getInt("com.google.android.gms.version", -1);
                }
            }
        }
        return int1;
    }
    
    @Deprecated
    public static PendingIntent getErrorPendingIntent(final int n, final Context context, final int n2) {
        return f.b.b(n, n2, context, null);
    }
    
    @Deprecated
    public static String getErrorString(final int n) {
        return b.u(n);
    }
    
    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(final int n) {
        return f.b.a(null, n, null);
    }
    
    public static Context getRemoteContext(Context packageContext) {
        try {
            packageContext = packageContext.createPackageContext("com.google.android.gms", 3);
            return packageContext;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public static Resources getRemoteResource(final Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public static boolean honorsDebugCertificates(final Context context) {
        if (!g.zza) {
            try {
                try {
                    final PackageInfo b = c.a(context).b(64, "com.google.android.gms");
                    h.a(context);
                    if (b != null && !h.d(b, false) && h.d(b, true)) {
                        g.zzb = true;
                    }
                    else {
                        g.zzb = false;
                    }
                    g.zza = true;
                }
                finally {}
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", (Throwable)ex);
                g.zza = true;
                return g.zzb || !"user".equals(Build.TYPE);
            }
            g.zza = true;
        }
        return g.zzb || !"user".equals(Build.TYPE);
    }
    
    @Deprecated
    public static int isGooglePlayServicesAvailable(final Context context) {
        return isGooglePlayServicesAvailable(context, g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
    
    @Deprecated
    public static int isGooglePlayServicesAvailable(final Context context, int n) {
        try {
            context.getResources().getString(2131952634);
        }
        finally {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        final boolean equals = "com.google.android.gms".equals(context.getPackageName());
        final int n2 = 1;
        if (!equals) {
            if (!g.zzc.get()) {
                synchronized (s0.a) {
                    Label_0155: {
                        if (s0.b) {
                            monitorexit(s0.a);
                        }
                        else {
                            s0.b = true;
                            final String packageName = context.getPackageName();
                            final xd.b a = c.a(context);
                            try {
                                final Bundle metaData = a.a(128, packageName).metaData;
                                if (metaData == null) {
                                    monitorexit(s0.a);
                                    break Label_0155;
                                }
                                ((BaseBundle)metaData).getString("com.google.app.id");
                                s0.c = ((BaseBundle)metaData).getInt("com.google.android.gms.version");
                            }
                            catch (final PackageManager$NameNotFoundException ex) {
                                Log.wtf("MetadataValueReader", "This should never happen.", (Throwable)ex);
                            }
                            monitorexit(s0.a);
                        }
                    }
                    final int c = s0.c;
                    if (c == 0) {
                        throw new GooglePlayServicesMissingManifestValueException();
                    }
                    if (c != g.GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                        throw new GooglePlayServicesIncorrectManifestValueException(c);
                    }
                }
            }
        }
        boolean b = false;
        Label_0271: {
            if (!d.a(context)) {
                if (d.c == null) {
                    d.c = (context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
                }
                if (!d.c) {
                    b = true;
                    break Label_0271;
                }
            }
            b = false;
        }
        d0.p(n >= 0);
        final String packageName2 = context.getPackageName();
        final PackageManager packageManager = context.getPackageManager();
        Label_0473: {
            if (b) {
                try {
                    final PackageInfo packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    break Label_0473;
                }
                catch (final PackageManager$NameNotFoundException ex2) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName2).concat(" requires the Google Play Store, but it is missing."));
                    break Label_0473;
                }
            }
            final PackageInfo packageInfo = null;
            try {
                final PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                h.a(context);
                if (!h.d(packageInfo2, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName2).concat(" requires Google Play services, but their signature is invalid."));
                }
                else {
                    if (b) {
                        d0.y((Object)packageInfo);
                        if (!h.d(packageInfo, true)) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName2).concat(" requires Google Play Store, but its signature is invalid."));
                            break Label_0473;
                        }
                    }
                    if (b && packageInfo != null && !packageInfo.signatures[0].equals((Object)packageInfo2.signatures[0])) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName2).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                    else {
                        final int versionCode = packageInfo2.versionCode;
                        int n3 = -1;
                        int n4;
                        if (versionCode == -1) {
                            n4 = -1;
                        }
                        else {
                            n4 = versionCode / 1000;
                        }
                        if (n != -1) {
                            n3 = n / 1000;
                        }
                        if (n4 < n3) {
                            final StringBuilder sb = new StringBuilder(String.valueOf(packageName2).length() + 82);
                            sb.append("Google Play services out of date for ");
                            sb.append(packageName2);
                            sb.append(".  Requires ");
                            sb.append(n);
                            sb.append(" but found ");
                            sb.append(versionCode);
                            Log.w("GooglePlayServicesUtil", sb.toString());
                            n = 2;
                            return n;
                        }
                        ApplicationInfo applicationInfo;
                        if ((applicationInfo = packageInfo2.applicationInfo) == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            }
                            catch (final PackageManager$NameNotFoundException ex3) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName2).concat(" requires Google Play services, but they're missing when getting application info."), (Throwable)ex3);
                                n = n2;
                                return n;
                            }
                        }
                        if (!applicationInfo.enabled) {
                            n = 3;
                            return n;
                        }
                        return 0;
                    }
                }
                n = 9;
            }
            catch (final PackageManager$NameNotFoundException ex4) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName2).concat(" requires Google Play services, but they are missing."));
                n = n2;
            }
        }
        return n;
    }
    
    @Deprecated
    public static boolean isGooglePlayServicesUid(final Context context, final int n) {
        return i.a(context, n);
    }
    
    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(final Context context, final int n) {
        return n == 18 || (n == 1 && zza(context, "com.google.android.gms"));
    }
    
    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(final Context context, final int n) {
        return n == 9 && zza(context, "com.android.vending");
    }
    
    public static boolean isRestrictedUserProfile(final Context context) {
        final Object systemService = context.getSystemService("user");
        d0.y(systemService);
        final Bundle applicationRestrictions = ((UserManager)systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(((BaseBundle)applicationRestrictions).getString("restricted_profile"));
    }
    
    @Deprecated
    public static boolean isSidewinderDevice(final Context context) {
        if (d.b == null) {
            d.b = context.getPackageManager().hasSystemFeature("cn.google");
        }
        return d.b;
    }
    
    @Deprecated
    public static boolean isUserRecoverableError(final int n) {
        return n == 1 || n == 2 || n == 3 || n == 9;
    }
    
    @Deprecated
    public static boolean uidHasPackageName(final Context context, final int n, final String s) {
        return i.b(context, n, s);
    }
    
    public static boolean zza(final Context context, final String s) {
        final boolean equals = s.equals("com.google.android.gms");
        try {
            final Iterator iterator = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (iterator.hasNext()) {
                if (s.equals(((PackageInstaller$SessionInfo)iterator.next()).getAppPackageName())) {
                    return true;
                }
            }
            final ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(s, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled && !isRestrictedUserProfile(context)) {
                return true;
            }
            return false;
        }
        catch (final Exception | PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
}
