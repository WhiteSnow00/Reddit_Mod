// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Arrays;
import ff0.p;

public final class d0 extends y
{
    public static final p i;
    public final boolean g;
    public final boolean h;
    
    static {
        i = new p(2);
    }
    
    public d0() {
        this.g = false;
        this.h = false;
    }
    
    public d0(final boolean h) {
        this.g = true;
        this.h = h;
    }
    
    public static String a(final int n) {
        return Integer.toString(n, 36);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof d0;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final d0 d0 = (d0)o;
        boolean b3 = b2;
        if (this.h == d0.h) {
            b3 = b2;
            if (this.g == d0.g) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.g, this.h });
    }
    
    @Override
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt(a(0), 3);
        ((BaseBundle)bundle).putBoolean(a(1), this.g);
        ((BaseBundle)bundle).putBoolean(a(2), this.h);
        return bundle;
    }
}
