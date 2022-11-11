// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
import java.security.PrivilegedExceptionAction;

public final class b8 implements PrivilegedExceptionAction
{
    public static final Unsafe a() throws Exception {
        for (final Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            final Object value = field.get(null);
            if (Unsafe.class.isInstance(value)) {
                return Unsafe.class.cast(value);
            }
        }
        return null;
    }
}
