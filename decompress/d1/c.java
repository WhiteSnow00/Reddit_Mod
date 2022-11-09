// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import e1.a;
import ah2.f;
import b1.d;
import kotlin.collections.AbstractMap;

public final class c<K, V> extends AbstractMap<K, V> implements d<K, V>
{
    public static final c h;
    public final s<K, V> f;
    public final int g;
    
    static {
        h = new c((s<K, V>)s.e, 0);
    }
    
    public c(final s<K, V> f, final int g) {
        ah2.f.f((Object)f, "node");
        this.f = f;
        this.g = g;
    }
    
    public final c a(final Object o, final a a) {
        final s<K, V> f = this.f;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        final s$a u = f.u(hashCode, 0, o, a);
        if (u == null) {
            return this;
        }
        return new c((d1.s<Object, Object>)u.a, this.g + u.b);
    }
    
    public final e builder() {
        return new e((c<K, V>)this);
    }
    
    public final boolean containsKey(final Object o) {
        final s<K, V> f = this.f;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return f.d(hashCode, 0, o);
    }
    
    public final V get(final Object o) {
        final s<K, V> f = this.f;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return (V)f.g(hashCode, 0, o);
    }
}
