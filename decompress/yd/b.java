// 
// Decompiled by Procyon v0.6.0
// 

package yd;

import android.os.IInterface;
import java.lang.reflect.Field;
import android.os.IBinder;
import mg.d0;

public final class b<T> extends a$a
{
    public final T a;
    
    public b(final T a) {
        this.a = a;
    }
    
    public static <T> T N(final a a) {
        if (a instanceof b) {
            return (T)((b)a).a;
        }
        final IBinder binder = ((IInterface)a).asBinder();
        final Field[] declaredFields = binder.getClass().getDeclaredFields();
        final int length = declaredFields.length;
        Field field = null;
        int i = 0;
        int n = 0;
        while (i < length) {
            final Field field2 = declaredFields[i];
            int n2 = n;
            if (!field2.isSynthetic()) {
                n2 = n + 1;
                field = field2;
            }
            ++i;
            n = n2;
        }
        if (n == 1) {
            d0.y((Object)field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T)field.get(binder);
                }
                catch (final IllegalAccessException ex) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", ex);
                }
                catch (final NullPointerException ex2) {
                    throw new IllegalArgumentException("Binder object is null.", ex2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(m5.a.c(64, "Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
    }
}
