// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Arrays;
import ra.n;
import com.google.android.exoplayer2.f;

public final class b implements f
{
    public static final n k;
    public final int f;
    public final int g;
    public final int h;
    public final byte[] i;
    public int j;
    
    static {
        k = new n(11);
    }
    
    public b(final int f, final int g, final int h, final byte[] i) {
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
        if (o != null && b.class == o.getClass()) {
            final b b2 = (b)o;
            if (this.f != b2.f || this.g != b2.g || this.h != b2.h || !Arrays.equals(this.i, b2.i)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.j == 0) {
            this.j = Arrays.hashCode(this.i) + (((527 + this.f) * 31 + this.g) * 31 + this.h) * 31;
        }
        return this.j;
    }
    
    @Override
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt(a(0), this.f);
        ((BaseBundle)bundle).putInt(a(1), this.g);
        ((BaseBundle)bundle).putInt(a(2), this.h);
        bundle.putByteArray(a(3), this.i);
        return bundle;
    }
    
    @Override
    public final String toString() {
        final int f = this.f;
        final int g = this.g;
        final int h = this.h;
        final boolean b = this.i != null;
        final StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(f);
        sb.append(", ");
        sb.append(g);
        sb.append(", ");
        sb.append(h);
        sb.append(", ");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
