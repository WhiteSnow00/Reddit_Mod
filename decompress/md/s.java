// 
// Decompiled by Procyon v0.6.0
// 

package md;

import java.util.Arrays;

public final class s extends r
{
    public final byte[] c;
    
    public s(final byte[] c) {
        super(Arrays.copyOfRange(c, 0, 25));
        this.c = c;
    }
    
    public final byte[] N() {
        return this.c;
    }
}
