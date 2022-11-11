// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.onboardingtopic;

import com.reddit.common.experiments.model.onboarding.ContentForwardOnboardingVariant;
import kotlin.collections.EmptyList;
import com.reddit.domain.model.UpdateResponse;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import sf2.o;
import ge0.o0$a;
import kotlinx.coroutines.rx2.d;
import com.reddit.domain.model.SubredditActionSource;
import java.util.ArrayList;
import qg2.m;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.reddit.domain.onboardingflow.OnboardingFlowType;
import fd0.b$a;
import java.util.Set;
import qg2.d0;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.util.List;
import javax.inject.Inject;
import pg2.f;
import com.reddit.session.Session;
import cd0.a;
import db0.t;
import bt0.j;
import ge0.o0;
import fd0.b;
import fd0.c;

public final class RedditOnboardingChainingUseCase implements c
{
    public final b a;
    public final o0 b;
    public final j c;
    public final yc0.b d;
    public final t e;
    public final a f;
    public final Session g;
    public final f h;
    
    @Inject
    public RedditOnboardingChainingUseCase(final b a, final o0 b, final j c, final yc0.b d, final t e, final a f, final Session g) {
        ah2.f.f((Object)d, "startParameters");
        ah2.f.f((Object)f, "onboardingSessionStorage");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = kotlin.a.b((zg2.a)new RedditOnboardingChainingUseCase$onboardingLowSignalFeedM1Enabled.RedditOnboardingChainingUseCase$onboardingLowSignalFeedM1Enabled$2(this));
    }
    
    public final Object a(List<String> iterable, List<String> o, List<String> l$1, final tg2.c<? super Boolean> c) {
        RedditOnboardingChainingUseCase$completeEditOnboarding.RedditOnboardingChainingUseCase$completeEditOnboarding$1 redditOnboardingChainingUseCase$completeEditOnboarding$1 = null;
        Label_0055: {
            if (c instanceof RedditOnboardingChainingUseCase$completeEditOnboarding.RedditOnboardingChainingUseCase$completeEditOnboarding$1) {
                redditOnboardingChainingUseCase$completeEditOnboarding$1 = (RedditOnboardingChainingUseCase$completeEditOnboarding.RedditOnboardingChainingUseCase$completeEditOnboarding$1)c;
                final int label = redditOnboardingChainingUseCase$completeEditOnboarding$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditOnboardingChainingUseCase$completeEditOnboarding$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            redditOnboardingChainingUseCase$completeEditOnboarding$1 = new RedditOnboardingChainingUseCase$completeEditOnboarding.RedditOnboardingChainingUseCase$completeEditOnboarding$1(this, (tg2.c)c);
        }
        Object result = redditOnboardingChainingUseCase$completeEditOnboarding$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditOnboardingChainingUseCase$completeEditOnboarding$1.label;
        String s = "";
        final String s2 = "id_near_me";
        Label_0463: {
            if (label2 == 0) {
                break Label_0463;
            }
            Label_0390: {
                if (label2 == 1) {
                    break Label_0390;
                }
                Label_0277: {
                    if (label2 == 2) {
                        break Label_0277;
                    }
                    Label_0202: {
                        if (label2 == 3) {
                            break Label_0202;
                        }
                        Label_0153: {
                            if (label2 == 4) {
                                break Label_0153;
                            }
                            Label_0143: {
                                if (label2 != 5) {
                                    break Label_0143;
                                }
                                iterable = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$1;
                                RedditOnboardingChainingUseCase redditOnboardingChainingUseCase = (RedditOnboardingChainingUseCase)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$0;
                                try {
                                    aj2.c.Q0(result);
                                    while (true) {
                                        Collection collection = null;
                                    Label_0921_Outer:
                                        while (true) {
                                            RedditOnboardingChainingUseCase l$2 = null;
                                            List l$3 = null;
                                        Label_0921:
                                            while (true) {
                                                Iterable<String> iterable2;
                                                Iterator iterator = null;
                                                Iterator iterator2 = null;
                                                Object next = null;
                                                List list;
                                                Iterator iterator3 = null;
                                                Object next2;
                                                String s3;
                                                ArrayList o2;
                                                List o3 = null;
                                                List h2;
                                                b a;
                                                Object o4;
                                                Object b;
                                                gd0.b b2 = null;
                                                Iterator<String> iterator4 = null;
                                                List list2;
                                                Iterator iterator5;
                                                Object next3;
                                                List list3 = null;
                                                ArrayList list5 = null;
                                                ArrayList list4;
                                                Iterator iterator6;
                                                o0 b3;
                                                ArrayList list6 = null;
                                                Iterator iterator7 = null;
                                                List list7;
                                                RedditOnboardingChainingUseCase l$4 = null;
                                                List list8 = null;
                                                ArrayList list9;
                                                Iterator iterator8 = null;
                                                ArrayList<String> list10 = null;
                                                o0 b4;
                                                ArrayList list11 = null;
                                                ArrayList<String> list12 = null;
                                                pg2.j a2;
                                                nf2.a j;
                                                Object next4 = null;
                                                Object o5;
                                                List list13;
                                                Object l$5 = null;
                                                Object o6;
                                                Object c2;
                                                ArrayList o7;
                                                String s4;
                                                List<String> list14;
                                                String s5 = null;
                                                Object n;
                                                Object o8 = null;
                                                String s6 = null;
                                                Collection<String> collection2;
                                                List list15;
                                                List d = null;
                                                nf2.a g0;
                                                Collection l$6 = null;
                                                b a3;
                                                List list16;
                                                Collection<String> collection3 = null;
                                                nf2.t map;
                                                Label_1093:Block_17_Outer:Block_27_Outer:Label_1294_Outer:
                                                while (true) {
                                                    Label_0739: {
                                                        while (true) {
                                                        Label_1294:
                                                            while (true) {
                                                                while (true) {
                                                                    Block_16_Outer:Label_1208_Outer:
                                                                    while (true) {
                                                                    Label_0604:
                                                                        while (true) {
                                                                        Label_1208:
                                                                            while (true) {
                                                                                while (true) {
                                                                                    Block_18_Outer:Block_14_Outer:Label_1510_Outer:
                                                                                    while (true) {
                                                                                    Label_1510:
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                            Label_1588:
                                                                                                while (true) {
                                                                                                    Block_31: {
                                                                                                        while (true) {
                                                                                                            Label_1389: {
                                                                                                                while (true) {
                                                                                                                    Label_0967: {
                                                                                                                    Block_22:
                                                                                                                        while (true) {
                                                                                                                            Block_21: {
                                                                                                                                while (true) {
                                                                                                                                    while (true) {
                                                                                                                                        iterable2 = iterable;
                                                                                                                                        Label_1701: {
                                                                                                                                            redditOnboardingChainingUseCase.a.c((List)iterable2);
                                                                                                                                        }
                                                                                                                                        redditOnboardingChainingUseCase.c.d3(new Long(System.currentTimeMillis()));
                                                                                                                                        return Boolean.TRUE;
                                                                                                                                        iftrue(Label_1184:)(!iterator.hasNext());
                                                                                                                                        break Block_21;
                                                                                                                                        break Label_1093;
                                                                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                                        next = iterator2.next();
                                                                                                                                        iftrue(Label_1011:)(!(list.contains(next) ^ true));
                                                                                                                                        break Label_1588;
                                                                                                                                        Label_1696:
                                                                                                                                        redditOnboardingChainingUseCase = l$2;
                                                                                                                                        continue Block_18_Outer;
                                                                                                                                    }
                                                                                                                                    next2 = iterator3.next();
                                                                                                                                    iftrue(Label_1052:)(!ah2.f.a((Object)((gd0.b)next2).a, (Object)s3));
                                                                                                                                    continue Block_14_Outer;
                                                                                                                                }
                                                                                                                                aj2.c.Q0(result);
                                                                                                                                o2 = CollectionsKt___CollectionsKt.O1((Collection)this.a.b(), (Object)"id_near_me");
                                                                                                                                o3 = CollectionsKt___CollectionsKt.O1((Collection)iterable, (Object)"id_near_me");
                                                                                                                                h2 = CollectionsKt___CollectionsKt.h2((Iterable)d0.N1((Set)CollectionsKt___CollectionsKt.f2((Iterable)CollectionsKt___CollectionsKt.N1((Iterable)o3, (Collection)o2)), (Object)"id_near_me"));
                                                                                                                                a = this.a;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$0 = this;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$1 = iterable;
                                                                                                                                o4 = o;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$2 = o4;
                                                                                                                                o = l$1;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$3 = o;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$4 = o2;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$5 = o3;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.label = 1;
                                                                                                                                b = b$a.b(a, h2, (OnboardingFlowType)null, (ContinuationImpl)redditOnboardingChainingUseCase$completeEditOnboarding$1, 11);
                                                                                                                                iftrue(Label_0592:)(b != coroutine_SUSPENDED);
                                                                                                                                return coroutine_SUSPENDED;
                                                                                                                                b2 = (gd0.b)next2;
                                                                                                                                iftrue(Label_1244:)(b2 == null);
                                                                                                                                break Label_1294;
                                                                                                                                s3 = iterator4.next();
                                                                                                                                iterator3 = list2.iterator();
                                                                                                                                break Label_0604;
                                                                                                                                next3 = iterator5.next();
                                                                                                                                iftrue(Label_1294:)(!(list3.contains(next3) ^ true));
                                                                                                                                Block_26: {
                                                                                                                                    break Block_26;
                                                                                                                                    Label_1184: {
                                                                                                                                        list4 = new ArrayList<String>(m.P0((Iterable)list5, 10));
                                                                                                                                    }
                                                                                                                                    iterator6 = list5.iterator();
                                                                                                                                    break Label_1208;
                                                                                                                                    b3 = l$2.b;
                                                                                                                                    list6 = new ArrayList<String>(m.P0((Iterable)l$3, 10));
                                                                                                                                    iterator7 = l$3.iterator();
                                                                                                                                    break Label_1588;
                                                                                                                                    o3 = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$5;
                                                                                                                                    list7 = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$4;
                                                                                                                                    o = redditOnboardingChainingUseCase$completeEditOnboarding$1.L$3;
                                                                                                                                    o4 = redditOnboardingChainingUseCase$completeEditOnboarding$1.L$2;
                                                                                                                                    l$1 = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$1;
                                                                                                                                    l$4 = (RedditOnboardingChainingUseCase)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$0;
                                                                                                                                    aj2.c.Q0(result);
                                                                                                                                    b = result;
                                                                                                                                    list8 = list7;
                                                                                                                                    break Label_0604;
                                                                                                                                    list9.add(kotlin.text.b.y2((CharSequence)"r/", (String)iterator8.next()));
                                                                                                                                    break Label_1389;
                                                                                                                                    Label_1014:
                                                                                                                                    iterator4 = list10.iterator();
                                                                                                                                    break Block_18_Outer;
                                                                                                                                    b4 = l$4.b;
                                                                                                                                    list9 = new ArrayList<String>(m.P0((Iterable)list11, 10));
                                                                                                                                    iterator8 = list11.iterator();
                                                                                                                                    break Label_1389;
                                                                                                                                }
                                                                                                                                list12.add((String)next3);
                                                                                                                                break Label_1294;
                                                                                                                                break Label_0967;
                                                                                                                                list11.addAll(collection);
                                                                                                                                a2 = pg2.j.a;
                                                                                                                                break Block_18_Outer;
                                                                                                                                Label_1424: {
                                                                                                                                    j = b4.J(list9, SubredditActionSource.ONBOARDING);
                                                                                                                                }
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$0 = l$4;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$1 = l$1;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$2 = o;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$3 = l$3;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$4 = null;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$5 = null;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.L$6 = null;
                                                                                                                                redditOnboardingChainingUseCase$completeEditOnboarding$1.label = 4;
                                                                                                                                iftrue(Label_1502:)(kotlinx.coroutines.rx2.d.a(j, (tg2.c)redditOnboardingChainingUseCase$completeEditOnboarding$1) != coroutine_SUSPENDED);
                                                                                                                                return coroutine_SUSPENDED;
                                                                                                                            }
                                                                                                                            next4 = iterator.next();
                                                                                                                            iftrue(Label_1136:)(!list3.contains(((gd0.a)next4).f));
                                                                                                                            break Block_22;
                                                                                                                            Label_1502: {
                                                                                                                                o5 = o;
                                                                                                                            }
                                                                                                                            o = l$1;
                                                                                                                            l$1 = (Collection<String>)o5;
                                                                                                                            break Label_1510;
                                                                                                                            iftrue(Label_1341:)(!iterator5.hasNext());
                                                                                                                            continue Label_1208_Outer;
                                                                                                                        }
                                                                                                                        list5.add(next4);
                                                                                                                        continue Block_14_Outer;
                                                                                                                        list3 = (List)result;
                                                                                                                        list11 = new ArrayList();
                                                                                                                        l$3 = new ArrayList();
                                                                                                                        list10 = new ArrayList<String>();
                                                                                                                        iterator2 = list13.iterator();
                                                                                                                        break Label_0967;
                                                                                                                        Label_0901: {
                                                                                                                            list = o3;
                                                                                                                        }
                                                                                                                        o6 = l$5;
                                                                                                                        list13 = list8;
                                                                                                                        result = c2;
                                                                                                                        list2 = o7;
                                                                                                                        continue Label_0921;
                                                                                                                    }
                                                                                                                    iftrue(Label_1014:)(!iterator2.hasNext());
                                                                                                                    continue Block_17_Outer;
                                                                                                                }
                                                                                                                Label_0713: {
                                                                                                                    s4 = "";
                                                                                                                }
                                                                                                                list14 = (List<String>)o4;
                                                                                                                l$5 = o;
                                                                                                                o = list14;
                                                                                                                s5 = s2;
                                                                                                                o8 = n;
                                                                                                                s6 = s4;
                                                                                                                break Label_0739;
                                                                                                                iftrue(Label_1622:)(!iterator7.hasNext());
                                                                                                                break Block_31;
                                                                                                            }
                                                                                                            iftrue(Label_1424:)(!iterator8.hasNext());
                                                                                                            continue Block_27_Outer;
                                                                                                        }
                                                                                                        collection2 = l$1;
                                                                                                        l$2 = l$4;
                                                                                                        iterable = (Iterable<String>)o;
                                                                                                        o = collection2;
                                                                                                        break Label_0921;
                                                                                                    }
                                                                                                    list6.add(kotlin.text.b.y2((CharSequence)"r/", (String)iterator7.next()));
                                                                                                    continue Label_1588;
                                                                                                }
                                                                                                list10.add((String)next);
                                                                                                continue Label_1510_Outer;
                                                                                            }
                                                                                            list15 = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$3;
                                                                                            l$1 = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$2;
                                                                                            o = redditOnboardingChainingUseCase$completeEditOnboarding$1.L$1;
                                                                                            l$4 = (RedditOnboardingChainingUseCase)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$0;
                                                                                            aj2.c.Q0(result);
                                                                                            l$3 = list15;
                                                                                            continue Label_1510;
                                                                                        }
                                                                                        list5 = new ArrayList();
                                                                                        iterator = d.iterator();
                                                                                        continue Block_14_Outer;
                                                                                    }
                                                                                    iftrue(Label_1268:)(!iterator4.hasNext());
                                                                                    continue Label_1208_Outer;
                                                                                }
                                                                                collection = list4;
                                                                                iftrue(Label_1247:)(!iterator6.hasNext());
                                                                                Block_23: {
                                                                                    break Block_23;
                                                                                    Label_1622: {
                                                                                        g0 = b3.g0((List)list6, SubredditActionSource.ONBOARDING);
                                                                                    }
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$0 = l$2;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$1 = iterable;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$2 = null;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$3 = null;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$4 = null;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$5 = null;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$6 = null;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.label = 5;
                                                                                    iftrue(Label_1696:)(kotlinx.coroutines.rx2.d.a(g0, (tg2.c)redditOnboardingChainingUseCase$completeEditOnboarding$1) != coroutine_SUSPENDED);
                                                                                    return coroutine_SUSPENDED;
                                                                                    l$6 = (Collection)b;
                                                                                    a3 = l$4.a;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$0 = l$4;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$1 = l$1;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$2 = o4;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$3 = o;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$4 = list8;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$5 = o3;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$6 = l$6;
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$7 = "id_near_me";
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$8 = "";
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$9 = "";
                                                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.label = 2;
                                                                                    n = a3.n(10, (ContinuationImpl)redditOnboardingChainingUseCase$completeEditOnboarding$1);
                                                                                    iftrue(Label_0713:)(n != coroutine_SUSPENDED);
                                                                                    return coroutine_SUSPENDED;
                                                                                    s6 = (String)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$9;
                                                                                    s = (String)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$8;
                                                                                    s5 = (String)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$7;
                                                                                    l$6 = (Collection)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$6;
                                                                                    o3 = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$5;
                                                                                    list16 = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$4;
                                                                                    l$5 = redditOnboardingChainingUseCase$completeEditOnboarding$1.L$3;
                                                                                    o = redditOnboardingChainingUseCase$completeEditOnboarding$1.L$2;
                                                                                    l$1 = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$1;
                                                                                    l$4 = (RedditOnboardingChainingUseCase)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$0;
                                                                                    aj2.c.Q0(result);
                                                                                    o8 = result;
                                                                                    list8 = list16;
                                                                                    break Label_0739;
                                                                                }
                                                                                list4.add((Object)((gd0.a)iterator6.next()).f);
                                                                                continue Label_1208;
                                                                            }
                                                                            Label_1523: {
                                                                                collection3 = l$1;
                                                                            }
                                                                            l$2 = l$4;
                                                                            iterable = collection3;
                                                                            break Label_0921;
                                                                            Label_0592:
                                                                            l$1 = (Collection<String>)iterable;
                                                                            l$4 = this;
                                                                            list8 = o2;
                                                                            continue Label_0604;
                                                                        }
                                                                        iftrue(Label_1090:)(!iterator3.hasNext());
                                                                        continue Block_16_Outer;
                                                                    }
                                                                    Label_1341: {
                                                                        ((ArrayList)l$3).addAll(list12);
                                                                    }
                                                                    iftrue(Label_1523:)(!(list11.isEmpty() ^ true));
                                                                    continue Label_1294_Outer;
                                                                }
                                                                Label_1268: {
                                                                    list11.addAll((Collection)o6);
                                                                }
                                                                list12 = new ArrayList<String>();
                                                                iterator5 = ((Iterable)o).iterator();
                                                                continue Label_1294;
                                                            }
                                                            d = b2.d;
                                                            iftrue(Label_1244:)(d == null);
                                                            continue;
                                                        }
                                                        Label_1244: {
                                                            collection = null;
                                                        }
                                                        break Label_0921_Outer;
                                                    }
                                                    o7 = CollectionsKt___CollectionsKt.O1(l$6, (Object)new gd0.b(s5, s, s6, (List)o8));
                                                    map = o0$a.d(3, l$4.b, false).map((o)new ov.c(9));
                                                    ah2.f.e((Object)map, "subredditRepository\n    \u2026m.displayNamePrefixed } }");
                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$0 = l$4;
                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$1 = l$1;
                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$2 = o;
                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$3 = l$5;
                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$4 = list8;
                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$5 = o3;
                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$6 = o7;
                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$7 = null;
                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$8 = null;
                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.L$9 = null;
                                                    redditOnboardingChainingUseCase$completeEditOnboarding$1.label = 3;
                                                    c2 = kotlinx.coroutines.rx2.d.c(map, (tg2.c)redditOnboardingChainingUseCase$completeEditOnboarding$1);
                                                    iftrue(Label_0901:)(c2 != coroutine_SUSPENDED);
                                                    return coroutine_SUSPENDED;
                                                    Label_1090: {
                                                        next2 = null;
                                                    }
                                                    continue Label_1093;
                                                }
                                                list2 = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$6;
                                                list = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$5;
                                                list13 = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$4;
                                                o6 = redditOnboardingChainingUseCase$completeEditOnboarding$1.L$3;
                                                o = redditOnboardingChainingUseCase$completeEditOnboarding$1.L$2;
                                                l$1 = (List)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$1;
                                                l$4 = (RedditOnboardingChainingUseCase)redditOnboardingChainingUseCase$completeEditOnboarding$1.L$0;
                                                aj2.c.Q0(result);
                                                continue Label_0921;
                                            }
                                            l$2.b(((List)o).size());
                                            Iterable<String> iterable2 = iterable;
                                            redditOnboardingChainingUseCase = l$2;
                                            iftrue(Label_1701:)(!(l$3.isEmpty() ^ true));
                                            continue Label_0921_Outer;
                                        }
                                        iftrue(Label_1021:)(collection == null);
                                        continue;
                                    }
                                }
                                catch (final CancellationException ex) {
                                    throw ex;
                                }
                                finally {
                                    final Throwable t;
                                    bv2.a.a.f(t, "Failed to complete onboarding edit process.", new Object[0]);
                                    return Boolean.FALSE;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void b(final int n) {
        if (this.h.getValue()) {
            this.a.f(n);
            this.a.i(this.g.isLoggedIn() && n < 3);
        }
    }
    
    public final Object c(List<String> list, List<String> l2, List<String> l$2, tg2.c<? super Boolean> redditOnboardingChainingUseCase$completeOnboarding$1) {
        Label_0059: {
            if (redditOnboardingChainingUseCase$completeOnboarding$1 instanceof RedditOnboardingChainingUseCase$completeOnboarding.RedditOnboardingChainingUseCase$completeOnboarding$1) {
                final RedditOnboardingChainingUseCase$completeOnboarding.RedditOnboardingChainingUseCase$completeOnboarding$1 redditOnboardingChainingUseCase$completeOnboarding$2 = redditOnboardingChainingUseCase$completeOnboarding$1;
                final int label = redditOnboardingChainingUseCase$completeOnboarding$2.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditOnboardingChainingUseCase$completeOnboarding$2.label = label + Integer.MIN_VALUE;
                    redditOnboardingChainingUseCase$completeOnboarding$1 = redditOnboardingChainingUseCase$completeOnboarding$2;
                    break Label_0059;
                }
            }
            redditOnboardingChainingUseCase$completeOnboarding$1 = new RedditOnboardingChainingUseCase$completeOnboarding.RedditOnboardingChainingUseCase$completeOnboarding$1(this, (tg2.c)redditOnboardingChainingUseCase$completeOnboarding$1);
        }
        Object o = redditOnboardingChainingUseCase$completeOnboarding$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        int n = redditOnboardingChainingUseCase$completeOnboarding$1.label;
        final List l$3;
        Label_0650: {
            Label_0594: {
                Label_0196: {
                    if (n == 0) {
                        break Label_0196;
                    }
                    Label_0188: {
                        if (n == 1) {
                            break Label_0188;
                        }
                        Label_0153: {
                            if (n == 2) {
                                break Label_0153;
                            }
                            if (n != 3 && n != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            n = redditOnboardingChainingUseCase$completeOnboarding$1.I$0;
                            final List list2 = (List)redditOnboardingChainingUseCase$completeOnboarding$1.L$1;
                            l2 = redditOnboardingChainingUseCase$completeOnboarding$1.L$0;
                            try {
                                aj2.c.Q0(o);
                                break Label_0594;
                            Block_23_Outer:
                                while (true) {
                                    Label_0334: {
                                        while (true) {
                                            Label_0403: {
                                                ContentForwardOnboardingVariant x9;
                                                Label_0242:Block_26_Outer:
                                                while (true) {
                                                Block_22_Outer:
                                                    while (true) {
                                                    Block_16_Outer:
                                                        while (true) {
                                                            n = 1;
                                                            break Label_0242;
                                                            aj2.c.Q0(o);
                                                            return o;
                                                            while (true) {
                                                                redditOnboardingChainingUseCase$completeOnboarding$1.label = 1;
                                                                iftrue(Label_0272:)((o = this.d((tg2.c<? super Boolean>)redditOnboardingChainingUseCase$completeOnboarding$1)) != coroutine_SUSPENDED);
                                                                return coroutine_SUSPENDED;
                                                                iftrue(Label_0275:)(n == 0);
                                                                continue Block_26_Outer;
                                                            }
                                                            redditOnboardingChainingUseCase$completeOnboarding$1.L$0 = l2;
                                                            redditOnboardingChainingUseCase$completeOnboarding$1.L$1 = list;
                                                            redditOnboardingChainingUseCase$completeOnboarding$1.L$2 = null;
                                                            redditOnboardingChainingUseCase$completeOnboarding$1.I$0 = n;
                                                            redditOnboardingChainingUseCase$completeOnboarding$1.label = 3;
                                                            iftrue(Label_0594:)(((RedditOnboardingChainingUseCase)l2).e(l$2, (ContinuationImpl)redditOnboardingChainingUseCase$completeOnboarding$1) != coroutine_SUSPENDED);
                                                            return coroutine_SUSPENDED;
                                                            aj2.c.Q0(o);
                                                            iftrue(Label_0239:)(!this.d.f || !this.f.a || this.e.p() == null);
                                                            continue Block_16_Outer;
                                                        }
                                                        while (true) {
                                                            n = 1;
                                                            break Label_0403;
                                                            l$2 = (List)redditOnboardingChainingUseCase$completeOnboarding$1.L$2;
                                                            list = (List)redditOnboardingChainingUseCase$completeOnboarding$1.L$1;
                                                            l2 = redditOnboardingChainingUseCase$completeOnboarding$1.L$0;
                                                            aj2.c.Q0(o);
                                                            break Label_0334;
                                                            Label_0272: {
                                                                return o;
                                                            }
                                                            bv2.a.a.d("Failed to persist topics while onboarding process.", new Object[0]);
                                                            return Boolean.FALSE;
                                                            Label_0362:
                                                            iftrue(Label_0400:)(!((RedditOnboardingChainingUseCase)l2).d.f || !((RedditOnboardingChainingUseCase)l2).f.a || ((RedditOnboardingChainingUseCase)l2).e.X9() == null);
                                                            continue Block_23_Outer;
                                                        }
                                                        Label_0400: {
                                                            n = 0;
                                                        }
                                                        break Label_0403;
                                                        x9 = ((RedditOnboardingChainingUseCase)l2).e.X9();
                                                        iftrue(Label_0501:)(x9 == null || !x9.autoSubscribe());
                                                        continue Block_22_Outer;
                                                    }
                                                    Label_0239: {
                                                        n = 0;
                                                    }
                                                    continue Label_0242;
                                                }
                                                final b a;
                                                Label_0275: {
                                                    a = this.a;
                                                }
                                                l2 = CollectionsKt___CollectionsKt.l2((Iterable)l2);
                                                redditOnboardingChainingUseCase$completeOnboarding$1.L$0 = this;
                                                redditOnboardingChainingUseCase$completeOnboarding$1.L$1 = list;
                                                redditOnboardingChainingUseCase$completeOnboarding$1.L$2 = l$2;
                                                redditOnboardingChainingUseCase$completeOnboarding$1.label = 2;
                                                o = a.m((Set)l2, (ContinuationImpl)redditOnboardingChainingUseCase$completeOnboarding$1);
                                                iftrue(Label_0332:)(o != coroutine_SUSPENDED);
                                                return coroutine_SUSPENDED;
                                            }
                                            iftrue(Label_0548:)(n == 0);
                                            continue;
                                        }
                                        Label_0332: {
                                            l2 = this;
                                        }
                                    }
                                    iftrue(Label_0362:)(((UpdateResponse)o).getSuccess());
                                    continue;
                                }
                            }
                            catch (final CancellationException ex) {
                                return;
                            }
                            finally {
                                break Label_0650;
                            }
                        }
                    }
                }
                final b a2;
                Label_0501: {
                    a2 = ((RedditOnboardingChainingUseCase)l2).a;
                }
                final ad0.b f = ((RedditOnboardingChainingUseCase)l2).f.f;
                Object o2;
                if (f == null || (o2 = f.a) == null) {
                    o2 = EmptyList.INSTANCE;
                }
                a2.p((List)o2);
                break Label_0594;
                Label_0548:
                redditOnboardingChainingUseCase$completeOnboarding$1.L$0 = l2;
                redditOnboardingChainingUseCase$completeOnboarding$1.L$1 = l$3;
                redditOnboardingChainingUseCase$completeOnboarding$1.L$2 = null;
                redditOnboardingChainingUseCase$completeOnboarding$1.I$0 = n;
                redditOnboardingChainingUseCase$completeOnboarding$1.label = 4;
                if (((RedditOnboardingChainingUseCase)l2).e(l$2, (ContinuationImpl)redditOnboardingChainingUseCase$completeOnboarding$1) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            if (n != 0) {
                ((RedditOnboardingChainingUseCase)l2).c.L(true);
            }
            ((RedditOnboardingChainingUseCase)l2).a.c(l$3);
            ((RedditOnboardingChainingUseCase)l2).c.m2(new Long(System.currentTimeMillis()));
            return Boolean.TRUE;
        }
        bv2.a.a.f((Throwable)l$3, "Failed to complete onboarding process.", new Object[0]);
        return Boolean.FALSE;
    }
    
    public final Object d(final tg2.c<? super Boolean> c) {
        RedditOnboardingChainingUseCase$completeOnboardingV2.RedditOnboardingChainingUseCase$completeOnboardingV2$1 redditOnboardingChainingUseCase$completeOnboardingV2$1 = null;
        Label_0045: {
            if (c instanceof RedditOnboardingChainingUseCase$completeOnboardingV2.RedditOnboardingChainingUseCase$completeOnboardingV2$1) {
                redditOnboardingChainingUseCase$completeOnboardingV2$1 = (RedditOnboardingChainingUseCase$completeOnboardingV2.RedditOnboardingChainingUseCase$completeOnboardingV2$1)c;
                final int label = redditOnboardingChainingUseCase$completeOnboardingV2$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditOnboardingChainingUseCase$completeOnboardingV2$1.label = label + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            redditOnboardingChainingUseCase$completeOnboardingV2$1 = new RedditOnboardingChainingUseCase$completeOnboardingV2.RedditOnboardingChainingUseCase$completeOnboardingV2$1(this, (tg2.c)c);
        }
        Object o = redditOnboardingChainingUseCase$completeOnboardingV2$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditOnboardingChainingUseCase$completeOnboardingV2$1.label;
        Object l$0 = null;
        Label_0409: {
            Object o3 = null;
            Object o4 = null;
            Label_0375: {
                Object o2 = null;
                Label_0368: {
                    Object g = null;
                    Label_0303: {
                        Label_0144: {
                            if (label2 == 0) {
                                break Label_0144;
                            }
                            Label_0110: {
                                if (label2 == 1) {
                                    break Label_0110;
                                }
                                Label_0100: {
                                    if (label2 != 2) {
                                        break Label_0100;
                                    }
                                    final ad0.b b = (ad0.b)redditOnboardingChainingUseCase$completeOnboardingV2$1.L$1;
                                    o2 = redditOnboardingChainingUseCase$completeOnboardingV2$1.L$0;
                                    try {
                                        aj2.c.Q0(o);
                                        break Label_0368;
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        final ad0.b b2;
                                        Label_0278: {
                                            b2 = (ad0.b)g;
                                        }
                                        g = o2;
                                        o2 = b2;
                                        break Label_0303;
                                    Block_11_Outer:
                                        while (true) {
                                            iftrue(Label_0278:)(((UpdateResponse)o).getSuccess());
                                            while (true) {
                                                Block_13: {
                                                    break Block_13;
                                                    Label_0236:
                                                    final ad0.b b3 = (ad0.b)o2;
                                                    o2 = g;
                                                    g = b3;
                                                    continue Block_11_Outer;
                                                    final b a = this.a;
                                                    final ad0.c e;
                                                    final Set l2 = CollectionsKt___CollectionsKt.l2((Iterable)e.b);
                                                    redditOnboardingChainingUseCase$completeOnboardingV2$1.L$0 = this;
                                                    redditOnboardingChainingUseCase$completeOnboardingV2$1.L$1 = g;
                                                    redditOnboardingChainingUseCase$completeOnboardingV2$1.L$2 = o2;
                                                    redditOnboardingChainingUseCase$completeOnboardingV2$1.label = 1;
                                                    o = a.m(l2, (ContinuationImpl)redditOnboardingChainingUseCase$completeOnboardingV2$1);
                                                    iftrue(Label_0236:)(o != coroutine_SUSPENDED);
                                                    return coroutine_SUSPENDED;
                                                }
                                                bv2.a.a.d("Failed to persist topics while onboarding process.", new Object[0]);
                                                return Boolean.FALSE;
                                                aj2.c.Q0(o);
                                                o2 = this.f;
                                                final ad0.c e = ((a)o2).e;
                                                g = ((a)o2).g;
                                                o2 = ((a)o2).f;
                                                iftrue(Label_0301:)(e == null);
                                                continue;
                                            }
                                            g = redditOnboardingChainingUseCase$completeOnboardingV2$1.L$2;
                                            o2 = redditOnboardingChainingUseCase$completeOnboardingV2$1.L$1;
                                            final RedditOnboardingChainingUseCase redditOnboardingChainingUseCase = (RedditOnboardingChainingUseCase)redditOnboardingChainingUseCase$completeOnboardingV2$1.L$0;
                                            aj2.c.Q0(o);
                                            continue Block_11_Outer;
                                        }
                                    }
                                    catch (final CancellationException ex) {
                                        throw l$0;
                                    }
                                    finally {
                                        break Label_0409;
                                    }
                                }
                            }
                        }
                        Label_0301: {
                            l$0 = this;
                        }
                    }
                    o3 = l$0;
                    o4 = o2;
                    if (g == null) {
                        break Label_0375;
                    }
                    final List a2 = ((ad0.a)g).a;
                    redditOnboardingChainingUseCase$completeOnboardingV2$1.L$0 = l$0;
                    redditOnboardingChainingUseCase$completeOnboardingV2$1.L$1 = o2;
                    redditOnboardingChainingUseCase$completeOnboardingV2$1.L$2 = null;
                    redditOnboardingChainingUseCase$completeOnboardingV2$1.label = 2;
                    if (((RedditOnboardingChainingUseCase)l$0).e(a2, (ContinuationImpl)redditOnboardingChainingUseCase$completeOnboardingV2$1) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    final RedditOnboardingChainingUseCase redditOnboardingChainingUseCase2 = (RedditOnboardingChainingUseCase)l$0;
                    l$0 = o2;
                    o2 = redditOnboardingChainingUseCase2;
                }
                o4 = l$0;
                o3 = o2;
            }
            if (o4 != null) {
                ((RedditOnboardingChainingUseCase)o3).c.L(true);
                ((RedditOnboardingChainingUseCase)o3).a.p(((ad0.b)o4).a);
            }
            return Boolean.TRUE;
        }
        bv2.a.a.f((Throwable)l$0, "Failed to complete onboarding process.", new Object[0]);
        return Boolean.FALSE;
    }
    
    public final Object e(final List list, final ContinuationImpl continuationImpl) {
        this.b(list.size());
        if (!(list.isEmpty() ^ true)) {
            return pg2.j.a;
        }
        final ArrayList list2 = new ArrayList(m.P0((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(kotlin.text.b.y2((CharSequence)"r/", (String)iterator.next()));
        }
        final Object a = kotlinx.coroutines.rx2.d.a(this.b.g0((List)list2, SubredditActionSource.ONBOARDING), (tg2.c)continuationImpl);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return pg2.j.a;
    }
}
