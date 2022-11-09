// 
// Decompiled by Procyon v0.6.0
// 

package t8;

import com.bumptech.glide.load.engine.e;
import r8.l;
import p8.d;

public final class g extends l9.g<d, l<?>> implements h
{
    public h.a d;
    
    public g(final long n) {
        super(n);
    }
    
    @Override
    public final int b(final Object o) {
        final l l = (l)o;
        int size;
        if (l == null) {
            size = 1;
        }
        else {
            size = l.getSize();
        }
        return size;
    }
    
    @Override
    public final void c(final Object o, final Object o2) {
        final d d = (d)o;
        final l l = (l)o2;
        final h.a d2 = this.d;
        if (d2 != null && l != null) {
            ((e)d2).e.a(l, true);
        }
    }
}
