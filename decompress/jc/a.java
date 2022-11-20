// 
// Decompiled by Procyon v0.6.0
// 

package jc;

import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.upstream.i$a;
import com.google.android.exoplayer2.source.hls.playlist.c;

public final class a implements d
{
    public final i$a<jc.c> a(final com.google.android.exoplayer2.source.hls.playlist.d d, final c c) {
        return (i$a<jc.c>)new HlsPlaylistParser(d, c);
    }
    
    public final i$a<jc.c> b() {
        return (i$a<jc.c>)new HlsPlaylistParser();
    }
}
