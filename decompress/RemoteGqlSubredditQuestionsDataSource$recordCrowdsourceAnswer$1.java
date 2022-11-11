// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import java.util.List;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.remote.RemoteGqlSubredditQuestionsDataSource", f = "RemoteGqlSubredditQuestionsDataSource.kt", l = { 92 }, m = "recordCrowdsourceAnswer")
final class RemoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RemoteGqlSubredditQuestionsDataSource this$0;
    
    public RemoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1(final RemoteGqlSubredditQuestionsDataSource this$0, final tg2.c<? super RemoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, null, (tg2.c)this, false);
    }
}
