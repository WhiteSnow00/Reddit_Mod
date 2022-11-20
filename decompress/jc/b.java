// 
// Decompiled by Procyon v0.6.0
// 

package jc;

import zb.h;
import zb.i;
import com.google.android.exoplayer2.upstream.i$a;
import com.google.android.exoplayer2.source.hls.playlist.c;
import zb.m;
import java.util.List;

public final class b implements d
{
    public final d a;
    public final List<m> b;
    
    public b(final d a, final List<m> b) {
        this.a = a;
        this.b = b;
    }
    
    public final i$a<jc.c> a(final com.google.android.exoplayer2.source.hls.playlist.d d, final c c) {
        return (i$a<jc.c>)new i((com.google.android.exoplayer2.upstream.i$a<? extends h>)this.a.a(d, c), this.b);
    }
    
    public final i$a<jc.c> b() {
        return (i$a<jc.c>)new i((com.google.android.exoplayer2.upstream.i$a<? extends h>)this.a.b(), this.b);
    }
}
