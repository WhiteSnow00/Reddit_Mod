// 
// Decompiled by Procyon v0.6.0
// 

package va;

import java.util.Iterator;
import ac.q;
import java.util.List;
import java.util.HashMap;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.a;

public final class d0 extends a
{
    public final int k;
    public final int l;
    public final int[] m;
    public final int[] n;
    public final e0[] o;
    public final Object[] p;
    public final HashMap<Object, Integer> q;
    
    public d0(final List list, final q q) {
        super(q);
        final int size = list.size();
        this.m = new int[size];
        this.n = new int[size];
        this.o = new e0[size];
        this.p = new Object[size];
        this.q = new HashMap<Object, Integer>();
        final Iterator iterator = list.iterator();
        int k = 0;
        int n;
        int l = n = 0;
        while (iterator.hasNext()) {
            final a0 a0 = (a0)iterator.next();
            this.o[n] = a0.b();
            this.n[n] = k;
            this.m[n] = l;
            k += this.o[n].o();
            l += this.o[n].h();
            this.p[n] = a0.a();
            this.q.put(this.p[n], n);
            ++n;
        }
        this.k = k;
        this.l = l;
    }
    
    public final int h() {
        return this.l;
    }
    
    public final int o() {
        return this.k;
    }
}
