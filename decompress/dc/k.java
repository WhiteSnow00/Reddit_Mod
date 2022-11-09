// 
// Decompiled by Procyon v0.6.0
// 

package dc;

import java.io.IOException;
import xl0.d;
import java.util.Arrays;
import bd.c0;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.a;

public abstract class k extends e
{
    public byte[] j;
    public volatile boolean k;
    
    public k(final a a, final b b, final n n, final int n2, final Object o, byte[] f) {
        super(a, b, 3, n, n2, o, -9223372036854775807L, -9223372036854775807L);
        if (f == null) {
            f = c0.f;
        }
        this.j = f;
    }
    
    public final void a() {
        this.k = true;
    }
    
    public final void load() throws IOException {
        try {
            super.i.a(super.b);
            int n = 0;
            int n2 = 0;
            while (n != -1 && !this.k) {
                final byte[] j = this.j;
                if (j.length < n2 + 16384) {
                    this.j = Arrays.copyOf(j, j.length + 16384);
                }
                final int read = super.i.read(this.j, n2, 16384);
                if ((n = read) != -1) {
                    n2 += read;
                    n = read;
                }
            }
            if (!this.k) {
                ((hc.e.a)this).l = Arrays.copyOf(this.j, n2);
            }
        }
        finally {
            d.g((a)super.i);
        }
    }
}
