// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.w$c;
import bd.n$a;

public final class m implements n$a
{
    public final int f;
    public final int g;
    
    public m(final int f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    public final void invoke(final Object o) {
        ((w$c)o).onSurfaceSizeChanged(this.f, this.g);
    }
}
