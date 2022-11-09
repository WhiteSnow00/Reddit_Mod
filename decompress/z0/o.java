// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import ah2.f;
import zg2.l;

public final class o implements u0
{
    public final l<q, p> f;
    public p g;
    
    public o(final l<? super q, ? extends p> f) {
        ah2.f.f((Object)f, "effect");
        this.f = (l<q, p>)f;
    }
    
    @Override
    public final void a() {
        this.g = (p)this.f.invoke((Object)s.a);
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final void d() {
        final p g = this.g;
        if (g != null) {
            g.dispose();
        }
        this.g = null;
    }
}
