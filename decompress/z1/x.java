// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import androidx.compose.ui.input.pointer.PointerInteropFilter;
import pg2.j;
import zg2.l;

public final class x implements l<Boolean, j>
{
    public PointerInteropFilter f;
    
    public final Object invoke(final Object o) {
        final boolean booleanValue = (boolean)o;
        final PointerInteropFilter f = this.f;
        if (f != null) {
            f.h = booleanValue;
        }
        return j.a;
    }
}
