// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.k1;
import z0.o0;
import ah2.f;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class TouchTargetKt$minimumTouchTargetSize$2 extends Lambda implements q<d, z0.d, Integer, d>
{
    public static final TouchTargetKt$minimumTouchTargetSize$2 INSTANCE;
    
    static {
        INSTANCE = new TouchTargetKt$minimumTouchTargetSize$2();
    }
    
    public TouchTargetKt$minimumTouchTargetSize$2() {
        super(3);
    }
    
    public final d invoke(final d d, final z0.d d2, final int n) {
        f.f((Object)d, "$this$composed");
        d2.A(1220403677);
        Object f;
        if (d2.t(TouchTargetKt.a)) {
            f = new MinimumTouchTargetModifier(((k1)d2.t(CompositionLocalsKt.o)).e());
        }
        else {
            f = d.a.f;
        }
        d2.I();
        return (d)f;
    }
}
