// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import sg2.e;

public final class b0<T> implements p<T>
{
    public final int a;
    
    public b0() {
        this(0);
    }
    
    public b0(final int a) {
        this.a = a;
    }
    
    public final <V extends i> m0<V> a(final g0<T, V> g0) {
        e.f((Object)g0, "converter");
        return (m0<V>)new s0(this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof b0;
        boolean b2 = false;
        if (b) {
            b2 = b2;
            if (((b0)o).a == this.a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
}
