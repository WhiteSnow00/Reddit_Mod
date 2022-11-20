// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.w$c;
import bd.n$a;

public final class q implements n$a
{
    public final int f;
    public final d0 g;
    
    public q(final d0 g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void invoke(final Object o) {
        switch (this.f) {
            default: {
                final d0 g = this.g;
                ((w$c)o).onPlayerStateChanged(g.l, g.e);
                return;
            }
            case 1: {
                ((w$c)o).onPlayerError((PlaybackException)this.g.f);
                return;
            }
            case 0: {
                ((w$c)o).onPlaybackParametersChanged(this.g.n);
            }
        }
    }
}
