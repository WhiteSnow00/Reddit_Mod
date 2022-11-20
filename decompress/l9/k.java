// 
// Decompiled by Procyon v0.6.0
// 

package l9;

import java.util.Arrays;
import i9.i;
import com.bumptech.glide.g$b;

public final class k<T> implements g$b<T>, i
{
    public int[] a;
    public k.k$a b;
    
    public final int[] a() {
        final int[] a = this.a;
        if (a == null) {
            return null;
        }
        return Arrays.copyOf(a, a.length);
    }
    
    public final void b(final int n, final int n2) {
        this.a = new int[] { n, n2 };
        this.b = null;
    }
}
