// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.graphics;

import b5.k;
import c2.h0;
import c2.w;
import c2.x;
import ng2.e;
import androidx.compose.ui.platform.o0;
import cg2.j;
import o1.u;
import mg2.l;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.p0;

public final class BlockGraphicsLayerModifier extends p0 implements a
{
    public final l<u, j> g;
    
    public BlockGraphicsLayerModifier(final l<? super u, j> g, final l<? super o0, j> l) {
        e.f((Object)g, "layerBlock");
        e.f((Object)l, "inspectorInfo");
        super((l)l);
        this.g = (l<u, j>)g;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof BlockGraphicsLayerModifier && e.a((Object)this.g, (Object)((BlockGraphicsLayerModifier)o).g);
    }
    
    public final w h(final x x, final c2.u u, final long n) {
        e.f((Object)x, "$this$measure");
        final h0 s0 = u.s0(n);
        return x.N0(x, s0.f, s0.g, (l)new BlockGraphicsLayerModifier$measure.BlockGraphicsLayerModifier$measure$1(s0, this));
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
    
    public final String toString() {
        return k.n(a.t("BlockGraphicsLayerModifier(block="), (l)this.g, ')');
    }
}
