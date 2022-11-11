// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.createvault;

import n92.i;
import hj2.a0;
import com.reddit.vault.domain.GetActiveVaultUseCase;
import java.util.Iterator;
import com.reddit.vault.data.local.LocalVaultDataSource$special$$inlined$map$2;
import y82.f;
import n92.i$c;
import x82.o0;
import java.util.List;
import n92.i$a;
import x82.k0;
import hj2.e;
import kotlin.Result;
import java.math.BigInteger;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import x82.a;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.registration.createvault.CreateVaultPresenter$loadUserVault$1", f = "CreateVaultPresenter.kt", l = { 315, 317, 321, 326 }, m = "invokeSuspend")
final class CreateVaultPresenter$loadUserVault$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ a $activeAddress;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ CreateVaultPresenter this$0;
    
    public CreateVaultPresenter$loadUserVault$1(final CreateVaultPresenter this$0, final a $activeAddress, final c<? super CreateVaultPresenter$loadUserVault$1> c) {
        this.this$0 = this$0;
        this.$activeAddress = $activeAddress;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new CreateVaultPresenter$loadUserVault$1(this.this$0, this.$activeAddress, (c<? super CreateVaultPresenter$loadUserVault$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((CreateVaultPresenter$loadUserVault$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object d) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        CreateVaultPresenter createVaultPresenter = null;
        Label_0523: {
            a a2 = null;
            BigInteger bigInteger2 = null;
            Object k = null;
            Label_0479: {
                BigInteger l$2 = null;
                a l$3 = null;
                Label_0399: {
                    BigInteger bigInteger3 = null;
                    a a3 = null;
                    Label_0392: {
                        BigInteger l$0 = null;
                        Object a = null;
                        Label_0344: {
                            Label_0191: {
                                if (label != 0) {
                                    if (label != 1) {
                                        if (label == 2) {
                                            b.k0(d);
                                            break Label_0191;
                                        }
                                        if (label == 3) {
                                            final BigInteger bigInteger = (BigInteger)this.L$0;
                                            b.k0(d);
                                            final Object unbox-impl = ((Result)d).unbox-impl();
                                            l$0 = bigInteger;
                                            a = unbox-impl;
                                            break Label_0344;
                                        }
                                        if (label == 4) {
                                            createVaultPresenter = (CreateVaultPresenter)this.L$2;
                                            a2 = (a)this.L$1;
                                            bigInteger2 = (BigInteger)this.L$0;
                                            b.k0(d);
                                            k = d;
                                            break Label_0479;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    else {
                                        b.k0(d);
                                    }
                                }
                                else {
                                    b.k0(d);
                                    final f p = this.this$0.p;
                                    this.label = 1;
                                    if (p.i(false, (c<? super Boolean>)this) == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                }
                                final LocalVaultDataSource$special$$inlined$map$2 f = this.this$0.n.f;
                                this.label = 2;
                                if ((d = kotlinx.coroutines.flow.a.x((e)f, (c)this)) == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                            }
                            final Iterable iterable = (Iterable)d;
                            l$0 = BigInteger.ZERO;
                            sg2.e.e((Object)l$0, "ZERO");
                            final Iterator iterator = iterable.iterator();
                            while (iterator.hasNext()) {
                                l$0 = l$0.add(((k0)iterator.next()).h);
                                sg2.e.e((Object)l$0, "this.add(other)");
                            }
                            final a $activeAddress = this.$activeAddress;
                            bigInteger3 = l$0;
                            if ((a3 = $activeAddress) != null) {
                                break Label_0392;
                            }
                            final a a4 = (a)((a0)this.this$0.m.getAddress()).getValue();
                            bigInteger3 = l$0;
                            if ((a3 = a4) != null) {
                                break Label_0392;
                            }
                            final GetActiveVaultUseCase x = this.this$0.x;
                            this.L$0 = l$0;
                            this.label = 3;
                            if ((a = x.a((c)this)) == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                        }
                        Object o = a;
                        if (Result.isFailure-impl(a)) {
                            o = null;
                        }
                        final w82.c c = (w82.c)o;
                        if (c == null) {
                            l$2 = l$0;
                            l$3 = null;
                            break Label_0399;
                        }
                        a3 = ui.b.A(c);
                        bigInteger3 = l$0;
                    }
                    l$3 = a3;
                    l$2 = bigInteger3;
                }
                final CreateVaultPresenter this$0 = this.this$0;
                if (l$3 == null) {
                    d = i$a.f;
                    createVaultPresenter = this$0;
                    break Label_0523;
                }
                final y82.a l = this$0.l;
                this.L$0 = l$2;
                this.L$1 = l$3;
                this.L$2 = this$0;
                this.label = 4;
                k = l.k(l$3, (c<? super List<o0>>)this);
                if (k == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                bigInteger2 = l$2;
                a2 = l$3;
                createVaultPresenter = this$0;
            }
            List r1;
            if ((r1 = (List)k) == null) {
                r1 = lw0.b.r1((Object)new o0(a2, true, 0, (Long)null));
            }
            d = new i$c(r1, a2, bigInteger2);
        }
        createVaultPresenter.D = (i)d;
        this.this$0.Gc();
        return j.a;
    }
}
