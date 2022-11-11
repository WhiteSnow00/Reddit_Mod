// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.util.Arrays;
import java.util.List;

public final class j7
{
    public final f7 a = a;
    public final List b = b;
    public final Integer c = c;
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof j7)) {
            return false;
        }
        final j7 j7 = (j7)o;
        if (this.a.equals(j7.a) && this.b.equals(j7.b)) {
            final Integer c = this.c;
            final Integer c2 = j7.c;
            if (c == c2 || (c != null && c.equals(c2))) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    @Override
    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }
}
