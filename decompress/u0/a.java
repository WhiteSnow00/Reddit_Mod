// 
// Decompiled by Procyon v0.6.0
// 

package u0;

import ah2.f;
import o1.z;
import androidx.compose.ui.unit.LayoutDirection;
import o1.l0;

public abstract class a implements l0
{
    public final b f;
    public final b g;
    public final b h;
    public final b i;
    
    public a(final b f, final b g, final b h, final b i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public abstract e a(final d p0, final d p1, final d p2, final d p3);
    
    public abstract z b(final long p0, final float p1, final float p2, final float p3, final float p4, final LayoutDirection p5);
    
    public final z e(final long n, final LayoutDirection layoutDirection, final u2.b b) {
        ah2.f.f((Object)layoutDirection, "layoutDirection");
        ah2.f.f((Object)b, "density");
        final float a = this.f.a(b, n);
        final float a2 = this.g.a(b, n);
        final float a3 = this.h.a(b, n);
        final float a4 = this.i.a(b, n);
        final float d = n1.f.d(n);
        final float n2 = a + a4;
        float n3 = a4;
        float n4 = a;
        if (n2 > d) {
            final float n5 = d / n2;
            n4 = a * n5;
            n3 = a4 * n5;
        }
        final float n6 = a2 + a3;
        float n7 = a2;
        float n8 = a3;
        if (n6 > d) {
            final float n9 = d / n6;
            n7 = a2 * n9;
            n8 = a3 * n9;
        }
        if (n4 >= 0.0f && n7 >= 0.0f && n8 >= 0.0f && n3 >= 0.0f) {
            return this.b(n, n4, n7, n8, n3, layoutDirection);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Corner size in Px can't be negative(topStart = ");
        sb.append(n4);
        sb.append(", topEnd = ");
        sb.append(n7);
        sb.append(", bottomEnd = ");
        sb.append(n8);
        sb.append(", bottomStart = ");
        sb.append(n3);
        sb.append(")!");
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
