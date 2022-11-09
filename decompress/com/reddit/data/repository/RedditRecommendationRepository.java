// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import bv2.a$b;
import java.util.concurrent.CancellationException;
import com.reddit.domain.model.UpdateResponse;
import bv2.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import com.reddit.domain.model.recommendation.RecommendationPreferenceAction;
import javax.inject.Inject;
import ah2.f;
import cb0.k;
import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import com.reddit.data.remote.RemoteGqlRecommendationDataSource;
import ge0.c0;

public final class RedditRecommendationRepository implements c0
{
    public final RemoteGqlRecommendationDataSource a;
    public final RemoteAccountPreferenceDataSource b;
    public final k c;
    
    @Inject
    public RedditRecommendationRepository(final RemoteGqlRecommendationDataSource a, final RemoteAccountPreferenceDataSource b, final k c) {
        f.f((Object)a, "remoteGql");
        f.f((Object)b, "remoteAccountPreferenceDataSource");
        f.f((Object)c, "localAccountPreferenceDataSource");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final String s, final RecommendationPreferenceAction recommendationPreferenceAction, final c<? super Boolean> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences.RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1) {
                final RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences.RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1 redditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1 = (RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences.RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1)c;
                final int label = redditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1.label = label + Integer.MIN_VALUE;
                    o = redditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1;
                    break Label_0054;
                }
            }
            o = new RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences.RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1(this, (c)c);
        }
        final Object result = ((RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences.RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences.RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1)o).label;
        final int n = 1;
        final boolean b = false;
        boolean b2 = false;
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
                        aj2.c.Q0(result);
                        break Label_0149;
                    }
                    catch (final CancellationException ex) {
                        return;
                        int n2 = 0;
                        Label_0183: {
                            n2 = 0;
                        }
                    Label_0231_Outer:
                        while (true) {
                            while (true) {
                                final UpdateResponse updateResponse;
                                Label_0186: {
                                    break Label_0186;
                                    n2 = n;
                                    break Label_0186;
                                    updateResponse.getSuccess();
                                    return b2;
                                }
                                iftrue(Label_0231:)(n2 == 0);
                                Block_10: {
                                    break Block_10;
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                final a$b a = bv2.a.a;
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Similar subreddit recommendation preference update failed: ");
                                sb.append(updateResponse.getErrorMessage());
                                a.d(sb.toString(), new Object[0]);
                                continue;
                            }
                            final Object a2;
                            final UpdateResponse updateResponse = (UpdateResponse)a2;
                            final String errorMessage = updateResponse.getErrorMessage();
                            n2 = n;
                            iftrue(Label_0186:)(errorMessage == null);
                            Block_8: {
                                break Block_8;
                                aj2.c.Q0(result);
                                final RemoteGqlRecommendationDataSource a3 = this.a;
                                ((RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences.RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1)o).label = 1;
                                iftrue(Label_0149:)((a2 = a3.a(s, recommendationPreferenceAction, (c<? super UpdateResponse>)o)) != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                            }
                            iftrue(Label_0183:)(errorMessage.length() != 0);
                            continue Label_0231_Outer;
                        }
                    }
                    finally {
                        bv2.a.a.d("Similar subreddit recommendation preference update failed", new Object[0]);
                        b2 = b;
                    }
                }
            }
        }
        return b2;
    }
    
    public final Object b(final String s, final RecommendationPreferenceAction recommendationPreferenceAction, final c<? super Boolean> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditRecommendationRepository$updateTopicRecommendationPreferences.RedditRecommendationRepository$updateTopicRecommendationPreferences$1) {
                final RedditRecommendationRepository$updateTopicRecommendationPreferences.RedditRecommendationRepository$updateTopicRecommendationPreferences$1 redditRecommendationRepository$updateTopicRecommendationPreferences$1 = (RedditRecommendationRepository$updateTopicRecommendationPreferences.RedditRecommendationRepository$updateTopicRecommendationPreferences$1)c;
                final int label = redditRecommendationRepository$updateTopicRecommendationPreferences$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRecommendationRepository$updateTopicRecommendationPreferences$1.label = label + Integer.MIN_VALUE;
                    o = redditRecommendationRepository$updateTopicRecommendationPreferences$1;
                    break Label_0054;
                }
            }
            o = new RedditRecommendationRepository$updateTopicRecommendationPreferences.RedditRecommendationRepository$updateTopicRecommendationPreferences$1(this, (c)c);
        }
        final Object result = ((RedditRecommendationRepository$updateTopicRecommendationPreferences.RedditRecommendationRepository$updateTopicRecommendationPreferences$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditRecommendationRepository$updateTopicRecommendationPreferences.RedditRecommendationRepository$updateTopicRecommendationPreferences$1)o).label;
        final int n = 1;
        final boolean b = false;
        boolean b2 = false;
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
                        aj2.c.Q0(result);
                        break Label_0149;
                    }
                    catch (final CancellationException ex) {
                        return;
                        UpdateResponse updateResponse = null;
                        Label_0231: {
                            while (true) {
                            Block_9:
                                while (true) {
                                    final a$b a = bv2.a.a;
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Topic recommendation preference update failed: ");
                                    sb.append(updateResponse.getErrorMessage());
                                    a.d(sb.toString(), new Object[0]);
                                    break Label_0231;
                                    final Object c2;
                                    updateResponse = (UpdateResponse)c2;
                                    final String errorMessage = updateResponse.getErrorMessage();
                                    int n2 = n;
                                    iftrue(Label_0186:)(errorMessage == null);
                                    iftrue(Label_0183:)(errorMessage.length() != 0);
                                    break Block_9;
                                    Label_0183: {
                                        n2 = 0;
                                    }
                                    iftrue(Label_0231:)(n2 == 0);
                                    continue;
                                }
                                int n2 = n;
                                continue;
                            }
                        }
                        updateResponse.getSuccess();
                        return b2;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        aj2.c.Q0(result);
                        final RemoteGqlRecommendationDataSource a2 = this.a;
                        ((RedditRecommendationRepository$updateTopicRecommendationPreferences.RedditRecommendationRepository$updateTopicRecommendationPreferences$1)o).label = 1;
                        final Object c2;
                        iftrue(Label_0149:)((c2 = a2.c(s, recommendationPreferenceAction, (c<? super UpdateResponse>)o)) != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                    }
                    finally {
                        bv2.a.a.d("Topic recommendation preference update failed", new Object[0]);
                        b2 = b;
                    }
                }
            }
        }
        return b2;
    }
    
    public final Object c(final String s, final RecommendationPreferenceAction recommendationPreferenceAction, final c<? super Boolean> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditRecommendationRepository$updateSubredditRecommendationPreferences.RedditRecommendationRepository$updateSubredditRecommendationPreferences$1) {
                final RedditRecommendationRepository$updateSubredditRecommendationPreferences.RedditRecommendationRepository$updateSubredditRecommendationPreferences$1 redditRecommendationRepository$updateSubredditRecommendationPreferences$1 = (RedditRecommendationRepository$updateSubredditRecommendationPreferences.RedditRecommendationRepository$updateSubredditRecommendationPreferences$1)c;
                final int label = redditRecommendationRepository$updateSubredditRecommendationPreferences$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRecommendationRepository$updateSubredditRecommendationPreferences$1.label = label + Integer.MIN_VALUE;
                    o = redditRecommendationRepository$updateSubredditRecommendationPreferences$1;
                    break Label_0054;
                }
            }
            o = new RedditRecommendationRepository$updateSubredditRecommendationPreferences.RedditRecommendationRepository$updateSubredditRecommendationPreferences$1(this, (c)c);
        }
        final Object result = ((RedditRecommendationRepository$updateSubredditRecommendationPreferences.RedditRecommendationRepository$updateSubredditRecommendationPreferences$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditRecommendationRepository$updateSubredditRecommendationPreferences.RedditRecommendationRepository$updateSubredditRecommendationPreferences$1)o).label;
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
                        aj2.c.Q0(result);
                        break Label_0149;
                    }
                    catch (final CancellationException ex) {
                        return;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        while (true) {
                            UpdateResponse updateResponse = null;
                        Block_10:
                            while (true) {
                                int n2 = 0;
                                iftrue(Label_0231:)(n2 == 0);
                                break Block_10;
                                final Object b;
                                updateResponse = (UpdateResponse)b;
                                final String errorMessage = updateResponse.getErrorMessage();
                                n2 = n;
                                iftrue(Label_0186:)(errorMessage == null);
                                Block_8: {
                                    break Block_8;
                                    success = updateResponse.getSuccess();
                                    return success;
                                }
                                iftrue(Label_0183:)(errorMessage.length() != 0);
                                Block_9: {
                                    break Block_9;
                                    aj2.c.Q0(result);
                                    final RemoteGqlRecommendationDataSource a = this.a;
                                    ((RedditRecommendationRepository$updateSubredditRecommendationPreferences.RedditRecommendationRepository$updateSubredditRecommendationPreferences$1)o).label = 1;
                                    iftrue(Label_0149:)((b = a.b(s, recommendationPreferenceAction, (c<? super UpdateResponse>)o)) != coroutine_SUSPENDED);
                                    return coroutine_SUSPENDED;
                                    Label_0183: {
                                        n2 = 0;
                                    }
                                    continue;
                                }
                                n2 = n;
                                continue;
                            }
                            final a$b a2 = bv2.a.a;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Subreddit recommendation preference update failed: ");
                            sb.append(updateResponse.getErrorMessage());
                            a2.d(sb.toString(), new Object[0]);
                            continue;
                        }
                    }
                    finally {
                        bv2.a.a.d("Subreddit recommendation preference update failed", new Object[0]);
                    }
                }
            }
        }
        return success;
    }
}
