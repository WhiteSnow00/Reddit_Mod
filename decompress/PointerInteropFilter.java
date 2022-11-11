// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.pointer;

import z1.t;
import z1.x;
import android.view.MotionEvent;
import zg2.l;
import z1.u;

public final class PointerInteropFilter implements u
{
    public l<? super MotionEvent, Boolean> f;
    public x g;
    public boolean h;
    public final PointerInteropFilter$pointerInputFilter$1 i;
    
    public PointerInteropFilter() {
        this.i = new PointerInteropFilter$pointerInputFilter$1(this);
    }
    
    @Override
    public final t H0() {
        return (t)this.i;
    }
}
