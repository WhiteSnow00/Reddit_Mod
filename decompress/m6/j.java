// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Method;
import android.text.TextUtils;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Process;
import a4.v0;
import android.os.Build$VERSION;
import androidx.work.a;
import android.content.Context;
import c6.i;

public final class j
{
    public static final String a;
    
    static {
        a = i.e("ProcessUtils");
    }
    
    public static boolean a(final Context context, final a a) {
        CharSequence charSequence = null;
        Label_0169: {
            if (Build$VERSION.SDK_INT >= 28) {
                charSequence = v0.b();
            }
            else {
                try {
                    final Method declaredMethod = Class.forName("android.app.ActivityThread", false, j.class.getClassLoader()).getDeclaredMethod("currentProcessName", (Class<?>[])new Class[0]);
                    declaredMethod.setAccessible(true);
                    final Object invoke = declaredMethod.invoke(null, new Object[0]);
                    if (invoke instanceof String) {
                        final String s = (String)invoke;
                        break Label_0169;
                    }
                }
                finally {
                    i.c().a(j.a, "Unable to check ActivityThread for processName", (Throwable)charSequence);
                }
                final int myPid = Process.myPid();
                final ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
                if (activityManager != null) {
                    final List runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                        for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                            if (activityManager$RunningAppProcessInfo.pid == myPid) {
                                charSequence = activityManager$RunningAppProcessInfo.processName;
                                break Label_0169;
                            }
                        }
                    }
                }
                charSequence = null;
            }
        }
        a.getClass();
        if (!TextUtils.isEmpty((CharSequence)null)) {
            return TextUtils.equals(charSequence, (CharSequence)null);
        }
        return TextUtils.equals(charSequence, (CharSequence)context.getApplicationInfo().processName);
    }
}
