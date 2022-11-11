// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import z0.h0;
import kotlin.Metadata;
import hg2.j;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 5, 1 }, xi = 48)
final class ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1 extends Lambda implements a<j>
{
    public final /* synthetic */ ConstraintSetForInlineDsl $constraintSet;
    public final /* synthetic */ h0<Boolean> $remeasureRequesterState;
    
    public ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1(final h0<Boolean> $remeasureRequesterState, final ConstraintSetForInlineDsl $constraintSet) {
        this.$remeasureRequesterState = $remeasureRequesterState;
        this.$constraintSet = $constraintSet;
        super(0);
    }
    
    public final void invoke() {
        final h0<Boolean> $remeasureRequesterState = this.$remeasureRequesterState;
        $remeasureRequesterState.setValue((Object)((boolean)$remeasureRequesterState.getValue() ^ true));
        this.$constraintSet.i = true;
    }
}
