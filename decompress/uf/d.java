// 
// Decompiled by Procyon v0.6.0
// 

package uf;

public final class d extends cg.d
{
    public float t;
    
    public d() {
        this.t = -1.0f;
    }
    
    public final void C2(final float n, final float n2, final m m) {
        m.e(n2 * n, 180.0f, 90.0f);
        final double sin = Math.sin(Math.toRadians(90.0f));
        final double n3 = n2;
        final double n4 = n;
        m.d((float)(sin * n3 * n4), (float)(Math.sin(Math.toRadians(0.0f)) * n3 * n4));
    }
}
