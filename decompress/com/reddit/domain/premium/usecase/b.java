// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.premium.usecase;

import h30.a$a;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import pg2.j;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import de0.a;

public final class b
{
    public final a a;
    public final cf0.a b;
    public final jw0.a c;
    public final e20.a d;
    
    @Inject
    public b(final a a, final cf0.a b, final jw0.a c, final e20.a d) {
        f.f((Object)a, "premiumRepository");
        f.f((Object)b, "coinsRepository");
        f.f((Object)c, "redditLogger");
        f.f((Object)d, "dispatcherProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Serializable a(b.b$a l$1, final c c) {
        UpdatePremiumBalanceUseCase$execute$1 updatePremiumBalanceUseCase$execute$1 = null;
        Label_0048: {
            if (c instanceof UpdatePremiumBalanceUseCase$execute$1) {
                updatePremiumBalanceUseCase$execute$1 = (UpdatePremiumBalanceUseCase$execute$1)c;
                final int label = updatePremiumBalanceUseCase$execute$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    updatePremiumBalanceUseCase$execute$1.label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            updatePremiumBalanceUseCase$execute$1 = new UpdatePremiumBalanceUseCase$execute$1(this, c);
        }
        Object o = updatePremiumBalanceUseCase$execute$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = updatePremiumBalanceUseCase$execute$1.label;
        Label_0194: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        final Object l$2 = l$1 = (b.b$a)updatePremiumBalanceUseCase$execute$1.L$0;
                        try {
                            aj2.c.Q0(o);
                            break Label_0194;
                        }
                        catch (final Exception ex) {
                            break Label_0194;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                final Object o2 = updatePremiumBalanceUseCase$execute$1.L$1;
                l$1 = (b.b$a)updatePremiumBalanceUseCase$execute$1.L$0;
                try {
                    aj2.c.Q0(o);
                    final Object l$2 = l$1;
                    break Label_0194;
                }
                catch (final Exception ex) {
                    break Label_0194;
                }
            }
            aj2.c.Q0(o);
            try {
                final a a = this.a;
                updatePremiumBalanceUseCase$execute$1.L$0 = this;
                updatePremiumBalanceUseCase$execute$1.L$1 = l$1;
                updatePremiumBalanceUseCase$execute$1.label = 1;
                o = a.e((c)updatePremiumBalanceUseCase$execute$1);
                if (o == coroutine_SUSPENDED) {
                    return (Serializable)coroutine_SUSPENDED;
                }
                final Object l$2 = this;
                final Object o2 = l$1;
                final ce0.a a2 = (ce0.a)o;
                final uj2.a c2 = ((b)l$2).d.c();
                final UpdatePremiumBalanceUseCase$execute$2 updatePremiumBalanceUseCase$execute$2 = new UpdatePremiumBalanceUseCase$execute$2(a2, (b)l$2, (b.b$a)o2, (c)null);
                updatePremiumBalanceUseCase$execute$1.L$0 = l$2;
                updatePremiumBalanceUseCase$execute$1.L$1 = null;
                updatePremiumBalanceUseCase$execute$1.label = 2;
                if (g.l((CoroutineContext)c2, (p)updatePremiumBalanceUseCase$execute$2, (c)updatePremiumBalanceUseCase$execute$1) == coroutine_SUSPENDED) {
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
                ((b)l$1).c.i("Failed to load coins and subscriptionData", (Throwable)ex);
            }
            return (Serializable)Result.box-impl(Result.constructor-impl((Object)aj2.c.G((Throwable)ex)));
        }
        throw ex;
    }
}
