// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import z1.u;
import z1.z;
import android.view.MotionEvent;
import mg2.l;
import z1.v;

public final class PointerInteropFilter implements v
{
    public l<? super MotionEvent, Boolean> f;
    public z g;
    public boolean h;
    public final PointerInteropFilter$pointerInputFilter$1 i;
    
    public PointerInteropFilter() {
        this.i = new PointerInteropFilter$pointerInputFilter$1(this);
    }
    
    public final u I0() {
        return (u)this.i;
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "", "(Ljava/lang/String;I)V", "Unknown", "Dispatching", "NotDispatching", "ui_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum DispatchToViewState
    {
        private static final DispatchToViewState[] $VALUES;
        
        Dispatching, 
        NotDispatching, 
        Unknown;
        
        private static final DispatchToViewState[] $values() {
            return new DispatchToViewState[] { DispatchToViewState.Unknown, DispatchToViewState.Dispatching, DispatchToViewState.NotDispatching };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
