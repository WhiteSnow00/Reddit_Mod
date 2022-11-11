// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.coins.usecase;

import ej2.e0;
import ej2.f0;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.CoroutineDispatcher;
import ej2.g;
import java.util.List;
import yd.b;
import com.reddit.gold.model.PurchasePackages;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import kotlin.Metadata;
import sa0.a$a;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lsa0/a$a;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.domain.coins.usecase.FetchCoinsDataUseCase$fetchDataSkippingGoogle$2", f = "FetchCoinsDataUseCase.kt", l = { 93, 94, 95 }, m = "invokeSuspend")
final class FetchCoinsDataUseCase$fetchDataSkippingGoogle$2 extends SuspendLambda implements p<b0, c<? super a$a>, Object>
{
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public final /* synthetic */ FetchCoinsDataUseCase this$0;
    
    public FetchCoinsDataUseCase$fetchDataSkippingGoogle$2(final FetchCoinsDataUseCase this$0, final c<? super FetchCoinsDataUseCase$fetchDataSkippingGoogle$2> c) {
        this.this$0 = this$0;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final FetchCoinsDataUseCase$fetchDataSkippingGoogle$2 fetchCoinsDataUseCase$fetchDataSkippingGoogle$2 = new FetchCoinsDataUseCase$fetchDataSkippingGoogle$2(this.this$0, (c<? super FetchCoinsDataUseCase$fetchDataSkippingGoogle$2>)c);
        fetchCoinsDataUseCase$fetchDataSkippingGoogle$2.L$0 = l$0;
        return (c<j>)fetchCoinsDataUseCase$fetchDataSkippingGoogle$2;
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super a$a> c) {
        return ((FetchCoinsDataUseCase$fetchDataSkippingGoogle$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        boolean b = false;
        Object l$1 = null;
        PurchasePackages e = null;
        Object o2 = null;
        Label_0363: {
            Object instance;
            Object c;
            Object c2;
            if (label != 0) {
                if (label != 1) {
                    if (label == 2) {
                        b = this.Z$0;
                        l$1 = this.L$2;
                        e = (PurchasePackages)this.L$1;
                        o2 = this.L$0;
                        yd.b.k0(o);
                        break Label_0363;
                    }
                    if (label == 3) {
                        final boolean z$1 = this.Z$1;
                        final boolean z$2 = this.Z$0;
                        l$1 = this.L$1;
                        e = (PurchasePackages)this.L$0;
                        yd.b.k0(o);
                        final boolean booleanValue = z$1;
                        return new a$a(e, (String)null, (List)l$1, z$2, booleanValue, (List)o, FetchCoinsDataUseCase.g(this.this$0));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    instance = this.L$3;
                    e = (PurchasePackages)this.L$2;
                    c = this.L$1;
                    c2 = this.L$0;
                    yd.b.k0(o);
                }
            }
            else {
                yd.b.k0(o);
                final b0 b2 = (b0)this.L$0;
                final f0 c3 = g.c(b2, (CoroutineDispatcher)null, (CoroutineStart)null, (p)new FetchCoinsDataUseCase$fetchDataSkippingGoogle$2$deferredIsFreeAwardAvailable.FetchCoinsDataUseCase$fetchDataSkippingGoogle$2$deferredIsFreeAwardAvailable$1(this.this$0, (c)null), 3);
                c2 = g.c(b2, (CoroutineDispatcher)null, (CoroutineStart)null, (p)new FetchCoinsDataUseCase$fetchDataSkippingGoogle$2$deferredShowPointsPopup.FetchCoinsDataUseCase$fetchDataSkippingGoogle$2$deferredShowPointsPopup$1(this.this$0, (c)null), 3);
                c = g.c(b2, (CoroutineDispatcher)null, (CoroutineStart)null, (p)new FetchCoinsDataUseCase$fetchDataSkippingGoogle$2$deferredPointsBalances.FetchCoinsDataUseCase$fetchDataSkippingGoogle$2$deferredPointsBalances$1(this.this$0, (c)null), 3);
                e = PurchasePackages.e;
                instance = EmptyList.INSTANCE;
                this.L$0 = c2;
                this.L$1 = c;
                this.L$2 = e;
                this.L$3 = instance;
                this.label = 1;
                o = c3.s((c)this);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            b = (boolean)o;
            this.L$0 = c;
            this.L$1 = e;
            this.L$2 = instance;
            this.L$3 = null;
            this.Z$0 = b;
            this.label = 2;
            o = ((e0)c2).s((c)this);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            final List list = (List)instance;
            o2 = c;
            l$1 = list;
        }
        final boolean booleanValue = (boolean)o;
        this.L$0 = e;
        this.L$1 = l$1;
        this.L$2 = null;
        this.Z$0 = b;
        this.Z$1 = booleanValue;
        this.label = 3;
        o = ((e0)o2).s((c)this);
        if (o == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final boolean z$2 = b;
        return new a$a(e, (String)null, (List)l$1, z$2, booleanValue, (List)o, FetchCoinsDataUseCase.g(this.this$0));
    }
}
