// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import mg2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = { 174 }, m = "consumeUntilUp")
final class TapGestureDetectorKt$consumeUntilUp$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    
    public TapGestureDetectorKt$consumeUntilUp$1(final lg2.c<? super TapGestureDetectorKt$consumeUntilUp$1> c) {
        super((lg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.a((z1.c)null, (lg2.c)this);
    }
}
