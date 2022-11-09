// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import mj2.g;
import mj2.b0;
import ah2.f;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pj2.e;
import kotlin.coroutines.CoroutineContext;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import z0.n0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@ug2.c(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = { 65, 66 }, m = "invokeSuspend")
final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1 extends SuspendLambda implements p<n0<Object>, c<? super j>, Object>
{
    public final /* synthetic */ CoroutineContext $context;
    public final /* synthetic */ e<Object> $this_collectAsState;
    private /* synthetic */ Object L$0;
    public int label;
    
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1(final CoroutineContext $context, final e<Object> $this_collectAsState, final c<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1> c) {
        this.$context = $context;
        this.$this_collectAsState = $this_collectAsState;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.$context, this.$this_collectAsState, (c<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1>)c);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.L$0 = l$0;
        return (c<j>)snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }
    
    public final Object invoke(final n0<Object> n0, final c<? super j> c) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1)this.create(n0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1 && label != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(o);
        }
        else {
            aj2.c.Q0(o);
            final n0 n0 = (n0)this.L$0;
            if (f.a((Object)this.$context, (Object)EmptyCoroutineContext.INSTANCE)) {
                final e<Object> $this_collectAsState = this.$this_collectAsState;
                final SnapshotStateKt__SnapshotFlowKt$collectAsState$1$a snapshotStateKt__SnapshotFlowKt$collectAsState$1$a = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$a(n0);
                this.label = 1;
                if ($this_collectAsState.a((pj2.f)snapshotStateKt__SnapshotFlowKt$collectAsState$1$a, (c)this) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            else {
                final CoroutineContext $context = this.$context;
                final p<b0, c<? super j>, Object> p = (p<b0, c<? super j>, Object>)new p<b0, c<? super j>, Object>() {
                    public final /* synthetic */ n0<Object> $$this$produceState;
                    public final /* synthetic */ e<Object> $this_collectAsState;
                    public int label;
                    
                    public final c<j> create(final Object o, final c<?> c) {
                        return (c<j>)new p<b0, c<? super j>, Object>() {
                            public final /* synthetic */ n0<Object> $$this$produceState = this.$$this$produceState;
                            public final /* synthetic */ e<Object> $this_collectAsState = this.$this_collectAsState;
                            public int label;
                        };
                    }
                    
                    public final Object invoke(final b0 b0, final c<? super j> c) {
                        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2)this.create(b0, c)).invokeSuspend(j.a);
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
                            final e<Object> $this_collectAsState = this.$this_collectAsState;
                            final SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2$a snapshotStateKt__SnapshotFlowKt$collectAsState$1$2$a = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2$a((n0)this.$$this$produceState);
                            this.label = 1;
                            if ($this_collectAsState.a((pj2.f)snapshotStateKt__SnapshotFlowKt$collectAsState$1$2$a, (c)this) == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                        }
                        return j.a;
                    }
                };
                this.label = 2;
                if (g.l($context, (p)p, (c)this) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
        }
        return j.a;
    }
}
