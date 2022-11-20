// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.survey.datasource;

import com.reddit.domain.survey.model.Survey;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import d60.a0;
import java.util.LinkedHashMap;
import dg2.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import a70.a;
import com.reddit.domain.survey.model.TriggerEvent;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import d60.z;
import com.reddit.domain.survey.model.LocalDemoSurvey;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.reddit.data.survey.repository.RedditSurveyRepository;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import c60.w1;
import com.reddit.data.room.dao.g;

public final class DatabaseSurveyDataSource
{
    public final g a;
    public final w1 b;
    
    @Inject
    public DatabaseSurveyDataSource(final g a, final w1 b) {
        e.f((Object)a, "surveyStatusDao");
        e.f((Object)b, "surveyLocalDemoDao");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final c<? super j> c) {
        DatabaseSurveyDataSource$clearLocalDemoSurvey$1 databaseSurveyDataSource$clearLocalDemoSurvey$2 = null;
        Label_0047: {
            if (c instanceof DatabaseSurveyDataSource$clearLocalDemoSurvey$1) {
                final DatabaseSurveyDataSource$clearLocalDemoSurvey$1 databaseSurveyDataSource$clearLocalDemoSurvey$1 = (DatabaseSurveyDataSource$clearLocalDemoSurvey$1)c;
                final int label = databaseSurveyDataSource$clearLocalDemoSurvey$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseSurveyDataSource$clearLocalDemoSurvey$1.label = label + Integer.MIN_VALUE;
                    databaseSurveyDataSource$clearLocalDemoSurvey$2 = databaseSurveyDataSource$clearLocalDemoSurvey$1;
                    break Label_0047;
                }
            }
            databaseSurveyDataSource$clearLocalDemoSurvey$2 = new DatabaseSurveyDataSource$clearLocalDemoSurvey$1(this, (c)c);
        }
        final Object result = databaseSurveyDataSource$clearLocalDemoSurvey$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = databaseSurveyDataSource$clearLocalDemoSurvey$2.label;
        DatabaseSurveyDataSource databaseSurveyDataSource;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    d.b4(result);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                databaseSurveyDataSource = (DatabaseSurveyDataSource)databaseSurveyDataSource$clearLocalDemoSurvey$2.L$0;
                d.b4(result);
            }
        }
        else {
            d.b4(result);
            final w1 b = this.b;
            databaseSurveyDataSource$clearLocalDemoSurvey$2.L$0 = this;
            databaseSurveyDataSource$clearLocalDemoSurvey$2.label = 1;
            if (b.o((c)databaseSurveyDataSource$clearLocalDemoSurvey$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            databaseSurveyDataSource = this;
        }
        final g a = databaseSurveyDataSource.a;
        final String j = RedditSurveyRepository.j;
        databaseSurveyDataSource$clearLocalDemoSurvey$2.L$0 = null;
        databaseSurveyDataSource$clearLocalDemoSurvey$2.label = 2;
        if (a.M1(j, (ContinuationImpl)databaseSurveyDataSource$clearLocalDemoSurvey$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return cg2.j.a;
    }
    
    public final Object b(final c<? super LocalDemoSurvey> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof DatabaseSurveyDataSource$getLocalDemoSurvey$1) {
                final DatabaseSurveyDataSource$getLocalDemoSurvey$1 databaseSurveyDataSource$getLocalDemoSurvey$1 = (DatabaseSurveyDataSource$getLocalDemoSurvey$1)c;
                final int label = databaseSurveyDataSource$getLocalDemoSurvey$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseSurveyDataSource$getLocalDemoSurvey$1.label = label + Integer.MIN_VALUE;
                    o = databaseSurveyDataSource$getLocalDemoSurvey$1;
                    break Label_0051;
                }
            }
            o = new DatabaseSurveyDataSource$getLocalDemoSurvey$1(this, (c)c);
        }
        final Object result = ((DatabaseSurveyDataSource$getLocalDemoSurvey$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((DatabaseSurveyDataSource$getLocalDemoSurvey$1)o).label;
        Object a;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            a = result;
        }
        else {
            d.b4(result);
            final w1 b = this.b;
            ((DatabaseSurveyDataSource$getLocalDemoSurvey$1)o).label = 1;
            if ((a = b.a((c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final z z = (z)CollectionsKt___CollectionsKt.U4((List)a);
        if (z != null) {
            final TriggerEvent[] values = TriggerEvent.values();
            for (int i = 0; i < values.length; ++i) {
                final TriggerEvent triggerEvent = values[i];
                if (e.a((Object)a70.a.b(triggerEvent), (Object)z.b)) {
                    return new LocalDemoSurvey(triggerEvent, z.c);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return null;
    }
    
    public final Serializable c(ArrayList l$0, final c c) {
        Object o = null;
        Label_0051: {
            if (c instanceof DatabaseSurveyDataSource$getSurveyTriggerCounts$1) {
                final DatabaseSurveyDataSource$getSurveyTriggerCounts$1 databaseSurveyDataSource$getSurveyTriggerCounts$1 = (DatabaseSurveyDataSource$getSurveyTriggerCounts$1)c;
                final int label = databaseSurveyDataSource$getSurveyTriggerCounts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseSurveyDataSource$getSurveyTriggerCounts$1.label = label + Integer.MIN_VALUE;
                    o = databaseSurveyDataSource$getSurveyTriggerCounts$1;
                    break Label_0051;
                }
            }
            o = new DatabaseSurveyDataSource$getSurveyTriggerCounts$1(this, c);
        }
        final Object result = ((DatabaseSurveyDataSource$getSurveyTriggerCounts$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((DatabaseSurveyDataSource$getSurveyTriggerCounts$1)o).label;
        Object d0;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (Iterable)((DatabaseSurveyDataSource$getSurveyTriggerCounts$1)o).L$0;
            d.b4(result);
            d0 = result;
        }
        else {
            d.b4(result);
            final g a = this.a;
            final ArrayList list = new ArrayList<String>(m.u4(l$0, 10));
            final Iterator iterator = ((ArrayList)l$0).iterator();
            while (iterator.hasNext()) {
                list.add(((xe0.c)iterator.next()).a);
            }
            ((DatabaseSurveyDataSource$getSurveyTriggerCounts$1)o).L$0 = l$0;
            ((DatabaseSurveyDataSource$getSurveyTriggerCounts$1)o).label = 1;
            if ((d0 = a.d0(list, (ContinuationImpl)o)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
        }
        final Iterable iterable = (Iterable)d0;
        final int p2 = d.p3(m.u4(iterable, 10));
        final int n = 16;
        int n2;
        if ((n2 = p2) < 16) {
            n2 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap<xe0.c, a0>(n2);
        for (final Object next : iterable) {
            final String a2 = ((a0)next).a;
            e.f((Object)a2, "value");
            linkedHashMap.put(new xe0.c(a2), (a0)next);
        }
        int p3 = d.p3(m.u4(l$0, 10));
        if (p3 < 16) {
            p3 = n;
        }
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap(p3);
        for (final Object next2 : l$0) {
            final a0 a3 = linkedHashMap.get(new xe0.c(((xe0.c)next2).a));
            long b;
            if (a3 != null) {
                b = a3.b;
            }
            else {
                b = 0L;
            }
            linkedHashMap2.put(next2, (Object)new Long(b));
        }
        return linkedHashMap2;
    }
    
    public final Object d(final xe0.a a, final TriggerEvent triggerEvent, final c<? super Iterable<xe0.c>> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof DatabaseSurveyDataSource$incrementTriggerEvent$1) {
                final DatabaseSurveyDataSource$incrementTriggerEvent$1 databaseSurveyDataSource$incrementTriggerEvent$1 = (DatabaseSurveyDataSource$incrementTriggerEvent$1)c;
                final int label = databaseSurveyDataSource$incrementTriggerEvent$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseSurveyDataSource$incrementTriggerEvent$1.label = label + Integer.MIN_VALUE;
                    o = databaseSurveyDataSource$incrementTriggerEvent$1;
                    break Label_0054;
                }
            }
            o = new DatabaseSurveyDataSource$incrementTriggerEvent$1(this, (c)c);
        }
        final Object result = ((DatabaseSurveyDataSource$incrementTriggerEvent$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((DatabaseSurveyDataSource$incrementTriggerEvent$1)o).label;
        Set keySet;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            keySet = (Set)((DatabaseSurveyDataSource$incrementTriggerEvent$1)o).L$0;
            d.b4(result);
        }
        else {
            d.b4(result);
            final Map a2 = a.a;
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (final Map.Entry<K, Survey> entry : a2.entrySet()) {
                if (entry.getValue().getTriggerEvent() == triggerEvent) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            keySet = linkedHashMap.keySet();
            final g a3 = this.a;
            final ArrayList list = new ArrayList<String>(m.u4((Iterable)keySet, 10));
            final Iterator iterator2 = keySet.iterator();
            while (iterator2.hasNext()) {
                list.add(((xe0.c)iterator2.next()).a);
            }
            ((DatabaseSurveyDataSource$incrementTriggerEvent$1)o).L$0 = keySet;
            ((DatabaseSurveyDataSource$incrementTriggerEvent$1)o).label = 1;
            if (a3.t0(list, (c)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return keySet;
    }
    
    public final Object e(final LocalDemoSurvey localDemoSurvey, final c<? super j> c) {
        DatabaseSurveyDataSource$setAndClearLocalDemoSurvey$1 databaseSurveyDataSource$setAndClearLocalDemoSurvey$2 = null;
        Label_0051: {
            if (c instanceof DatabaseSurveyDataSource$setAndClearLocalDemoSurvey$1) {
                final DatabaseSurveyDataSource$setAndClearLocalDemoSurvey$1 databaseSurveyDataSource$setAndClearLocalDemoSurvey$1 = (DatabaseSurveyDataSource$setAndClearLocalDemoSurvey$1)c;
                final int label = databaseSurveyDataSource$setAndClearLocalDemoSurvey$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseSurveyDataSource$setAndClearLocalDemoSurvey$1.label = label + Integer.MIN_VALUE;
                    databaseSurveyDataSource$setAndClearLocalDemoSurvey$2 = databaseSurveyDataSource$setAndClearLocalDemoSurvey$1;
                    break Label_0051;
                }
            }
            databaseSurveyDataSource$setAndClearLocalDemoSurvey$2 = new DatabaseSurveyDataSource$setAndClearLocalDemoSurvey$1(this, (c)c);
        }
        final Object result = databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.label;
        DatabaseSurveyDataSource databaseSurveyDataSource;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    d.b4(result);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                databaseSurveyDataSource = (DatabaseSurveyDataSource)databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.L$0;
                d.b4(result);
            }
        }
        else {
            d.b4(result);
            final w1 b = this.b;
            final String b2 = a70.a.b(localDemoSurvey.getTriggerEvent());
            e.c((Object)b2);
            final z z = new z(0, b2, localDemoSurvey.getTriggerCount());
            databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.L$0 = this;
            databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.label = 1;
            if (b.p0(z, (c)databaseSurveyDataSource$setAndClearLocalDemoSurvey$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            databaseSurveyDataSource = this;
        }
        final g a = databaseSurveyDataSource.a;
        final String j = RedditSurveyRepository.j;
        databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.L$0 = null;
        databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.label = 2;
        if (a.M1(j, (ContinuationImpl)databaseSurveyDataSource$setAndClearLocalDemoSurvey$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return cg2.j.a;
    }
}
