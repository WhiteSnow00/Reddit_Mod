// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.awards;

import ff2.n;
import ff2.a;
import io.reactivex.plugins.RxJavaPlugins;
import kf2.o;
import ff2.r;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import u30.d;
import sg2.e;
import v10.v;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.data.awards.RedditAwardRepository$onHideComplete$2", f = "RedditAwardRepository.kt", l = { 272 }, m = "invokeSuspend")
final class RedditAwardRepository$onHideComplete$2 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ String $awardId;
    public final /* synthetic */ String $targetId;
    public int label;
    public final /* synthetic */ RedditAwardRepository this$0;
    
    public RedditAwardRepository$onHideComplete$2(final String $targetId, final RedditAwardRepository this$0, final String $awardId, final c<? super RedditAwardRepository$onHideComplete$2> c) {
        this.$targetId = $targetId;
        this.this$0 = this$0;
        this.$awardId = $awardId;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new RedditAwardRepository$onHideComplete$2(this.$targetId, this.this$0, this.$awardId, (c<? super RedditAwardRepository$onHideComplete$2>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((RedditAwardRepository$onHideComplete$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(o);
        }
        else {
            b.k0(o);
            final String a = v.a(this.$targetId);
            a a2;
            if (e.a((Object)a, (Object)"t3")) {
                final n b = this.this$0.d.b(v.g(this.$targetId));
                final u30.d d = new u30.d(this.this$0, this.$targetId, this.$awardId);
                b.getClass();
                a2 = RxJavaPlugins.onAssembly(new MaybeFlatMapCompletable<Object>((ff2.r<?>)b, (kf2.o<?, ? extends ff2.e>)d)).t();
            }
            else if (e.a((Object)a, (Object)"t1")) {
                final n j = this.this$0.e.j(this.$targetId);
                final u30.e e = new u30.e(this.this$0, this.$targetId, this.$awardId);
                j.getClass();
                a2 = RxJavaPlugins.onAssembly(new MaybeFlatMapCompletable<Object>((ff2.r<Object>)j, (kf2.o<? super Object, ? extends ff2.e>)e)).t();
            }
            else {
                a2 = ff2.a.h();
            }
            e.e((Object)a2, "when (ThingUtil.getKindB\u2026etable.complete()\n      }");
            this.label = 1;
            if (kotlinx.coroutines.rx2.d.a(a2, (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
