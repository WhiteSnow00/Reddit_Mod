// 
// Decompiled by Procyon v0.6.0
// 

package he;

public final class o0 implements v0
{
    public final v0[] a;
    
    public o0(final v0... a) {
        this.a = a;
    }
    
    public final t0 a(final Class clazz) {
        final v0[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            final v0 v0 = a[i];
            if (v0.b(clazz)) {
                return v0.a(clazz);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(clazz.getName()));
    }
    
    public final boolean b(final Class clazz) {
        final v0[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            if (a[i].b(clazz)) {
                return true;
            }
        }
        return false;
    }
}
