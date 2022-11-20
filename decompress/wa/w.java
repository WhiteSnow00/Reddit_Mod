// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.w$c;
import bd.n$a;

public final class w implements n$a
{
    public final boolean f;
    
    public w(final boolean f) {
        this.f = f;
    }
    
    public final void invoke(final Object o) {
        ((w$c)o).onSkipSilenceEnabledChanged(this.f);
    }
}
