// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.coins.usecase;

import sz.g;
import kr0.b;
import cg2.j;
import cj2.f;
import mg2.p;
import cj2.s;
import ua0.a$e;
import ua0.a$f$b;
import kotlin.NoWhenBranchMatchedException;
import ua0.a$f$a;
import sz.g$a;
import com.reddit.gold.model.GlobalProductPurchasePackage$Currency;
import com.reddit.gold.model.GlobalProductPurchasePackage;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.UUID;
import kotlin.Result;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import javax.inject.Inject;
import ng2.e;
import com.reddit.events.gold.GoldAnalytics;
import sz.c;

public final class a
{
    public final c a;
    public final GoldAnalytics b;
    public final UpdateCoinsBalanceUseCase c;
    public final a d;
    public final dw0.a e;
    public final sd0.a f;
    
    @Inject
    public a(final c a, final GoldAnalytics b, final UpdateCoinsBalanceUseCase c, final a d, final dw0.a e, final sd0.a f) {
        ng2.e.f((Object)a, "billingManager");
        ng2.e.f((Object)b, "goldAnalytics");
        ng2.e.f((Object)c, "updateCoinsBalanceUseCase");
        ng2.e.f((Object)d, "orderRepository");
        ng2.e.f((Object)e, "redditLogger");
        ng2.e.f((Object)f, "premiumFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static final Object a(a l$0, final a$a$b a$a$b, gg2.c a) {
        l$0.getClass();
        BuyCoinsUseCase$createOrder$1 buyCoinsUseCase$createOrder$1 = null;
        Label_0054: {
            if (a instanceof BuyCoinsUseCase$createOrder$1) {
                buyCoinsUseCase$createOrder$1 = (BuyCoinsUseCase$createOrder$1)a;
                final int label = buyCoinsUseCase$createOrder$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    buyCoinsUseCase$createOrder$1.label = label + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            buyCoinsUseCase$createOrder$1 = new BuyCoinsUseCase$createOrder$1(l$0, (gg2.c)a);
        }
        final Object result = buyCoinsUseCase$createOrder$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = buyCoinsUseCase$createOrder$1.label;
        Object constructor-impl = null;
        Label_0113: {
            if (label2 == 0) {
                break Label_0113;
            }
            Label_0103: {
                if (label2 != 1) {
                    break Label_0103;
                }
                l$0 = (a = (a)buyCoinsUseCase$createOrder$1.L$0);
                try {
                    d.b4(result);
                    Object a2 = result;
                    Label_0261: {
                        a = l$0;
                    }
                    Result.constructor-impl((Object)a2);
                    a = l$0;
                    break Label_0113;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    d.b4(result);
                    a = l$0;
                    final a d = l$0.d;
                    a = l$0;
                    final String string = UUID.randomUUID().toString();
                    a = l$0;
                    e.e((Object)string, "randomUUID().toString()");
                    a = l$0;
                    final kr0.e b = a$a$b.b;
                    a = l$0;
                    final String f = b.f;
                    a = l$0;
                    final GlobalProductPurchasePackage a3 = a$a$b.a;
                    a = l$0;
                    final String f2 = a3.f;
                    a = l$0;
                    final GlobalProductPurchasePackage$Currency i = a3.i;
                    a = l$0;
                    final String g = a3.g;
                    a = l$0;
                    final int j = b.j;
                    a = l$0;
                    buyCoinsUseCase$createOrder$1.L$0 = l$0;
                    a = l$0;
                    buyCoinsUseCase$createOrder$1.label = 1;
                    a = l$0;
                    iftrue(Label_0261:)((a2 = d.a(string, f, f2, i, g, "1", j, (gg2.c)buyCoinsUseCase$createOrder$1)) != coroutine_SUSPENDED);
                    return constructor-impl;
                }
                finally {
                    final Throwable t;
                    constructor-impl = Result.constructor-impl((Object)d.B1(t));
                }
            }
        }
        final Object o = constructor-impl;
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(o);
        if (exceptionOrNull-impl != null) {
            if (exceptionOrNull-impl instanceof CancellationException) {
                throw exceptionOrNull-impl;
            }
            if (!(exceptionOrNull-impl instanceof IOException)) {
                a.e.f("Failed to create an order for coins purchase.", exceptionOrNull-impl, false);
            }
        }
        constructor-impl = o;
        if (Result.isFailure-impl(o)) {
            constructor-impl = null;
        }
        return constructor-impl;
    }
    
    public static final Object b(final a a, g$a l$0, a l$2, final gg2.c c) {
        a.getClass();
        Object o = null;
        Label_0059: {
            if (c instanceof BuyCoinsUseCase$handleVerifySuccess$1) {
                final BuyCoinsUseCase$handleVerifySuccess$1 buyCoinsUseCase$handleVerifySuccess$1 = (BuyCoinsUseCase$handleVerifySuccess$1)c;
                final int label = buyCoinsUseCase$handleVerifySuccess$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    buyCoinsUseCase$handleVerifySuccess$1.label = label + Integer.MIN_VALUE;
                    o = buyCoinsUseCase$handleVerifySuccess$1;
                    break Label_0059;
                }
            }
            o = new BuyCoinsUseCase$handleVerifySuccess$1(a, c);
        }
        final Object result = ((BuyCoinsUseCase$handleVerifySuccess$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((BuyCoinsUseCase$handleVerifySuccess$1)o).label;
        Object o2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$2 = (a)((BuyCoinsUseCase$handleVerifySuccess$1)o).L$1;
            l$0 = (g$a)((BuyCoinsUseCase$handleVerifySuccess$1)o).L$0;
            d.b4(result);
            o2 = ((Result)result).unbox-impl();
        }
        else {
            d.b4(result);
            if (l$2.e().invoke()) {
                a.b.S(l$2.a(), l$2.b(), l$2.c(), ((g)l$0).a.a());
            }
            final UpdateCoinsBalanceUseCase c2 = a.c;
            ((BuyCoinsUseCase$handleVerifySuccess$1)o).L$0 = l$0;
            ((BuyCoinsUseCase$handleVerifySuccess$1)o).L$1 = l$2;
            ((BuyCoinsUseCase$handleVerifySuccess$1)o).label = 1;
            if ((o2 = c2.a((gg2.c<? super Result<Integer>>)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        Object o3 = o2;
        if (Result.isFailure-impl(o2)) {
            o3 = null;
        }
        final Integer n = (Integer)o3;
        Object a2;
        if (n != null) {
            n.intValue();
            if (l$2 instanceof a$a$a) {
                a2 = new a$f$a(((a$a$a)l$2).a, (int)n, ((g)l$0).a);
            }
            else {
                if (!(l$2 instanceof a$a$b)) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = new a$f$b(((a$a$b)l$2).a, (int)n, ((g)l$0).a);
            }
        }
        else {
            a2 = a$e.a;
        }
        return a2;
    }
    
    public final s c(final a a) {
        ng2.e.f((Object)a, "params");
        return new s((p<? super f<? super T>, ? super gg2.c<? super j>, ?>)new BuyCoinsUseCase$showPurchaseFlow$1(a, this, (gg2.c)null));
    }
    
    public abstract static class a
    {
        public abstract kr0.f a();
        
        public abstract kr0.a b();
        
        public abstract b c();
        
        public abstract vz.e d();
        
        public abstract mg2.a<Boolean> e();
    }
}
