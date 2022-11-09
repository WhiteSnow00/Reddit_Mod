// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.reflect.Method;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class 0Be
{
    public static 0Be LIZ;
    public final Map<Class<?>, a> LIZIZ;
    public final Map<Class<?>, Boolean> LIZJ;
    
    static {
        Covode.recordClassIndex(1216);
        0Be.LIZ = new 0Be();
    }
    
    public 0Be() {
        this.LIZIZ = new HashMap<Class<?>, a>();
        this.LIZJ = new HashMap<Class<?>, Boolean>();
    }
    
    private a LIZ(final Class<?> clazz, Method[] lizj) {
        final Class superclass = clazz.getSuperclass();
        final HashMap hashMap = new HashMap();
        if (superclass != null) {
            final a liziz = this.LIZIZ(superclass);
            if (liziz != null) {
                hashMap.putAll(liziz.LIZIZ);
            }
        }
        final Class[] interfaces = clazz.getInterfaces();
        for (int length = interfaces.length, i = 0; i < length; ++i) {
            for (final Map.Entry entry : this.LIZIZ(interfaces[i]).LIZIZ.entrySet()) {
                this.LIZ(hashMap, (b)entry.getKey(), (0CC.a)entry.getValue(), clazz);
            }
        }
        if (lizj == null) {
            lizj = this.LIZJ(clazz);
        }
        final int length2 = lizj.length;
        int j = 0;
        boolean b = false;
        while (j < length2) {
            final Method method = lizj[j];
            final 0Bg 0Bg = method.getAnnotation(0Bg.class);
            if (0Bg != null) {
                final Class<?>[] parameterTypes = method.getParameterTypes();
                int n;
                if (parameterTypes.length > 0) {
                    if (!parameterTypes[0].isAssignableFrom(0CH.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    n = 1;
                }
                else {
                    n = 0;
                }
                final 0CC.a liz = 0Bg.LIZ();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(0CC.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (liz != 0CC.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    n = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                this.LIZ(hashMap, new b(n, method), liz, clazz);
                b = true;
            }
            ++j;
        }
        final a a = new a(hashMap);
        this.LIZIZ.put(clazz, a);
        this.LIZJ.put(clazz, b);
        return a;
    }
    
    private void LIZ(final Map<b, 0CC.a> map, final b b, final 0CC.a a, final Class<?> clazz) {
        final 0CC.a value = map.get(b);
        if (value != null) {
            if (a != value) {
                final Method liziz = b.LIZIZ;
                final StringBuilder sb = new StringBuilder("Method ");
                sb.append(liziz.getName());
                sb.append(" in ");
                sb.append(clazz.getName());
                sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
                sb.append(value);
                sb.append(", new value ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        else {
            map.put(b, a);
        }
    }
    
    private Method[] LIZJ(final Class<?> clazz) {
        try {
            return clazz.getDeclaredMethods();
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError);
        }
    }
    
    public final boolean LIZ(final Class<?> clazz) {
        final Boolean b = this.LIZJ.get(clazz);
        if (b != null) {
            return b;
        }
        final Method[] lizj = this.LIZJ(clazz);
        for (int length = lizj.length, i = 0; i < length; ++i) {
            if (lizj[i].getAnnotation(0Bg.class) != null) {
                this.LIZ(clazz, lizj);
                return true;
            }
        }
        this.LIZJ.put(clazz, false);
        return false;
    }
    
    public final a LIZIZ(final Class<?> clazz) {
        final a a = this.LIZIZ.get(clazz);
        if (a != null) {
            return a;
        }
        return this.LIZ(clazz, null);
    }
    
    public static final class a
    {
        public final Map<0CC.a, List<b>> LIZ;
        public final Map<b, 0CC.a> LIZIZ;
        
        static {
            Covode.recordClassIndex(1217);
        }
        
        public a(final Map<b, 0CC.a> liziz) {
            this.LIZIZ = liziz;
            this.LIZ = new HashMap<0CC.a, List<b>>();
            for (final Map.Entry<K, Object> entry : liziz.entrySet()) {
                final 0CC.a value = entry.getValue();
                List list;
                if ((list = this.LIZ.get(value)) == null) {
                    list = new ArrayList();
                    this.LIZ.put(value, list);
                }
                list.add(entry.getKey());
            }
        }
        
        public static void LIZ(final List<b> list, final 0CH 0ch, final 0CC.a a, final Object o) {
            if (list != null) {
                int i = list.size() - 1;
                while (i >= 0) {
                    final b b = list.get(i);
                    try {
                        final int liz = b.LIZ;
                        if (liz != 0) {
                            if (liz != 1) {
                                if (liz == 2) {
                                    b.LIZIZ.invoke(o, 0ch, a);
                                }
                            }
                            else {
                                b.LIZIZ.invoke(o, 0ch);
                            }
                        }
                        else {
                            b.LIZIZ.invoke(o, new Object[0]);
                        }
                        --i;
                        continue;
                    }
                    catch (final IllegalAccessException ex) {
                        throw new RuntimeException(ex);
                    }
                    catch (final InvocationTargetException ex2) {
                        throw new RuntimeException("Failed to call observer method", ex2.getCause());
                    }
                    break;
                }
            }
        }
    }
    
    public static final class b
    {
        public final int LIZ;
        public final Method LIZIZ;
        
        static {
            Covode.recordClassIndex(1218);
        }
        
        public b(final int liz, final Method liziz) {
            this.LIZ = liz;
            (this.LIZIZ = liziz).setAccessible(true);
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.LIZ == b.LIZ && this.LIZIZ.getName().equals(b.LIZIZ.getName());
        }
        
        @Override
        public final int hashCode() {
            return this.LIZ * 31 + this.LIZIZ.getName().hashCode();
        }
    }
}
