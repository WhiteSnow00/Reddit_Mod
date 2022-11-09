// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import androidx.compose.animation.core.VectorConvertersKt;
import yl.a;
import ah2.f;

public final class w implements t
{
    public final int a;
    public final int b;
    public final q c;
    
    public w(final int a, final int b, final q c) {
        f.f((Object)c, "easing");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final long b(final float n, final float n2, final float n3) {
        return (this.b + this.a) * 1000000L;
    }
    
    @Override
    public final float c(final float n, final float n2, float a, long n3) {
        n3 = a.N(n3 / 1000000L - this.b, 0L, (long)this.a);
        final int a2 = this.a;
        if (a2 == 0) {
            a = 1.0f;
        }
        else {
            a = n3 / (float)a2;
        }
        a = this.c.a(a.J(a, 0.0f, 1.0f));
        final h0 a3 = VectorConvertersKt.a;
        return n2 * a + (1 - a) * n;
    }
    
    @Override
    public final float d(final float n, final float n2, final float n3, long n4) {
        n4 = yl.a.N(n4 / 1000000L - this.b, 0L, (long)this.a);
        final long n5 = lcmp(n4, 0L);
        if (n5 < 0) {
            return 0.0f;
        }
        if (n5 == 0) {
            return n3;
        }
        return (this.c(n, n2, n3, n4 * 1000000L) - this.c(n, n2, n3, (n4 - 1L) * 1000000L)) * 1000.0f;
    }
}
