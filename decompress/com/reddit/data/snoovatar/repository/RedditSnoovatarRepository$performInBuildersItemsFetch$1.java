// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.snoovatar.repository.RedditSnoovatarRepository", f = "RedditSnoovatarRepository.kt", l = { 501, 505 }, m = "performInBuildersItemsFetch-IoAF18A")
final class RedditSnoovatarRepository$performInBuildersItemsFetch$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditSnoovatarRepository this$0;
    
    public RedditSnoovatarRepository$performInBuildersItemsFetch$1(final RedditSnoovatarRepository this$0, final tg2.c<? super RedditSnoovatarRepository$performInBuildersItemsFetch$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(Object a) {
        this.result = a;
        this.label |= Integer.MIN_VALUE;
        a = RedditSnoovatarRepository.A(this.this$0, (tg2.c)this);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return Result.box-impl(a);
    }
}
