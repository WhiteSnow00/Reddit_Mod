// 
// Decompiled by Procyon v0.6.0
// 

package k4;

public final class e
{
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final b.k j;
    
    public e() {
        this.a = Math.sqrt(1500.0);
        this.b = 0.5;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new b.k();
    }
    
    public e(final float n) {
        this.a = Math.sqrt(1500.0);
        this.b = 0.5;
        this.c = false;
        this.j = new b.k();
        this.i = n;
    }
    
    public final void a(final float n) {
        if (n >= 0.0f) {
            this.b = n;
            this.c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }
    
    public final void b(final float n) {
        if (n > 0.0f) {
            this.a = Math.sqrt(n);
            this.c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }
    
    public final b.k c(double n, double n2, final long n3) {
        if (!this.c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            final double b = this.b;
            if (b > 1.0) {
                final double n4 = -b;
                final double a = this.a;
                this.f = Math.sqrt(b * b - 1.0) * a + n4 * a;
                final double b2 = this.b;
                final double n5 = -b2;
                final double a2 = this.a;
                this.g = n5 * a2 - Math.sqrt(b2 * b2 - 1.0) * a2;
            }
            else if (b >= 0.0 && b < 1.0) {
                this.h = Math.sqrt(1.0 - b * b) * this.a;
            }
            this.c = true;
        }
        final double n6 = n3 / 1000.0;
        n -= this.i;
        final double b3 = this.b;
        if (b3 > 1.0) {
            final double g = this.g;
            final double f = this.f;
            final double n7 = n - (g * n - n2) / (g - f);
            n = (n * g - n2) / (g - f);
            n2 = Math.pow(2.718281828459045, g * n6);
            n2 = Math.pow(2.718281828459045, this.f * n6) * n + n2 * n7;
            final double g2 = this.g;
            final double pow = Math.pow(2.718281828459045, g2 * n6);
            final double f2 = this.f;
            n = Math.pow(2.718281828459045, f2 * n6) * (n * f2) + pow * (n7 * g2);
        }
        else if (b3 == 1.0) {
            final double a3 = this.a;
            n2 += a3 * n;
            final double n8 = n2 * n6 + n;
            final double pow2 = Math.pow(2.718281828459045, -a3 * n6);
            final double pow3 = Math.pow(2.718281828459045, -this.a * n6);
            final double a4 = this.a;
            n = -a4;
            n = Math.pow(2.718281828459045, -a4 * n6) * n2 + pow3 * n8 * n;
            n2 = pow2 * n8;
        }
        else {
            final double n9 = 1.0 / this.h;
            final double a5 = this.a;
            final double n10 = (b3 * a5 * n + n2) * n9;
            final double pow4 = Math.pow(2.718281828459045, -b3 * a5 * n6);
            n2 = Math.cos(this.h * n6);
            n2 = (Math.sin(this.h * n6) * n10 + n2 * n) * pow4;
            final double a6 = this.a;
            final double n11 = -a6;
            final double b4 = this.b;
            final double pow5 = Math.pow(2.718281828459045, -b4 * a6 * n6);
            final double h = this.h;
            final double n12 = -h;
            final double sin = Math.sin(h * n6);
            final double h2 = this.h;
            n = (Math.cos(h2 * n6) * (n10 * h2) + sin * (n12 * n)) * pow5 + n11 * n2 * b4;
        }
        final b.k j = this.j;
        j.a = (float)(n2 + this.i);
        j.b = (float)n;
        return j;
    }
}
