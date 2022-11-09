// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.room.dao;

import java.util.Iterator;
import ah2.f;
import java.util.Collection;
import qg2.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import pg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.util.List;
import tg2.c;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import i60.a0;
import s70.a;

public interface g extends s70.a<a0>
{
    Object R1(final String p0, final ContinuationImpl p1);
    
    Object Z0(final ArrayList p0, final c p1);
    
    Object c1(final ArrayList p0, final c p1);
    
    Object e0(final List p0, final ContinuationImpl p1);
    
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
                surveyStatusDao$incrementTriggerCount$2 = new SurveyStatusDao$incrementTriggerCount$1((c<? super SurveyStatusDao$incrementTriggerCount$1>)c);
            }
            Object o = surveyStatusDao$incrementTriggerCount$2.result;
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            final int label2 = surveyStatusDao$incrementTriggerCount$2.label;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        aj2.c.Q0(o);
                        return j.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    l$2 = (Iterable)surveyStatusDao$incrementTriggerCount$2.L$1;
                    l$0 = (h)surveyStatusDao$incrementTriggerCount$2.L$0;
                    aj2.c.Q0(o);
                }
            }
            else {
                aj2.c.Q0(o);
                final List h2 = CollectionsKt___CollectionsKt.h2(l$2);
                surveyStatusDao$incrementTriggerCount$2.L$0 = l$0;
                surveyStatusDao$incrementTriggerCount$2.L$1 = l$2;
                surveyStatusDao$incrementTriggerCount$2.label = 1;
                if ((o = l$0.e0(h2, (ContinuationImpl)surveyStatusDao$incrementTriggerCount$2)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final List list = (List)o;
            final ArrayList list2 = new ArrayList<String>(m.P0((Iterable)list, 10));
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(((a0)iterator.next()).a);
            }
            final List j1 = CollectionsKt___CollectionsKt.J1(l$2, (List)list2);
            final ArrayList list3 = new ArrayList<a0>(m.P0((Iterable)j1, 10));
            final Iterator iterator2 = j1.iterator();
            while (iterator2.hasNext()) {
                list3.add(new a0((String)iterator2.next(), 0L));
            }
            final ArrayList n1 = CollectionsKt___CollectionsKt.N1((Iterable)list3, (Collection)list);
            final ArrayList list4 = new ArrayList<a0>(m.P0((Iterable)n1, 10));
            for (final a0 a0 : n1) {
                final long b = a0.b;
                final String a2 = a0.a;
                f.f((Object)a2, "surveyId");
                list4.add(new a0(a2, b + 1L));
            }
            surveyStatusDao$incrementTriggerCount$2.L$0 = null;
            surveyStatusDao$incrementTriggerCount$2.L$1 = null;
            surveyStatusDao$incrementTriggerCount$2.label = 2;
            if (((g)l$0).c1(list4, (c)surveyStatusDao$incrementTriggerCount$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            return j.a;
        }
    }
}
