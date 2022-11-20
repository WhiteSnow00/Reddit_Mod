// 
// Decompiled by Procyon v0.6.0
// 

package wg2;

import java.lang.ref.WeakReference;

public final class l
{
    public final WeakReference<ClassLoader> a;
    public final int b;
    
    public l(final ClassLoader classLoader) {
        this.a = new WeakReference<ClassLoader>(classLoader);
        this.b = System.identityHashCode(classLoader);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof l && this.a.get() == ((l)o).a.get();
    }
    
    @Override
    public final int hashCode() {
        return this.b;
    }
    
    @Override
    public final String toString() {
        final ClassLoader classLoader = this.a.get();
        String string;
        if (classLoader == null || (string = classLoader.toString()) == null) {
            string = "<null>";
        }
        return string;
    }
}
