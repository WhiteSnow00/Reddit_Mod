// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import z0.h0;
import z0.n0;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@ug2.c(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = { 153 }, m = "invokeSuspend")
final class SnapshotStateKt__ProduceStateKt$produceState$3 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ p<n0<Object>, c<? super j>, Object> $producer;
    public final /* synthetic */ h0<Object> $result;
    private /* synthetic */ Object L$0;
    public int label;
    
    public SnapshotStateKt__ProduceStateKt$produceState$3(final p<? super n0<Object>, ? super c<? super j>, ?> $producer, final h0<Object> $result, final c<? super SnapshotStateKt__ProduceStateKt$produceState$3> c) {
        this.$producer = (p<n0<Object>, c<? super j>, Object>)$producer;
        this.$result = $result;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final SnapshotStateKt__ProduceStateKt$produceState$3 snapshotStateKt__ProduceStateKt$produceState$3 = new SnapshotStateKt__ProduceStateKt$produceState$3(this.$producer, this.$result, (c<? super SnapshotStateKt__ProduceStateKt$produceState$3>)c);
        snapshotStateKt__ProduceStateKt$produceState$3.L$0 = l$0;
        return (c<j>)snapshotStateKt__ProduceStateKt$produceState$3;
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$3)this.create(b0, c)).invokeSuspend(j.a);
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
            final p<n0<Object>, c<? super j>, Object> $producer = this.$producer;
            final androidx.compose.runtime.c c = new androidx.compose.runtime.c(this.$result, b0.Kx());
            this.label = 1;
            if ($producer.invoke((Object)c, (Object)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
