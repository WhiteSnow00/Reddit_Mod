// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import v0.l;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import z1.v;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lz1/v;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1", f = "TextFieldGestureModifiers.kt", l = { 35 }, m = "invokeSuspend")
final class TextFieldGestureModifiersKt$longPressDragGestureFilter$1 extends SuspendLambda implements p<v, c<? super j>, Object>
{
    public final /* synthetic */ l $observer;
    private /* synthetic */ Object L$0;
    public int label;
    
    public TextFieldGestureModifiersKt$longPressDragGestureFilter$1(final l $observer, final c<? super TextFieldGestureModifiersKt$longPressDragGestureFilter$1> c) {
        this.$observer = $observer;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final TextFieldGestureModifiersKt$longPressDragGestureFilter$1 textFieldGestureModifiersKt$longPressDragGestureFilter$1 = new TextFieldGestureModifiersKt$longPressDragGestureFilter$1(this.$observer, (c<? super TextFieldGestureModifiersKt$longPressDragGestureFilter$1>)c);
        textFieldGestureModifiersKt$longPressDragGestureFilter$1.L$0 = l$0;
        return (c<j>)textFieldGestureModifiersKt$longPressDragGestureFilter$1;
    }
    
    public final Object invoke(final v v, final c<? super j> c) {
        return ((TextFieldGestureModifiersKt$longPressDragGestureFilter$1)this.create(v, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(o);
        }
        else {
            aj2.c.Q0(o);
            final v v = (v)this.L$0;
            final l $observer = this.$observer;
            this.label = 1;
            if (LongPressTextDragObserverKt.b(v, $observer, (c<? super j>)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
