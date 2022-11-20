// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.n;

public interface f0
{
    default int l(final int n, final int n2, final int n3) {
        return n | n2 | n3 | 0x0 | 0x80;
    }
    
    int a(final n p0) throws ExoPlaybackException;
    
    String getName();
    
    int w() throws ExoPlaybackException;
}
