// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.InvocationTargetException;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class 0Ob
{
    public static Method LIZ;
    
    static {
        Covode.recordClassIndex(3991);
        try {
            for (final Method liz : Class.forName("android.os.SystemProperties").getMethods()) {
                final String name = liz.getName();
                if (name.equals("get")) {
                    0Ob.LIZ = liz;
                }
                else if (!name.equals("set") && !name.equals("getLong")) {
                    name.equals("getInt");
                }
            }
        }
        catch (final ClassNotFoundException ex) {
            0II.LIZ(ex);
        }
    }
    
    public static String LIZ(String s, final String s2) {
        final Method liz = 0Ob.LIZ;
        if (liz == null) {
            return s2;
        }
        try {
            final Object[] array = { s, s2 };
            final 5an liz2 = new 5aq().LIZ(110000, "java/lang/reflect/Method", "invoke", (Object)liz, new Object[] { null, array }, "java.lang.Object", new 5dv(true));
            Object o;
            if (liz2.LIZ) {
                o = liz2.LIZIZ;
            }
            else {
                o = liz.invoke(null, array);
            }
            s = (String)o;
            return s;
        }
        catch (final IllegalAccessException ex) {
            0II.LIZ(ex);
        }
        catch (final IllegalArgumentException ex2) {
            0II.LIZ(ex2);
        }
        catch (final InvocationTargetException ex3) {
            0II.LIZ(ex3);
        }
        return s2;
    }
}
