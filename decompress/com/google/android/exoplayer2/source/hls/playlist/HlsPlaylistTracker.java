// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.upstream.h;
import java.io.IOException;
import com.google.android.exoplayer2.source.j;
import android.net.Uri;

public interface HlsPlaylistTracker
{
    void a(final a p0);
    
    long b();
    
    void c(final Uri p0, final j.a p1, final b p2);
    
    void d(final Uri p0) throws IOException;
    
    d e();
    
    void f(final Uri p0);
    
    void g(final a p0);
    
    boolean h(final Uri p0);
    
    boolean i(final Uri p0, final long p1);
    
    boolean isLive();
    
    void j() throws IOException;
    
    c k(final Uri p0, final boolean p1);
    
    void stop();
    
    public static final class PlaylistResetException extends IOException
    {
        public final Uri url;
        
        public PlaylistResetException(final Uri url) {
            this.url = url;
        }
    }
    
    public static final class PlaylistStuckException extends IOException
    {
        public final Uri url;
        
        public PlaylistStuckException(final Uri url) {
            this.url = url;
        }
    }
    
    public interface a
    {
        void b();
        
        boolean h(final Uri p0, final h.c p1, final boolean p2);
    }
    
    public interface b
    {
    }
}
