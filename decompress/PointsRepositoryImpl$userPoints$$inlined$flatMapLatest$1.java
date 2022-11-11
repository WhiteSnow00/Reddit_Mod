// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.repository;

import hj2.g;
import hj2.e;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import rg2.a;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import java.math.BigInteger;
import java.util.Map;
import hj2.f;
import rg2.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@" }, d2 = { "T", "R", "Lhj2/f;", "it", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.data.repository.PointsRepositoryImpl$userPoints$$inlined$flatMapLatest$1", f = "PointsRepositoryImpl.kt", l = { 216 }, m = "invokeSuspend")
public final class PointsRepositoryImpl$userPoints$$inlined$flatMapLatest$1 extends SuspendLambda implements q<f<? super Map<String, ? extends BigInteger>>, Boolean, c<? super j>, Object>
{
    public final /* synthetic */ a $fetchPoints$inlined;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    
    public PointsRepositoryImpl$userPoints$$inlined$flatMapLatest$1(final c c, final a $fetchPoints$inlined) {
        this.$fetchPoints$inlined = $fetchPoints$inlined;
        super(3, (c<Object>)c);
    }
    
    @Override
    public final Object invoke(final f<? super Map<String, ? extends BigInteger>> l$0, final Boolean l$2, final c<? super j> c) {
        final PointsRepositoryImpl$userPoints$$inlined$flatMapLatest$1 pointsRepositoryImpl$userPoints$$inlined$flatMapLatest$1 = new PointsRepositoryImpl$userPoints$$inlined$flatMapLatest$1(c, this.$fetchPoints$inlined);
        pointsRepositoryImpl$userPoints$$inlined$flatMapLatest$1.L$0 = l$0;
        pointsRepositoryImpl$userPoints$$inlined$flatMapLatest$1.L$1 = l$2;
        return pointsRepositoryImpl$userPoints$$inlined$flatMapLatest$1.invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(o);
        }
        else {
            b.k0(o);
            final f f = (f)this.L$0;
            Object o2;
            if (this.L$1) {
                o2 = this.$fetchPoints$inlined.invoke();
            }
            else {
                o2 = new g((Object)kotlin.collections.c.V0());
            }
            this.label = 1;
            if (kotlinx.coroutines.flow.a.u((c)this, (e)o2, f) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
