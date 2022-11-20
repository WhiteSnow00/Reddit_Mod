// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import com.google.android.exoplayer2.w$c;
import bd.n$a;

public final class v implements n$a
{
    public final int f;
    public final boolean g;
    
    public v(final int f, final boolean g) {
        this.f = f;
        this.g = g;
    }
    
    public final void invoke(final Object o) {
        ((w$c)o).onDeviceVolumeChanged(this.f, this.g);
    }
}
