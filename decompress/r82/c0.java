// 
// Decompiled by Procyon v0.6.0
// 

package r82;

import ng2.e;

public abstract class c0
{
    public final String a;
    public final String b;
    
    public c0(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof c0 && e.a((Object)((c0)o).a, (Object)this.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
