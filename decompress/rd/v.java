// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import com.google.android.gms.common.GooglePlayServicesUtil;
import v3.e;
import android.util.Log;
import android.content.res.Resources;
import wd.d;
import yd.b;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import yd.c;
import android.content.Context;
import java.util.Locale;
import j0.i;

public final class v
{
    public static final i<String, String> a;
    public static Locale b;
    
    static {
        a = new i();
    }
    
    public static String a(final Context context) {
        final String packageName = context.getPackageName();
        try {
            final b a = c.a(context);
            return a.a.getPackageManager().getApplicationLabel(a.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        }
        catch (final PackageManager$NameNotFoundException | NullPointerException ex) {
            final String name = context.getApplicationInfo().name;
            if (TextUtils.isEmpty((CharSequence)name)) {
                return packageName;
            }
            return name;
        }
    }
    
    public static String b(final int n, final Context context) {
        final Resources resources = context.getResources();
        final String a = a(context);
        if (n == 1) {
            return resources.getString(2131952610, new Object[] { a });
        }
        if (n != 2) {
            if (n == 3) {
                return resources.getString(2131952607, new Object[] { a });
            }
            if (n == 5) {
                return d(context, "common_google_play_services_invalid_account_text", a);
            }
            if (n == 7) {
                return d(context, "common_google_play_services_network_error_text", a);
            }
            if (n == 9) {
                return resources.getString(2131952615, new Object[] { a });
            }
            if (n == 20) {
                return d(context, "common_google_play_services_restricted_profile_text", a);
            }
            switch (n) {
                default: {
                    return resources.getString(2131952614, new Object[] { a });
                }
                case 18: {
                    return resources.getString(2131952619, new Object[] { a });
                }
                case 17: {
                    return d(context, "common_google_play_services_sign_in_failed_text", a);
                }
                case 16: {
                    return d(context, "common_google_play_services_api_unavailable_text", a);
                }
            }
        }
        else {
            if (d.a(context)) {
                return resources.getString(2131952620);
            }
            return resources.getString(2131952617, new Object[] { a });
        }
    }
    
    public static String c(final int n, final Context context) {
        final Resources resources = context.getResources();
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(n);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            }
            case 20: {
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
            }
            case 17: {
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            }
            case 16: {
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            }
            case 11: {
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            }
            case 10: {
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            }
            case 9: {
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            }
            case 8: {
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            }
            case 7: {
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            }
            case 5: {
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            }
            case 4:
            case 6:
            case 18: {
                return null;
            }
            case 3: {
                return resources.getString(2131952608);
            }
            case 2: {
                return resources.getString(2131952618);
            }
            case 1: {
                return resources.getString(2131952611);
            }
        }
    }
    
    public static String d(final Context context, String s, final String s2) {
        final Resources resources = context.getResources();
        String s3;
        s = (s3 = e(context, s));
        if (s == null) {
            s3 = resources.getString(2131952614);
        }
        return String.format(resources.getConfiguration().locale, s3, s2);
    }
    
    public static String e(final Context context, final String s) {
        final i<String, String> a = v.a;
        synchronized (a) {
            final Locale b = e.a(context.getResources().getConfiguration()).b(0);
            if (!b.equals(v.b)) {
                a.clear();
                v.b = b;
            }
            final String s2 = (String)a.getOrDefault((Object)s, (Object)null);
            if (s2 != null) {
                return s2;
            }
            final Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            final int identifier = remoteResource.getIdentifier(s, "string", "com.google.android.gms");
            if (identifier == 0) {
                String concat;
                if (s.length() != 0) {
                    concat = "Missing resource: ".concat(s);
                }
                else {
                    concat = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", concat);
                return null;
            }
            final String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty((CharSequence)string)) {
                String concat2;
                if (s.length() != 0) {
                    concat2 = "Got empty resource: ".concat(s);
                }
                else {
                    concat2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", concat2);
                return null;
            }
            a.put((Object)s, (Object)string);
            return string;
        }
    }
}
