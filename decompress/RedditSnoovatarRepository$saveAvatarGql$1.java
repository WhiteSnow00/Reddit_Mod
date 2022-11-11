// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository;

import java.util.Map;
import java.util.List;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.snoovatar.repository.RedditSnoovatarRepository", f = "RedditSnoovatarRepository.kt", l = { 256 }, m = "saveAvatarGql")
final class RedditSnoovatarRepository$saveAvatarGql$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditSnoovatarRepository this$0;
    
    public RedditSnoovatarRepository$saveAvatarGql$1(final RedditSnoovatarRepository this$0, final tg2.c<? super RedditSnoovatarRepository$saveAvatarGql$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.H((List)null, (Map)null, (tg2.c)this);
    }
}
