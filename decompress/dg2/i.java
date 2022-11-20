// 
// Decompiled by Procyon v0.6.0
// 

package dg2;

import ng2.e;
import kotlin.collections.b;
import java.util.RandomAccess;

public final class i extends a<Integer> implements RandomAccess
{
    public final int[] f;
    
    public i(final int[] f) {
        this.f = f;
    }
    
    public final int a() {
        return this.f.length;
    }
    
    public final boolean contains(final Object o) {
        return o instanceof Integer && b.b2(((Number)o).intValue(), this.f);
    }
    
    public final Object get(final int n) {
        return this.f[n];
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof Integer)) {
            return -1;
        }
        return b.n2(((Number)o).intValue(), this.f);
    }
    
    public final boolean isEmpty() {
        return this.f.length == 0;
    }
    
    public final int lastIndexOf(final Object o) {
        final boolean b = o instanceof Integer;
        final int n = -1;
        if (!b) {
            return -1;
        }
        final int intValue = ((Number)o).intValue();
        final int[] f = this.f;
        e.f((Object)f, "<this>");
        final int n2 = f.length - 1;
        int n3 = n;
        if (n2 >= 0) {
            n3 = n2;
            while (true) {
                final int n4 = n3 - 1;
                if (intValue == f[n3]) {
                    break;
                }
                if (n4 < 0) {
                    n3 = n;
                    break;
                }
                n3 = n4;
            }
        }
        return n3;
    }
}
