// 
// Decompiled by Procyon v0.6.0
// 

package s0;

import com.reddit.news.ui.composables.RecommendationContextSection;
import mj2.c0;
import u2.k;
import u2.j;
import dg.d;
import c2.e0;
import c2.u;

public interface f extends u
{
    e0[] E(final int p0, final long p1);
    
    default long f(long n) {
        if (n != n1.f.c) {
            n = d.z(this.r(n1.f.e(n)), this.r(n1.f.c(n)));
        }
        else {
            n = u2.f.c;
        }
        return n;
    }
    
    default float i(final long n) {
        if (k.a(u2.j.b(n), 4294967296L)) {
            return this.getFontScale() * u2.j.c(n);
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
}
