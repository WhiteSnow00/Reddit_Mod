// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.content.Context;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import a2.b;
import java.util.Arrays;
import android.text.TextUtils;
import java.util.HashSet;
import a4.f;
import android.view.DragEvent;
import java.lang.reflect.Method;
import android.os.Handler;
import android.app.Application;
import m3.e;
import m3.d;
import android.app.Application$ActivityLifecycleCallbacks;
import m3.g$a;
import m3.g;
import android.content.ContextWrapper;
import android.os.Build$VERSION;
import android.net.Uri;
import android.app.Activity;
import n3.a;

public class ActivityCompat extends a
{
    private static ActivityCompat.ActivityCompat$PermissionCompatDelegate sDelegate;
    
    public static void finishAffinity(final Activity activity) {
        ActivityCompat.ActivityCompat$a.a(activity);
    }
    
    public static void finishAfterTransition(final Activity activity) {
        ActivityCompat.ActivityCompat$b.a(activity);
    }
    
    public static ActivityCompat.ActivityCompat$PermissionCompatDelegate getPermissionCompatDelegate() {
        return ActivityCompat.sDelegate;
    }
    
    public static Uri getReferrer(final Activity activity) {
        return ActivityCompat.ActivityCompat$c.a(activity);
    }
    
    @Deprecated
    public static boolean invalidateOptionsMenu(final Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }
    
    public static boolean isLaunchedFromBubble(final Activity activity) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 31) {
            return ActivityCompat.ActivityCompat$g.a(activity);
        }
        final boolean b = true;
        boolean b2 = true;
        if (sdk_INT == 30) {
            if (ActivityCompat.ActivityCompat$f.a((ContextWrapper)activity) == null || ActivityCompat.ActivityCompat$f.a((ContextWrapper)activity).getDisplayId() == 0) {
                b2 = false;
            }
            return b2;
        }
        return sdk_INT == 29 && activity.getWindowManager().getDefaultDisplay() != null && activity.getWindowManager().getDefaultDisplay().getDisplayId() != 0 && b;
    }
    
    private static void lambda$recreate$0(final Activity activity) {
        if (activity.isFinishing()) {
            return;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n = 0;
        Label_0308: {
            if (sdk_INT >= 28) {
                final Object o = m3.g.a;
                activity.recreate();
                break Label_0308;
            }
            final Class a = m3.g.a;
            while (true) {
                if ((sdk_INT == 26 || sdk_INT == 27) && m3.g.f == null) {
                    final int n2 = n;
                    break Label_0345;
                }
                if (m3.g.e == null && m3.g.d == null) {
                    final int n2 = n;
                    break Label_0345;
                }
                try {
                    final Object value = m3.g.c.get(activity);
                    int n2;
                    if (value == null) {
                        n2 = n;
                    }
                    else {
                        final Object value2 = m3.g.b.get(activity);
                        if (value2 == null) {
                            n2 = n;
                        }
                        else {
                            final Object o = activity.getApplication();
                            final g$a g$a = new g$a(activity);
                            ((Application)o).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)g$a);
                            final Handler g = m3.g.g;
                            g.post((Runnable)new m3.d(g$a, value));
                            if (sdk_INT != 26 && sdk_INT != 27) {
                                n2 = 0;
                            }
                            else {
                                n2 = 1;
                            }
                            Label_0283: {
                                if (n2 == 0) {
                                    break Label_0283;
                                }
                                try {
                                    final Method f = m3.g.f;
                                    final Boolean false = Boolean.FALSE;
                                    f.invoke(value2, value, null, null, 0, false, null, null, false, false);
                                    while (true) {
                                        g.post((Runnable)new m3.e((Application)o, g$a));
                                        n2 = 1;
                                        break Label_0345;
                                        activity.recreate();
                                        continue;
                                    }
                                }
                                finally {
                                    m3.g.g.post((Runnable)new m3.e((Application)o, g$a));
                                }
                            }
                        }
                    }
                    if (n2 == 0) {
                        activity.recreate();
                    }
                }
                finally {
                    final int n2 = n;
                    continue;
                }
                break;
            }
        }
    }
    
    public static void postponeEnterTransition(final Activity activity) {
        ActivityCompat.ActivityCompat$b.b(activity);
    }
    
    public static void recreate(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 28) {
            activity.recreate();
        }
        else {
            new Handler(((Context)activity).getMainLooper()).post((Runnable)new m3.a(activity, 0));
        }
    }
    
    public static a4.f requestDragAndDropPermissions(final Activity activity, final DragEvent dragEvent) {
        a4.f f;
        if (a4.f.a.b(activity, dragEvent) != null) {
            f = new a4.f();
        }
        else {
            f = null;
        }
        return f;
    }
    
    public static void requestPermissions(final Activity activity, final String[] array, final int n) {
        final ActivityCompat.ActivityCompat$PermissionCompatDelegate sDelegate = ActivityCompat.sDelegate;
        if (sDelegate != null && sDelegate.requestPermissions(activity, array, n)) {
            return;
        }
        final HashSet set = new HashSet();
        final int n2 = 0;
        for (int i = 0; i < array.length; ++i) {
            if (TextUtils.isEmpty((CharSequence)array[i])) {
                throw new IllegalArgumentException(a2.b.j(a.k("Permission request for permissions "), Arrays.toString(array), " must not contain null or empty values"));
            }
            if (!v3.a.b() && TextUtils.equals((CharSequence)array[i], (CharSequence)"android.permission.POST_NOTIFICATIONS")) {
                set.add(i);
            }
        }
        final int size = set.size();
        String[] array2;
        if (size > 0) {
            array2 = new String[array.length - size];
        }
        else {
            array2 = array;
        }
        if (size > 0) {
            if (size == array.length) {
                return;
            }
            int n3 = 0;
            int n4;
            for (int j = n2; j < array.length; ++j, n3 = n4) {
                n4 = n3;
                if (!set.contains(j)) {
                    array2[n3] = array[j];
                    n4 = n3 + 1;
                }
            }
        }
        if (activity instanceof ActivityCompat.ActivityCompat$RequestPermissionsRequestCodeValidator) {
            ((ActivityCompat.ActivityCompat$RequestPermissionsRequestCodeValidator)activity).validateRequestPermissionsRequestCode(n);
        }
        ActivityCompat.ActivityCompat$d.b(activity, array, n);
    }
    
    public static <T extends View> T requireViewById(final Activity activity, final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            return (T)ActivityCompat.ActivityCompat$e.a(activity, n);
        }
        final View viewById = activity.findViewById(n);
        if (viewById != null) {
            return (T)viewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }
    
    public static void setEnterSharedElementCallback(final Activity activity, final SharedElementCallback sharedElementCallback) {
        Object o;
        if (sharedElementCallback != null) {
            o = new ActivityCompat.ActivityCompat$h(sharedElementCallback);
        }
        else {
            o = null;
        }
        ActivityCompat.ActivityCompat$b.c(activity, (android.app.SharedElementCallback)o);
    }
    
    public static void setExitSharedElementCallback(final Activity activity, final SharedElementCallback sharedElementCallback) {
        Object o;
        if (sharedElementCallback != null) {
            o = new ActivityCompat.ActivityCompat$h(sharedElementCallback);
        }
        else {
            o = null;
        }
        ActivityCompat.ActivityCompat$b.d(activity, (android.app.SharedElementCallback)o);
    }
    
    public static void setLocusContext(final Activity activity, final n3.b b, final Bundle bundle) {
        if (Build$VERSION.SDK_INT >= 30) {
            ActivityCompat.ActivityCompat$f.b(activity, b, bundle);
        }
    }
    
    public static void setPermissionCompatDelegate(final ActivityCompat.ActivityCompat$PermissionCompatDelegate sDelegate) {
        ActivityCompat.sDelegate = sDelegate;
    }
    
    public static boolean shouldShowRequestPermissionRationale(final Activity activity, final String s) {
        return (v3.a.b() || !TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)s)) && ActivityCompat.ActivityCompat$d.c(activity, s);
    }
    
    public static void startActivityForResult(final Activity activity, final Intent intent, final int n, final Bundle bundle) {
        ActivityCompat.ActivityCompat$a.b(activity, intent, n, bundle);
    }
    
    public static void startIntentSenderForResult(final Activity activity, final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) throws IntentSender$SendIntentException {
        ActivityCompat.ActivityCompat$a.c(activity, intentSender, n, intent, n2, n3, n4, bundle);
    }
    
    public static void startPostponedEnterTransition(final Activity activity) {
        ActivityCompat.ActivityCompat$b.e(activity);
    }
}
