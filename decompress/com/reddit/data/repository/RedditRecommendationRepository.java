// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import pu2.a$b;
import java.util.concurrent.CancellationException;
import pu2.a;
import com.reddit.domain.model.UpdateResponse;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import com.reddit.domain.model.recommendation.RecommendationPreferenceAction;
import javax.inject.Inject;
import ng2.e;
import va0.k;
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
    
    @Override
    public final Object a(final String s, final RecommendationPreferenceAction recommendationPreferenceAction, final c<? super Boolean> c) {
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
                        d.b4(result);
                        break Label_0149;
                    }
                    catch (final CancellationException ex) {
                        return;
                    Block_8_Outer:
                        while (true) {
                            UpdateResponse updateResponse = null;
                            Block_10: {
                                while (true) {
                                    while (true) {
                                        while (true) {
                                            final int n2 = n;
                                            iftrue(Label_0231:)(n2 == 0);
                                            break Block_10;
                                            updateResponse.getSuccess();
                                            return b2;
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            final String errorMessage;
                                            iftrue(Label_0183:)(errorMessage.length() != 0);
                                            continue Block_8_Outer;
                                        }
                                        Label_0183: {
                                            final int n2 = 0;
                                        }
                                        continue Block_8_Outer;
                                    }
                                    final Object c2;
                                    updateResponse = (UpdateResponse)c2;
                                    final String errorMessage = updateResponse.getErrorMessage();
                                    final int n2 = n;
                                    iftrue(Label_0186:)(errorMessage == null);
                                    continue;
                                }
                                d.b4(result);
                                final RemoteGqlRecommendationDataSource a = this.a;
                                ((RedditRecommendationRepository$updateTopicRecommendationPreferences$1)o).label = 1;
                                final Object c2;
                                iftrue(Label_0149:)((c2 = a.c(s, recommendationPreferenceAction, (c)o)) != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                            }
                            final a$b a2 = pu2.a.a;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Topic recommendation preference update failed: ");
                            sb.append(updateResponse.getErrorMessage());
                            a2.d(sb.toString(), new Object[0]);
                            continue;
                        }
                    }
                    finally {
                        pu2.a.a.d("Topic recommendation preference update failed", new Object[0]);
                        b2 = b;
                    }
                }
            }
        }
        return b2;
    }
    
    @Override
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
                        d.b4(result);
                        break Label_0149;
                    }
                    catch (final CancellationException ex) {
                        return;
                        while (true) {
                            int n2 = 0;
                            Label_0186: {
                                UpdateResponse updateResponse;
                                while (true) {
                                    final String errorMessage;
                                    iftrue(Label_0183:)(errorMessage.length() != 0);
                                    n2 = n;
                                    break Label_0186;
                                    d.b4(result);
                                    final RemoteGqlRecommendationDataSource a = this.a;
                                    ((RedditRecommendationRepository$updateSimilarSubredditRecommendationPreferences$1)o).label = 1;
                                    final Object a2;
                                    iftrue(Label_0149:)((a2 = a.a(s, recommendationPreferenceAction, (c)o)) != coroutine_SUSPENDED);
                                    return coroutine_SUSPENDED;
                                    Label_0183: {
                                        n2 = 0;
                                    }
                                    break Label_0186;
                                    updateResponse = (UpdateResponse)a2;
                                    errorMessage = updateResponse.getErrorMessage();
                                    n2 = n;
                                    iftrue(Label_0186:)(errorMessage == null);
                                    continue;
                                }
                                final a$b a3 = pu2.a.a;
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Similar subreddit recommendation preference update failed: ");
                                sb.append(updateResponse.getErrorMessage());
                                a3.d(sb.toString(), new Object[0]);
                                Label_0231: {
                                    break Label_0231;
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                success = updateResponse.getSuccess();
                                return success;
                            }
                            iftrue(Label_0231:)(n2 == 0);
                            continue;
                        }
                    }
                    finally {
                        pu2.a.a.d("Similar subreddit recommendation preference update failed", new Object[0]);
                    }
                }
            }
        }
        return success;
    }
    
    @Override
    public final Object c(final String s, final RecommendationPreferenceAction recommendationPreferenceAction, final c<? super Boolean> c) {
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
                        d.b4(result);
                        break Label_0149;
                    }
                    catch (final CancellationException ex) {
                        return;
                        while (true) {
                            UpdateResponse updateResponse = null;
                            Block_10: {
                                while (true) {
                                    Object b;
                                    while (true) {
                                        int n2 = 0;
                                        iftrue(Label_0231:)(n2 == 0);
                                        break Block_10;
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        final String errorMessage;
                                        iftrue(Label_0183:)(errorMessage.length() != 0);
                                        Block_9: {
                                            break Block_9;
                                            d.b4(result);
                                            final RemoteGqlRecommendationDataSource a = this.a;
                                            ((RedditRecommendationRepository$updateSubredditRecommendationPreferences$1)o).label = 1;
                                            iftrue(Label_0149:)((b = a.b(s, recommendationPreferenceAction, (c)o)) != coroutine_SUSPENDED);
                                            return coroutine_SUSPENDED;
                                            Label_0183: {
                                                n2 = 0;
                                            }
                                            continue;
                                            success = updateResponse.getSuccess();
                                            return success;
                                        }
                                        n2 = n;
                                        continue;
                                    }
                                    updateResponse = (UpdateResponse)b;
                                    final String errorMessage = updateResponse.getErrorMessage();
                                    int n2 = n;
                                    iftrue(Label_0186:)(errorMessage == null);
                                    continue;
                                }
                            }
                            final a$b a2 = pu2.a.a;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Subreddit recommendation preference update failed: ");
                            sb.append(updateResponse.getErrorMessage());
                            a2.d(sb.toString(), new Object[0]);
                            continue;
                        }
                    }
                    finally {
                        pu2.a.a.d("Subreddit recommendation preference update failed", new Object[0]);
                    }
                }
            }
        }
        return success;
    }
}
