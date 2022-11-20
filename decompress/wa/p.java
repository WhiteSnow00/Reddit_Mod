// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.k;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.w$c;
import bd.n$a;

public final class p implements n$a
{
    public final int f;
    public final d0 g;
    
    public p(final d0 g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void invoke(final Object o) {
        switch (this.f) {
            default: {
                final d0 g = this.g;
                final w$c w$c = (w$c)o;
                w$c.onLoadingChanged(g.g);
                w$c.onIsLoadingChanged(g.g);
                return;
            }
            case 1: {
                ((w$c)o).onPlayerErrorChanged((PlaybackException)this.g.f);
                return;
            }
            case 0: {
                ((w$c)o).onIsPlayingChanged(k.l0(this.g));
            }
        }
    }
}
