// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.room.dao;

import java.util.Iterator;
import sg2.e;
import java.util.Collection;
import ig2.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import hg2.j;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lg2.c;
import java.util.ArrayList;
import b60.a0;
import k70.a;

public interface g extends k70.a<a0>
{
    Object L1(final ArrayList p0, final c p1);
    
    Object S(final ArrayList p0, final c p1);
    
    Object h2(final String p0, final ContinuationImpl p1);
    
    Object n0(final List p0, final ContinuationImpl p1);
    
    public static final class a
    {
        public static Object a(h l$0, Iterable l$2, final c c) {
            SurveyStatusDao$incrementTriggerCount$1 surveyStatusDao$incrementTriggerCount$2 = null;
            Label_0049: {
                if (c instanceof SurveyStatusDao$incrementTriggerCount$1) {
                    final SurveyStatusDao$incrementTriggerCount$1 surveyStatusDao$incrementTriggerCount$1 = (SurveyStatusDao$incrementTriggerCount$1)c;
                    final int label = surveyStatusDao$incrementTriggerCount$1.label;
                    if ((label & Integer.MIN_VALUE) != 0x0) {
                        surveyStatusDao$incrementTriggerCount$1.label = label + Integer.MIN_VALUE;
                        surveyStatusDao$incrementTriggerCount$2 = surveyStatusDao$incrementTriggerCount$1;
                        break Label_0049;
                    }
                }
                surveyStatusDao$incrementTriggerCount$2 = new SurveyStatusDao$incrementTriggerCount$1(c);
            }
            Object o = surveyStatusDao$incrementTriggerCount$2.result;
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            final int label2 = surveyStatusDao$incrementTriggerCount$2.label;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        b.k0(o);
                        return j.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    l$2 = (Iterable)surveyStatusDao$incrementTriggerCount$2.L$1;
                    l$0 = (h)surveyStatusDao$incrementTriggerCount$2.L$0;
                    b.k0(o);
                }
            }
            else {
                b.k0(o);
                final List q4 = CollectionsKt___CollectionsKt.q4(l$2);
                surveyStatusDao$incrementTriggerCount$2.L$0 = l$0;
                surveyStatusDao$incrementTriggerCount$2.L$1 = l$2;
                surveyStatusDao$incrementTriggerCount$2.label = 1;
                if ((o = l$0.n0(q4, (ContinuationImpl)surveyStatusDao$incrementTriggerCount$2)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final List list = (List)o;
            final ArrayList list2 = new ArrayList<String>(m.c3((Iterable)list, 10));
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(((a0)iterator.next()).a);
            }
            final List t3 = CollectionsKt___CollectionsKt.T3(l$2, (List)list2);
            final ArrayList list3 = new ArrayList<a0>(m.c3((Iterable)t3, 10));
            final Iterator iterator2 = t3.iterator();
            while (iterator2.hasNext()) {
                list3.add(new a0((String)iterator2.next(), 0L));
            }
            final ArrayList w3 = CollectionsKt___CollectionsKt.W3((Iterable)list3, (Collection)list);
            final ArrayList list4 = new ArrayList<a0>(m.c3((Iterable)w3, 10));
            for (final a0 a0 : w3) {
                final long b = a0.b;
                final String a2 = a0.a;
                e.f((Object)a2, "surveyId");
                list4.add(new a0(a2, b + 1L));
            }
            surveyStatusDao$incrementTriggerCount$2.L$0 = null;
            surveyStatusDao$incrementTriggerCount$2.L$1 = null;
            surveyStatusDao$incrementTriggerCount$2.label = 2;
            if (l$0.S(list4, (c)surveyStatusDao$incrementTriggerCount$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            return j.a;
        }
    }
}
