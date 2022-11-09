// 
// Decompiled by Procyon v0.6.0
// 

package jc;

import zb.j;
import zb.k;
import com.google.android.exoplayer2.upstream.i$a;
import com.google.android.exoplayer2.source.hls.playlist.c;
import zb.o;
import java.util.List;

public final class b implements d
{
    public final d a;
    public final List<o> b;
    
    public b(final d a, final List<o> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final i$a<jc.c> a(final com.google.android.exoplayer2.source.hls.playlist.d d, final c c) {
        return (i$a<jc.c>)new k(this.a.a(d, c), this.b);
    }
    
    @Override
    public final i$a<jc.c> b() {
        return (i$a<jc.c>)new k(this.a.b(), this.b);
    }
}
