// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import java.util.Arrays;

public final class i0<V>
{
    public final V a;
    public final Throwable b;
    
    public i0(final Throwable b) {
        this.b = b;
        this.a = null;
    }
    
    public i0(final h a) {
        this.a = (V)a;
        this.b = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i0)) {
            return false;
        }
        final i0 i0 = (i0)o;
        final V a = this.a;
        if (a != null && a.equals(i0.a)) {
            return true;
        }
        final Throwable b = this.b;
        return b != null && i0.b != null && b.toString().equals(this.b.toString());
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
}
