// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.w$c;
import xa.b$a;
import xa.b;
import bd.n$a;

public final class o implements n$a
{
    public final int f;
    public final int g;
    public final Object h;
    
    public o(final Object h, final int g, final int f) {
        this.f = f;
        this.h = h;
        this.g = g;
    }
    
    public final void invoke(final Object o) {
        switch (this.f) {
            default: {
                ((b)o).onPlaybackSuppressionReasonChanged((b$a)this.h, this.g);
                return;
            }
            case 0: {
                ((w$c)o).onPlayWhenReadyChanged(((d0)this.h).l, this.g);
            }
        }
    }
}
