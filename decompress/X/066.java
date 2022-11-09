// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import android.content.ComponentName;
import android.content.Intent;
import android.app.Activity;
import com.bytedance.covode.number.Covode;

public final class 066
{
    static {
        Covode.recordClassIndex(694);
    }
    
    public static Intent LIZ(final Activity activity) {
        final Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        final String liziz = LIZIZ(activity);
        if (liziz == null) {
            return null;
        }
        final ComponentName component = new ComponentName((Context)activity, liziz);
        try {
            if (LIZIZ((Context)activity, component) == null) {
                return Intent.makeMainActivity(component);
            }
            return new Intent().setComponent(component);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public static Intent LIZ(final Context context, ComponentName component) {
        final String liziz = LIZIZ(context, component);
        if (liziz == null) {
            return null;
        }
        component = new ComponentName(component.getPackageName(), liziz);
        Intent intent;
        if (LIZIZ(context, component) == null) {
            intent = Intent.makeMainActivity(component);
        }
        else {
            intent = new Intent().setComponent(component);
        }
        return intent;
    }
    
    public static String LIZIZ(final Activity activity) {
        try {
            return LIZIZ((Context)activity, activity.getComponentName());
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new IllegalArgumentException((Throwable)ex);
        }
    }
    
    public static String LIZIZ(final Context context, final ComponentName componentName) {
        final PackageManager packageManager = context.getPackageManager();
        int n;
        if (Build$VERSION.SDK_INT >= 29) {
            n = 269222528;
        }
        else if (Build$VERSION.SDK_INT >= 24) {
            n = 787072;
        }
        else {
            n = 640;
        }
        final ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, n);
        final String parentActivityName = activityInfo.parentActivityName;
        if (parentActivityName != null) {
            return parentActivityName;
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        final String string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
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
}
