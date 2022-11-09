// 
// Decompiled by Procyon v0.6.0
// 

package y2;

import ah2.f;
import pg2.j;
import androidx.constraintlayout.compose.ConstrainScope;
import zg2.l;
import c2.n;

public final class b implements n
{
    public final a f;
    public final l<ConstrainScope, j> g;
    public final Object h;
    
    public b(final a f, final l<? super ConstrainScope, j> g) {
        ah2.f.f((Object)f, "ref");
        ah2.f.f((Object)g, "constrain");
        this.f = f;
        this.g = (l<ConstrainScope, j>)g;
        this.h = f.a;
    }
    
    @Override
    public final Object a() {
        return this.h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof b) {
            final Object a = this.f.a;
            final b b = (b)o;
            if (ah2.f.a(a, b.f.a) && ah2.f.a((Object)this.g, (Object)b.g)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.g.hashCode() + this.f.a.hashCode() * 31;
    }
}
