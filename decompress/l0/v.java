// 
// Decompiled by Procyon v0.6.0
// 

package l0;

public final class v implements u
{
    public final float a;
    public final float b;
    
    public v(final float n, final float n2) {
        this.a = Math.max(1.0E-7f, Math.abs(n2));
        this.b = Math.max(1.0E-4f, n) * -4.2f;
    }
    
    @Override
    public final float a() {
        return this.a;
    }
    
    @Override
    public final long b(final float n) {
        return (long)((float)Math.log(this.a / Math.abs(n)) * 1000.0f / this.b) * 1000000L;
    }
    
    @Override
    public final float c(final float n, float n2) {
        final float abs = Math.abs(n2);
        final float a = this.a;
        if (abs <= a) {
            return n;
        }
        final double log = Math.log(Math.abs(a / n2));
        final float b = this.b;
        final double n3 = b;
        final double n4 = log / n3;
        final double n5 = 1000;
        n2 /= b;
        return n2 * (float)Math.exp(n3 * (n4 * n5) / 1000.0f) + (n - n2);
    }
    
    @Override
    public final float d(final float n, final long n2) {
        return n * (float)Math.exp(n2 / 1000000L / 1000.0f * this.b);
    }
    
    @Override
    public final float e(final float n, float n2, long n3) {
        n3 /= 1000000L;
        final float b = this.b;
        n2 /= b;
        return n2 * (float)Math.exp(b * n3 / 1000.0f) + (n - n2);
    }
}
