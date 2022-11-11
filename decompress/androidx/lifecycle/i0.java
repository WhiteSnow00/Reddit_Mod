// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import sg2.e;
import java.lang.reflect.Constructor;
import lw0.b;
import android.app.Application;
import java.util.List;

public final class i0
{
    public static final List<Class<?>> a;
    public static final List<Class<?>> b;
    
    static {
        a = lw0.b.s1((Object[])new Class[] { Application.class, f0.class });
        b = lw0.b.r1((Object)f0.class);
    }
    
    public static final <T> Constructor<T> a(final Class<T> clazz, final List<? extends Class<?>> list) {
        e.f((Object)list, "signature");
        final Constructor[] constructors = clazz.getConstructors();
        e.e((Object)constructors, "modelClass.constructors");
        for (final Constructor constructor : constructors) {
            final Class[] parameterTypes = constructor.getParameterTypes();
            e.e((Object)parameterTypes, "constructor.parameterTypes");
            final List<Class> v1 = kotlin.collections.b.v1(parameterTypes);
            if (e.a((Object)list, (Object)v1)) {
                return constructor;
            }
            if (list.size() == v1.size() && v1.containsAll(list)) {
                final StringBuilder r = a.r("Class ");
                r.append(clazz.getSimpleName());
                r.append(" must have parameters in the proper order: ");
                r.append(list);
                throw new UnsupportedOperationException(r.toString());
            }
        }
        return null;
    }
    
    public static final <T extends l0> T b(final Class<T> clazz, final Constructor<T> constructor, final Object... array) {
        try {
            return constructor.newInstance(Arrays.copyOf(array, array.length));
        }
        catch (final InvocationTargetException ex) {
            throw new RuntimeException(al0.f0.l("An exception happened in constructor of ", (Class)clazz), ex.getCause());
        }
        catch (final InstantiationException ex2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("A ");
            sb.append(clazz);
            sb.append(" cannot be instantiated.");
            throw new RuntimeException(sb.toString(), ex2);
        }
        catch (final IllegalAccessException ex3) {
            throw new RuntimeException(al0.f0.l("Failed to access ", (Class)clazz), ex3);
        }
    }
}
