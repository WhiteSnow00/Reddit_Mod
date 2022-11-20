// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import sa.i;
import com.google.android.datatransport.runtime.c;
import ta.a$a;

public final class f implements a$a
{
    public final j f;
    public final Iterable g;
    public final c h;
    public final long i;
    
    public f(final j f, final Iterable g, final c h, final long i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final Object execute() {
        final j f = this.f;
        final Iterable g = this.g;
        final c h = this.h;
        final long i = this.i;
        f.c.W1(g);
        f.c.h2(f.g.a() + i, h);
        return null;
    }
}
