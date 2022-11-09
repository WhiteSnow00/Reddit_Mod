// 
// Decompiled by Procyon v0.6.0
// 

package l9;

public final class b<K, V> extends j0.b<K, V>
{
    public int n;
    
    public final void clear() {
        this.n = 0;
        super.clear();
    }
    
    public final int hashCode() {
        if (this.n == 0) {
            this.n = super.hashCode();
        }
        return this.n;
    }
    
    public final void k(final j0.b b) {
        this.n = 0;
        super.k(b);
    }
    
    public final V l(final int n) {
        this.n = 0;
        return (V)super.l(n);
    }
    
    public final V m(final int n, final V v) {
        this.n = 0;
        return (V)super.m(n, (Object)v);
    }
    
    public final V put(final K k, final V v) {
        this.n = 0;
        return (V)super.put((Object)k, (Object)v);
    }
}
