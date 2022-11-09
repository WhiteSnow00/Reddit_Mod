// 
// Decompiled by Procyon v0.6.0
// 

package vf;

import gn.a;

public final class d extends a
{
    public float y0;
    
    public d() {
        this.y0 = -1.0f;
    }
    
    public final void V0(final float n, final float n2, final m m) {
        m.e(n2 * n, 180.0f, 90.0f);
        final double sin = Math.sin(Math.toRadians(90.0f));
        final double n3 = n2;
        final double n4 = n;
        m.d((float)(sin * n3 * n4), (float)(Math.sin(Math.toRadians(0.0f)) * n3 * n4));
    }
}
