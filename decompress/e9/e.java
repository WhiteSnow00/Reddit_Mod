// 
// Decompiled by Procyon v0.6.0
// 

package e9;

import al0.f0;
import java.lang.reflect.InvocationTargetException;
import al0.g7;

@Deprecated
public final class e
{
    public static c a(String forName) {
        try {
            forName = (String)Class.forName(forName);
            try {
                final c instance = ((Class<c>)forName).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                if (instance instanceof c) {
                    return instance;
                }
                throw new RuntimeException(g7.h("Expected instanceof GlideModule, but found: ", (Object)instance));
            }
            catch (final InvocationTargetException ex) {
                b((Class)forName, ex);
                throw null;
            }
            catch (final NoSuchMethodException ex2) {
                b((Class)forName, ex2);
                throw null;
            }
            catch (final IllegalAccessException ex3) {
                b((Class)forName, ex3);
                throw null;
            }
            catch (final InstantiationException ex4) {
                b((Class)forName, ex4);
                throw null;
            }
        }
        catch (final ClassNotFoundException ex5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", ex5);
        }
    }
    
    public static void b(final Class clazz, final ReflectiveOperationException ex) {
        throw new RuntimeException(f0.l("Unable to instantiate GlideModule implementation for ", clazz), ex);
    }
}
