// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.loading;

import com.reddit.presentation.CoroutinesPresenter;
import java.math.BigInteger;
import jj2.f;
import x82.o$s;
import x82.a;
import x82.h;
import rg2.l;
import x82.o$n;
import kotlin.coroutines.CoroutineContext;
import sg2.e;
import com.reddit.vault.model.TransactionIntentType;
import x82.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.CoroutineDispatcher;
import ej2.g;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import com.reddit.vault.model.TransactionIntent;
import nu2.w;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.loading.LoadingPresenter$loadTransactionIntent$1", f = "LoadingPresenter.kt", l = { 138 }, m = "invokeSuspend")
final class LoadingPresenter$loadTransactionIntent$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ x82.p $entryPoint;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LoadingPresenter this$0;
    
    public LoadingPresenter$loadTransactionIntent$1(final LoadingPresenter this$0, final x82.p $entryPoint, final c<? super LoadingPresenter$loadTransactionIntent$1> c) {
        this.this$0 = this$0;
        this.$entryPoint = $entryPoint;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final LoadingPresenter$loadTransactionIntent$1 loadingPresenter$loadTransactionIntent$1 = new LoadingPresenter$loadTransactionIntent$1(this.this$0, this.$entryPoint, (c<? super LoadingPresenter$loadTransactionIntent$1>)c);
        loadingPresenter$loadTransactionIntent$1.L$0 = l$0;
        return (c<j>)loadingPresenter$loadTransactionIntent$1;
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((LoadingPresenter$loadTransactionIntent$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object b) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        final a a = null;
        Object o = null;
        Label_0134: {
            Object o2 = null;
            Label_0107: {
                if (label != 0) {
                    if (label == 1) {
                        o = (o2 = this.L$0);
                        try {
                            b.k0(b);
                            break Label_0107;
                        }
                        catch (final Exception ex) {
                            break Label_0107;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.k0(b);
                b = this.L$0;
                final RemoteVaultDataSource p = this.this$0.p;
                try {
                    this.L$0 = b;
                    this.label = 1;
                    final Object transactionIntent = p.getTransactionIntent((c)this);
                    if (transactionIntent == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    o = b;
                    b = transactionIntent;
                    b = ((w)b).b;
                    break Label_0134;
                }
                catch (final Exception ex) {
                    o2 = b;
                }
            }
            final Exception ex;
            ex.printStackTrace();
            b = null;
            o = o2;
        }
        final TransactionIntent transactionIntent2 = (TransactionIntent)b;
        if (transactionIntent2 != null) {
            g.c((b0)o, (CoroutineDispatcher)null, (CoroutineStart)null, (p)new p<b0, c<? super w<j>>, Object>() {
                public int label;
                public final /* synthetic */ LoadingPresenter this$0;
                
                public final c<j> create(final Object o, final c<?> c) {
                    return (c<j>)new p<b0, c<? super w<j>>, Object>() {
                        public int label;
                        public final /* synthetic */ LoadingPresenter this$0 = this.this$0;
                    };
                }
                
                @Override
                public final Object invoke(final b0 b0, final c<? super w<j>> c) {
                    return ((LoadingPresenter$loadTransactionIntent$1$1)this.create(b0, c)).invokeSuspend(j.a);
                }
                
                public final Object invokeSuspend(Object clearTransactionIntent) {
                    final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                    final int label = this.label;
                    if (label != 0) {
                        if (label != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b.k0(clearTransactionIntent);
                    }
                    else {
                        b.k0(clearTransactionIntent);
                        final RemoteVaultDataSource p = this.this$0.p;
                        this.label = 1;
                        if ((clearTransactionIntent = p.clearTransactionIntent((c)this)) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    return clearTransactionIntent;
                }
            }, 3);
        }
        if (transactionIntent2 == null) {
            final LoadingPresenter this$0 = this.this$0;
            this$0.k.Gd(null, this$0.q);
        }
        else {
            final TransactionIntentType a2 = transactionIntent2.a;
            if (a2 == TransactionIntentType.CLAIM) {
                final String b2 = transactionIntent2.b;
                if (b2 != null) {
                    final LoadingPresenter this$2 = this.this$0;
                    final x82.p $entryPoint = this.$entryPoint;
                    final f g = ((CoroutinesPresenter)this$2).g;
                    e.c((Object)g);
                    ej2.g.i((b0)g, (CoroutineContext)null, (CoroutineStart)null, (p)new LoadingPresenter$loadClaimPoints$1(this$2, b2, $entryPoint, null), 3);
                    return j.a;
                }
            }
            if (a2 == TransactionIntentType.SUBSCRIBE) {
                final String b3 = transactionIntent2.b;
                if (b3 != null) {
                    final LoadingPresenter this$3 = this.this$0;
                    final x82.p $entryPoint2 = this.$entryPoint;
                    final f g2 = ((CoroutinesPresenter)this$3).g;
                    e.c((Object)g2);
                    g.i((b0)g2, (CoroutineContext)null, (CoroutineStart)null, (p)new LoadingPresenter$loadPurchaseMembership$1(this$3, b3, $entryPoint2, null), 3);
                    return j.a;
                }
            }
            if (a2 == TransactionIntentType.UNSUBSCRIBE) {
                final String b4 = transactionIntent2.b;
                if (b4 != null) {
                    final LoadingPresenter this$4 = this.this$0;
                    final x82.p $entryPoint3 = this.$entryPoint;
                    final f g3 = ((CoroutinesPresenter)this$4).g;
                    e.c((Object)g3);
                    g.i((b0)g3, (CoroutineContext)null, (CoroutineStart)null, (p)new LoadingPresenter$loadCancelMembership$1(this$4, b4, $entryPoint3, null), 3);
                    return j.a;
                }
            }
            if (a2 == TransactionIntentType.BACKUP) {
                this.this$0.Fc(this.$entryPoint);
            }
            else {
                if (a2 == TransactionIntentType.CONVERT_TO_COINS) {
                    final String b5 = transactionIntent2.b;
                    if (b5 != null) {
                        final LoadingPresenter this$5 = this.this$0;
                        final x82.p $entryPoint4 = this.$entryPoint;
                        this$5.getClass();
                        this$5.k.Gd((o)new o$n($entryPoint4, b5), this$5.q);
                        return j.a;
                    }
                }
                if (a2 == TransactionIntentType.BURN_LINK && transactionIntent2.b != null) {
                    final String g4 = transactionIntent2.g;
                    if (g4 != null) {
                        final LoadingPresenter this$6 = this.this$0;
                        final x82.p $entryPoint5 = this.$entryPoint;
                        final LoadingPresenter$loadTransactionIntent$1$2 loadingPresenter$loadTransactionIntent$1$2 = new LoadingPresenter$loadTransactionIntent$1$2(transactionIntent2);
                        final f g5 = ((CoroutinesPresenter)this$6).g;
                        e.c((Object)g5);
                        g.i((b0)g5, (CoroutineContext)null, (CoroutineStart)null, (p)new LoadingPresenter$loadBurnPoints$1(this$6, (l<? super h, Boolean>)loadingPresenter$loadTransactionIntent$1$2, $entryPoint5, g4, null), 3);
                        return j.a;
                    }
                }
                if (a2 == TransactionIntentType.TRANSFER) {
                    final LoadingPresenter this$7 = this.this$0;
                    final x82.p $entryPoint6 = this.$entryPoint;
                    final String e = transactionIntent2.e;
                    final String d = transactionIntent2.d;
                    final BigInteger f = transactionIntent2.f;
                    a a3 = a;
                    if (f != null) {
                        a3 = new a(f);
                    }
                    final String b6 = transactionIntent2.b;
                    final BigInteger c = transactionIntent2.c;
                    this$7.getClass();
                    b = new o$s($entryPoint6, e, d, a3, b6, c);
                    this$7.k.Gd((o)b, this$7.q);
                }
                else {
                    final LoadingPresenter this$8 = this.this$0;
                    this$8.k.Gd(null, this$8.q);
                }
            }
        }
        return j.a;
    }
}
