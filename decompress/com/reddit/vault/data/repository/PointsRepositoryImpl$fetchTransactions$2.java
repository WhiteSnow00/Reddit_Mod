// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.repository;

import ej2.e0;
import ej2.z0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.CoroutineDispatcher;
import ej2.g;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import kotlin.Metadata;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.data.repository.PointsRepositoryImpl$fetchTransactions$2", f = "PointsRepositoryImpl.kt", l = { 361 }, m = "invokeSuspend")
final class PointsRepositoryImpl$fetchTransactions$2 extends SuspendLambda implements p<b0, c<? super Boolean>, Object>
{
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PointsRepositoryImpl this$0;
    
    public PointsRepositoryImpl$fetchTransactions$2(final PointsRepositoryImpl this$0, final c<? super PointsRepositoryImpl$fetchTransactions$2> c) {
        this.this$0 = this$0;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final PointsRepositoryImpl$fetchTransactions$2 pointsRepositoryImpl$fetchTransactions$2 = new PointsRepositoryImpl$fetchTransactions$2(this.this$0, (c<? super PointsRepositoryImpl$fetchTransactions$2>)c);
        pointsRepositoryImpl$fetchTransactions$2.L$0 = l$0;
        return (c<j>)pointsRepositoryImpl$fetchTransactions$2;
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super Boolean> c) {
        return ((PointsRepositoryImpl$fetchTransactions$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object s) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label == 1) {
                b.k0(s);
                return s;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.k0(s);
        final b0 b0 = (b0)this.L$0;
        final PointsRepositoryImpl this$0 = this.this$0;
        synchronized (this$0.t) {
            Object u = this$0.u;
            Object c = null;
            Label_0124: {
                if (u != null) {
                    if (!((z0)u).isActive()) {
                        u = null;
                    }
                    c = u;
                    if (u != null) {
                        break Label_0124;
                    }
                }
                s = new PointsRepositoryImpl$fetchTransactions$2$load$1$1.PointsRepositoryImpl$fetchTransactions$2$load$1$1$1(this$0, (c)null);
                c = g.c(b0, (CoroutineDispatcher)null, (CoroutineStart)null, (p)s, 3);
                this$0.u = (e0<Boolean>)c;
            }
            monitorexit(this$0.t);
            this.label = 1;
            if ((s = ((e0)c).s((c)this)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            return s;
        }
    }
}
