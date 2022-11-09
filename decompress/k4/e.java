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
    
    public final b.k c(double pow, double n, final long n2) {
        if (!this.c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            final double b = this.b;
            if (b > 1.0) {
                final double n3 = -b;
                final double a = this.a;
                this.f = Math.sqrt(b * b - 1.0) * a + n3 * a;
                final double b2 = this.b;
                final double n4 = -b2;
                final double a2 = this.a;
                this.g = n4 * a2 - Math.sqrt(b2 * b2 - 1.0) * a2;
            }
            else if (b >= 0.0 && b < 1.0) {
                this.h = Math.sqrt(1.0 - b * b) * this.a;
            }
            this.c = true;
        }
        final double n5 = n2 / 1000.0;
        pow -= this.i;
        final double b3 = this.b;
        if (b3 > 1.0) {
            final double g = this.g;
            final double f = this.f;
            final double n6 = pow - (g * pow - n) / (g - f);
            pow = (pow * g - n) / (g - f);
            n = Math.pow(2.718281828459045, g * n5);
            n = Math.pow(2.718281828459045, this.f * n5) * pow + n * n6;
            final double g2 = this.g;
            final double pow2 = Math.pow(2.718281828459045, g2 * n5);
            final double f2 = this.f;
            pow = Math.pow(2.718281828459045, f2 * n5) * (pow * f2) + pow2 * (n6 * g2);
        }
        else if (b3 == 1.0) {
            final double a3 = this.a;
            n += a3 * pow;
            final double n7 = n * n5 + pow;
            final double pow3 = Math.pow(2.718281828459045, -a3 * n5);
            pow = Math.pow(2.718281828459045, -this.a * n5);
            final double a4 = this.a;
            pow = Math.pow(2.718281828459045, -a4 * n5) * n + pow * n7 * -a4;
            n = pow3 * n7;
        }
        else {
            final double n8 = 1.0 / this.h;
            final double a5 = this.a;
            final double n9 = (b3 * a5 * pow + n) * n8;
            final double pow4 = Math.pow(2.718281828459045, -b3 * a5 * n5);
            n = Math.cos(this.h * n5);
            n = (Math.sin(this.h * n5) * n9 + n * pow) * pow4;
            final double a6 = this.a;
            final double n10 = -a6;
            final double b4 = this.b;
            final double pow5 = Math.pow(2.718281828459045, -b4 * a6 * n5);
            final double h = this.h;
            final double n11 = -h;
            final double sin = Math.sin(h * n5);
            final double h2 = this.h;
            pow = (Math.cos(h2 * n5) * (n9 * h2) + sin * (n11 * pow)) * pow5 + n10 * n * b4;
        }
        final b.k j = this.j;
        j.a = (float)(n + this.i);
        j.b = (float)pow;
        return j;
    }
}
