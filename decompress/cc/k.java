// 
// Decompiled by Procyon v0.6.0
// 

package cc;

import java.io.IOException;
import gc.e$a;
import java.util.Arrays;
import ad.c0;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.a;

public abstract class k extends e
{
    public byte[] j;
    public volatile boolean k;
    
    public k(final com.google.android.exoplayer2.upstream.a a, final com.google.android.exoplayer2.upstream.b b, final n n, final int n2, final Object o, final byte[] array) {
        super(a, b, 3, n, n2, o, -9223372036854775807L, -9223372036854775807L);
        byte[] f;
        if (array == null) {
            f = c0.f;
        }
        else {
            f = array;
        }
        this.j = f;
    }
    
    @Override
    public final void a() {
        this.k = true;
    }
    
    @Override
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
                ((e$a)this).l = Arrays.copyOf(this.j, n2);
            }
        }
        finally {
            lq0.k.x((com.google.android.exoplayer2.upstream.a)super.i);
        }
    }
}
