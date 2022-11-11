// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository;

import ux1.b;
import java.util.Map;
import java.util.List;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.snoovatar.repository.RedditSnoovatarRepository", f = "RedditSnoovatarRepository.kt", l = { 268 }, m = "saveAvatarRest")
final class RedditSnoovatarRepository$saveAvatarRest$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditSnoovatarRepository this$0;
    
    public RedditSnoovatarRepository$saveAvatarRest$1(final RedditSnoovatarRepository this$0, final tg2.c<? super RedditSnoovatarRepository$saveAvatarRest$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.I((List)null, (Map)null, (b)null, false, (tg2.c)this);
    }
}
