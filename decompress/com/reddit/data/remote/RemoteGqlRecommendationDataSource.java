// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import o22.o2;
import yd.a;
import com.reddit.mutations.g8$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.g8;
import h7.h;
import o22.t4;
import h7.h$a;
import o22.n2;
import com.reddit.data.model.mapper.InputVariableToGqlVariableMapperKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.UpdateResponse;
import tg2.c;
import com.reddit.domain.model.recommendation.RecommendationPreferenceAction;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class RemoteGqlRecommendationDataSource
{
    public final g a;
    
    @Inject
    public RemoteGqlRecommendationDataSource(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Object a(final String s, final RecommendationPreferenceAction recommendationPreferenceAction, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences$1) {
                final RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences$1 remoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences$1 = (RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences$1)c;
                final int label = remoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences$1(this, (c)c);
        }
        final Object result = ((RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final n2 n2 = new n2(s, InputVariableToGqlVariableMapperKt.toRecommendationPreference(recommendationPreferenceAction));
            final g a = this.a;
            final g8 g8 = new g8(new t4((h)null, h$a.c((Object)n2), (h)null, 5));
            ((RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSimilarSubredditRecommendationPreferences$1)o).label = 1;
            if ((b = e$a.b(14, (k)g8, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return yd.a.A0(((g8$b)b).a);
    }
    
    public final Object b(final String s, final RecommendationPreferenceAction recommendationPreferenceAction, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences$1) {
                final RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences$1 remoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences$1 = (RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences$1)c;
                final int label = remoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences$1(this, (c)c);
        }
        final Object result = ((RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final n2 n2 = new n2(s, InputVariableToGqlVariableMapperKt.toRecommendationPreference(recommendationPreferenceAction));
            final g a = this.a;
            final g8 g8 = new g8(new t4(h$a.c((Object)n2), (h)null, (h)null, 6));
            ((RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences.RemoteGqlRecommendationDataSource$updateSubredditRecommendationPreferences$1)o).label = 1;
            if ((b = e$a.b(14, (k)g8, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return yd.a.A0(((g8$b)b).a);
    }
    
    public final Object c(final String s, final RecommendationPreferenceAction recommendationPreferenceAction, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences.RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences$1) {
                final RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences.RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences$1 remoteGqlRecommendationDataSource$updateTopicRecommendationPreferences$1 = (RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences.RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences$1)c;
                final int label = remoteGqlRecommendationDataSource$updateTopicRecommendationPreferences$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlRecommendationDataSource$updateTopicRecommendationPreferences$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlRecommendationDataSource$updateTopicRecommendationPreferences$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences.RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences$1(this, (c)c);
        }
        final Object result = ((RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences.RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences.RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final o2 o2 = new o2(s, InputVariableToGqlVariableMapperKt.toRecommendationPreference(recommendationPreferenceAction));
            final g a = this.a;
            final g8 g8 = new g8(new t4((h)null, (h)null, h$a.c((Object)o2), 3));
            ((RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences.RemoteGqlRecommendationDataSource$updateTopicRecommendationPreferences$1)o).label = 1;
            if ((b = e$a.b(14, (k)g8, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return yd.a.A0(((g8$b)b).a);
    }
}
