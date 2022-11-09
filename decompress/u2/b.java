// 
// Decompiled by Procyon v0.6.0
// 

package u2;

import com.reddit.news.ui.composables.RecommendationContextSection;
import mj2.c0;
import dg.d;
import a80.a;

public interface b
{
    default float M0(final float n) {
        return this.getDensity() * n;
    }
    
    default long b0(long n) {
        final int d = f.d;
        if (n != f.c) {
            n = a.f(this.M0(f.b(n)), this.M0(f.a(n)));
        }
        else {
            final int d2 = n1.f.d;
            n = n1.f.c;
        }
        return n;
    }
    
    default long f(long n) {
        if (n != n1.f.c) {
            n = d.z(this.r(n1.f.e(n)), this.r(n1.f.c(n)));
        }
        else {
            n = f.c;
        }
        return n;
    }
    
    float getDensity();
    
    float getFontScale();
    
    default float i(final long n) {
        if (k.a(j.b(n), 4294967296L)) {
            return this.getFontScale() * j.c(n);
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }
    
    default long j(final float n) {
        return c0.O(n / (this.getDensity() * this.getFontScale()), 4294967296L);
    }
    
    default float q(final int n) {
        return n / this.getDensity();
    }
    
    default float r(final float n) {
        return n / this.getDensity();
    }
    
    default long s() {
        return c0.O(RecommendationContextSection.f / this.getFontScale(), 4294967296L);
    }
    
    default int s0(float m0) {
        m0 = this.M0(m0);
        int d1;
        if (Float.isInfinite(m0)) {
            d1 = Integer.MAX_VALUE;
        }
        else {
            d1 = at1.a.D1(m0);
        }
        return d1;
    }
    
    default float x0(final long n) {
        if (k.a(j.b(n), 4294967296L)) {
            return this.getDensity() * (this.getFontScale() * j.c(n));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }
}
