// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed;

import com.reddit.presentation.CoroutinesPresenter;
import jj2.f;
import x82.a;
import com.reddit.vault.domain.GetPointsInfoUseCase;
import com.reddit.vault.domain.GetCollectibleAvatarsUseCase;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import sg2.e;
import a4.a0;
import ea2.y;
import x82.z;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.Result;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.vault.feed.VaultFeedPresenter$loadVaultFeedData$1", f = "VaultFeedPresenter.kt", l = { 106, 112 }, m = "invokeSuspend")
final class VaultFeedPresenter$loadVaultFeedData$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public Object L$0;
    public int label;
    public final /* synthetic */ VaultFeedPresenter this$0;
    
    public VaultFeedPresenter$loadVaultFeedData$1(final VaultFeedPresenter this$0, final c<? super VaultFeedPresenter$loadVaultFeedData$1> c) {
        this.this$0 = this$0;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new VaultFeedPresenter$loadVaultFeedData$1(this.this$0, (c<? super VaultFeedPresenter$loadVaultFeedData$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((VaultFeedPresenter$loadVaultFeedData$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        Object o2 = null;
        Object a = null;
        Label_0192: {
            Object l$0 = null;
            Label_0155: {
                if (label != 0) {
                    if (label != 1) {
                        if (label == 2) {
                            o2 = this.L$0;
                            b.k0(o);
                            a = o;
                            break Label_0192;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        b.k0(o);
                        o = ((Result)o).unbox-impl();
                    }
                }
                else {
                    b.k0(o);
                    if (!this.this$0.s.f4()) {
                        l$0 = EmptyList.INSTANCE;
                        break Label_0155;
                    }
                    final GetCollectibleAvatarsUseCase v = this.this$0.v;
                    this.label = 1;
                    if ((o = v.a((c)this)) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                Object o3 = o;
                if (Result.isFailure-impl(o)) {
                    o3 = null;
                }
                if ((l$0 = o3) == null) {
                    l$0 = EmptyList.INSTANCE;
                }
            }
            final GetPointsInfoUseCase y = this.this$0.y;
            this.L$0 = l$0;
            this.label = 2;
            a = y.a((c)this);
            if (a == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o2 = l$0;
        }
        final y b = new y((z)a, (List)o2);
        final VaultFeedPresenter this$0 = this.this$0;
        this$0.B = b;
        final z a2 = b.a;
        a m0 = null;
        Label_0246: {
            if (a2 != null) {
                final List b2 = a2.b;
                if (b2 != null) {
                    m0 = a0.m0(b2);
                    break Label_0246;
                }
            }
            m0 = null;
        }
        if (m0 != null && !e.a((Object)m0, ((hj2.a0)this$0.m.getAddress()).getValue())) {
            this$0.r.k();
        }
        else {
            if (this$0.s.f4()) {
                if (b.a == null && !(b.b.isEmpty() ^ true)) {
                    this$0.k.jt();
                }
                else {
                    this$0.Fc();
                }
            }
            else {
                this$0.Fc();
            }
            final f g = ((CoroutinesPresenter)this$0).g;
            e.c((Object)g);
            ej2.g.i((b0)g, (CoroutineContext)null, (CoroutineStart)null, (p)new VaultFeedPresenter$onVaultFeedDataLoaded$1(this$0, null), 3);
        }
        this.this$0.k.hideLoading();
        return j.a;
    }
}
