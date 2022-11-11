// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions;

import xd0.d;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.predictions.RemoteGqlPredictionsDataSource", f = "RemoteGqlPredictionsDataSource.kt", l = { 348 }, m = "getSubredditPredictionsTournamentHeaderInfo")
final class RemoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RemoteGqlPredictionsDataSource this$0;
    
    public RemoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1(final RemoteGqlPredictionsDataSource this$0, final tg2.c<? super RemoteGqlPredictionsDataSource$getSubredditPredictionsTournamentHeaderInfo$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j(null, null, (tg2.c)this);
    }
}
