// 
// Decompiled by Procyon v0.6.0
// 

package l1;

import ah2.f;
import pg2.j;
import q1.c;
import zg2.l;

public final class b implements u2.b
{
    public a f;
    public g g;
    
    public b() {
        this.f = i.a;
    }
    
    public final long b() {
        return this.f.b();
    }
    
    public final g c(final l<? super c, j> l) {
        ah2.f.f((Object)l, "block");
        return this.g = new g(l);
    }
    
    @Override
    public final float getDensity() {
        return this.f.getDensity().getDensity();
    }
    
    @Override
    public final float getFontScale() {
        return this.f.getDensity().getFontScale();
    }
}
