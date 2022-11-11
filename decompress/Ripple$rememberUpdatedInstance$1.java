// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material.ripple;

import pj2.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o0.i;
import y0.h;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@ug2.c(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = { 356 }, m = "invokeSuspend")
final class Ripple$rememberUpdatedInstance$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ h $instance;
    public final /* synthetic */ i $interactionSource;
    private /* synthetic */ Object L$0;
    public int label;
    
    public Ripple$rememberUpdatedInstance$1(final i $interactionSource, final h $instance, final c<? super Ripple$rememberUpdatedInstance$1> c) {
        this.$interactionSource = $interactionSource;
        this.$instance = $instance;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.$interactionSource, this.$instance, (c<? super Ripple$rememberUpdatedInstance$1>)c);
        ripple$rememberUpdatedInstance$1.L$0 = l$0;
        return (c<j>)ripple$rememberUpdatedInstance$1;
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((Ripple$rememberUpdatedInstance$1)this.create(b0, c)).invokeSuspend(j.a);
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
            final b0 b0 = (b0)this.L$0;
            final kotlinx.coroutines.flow.h c = this.$interactionSource.c();
            final Ripple$rememberUpdatedInstance$1$a ripple$rememberUpdatedInstance$1$a = new Ripple$rememberUpdatedInstance$1$a(this.$instance, b0);
            this.label = 1;
            c.getClass();
            if (kotlinx.coroutines.flow.h.m(c, (f)ripple$rememberUpdatedInstance$1$a, (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
