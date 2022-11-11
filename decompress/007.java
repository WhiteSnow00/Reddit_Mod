// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public class 007
{
    public static boolean LIZ;
    public static Class<?> LIZIZ;
    public static Method LIZJ;
    public static Object LIZLLL;
    
    static {
        Covode.recordClassIndex(17);
    }
    
    public 007() {
        synchronized (007.class) {
            if (!007.LIZ) {
                try {
                    if (Build$VERSION.SDK_INT == 29) {
                        007.LIZIZ = 00q.LIZ("android.scrollerboostmanager.ScrollerBoostManager");
                        007.LIZJ = 00q.LIZ(007.LIZIZ, "listFling", Integer.TYPE);
                    }
                    else if (Build$VERSION.SDK_INT == 28 || Build$VERSION.SDK_INT == 27 || Build$VERSION.SDK_INT == 26) {
                        007.LIZJ = 00q.LIZ(007.LIZIZ = 00q.LIZ("android.iawareperf.UniPerf"), "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                        00s.LIZ(4);
                    }
                }
                catch (final Exception ex) {
                    00s.LIZ(6);
                }
            }
            monitorexit(007.class);
            try {
                if (007.LIZIZ != null) {
                    if (Build$VERSION.SDK_INT == 29) {
                        007.LIZLLL = LIZ(00q.LIZ(007.LIZIZ, "getInstance", (Class<?>[])new Class[0]), 007.LIZIZ, new Object[0]);
                        LIZ(00q.LIZ(007.LIZIZ, "init", (Class<?>[])new Class[0]), 007.LIZLLL, new Object[0]);
                        007.LIZ = true;
                        return;
                    }
                    if (Build$VERSION.SDK_INT == 28 || Build$VERSION.SDK_INT == 27 || Build$VERSION.SDK_INT == 26) {
                        007.LIZLLL = LIZ(00q.LIZ(007.LIZIZ, "getInstance", (Class<?>[])new Class[0]), null, new Object[0]);
                        007.LIZ = true;
                    }
                }
            }
            catch (final Exception ex2) {
                00s.LIZ(6);
            }
        }
    }
    
    public static Object LIZ(final Method method, final Object o, final Object[] array) {
        final 5an liz = new 5aq().LIZ(110000, "java/lang/reflect/Method", "invoke", (Object)method, new Object[] { o, array }, "java.lang.Object", new 5dv(true));
        if (liz.LIZ) {
            return liz.LIZIZ;
        }
        return method.invoke(o, array);
    }
    
    public final int LIZ(final long n) {
        final int n2 = -1;
        int intValue = 0;
        Label_0133: {
            try {
                if (Build$VERSION.SDK_INT == 29) {
                    intValue = (int)n;
                    LIZ(007.LIZJ, 007.LIZLLL, new Object[] { intValue });
                    00s.LIZ(4);
                }
                if (Build$VERSION.SDK_INT != 28 && Build$VERSION.SDK_INT != 27) {
                    intValue = n2;
                    if (Build$VERSION.SDK_INT != 26) {
                        return intValue;
                    }
                }
                intValue = (int)LIZ(007.LIZJ, 007.LIZLLL, new Object[] { 4099, "canBoost=true|screenOn=1", new int[0] });
                final int n3 = 4;
                00s.LIZ(n3);
                return intValue;
            }
            finally {
                intValue = n2;
                break Label_0133;
            }
            try {
                final int n3 = 4;
                00s.LIZ(n3);
                return intValue;
            }
            finally {}
        }
        final Throwable t;
        t.getMessage();
        00s.LIZ(5);
        return intValue;
    }
}
