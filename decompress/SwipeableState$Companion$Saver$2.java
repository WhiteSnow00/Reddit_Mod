// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import sg2.e;
import l0.d;
import kotlin.Metadata;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "<anonymous>", "Landroidx/compose/material/SwipeableState;", "T", "", "it", "invoke", "(Ljava/lang/Object;)Landroidx/compose/material/SwipeableState;" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class SwipeableState$Companion$Saver$2 extends Lambda implements l<Object, SwipeableState<Object>>
{
    public final /* synthetic */ l0.d<Float> $animationSpec;
    public final /* synthetic */ l<Object, Boolean> $confirmStateChange;
    
    public SwipeableState$Companion$Saver$2(final l0.d<Float> $animationSpec, final l<Object, Boolean> $confirmStateChange) {
        this.$animationSpec = $animationSpec;
        this.$confirmStateChange = $confirmStateChange;
        super(1);
    }
    
    public final SwipeableState<Object> invoke(final Object o) {
        e.f(o, "it");
        return new SwipeableState<Object>(o, this.$animationSpec, this.$confirmStateChange);
    }
}
