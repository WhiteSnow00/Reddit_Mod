// 
// Decompiled by Procyon v0.6.0
// 

package hg2;

import sg2.e;

public final class g implements Comparable<g>
{
    public final byte f = b;
    
    @Override
    public final boolean equals(final Object o) {
        final byte f = this.f;
        final boolean b = o instanceof g;
        boolean b2 = false;
        if (b) {
            if (f == ((g)o).f) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.f & 0xFF);
    }
}
