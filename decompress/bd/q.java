// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.exoplayer2.f;

public final class q implements f
{
    public static final q j;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    
    static {
        j = new q(0, 1.0f, 0, 0);
    }
    
    public q(final int f, final float i, final int g, final int h) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static String a(final int n) {
        return Integer.toString(n, 36);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof q) {
            final q q = (q)o;
            if (this.f != q.f || this.g != q.g || this.h != q.h || this.i != q.i) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToRawIntBits(this.i) + (((217 + this.f) * 31 + this.g) * 31 + this.h) * 31;
    }
    
    @Override
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt(a(0), this.f);
        ((BaseBundle)bundle).putInt(a(1), this.g);
        ((BaseBundle)bundle).putInt(a(2), this.h);
        bundle.putFloat(a(3), this.i);
        return bundle;
    }
}
