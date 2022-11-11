// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Field;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 0ja
{
    public static int LIZ;
    public static int LIZIZ;
    public static float LIZJ;
    public static long LIZLLL;
    public static long LJ;
    
    static {
        Covode.recordClassIndex(6929);
        0ja.LIZ = 1000;
        0ja.LIZIZ = 60;
        0ja.LIZJ = 16.666668f;
        0ja.LIZLLL = -1L;
        0ja.LJ = -1L;
    }
    
    public static float LIZ() {
        if (LIZIZ() > 0.0f) {
            return 0ja.LIZ / LIZIZ();
        }
        return 0ja.LIZJ;
    }
    
    public static Object LIZ(Context context, String ex) {
        MethodCollector.i(10072);
    Label_0161_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0161_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)new 2Lq((Handler)declaredField.get(systemService));
                            declaredField.set(systemService, ex);
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0176;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(10072);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0161;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    MethodCollector.o(10072);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0161_Outer;
                    context = (Context)context.getSystemService((String)ex);
                    continue Label_0161_Outer;
                }
                finally {
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    public static float LIZIZ() {
        final WindowManager windowManager = (WindowManager)LIZ(0cB.LJ(), "window");
        if (windowManager == null) {
            final int n = 0ja.LIZIZ;
            return (float)n;
        }
        final Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            final int n = 0ja.LIZIZ;
            return (float)n;
        }
        return defaultDisplay.getRefreshRate();
        int n = 0;
        refreshRate = (float)n;
        return refreshRate;
    }
}
