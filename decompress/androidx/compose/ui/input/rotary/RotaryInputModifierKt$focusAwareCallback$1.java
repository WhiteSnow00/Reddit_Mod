// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.rotary;

import ah2.f;
import kotlin.Metadata;
import w1.a;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "Lw1/a;", "e", "", "invoke", "(Lw1/a;)Ljava/lang/Boolean;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class RotaryInputModifierKt$focusAwareCallback$1 extends Lambda implements l<a, Boolean>
{
    public final /* synthetic */ l<b2.a, Boolean> $this_focusAwareCallback;
    
    public RotaryInputModifierKt$focusAwareCallback$1(final l<? super b2.a, Boolean> $this_focusAwareCallback) {
        this.$this_focusAwareCallback = (l<b2.a, Boolean>)$this_focusAwareCallback;
        super(1);
    }
    
    public final Boolean invoke(final a a) {
        f.f((Object)a, "e");
        if (a instanceof b2.a) {
            return (Boolean)this.$this_focusAwareCallback.invoke((Object)a);
        }
        throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}
