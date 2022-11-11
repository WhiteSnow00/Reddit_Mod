// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import z0.e1;
import kotlin.Metadata;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ScrollableStateKt$rememberScrollableState$1$1 extends Lambda implements l<Float, Float>
{
    public final /* synthetic */ e1<l<Float, Float>> $lambdaState;
    
    public ScrollableStateKt$rememberScrollableState$1$1(final e1<? extends l<? super Float, Float>> $lambdaState) {
        this.$lambdaState = (e1<l<Float, Float>>)$lambdaState;
        super(1);
    }
    
    public final Float invoke(final float n) {
        return ((l)this.$lambdaState.getValue()).invoke(n);
    }
}
