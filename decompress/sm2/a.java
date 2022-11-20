// 
// Decompiled by Procyon v0.6.0
// 

package sm2;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

public final class a
{
    public static <T> T a(final Class<T> clazz, final InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return clazz.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[] { clazz }, invocationHandler));
    }
}
