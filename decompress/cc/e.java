// 
// Decompiled by Procyon v0.6.0
// 

package cc;

import ac.h;
import com.google.android.exoplayer2.upstream.a;
import yc.q;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.Loader;

public abstract class e implements d
{
    public final long a;
    public final com.google.android.exoplayer2.upstream.b b;
    public final int c;
    public final n d;
    public final int e;
    public final Object f;
    public final long g;
    public final long h;
    public final q i;
    
    public e(final com.google.android.exoplayer2.upstream.a a, final com.google.android.exoplayer2.upstream.b b, final int c, final n d, final int e, final Object f, final long g, final long h) {
        this.i = new q(a);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.a = ac.h.d.getAndIncrement();
    }
}
