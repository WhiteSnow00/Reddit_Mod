// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.premium.usecase;

import h30.a$a;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import cg2.j;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import ud0.a;

public final class b
{
    public final a a;
    public final te0.a b;
    public final dw0.a c;
    public final d20.a d;
    
    @Inject
    public b(final a a, final te0.a b, final dw0.a c, final d20.a d) {
        e.f((Object)a, "premiumRepository");
        e.f((Object)b, "coinsRepository");
        e.f((Object)c, "redditLogger");
        e.f((Object)d, "dispatcherProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Serializable a(b.b$a l$1, final c c) {
        UpdatePremiumBalanceUseCase$execute$1 updatePremiumBalanceUseCase$execute$1 = null;
        Label_0049: {
            if (c instanceof UpdatePremiumBalanceUseCase$execute$1) {
                updatePremiumBalanceUseCase$execute$1 = (UpdatePremiumBalanceUseCase$execute$1)c;
                final int label = updatePremiumBalanceUseCase$execute$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    updatePremiumBalanceUseCase$execute$1.label = label + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            updatePremiumBalanceUseCase$execute$1 = new UpdatePremiumBalanceUseCase$execute$1(this, c);
        }
        Object o = updatePremiumBalanceUseCase$execute$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = updatePremiumBalanceUseCase$execute$1.label;
        Label_0200: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        final Object l$2 = l$1 = (b.b$a)updatePremiumBalanceUseCase$execute$1.L$0;
                        try {
                            cg.d.b4(o);
                            break Label_0200;
                        }
                        catch (final Exception ex) {
                            break Label_0200;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                final Object o2 = updatePremiumBalanceUseCase$execute$1.L$1;
                l$1 = (b.b$a)updatePremiumBalanceUseCase$execute$1.L$0;
                try {
                    cg.d.b4(o);
                    final Object l$2 = l$1;
                    break Label_0200;
                }
                catch (final Exception ex) {
                    break Label_0200;
                }
            }
            cg.d.b4(o);
            try {
                final a a = this.a;
                updatePremiumBalanceUseCase$execute$1.L$0 = this;
                updatePremiumBalanceUseCase$execute$1.L$1 = l$1;
                updatePremiumBalanceUseCase$execute$1.label = 1;
                o = a.f((c<? super td0.a>)updatePremiumBalanceUseCase$execute$1);
                if (o == coroutine_SUSPENDED) {
                    return (Serializable)coroutine_SUSPENDED;
                }
                final Object l$2 = this;
                final Object o2 = l$1;
                final td0.a a2 = (td0.a)o;
                final ij2.a c2 = ((b)l$2).d.c();
                final UpdatePremiumBalanceUseCase$execute$2 updatePremiumBalanceUseCase$execute$2 = new UpdatePremiumBalanceUseCase$execute$2(a2, (b)l$2, (b.b$a)o2, (c)null);
                updatePremiumBalanceUseCase$execute$1.L$0 = l$2;
                updatePremiumBalanceUseCase$execute$1.L$1 = null;
                updatePremiumBalanceUseCase$execute$1.label = 2;
                if (g.j((CoroutineContext)c2, (p)updatePremiumBalanceUseCase$execute$2, (c)updatePremiumBalanceUseCase$execute$1) == coroutine_SUSPENDED) {
                    return (Serializable)coroutine_SUSPENDED;
                }
                return (Serializable)Result.box-impl(Result.constructor-impl((Object)j.a));
            }
            catch (final Exception ex) {
                l$1 = (b.b$a)this;
            }
        }
        final a$a a3 = h30.a.a;
        final Exception ex;
        if (!(ex instanceof CancellationException)) {
            if (!(ex instanceof IOException)) {
                ((b)l$1).c.h("Failed to load coins and subscriptionData", (Throwable)ex);
            }
            return (Serializable)Result.box-impl(Result.constructor-impl((Object)cg.d.B1((Throwable)ex)));
        }
        throw ex;
    }
}
