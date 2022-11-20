// 
// Decompiled by Procyon v0.6.0
// 

package kc;

import java.util.Arrays;
import com.google.android.play.core.assetpacks.i;
import dg.p0;

public final class g implements p0
{
    public int f;
    public Object g;
    
    public g() {
        this.g = new long[32];
    }
    
    public g(final int f, final o g) {
        this.f = f;
        this.g = g;
    }
    
    public g(final i g, final int f) {
        this.g = g;
        this.f = f;
    }
    
    public final void a(final long n) {
        final int f = this.f;
        final Object g = this.g;
        if (f == ((long[])g).length) {
            this.g = Arrays.copyOf((long[])g, f * 2);
        }
        ((long[])this.g)[this.f++] = n;
    }
    
    public final long b(final int n) {
        if (n >= 0 && n < this.f) {
            return ((long[])this.g)[n];
        }
        final int f = this.f;
        final StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(n);
        sb.append(", size is ");
        sb.append(f);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public final Object zza() {
        ((i)this.g).c(this.f).c.d = 5;
        return null;
    }
}
