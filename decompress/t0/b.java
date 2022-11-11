// 
// Decompiled by Procyon v0.6.0
// 

package t0;

import androidx.compose.foundation.relocation.BringIntoViewKt;
import d2.d;
import sg2.e;
import c2.l;
import c2.z;

public abstract class b implements d2.b, z
{
    public final c f;
    public c g;
    public l h;
    
    public b(final a f) {
        e.f((Object)f, "defaultParent");
        this.f = (c)f;
    }
    
    public final void F0(final d2.d d) {
        e.f((Object)d, "scope");
        this.g = (c)d.a((d2.e)BringIntoViewKt.a);
    }
    
    public final void S(final l h) {
        e.f((Object)h, "coordinates");
        this.h = h;
    }
}
