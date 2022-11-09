// 
// Decompiled by Procyon v0.6.0
// 

package l0;

public final class c0
{
    public float a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public float g;
    
    public c0() {
        this.a = 1.0f;
        this.b = Math.sqrt(50.0);
        this.g = 1.0f;
    }
    
    public final long a(float n, float n2, long n3) {
        final boolean c = this.c;
        final int n4 = 0;
        if (!c) {
            if (this.a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            final float g = this.g;
            final double n5 = g;
            final double n6 = n5 * n5;
            if (g > 1.0f) {
                final double n7 = -g;
                final double b = this.b;
                final double n8 = n6 - 1;
                this.d = Math.sqrt(n8) * b + n7 * b;
                final double n9 = -this.g;
                final double b2 = this.b;
                this.e = n9 * b2 - Math.sqrt(n8) * b2;
            }
            else if (g >= 0.0f && g < 1.0f) {
                this.f = Math.sqrt(1 - n6) * this.b;
            }
            this.c = true;
        }
        final float n10 = n - this.a;
        final double n11 = n3 / 1000.0;
        n = this.g;
        double n16;
        double n17;
        if (n > 1.0f) {
            final double n12 = n10;
            final double e = this.e;
            final double n13 = n2;
            final double d = this.d;
            final double n14 = n12 - (e * n12 - n13) / (e - d);
            final double n15 = (n12 * e - n13) / (e - d);
            n16 = Math.exp(this.d * n11) * n15 + Math.exp(e * n11) * n14;
            final double e2 = this.e;
            final double exp = Math.exp(e2 * n11);
            final double d2 = this.d;
            n17 = Math.exp(d2 * n11) * (n15 * d2) + exp * (n14 * e2);
        }
        else {
            int n18 = n4;
            if (n == 1.0f) {
                n18 = 1;
            }
            if (n18 != 0) {
                final double n19 = n2;
                final double b3 = this.b;
                final double n20 = n10;
                final double n21 = b3 * n20 + n19;
                final double n22 = n21 * n11 + n20;
                final double exp2 = Math.exp(-b3 * n11);
                final double exp3 = Math.exp(-this.b * n11);
                final double b4 = this.b;
                n17 = Math.exp(-b4 * n11) * n21 + exp3 * n22 * -b4;
                n16 = exp2 * n22;
            }
            else {
                final double n23 = 1 / this.f;
                final double n24 = n;
                final double b5 = this.b;
                final double n25 = n10;
                final double n26 = (n24 * b5 * n25 + n2) * n23;
                n16 = Math.exp(-n * b5 * n11) * (Math.sin(this.f * n11) * n26 + Math.cos(this.f * n11) * n25);
                final double b6 = this.b;
                final double n27 = -b6;
                n = this.g;
                final double n28 = n;
                final double exp4 = Math.exp(-n * b6 * n11);
                final double f = this.f;
                final double n29 = -f;
                final double sin = Math.sin(f * n11);
                final double f2 = this.f;
                n17 = (Math.cos(f2 * n11) * (n26 * f2) + sin * (n29 * n25)) * exp4 + n27 * n16 * n28;
            }
        }
        n = (float)(n16 + this.a);
        n2 = (float)n17;
        n3 = Float.floatToIntBits(n);
        return ((long)Float.floatToIntBits(n2) & 0xFFFFFFFFL) | n3 << 32;
    }
}
