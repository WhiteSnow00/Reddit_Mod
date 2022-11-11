// 
// Decompiled by Procyon v0.6.0
// 

package jk2;

import sg2.e;

public final class b implements e0
{
    public final void close() {
    }
    
    public final void flush() {
    }
    
    public final h0 timeout() {
        return h0.NONE;
    }
    
    public final void write(final c c, final long n) {
        e.f((Object)c, "source");
        c.skip(n);
    }
}
