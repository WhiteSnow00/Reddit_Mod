// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import a80.a;
import l0.g0;
import androidx.compose.animation.core.VectorConvertersKt;
import z0.l0;
import u2.g;
import androidx.compose.animation.core.Animatable;

public final class v
{
    public int a;
    public final Animatable<g, l0.g> b;
    public long c;
    public final l0 d;
    
    public v(final int a, final long c) {
        this.a = a;
        this.b = (Animatable<g, l0.g>)new Animatable((Object)new g(c), (g0)VectorConvertersKt.g, (Object)null);
        this.c = c;
        this.d = a80.a.n0(Boolean.FALSE);
    }
}
