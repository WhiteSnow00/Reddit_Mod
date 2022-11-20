// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.w$c;
import bd.n$a;

public final class u implements n$a
{
    public final boolean f;
    
    public u(final boolean f) {
        this.f = f;
    }
    
    public final void invoke(final Object o) {
        ((w$c)o).onShuffleModeEnabledChanged(this.f);
    }
}
