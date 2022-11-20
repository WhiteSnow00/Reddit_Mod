// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.coins.usecase;

import h30.a$a;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import java.io.Serializable;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Result;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import te0.a;

public final class UpdateCoinsBalanceUseCase
{
    public final a a;
    public final dw0.a b;
    public final d20.a c;
    
    @Inject
    public UpdateCoinsBalanceUseCase(final a a, final dw0.a b, final d20.a c) {
        e.f((Object)a, "coinsRepository");
        e.f((Object)b, "redditLogger");
        e.f((Object)c, "dispatcherProvider");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final c<? super Result<Integer>> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof UpdateCoinsBalanceUseCase$execute$1) {
                final UpdateCoinsBalanceUseCase$execute$1 updateCoinsBalanceUseCase$execute$1 = (UpdateCoinsBalanceUseCase$execute$1)c;
                final int label = updateCoinsBalanceUseCase$execute$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    updateCoinsBalanceUseCase$execute$1.label = label + Integer.MIN_VALUE;
                    o = updateCoinsBalanceUseCase$execute$1;
                    break Label_0047;
                }
            }
            o = new UpdateCoinsBalanceUseCase$execute$1(this, (c)c);
        }
        final Object result = ((UpdateCoinsBalanceUseCase$execute$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((UpdateCoinsBalanceUseCase$execute$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            b = result;
        }
        else {
            d.b4(result);
            ((UpdateCoinsBalanceUseCase$execute$1)o).label = 1;
            if ((b = this.b((c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return ((Result)b).unbox-impl();
    }
    
    public final Serializable b(c updateCoinsBalanceUseCase) {
        UpdateCoinsBalanceUseCase$execute$2 updateCoinsBalanceUseCase$execute$2 = null;
        Label_0049: {
            if (updateCoinsBalanceUseCase instanceof UpdateCoinsBalanceUseCase$execute$2) {
                updateCoinsBalanceUseCase$execute$2 = (UpdateCoinsBalanceUseCase$execute$2)updateCoinsBalanceUseCase;
                final int label = updateCoinsBalanceUseCase$execute$2.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    updateCoinsBalanceUseCase$execute$2.label = label + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            updateCoinsBalanceUseCase$execute$2 = new UpdateCoinsBalanceUseCase$execute$2(this, (c)updateCoinsBalanceUseCase);
        }
        Object o = updateCoinsBalanceUseCase$execute$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = updateCoinsBalanceUseCase$execute$2.label;
        Exception ex = null;
        Label_0298: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        final Integer n = (Integer)updateCoinsBalanceUseCase$execute$2.L$1;
                        final UpdateCoinsBalanceUseCase updateCoinsBalanceUseCase2 = updateCoinsBalanceUseCase = (UpdateCoinsBalanceUseCase)updateCoinsBalanceUseCase$execute$2.L$0;
                        try {
                            d.b4(o);
                            updateCoinsBalanceUseCase = updateCoinsBalanceUseCase2;
                            final Integer n2 = n;
                            break Label_0298;
                        }
                        catch (final Exception ex) {
                            break Label_0298;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                final UpdateCoinsBalanceUseCase updateCoinsBalanceUseCase3;
                final UpdateCoinsBalanceUseCase l$0 = updateCoinsBalanceUseCase3 = (UpdateCoinsBalanceUseCase)updateCoinsBalanceUseCase$execute$2.L$0;
                try {
                    d.b4(o);
                    break Label_0298;
                }
                catch (final Exception ex2) {
                    break Label_0298;
                }
            }
            d.b4(o);
            try {
                final a a = this.a;
                updateCoinsBalanceUseCase$execute$2.L$0 = this;
                updateCoinsBalanceUseCase$execute$2.label = 1;
                o = a.c((ContinuationImpl)updateCoinsBalanceUseCase$execute$2);
                if (o == coroutine_SUSPENDED) {
                    return (Serializable)coroutine_SUSPENDED;
                }
                final UpdateCoinsBalanceUseCase l$0 = this;
                final Integer l$2 = (Integer)o;
                final ij2.a c = l$0.c.c();
                final UpdateCoinsBalanceUseCase$execute$3 updateCoinsBalanceUseCase$execute$3 = new UpdateCoinsBalanceUseCase$execute$3(l$2, l$0, (c)null);
                updateCoinsBalanceUseCase$execute$2.L$0 = l$0;
                updateCoinsBalanceUseCase$execute$2.L$1 = l$2;
                updateCoinsBalanceUseCase$execute$2.label = 2;
                if (g.j((CoroutineContext)c, (p)updateCoinsBalanceUseCase$execute$3, (c)updateCoinsBalanceUseCase$execute$2) == coroutine_SUSPENDED) {
                    return (Serializable)coroutine_SUSPENDED;
                }
                final Integer n2 = l$2;
                return (Serializable)Result.box-impl(Result.constructor-impl((Object)n2));
                final UpdateCoinsBalanceUseCase updateCoinsBalanceUseCase3;
                updateCoinsBalanceUseCase = updateCoinsBalanceUseCase3;
                final Exception ex2;
                ex = ex2;
            }
            catch (final Exception ex) {
                updateCoinsBalanceUseCase = this;
            }
        }
        final a$a a2 = h30.a.a;
        if (!(ex instanceof CancellationException)) {
            if (!(ex instanceof IOException)) {
                updateCoinsBalanceUseCase.b.h("Failed to update coins", (Throwable)ex);
            }
            return (Serializable)Result.box-impl(Result.constructor-impl((Object)d.B1((Throwable)ex)));
        }
        throw ex;
    }
}
