// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.awards;

import kotlin.NoWhenBranchMatchedException;
import com.reddit.domain.model.gold.UsableAwardsParams;
import sg2.e;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import kotlin.Metadata;
import ka0.f;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lka0/f;", "kotlin.jvm.PlatformType", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.data.awards.RedditAwardRepository$sortedUsableAwardsWithTagsStore$2$1$1", f = "RedditAwardRepository.kt", l = { 196 }, m = "invokeSuspend")
final class RedditAwardRepository$sortedUsableAwardsWithTagsStore$2$1$1 extends SuspendLambda implements p<b0, c<? super f>, Object>
{
    public final /* synthetic */ RedditAwardRepository$a $it;
    public int label;
    public final /* synthetic */ RedditAwardRepository this$0;
    
    public RedditAwardRepository$sortedUsableAwardsWithTagsStore$2$1$1(final RedditAwardRepository this$0, final RedditAwardRepository$a $it, final c<? super RedditAwardRepository$sortedUsableAwardsWithTagsStore$2$1$1> c) {
        this.this$0 = this$0;
        this.$it = $it;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new RedditAwardRepository$sortedUsableAwardsWithTagsStore$2$1$1(this.this$0, this.$it, (c<? super RedditAwardRepository$sortedUsableAwardsWithTagsStore$2$1$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super f> c) {
        return ((RedditAwardRepository$sortedUsableAwardsWithTagsStore$2$1$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        Object o2;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(o);
            o2 = o;
        }
        else {
            b.k0(o);
            final RedditAwardRepository this$0 = this.this$0;
            final RedditAwardRepository$a $it = this.$it;
            e.e((Object)$it, "it");
            this.label = 1;
            this$0.getClass();
            final UsableAwardsParams a = $it.a;
            if (a instanceof UsableAwardsParams.Subreddit) {
                o = this$0.c.d(((UsableAwardsParams.Subreddit)a).getKindWithId(), $it.b, $it.c, (c)this);
            }
            else {
                if (!(a instanceof UsableAwardsParams.UserProfile)) {
                    throw new NoWhenBranchMatchedException();
                }
                o = this$0.c.c(((UsableAwardsParams.UserProfile)a).getName(), $it.b, $it.c, (c)this);
            }
            o2 = o;
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return o2;
    }
}
