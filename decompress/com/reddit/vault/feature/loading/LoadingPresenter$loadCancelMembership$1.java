// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.loading;

import x82.o;
import x82.o$d;
import x82.i;
import x82.h;
import kotlin.Pair;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.loading.LoadingPresenter$loadCancelMembership$1", f = "LoadingPresenter.kt", l = { 89 }, m = "invokeSuspend")
final class LoadingPresenter$loadCancelMembership$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ x82.p $entryPoint;
    public final /* synthetic */ String $subredditId;
    public int label;
    public final /* synthetic */ LoadingPresenter this$0;
    
    public LoadingPresenter$loadCancelMembership$1(final LoadingPresenter this$0, final String $subredditId, final x82.p $entryPoint, final c<? super LoadingPresenter$loadCancelMembership$1> c) {
        this.this$0 = this$0;
        this.$subredditId = $subredditId;
        this.$entryPoint = $entryPoint;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new LoadingPresenter$loadCancelMembership$1(this.this$0, this.$subredditId, this.$entryPoint, (c<? super LoadingPresenter$loadCancelMembership$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((LoadingPresenter$loadCancelMembership$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object dc) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(dc);
        }
        else {
            b.k0(dc);
            final LoadingPresenter this$0 = this.this$0;
            final String $subredditId = this.$subredditId;
            this.label = 1;
            if ((dc = LoadingPresenter.Dc(this$0, $subredditId, (c)this)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final Pair pair = (Pair)dc;
        final h h = (h)pair.component1();
        final i i = (i)pair.component2();
        Object o;
        if (h != null && i != null) {
            o = new o$d(this.$entryPoint, h, i);
        }
        else {
            o = null;
        }
        final LoadingPresenter this$2 = this.this$0;
        this$2.k.Gd((o)o, this$2.q);
        return j.a;
    }
}
