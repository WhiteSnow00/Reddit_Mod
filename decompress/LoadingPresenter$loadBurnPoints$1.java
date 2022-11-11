// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.loading;

import x82.o;
import com.reddit.vault.model.BurnWithMemo;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import x82.h;
import rg2.l;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.loading.LoadingPresenter$loadBurnPoints$1", f = "LoadingPresenter.kt", l = { 181, 182 }, m = "invokeSuspend")
final class LoadingPresenter$loadBurnPoints$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ l<h, Boolean> $communityPredicate;
    public final /* synthetic */ x82.p $entryPoint;
    public final /* synthetic */ String $memo;
    public Object L$0;
    public int label;
    public final /* synthetic */ LoadingPresenter this$0;
    
    public LoadingPresenter$loadBurnPoints$1(final LoadingPresenter this$0, final l<? super h, Boolean> $communityPredicate, final x82.p $entryPoint, final String $memo, final c<? super LoadingPresenter$loadBurnPoints$1> c) {
        this.this$0 = this$0;
        this.$communityPredicate = (l<h, Boolean>)$communityPredicate;
        this.$entryPoint = $entryPoint;
        this.$memo = $memo;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new LoadingPresenter$loadBurnPoints$1(this.this$0, this.$communityPredicate, this.$entryPoint, this.$memo, (c<? super LoadingPresenter$loadBurnPoints$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((LoadingPresenter$loadBurnPoints$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object gc) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        final o o = null;
        h h = null;
        BurnWithMemo burnWithMemo = null;
        Label_0181: {
            Object ac = null;
            Label_0167: {
                if (label != 0) {
                    if (label != 1) {
                        if (label == 2) {
                            h = (h)this.L$0;
                            b.k0(gc);
                            ac = gc;
                            break Label_0167;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        b.k0(gc);
                    }
                }
                else {
                    b.k0(gc);
                    final LoadingPresenter this$0 = this.this$0;
                    final l<h, Boolean> $communityPredicate = this.$communityPredicate;
                    this.label = 1;
                    if ((gc = this$0.Gc((l)$communityPredicate, (c)this)) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                final h l$0 = (h)gc;
                if (l$0 != null) {
                    final String f = l$0.f;
                    if (f != null) {
                        final LoadingPresenter this$2 = this.this$0;
                        final String $memo = this.$memo;
                        this.L$0 = l$0;
                        this.label = 2;
                        ac = LoadingPresenter.Ac(this$2, f, $memo, (c)this);
                        if (ac == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        h = l$0;
                        break Label_0167;
                    }
                }
                h = l$0;
                burnWithMemo = null;
                break Label_0181;
            }
            burnWithMemo = (BurnWithMemo)ac;
        }
        o o2 = o;
        if (h != null) {
            o2 = o;
            if (burnWithMemo != null) {
                o2 = new o.b(this.$entryPoint, h, this.$memo, burnWithMemo.a, burnWithMemo.b.a);
            }
        }
        final LoadingPresenter this$3 = this.this$0;
        this$3.k.Gd(o2, this$3.q);
        return j.a;
    }
}
