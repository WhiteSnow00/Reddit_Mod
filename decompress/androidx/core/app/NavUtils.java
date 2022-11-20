// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.os.BaseBundle;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import android.content.ComponentName;
import android.content.Intent;
import android.app.Activity;

public final class NavUtils
{
    public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
    private static final String TAG = "NavUtils";
    
    private NavUtils() {
    }
    
    public static Intent getParentActivityIntent(final Activity activity) {
        final Intent a = NavUtils.a.a(activity);
        if (a != null) {
            return a;
        }
        final String parentActivityName = getParentActivityName(activity);
        if (parentActivityName == null) {
            return null;
        }
        final ComponentName component = new ComponentName((Context)activity, parentActivityName);
        try {
            Intent intent;
            if (getParentActivityName((Context)activity, component) == null) {
                intent = Intent.makeMainActivity(component);
            }
            else {
                intent = new Intent().setComponent(component);
            }
            return intent;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getParentActivityIntent: bad parentActivityName '");
            sb.append(parentActivityName);
            sb.append("' in manifest");
            Log.e("NavUtils", sb.toString());
            return null;
        }
    }
    
    public static Intent getParentActivityIntent(final Context context, ComponentName component) throws PackageManager$NameNotFoundException {
        final String parentActivityName = getParentActivityName(context, component);
        if (parentActivityName == null) {
            return null;
        }
        component = new ComponentName(component.getPackageName(), parentActivityName);
        Intent intent;
        if (getParentActivityName(context, component) == null) {
            intent = Intent.makeMainActivity(component);
        }
        else {
            intent = new Intent().setComponent(component);
        }
        return intent;
    }
    
    public static Intent getParentActivityIntent(final Context context, final Class<?> clazz) throws PackageManager$NameNotFoundException {
        final String parentActivityName = getParentActivityName(context, new ComponentName(context, (Class)clazz));
        if (parentActivityName == null) {
            return null;
        }
        final ComponentName component = new ComponentName(context, parentActivityName);
        Intent intent;
        if (getParentActivityName(context, component) == null) {
            intent = Intent.makeMainActivity(component);
        }
        else {
            intent = new Intent().setComponent(component);
        }
        return intent;
    }
    
    public static String getParentActivityName(final Activity activity) {
        try {
            return getParentActivityName((Context)activity, activity.getComponentName());
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new IllegalArgumentException((Throwable)ex);
        }
    }
    
    public static String getParentActivityName(final Context context, final ComponentName componentName) throws PackageManager$NameNotFoundException {
        final PackageManager packageManager = context.getPackageManager();
        int n;
        if (Build$VERSION.SDK_INT >= 29) {
            n = 269222528;
        }
        else {
            n = 787072;
        }
        final ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, n);
        final String parentActivityName = activityInfo.parentActivityName;
        if (parentActivityName != null) {
            return parentActivityName;
        }
        final Bundle metaData = activityInfo.metaData;
        if (metaData == null) {
            return null;
        }
        final String string = ((BaseBundle)metaData).getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        String string2 = string;
        if (string.charAt(0) == '.') {
            final StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(string);
            string2 = sb.toString();
        }
        return string2;
    }
    
    public static void navigateUpFromSameTask(final Activity activity) {
        final Intent parentActivityIntent = getParentActivityIntent(activity);
        if (parentActivityIntent != null) {
            navigateUpTo(activity, parentActivityIntent);
            return;
        }
        final StringBuilder t = a.t("Activity ");
        t.append(activity.getClass().getSimpleName());
        t.append(" does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
        throw new IllegalArgumentException(t.toString());
    }
    
    public static void navigateUpTo(final Activity activity, final Intent intent) {
        a.b(activity, intent);
    }
    
    public static boolean shouldUpRecreateTask(final Activity activity, final Intent intent) {
        return a.c(activity, intent);
    }
    
    public static final class a
    {
        public static Intent a(final Activity activity) {
            return activity.getParentActivityIntent();
        }
        
        public static boolean b(final Activity activity, final Intent intent) {
            return activity.navigateUpTo(intent);
        }
        
        public static boolean c(final Activity activity, final Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }
}
