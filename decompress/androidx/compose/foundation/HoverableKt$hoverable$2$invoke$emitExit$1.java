// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import o0.j;
import z0.h0;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@c(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = { 70 }, m = "invoke$emitExit")
final class HoverableKt$hoverable$2$invoke$emitExit$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    
    public HoverableKt$hoverable$2$invoke$emitExit$1(final tg2.c<? super HoverableKt$hoverable$2$invoke$emitExit$1> c) {
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return HoverableKt$hoverable$2.access$invoke$emitExit(null, null, (tg2.c)this);
    }
}
