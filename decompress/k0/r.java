// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import u2.b;
import l0.u;

public final class r implements u
{
    public final j a;
    
    public r(final b b) {
        this.a = new j(s.a, b);
    }
    
    @Override
    public final float a() {
        return 0.0f;
    }
    
    @Override
    public final long b(final float n) {
        return (long)(Math.exp(this.a.b(n) / (k.a - 1.0)) * 1000.0) * 1000000L;
    }
    
    @Override
    public final float c(final float n, final float n2) {
        final j a = this.a;
        final double b = a.b(n2);
        final double n3 = k.a;
        return Math.signum(n2) * (float)(Math.exp(n3 / (n3 - 1.0) * b) * (a.a * a.c)) + n;
    }
    
    @Override
    public final float d(float b, long c) {
        final long n = c / 1000000L;
        final j.a a = this.a.a(b);
        c = a.c;
        if (c > 0L) {
            b = n / (float)c;
        }
        else {
            b = 1.0f;
        }
        b = k0.a.a(b).b;
        return Math.signum(a.a) * b * a.b / a.c * 1000.0f;
    }
    
    @Override
    public final float e(final float n, float n2, long n3) {
        n3 /= 1000000L;
        final j.a a = this.a.a(n2);
        final long c = a.c;
        if (c > 0L) {
            n2 = n3 / (float)c;
        }
        else {
            n2 = 1.0f;
        }
        return Math.signum(a.a) * a.b * k0.a.a(n2).a + n;
    }
}
