// 
// Decompiled by Procyon v0.6.0
// 

package s0;

import u2.b;
import com.reddit.news.ui.composables.RecommendationContextSection;
import ej2.c0;
import u2.k;
import u2.j;
import ml0.a;
import c2.e0;
import c2.u;

public interface f extends u
{
    e0[] G(final int p0, final long p1);
    
    default long f(long n) {
        if (n != n1.f.c) {
            n = a.c(this.s(n1.f.f(n)), this.s(n1.f.d(n)));
        }
        else {
            n = u2.f.c;
        }
        return n;
    }
    
    default float i(final long n) {
        if (k.a(j.b(n), 4294967296L)) {
            return ((b)this).getFontScale() * j.c(n);
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }
    
    default long j(final float n) {
        return c0.L3(n / (((b)this).getDensity() * ((b)this).getFontScale()), 4294967296L);
    }
    
    default float r(final int n) {
        return n / ((b)this).getDensity();
    }
    
    default float s(final float n) {
        return n / ((b)this).getDensity();
    }
    
    default long t() {
        return c0.L3(RecommendationContextSection.f / ((b)this).getFontScale(), 4294967296L);
    }
}
