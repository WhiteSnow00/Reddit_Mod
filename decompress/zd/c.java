// 
// Decompiled by Procyon v0.6.0
// 

package zd;

import dalvik.system.PathClassLoader;

public final class c extends PathClassLoader
{
    public c(final ClassLoader classLoader, final String s) {
        super(s, classLoader);
    }
    
    public final Class<?> loadClass(final String s, final boolean b) throws ClassNotFoundException {
        Label_0026: {
            if (s.startsWith("java.") || s.startsWith("android.")) {
                break Label_0026;
            }
            try {
                return ((ClassLoader)this).findClass(s);
                return super.loadClass(s, b);
            }
            catch (final ClassNotFoundException ex) {
                return super.loadClass(s, b);
            }
        }
    }
}
