// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import androidx.viewpager.widget.c;
import ah2.f;
import u2.b;

public final class j
{
    public final float a;
    public final b b;
    public final float c;
    
    public j(float density, final b b) {
        this.a = density;
        this.b = b;
        density = b.getDensity();
        final float a = k.a;
        this.c = density * 386.0878f * 160.0f * 0.84f;
    }
    
    public final a a(final float n) {
        final double b = this.b(n);
        final double n2 = k.a;
        final double n3 = n2 - 1.0;
        return new a(n, (float)(Math.exp(n2 / n3 * b) * (this.a * this.c)), (long)(Math.exp(b / n3) * 1000.0));
    }
    
    public final double b(final float n) {
        final float[] a = k0.a.a;
        return Math.log(Math.abs(n) * 0.35f / (double)(this.a * this.c));
    }
    
    public static final class a
    {
        public final float a;
        public final float b;
        public final long c;
        
        public a(final float a, final float b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return f.a((Object)this.a, (Object)a.a) && f.a((Object)this.b, (Object)a.b) && this.c == a.c;
        }
        
        @Override
        public final int hashCode() {
            return Long.hashCode(this.c) + a.a(this.b, Float.hashCode(this.a) * 31, 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("FlingInfo(initialVelocity=");
            k.append(this.a);
            k.append(", distance=");
            k.append(this.b);
            k.append(", duration=");
            return androidx.viewpager.widget.c.k(k, this.c, ')');
        }
    }
}
