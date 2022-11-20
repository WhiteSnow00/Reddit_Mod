// 
// Decompiled by Procyon v0.6.0
// 

package r0;

import ah0.b;
import androidx.compose.animation.core.VectorConvertersKt;
import z0.k0;
import u2.g;
import androidx.compose.animation.core.Animatable;

public final class a0
{
    public int a;
    public final Animatable<g, l0.g> b;
    public long c;
    public final k0 d;
    
    public a0(final int a, final long c) {
        this.a = a;
        this.b = (Animatable<g, l0.g>)new Animatable((Object)new g(c), VectorConvertersKt.g, (Object)null);
        this.c = c;
        this.d = ah0.b.Z0((Object)Boolean.FALSE);
    }
}
