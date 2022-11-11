// 
// Decompiled by Procyon v0.6.0
// 

package nc;

import java.util.Collections;
import ad.d0;
import mc.a;
import java.util.List;
import mc.f;

public final class d implements f
{
    public final List<a> f;
    
    public d(final List<a> f) {
        this.f = f;
    }
    
    public final long a(final int n) {
        d0.c(n == 0);
        return 0L;
    }
    
    public final int c() {
        return 1;
    }
    
    public final int d(final long n) {
        int n2;
        if (n < 0L) {
            n2 = 0;
        }
        else {
            n2 = -1;
        }
        return n2;
    }
    
    public final List<a> e(final long n) {
        Object o;
        if (n >= 0L) {
            o = this.f;
        }
        else {
            o = Collections.emptyList();
        }
        return (List<a>)o;
    }
}
