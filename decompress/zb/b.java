// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import com.google.android.exoplayer2.offline.DownloadRequest;

public final class b
{
    public final DownloadRequest a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final e h;
    
    public b(final DownloadRequest downloadRequest, final int n, final long n2, final long n3, final int n4) {
        this(downloadRequest, n, n2, n3, -1L, n4, 0, new e());
    }
    
    public b(final DownloadRequest a, final int b, final long c, final long d, final long e, final int f, final int g, final e h) {
        h.getClass();
        final boolean b2 = true;
        ah0.b.C(g == 0 == (b != 4));
        if (f != 0) {
            ah0.b.C(b != 2 && b != 0 && b2);
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
}
