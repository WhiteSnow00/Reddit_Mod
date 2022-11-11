// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.Iterator;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import c6.f;

public final class ArrayCreatingInputMerger extends f
{
    public final b a(final ArrayList list) {
        final b$a b$a = new b$a();
        final HashMap hashMap = new HashMap();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            for (final Map.Entry<String, V> entry : Collections.unmodifiableMap((Map<?, ?>)((b)iterator.next()).a).entrySet()) {
                final String s = entry.getKey();
                Object value = entry.getValue();
                final Class<?> class1 = value.getClass();
                final Object value2 = hashMap.get(s);
                if (value2 == null) {
                    if (!class1.isArray()) {
                        final Object instance = Array.newInstance(value.getClass(), 1);
                        Array.set(instance, 0, value);
                        value = instance;
                    }
                }
                else {
                    final Class<?> class2 = value2.getClass();
                    if (class2.equals(class1)) {
                        if (class2.isArray()) {
                            final int length = Array.getLength(value2);
                            final int length2 = Array.getLength(value);
                            final Object instance2 = Array.newInstance(value2.getClass().getComponentType(), length + length2);
                            System.arraycopy(value2, 0, instance2, 0, length);
                            System.arraycopy(value, 0, instance2, length, length2);
                            value = instance2;
                        }
                        else {
                            final Object instance3 = Array.newInstance(value2.getClass(), 2);
                            Array.set(instance3, 0, value2);
                            Array.set(instance3, 1, value);
                            value = instance3;
                        }
                    }
                    else if (class2.isArray() && class2.getComponentType().equals(class1)) {
                        final int length3 = Array.getLength(value2);
                        final Object instance4 = Array.newInstance(value.getClass(), length3 + 1);
                        System.arraycopy(value2, 0, instance4, 0, length3);
                        Array.set(instance4, length3, value);
                        value = instance4;
                    }
                    else {
                        if (!class1.isArray() || !class1.getComponentType().equals(class2)) {
                            throw new IllegalArgumentException();
                        }
                        final int length4 = Array.getLength(value);
                        final Object instance5 = Array.newInstance(value2.getClass(), length4 + 1);
                        System.arraycopy(value, 0, instance5, 0, length4);
                        Array.set(instance5, length4, value2);
                        value = instance5;
                    }
                }
                hashMap.put(s, value);
            }
        }
        b$a.c((Map)hashMap);
        return b$a.a();
    }
}
