// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.util.Arrays;

public final class i7
{
    public final r2 a = a;
    public final int b = b;
    public final t9 c = c;
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof i7)) {
            return false;
        }
        final i7 i7 = (i7)o;
        return this.a == i7.a && this.b == i7.b && this.c.equals(i7.c);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c.hashCode() });
    }
    
    @Override
    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.a, this.b, this.c);
    }
}
