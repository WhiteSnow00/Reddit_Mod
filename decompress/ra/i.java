// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import com.google.android.datatransport.runtime.c;
import ta.a$a;

public final class i implements a$a
{
    public final j f;
    public final c g;
    public final long h;
    
    public i(final j f, final c g, final long h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final Object execute() {
        final j f = this.f;
        f.c.h2(f.g.a() + this.h, this.g);
        return null;
    }
}
