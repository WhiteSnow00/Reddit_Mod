// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.coins.usecase;

import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import kotlin.Metadata;
import ff2.a;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lff2/a;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.domain.coins.usecase.UpdateCoinsBalanceUseCase$execute$3", f = "UpdateCoinsBalanceUseCase.kt", l = {}, m = "invokeSuspend")
final class UpdateCoinsBalanceUseCase$execute$3 extends SuspendLambda implements p<b0, c<? super a>, Object>
{
    public final /* synthetic */ Integer $coins;
    public int label;
    public final /* synthetic */ UpdateCoinsBalanceUseCase this$0;
    
    public UpdateCoinsBalanceUseCase$execute$3(final Integer $coins, final UpdateCoinsBalanceUseCase this$0, final c<? super UpdateCoinsBalanceUseCase$execute$3> c) {
        this.$coins = $coins;
        this.this$0 = this$0;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new UpdateCoinsBalanceUseCase$execute$3(this.$coins, this.this$0, (c<? super UpdateCoinsBalanceUseCase$execute$3>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super a> c) {
        return ((UpdateCoinsBalanceUseCase$execute$3)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.k0(o);
            final Integer $coins = this.$coins;
            a a;
            if ($coins != null) {
                a = this.this$0.a.a($coins.intValue());
            }
            else {
                a = null;
            }
            return a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
