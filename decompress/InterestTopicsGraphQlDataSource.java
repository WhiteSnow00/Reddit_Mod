// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.onboardingtopic;

import com.reddit.queries.t6$h;
import com.reddit.queries.t6$e;
import com.reddit.queries.t6$d;
import com.reddit.queries.t6$g;
import qg2.m;
import com.reddit.queries.t6$c;
import com.reddit.queries.t6$b;
import com.reddit.queries.t6;
import com.reddit.domain.onboardingModel.InterestTopics;
import com.reddit.mutations.g9$d;
import com.reddit.mutations.g9$c;
import com.reddit.mutations.g9$b;
import com.reddit.mutations.g9;
import o22.t3;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.UpdateResponse;
import java.util.Set;
import com.reddit.fragment.InterestTopicRecommendationsFragment$d;
import com.reddit.fragment.InterestTopicRecommendationsFragment$b;
import com.reddit.fragment.InterestTopicRecommendationsFragment$c;
import com.reddit.fragment.InterestTopicRecommendationsFragment;
import com.reddit.queries.t5$c$a;
import com.reddit.queries.t5$c;
import h7.h;
import com.reddit.domain.model.topic.InterestTopic;
import com.reddit.fragment.InterestTopicRecommendationsFragment$a;
import ah2.f;
import com.reddit.queries.t5$b;
import com.reddit.queries.t5;
import com.reddit.queries.m8$d;
import com.reddit.queries.m8$g;
import com.reddit.queries.m8$f;
import com.reddit.queries.m8$e;
import com.reddit.queries.m8$c;
import com.reddit.queries.m8$b;
import com.reddit.queries.m8;
import com.reddit.queries.InterestTopicsByIdsQuery$f;
import com.reddit.queries.InterestTopicsByIdsQuery$i;
import com.reddit.queries.InterestTopicsByIdsQuery$g;
import com.reddit.queries.InterestTopicsByIdsQuery$j;
import com.reddit.queries.InterestTopicsByIdsQuery$k;
import com.reddit.queries.InterestTopicsByIdsQuery$h;
import java.util.Iterator;
import com.reddit.queries.InterestTopicsByIdsQuery$e;
import gd0.b;
import kotlin.collections.EmptyList;
import com.reddit.queries.InterestTopicsByIdsQuery$c;
import com.reddit.queries.InterestTopicsByIdsQuery$d;
import java.util.ArrayList;
import com.reddit.queries.InterestTopicsByIdsQuery$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.InterestTopicsByIdsQuery;
import h7.h$a;
import com.reddit.type.OnboardingFlow$a;
import com.reddit.type.OnboardingFlow;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import com.reddit.domain.onboardingflow.OnboardingFlowType;
import java.util.List;
import javax.inject.Inject;
import r50.c;
import ur0.g;
import r50.a;

public final class InterestTopicsGraphQlDataSource implements a
{
    public final g a;
    public final c b;
    
    @Inject
    public InterestTopicsGraphQlDataSource(final g a, final c b) {
        this.a = a;
        this.b = b;
    }
    
    public final Serializable a(String d, final int n, final List list, final OnboardingFlowType onboardingFlowType, final tg2.c c) {
        Object o = null;
        Label_0059: {
            if (c instanceof InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1) {
                final InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1 interestTopicsGraphQlDataSource$getInterestTopicsByIds$1 = (InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1)c;
                final int label = interestTopicsGraphQlDataSource$getInterestTopicsByIds$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    interestTopicsGraphQlDataSource$getInterestTopicsByIds$1.label = label + Integer.MIN_VALUE;
                    o = interestTopicsGraphQlDataSource$getInterestTopicsByIds$1;
                    break Label_0059;
                }
            }
            o = new InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1(this, (tg2.c<? super InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1>)c);
        }
        final Object result = ((InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1)o).label;
        InterestTopicsGraphQlDataSource interestTopicsGraphQlDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interestTopicsGraphQlDataSource = (InterestTopicsGraphQlDataSource)((InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            OnboardingFlow a2 = null;
            Label_0167: {
                if (onboardingFlowType != null) {
                    final String name = onboardingFlowType.name();
                    if (name != null) {
                        OnboardingFlow.Companion.getClass();
                        a2 = OnboardingFlow$a.a(name);
                        break Label_0167;
                    }
                }
                a2 = null;
            }
            final InterestTopicsByIdsQuery interestTopicsByIdsQuery = new InterestTopicsByIdsQuery(d, n, list, h$a.c((Object)a2));
            ((InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1)o).L$0 = this;
            ((InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1)o).label = 1;
            b = e$a.b(14, (k)interestTopicsByIdsQuery, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            interestTopicsGraphQlDataSource = this;
        }
        final InterestTopicsByIdsQuery$b interestTopicsByIdsQuery$b = (InterestTopicsByIdsQuery$b)b;
        interestTopicsGraphQlDataSource.b.getClass();
        if (interestTopicsByIdsQuery$b != null) {
            final InterestTopicsByIdsQuery$e a3 = interestTopicsByIdsQuery$b.a;
            if (a3 != null) {
                final List b2 = a3.b;
                if (b2 != null) {
                    final ArrayList<Object> list2 = new ArrayList<Object>();
                    final Iterator iterator = b2.iterator();
                    while (true) {
                        final Object instance = list2;
                        if (!iterator.hasNext()) {
                            return (Serializable)instance;
                        }
                        final InterestTopicsByIdsQuery$d interestTopicsByIdsQuery$d = (InterestTopicsByIdsQuery$d)iterator.next();
                        Object o5 = null;
                        Label_0698: {
                            if (interestTopicsByIdsQuery$d != null) {
                                final InterestTopicsByIdsQuery$h b3 = interestTopicsByIdsQuery$d.b;
                                if (b3 != null) {
                                    final String b4 = b3.b;
                                    if (b4 != null) {
                                        final InterestTopicsByIdsQuery$k c2 = b3.c;
                                        if (c2 != null) {
                                            final String b5 = c2.b;
                                            if (b5 != null) {
                                                final String c3 = c2.c;
                                                if (c3 != null) {
                                                    final InterestTopicsByIdsQuery$j d2 = c2.d;
                                                    Object instance2 = null;
                                                    Label_0666: {
                                                        if (d2 != null) {
                                                            final List b6 = d2.b;
                                                            if (b6 != null) {
                                                                final ArrayList<Object> list3 = new ArrayList<Object>();
                                                                final Iterator iterator2 = b6.iterator();
                                                                while (true) {
                                                                    instance2 = list3;
                                                                    if (!iterator2.hasNext()) {
                                                                        break Label_0666;
                                                                    }
                                                                    final InterestTopicsByIdsQuery$c interestTopicsByIdsQuery$c = (InterestTopicsByIdsQuery$c)iterator2.next();
                                                                    Object o4 = null;
                                                                    Label_0648: {
                                                                        if (interestTopicsByIdsQuery$c != null) {
                                                                            final InterestTopicsByIdsQuery$g b7 = interestTopicsByIdsQuery$c.b;
                                                                            if (b7 != null) {
                                                                                final String b8 = b7.b;
                                                                                final String c4 = b7.c;
                                                                                d = b7.d;
                                                                                String s;
                                                                                if ((s = d) == null) {
                                                                                    s = "";
                                                                                }
                                                                                final InterestTopicsByIdsQuery$i g = b7.g;
                                                                                Object o2 = null;
                                                                                Label_0515: {
                                                                                    if (g == null || (o2 = g.d) == null) {
                                                                                        if (g != null) {
                                                                                            final InterestTopicsByIdsQuery$f e = g.e;
                                                                                            if (e != null) {
                                                                                                o2 = e.b;
                                                                                                break Label_0515;
                                                                                            }
                                                                                        }
                                                                                        o2 = null;
                                                                                    }
                                                                                }
                                                                                String s2;
                                                                                if (o2 instanceof String) {
                                                                                    s2 = (String)o2;
                                                                                }
                                                                                else {
                                                                                    s2 = null;
                                                                                }
                                                                                Object o3;
                                                                                if (g == null || (o3 = g.b) == null) {
                                                                                    if (g != null) {
                                                                                        o3 = g.c;
                                                                                    }
                                                                                    else {
                                                                                        o3 = null;
                                                                                    }
                                                                                }
                                                                                if (o3 instanceof String) {
                                                                                    d = (String)o3;
                                                                                }
                                                                                else {
                                                                                    d = null;
                                                                                }
                                                                                final long n2 = (long)b7.e;
                                                                                final Object f = b7.f;
                                                                                String s3;
                                                                                if (f instanceof String) {
                                                                                    s3 = (String)f;
                                                                                }
                                                                                else {
                                                                                    s3 = null;
                                                                                }
                                                                                o4 = new gd0.a(b8, c4, s, s2, d, n2, s3);
                                                                                break Label_0648;
                                                                            }
                                                                        }
                                                                        o4 = null;
                                                                    }
                                                                    if (o4 == null) {
                                                                        continue;
                                                                    }
                                                                    list3.add(o4);
                                                                }
                                                            }
                                                        }
                                                        instance2 = EmptyList.INSTANCE;
                                                    }
                                                    if (!((List)instance2).isEmpty()) {
                                                        o5 = new b(b4, b5, c3, (List)instance2);
                                                        break Label_0698;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            o5 = null;
                        }
                        if (o5 == null) {
                            continue;
                        }
                        list2.add(o5);
                    }
                }
            }
        }
        final Object instance = EmptyList.INSTANCE;
        return (Serializable)instance;
    }
    
    public final Serializable b(final int n, final tg2.c c) {
        Object o = null;
        Label_0050: {
            if (c instanceof InterestTopicsGraphQlDataSource$getNearbySubreddits$1) {
                final InterestTopicsGraphQlDataSource$getNearbySubreddits$1 interestTopicsGraphQlDataSource$getNearbySubreddits$1 = (InterestTopicsGraphQlDataSource$getNearbySubreddits$1)c;
                final int label = interestTopicsGraphQlDataSource$getNearbySubreddits$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    interestTopicsGraphQlDataSource$getNearbySubreddits$1.label = label + Integer.MIN_VALUE;
                    o = interestTopicsGraphQlDataSource$getNearbySubreddits$1;
                    break Label_0050;
                }
            }
            o = new InterestTopicsGraphQlDataSource$getNearbySubreddits$1(this, (tg2.c<? super InterestTopicsGraphQlDataSource$getNearbySubreddits$1>)c);
        }
        Object o2 = ((InterestTopicsGraphQlDataSource$getNearbySubreddits$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((InterestTopicsGraphQlDataSource$getNearbySubreddits$1)o).label;
        InterestTopicsGraphQlDataSource interestTopicsGraphQlDataSource;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interestTopicsGraphQlDataSource = (InterestTopicsGraphQlDataSource)((InterestTopicsGraphQlDataSource$getNearbySubreddits$1)o).L$0;
            aj2.c.Q0(o2);
        }
        else {
            aj2.c.Q0(o2);
            final g a = this.a;
            final m8 m8 = new m8(n);
            ((InterestTopicsGraphQlDataSource$getNearbySubreddits$1)o).L$0 = this;
            ((InterestTopicsGraphQlDataSource$getNearbySubreddits$1)o).label = 1;
            o2 = e$a.b(14, (k)m8, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
            if (o2 == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            interestTopicsGraphQlDataSource = this;
        }
        final m8$b m8$b = (m8$b)o2;
        final c b = interestTopicsGraphQlDataSource.b;
        final m8$e a2 = m8$b.a;
        b.getClass();
        final ArrayList<gd0.a> list = new ArrayList<gd0.a>();
        if (a2 != null) {
            final List b2 = a2.b;
            if (b2 != null) {
                final ArrayList<m8$c> list2 = new ArrayList<m8$c>();
                for (final m8$c m8$c : b2) {
                    if (m8$c != null) {
                        list2.add(m8$c);
                    }
                }
                final Iterator<m8$c> iterator2 = list2.iterator();
                while (iterator2.hasNext()) {
                    final m8$f b3 = iterator2.next().b;
                    if (b3 != null) {
                        final String b4 = b3.b;
                        final String c2 = b3.c;
                        String d;
                        if ((d = b3.d) == null) {
                            d = "";
                        }
                        final m8$g f = b3.f;
                        Object o3 = null;
                        Label_0364: {
                            if (f == null || (o3 = f.d) == null) {
                                if (f != null) {
                                    final m8$d e = f.e;
                                    if (e != null) {
                                        o3 = e.b;
                                        break Label_0364;
                                    }
                                }
                                o3 = null;
                            }
                        }
                        String s;
                        if (o3 instanceof String) {
                            s = (String)o3;
                        }
                        else {
                            s = null;
                        }
                        Object o4;
                        if (f == null || (o4 = f.b) == null) {
                            if (f != null) {
                                o4 = f.c;
                            }
                            else {
                                o4 = null;
                            }
                        }
                        String s2;
                        if (o4 instanceof String) {
                            s2 = (String)o4;
                        }
                        else {
                            s2 = null;
                        }
                        list.add(new gd0.a(b4, (long)b3.e, c2, d, s, s2));
                    }
                }
            }
        }
        return list;
    }
    
    public final Serializable c(String s, final OnboardingFlowType onboardingFlowType, final tg2.c c) {
        Object o = null;
        Label_0054: {
            if (c instanceof InterestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1) {
                final InterestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1 interestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1 = (InterestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1)c;
                final int label = interestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    interestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1.label = label + Integer.MIN_VALUE;
                    o = interestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1;
                    break Label_0054;
                }
            }
            o = new InterestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1(this, (tg2.c<? super InterestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1>)c);
        }
        final Object result = ((InterestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((InterestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1)o).label;
        InterestTopicsGraphQlDataSource interestTopicsGraphQlDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interestTopicsGraphQlDataSource = (InterestTopicsGraphQlDataSource)((InterestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final h c2 = h$a.c((Object)s);
            OnboardingFlow a2 = null;
            Label_0158: {
                if (onboardingFlowType != null) {
                    s = onboardingFlowType.name();
                    if (s != null) {
                        OnboardingFlow.Companion.getClass();
                        a2 = OnboardingFlow$a.a(s);
                        break Label_0158;
                    }
                }
                a2 = null;
            }
            final t5 t5 = new t5(c2, h$a.c((Object)a2));
            ((InterestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1)o).L$0 = this;
            ((InterestTopicsGraphQlDataSource$getInterestTopicsBySubscriptions$1)o).label = 1;
            b = e$a.b(14, (k)t5, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            interestTopicsGraphQlDataSource = this;
        }
        final t5$b t5$b = (t5$b)b;
        interestTopicsGraphQlDataSource.b.getClass();
        f.f((Object)t5$b, "data");
        final t5$c a3 = t5$b.a;
        if (a3 != null) {
            final t5$c$a b2 = a3.b;
            if (b2 != null) {
                final InterestTopicRecommendationsFragment a4 = b2.a;
                if (a4 != null) {
                    final InterestTopicRecommendationsFragment$c b3 = a4.b;
                    if (b3 != null) {
                        final List b4 = b3.b;
                        if (b4 != null) {
                            final ArrayList<Object> list = new ArrayList<Object>();
                            final Iterator iterator = b4.iterator();
                            while (true) {
                                final Object instance = list;
                                if (!iterator.hasNext()) {
                                    return (Serializable)instance;
                                }
                                final InterestTopicRecommendationsFragment$a interestTopicRecommendationsFragment$a = (InterestTopicRecommendationsFragment$a)iterator.next();
                                Object o2 = null;
                                Label_0365: {
                                    if (interestTopicRecommendationsFragment$a != null) {
                                        final InterestTopicRecommendationsFragment$b b5 = interestTopicRecommendationsFragment$a.b;
                                        if (b5 != null) {
                                            s = b5.b;
                                            final InterestTopicRecommendationsFragment$d c3 = b5.c;
                                            o2 = new InterestTopic(s, c3.c, c3.b, (List<String>)EmptyList.INSTANCE);
                                            break Label_0365;
                                        }
                                    }
                                    o2 = null;
                                }
                                if (o2 == null) {
                                    continue;
                                }
                                list.add(o2);
                            }
                        }
                    }
                }
            }
        }
        final Object instance = EmptyList.INSTANCE;
        return (Serializable)instance;
    }
    
    public final Object d(final Set<String> set, final tg2.c<? super UpdateResponse> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof InterestTopicsGraphQlDataSource$persistInterestTopics.InterestTopicsGraphQlDataSource$persistInterestTopics$1) {
                final InterestTopicsGraphQlDataSource$persistInterestTopics.InterestTopicsGraphQlDataSource$persistInterestTopics$1 interestTopicsGraphQlDataSource$persistInterestTopics$1 = (InterestTopicsGraphQlDataSource$persistInterestTopics.InterestTopicsGraphQlDataSource$persistInterestTopics$1)c;
                final int label = interestTopicsGraphQlDataSource$persistInterestTopics$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    interestTopicsGraphQlDataSource$persistInterestTopics$1.label = label + Integer.MIN_VALUE;
                    o = interestTopicsGraphQlDataSource$persistInterestTopics$1;
                    break Label_0050;
                }
            }
            o = new InterestTopicsGraphQlDataSource$persistInterestTopics.InterestTopicsGraphQlDataSource$persistInterestTopics$1(this, (tg2.c)c);
        }
        final Object result = ((InterestTopicsGraphQlDataSource$persistInterestTopics.InterestTopicsGraphQlDataSource$persistInterestTopics$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((InterestTopicsGraphQlDataSource$persistInterestTopics.InterestTopicsGraphQlDataSource$persistInterestTopics$1)o).label;
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
            final g a = this.a;
            final g9 g9 = new g9(new t3(h$a.c((Object)CollectionsKt___CollectionsKt.h2((Iterable)set))));
            ((InterestTopicsGraphQlDataSource$persistInterestTopics.InterestTopicsGraphQlDataSource$persistInterestTopics$1)o).label = 1;
            if ((b = e$a.b(14, (k)g9, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final g9$d a2 = ((g9$b)b).a;
        final String s = null;
        UpdateResponse updateResponse;
        if (a2 != null) {
            final boolean b2 = a2.b;
            final List c2 = a2.c;
            String b3 = s;
            if (c2 != null) {
                final g9$c g9$c = (g9$c)CollectionsKt___CollectionsKt.s1(c2);
                b3 = s;
                if (g9$c != null) {
                    b3 = g9$c.b;
                }
            }
            updateResponse = new UpdateResponse(b2, b3);
        }
        else {
            updateResponse = new UpdateResponse(false, null);
        }
        return updateResponse;
    }
    
    public final Object h(String c, final int n, final int n2, final int n3, String name, final OnboardingFlowType onboardingFlowType, final tg2.c<? super InterestTopics> c2) {
        Object o = null;
        Label_0059: {
            if (c2 instanceof InterestTopicsGraphQlDataSource$getInterestTopics.InterestTopicsGraphQlDataSource$getInterestTopics$1) {
                final InterestTopicsGraphQlDataSource$getInterestTopics.InterestTopicsGraphQlDataSource$getInterestTopics$1 interestTopicsGraphQlDataSource$getInterestTopics$1 = (InterestTopicsGraphQlDataSource$getInterestTopics.InterestTopicsGraphQlDataSource$getInterestTopics$1)c2;
                final int label = interestTopicsGraphQlDataSource$getInterestTopics$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    interestTopicsGraphQlDataSource$getInterestTopics$1.label = label + Integer.MIN_VALUE;
                    o = interestTopicsGraphQlDataSource$getInterestTopics$1;
                    break Label_0059;
                }
            }
            o = new InterestTopicsGraphQlDataSource$getInterestTopics.InterestTopicsGraphQlDataSource$getInterestTopics$1(this, (tg2.c)c2);
        }
        final Object result = ((InterestTopicsGraphQlDataSource$getInterestTopics.InterestTopicsGraphQlDataSource$getInterestTopics$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((InterestTopicsGraphQlDataSource$getInterestTopics.InterestTopicsGraphQlDataSource$getInterestTopics$1)o).label;
        InterestTopicsGraphQlDataSource interestTopicsGraphQlDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interestTopicsGraphQlDataSource = (InterestTopicsGraphQlDataSource)((InterestTopicsGraphQlDataSource$getInterestTopics.InterestTopicsGraphQlDataSource$getInterestTopics$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final h c3 = h$a.c((Object)name);
            OnboardingFlow a2 = null;
            Label_0175: {
                if (onboardingFlowType != null) {
                    name = onboardingFlowType.name();
                    if (name != null) {
                        OnboardingFlow.Companion.getClass();
                        a2 = OnboardingFlow$a.a(name);
                        break Label_0175;
                    }
                }
                a2 = null;
            }
            final t6 t6 = new t6(c, n, n2, n3, c3, h$a.c((Object)a2));
            ((InterestTopicsGraphQlDataSource$getInterestTopics.InterestTopicsGraphQlDataSource$getInterestTopics$1)o).L$0 = this;
            ((InterestTopicsGraphQlDataSource$getInterestTopics.InterestTopicsGraphQlDataSource$getInterestTopics$1)o).label = 1;
            b = e$a.b(14, (k)t6, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            interestTopicsGraphQlDataSource = this;
        }
        final t6$b t6$b = (t6$b)b;
        interestTopicsGraphQlDataSource.b.getClass();
        Label_0274: {
            if (t6$b != null) {
                final t6$d a3 = t6$b.a;
                if (a3 != null) {
                    c = a3.c;
                    break Label_0274;
                }
            }
            c = null;
        }
        if (t6$b != null) {
            final t6$d a4 = t6$b.a;
            if (a4 != null) {
                final List d = a4.d;
                if (d != null) {
                    final ArrayList<InterestTopic> list = new ArrayList<InterestTopic>();
                    final Iterator iterator = d.iterator();
                    while (true) {
                        final Object instance = list;
                        if (!iterator.hasNext()) {
                            return new InterestTopics(c, (List<InterestTopic>)instance);
                        }
                        final t6$c t6$c = (t6$c)iterator.next();
                        InterestTopic interestTopic = null;
                        Label_0522: {
                            if (t6$c != null) {
                                final t6$e c4 = t6$c.c;
                                if (c4 != null) {
                                    final String b2 = c4.b;
                                    if (b2 != null) {
                                        final t6$h c5 = c4.c;
                                        if (c5 != null) {
                                            final String b3 = c5.b;
                                            if (b3 != null) {
                                                final String c6 = c5.c;
                                                if (c6 != null) {
                                                    final List d2 = c5.d;
                                                    Object instance2;
                                                    if (d2 != null) {
                                                        final ArrayList list2 = new ArrayList<String>(m.P0((Iterable)d2, 10));
                                                        final Iterator iterator2 = d2.iterator();
                                                        while (true) {
                                                            instance2 = list2;
                                                            if (!iterator2.hasNext()) {
                                                                break;
                                                            }
                                                            list2.add((Object)((t6$g)iterator2.next()).b);
                                                        }
                                                    }
                                                    else {
                                                        instance2 = EmptyList.INSTANCE;
                                                    }
                                                    interestTopic = new InterestTopic(b2, b3, c6, (List<String>)instance2);
                                                    break Label_0522;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            interestTopic = null;
                        }
                        if (interestTopic == null) {
                            continue;
                        }
                        list.add(interestTopic);
                    }
                }
            }
        }
        final Object instance = EmptyList.INSTANCE;
        return new InterestTopics(c, (List<InterestTopic>)instance);
    }
}
