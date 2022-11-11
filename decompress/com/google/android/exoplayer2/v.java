// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import ad.c0;
import android.os.Bundle;
import ad.d0;

public final class v implements f
{
    public static final v i;
    public final float f;
    public final float g;
    public final int h;
    
    static {
        i = new v(1.0f, 1.0f);
    }
    
    public v(final float f, final float g) {
        final boolean b = true;
        d0.c(f > 0.0f);
        d0.c(g > 0.0f && b);
        this.f = f;
        this.g = g;
        this.h = Math.round(f * 1000.0f);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && v.class == o.getClass()) {
            final v v = (v)o;
            if (this.f != v.f || this.g != v.g) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToRawIntBits(this.g) + (Float.floatToRawIntBits(this.f) + 527) * 31;
    }
    
    @Override
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        bundle.putFloat(Integer.toString(0, 36), this.f);
        bundle.putFloat(Integer.toString(1, 36), this.g);
        return bundle;
    }
    
    @Override
    public final String toString() {
        return c0.n("PlaybackParameters(speed=%.2f, pitch=%.2f)", this.f, this.g);
    }
}
