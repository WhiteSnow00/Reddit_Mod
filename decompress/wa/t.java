// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.w$c;
import bd.n$a;

public final class t implements n$a
{
    public final float f;
    
    public t(final float f) {
        this.f = f;
    }
    
    public final void invoke(final Object o) {
        ((w$c)o).onVolumeChanged(this.f);
    }
}
