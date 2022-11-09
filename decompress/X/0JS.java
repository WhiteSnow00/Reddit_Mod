// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.common.utility.reflect.Reflect;
import android.view.Choreographer;
import java.lang.reflect.Modifier;
import java.lang.reflect.Member;
import java.lang.reflect.AccessibleObject;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class 0jS
{
    public Method LIZ;
    public Method LIZIZ;
    public Field LIZJ;
    public Method LIZLLL;
    public Method LJ;
    public Method LJFF;
    public Method LJI;
    public Field LJII;
    
    static {
        Covode.recordClassIndex(6919);
    }
    
    public static Object LIZ(final Method method, final Object o, final Object[] array) {
        final 5an liz = new 5aq().LIZ(110000, "java/lang/reflect/Method", "invoke", (Object)method, new Object[] { o, array }, "java.lang.Object", new 5dv(true));
        if (liz.LIZ) {
            return liz.LIZIZ;
        }
        return method.invoke(o, array);
    }
    
    private <T extends AccessibleObject> T LIZ(final T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            final Member member = (Member)t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }
    
    private Method LIZIZ() {
        try {
            if (this.LIZLLL == null) {
                this.LIZLLL = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            }
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
        }
        return this.LIZLLL;
    }
    
    private Method LIZJ() {
        try {
            if (this.LJ == null) {
                this.LJ = Class.class.getDeclaredMethod("getDeclaredMethods", (Class<?>[])new Class[0]);
            }
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
        }
        return this.LJ;
    }
    
    private Method LIZLLL() {
        try {
            if (this.LJFF == null) {
                this.LJFF = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            }
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
        }
        return this.LJFF;
    }
    
    private Method LJ() {
        try {
            if (this.LJI == null) {
                this.LJI = Class.class.getDeclaredMethod("getDeclaredFields", (Class<?>[])new Class[0]);
            }
        }
        catch (final Exception ex) {
            0II.LIZ(ex);
        }
        return this.LJI;
    }
    
    public final Field LIZ() {
        if (this.LJII == null) {
            try {
                this.LJII = this.LIZ(Reflect.on((Object)Choreographer.getInstance()).field("mDisplayEventReceiver", new Class[0]).get().getClass(), "mHavePendingVsync", Boolean.class);
            }
            catch (final Exception ex) {
                0II.LIZ(ex);
            }
        }
        return this.LJII;
    }
    
    public final Field LIZ(final Class<?> clazz, final String s, final Class<?> clazz2) {
        final Method lizlll = this.LIZLLL();
        if (lizlll == null) {
            return null;
        }
        Class<?> superclass = clazz;
        while (true) {
            int i = 0;
            try {
                return this.LIZ(LIZ(lizlll, superclass, new Object[] { s }));
            }
            catch (final Exception ex) {
                0II.LIZ(ex);
                if ((superclass = superclass.getSuperclass()) != null) {
                    continue;
                }
                final Method lj = this.LJ();
                if (lj == null) {
                    return null;
                }
                try {
                    for (Field[] array = (Field[])LIZ(lj, clazz, new Object[0]); i < array.length; ++i) {
                        final Field field = array[i];
                        if (field.getName().equals(s) && field.getType().getName().equals(clazz2.getName())) {
                            return this.LIZ(field);
                        }
                    }
                    return null;
                }
                catch (final Exception ex2) {
                    0II.LIZ(ex2);
                }
                return null;
            }
        }
    }
    
    public final Method LIZ(final Class<?> clazz, final String s, final Class<?>... array) {
        final Method liziz = this.LIZIZ();
        if (liziz == null) {
            return null;
        }
        Class<?> superclass = clazz;
        while (true) {
            int i = 0;
            try {
                return this.LIZ(LIZ(liziz, superclass, new Object[] { s, array }));
            }
            catch (final Exception ex) {
                0II.LIZ(ex);
                if ((superclass = superclass.getSuperclass()) != null) {
                    continue;
                }
                final Method lizj = this.LIZJ();
                if (lizj == null) {
                    return null;
                }
                try {
                    for (Method[] array2 = (Method[])LIZ(lizj, clazz, new Object[0]); i < array2.length; ++i) {
                        final Method method = array2[i];
                        if (method.getName().equals(s)) {
                            final Class<?>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes != null && parameterTypes.length == 1) {
                                return this.LIZ(method);
                            }
                        }
                    }
                    return null;
                }
                catch (final Exception ex2) {
                    0II.LIZ(ex2);
                }
                return null;
            }
        }
    }
}
