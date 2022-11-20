// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import java.util.Map;
import java.util.List;
import android.content.Context;
import android.os.Parcelable;
import android.graphics.RectF;
import android.graphics.Matrix;
import a4.y0;
import android.content.LocusId;
import a4.x0;
import android.view.Display;
import a4.n0;
import android.app.SharedElementCallback$OnSharedElementsReadyListener;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import android.text.TextUtils;
import java.util.HashSet;
import a4.f$a;
import a4.f;
import android.view.DragEvent;
import h.d;
import java.lang.reflect.Method;
import android.os.Handler;
import android.app.Application;
import m3.c;
import m3.b;
import android.app.Application$ActivityLifecycleCallbacks;
import m3.e$a;
import m3.e;
import android.content.ContextWrapper;
import android.os.Build$VERSION;
import android.net.Uri;
import android.app.Activity;
import n3.a;

public class ActivityCompat extends n3.a
{
    private static PermissionCompatDelegate sDelegate;
    
    public static void a(final Activity activity) {
        lambda$recreate$0(activity);
    }
    
    public static void finishAffinity(final Activity activity) {
        a.a(activity);
    }
    
    public static void finishAfterTransition(final Activity activity) {
        b.a(activity);
    }
    
    public static PermissionCompatDelegate getPermissionCompatDelegate() {
        return ActivityCompat.sDelegate;
    }
    
    public static Uri getReferrer(final Activity activity) {
        return c.a(activity);
    }
    
    @Deprecated
    public static boolean invalidateOptionsMenu(final Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }
    
    public static boolean isLaunchedFromBubble(final Activity activity) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 31) {
            return g.a(activity);
        }
        boolean b = true;
        final boolean b2 = true;
        if (sdk_INT == 30) {
            return f.a((ContextWrapper)activity) != null && f.a((ContextWrapper)activity).getDisplayId() != 0 && b2;
        }
        if (sdk_INT == 29) {
            if (activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    private static void lambda$recreate$0(final Activity activity) {
        if (activity.isFinishing()) {
            return;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n = 0;
        Label_0303: {
            if (sdk_INT >= 28) {
                final Object a = m3.e.a;
                activity.recreate();
                break Label_0303;
            }
            final Class a2 = m3.e.a;
            while (true) {
                if ((sdk_INT == 26 || sdk_INT == 27) && m3.e.f == null) {
                    final int n2 = n;
                    break Label_0340;
                }
                if (m3.e.e == null && m3.e.d == null) {
                    final int n2 = n;
                    break Label_0340;
                }
                try {
                    final Object value = m3.e.c.get(activity);
                    int n2;
                    if (value == null) {
                        n2 = n;
                    }
                    else {
                        final Object value2 = m3.e.b.get(activity);
                        if (value2 == null) {
                            n2 = n;
                        }
                        else {
                            final Application application = activity.getApplication();
                            final Object a = new e$a(activity);
                            application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)a);
                            final Handler g = m3.e.g;
                            g.post((Runnable)new m3.b((e$a)a, value));
                            if (sdk_INT != 26 && sdk_INT != 27) {
                                n2 = 0;
                            }
                            else {
                                n2 = 1;
                            }
                            Label_0277: {
                                if (n2 == 0) {
                                    break Label_0277;
                                }
                                try {
                                    final Method f = m3.e.f;
                                    final Boolean false = Boolean.FALSE;
                                    f.invoke(value2, value, null, null, 0, false, null, null, false, false);
                                    while (true) {
                                        g.post((Runnable)new m3.c(application, (e$a)a));
                                        n2 = 1;
                                        break Label_0340;
                                        activity.recreate();
                                        continue;
                                    }
                                }
                                finally {
                                    m3.e.g.post((Runnable)new m3.c(application, (e$a)a));
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
        b.b(activity);
    }
    
    public static void recreate(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 28) {
            activity.recreate();
        }
        else {
            new Handler(((Context)activity).getMainLooper()).post((Runnable)new h.d((Object)activity, 1));
        }
    }
    
    public static a4.f requestDragAndDropPermissions(final Activity activity, final DragEvent dragEvent) {
        a4.f f;
        if (f$a.b(activity, dragEvent) != null) {
            f = new a4.f();
        }
        else {
            f = null;
        }
        return f;
    }
    
    public static void requestPermissions(final Activity activity, final String[] array, final int n) {
        final PermissionCompatDelegate sDelegate = ActivityCompat.sDelegate;
        if (sDelegate != null && sDelegate.requestPermissions(activity, array, n)) {
            return;
        }
        final HashSet set = new HashSet();
        int i = 0;
        for (int j = 0; j < array.length; ++j) {
            if (TextUtils.isEmpty((CharSequence)array[j])) {
                throw new IllegalArgumentException(ph0.a.f(a.t("Permission request for permissions "), Arrays.toString(array), " must not contain null or empty values"));
            }
            if (!v3.a.b() && TextUtils.equals((CharSequence)array[j], (CharSequence)"android.permission.POST_NOTIFICATIONS")) {
                set.add(j);
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
            int n2 = 0;
            while (i < array.length) {
                int n3 = n2;
                if (!set.contains(i)) {
                    array2[n2] = array[i];
                    n3 = n2 + 1;
                }
                ++i;
                n2 = n3;
            }
        }
        if (activity instanceof RequestPermissionsRequestCodeValidator) {
            ((RequestPermissionsRequestCodeValidator)activity).validateRequestPermissionsRequestCode(n);
        }
        d.b(activity, array, n);
    }
    
    public static <T extends View> T requireViewById(final Activity activity, final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            return e.a(activity, n);
        }
        final View viewById = activity.findViewById(n);
        if (viewById != null) {
            return (T)viewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }
    
    public static void setEnterSharedElementCallback(final Activity activity, final SharedElementCallback sharedElementCallback) {
        h h;
        if (sharedElementCallback != null) {
            h = new h(sharedElementCallback);
        }
        else {
            h = null;
        }
        b.c(activity, h);
    }
    
    public static void setExitSharedElementCallback(final Activity activity, final SharedElementCallback sharedElementCallback) {
        h h;
        if (sharedElementCallback != null) {
            h = new h(sharedElementCallback);
        }
        else {
            h = null;
        }
        b.d(activity, h);
    }
    
    public static void setLocusContext(final Activity activity, final n3.b b, final Bundle bundle) {
        if (Build$VERSION.SDK_INT >= 30) {
            f.b(activity, b, bundle);
        }
    }
    
    public static void setPermissionCompatDelegate(final PermissionCompatDelegate sDelegate) {
        ActivityCompat.sDelegate = sDelegate;
    }
    
    public static boolean shouldShowRequestPermissionRationale(final Activity activity, final String s) {
        return (v3.a.b() || !TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)s)) && d.c(activity, s);
    }
    
    public static void startActivityForResult(final Activity activity, final Intent intent, final int n, final Bundle bundle) {
        a.b(activity, intent, n, bundle);
    }
    
    public static void startIntentSenderForResult(final Activity activity, final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) throws IntentSender$SendIntentException {
        a.c(activity, intentSender, n, intent, n2, n3, n4, bundle);
    }
    
    public static void startPostponedEnterTransition(final Activity activity) {
        b.e(activity);
    }
    
    public interface OnRequestPermissionsResultCallback
    {
        void onRequestPermissionsResult(final int p0, final String[] p1, final int[] p2);
    }
    
    public interface PermissionCompatDelegate
    {
        boolean onActivityResult(final Activity p0, final int p1, final int p2, final Intent p3);
        
        boolean requestPermissions(final Activity p0, final String[] p1, final int p2);
    }
    
    public interface RequestPermissionsRequestCodeValidator
    {
        void validateRequestPermissionsRequestCode(final int p0);
    }
    
    public static final class a
    {
        public static void a(final Activity activity) {
            activity.finishAffinity();
        }
        
        public static void b(final Activity activity, final Intent intent, final int n, final Bundle bundle) {
            activity.startActivityForResult(intent, n, bundle);
        }
        
        public static void c(final Activity activity, final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) throws IntentSender$SendIntentException {
            activity.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4, bundle);
        }
    }
    
    public static final class b
    {
        public static void a(final Activity activity) {
            activity.finishAfterTransition();
        }
        
        public static void b(final Activity activity) {
            activity.postponeEnterTransition();
        }
        
        public static void c(final Activity activity, final android.app.SharedElementCallback enterSharedElementCallback) {
            activity.setEnterSharedElementCallback(enterSharedElementCallback);
        }
        
        public static void d(final Activity activity, final android.app.SharedElementCallback exitSharedElementCallback) {
            activity.setExitSharedElementCallback(exitSharedElementCallback);
        }
        
        public static void e(final Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }
    
    public static final class c
    {
        public static Uri a(final Activity activity) {
            return activity.getReferrer();
        }
    }
    
    public static final class d
    {
        public static void a(final Object o) {
            ((SharedElementCallback$OnSharedElementsReadyListener)o).onSharedElementsReady();
        }
        
        public static void b(final Activity activity, final String[] array, final int n) {
            activity.requestPermissions(array, n);
        }
        
        public static boolean c(final Activity activity, final String s) {
            return activity.shouldShowRequestPermissionRationale(s);
        }
    }
    
    public static final class e
    {
        public static <T> T a(final Activity activity, final int n) {
            return (T)n0.e(activity, n);
        }
    }
    
    public static final class f
    {
        public static Display a(final ContextWrapper contextWrapper) {
            return a4.e.b(contextWrapper);
        }
        
        public static void b(final Activity activity, final n3.b b, final Bundle bundle) {
            LocusId b2;
            if (b == null) {
                b2 = null;
            }
            else {
                b2 = b.b;
            }
            x0.d(activity, b2, bundle);
        }
    }
    
    public static final class g
    {
        public static boolean a(final Activity activity) {
            return y0.e(activity);
        }
    }
    
    public static final class h extends android.app.SharedElementCallback
    {
        public final SharedElementCallback a;
        
        public h(final SharedElementCallback a) {
            this.a = a;
        }
        
        public final Parcelable onCaptureSharedElementSnapshot(final View view, final Matrix matrix, final RectF rectF) {
            return this.a.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }
        
        public final View onCreateSnapshotView(final Context context, final Parcelable parcelable) {
            return this.a.onCreateSnapshotView(context, parcelable);
        }
        
        public final void onMapSharedElements(final List<String> list, final Map<String, View> map) {
            this.a.onMapSharedElements((List)list, (Map)map);
        }
        
        public final void onRejectSharedElements(final List<View> list) {
            this.a.onRejectSharedElements((List)list);
        }
        
        public final void onSharedElementEnd(final List<String> list, final List<View> list2, final List<View> list3) {
            this.a.onSharedElementEnd((List)list, (List)list2, (List)list3);
        }
        
        public final void onSharedElementStart(final List<String> list, final List<View> list2, final List<View> list3) {
            this.a.onSharedElementStart((List)list, (List)list2, (List)list3);
        }
        
        public final void onSharedElementsArrived(final List<String> list, final List<View> list2, final SharedElementCallback$OnSharedElementsReadyListener sharedElementCallback$OnSharedElementsReadyListener) {
            this.a.onSharedElementsArrived((List)list, (List)list2, (androidx.core.app.SharedElementCallback$OnSharedElementsReadyListener)new m3.a((Object)sharedElementCallback$OnSharedElementsReadyListener, 0));
        }
    }
}
