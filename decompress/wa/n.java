// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.w$c;
import bd.n$a;

public final class n implements n$a
{
    public final d0 f;
    public final int g;
    
    public n(final d0 f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    public final void invoke(final Object o) {
        ((w$c)o).onTimelineChanged(this.f.a, this.g);
    }
}
