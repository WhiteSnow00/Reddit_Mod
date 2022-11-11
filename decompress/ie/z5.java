// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class z5 implements a7
{
    public static final z5 a;
    
    static {
        a = new z5();
    }
    
    @Override
    public final z6 a(final Class clazz) {
        if (e6.class.isAssignableFrom(clazz)) {
            try {
                return (z6)e6.p(clazz.asSubclass(e6.class)).q(3);
            }
            catch (final Exception ex) {
                throw new RuntimeException("Unable to get message info for ".concat(clazz.getName()), ex);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(clazz.getName()));
    }
    
    @Override
    public final boolean b(final Class clazz) {
        return e6.class.isAssignableFrom(clazz);
    }
}
