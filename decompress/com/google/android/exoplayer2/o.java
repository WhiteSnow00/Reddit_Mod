// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Arrays;
import ha.c;

public final class o extends y
{
    public static final c i;
    public final boolean g;
    public final boolean h;
    
    static {
        i = new c(3);
    }
    
    public o() {
        this.g = false;
        this.h = false;
    }
    
    public o(final boolean h) {
        this.g = true;
        this.h = h;
    }
    
    public static String a(final int n) {
        return Integer.toString(n, 36);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof o;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final o o2 = (o)o;
        boolean b3 = b2;
        if (this.h == o2.h) {
            b3 = b2;
            if (this.g == o2.g) {
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
        ((BaseBundle)bundle).putInt(a(0), 0);
        ((BaseBundle)bundle).putBoolean(a(1), this.g);
        ((BaseBundle)bundle).putBoolean(a(2), this.h);
        return bundle;
    }
}
