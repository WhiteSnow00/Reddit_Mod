// 
// Decompiled by Procyon v0.6.0
// 

package je;

public final class a5 implements z4
{
    public volatile z4 f;
    public volatile boolean g;
    public Object h;
    
    public a5(final z4 f) {
        this.f = f;
    }
    
    @Override
    public final String toString() {
        final z4 f = this.f;
        final StringBuilder t = a.t("Suppliers.memoize(");
        Object string = f;
        if (f == null) {
            final StringBuilder t2 = a.t("<supplier that returned ");
            t2.append(this.h);
            t2.append(">");
            string = t2.toString();
        }
        t.append(string);
        t.append(")");
        return t.toString();
    }
    
    public final Object zza() {
        if (!this.g) {
            synchronized (this) {
                if (!this.g) {
                    final z4 f = this.f;
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
