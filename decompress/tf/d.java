// 
// Decompiled by Procyon v0.6.0
// 

package tf;

import dn.a;

public final class d extends a
{
    public float h;
    
    public d() {
        super(8);
        this.h = -1.0f;
    }
    
    public final void o(final float n, final float n2, final m m) {
        m.e(n2 * n, 180.0f, 90.0f);
        final double sin = Math.sin(Math.toRadians(90.0f));
        final double n3 = n2;
        final double n4 = n;
        m.d((float)(sin * n3 * n4), (float)(Math.sin(Math.toRadians(0.0f)) * n3 * n4));
    }
}
