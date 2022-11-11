// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.ArrayList;
import k3.a;
import java.util.Iterator;

public final class u implements p
{
    public final p a() {
        return (p)p.L3;
    }
    
    public final String c() {
        return "undefined";
    }
    
    public final Boolean d() {
        return Boolean.FALSE;
    }
    
    public final Iterator e() {
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || o instanceof u;
    }
    
    public final p i(final String s, final a a, final ArrayList list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", s));
    }
    
    public final Double u() {
        return Double.NaN;
    }
}
