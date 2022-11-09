// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.local.LocalRedditCrowdsourceTaggingQuestionsDataSource", f = "LocalRedditCrowdsourceTaggingQuestionsDataSource.kt", l = { 48 }, m = "getQuestions")
final class LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalRedditCrowdsourceTaggingQuestionsDataSource this$0;
    
    public LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3(final LocalRedditCrowdsourceTaggingQuestionsDataSource this$0, final tg2.c<? super LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.n(null, (tg2.c)this);
    }
}
