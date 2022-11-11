// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import j0.i;

public class w
{
    public static final i<ClassLoader, i<String, Class<?>>> a;
    
    static {
        a = new i();
    }
    
    public static Class<?> a(final ClassLoader classLoader, final String s) throws ClassNotFoundException {
        final i<ClassLoader, i<String, Class<?>>> a = w.a;
        i i;
        if ((i = (i)a.getOrDefault((Object)classLoader, (Object)null)) == null) {
            i = new i();
            a.put((Object)classLoader, (Object)i);
        }
        Class<?> forName;
        if ((forName = (Class)i.getOrDefault((Object)s, (Object)null)) == null) {
            forName = Class.forName(s, false, classLoader);
            i.put((Object)s, (Object)forName);
        }
        return forName;
    }
    
    public static Class<? extends Fragment> b(final ClassLoader classLoader, final String s) {
        try {
            return (Class<? extends Fragment>)a(classLoader, s);
        }
        catch (final ClassCastException ex) {
            throw new Fragment$InstantiationException(a.k("Unable to instantiate fragment ", s, ": make sure class is a valid subclass of Fragment"), (Exception)ex);
        }
        catch (final ClassNotFoundException ex2) {
            throw new Fragment$InstantiationException(a.k("Unable to instantiate fragment ", s, ": make sure class name exists"), (Exception)ex2);
        }
    }
}
