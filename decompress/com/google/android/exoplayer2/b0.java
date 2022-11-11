// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Arrays;
import ad.d0;
import ra.k;

public final class b0 extends y
{
    public static final k i;
    public final int g;
    public final float h;
    
    static {
        i = new k(6);
    }
    
    public b0(final int g) {
        d0.d(g > 0, "maxStars must be a positive integer");
        this.g = g;
        this.h = -1.0f;
    }
    
    public b0(final int g, final float h) {
        final boolean b = true;
        d0.d(g > 0, "maxStars must be a positive integer");
        d0.d(h >= 0.0f && h <= g && b, "starRating is out of range [0, maxStars]");
        this.g = g;
        this.h = h;
    }
    
    public static String a(final int n) {
        return Integer.toString(n, 36);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof b0;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final b0 b3 = (b0)o;
        boolean b4 = b2;
        if (this.g == b3.g) {
            b4 = b2;
            if (this.h == b3.h) {
                b4 = true;
            }
        }
        return b4;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.g, this.h });
    }
    
    @Override
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt(a(0), 2);
        ((BaseBundle)bundle).putInt(a(1), this.g);
        bundle.putFloat(a(2), this.h);
        return bundle;
    }
}
