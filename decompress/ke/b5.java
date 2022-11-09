// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class b5 implements a5
{
    public volatile a5 f;
    public volatile boolean g;
    public Object h;
    
    public b5(final a5 f) {
        this.f = f;
    }
    
    @Override
    public final String toString() {
        final a5 f = this.f;
        final StringBuilder k = a.k("Suppliers.memoize(");
        Object string = f;
        if (f == null) {
            final StringBuilder i = a.k("<supplier that returned ");
            i.append(this.h);
            i.append(">");
            string = i.toString();
        }
        k.append(string);
        k.append(")");
        return k.toString();
    }
    
    @Override
    public final Object zza() {
        if (!this.g) {
            synchronized (this) {
                if (!this.g) {
                    final a5 f = this.f;
                    f.getClass();
                    final Object zza = f.zza();
                    this.h = zza;
                    this.g = true;
                    this.f = null;
                    return zza;
                }
            }
        }
        return this.h;
    }
}
