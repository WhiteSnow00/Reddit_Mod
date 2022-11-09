// 
// Decompiled by Procyon v0.6.0
// 

package t0;

import d2.e;
import androidx.compose.foundation.relocation.BringIntoViewKt;
import d2.d;
import ah2.f;
import c2.l;
import c2.z;

public abstract class b implements d2.b, z
{
    public final c f;
    public c g;
    public l h;
    
    public b(final a f) {
        ah2.f.f((Object)f, "defaultParent");
        this.f = f;
    }
    
    @Override
    public final void C0(final d2.d d) {
        ah2.f.f((Object)d, "scope");
        this.g = (c)d.a((e)BringIntoViewKt.a);
    }
    
    @Override
    public final void R(final l h) {
        ah2.f.f((Object)h, "coordinates");
        this.h = h;
    }
}
