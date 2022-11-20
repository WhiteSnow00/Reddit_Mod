// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.reddit.video.creation.widgets.edit.view.EditUGCFragment;
import af2.d0;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.w$c;
import xa.b$a;
import xa.b;
import af2.f0;
import bd.n$a;

public final class s implements n$a, f0
{
    public final int f;
    public final int g;
    public final Object h;
    
    public s(final Object h, final int g, final int f) {
        this.f = f;
        this.h = h;
        this.g = g;
    }
    
    public final void invoke(final Object o) {
        switch (this.f) {
            default: {
                ((b)o).onPlaybackStateChanged((b$a)this.h, this.g);
                return;
            }
            case 0: {
                ((w$c)o).onMediaItemTransition((q)this.h, this.g);
            }
        }
    }
    
    public final void y(final d0 d0) {
        EditUGCFragment.u0((EditUGCFragment)this.h, this.g, d0);
    }
}
