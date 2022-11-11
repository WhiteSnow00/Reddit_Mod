// 
// Decompiled by Procyon v0.6.0
// 

package l1;

import androidx.compose.ui.node.DrawEntity$a;
import e2.f;
import rg2.l;

public final class e implements d
{
    public final b f;
    public final l<b, g> g;
    
    public e(final b f, final l<? super b, g> g) {
        sg2.e.f((Object)f, "cacheDrawScope");
        sg2.e.f((Object)g, "onBuildDrawCache");
        this.f = f;
        this.g = (l<b, g>)g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final b f = this.f;
        final e e = (e)o;
        return sg2.e.a((Object)f, (Object)e.f) && sg2.e.a((Object)this.g, (Object)e.g);
    }
    
    @Override
    public final int hashCode() {
        return this.g.hashCode() + this.f.hashCode() * 31;
    }
    
    public final void n0(final f f) {
        final g g = this.f.g;
        sg2.e.c((Object)g);
        g.a.invoke(f);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("DrawContentCacheModifier(cacheDrawScope=");
        r.append(this.f);
        r.append(", onBuildDrawCache=");
        return aw.b.j(r, (l)this.g, ')');
    }
    
    @Override
    public final void x0(final DrawEntity$a f) {
        sg2.e.f((Object)f, "params");
        final b f2 = this.f;
        f2.getClass();
        f2.f = (l1.a)f;
        f2.g = null;
        this.g.invoke(f2);
        if (f2.g != null) {
            return;
        }
        throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
    }
}
