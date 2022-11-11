// 
// Decompiled by Procyon v0.6.0
// 

package tf;

import dn.a;

public final class i extends a
{
    public float h;
    
    public i() {
        super(8);
        this.h = -1.0f;
    }
    
    public final void o(float n, final float n2, final m m) {
        m.e(n2 * n, 180.0f, 90.0f);
        n *= n2 * 2.0f;
        m.a(0.0f, 0.0f, n, n, 180.0f, 90.0f);
    }
}
