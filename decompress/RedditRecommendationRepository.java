// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import su2.a$b;
import java.util.concurrent.CancellationException;
import su2.a;
import com.reddit.domain.model.UpdateResponse;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import com.reddit.domain.model.recommendation.RecommendationPreferenceAction;
import javax.inject.Inject;
import sg2.e;
import ua0.k;
import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import com.reddit.data.remote.RemoteGqlRecommendationDataSource;
import xd0.u;

public final class RedditRecommendationRepository implements u
{
    public final RemoteGqlRecommendationDataSource a;
    public final RemoteAccountPreferenceDataSource b;
    public final k c;
    
    @Inject
    public RedditRecommendationRepository(final RemoteGqlRecommendationDataSource a, final RemoteAccountPreferenceDataSource b, final k c) {
        e.f((Object)a, "remoteGql");
        e.f((Object)b, "remoteAccountPreferenceDataSource");
        e.f((Object)c, "localAccountPreferenceDataSource");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final String s, final RecommendationPreferenceAction recommendationPreferenceAction, final c<? super Boolean> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditRecommendationRepository$updateSubredditRecommendationPreferences$1) {
                final RedditRecommendationRepository$updateSubredditRecommendationPreferences$1 redditRecommendationRepository$updateSubredditRecommendationPreferences$1 = (RedditRecommendationRepository$updateSubredditRecommendationPreferences$1)c;
                final int label = redditRecommendationRepository$updateSubredditRecommendationPreferences$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRecommendationRepository$updateSubredditRecommendationPreferences$1.label = label + Integer.MIN_VALUE;
                    o = redditRecommendationRepository$updateSubredditRecommendationPreferences$1;
                    break Label_0054;
                }
            }
            o = new RedditRecommendationRepository$updateSubredditRecommendationPreferences$1(this, (c)c);
        }
        final Object result = ((RedditRecommendationRepository$updateSubredditRecommendationPreferences$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditRecommendationRepository$updateSubredditRecommendationPreferences$1)o).label;
        final int n = 1;
        final boolean b = false;
        boolean b3 = false;
        Label_0113: {
            if (label2 == 0) {
                break Label_0113;
            }
            Label_0103: {
                if (label2 != 1) {
                    break Label_0103;
                }
                Label_0149: {
                    try {
                        yd.b.k0(result);
                        break Label_0149;
                    }
                    catch (final CancellationException ex) {
                        return;
                        yd.b.k0(result);
                        final RemoteGqlRecommendationDataSource a = this.a;
                        ((RedditRecommendationRepository$updateSubredditRecommendationPreferences$1)o).label = 1;
                        final Object b2;
                        iftrue(Label_0149:)((b2 = a.b(s, recommendationPreferenceAction, (c)o)) != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                        final UpdateResponse updateResponse = (UpdateResponse)b2;
                        final String errorMessage = updateResponse.getErrorMessage();
                        int n2 = n;
                        iftrue(Label_0186:)(errorMessage == null);
                        while (true) {
                            Block_10: {
                                while (true) {
                                    Block_8: {
                                        break Block_8;
                                        iftrue(Label_0231:)(n2 == 0);
                                        break Block_10;
                                    }
                                    iftrue(Label_0183:)(errorMessage.length() != 0);
                                    n2 = n;
                                    continue;
                                    Label_0183: {
                                        n2 = 0;
                                    }
                                    continue;
                                }
                                updateResponse.getSuccess();
                                return b3;
                            }
                            final a$b a2 = su2.a.a;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Subreddit recommendation preference update failed: ");
                            sb.append(updateResponse.getErrorMessage());
                            a2.d(sb.toString(), new Object[0]);
                            continue;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    finally {
                        su2.a.a.d("Subreddit recommendation preference update failed", new Object[0]);
                        b3 = b;
                    }
                }
            }
        }
        return b3;
    }
    
    public final Object b(final String s, final RecommendationPreferenceAction recommendationPreferenceAction, final c<? super Boolean> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1) {
                final RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1 redditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1 = (RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1)c;
                final int label = redditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1.label = label + Integer.MIN_VALUE;
                    o = redditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1;
                    break Label_0054;
                }
            }
            o = new RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1(this, (c)c);
        }
        final Object result = ((RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1)o).label;
        final int n = 1;
        boolean success = false;
        Label_0113: {
            if (label2 == 0) {
                break Label_0113;
            }
            Label_0103: {
                if (label2 != 1) {
                    break Label_0103;
                }
                Label_0149: {
                    try {
                        yd.b.k0(result);
                        break Label_0149;
                    }
                    catch (final CancellationException ex) {
                        return;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        Object a = null;
                        final UpdateResponse updateResponse = (UpdateResponse)a;
                        final String errorMessage = updateResponse.getErrorMessage();
                        int n2 = n;
                        iftrue(Label_0186:)(errorMessage == null);
                        iftrue(Label_0183:)(errorMessage.length() != 0);
                        RemoteGqlRecommendationDataSource a2;
                        a$b a3;
                        StringBuilder sb;
                        Label_0186:Block_10_Outer:
                        while (true) {
                            Block_9: {
                                break Block_9;
                                while (true) {
                                    while (true) {
                                        success = updateResponse.getSuccess();
                                        return success;
                                        Label_0183: {
                                            n2 = 0;
                                        }
                                        break Label_0186;
                                        yd.b.k0(result);
                                        a2 = this.a;
                                        ((RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1)o).label = 1;
                                        iftrue(Label_0149:)((a = a2.a(s, recommendationPreferenceAction, (c)o)) != coroutine_SUSPENDED);
                                        return coroutine_SUSPENDED;
                                        a3 = su2.a.a;
                                        sb = new StringBuilder();
                                        sb.append("Similar subreddit recommendation preference update failed: ");
                                        sb.append(updateResponse.getErrorMessage());
                                        a3.d(sb.toString(), new Object[0]);
                                        continue Block_10_Outer;
                                    }
                                    iftrue(Label_0231:)(n2 == 0);
                                    continue;
                                }
                            }
                            n2 = n;
                            continue Label_0186;
                        }
                    }
                    finally {
                        su2.a.a.d("Similar subreddit recommendation preference update failed", new Object[0]);
                    }
                }
            }
        }
        return success;
    }
    
    public final Object c(final String s, final RecommendationPreferenceAction recommendationPreferenceAction, final c<? super Boolean> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditRecommendationRepository$updateTopicRecommendationPreferences$1) {
                final RedditRecommendationRepository$updateTopicRecommendationPreferences$1 redditRecommendationRepository$updateTopicRecommendationPreferences$1 = (RedditRecommendationRepository$updateTopicRecommendationPreferences$1)c;
                final int label = redditRecommendationRepository$updateTopicRecommendationPreferences$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRecommendationRepository$updateTopicRecommendationPreferences$1.label = label + Integer.MIN_VALUE;
                    o = redditRecommendationRepository$updateTopicRecommendationPreferences$1;
                    break Label_0054;
                }
            }
            o = new RedditRecommendationRepository$updateTopicRecommendationPreferences$1(this, (c)c);
        }
        final Object result = ((RedditRecommendationRepository$updateTopicRecommendationPreferences$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditRecommendationRepository$updateTopicRecommendationPreferences$1)o).label;
        final int n = 1;
        boolean success = false;
        Label_0113: {
            if (label2 == 0) {
                break Label_0113;
            }
            Label_0103: {
                if (label2 != 1) {
                    break Label_0103;
                }
                Label_0149: {
                    try {
                        yd.b.k0(result);
                        break Label_0149;
                    }
                    catch (final CancellationException ex) {
                        return;
                        while (true) {
                            UpdateResponse updateResponse = null;
                        Block_10:
                            while (true) {
                                int n2 = 0;
                                iftrue(Label_0231:)(n2 == 0);
                                break Block_10;
                                final Object c2;
                                updateResponse = (UpdateResponse)c2;
                                final String errorMessage = updateResponse.getErrorMessage();
                                n2 = n;
                                iftrue(Label_0186:)(errorMessage == null);
                                Block_8: {
                                    break Block_8;
                                    yd.b.k0(result);
                                    final RemoteGqlRecommendationDataSource a = this.a;
                                    ((RedditRecommendationRepository$updateTopicRecommendationPreferences$1)o).label = 1;
                                    iftrue(Label_0149:)((c2 = a.c(s, recommendationPreferenceAction, (c)o)) != coroutine_SUSPENDED);
                                    return coroutine_SUSPENDED;
                                    Label_0183: {
                                        n2 = 0;
                                    }
                                    continue;
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    success = updateResponse.getSuccess();
                                    return success;
                                }
                                iftrue(Label_0183:)(errorMessage.length() != 0);
                                n2 = n;
                                continue;
                            }
                            final a$b a2 = su2.a.a;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Topic recommendation preference update failed: ");
                            sb.append(updateResponse.getErrorMessage());
                            a2.d(sb.toString(), new Object[0]);
                            continue;
                        }
                    }
                    finally {
                        su2.a.a.d("Topic recommendation preference update failed", new Object[0]);
                    }
                }
            }
        }
        return success;
    }
}
