// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import kotlin.jvm.internal.n;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import android.app.Application;
import java.lang.reflect.Method;

public final class 0Px
{
    public static Object LIZ;
    public static Method LIZIZ;
    public static Method LIZJ;
    public static Application LIZLLL;
    public static volatile float LJ;
    public static volatile float LJFF;
    public static volatile int LJI;
    public static final 0Px LJII;
    public static final float LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(4232);
        LJII = new 0Px();
        LJIIIIZZ = (float)Runtime.getRuntime().availableProcessors();
        0Px.LJ = -1.0f;
        0Px.LJFF = -1.0f;
        0Px.LJI = -1;
    }
    
    public static Object LIZ(Application application, String declaredField) {
        MethodCollector.i(5105);
    Label_0161_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(declaredField)) {
                if (!2JT.LIZ) {
                    break Label_0161_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = application.getSystemService((String)declaredField);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            declaredField = (Exception)ClipboardManager.class.getDeclaredField("mHandler");
                            ((AccessibleObject)declaredField).setAccessible(true);
                            ((Field)declaredField).set(systemService, new 2Lq((Handler)((Field)declaredField).get(systemService)));
                        }
                        catch (final Exception declaredField) {
                            6Nw.LIZ((Throwable)declaredField, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0176;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(5105);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(declaredField)) {
                    break Label_0161;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    application = (Application)application.getSystemService((String)declaredField);
                    MethodCollector.o(5105);
                    return application;
                    application = (Application)application.getSystemService((String)declaredField);
                    continue Label_0161_Outer;
                    application = (Application)application.getSystemService((String)declaredField);
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
    
    public static Object LIZ(final Method method, final Object o, final Object[] array) {
        final 5an liz = new 5aq().LIZ(110000, "java/lang/reflect/Method", "invoke", (Object)method, new Object[] { o, array }, "java.lang.Object", new 5dv(true));
        if (liz.LIZ) {
            return liz.LIZIZ;
        }
        return method.invoke(o, array);
    }
    
    public final float LIZ() {
        final Method liziz = 0Px.LIZIZ;
        float n2;
        final float n = n2 = -1.0f;
        if (liziz != null) {
            n2 = n;
            if (0Px.LIZJ != null) {
                if (0Px.LIZ == null) {
                    n2 = n;
                }
                else {
                    try {
                        final Object liz = LIZ(liziz, 0Px.LIZ, new Object[0]);
                        float floatValue;
                        if (liz instanceof Number) {
                            final float n3 = floatValue = ((Number)liz).floatValue();
                            if (n3 != -1.0f) {
                                floatValue = n3 * 100.0f;
                            }
                        }
                        else {
                            floatValue = -1.0f;
                        }
                        final Method lizj = 0Px.LIZJ;
                        if (lizj == null) {
                            kotlin.jvm.internal.n.LIZ();
                        }
                        final Object liz2 = LIZ(lizj, 0Px.LIZ, new Object[0]);
                        float floatValue2;
                        if (liz2 instanceof Number) {
                            final float n4 = floatValue2 = ((Number)liz2).floatValue();
                            if (n4 != -1.0f) {
                                floatValue2 = n4 * 100.0f;
                            }
                        }
                        else {
                            floatValue2 = -1.0f;
                        }
                        if (floatValue == -1.0f) {
                            if (floatValue2 != -1.0f) {
                                final float n5 = floatValue2 / 0Px.LJIIIIZZ;
                            }
                        }
                    }
                    finally {
                        0Pz.LIZ.LIZ("Device", "cpuUsage invoke failed!");
                        n2 = n;
                    }
                }
            }
        }
        return n2;
    }
    
    public final double LIZIZ() {
        final Application lizlll = 0Px.LIZLLL;
        double n = -1.0;
        if (lizlll == null) {
            return -1.0;
        }
        try {
            final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
            final Application lizlll2 = 0Px.LIZLLL;
            if (lizlll2 == null) {
                kotlin.jvm.internal.n.LIZ("");
            }
            final Object liz = LIZ(lizlll2, "activity");
            if (liz instanceof ActivityManager) {
                ((ActivityManager)liz).getMemoryInfo(activityManager$MemoryInfo);
            }
            n = activityManager$MemoryInfo.availMem / 1024.0 / 1024.0;
            return n;
        }
        catch (final Exception ex) {
            return n;
        }
    }
    
    public final double LIZJ() {
        final Application lizlll = 0Px.LIZLLL;
        double n = -1.0;
        if (lizlll == null) {
            return -1.0;
        }
        try {
            final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
            final Application lizlll2 = 0Px.LIZLLL;
            if (lizlll2 == null) {
                kotlin.jvm.internal.n.LIZ("");
            }
            final Object liz = LIZ(lizlll2, "activity");
            if (liz instanceof ActivityManager) {
                ((ActivityManager)liz).getMemoryInfo(activityManager$MemoryInfo);
            }
            n = activityManager$MemoryInfo.totalMem / 1024.0 / 1024.0;
            return n;
        }
        finally {
            return n;
        }
    }
}
