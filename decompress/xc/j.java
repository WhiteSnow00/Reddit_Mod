// 
// Decompiled by Procyon v0.6.0
// 

package xc;

import java.util.Arrays;

public final class j
{
    public final int a;
    public final i[] b;
    public int c;
    
    public j(final i... b) {
        this.b = b;
        this.a = b.length;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && j.class == o.getClass() && Arrays.equals(this.b, ((j)o).b));
    }
    
    @Override
    public final int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.b);
        }
        return this.c;
    }
}
