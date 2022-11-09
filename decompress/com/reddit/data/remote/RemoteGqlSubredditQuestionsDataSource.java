// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.mutations.SubredditRatingSurveySubmitResponseMutation$SubmitContentRatingSurvey;
import java.util.Set;
import com.reddit.mutations.SubredditRatingSurveySubmitResponseMutation$c;
import com.reddit.mutations.SubredditRatingSurveySubmitResponseMutation$b;
import com.reddit.mutations.SubredditRatingSurveySubmitResponseMutation;
import com.reddit.type.ContentRatingSurveyResponseInput;
import com.reddit.type.ContentRatingSurveyAnswerInput;
import com.reddit.domain.model.tagging.SubredditRatingSurveyAnswers;
import com.reddit.mutations.c5$d;
import com.reddit.mutations.c5$c;
import com.reddit.mutations.c5$b;
import com.reddit.mutations.c5;
import o22.f0;
import com.reddit.fragment.CommunityProgressButtonFragment;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$s$a;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$s;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$t;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$e;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$u;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$l;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$r;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$a;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$b;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$c;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$k;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$w;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$n;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$y;
import com.reddit.fragment.QuestionFragment$f;
import com.reddit.fragment.QuestionFragment$d;
import com.reddit.fragment.QuestionFragment$g;
import com.reddit.fragment.QuestionFragment$e;
import com.reddit.fragment.QuestionFragment$c;
import java.util.Iterator;
import com.reddit.fragment.QuestionFragment;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$ContentRatingSurvey;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$d;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$z;
import com.reddit.domain.model.tagging.CrowdsourceTaggingQuestion;
import com.reddit.domain.model.tagging.NewCommunityProgressModuleV2;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$g;
import com.reddit.type.CommunityProgressCardStatus;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$i;
import com.reddit.domain.model.tagging.NewCommunityProgressV2Card;
import com.reddit.domain.model.tagging.CommunityProgressBadge;
import kotlin.NoWhenBranchMatchedException;
import d60.d;
import com.reddit.domain.model.tagging.CommunityCompletionProgress;
import com.reddit.domain.model.tagging.NewCommunityProgressModule;
import java.util.Collection;
import com.reddit.domain.model.tagging.NewCommunityProgressCard;
import com.reddit.domain.model.mod.RepeatMode;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$h;
import com.reddit.domain.model.tagging.NewCommunityProgressButton;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$j;
import com.reddit.data.model.graphql.GqlAnswerableQuestionToCrowdsourceQuestionMapper;
import com.reddit.domain.model.tagging.SubredditRatingSurvey;
import com.reddit.domain.model.tagging.SubredditRatingSurveyResponse;
import com.reddit.type.ContentRatingSurveyResponseStatus;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$x;
import com.reddit.domain.model.tagging.SubredditRatingSurveyRatingReason;
import a2.b;
import com.reddit.domain.model.tagging.SubredditRatingSurveyRatingTag;
import com.reddit.fragment.QuestionFragment$b;
import com.reddit.fragment.QuestionFragment$j;
import com.reddit.domain.model.tagging.SubredditRatingSurveyQuestion;
import com.reddit.fragment.QuestionFragment$a;
import com.reddit.domain.model.tagging.SubredditRatingSurveyAnswer;
import java.util.ArrayList;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$v;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery$o;
import com.reddit.queries.SubredditQuestionsBySubredditNameQuery;
import com.reddit.domain.model.tagging.SubredditTaggingQuestions;
import com.reddit.mutations.u2$c;
import com.reddit.mutations.u2$d;
import com.reddit.mutations.u2$b;
import com.reddit.mutations.u2;
import o22.s0;
import h7.h$a;
import com.reddit.type.CommunityProgressModuleDismissAction;
import com.reddit.mutations.s2$c;
import com.reddit.mutations.s2$d;
import com.reddit.mutations.s2$b;
import com.reddit.mutations.s2;
import o22.r0;
import com.reddit.mutations.w$b;
import com.reddit.mutations.w$d;
import com.reddit.mutations.w$c;
import com.reddit.mutations.w;
import o22.n;
import java.util.List;
import com.reddit.mutations.u$b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.u$d;
import com.reddit.mutations.u$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.u;
import o22.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.UpdateResponse;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import x01.a;
import ur0.g;

public final class RemoteGqlSubredditQuestionsDataSource
{
    public final g a;
    public final a b;
    
    @Inject
    public RemoteGqlSubredditQuestionsDataSource(final g a, final a b) {
        f.f((Object)a, "graphQlClient");
        f.f((Object)b, "modFeatures");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(String b, final String s, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard$1) {
                final RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard$1 remoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard$1 = (RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard$1)c;
                final int label = remoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard$1)o).label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final u u = new u(new m(b, s));
            ((RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressCard$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)u, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final u$b a2 = ((u$c)b2).a;
        Object o2 = null;
        final String s2 = null;
        if (a2 != null) {
            final boolean b3 = a2.b;
            final List c2 = a2.c;
            b = s2;
            if (c2 != null) {
                final u$d u$d = (u$d)CollectionsKt___CollectionsKt.s1(c2);
                b = s2;
                if (u$d != null) {
                    b = u$d.b;
                }
            }
            o2 = new UpdateResponse(b3, b);
        }
        return o2;
    }
    
    public final Object b(String b, final String s, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule$1) {
                final RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule$1 remoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule$1 = (RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule$1)c;
                final int label = remoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule$1)o).label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final w w = new w(new n(b, s));
            ((RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule.RemoteGqlSubredditQuestionsDataSource$completeCommunityProgressModule$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)w, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final w$b a2 = ((w$c)b2).a;
        Object o2 = null;
        final String s2 = null;
        if (a2 != null) {
            final boolean b3 = a2.b;
            final List c2 = a2.c;
            b = s2;
            if (c2 != null) {
                final w$d w$d = (w$d)CollectionsKt___CollectionsKt.s1(c2);
                b = s2;
                if (w$d != null) {
                    b = w$d.b;
                }
            }
            o2 = new UpdateResponse(b3, b);
        }
        return o2;
    }
    
    public final Object c(String b, final String s, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard$1) {
                final RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard$1 remoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard$1 = (RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard$1)c;
                final int label = remoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard$1)o).label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final s2 s2 = new s2(new r0(b, s));
            ((RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissCommunityProgressCard$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)s2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final s2$c a2 = ((s2$b)b2).a;
        Object o2 = null;
        final String s3 = null;
        if (a2 != null) {
            final boolean b3 = a2.b;
            final List c2 = a2.c;
            b = s3;
            if (c2 != null) {
                final s2$d s2$d = (s2$d)CollectionsKt___CollectionsKt.s1(c2);
                b = s3;
                if (s2$d != null) {
                    b = s2$d.b;
                }
            }
            o2 = new UpdateResponse(b3, b);
        }
        return o2;
    }
    
    public final Object d(String b, final String s, final boolean b2, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard$1) {
                final RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard$1 remoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard$1 = (RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard$1)c;
                final int label = remoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard$1)o).label;
        Object b3;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b3 = result;
        }
        else {
            aj2.c.Q0(result);
            CommunityProgressModuleDismissAction communityProgressModuleDismissAction;
            if (b2) {
                communityProgressModuleDismissAction = CommunityProgressModuleDismissAction.CTA_BUTTON_CLICK;
            }
            else {
                communityProgressModuleDismissAction = CommunityProgressModuleDismissAction.HIDE_BUTTON_CLICK;
            }
            final g a = this.a;
            final u2 u2 = new u2(new s0(b, s, h$a.c((Object)communityProgressModuleDismissAction)));
            ((RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard.RemoteGqlSubredditQuestionsDataSource$dismissNewCommunityProgressCard$1)o).label = 1;
            if ((b3 = e$a.b(14, (k)u2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final u2$c a2 = ((u2$b)b3).a;
        final String s2 = null;
        UpdateResponse updateResponse;
        if (a2 != null) {
            final boolean b4 = a2.b;
            final List c2 = a2.c;
            b = s2;
            if (c2 != null) {
                final u2$d u2$d = (u2$d)CollectionsKt___CollectionsKt.s1(c2);
                b = s2;
                if (u2$d != null) {
                    b = u2$d.b;
                }
            }
            updateResponse = new UpdateResponse(b4, b);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
    
    public final Object e(String l$0, final c<? super SubredditTaggingQuestions> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions.RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1) {
                final RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions.RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1 remoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1 = (RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions.RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1)c;
                final int label = remoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions.RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions.RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions.RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1)o).label;
        String s;
        SubredditQuestionsBySubredditNameQuery$o subredditQuestionsBySubredditNameQuery$o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s = (String)((RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions.RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1)o).L$0;
            aj2.c.Q0(result);
            subredditQuestionsBySubredditNameQuery$o = (SubredditQuestionsBySubredditNameQuery$o)result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final SubredditQuestionsBySubredditNameQuery subredditQuestionsBySubredditNameQuery = new SubredditQuestionsBySubredditNameQuery(l$0, this.b.l7());
            ((RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions.RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1)o).L$0 = l$0;
            ((RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions.RemoteGqlSubredditQuestionsDataSource$loadSubredditQuestions$1)o).label = 1;
            final Object b = e$a.b(14, (k)subredditQuestionsBySubredditNameQuery, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            s = l$0;
            if ((subredditQuestionsBySubredditNameQuery$o = (SubredditQuestionsBySubredditNameQuery$o)b) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final SubredditQuestionsBySubredditNameQuery$z a2 = subredditQuestionsBySubredditNameQuery$o.a;
        if (a2 != null) {
            SubredditQuestionsBySubredditNameQuery$d b2 = a2.b;
            if (b2 != null) {
                SubredditQuestionsBySubredditNameQuery$ContentRatingSurvey b3 = b2.b;
                SubredditRatingSurvey subredditRatingSurvey;
                SubredditQuestionsBySubredditNameQuery$d subredditQuestionsBySubredditNameQuery$d6;
                if (b3 != null) {
                    l$0 = b3.getVersion();
                    final boolean eligible = b3.isEligible();
                    final SubredditQuestionsBySubredditNameQuery$v subredditQuestionsBySubredditNameQuery$v = (SubredditQuestionsBySubredditNameQuery$v)CollectionsKt___CollectionsKt.s1(b3.getQuestions());
                    SubredditQuestionsBySubredditNameQuery$ContentRatingSurvey subredditQuestionsBySubredditNameQuery$ContentRatingSurvey3;
                    SubredditRatingSurveyQuestion subredditRatingSurveyQuestion;
                    String s14;
                    SubredditQuestionsBySubredditNameQuery$d subredditQuestionsBySubredditNameQuery$d4;
                    String s15;
                    if (subredditQuestionsBySubredditNameQuery$v != null) {
                        QuestionFragment a3 = subredditQuestionsBySubredditNameQuery$v.b.a;
                        String b4 = a3.b;
                        String c2 = a3.c;
                        final List e = a3.e;
                        final ArrayList list = new ArrayList<SubredditRatingSurveyAnswer>(qg2.m.P0((Iterable)e, 10));
                        for (final QuestionFragment$a questionFragment$a : e) {
                            final QuestionFragment$c e2 = questionFragment$a.e;
                            QuestionFragment questionFragment;
                            SubredditRatingSurveyAnswer subredditRatingSurveyAnswer;
                            String s5;
                            SubredditQuestionsBySubredditNameQuery$d subredditQuestionsBySubredditNameQuery$d;
                            String s6;
                            SubredditQuestionsBySubredditNameQuery$ContentRatingSurvey subredditQuestionsBySubredditNameQuery$ContentRatingSurvey;
                            String s7;
                            String s8;
                            if (e2 != null) {
                                final String b5 = e2.b;
                                final String c3 = e2.c;
                                final boolean d = e2.d;
                                final List e3 = e2.e;
                                final ArrayList list2 = new ArrayList<SubredditRatingSurveyQuestion>(qg2.m.P0((Iterable)e3, 10));
                                for (final QuestionFragment$j questionFragment$j : e3) {
                                    final String b6 = questionFragment$j.b;
                                    final String c4 = questionFragment$j.c;
                                    final List e4 = questionFragment$j.e;
                                    final ArrayList list3 = new ArrayList<SubredditRatingSurveyAnswer.Leaf>(qg2.m.P0((Iterable)e4, 10));
                                    final Iterator iterator3 = e4.iterator();
                                    while (iterator3.hasNext()) {
                                        final QuestionFragment$e e5 = ((QuestionFragment$b)iterator3.next()).e;
                                        f.c((Object)e5);
                                        final String d2 = e5.d;
                                        final String e6 = e5.e;
                                        final boolean f = e5.f;
                                        final String b7 = e5.b;
                                        final QuestionFragment$g c5 = e5.c;
                                        list3.add(new SubredditRatingSurveyAnswer.Leaf(d2, e6, f, b7, new SubredditRatingSurveyRatingTag(c5.b.toString(), c5.c, c5.d, c5.e, c5.f.b.toString())));
                                    }
                                    list2.add(new SubredditRatingSurveyQuestion(b6, c4, (List<? extends SubredditRatingSurveyAnswer>)list3, "survey_question", questionFragment$j.d));
                                }
                                final String s2 = l$0;
                                questionFragment = a3;
                                final String s3 = b4;
                                final String s4 = c2;
                                subredditRatingSurveyAnswer = new SubredditRatingSurveyAnswer.Branch(b5, c3, d, (List<SubredditRatingSurveyQuestion>)list2);
                                s5 = s;
                                subredditQuestionsBySubredditNameQuery$d = b2;
                                s6 = s2;
                                subredditQuestionsBySubredditNameQuery$ContentRatingSurvey = b3;
                                s7 = s4;
                                s8 = s3;
                            }
                            else {
                                final String s9 = s;
                                final SubredditQuestionsBySubredditNameQuery$d subredditQuestionsBySubredditNameQuery$d2 = b2;
                                subredditQuestionsBySubredditNameQuery$ContentRatingSurvey = b3;
                                final String s10 = l$0;
                                questionFragment = a3;
                                s8 = b4;
                                s7 = c2;
                                final QuestionFragment$d f2 = questionFragment$a.f;
                                if (f2 == null) {
                                    throw new IllegalArgumentException(a2.b.j(new StringBuilder(), questionFragment$a.a, " is not supported"));
                                }
                                final String b8 = f2.b;
                                final String c6 = f2.c;
                                final boolean d3 = f2.d;
                                final String e7 = f2.e;
                                final QuestionFragment$f f3 = f2.f;
                                final SubredditRatingSurveyAnswer.Leaf leaf = new SubredditRatingSurveyAnswer.Leaf(b8, c6, d3, e7, new SubredditRatingSurveyRatingTag(f3.b.toString(), f3.c, f3.d, f3.e, f3.f.b.toString()));
                                s6 = s10;
                                subredditQuestionsBySubredditNameQuery$d = subredditQuestionsBySubredditNameQuery$d2;
                                s5 = s9;
                                subredditRatingSurveyAnswer = leaf;
                            }
                            list.add(subredditRatingSurveyAnswer);
                            final String s11 = s5;
                            final SubredditQuestionsBySubredditNameQuery$d subredditQuestionsBySubredditNameQuery$d3 = subredditQuestionsBySubredditNameQuery$d;
                            final SubredditQuestionsBySubredditNameQuery$ContentRatingSurvey subredditQuestionsBySubredditNameQuery$ContentRatingSurvey2 = subredditQuestionsBySubredditNameQuery$ContentRatingSurvey;
                            c2 = s7;
                            b4 = s8;
                            final QuestionFragment questionFragment2 = questionFragment;
                            s = s11;
                            b2 = subredditQuestionsBySubredditNameQuery$d3;
                            b3 = subredditQuestionsBySubredditNameQuery$ContentRatingSurvey2;
                            l$0 = s6;
                            a3 = questionFragment2;
                        }
                        final String s12 = s;
                        subredditQuestionsBySubredditNameQuery$ContentRatingSurvey3 = b3;
                        final String s13 = l$0;
                        subredditRatingSurveyQuestion = new SubredditRatingSurveyQuestion(b4, c2, (List<? extends SubredditRatingSurveyAnswer>)list, "mature_themes_prompt", a3.d);
                        s14 = s12;
                        subredditQuestionsBySubredditNameQuery$d4 = b2;
                        s15 = s13;
                    }
                    else {
                        final SubredditQuestionsBySubredditNameQuery$d subredditQuestionsBySubredditNameQuery$d5 = b2;
                        final SubredditRatingSurveyQuestion subredditRatingSurveyQuestion2 = null;
                        subredditQuestionsBySubredditNameQuery$ContentRatingSurvey3 = b3;
                        s15 = l$0;
                        subredditQuestionsBySubredditNameQuery$d4 = subredditQuestionsBySubredditNameQuery$d5;
                        s14 = s;
                        subredditRatingSurveyQuestion = subredditRatingSurveyQuestion2;
                    }
                    f.c((Object)subredditRatingSurveyQuestion);
                    final SubredditQuestionsBySubredditNameQuery$y response = subredditQuestionsBySubredditNameQuery$ContentRatingSurvey3.getResponse();
                    SubredditRatingSurveyResponse subredditRatingSurveyResponse;
                    if (response != null) {
                        final String b9 = response.b;
                        final String c7 = response.c;
                        final boolean e8 = response.e;
                        final List h = response.h;
                        final ArrayList list4 = new ArrayList<SubredditRatingSurveyRatingReason>(qg2.m.P0((Iterable)h, 10));
                        for (final SubredditQuestionsBySubredditNameQuery$x subredditQuestionsBySubredditNameQuery$x : h) {
                            final String b10 = subredditQuestionsBySubredditNameQuery$x.b;
                            final SubredditQuestionsBySubredditNameQuery$n c8 = subredditQuestionsBySubredditNameQuery$x.c;
                            list4.add(new SubredditRatingSurveyRatingReason(b10, new SubredditRatingSurveyRatingTag(c8.b.toString(), c8.c, c8.d, c8.e, c8.f.b.toString())));
                        }
                        final boolean b11 = response.f == ContentRatingSurveyResponseStatus.PENDING;
                        final SubredditQuestionsBySubredditNameQuery$w g = response.g;
                        subredditRatingSurveyResponse = new SubredditRatingSurveyResponse(b9, c7, e8, b11, new SubredditRatingSurveyRatingTag(g.b.toString(), g.c, g.d, g.e, g.f.b.toString()), (List<SubredditRatingSurveyRatingReason>)list4);
                    }
                    else {
                        subredditRatingSurveyResponse = null;
                    }
                    subredditRatingSurvey = new SubredditRatingSurvey(s15, subredditRatingSurveyQuestion, eligible, subredditRatingSurveyResponse);
                    s = s14;
                    subredditQuestionsBySubredditNameQuery$d6 = subredditQuestionsBySubredditNameQuery$d4;
                }
                else {
                    subredditQuestionsBySubredditNameQuery$d6 = b2;
                    subredditRatingSurvey = null;
                }
                final List map = GqlAnswerableQuestionToCrowdsourceQuestionMapper.INSTANCE.map(subredditQuestionsBySubredditNameQuery$d6.e.a, s);
                final SubredditQuestionsBySubredditNameQuery$k c9 = subredditQuestionsBySubredditNameQuery$d6.c;
                final String s16 = "";
                NewCommunityProgressModule newCommunityProgressModule = null;
                Label_1679: {
                    if (c9 != null) {
                        final List d4 = c9.d;
                        final ArrayList<Object> list5 = new ArrayList<Object>();
                        for (final SubredditQuestionsBySubredditNameQuery$j subredditQuestionsBySubredditNameQuery$j : d4) {
                            final List h2 = subredditQuestionsBySubredditNameQuery$j.h;
                            final ArrayList<NewCommunityProgressButton> list6 = new ArrayList<NewCommunityProgressButton>();
                            for (final SubredditQuestionsBySubredditNameQuery$h subredditQuestionsBySubredditNameQuery$h : h2) {
                                final SubredditQuestionsBySubredditNameQuery$c b12 = subredditQuestionsBySubredditNameQuery$h.b;
                                NewCommunityProgressButton newCommunityProgressButton;
                                if (b12 != null) {
                                    newCommunityProgressButton = new NewCommunityProgressButton.NewCommunityProgressUrlButton(b12.b, b12.c.toString());
                                }
                                else {
                                    final SubredditQuestionsBySubredditNameQuery$b c10 = subredditQuestionsBySubredditNameQuery$h.c;
                                    if (c10 != null) {
                                        newCommunityProgressButton = new NewCommunityProgressButton.NewCommunityProgressShareButton(c10.b);
                                    }
                                    else {
                                        final SubredditQuestionsBySubredditNameQuery$a d5 = subredditQuestionsBySubredditNameQuery$h.d;
                                        if (d5 != null) {
                                            final String b13 = d5.b;
                                            l$0 = d5.c;
                                            String s17;
                                            if ((s17 = l$0) == null) {
                                                s17 = "";
                                            }
                                            final SubredditQuestionsBySubredditNameQuery$r d6 = d5.d;
                                            if (d6 != null) {
                                                l$0 = d6.b;
                                            }
                                            else {
                                                l$0 = null;
                                            }
                                            String s18 = l$0;
                                            if (l$0 == null) {
                                                s18 = "";
                                            }
                                            RepeatMode weekly = RepeatMode.WEEKLY;
                                            if (d5.e == null) {
                                                weekly = null;
                                            }
                                            RepeatMode do_NOT_REPEAT = weekly;
                                            if (weekly == null) {
                                                do_NOT_REPEAT = RepeatMode.DO_NOT_REPEAT;
                                            }
                                            newCommunityProgressButton = new NewCommunityProgressButton.NewCommunityProgressCreatePostButton(b13, s17, s18, do_NOT_REPEAT);
                                        }
                                        else {
                                            newCommunityProgressButton = null;
                                        }
                                    }
                                }
                                if (newCommunityProgressButton != null) {
                                    list6.add(newCommunityProgressButton);
                                }
                            }
                            Object o2;
                            if (list6.isEmpty()) {
                                o2 = null;
                            }
                            else {
                                o2 = new NewCommunityProgressCard(subredditQuestionsBySubredditNameQuery$j.b, subredditQuestionsBySubredditNameQuery$j.c, subredditQuestionsBySubredditNameQuery$j.d, subredditQuestionsBySubredditNameQuery$j.e, subredditQuestionsBySubredditNameQuery$j.f, subredditQuestionsBySubredditNameQuery$j.g, list6);
                            }
                            if (o2 != null) {
                                list5.add(o2);
                            }
                        }
                        final ArrayList i2 = CollectionsKt___CollectionsKt.i2((Collection)list5);
                        if (!i2.isEmpty()) {
                            newCommunityProgressModule = new NewCommunityProgressModule(c9.b, c9.c, i2);
                            break Label_1679;
                        }
                    }
                    newCommunityProgressModule = null;
                }
                final SubredditQuestionsBySubredditNameQuery$l d7 = subredditQuestionsBySubredditNameQuery$d6.d;
                NewCommunityProgressModuleV2 newCommunityProgressModuleV2;
                if (d7 != null) {
                    final String b14 = d7.b;
                    final String c11 = d7.c;
                    final String d8 = d7.d;
                    final SubredditQuestionsBySubredditNameQuery$u e9 = d7.e;
                    final CommunityCompletionProgress communityCompletionProgress = new CommunityCompletionProgress(e9.b, e9.c);
                    final SubredditQuestionsBySubredditNameQuery$e f4 = d7.f;
                    final int b15 = f4.b;
                    final int n = d.a.a[((Enum)f4.c).ordinal()];
                    CommunityProgressBadge.Style style;
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            style = CommunityProgressBadge.Style.FILLED;
                        }
                        else {
                            style = CommunityProgressBadge.Style.FILLED;
                        }
                    }
                    else {
                        style = CommunityProgressBadge.Style.NUMBERED;
                    }
                    final CommunityProgressBadge communityProgressBadge = new CommunityProgressBadge(b15, style);
                    final boolean g2 = d7.g;
                    final List h3 = d7.h;
                    final ArrayList<NewCommunityProgressV2Card> list7 = new ArrayList<NewCommunityProgressV2Card>();
                    final Iterator iterator7 = h3.iterator();
                    l$0 = s16;
                    while (iterator7.hasNext()) {
                        final SubredditQuestionsBySubredditNameQuery$i subredditQuestionsBySubredditNameQuery$i = (SubredditQuestionsBySubredditNameQuery$i)iterator7.next();
                        final CommunityProgressCardStatus e10 = subredditQuestionsBySubredditNameQuery$i.e;
                        NewCommunityProgressV2Card newCommunityProgressV2Card;
                        if (e10 != CommunityProgressCardStatus.DISMISSED && e10 != CommunityProgressCardStatus.UNKNOWN__) {
                            final String b16 = subredditQuestionsBySubredditNameQuery$i.b;
                            final String c12 = subredditQuestionsBySubredditNameQuery$i.c;
                            final Object b17 = subredditQuestionsBySubredditNameQuery$i.d.b;
                            String string;
                            if (b17 != null) {
                                string = b17.toString();
                            }
                            else {
                                string = null;
                            }
                            String s19;
                            if (string == null) {
                                s19 = l$0;
                            }
                            else {
                                s19 = string;
                            }
                            final CommunityProgressCardStatus e11 = subredditQuestionsBySubredditNameQuery$i.e;
                            final int n2 = d.a.b[((Enum)e11).ordinal()];
                            NewCommunityProgressV2Card.Status status;
                            if (n2 != 1) {
                                if (n2 != 2) {
                                    if (n2 != 3) {
                                        final StringBuilder k = a.k("Unsupported status: ");
                                        k.append(e11.getRawValue());
                                        throw new IllegalStateException(k.toString());
                                    }
                                    status = NewCommunityProgressV2Card.Status.COMPLETED;
                                }
                                else {
                                    status = NewCommunityProgressV2Card.Status.ACTIONED;
                                }
                            }
                            else {
                                status = NewCommunityProgressV2Card.Status.INITIAL;
                            }
                            final SubredditQuestionsBySubredditNameQuery$t f5 = subredditQuestionsBySubredditNameQuery$i.f;
                            final CommunityCompletionProgress communityCompletionProgress2 = new CommunityCompletionProgress(f5.b, f5.c);
                            final SubredditQuestionsBySubredditNameQuery$s g3 = subredditQuestionsBySubredditNameQuery$i.g;
                            NewCommunityProgressButton a5 = null;
                            Label_2176: {
                                if (g3 != null) {
                                    final SubredditQuestionsBySubredditNameQuery$s$a b18 = g3.b;
                                    if (b18 != null) {
                                        final CommunityProgressButtonFragment a4 = b18.a;
                                        if (a4 != null && (a5 = d.a(a4)) != null) {
                                            break Label_2176;
                                        }
                                    }
                                }
                                final List j = subredditQuestionsBySubredditNameQuery$i.j;
                                final ArrayList<NewCommunityProgressButton> list8 = new ArrayList<NewCommunityProgressButton>();
                                final Iterator iterator8 = j.iterator();
                                while (iterator8.hasNext()) {
                                    final NewCommunityProgressButton a6 = d.a(((SubredditQuestionsBySubredditNameQuery$g)iterator8.next()).b.a);
                                    if (a6 != null) {
                                        list8.add(a6);
                                    }
                                }
                                a5 = (NewCommunityProgressButton)CollectionsKt___CollectionsKt.s1((List)list8);
                            }
                            newCommunityProgressV2Card = new NewCommunityProgressV2Card(b16, c12, s19, status, communityCompletionProgress2, a5, NewCommunityProgressV2Card.Icon.Companion.fromString(subredditQuestionsBySubredditNameQuery$i.h), subredditQuestionsBySubredditNameQuery$i.i);
                        }
                        else {
                            newCommunityProgressV2Card = null;
                        }
                        if (newCommunityProgressV2Card != null) {
                            list7.add(newCommunityProgressV2Card);
                        }
                    }
                    newCommunityProgressModuleV2 = new NewCommunityProgressModuleV2(b14, c11, d8, communityCompletionProgress, communityProgressBadge, g2, list7);
                }
                else {
                    newCommunityProgressModuleV2 = null;
                }
                return new SubredditTaggingQuestions(map, subredditRatingSurvey, newCommunityProgressModule, newCommunityProgressModuleV2);
            }
        }
        return new SubredditTaggingQuestions(null, null, null, null);
    }
    
    public final Object f(String b, final List list, final c c, final boolean b2) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1) {
                final RemoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1 remoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1 = (RemoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1)c;
                final int label = remoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1(this, (c<? super RemoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1>)c);
        }
        final Object result = ((RemoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1)o).label;
        Object b3;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b3 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final c5 c2 = new c5(new f0(b, b2, h$a.c((Object)list)));
            ((RemoteGqlSubredditQuestionsDataSource$recordCrowdsourceAnswer$1)o).label = 1;
            if ((b3 = e$a.b(14, (k)c2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final c5$d a2 = ((c5$b)b3).a;
        final String s = null;
        UpdateResponse updateResponse;
        if (a2 != null) {
            final boolean b4 = a2.b;
            final List c3 = a2.c;
            b = s;
            if (c3 != null) {
                final c5$c c5$c = (c5$c)CollectionsKt___CollectionsKt.s1(c3);
                b = s;
                if (c5$c != null) {
                    b = c5$c.b;
                }
            }
            updateResponse = new UpdateResponse(b4, b);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
    
    public final Object g(String b, final SubredditRatingSurveyAnswers subredditRatingSurveyAnswers, final c<? super UpdateResponse> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey.RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey$1) {
                final RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey.RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey$1 remoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey$1 = (RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey.RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey$1)c;
                final int label = remoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey.RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey.RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey.RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey$1)o).label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final String version = subredditRatingSurveyAnswers.getVersion();
            final Set<Map.Entry<String, List<String>>> entrySet = subredditRatingSurveyAnswers.getAnswers().entrySet();
            final ArrayList list = new ArrayList<ContentRatingSurveyAnswerInput>(qg2.m.P0((Iterable)entrySet, 10));
            for (final Map.Entry entry : entrySet) {
                list.add(new ContentRatingSurveyAnswerInput((String)entry.getKey(), (List)entry.getValue()));
            }
            final SubredditRatingSurveySubmitResponseMutation subredditRatingSurveySubmitResponseMutation = new SubredditRatingSurveySubmitResponseMutation(new ContentRatingSurveyResponseInput(b, version, list));
            ((RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey.RemoteGqlSubredditQuestionsDataSource$submitSubredditRatingSurvey$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)subredditRatingSurveySubmitResponseMutation, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final SubredditRatingSurveySubmitResponseMutation$SubmitContentRatingSurvey a2 = ((SubredditRatingSurveySubmitResponseMutation$b)b2).a;
        final String s = null;
        UpdateResponse updateResponse;
        if (a2 != null) {
            final boolean ok = a2.getOk();
            final List errors = a2.getErrors();
            b = s;
            if (errors != null) {
                final SubredditRatingSurveySubmitResponseMutation$c subredditRatingSurveySubmitResponseMutation$c = (SubredditRatingSurveySubmitResponseMutation$c)CollectionsKt___CollectionsKt.s1(errors);
                b = s;
                if (subredditRatingSurveySubmitResponseMutation$c != null) {
                    b = subredditRatingSurveySubmitResponseMutation$c.b;
                }
            }
            updateResponse = new UpdateResponse(ok, b);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
}
