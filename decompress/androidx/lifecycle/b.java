// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.HashMap;

@Deprecated
public final class b
{
    public static b c;
    public final HashMap a;
    public final HashMap b;
    
    static {
        b.c = new b();
    }
    
    public b() {
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public static void c(final HashMap hashMap, final b b, final Lifecycle.Event event, final Class clazz) {
        final Lifecycle.Event event2 = hashMap.get(b);
        if (event2 != null && event != event2) {
            final Method b2 = b.b;
            final StringBuilder r = a.r("Method ");
            r.append(b2.getName());
            r.append(" in ");
            r.append(clazz.getName());
            r.append(" already declared with different @OnLifecycleEvent value: previous value ");
            r.append(event2);
            r.append(", new value ");
            r.append(event);
            throw new IllegalArgumentException(r.toString());
        }
        if (event2 == null) {
            hashMap.put(b, event);
        }
    }
    
    public final a a(final Class<?> clazz, Method[] declaredMethods) {
        final Class superclass = clazz.getSuperclass();
        final HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(this.b(superclass).b);
        }
        final Class[] interfaces = clazz.getInterfaces();
        for (int length = interfaces.length, i = 0; i < length; ++i) {
            for (final Map.Entry entry : this.b(interfaces[i]).b.entrySet()) {
                c(hashMap, (b)entry.getKey(), (Lifecycle.Event)entry.getValue(), clazz);
            }
        }
        Label_0142: {
            if (declaredMethods != null) {
                break Label_0142;
            }
            try {
                declaredMethods = clazz.getDeclaredMethods();
                boolean b;
                for (int length2 = declaredMethods.length, j = (b = false) ? 1 : 0; j < length2; ++j) {
                    final Method method = declaredMethods[j];
                    final z z = method.getAnnotation(z.class);
                    if (z != null) {
                        final Class<?>[] parameterTypes = method.getParameterTypes();
                        int n;
                        if (parameterTypes.length > 0) {
                            if (!parameterTypes[0].isAssignableFrom(q.class)) {
                                throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                            }
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                        final Lifecycle.Event value = z.value();
                        if (parameterTypes.length > 1) {
                            if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                                throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                            }
                            if (value != Lifecycle.Event.ON_ANY) {
                                throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                            }
                            n = 2;
                        }
                        if (parameterTypes.length > 2) {
                            throw new IllegalArgumentException("cannot have more than 2 params");
                        }
                        c(hashMap, new b(method, n), value, clazz);
                        b = true;
                    }
                }
                final a a = new a(hashMap);
                this.a.put(clazz, a);
                this.b.put(clazz, b);
                return a;
            }
            catch (final NoClassDefFoundError noClassDefFoundError) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError);
            }
        }
    }
    
    public final a b(final Class<?> clazz) {
        final a a = this.a.get(clazz);
        if (a != null) {
            return a;
        }
        return this.a(clazz, null);
    }
    
    @Deprecated
    public static final class a
    {
        public final HashMap a;
        public final Map<b, Lifecycle.Event> b;
        
        public a(final HashMap b) {
            this.b = b;
            this.a = new HashMap();
            for (final Map.Entry<K, Lifecycle.Event> entry : b.entrySet()) {
                final Lifecycle.Event event = entry.getValue();
                List list;
                if ((list = this.a.get(event)) == null) {
                    list = new ArrayList();
                    this.a.put(event, list);
                }
                list.add(entry.getKey());
            }
        }
        
        public static void a(final List<b> list, final q q, final Lifecycle.Event event, final Object o) {
            if (list != null) {
                int i = list.size() - 1;
                while (i >= 0) {
                    final b b = list.get(i);
                    b.getClass();
                    try {
                        final int a = b.a;
                        if (a != 0) {
                            if (a != 1) {
                                if (a == 2) {
                                    b.b.invoke(o, q, event);
                                }
                            }
                            else {
                                b.b.invoke(o, q);
                            }
                        }
                        else {
                            b.b.invoke(o, new Object[0]);
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
    
    @Deprecated
    public static final class b
    {
        public final int a;
        public final Method b;
        
        public b(final Method b, final int a) {
            this.a = a;
            (this.b = b).setAccessible(true);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b2 = (b)o;
            if (this.a != b2.a || !this.b.getName().equals(b2.b.getName())) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final int hashCode() {
            return this.b.getName().hashCode() + this.a * 31;
        }
    }
}
