// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.Constructor;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class 00q
{
    public static Method LIZ;
    public static Method LIZIZ;
    public static Method LIZJ;
    
    static {
        Covode.recordClassIndex(79);
        try {
            Class.class.getDeclaredMethod("getDeclaredField", String.class);
            00q.LIZ = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            00q.LIZIZ = Class.class.getDeclaredMethod("getDeclaredConstructor", Class[].class);
            00q.LIZJ = Class.class.getDeclaredMethod("forName", String.class);
        }
        finally {}
    }
    
    public static Class<?> LIZ(final String s) {
        if (Build$VERSION.SDK_INT >= 29) {
            final Method lizj = 00q.LIZJ;
            final Class<?> forName;
            if (lizj != null && (forName = (Class)LIZ(lizj, null, new Object[] { s })) != null) {
                return forName;
            }
        }
        return Class.forName(s);
    }
    
    public static Object LIZ(final Method method, final Object o, final Object[] array) {
        final 5an liz = new 5aq().LIZ(110000, "java/lang/reflect/Method", "invoke", (Object)method, new Object[] { o, array }, "java.lang.Object", new 5dv(true));
        if (liz.LIZ) {
            return liz.LIZIZ;
        }
        return method.invoke(o, array);
    }
    
    public static Constructor LIZ(final Class<?> clazz, final Class<?>... array) {
        if (Build$VERSION.SDK_INT >= 29) {
            final Method liziz = 00q.LIZIZ;
            final Constructor<?> declaredConstructor;
            if (liziz != null && (declaredConstructor = (Constructor)LIZ(liziz, clazz, new Object[] { array })) != null) {
                return declaredConstructor;
            }
        }
        return clazz.getDeclaredConstructor(array);
    }
    
    public static Method LIZ(final Class<?> clazz, final String s, final Class<?>... array) {
        if (Build$VERSION.SDK_INT >= 29) {
            final Method liz = 00q.LIZ;
            final Method declaredMethod;
            if (liz != null && (declaredMethod = (Method)LIZ(liz, clazz, new Object[] { s, array })) != null) {
                return declaredMethod;
            }
        }
        return clazz.getDeclaredMethod(s, (Class[])array);
    }
}
