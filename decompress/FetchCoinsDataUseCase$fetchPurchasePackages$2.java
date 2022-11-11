// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.coins.usecase;

import ff2.c0;
import kotlinx.coroutines.rx2.d;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import kotlin.Metadata;
import com.reddit.gold.model.PurchasePackages;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lcom/reddit/gold/model/PurchasePackages;", "kotlin.jvm.PlatformType", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.domain.coins.usecase.FetchCoinsDataUseCase$fetchPurchasePackages$2", f = "FetchCoinsDataUseCase.kt", l = { 129 }, m = "invokeSuspend")
final class FetchCoinsDataUseCase$fetchPurchasePackages$2 extends SuspendLambda implements p<b0, c<? super PurchasePackages>, Object>
{
    public final /* synthetic */ String $correlationId;
    public int label;
    public final /* synthetic */ FetchCoinsDataUseCase this$0;
    
    public FetchCoinsDataUseCase$fetchPurchasePackages$2(final FetchCoinsDataUseCase this$0, final String $correlationId, final c<? super FetchCoinsDataUseCase$fetchPurchasePackages$2> c) {
        this.this$0 = this$0;
        this.$correlationId = $correlationId;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new FetchCoinsDataUseCase$fetchPurchasePackages$2(this.this$0, this.$correlationId, (c<? super FetchCoinsDataUseCase$fetchPurchasePackages$2>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super PurchasePackages> c) {
        return ((FetchCoinsDataUseCase$fetchPurchasePackages$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object b) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(b);
        }
        else {
            b.k0(b);
            final c0 a = this.this$0.a.a(this.$correlationId);
            this.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(a, (c)this)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return b;
    }
}
