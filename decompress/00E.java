// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public class 00E
{
    public static boolean LIZ;
    public static Class<?> LIZIZ;
    public static Method LIZJ;
    public static Method LIZLLL;
    public Object LJ;
    
    static {
        Covode.recordClassIndex(26);
    }
    
    public 00E(final Context context) {
        synchronized (00E.class) {
            if (!00E.LIZ) {
                try {
                    00s.LIZ(3);
                    00E.LIZIZ = 00q.LIZ("android.util.BoostFramework");
                    00s.LIZ(3);
                    00E.LIZJ = 00q.LIZ(00E.LIZIZ, "perfLockAcquire", Integer.TYPE, int[].class);
                    00s.LIZ(3);
                    00E.LIZLLL = 00q.LIZ(00E.LIZIZ, "perfLockRelease", (Class<?>[])new Class[0]);
                    00E.LIZ = true;
                    00s.LIZ(4);
                }
                catch (final Exception ex) {
                    00E.LIZ = false;
                    00s.LIZ(6);
                }
            }
            monitorexit(00E.class);
            try {
                final Class<?> liziz = 00E.LIZIZ;
                if (liziz != null) {
                    this.LJ = 00q.LIZ(liziz, Context.class).newInstance(context);
                }
            }
            catch (final Exception ex2) {
                try {
                    this.LJ = 00q.LIZ(00E.LIZIZ, (Class<?>[])new Class[0]).newInstance(new Object[0]);
                }
                catch (final Exception ex3) {
                    00s.LIZ(6);
                }
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
    
    public final int LIZ() {
        int intValue;
        final int n = intValue = -1;
        try {
            final Method lizlll = 00E.LIZLLL;
            intValue = n;
            if (lizlll != null) {
                intValue = n;
                intValue = (int)LIZ(lizlll, this.LJ, new Object[0]);
                00s.LIZ(4);
                intValue = intValue;
            }
        }
        catch (final Exception ex) {
            00s.LIZ(6);
        }
        return intValue;
    }
    
    public final int LIZ(int n, final int... array) {
        int intValue;
        final int n2 = intValue = -1;
        try {
            final Method lizj = 00E.LIZJ;
            intValue = n2;
            if (lizj != null) {
                intValue = n2;
                n = (intValue = (int)LIZ(lizj, this.LJ, new Object[] { n, array }));
                Arrays.toString(array);
                intValue = n;
                00s.LIZ(4);
                intValue = n;
            }
        }
        catch (final Exception ex) {
            00s.LIZ(6);
        }
        return intValue;
    }
}
