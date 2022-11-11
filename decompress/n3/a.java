// 
// Decompiled by Procyon v0.6.0
// 

package n3;

import androidx.biometric.q;
import a4.y0;
import a4.u;
import android.content.ComponentName;
import a4.t;
import android.os.Bundle;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.os.Handler;
import java.util.concurrent.Executor;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import android.content.res.XmlResourceParser;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import p3.f$b;
import p3.b;
import p3.f$c;
import android.util.SparseArray;
import p3.f;
import p3.f$d;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import android.util.Log;
import java.io.File;
import android.os.Process;
import androidx.core.app.NotificationManagerCompat;
import android.text.TextUtils;
import android.content.Context;
import android.util.TypedValue;

public class a
{
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock;
    private static final Object sSync;
    private static TypedValue sTempValue;
    
    static {
        sLock = new Object();
        sSync = new Object();
    }
    
    public static int checkSelfPermission(final Context context, final String s) {
        if (s == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (!a.b() && TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)s)) {
            int n;
            if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                n = 0;
            }
            else {
                n = -1;
            }
            return n;
        }
        return context.checkPermission(s, Process.myPid(), Process.myUid());
    }
    
    public static Context createDeviceProtectedStorageContext(final Context context) {
        return e.a(context);
    }
    
    private static File createFilesDir(final File file) {
        synchronized (a.sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to create files subdir ");
                sb.append(file.getPath());
                Log.w("ContextCompat", sb.toString());
            }
            return file;
        }
    }
    
    public static String getAttributionTag(final Context context) {
        if (Build$VERSION.SDK_INT >= 30) {
            return h.a(context);
        }
        return null;
    }
    
    public static File getCodeCacheDir(final Context context) {
        return c.a(context);
    }
    
    public static int getColor(final Context context, final int n) {
        return d.a(context, n);
    }
    
    public static ColorStateList getColorStateList(final Context context, final int n) {
        final Resources resources = context.getResources();
        final Resources$Theme theme = context.getTheme();
        final f$d f$d = new f$d(resources, theme);
        Object c = p3.f.c;
        synchronized (c) {
            final SparseArray sparseArray = p3.f.b.get(f$d);
            final ColorStateList list = null;
            ColorStateList list2 = null;
            Label_0134: {
                if (sparseArray != null && sparseArray.size() > 0) {
                    final f$c f$c = (f$c)sparseArray.get(n);
                    if (f$c != null) {
                        if (f$c.b.equals(resources.getConfiguration()) && ((theme == null && f$c.c == 0) || (theme != null && f$c.c == theme.hashCode()))) {
                            list2 = f$c.a;
                            monitorexit(c);
                            break Label_0134;
                        }
                        sparseArray.remove(n);
                    }
                }
                monitorexit(c);
                list2 = null;
            }
            if (list2 == null) {
                final ThreadLocal a = p3.f.a;
                c = a.get();
                if (c == null) {
                    final TypedValue typedValue = new TypedValue();
                    a.set(c);
                }
                boolean b = true;
                resources.getValue(n, (TypedValue)c, true);
                final int type = ((TypedValue)c).type;
                if (type < 28 || type > 31) {
                    b = false;
                }
                ColorStateList a2;
                if (b) {
                    a2 = list;
                }
                else {
                    final XmlResourceParser xml = resources.getXml(n);
                    try {
                        a2 = p3.b.a(resources, xml, theme);
                    }
                    catch (final Exception ex) {
                        Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", (Throwable)ex);
                        a2 = list;
                    }
                }
                if (a2 != null) {
                    synchronized (p3.f.c) {
                        final WeakHashMap b2 = p3.f.b;
                        c = b2.get(f$d);
                        if (c == null) {
                            new(android.util.SparseArray.class)();
                            new SparseArray();
                            b2.put(f$d, c);
                        }
                        c = new f$c(a2, f$d.a.getConfiguration(), theme);
                        ((SparseArray)c).append(n, c);
                        return list2;
                    }
                }
                list2 = f$b.b(resources, n, theme);
            }
            return list2;
        }
    }
    
    public static File getDataDir(final Context context) {
        return e.b(context);
    }
    
    public static Drawable getDrawable(final Context context, final int n) {
        return c.b(context, n);
    }
    
    public static File[] getExternalCacheDirs(final Context context) {
        return b.a(context);
    }
    
    public static File[] getExternalFilesDirs(final Context context, final String s) {
        return b.b(context, s);
    }
    
    public static Executor getMainExecutor(final Context context) {
        if (Build$VERSION.SDK_INT >= 28) {
            return g.a(context);
        }
        return (Executor)new v3.f(new Handler(context.getMainLooper()));
    }
    
    public static File getNoBackupFilesDir(final Context context) {
        return c.c(context);
    }
    
    public static File[] getObbDirs(final Context context) {
        return b.c(context);
    }
    
    public static <T> T getSystemService(final Context context, final Class<T> clazz) {
        return d.b(context, clazz);
    }
    
    public static String getSystemServiceName(final Context context, final Class<?> clazz) {
        return d.c(context, clazz);
    }
    
    public static boolean isDeviceProtectedStorage(final Context context) {
        return e.c(context);
    }
    
    public static String obtainAndCheckReceiverPermission(final Context context) {
        final StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
        final String string = sb.toString();
        if (a92.b.A(context, string) == 0) {
            return string;
        }
        throw new RuntimeException(a.k("Permission ", string, " is required by your application to receive broadcasts, please add it to your manifest"));
    }
    
    public static Intent registerReceiver(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final int n) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, n);
    }
    
    public static Intent registerReceiver(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final String s, final Handler handler, int n) {
        final int n2 = n & 0x1;
        if (n2 != 0 && (n & 0x4) != 0x0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        int n3 = n;
        if (n2 != 0) {
            n3 = (n | 0x2);
        }
        n = (n3 & 0x2);
        if (n == 0 && (n3 & 0x4) == 0x0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (n != 0 && (n3 & 0x4) != 0x0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (a.b()) {
            return i.a(context, broadcastReceiver, intentFilter, s, handler, n3);
        }
        if (Build$VERSION.SDK_INT >= 26) {
            return f.a(context, broadcastReceiver, intentFilter, s, handler, n3);
        }
        if ((n3 & 0x4) != 0x0 && s == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, s, handler);
    }
    
    public static boolean startActivities(final Context context, final Intent[] array) {
        return startActivities(context, array, null);
    }
    
    public static boolean startActivities(final Context context, final Intent[] array, final Bundle bundle) {
        a.a(context, array, bundle);
        return true;
    }
    
    public static void startActivity(final Context context, final Intent intent, final Bundle bundle) {
        a.b(context, intent, bundle);
    }
    
    public static void startForegroundService(final Context context, final Intent intent) {
        if (Build$VERSION.SDK_INT >= 26) {
            f.b(context, intent);
        }
        else {
            context.startService(intent);
        }
    }
    
    public static final class a
    {
        public static void a(final Context context, final Intent[] array, final Bundle bundle) {
            context.startActivities(array, bundle);
        }
        
        public static void b(final Context context, final Intent intent, final Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }
    
    public static final class b
    {
        public static File[] a(final Context context) {
            return context.getExternalCacheDirs();
        }
        
        public static File[] b(final Context context, final String s) {
            return context.getExternalFilesDirs(s);
        }
        
        public static File[] c(final Context context) {
            return context.getObbDirs();
        }
    }
    
    public static final class c
    {
        public static File a(final Context context) {
            return context.getCodeCacheDir();
        }
        
        public static Drawable b(final Context context, final int n) {
            return context.getDrawable(n);
        }
        
        public static File c(final Context context) {
            return context.getNoBackupFilesDir();
        }
    }
    
    public static final class d
    {
        public static int a(final Context context, final int n) {
            return context.getColor(n);
        }
        
        public static <T> T b(final Context context, final Class<T> clazz) {
            return (T)context.getSystemService((Class)clazz);
        }
        
        public static String c(final Context context, final Class<?> clazz) {
            return context.getSystemServiceName((Class)clazz);
        }
    }
    
    public static final class e
    {
        public static Context a(final Context context) {
            return context.createDeviceProtectedStorageContext();
        }
        
        public static File b(final Context context) {
            return context.getDataDir();
        }
        
        public static boolean c(final Context context) {
            return context.isDeviceProtectedStorage();
        }
    }
    
    public static final class f
    {
        public static Intent a(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final String s, final Handler handler, final int n) {
            if ((n & 0x4) != 0x0 && s == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, a.obtainAndCheckReceiverPermission(context), handler);
            }
            return t.a(context, broadcastReceiver, intentFilter, s, handler, n & 0x1);
        }
        
        public static ComponentName b(final Context context, final Intent intent) {
            return u.b(context, intent);
        }
    }
    
    public static final class g
    {
        public static Executor a(final Context context) {
            return y0.g(context);
        }
    }
    
    public static final class h
    {
        public static String a(final Context context) {
            return q.c(context);
        }
    }
    
    public static final class i
    {
        public static Intent a(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final String s, final Handler handler, final int n) {
            return t.a(context, broadcastReceiver, intentFilter, s, handler, n);
        }
    }
}
