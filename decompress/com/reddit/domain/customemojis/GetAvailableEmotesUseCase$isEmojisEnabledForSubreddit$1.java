// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.customemojis;

import bb0.a;
import kotlin.Result;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import kotlin.Metadata;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.domain.customemojis.GetAvailableEmotesUseCase$isEmojisEnabledForSubreddit$1", f = "GetAvailableEmotesUseCase.kt", l = { 107 }, m = "invokeSuspend")
final class GetAvailableEmotesUseCase$isEmojisEnabledForSubreddit$1 extends SuspendLambda implements p<b0, c<? super Boolean>, Object>
{
    public final /* synthetic */ String $subredditName;
    public int label;
    public final /* synthetic */ com.reddit.domain.customemojis.d this$0;
    
    public GetAvailableEmotesUseCase$isEmojisEnabledForSubreddit$1(final com.reddit.domain.customemojis.d this$0, final String $subredditName, final c<? super GetAvailableEmotesUseCase$isEmojisEnabledForSubreddit$1> c) {
        this.this$0 = this$0;
        this.$subredditName = $subredditName;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new GetAvailableEmotesUseCase$isEmojisEnabledForSubreddit$1(this.this$0, this.$subredditName, (c<? super GetAvailableEmotesUseCase$isEmojisEnabledForSubreddit$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super Boolean> c) {
        return ((GetAvailableEmotesUseCase$isEmojisEnabledForSubreddit$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(o);
            o = ((Result)o).unbox-impl();
        }
        else {
            b.k0(o);
            final a j = this.this$0.j;
            final String $subredditName = this.$subredditName;
            this.label = 1;
            if ((o = j.h($subredditName, (c<? super Result<Boolean>>)this)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final Boolean false = Boolean.FALSE;
        Object o2 = o;
        if (Result.isFailure-impl(o)) {
            o2 = false;
        }
        return o2;
    }
}
