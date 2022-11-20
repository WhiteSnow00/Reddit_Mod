// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import androidx.appcompat.widget.z;
import android.app.AppOpsManager;
import android.os.Binder;
import android.os.Build$VERSION;
import android.content.Context;

public final class AppOpsManagerCompat
{
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;
    
    private AppOpsManagerCompat() {
    }
    
    public static int checkOrNoteProxyOp(final Context context, final int n, final String s, final String s2) {
        if (Build$VERSION.SDK_INT < 29) {
            return noteProxyOpNoThrow(context, s, s2);
        }
        final AppOpsManager c = AppOpsManagerCompat.c.c(context);
        final int a = AppOpsManagerCompat.c.a(c, s, Binder.getCallingUid(), s2);
        if (a != 0) {
            return a;
        }
        return AppOpsManagerCompat.c.a(c, s, n, AppOpsManagerCompat.c.b(context));
    }
    
    public static int noteOp(final Context context, final String s, final int n, final String s2) {
        return a.a((AppOpsManager)context.getSystemService("appops"), s, n, s2);
    }
    
    public static int noteOpNoThrow(final Context context, final String s, final int n, final String s2) {
        return a.b((AppOpsManager)context.getSystemService("appops"), s, n, s2);
    }
    
    public static int noteProxyOp(final Context context, final String s, final String s2) {
        return b.b(b.a(context, AppOpsManager.class), s, s2);
    }
    
    public static int noteProxyOpNoThrow(final Context context, final String s, final String s2) {
        return b.c(b.a(context, AppOpsManager.class), s, s2);
    }
    
    public static String permissionToOp(final String s) {
        return b.d(s);
    }
    
    public static final class a
    {
        public static int a(final AppOpsManager appOpsManager, final String s, final int n, final String s2) {
            return appOpsManager.noteOp(s, n, s2);
        }
        
        public static int b(final AppOpsManager appOpsManager, final String s, final int n, final String s2) {
            return appOpsManager.noteOpNoThrow(s, n, s2);
        }
    }
    
    public static final class b
    {
        public static <T> T a(final Context context, final Class<T> clazz) {
            return (T)context.getSystemService((Class)clazz);
        }
        
        public static int b(final AppOpsManager appOpsManager, final String s, final String s2) {
            return appOpsManager.noteProxyOp(s, s2);
        }
        
        public static int c(final AppOpsManager appOpsManager, final String s, final String s2) {
            return appOpsManager.noteProxyOpNoThrow(s, s2);
        }
        
        public static String d(final String s) {
            return AppOpsManager.permissionToOp(s);
        }
    }
    
    public static final class c
    {
        public static int a(final AppOpsManager appOpsManager, final String s, final int n, final String s2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(s, n, s2);
        }
        
        public static String b(final Context context) {
            return z.d(context);
        }
        
        public static AppOpsManager c(final Context context) {
            return (AppOpsManager)context.getSystemService((Class)AppOpsManager.class);
        }
    }
}
