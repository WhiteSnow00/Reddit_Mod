// 
// Decompiled by Procyon v0.6.0
// 

package cc;

import java.util.NoSuchElementException;

public abstract class b implements n
{
    public final long b;
    public final long c;
    public long d;
    
    public b(final long b, final long c) {
        this.b = b;
        this.c = c;
        this.d = b - 1L;
    }
    
    public final void c() {
        final long d = this.d;
        if (d >= this.b && d <= this.c) {
            return;
        }
        throw new NoSuchElementException();
    }
    
    public final boolean next() {
        final long d = this.d + 1L;
        this.d = d;
        return d > this.c ^ true;
    }
}
