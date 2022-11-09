// 
// Decompiled by Procyon v0.6.0
// 

package zd;

import android.os.IInterface;
import java.lang.reflect.Field;
import android.os.IBinder;

public final class b<T> extends a
{
    public final T a;
    
    public b(final T a) {
        this.a = a;
    }
    
    public static <T> T J(final zd.a a) {
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
            yd.a.S0((Object)field);
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
        throw new IllegalArgumentException(a2.b.f(64, "Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
    }
}
