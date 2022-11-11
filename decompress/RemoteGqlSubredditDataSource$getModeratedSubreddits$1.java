// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import java.util.Map;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.remote.RemoteGqlSubredditDataSource", f = "RemoteGqlSubredditDataSource.kt", l = { 324 }, m = "getModeratedSubreddits")
final class RemoteGqlSubredditDataSource$getModeratedSubreddits$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RemoteGqlSubredditDataSource this$0;
    
    public RemoteGqlSubredditDataSource$getModeratedSubreddits$1(final RemoteGqlSubredditDataSource this$0, final tg2.c<? super RemoteGqlSubredditDataSource$getModeratedSubreddits$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, (tg2.c)this);
    }
}
