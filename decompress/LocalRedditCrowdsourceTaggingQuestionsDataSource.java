// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import java.util.Collection;
import qg2.m;
import java.util.Iterator;
import com.squareup.moshi.JsonAdapter;
import java.util.ArrayList;
import i60.g;
import java.io.Serializable;
import java.util.Map;
import a4.u1;
import kotlin.Pair;
import com.reddit.domain.model.tagging.CrowdsourceTaggingQuestion;
import java.util.List;
import tg2.c;
import java.util.Set;
import pg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import javax.inject.Inject;
import pg2.f;
import h60.o;
import com.squareup.moshi.y;
import gc0.a;

public final class LocalRedditCrowdsourceTaggingQuestionsDataSource implements a
{
    public final y a;
    public final o b;
    public final f c;
    
    @Inject
    public LocalRedditCrowdsourceTaggingQuestionsDataSource(final y a, final o b) {
        ah2.f.f((Object)a, "moshi");
        ah2.f.f((Object)b, "dao");
        this.a = a;
        this.b = b;
        this.c = kotlin.a.b((zg2.a)new LocalRedditCrowdsourceTaggingQuestionsDataSource$adapter.LocalRedditCrowdsourceTaggingQuestionsDataSource$adapter$2(this));
    }
    
    public final Object h(final String s, final ContinuationImpl continuationImpl) {
        final Object h = this.b.h(s, continuationImpl);
        if (h == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return h;
        }
        return j.a;
    }
    
    public final Object i(final Set<String> set, final c<? super j> c) {
        if (!(set.isEmpty() ^ true)) {
            return j.a;
        }
        final Object d1 = this.b.d1(set, c);
        if (d1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return d1;
        }
        return j.a;
    }
    
    public final Object j(final String s, final List<CrowdsourceTaggingQuestion> list, final c<? super j> c) {
        final Object m = this.m(u1.B0(new Pair((Object)s, (Object)list)), c);
        if (m == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return m;
        }
        return j.a;
    }
    
    public final Object k(final String s, final c<? super j> c) {
        final Object v0 = this.b.v0(s, c);
        if (v0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return v0;
        }
        return j.a;
    }
    
    public final Serializable l(final Set set, final c c) {
        Object o = null;
        Label_0050: {
            if (c instanceof LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1) {
                final LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1 localRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1 = (LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1)c;
                final int label = localRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    localRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1.label = label + Integer.MIN_VALUE;
                    o = localRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1;
                    break Label_0050;
                }
            }
            o = new LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1(this, (c<? super LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1>)c);
        }
        final Object result = ((LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1)o).label;
        LocalRedditCrowdsourceTaggingQuestionsDataSource localRedditCrowdsourceTaggingQuestionsDataSource;
        Object f1;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            localRedditCrowdsourceTaggingQuestionsDataSource = (LocalRedditCrowdsourceTaggingQuestionsDataSource)((LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1)o).L$0;
            aj2.c.Q0(result);
            f1 = result;
        }
        else {
            aj2.c.Q0(result);
            final o b = this.b;
            ((LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1)o).L$0 = this;
            ((LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$1)o).label = 1;
            f1 = b.f1(set, (c<? super List<g>>)o);
            if (f1 == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            localRedditCrowdsourceTaggingQuestionsDataSource = this;
        }
        final Iterable iterable = (Iterable)f1;
        final ArrayList<CrowdsourceTaggingQuestion> list = new ArrayList<CrowdsourceTaggingQuestion>();
        for (final g g : iterable) {
            final Object value = localRedditCrowdsourceTaggingQuestionsDataSource.c.getValue();
            ah2.f.e(value, "<get-adapter>(...)");
            final CrowdsourceTaggingQuestion crowdsourceTaggingQuestion = (CrowdsourceTaggingQuestion)((JsonAdapter)value).fromJson(g.d);
            if (crowdsourceTaggingQuestion != null) {
                list.add(crowdsourceTaggingQuestion);
            }
        }
        return list;
    }
    
    public final Object m(final Map<String, ? extends List<CrowdsourceTaggingQuestion>> map, final c<? super j> c) {
        if (!(map.isEmpty() ^ true)) {
            return j.a;
        }
        final o b = this.b;
        final ArrayList list = new ArrayList(map.size());
        for (final Map.Entry<K, Iterable> entry : map.entrySet()) {
            final Iterable iterable = entry.getValue();
            final ArrayList list2 = new ArrayList<g>(m.P0((Iterable)iterable, 10));
            int n = 0;
            for (final Object next : iterable) {
                if (n < 0) {
                    ah2.c.x0();
                    throw null;
                }
                final CrowdsourceTaggingQuestion crowdsourceTaggingQuestion = (CrowdsourceTaggingQuestion)next;
                final String id = crowdsourceTaggingQuestion.getId();
                final String s = (String)entry.getKey();
                final Object value = this.c.getValue();
                ah2.f.e(value, "<get-adapter>(...)");
                final String json = ((JsonAdapter)value).toJson((Object)crowdsourceTaggingQuestion);
                ah2.f.e((Object)json, "adapter.toJson(question)");
                list2.add(new g(id, s, n, json));
                ++n;
            }
            list.add(list2);
        }
        final Object r0 = b.R0(m.Q0((Collection)list), c);
        if (r0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return r0;
        }
        return j.a;
    }
    
    public final Serializable n(final String s, final c c) {
        Object o = null;
        Label_0050: {
            if (c instanceof LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3) {
                final LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3 localRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3 = (LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3)c;
                final int label = localRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    localRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3.label = label + Integer.MIN_VALUE;
                    o = localRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3;
                    break Label_0050;
                }
            }
            o = new LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3(this, (c<? super LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3>)c);
        }
        final Object result = ((LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3)o).label;
        LocalRedditCrowdsourceTaggingQuestionsDataSource localRedditCrowdsourceTaggingQuestionsDataSource;
        Object x0;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            localRedditCrowdsourceTaggingQuestionsDataSource = (LocalRedditCrowdsourceTaggingQuestionsDataSource)((LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3)o).L$0;
            aj2.c.Q0(result);
            x0 = result;
        }
        else {
            aj2.c.Q0(result);
            final o b = this.b;
            ((LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3)o).L$0 = this;
            ((LocalRedditCrowdsourceTaggingQuestionsDataSource$getQuestions$3)o).label = 1;
            x0 = b.x0(s, (c<? super List<g>>)o);
            if (x0 == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            localRedditCrowdsourceTaggingQuestionsDataSource = this;
        }
        final Iterable iterable = (Iterable)x0;
        final ArrayList<CrowdsourceTaggingQuestion> list = new ArrayList<CrowdsourceTaggingQuestion>();
        for (final g g : iterable) {
            final Object value = localRedditCrowdsourceTaggingQuestionsDataSource.c.getValue();
            ah2.f.e(value, "<get-adapter>(...)");
            final CrowdsourceTaggingQuestion crowdsourceTaggingQuestion = (CrowdsourceTaggingQuestion)((JsonAdapter)value).fromJson(g.d);
            if (crowdsourceTaggingQuestion != null) {
                list.add(crowdsourceTaggingQuestion);
            }
        }
        return list;
    }
}
