// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.coins.usecase;

import com.reddit.billing.PurchaseParams;
import com.reddit.billing.PurchaseParams$Gold;
import com.reddit.billing.PurchaseParams$Gold$ContentType;
import ta0.a$c;
import ta0.a$b;
import ta0.a$d;
import com.reddit.events.gold.GoldAnalytics;
import yd.b;
import tz.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ta0.a;
import hj2.f;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@" }, d2 = { "Lhj2/f;", "Lta0/a;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.domain.coins.usecase.BuyCoinsUseCase$showPurchaseFlow$1", f = "BuyCoinsUseCase.kt", l = { 52, 53, 53, 57, 61 }, m = "invokeSuspend")
final class BuyCoinsUseCase$showPurchaseFlow$1 extends SuspendLambda implements p<f<? super a>, c<? super j>, Object>
{
    public final /* synthetic */ a$a $params;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ com.reddit.domain.coins.usecase.a this$0;
    
    public BuyCoinsUseCase$showPurchaseFlow$1(final a$a $params, final com.reddit.domain.coins.usecase.a this$0, final c<? super BuyCoinsUseCase$showPurchaseFlow$1> c) {
        this.$params = $params;
        this.this$0 = this$0;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final BuyCoinsUseCase$showPurchaseFlow$1 buyCoinsUseCase$showPurchaseFlow$1 = new BuyCoinsUseCase$showPurchaseFlow$1(this.$params, this.this$0, (c<? super BuyCoinsUseCase$showPurchaseFlow$1>)c);
        buyCoinsUseCase$showPurchaseFlow$1.L$0 = l$0;
        return (c<j>)buyCoinsUseCase$showPurchaseFlow$1;
    }
    
    @Override
    public final Object invoke(final f<? super a> f, final c<? super j> c) {
        return ((BuyCoinsUseCase$showPurchaseFlow$1)this.create(f, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object l$3) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        kr0.f a = null;
        f l$5 = null;
        String s2 = null;
        e e3 = null;
        Label_0496: {
            Object l$6 = null;
            e e2 = null;
            Label_0463: {
                e l$4 = null;
                Label_0402: {
                    a$a $params;
                    com.reddit.domain.coins.usecase.a this$0;
                    e d;
                    f f2;
                    if (label != 0) {
                        if (label != 1) {
                            if (label == 2) {
                                l$4 = (e)this.L$2;
                                a = (kr0.f)this.L$1;
                                l$5 = (f)this.L$0;
                                b.k0(l$3);
                                break Label_0402;
                            }
                            if (label == 3) {
                                l$6 = this.L$3;
                                final e e = (e)this.L$2;
                                a = (kr0.f)this.L$1;
                                l$5 = (f)this.L$0;
                                b.k0(l$3);
                                e2 = e;
                                break Label_0463;
                            }
                            if (label == 4) {
                                b.k0(l$3);
                                return j.a;
                            }
                            if (label == 5) {
                                b.k0(l$3);
                                return j.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            $params = (a$a)this.L$4;
                            this$0 = (com.reddit.domain.coins.usecase.a)this.L$3;
                            d = (e)this.L$2;
                            a = (kr0.f)this.L$1;
                            final f f = (f)this.L$0;
                            b.k0(l$3);
                            f2 = f;
                        }
                    }
                    else {
                        b.k0(l$3);
                        f2 = (f)this.L$0;
                        a = this.$params.a();
                        d = this.$params.d();
                        GoldAnalytics.P(this.this$0.b, a, this.$params.b());
                        $params = this.$params;
                        a$a$b a$a$b;
                        if ($params instanceof a$a$b) {
                            a$a$b = (a$a$b)$params;
                        }
                        else {
                            a$a$b = null;
                        }
                        if (a$a$b == null) {
                            final String s = null;
                            final f f3 = f2;
                            s2 = s;
                            e3 = d;
                            l$5 = f3;
                            break Label_0496;
                        }
                        this$0 = this.this$0;
                        final a$d a2 = a$d.a;
                        this.L$0 = f2;
                        this.L$1 = a;
                        this.L$2 = d;
                        this.L$3 = this$0;
                        this.L$4 = $params;
                        this.label = 1;
                        if (f2.emit(a2, (c<? super j>)this) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    final a$a$b a$a$b2 = (a$a$b)$params;
                    this.L$0 = f2;
                    this.L$1 = a;
                    this.L$2 = d;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    final Object a3 = com.reddit.domain.coins.usecase.a.a(this$0, a$a$b2, (c)this);
                    if (a3 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    l$4 = d;
                    l$5 = f2;
                    l$3 = a3;
                }
                final String s3 = (String)l$3;
                final a$b a4 = a$b.a;
                this.L$0 = l$5;
                this.L$1 = a;
                this.L$2 = l$4;
                this.L$3 = l$3;
                this.label = 3;
                if (l$5.emit(a4, (c<? super j>)this) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                l$6 = l$3;
                e2 = l$4;
            }
            final String s4 = (String)l$6;
            e3 = e2;
            s2 = s4;
        }
        if (s2 == null && this.this$0.f.ta()) {
            final a$c a5 = a$c.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 4;
            if (l$5.emit(a5, (c<? super j>)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        else {
            l$3 = new BuyCoinsUseCase$showPurchaseFlow$1$invokeSuspend$$inlined$map$1((hj2.e)this.this$0.a.b(e3, a.f, this.$params.b().p, (PurchaseParams)new PurchaseParams$Gold(PurchaseParams$Gold$ContentType.OneTimeProduct), s2), this.this$0, this.$params);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 5;
            if (kotlinx.coroutines.flow.a.u((c)this, (hj2.e)l$3, l$5) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            return j.a;
        }
        return j.a;
    }
}
