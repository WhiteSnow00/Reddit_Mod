// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class u6 implements a7
{
    public final a7[] a;
    
    public u6(final a7... a) {
        this.a = a;
    }
    
    @Override
    public final z6 a(final Class clazz) {
        final a7[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            final a7 a2 = a[i];
            if (a2.b(clazz)) {
                return a2.a(clazz);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(clazz.getName()));
    }
    
    @Override
    public final boolean b(final Class clazz) {
        final a7[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            if (a[i].b(clazz)) {
                return true;
            }
        }
        return false;
    }
}
