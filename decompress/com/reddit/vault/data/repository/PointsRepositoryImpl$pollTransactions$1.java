// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.repository;

import zg2.k;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import vl.a;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.data.repository.PointsRepositoryImpl$pollTransactions$1", f = "PointsRepositoryImpl.kt", l = { 274, 276, 277 }, m = "invokeSuspend")
final class PointsRepositoryImpl$pollTransactions$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ long $pollRate;
    public int label;
    public final /* synthetic */ PointsRepositoryImpl this$0;
    
    public PointsRepositoryImpl$pollTransactions$1(final long $pollRate, final PointsRepositoryImpl this$0, final c<? super PointsRepositoryImpl$pollTransactions$1> c) {
        this.$pollRate = $pollRate;
        this.this$0 = this$0;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new PointsRepositoryImpl$pollTransactions$1(this.$pollRate, this.this$0, (c<? super PointsRepositoryImpl$pollTransactions$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((PointsRepositoryImpl$pollTransactions$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        Label_0176: {
            Label_0131: {
                if (label != 0) {
                    if (label != 1) {
                        if (label == 2) {
                            b.k0(o);
                            break Label_0131;
                        }
                        if (label == 3) {
                            b.k0(o);
                            break Label_0176;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        b.k0(o);
                    }
                }
                else {
                    b.k0(o);
                    final long $pollRate = this.$pollRate;
                    this.label = 1;
                    if (a.G($pollRate, (c)this) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                final PointsRepositoryImpl this$0 = this.this$0;
                this.label = 2;
                final k<Object>[] w = PointsRepositoryImpl.w;
                if (g.l((CoroutineContext)this$0.g.c(), (p)new PointsRepositoryImpl$fetchPointsInfo$2(this$0, null), (c)this) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final PointsRepositoryImpl this$2 = this.this$0;
            this.label = 3;
            final k<Object>[] w2 = PointsRepositoryImpl.w;
            if (g.l((CoroutineContext)this$2.g.c(), (p)new PointsRepositoryImpl$fetchTransactions$2(this$2, null), (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final PointsRepositoryImpl this$3 = this.this$0;
        final k<Object>[] w3 = PointsRepositoryImpl.w;
        this$3.v.setValue((Object)this$3, (k)PointsRepositoryImpl.w[0], (Object)Boolean.FALSE);
        PointsRepositoryImpl.o(this.this$0);
        return j.a;
    }
}
