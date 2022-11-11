// 
// Decompiled by Procyon v0.6.0
// 

package cc;

import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.a;

public abstract class m extends e
{
    public final long j;
    
    public m(final com.google.android.exoplayer2.upstream.a a, final com.google.android.exoplayer2.upstream.b b, final n n, final int n2, final Object o, final long n3, final long n4, final long j) {
        super(a, b, 1, n, n2, o, n3, n4);
        n.getClass();
        this.j = j;
    }
    
    public long b() {
        final long j = this.j;
        long n = -1L;
        if (j != -1L) {
            n = 1L + j;
        }
        return n;
    }
    
    public abstract boolean c();
}
