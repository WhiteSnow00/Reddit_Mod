// 
// Decompiled by Procyon v0.6.0
// 

package dc;

import bd.d0;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.upstream.b;

public abstract class a extends m
{
    public final long k;
    public final long l;
    public c m;
    public int[] n;
    
    public a(final com.google.android.exoplayer2.upstream.a a, final b b, final n n, final int n2, final Object o, final long n3, final long n4, final long k, final long l, final long n5) {
        super(a, b, n, n2, o, n3, n4, n5);
        this.k = k;
        this.l = l;
    }
    
    public final int d(final int n) {
        final int[] n2 = this.n;
        d0.g(n2);
        return n2[n];
    }
}
