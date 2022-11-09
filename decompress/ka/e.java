// 
// Decompiled by Procyon v0.6.0
// 

package ka;

import java.util.Arrays;
import ha.b;

public final class e
{
    public final b a;
    public final byte[] b;
    
    public e(final b a, final byte[] b) {
        if (a == null) {
            throw new NullPointerException("encoding is null");
        }
        if (b != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("bytes is null");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return this.a.equals((Object)e.a) && Arrays.equals(this.b, e.b);
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("EncodedPayload{encoding=");
        k.append(this.a);
        k.append(", bytes=[...]}");
        return k.toString();
    }
}
