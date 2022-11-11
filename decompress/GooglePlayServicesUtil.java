// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common;

import android.os.Handler;
import md.f;
import md.j;
import android.app.AlertDialog;
import pd.a0;
import pd.y;
import androidx.fragment.app.Fragment;
import android.content.res.Resources;
import android.app.PendingIntent;
import md.e;
import android.content.Context;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import android.app.Activity;
import md.g;

public final class GooglePlayServicesUtil extends g
{
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    
    static {
        GOOGLE_PLAY_SERVICES_VERSION_CODE = g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
    
    private GooglePlayServicesUtil() {
    }
    
    @Deprecated
    public static Dialog getErrorDialog(final int n, final Activity activity, final int n2) {
        return getErrorDialog(n, activity, n2, null);
    }
    
    @Deprecated
    public static Dialog getErrorDialog(final int n, final Activity activity, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        int n3 = n;
        if (g.isPlayServicesPossiblyUpdating((Context)activity, n)) {
            n3 = 18;
        }
        return (Dialog)e.d.d(n3, activity, n2, dialogInterface$OnCancelListener);
    }
    
    @Deprecated
    public static PendingIntent getErrorPendingIntent(final int n, final Context context, final int n2) {
        return g.getErrorPendingIntent(n, context, n2);
    }
    
    @Deprecated
    public static String getErrorString(final int n) {
        return g.getErrorString(n);
    }
    
    public static Context getRemoteContext(final Context context) {
        return g.getRemoteContext(context);
    }
    
    public static Resources getRemoteResource(final Context context) {
        return g.getRemoteResource(context);
    }
    
    @Deprecated
    public static int isGooglePlayServicesAvailable(final Context context) {
        return g.isGooglePlayServicesAvailable(context);
    }
    
    @Deprecated
    public static int isGooglePlayServicesAvailable(final Context context, final int n) {
        return g.isGooglePlayServicesAvailable(context, n);
    }
    
    @Deprecated
    public static boolean isUserRecoverableError(final int n) {
        return g.isUserRecoverableError(n);
    }
    
    @Deprecated
    public static boolean showErrorDialogFragment(final int n, final Activity activity, final int n2) {
        return showErrorDialogFragment(n, activity, n2, null);
    }
    
    @Deprecated
    public static boolean showErrorDialogFragment(final int n, final Activity activity, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        return showErrorDialogFragment(n, activity, null, n2, dialogInterface$OnCancelListener);
    }
    
    public static boolean showErrorDialogFragment(int n, final Activity activity, final Fragment fragment, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final boolean playServicesPossiblyUpdating = g.isPlayServicesPossiblyUpdating((Context)activity, n);
        boolean b = true;
        if (playServicesPossiblyUpdating) {
            n = 18;
        }
        final e d = e.d;
        if (fragment == null) {
            final AlertDialog d2 = d.d(n, activity, n2, dialogInterface$OnCancelListener);
            if (d2 == null) {
                b = false;
            }
            else {
                e.i(activity, d2, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener);
            }
            return b;
        }
        final AlertDialog g = e.g((Context)activity, n, (a0)new y(fragment, d.a((Context)activity, n, "d"), n2), dialogInterface$OnCancelListener);
        if (g == null) {
            return false;
        }
        e.i(activity, g, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener);
        return true;
    }
    
    @Deprecated
    public static void showErrorNotification(final int n, final Context context) {
        final e d = e.d;
        if (!g.isPlayServicesPossiblyUpdating(context, n) && !g.isPlayStorePossiblyUpdating(context, n)) {
            d.j(context, n, ((f)d).b(n, 0, context, "n"));
            return;
        }
        ((f)d).getClass();
        ((Handler)new j(d, context)).sendEmptyMessageDelayed(1, 120000L);
    }
}
