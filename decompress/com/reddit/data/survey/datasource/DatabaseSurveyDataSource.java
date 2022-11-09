// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.survey.datasource;

import com.reddit.domain.survey.model.Survey;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import i60.a0;
import java.util.LinkedHashMap;
import a4.u1;
import qg2.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import g70.a;
import com.reddit.domain.survey.model.TriggerEvent;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import i60.z;
import com.reddit.domain.survey.model.LocalDemoSurvey;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.reddit.data.survey.repository.RedditSurveyRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import h60.z1;
import com.reddit.data.room.dao.g;

public final class DatabaseSurveyDataSource
{
    public final g a;
    public final z1 b;
    
    @Inject
    public DatabaseSurveyDataSource(final g a, final z1 b) {
        f.f((Object)a, "surveyStatusDao");
        f.f((Object)b, "surveyLocalDemoDao");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final c<? super j> c) {
        DatabaseSurveyDataSource$clearLocalDemoSurvey.DatabaseSurveyDataSource$clearLocalDemoSurvey$1 databaseSurveyDataSource$clearLocalDemoSurvey$2 = null;
        Label_0047: {
            if (c instanceof DatabaseSurveyDataSource$clearLocalDemoSurvey.DatabaseSurveyDataSource$clearLocalDemoSurvey$1) {
                final DatabaseSurveyDataSource$clearLocalDemoSurvey.DatabaseSurveyDataSource$clearLocalDemoSurvey$1 databaseSurveyDataSource$clearLocalDemoSurvey$1 = (DatabaseSurveyDataSource$clearLocalDemoSurvey.DatabaseSurveyDataSource$clearLocalDemoSurvey$1)c;
                final int label = databaseSurveyDataSource$clearLocalDemoSurvey$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseSurveyDataSource$clearLocalDemoSurvey$1.label = label + Integer.MIN_VALUE;
                    databaseSurveyDataSource$clearLocalDemoSurvey$2 = databaseSurveyDataSource$clearLocalDemoSurvey$1;
                    break Label_0047;
                }
            }
            databaseSurveyDataSource$clearLocalDemoSurvey$2 = new DatabaseSurveyDataSource$clearLocalDemoSurvey.DatabaseSurveyDataSource$clearLocalDemoSurvey$1(this, (c)c);
        }
        final Object result = databaseSurveyDataSource$clearLocalDemoSurvey$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = databaseSurveyDataSource$clearLocalDemoSurvey$2.label;
        DatabaseSurveyDataSource databaseSurveyDataSource;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    aj2.c.Q0(result);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                databaseSurveyDataSource = (DatabaseSurveyDataSource)databaseSurveyDataSource$clearLocalDemoSurvey$2.L$0;
                aj2.c.Q0(result);
            }
        }
        else {
            aj2.c.Q0(result);
            final z1 b = this.b;
            databaseSurveyDataSource$clearLocalDemoSurvey$2.L$0 = this;
            databaseSurveyDataSource$clearLocalDemoSurvey$2.label = 1;
            if (b.m((c)databaseSurveyDataSource$clearLocalDemoSurvey$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            databaseSurveyDataSource = this;
        }
        final g a = databaseSurveyDataSource.a;
        final String j = RedditSurveyRepository.j;
        databaseSurveyDataSource$clearLocalDemoSurvey$2.L$0 = null;
        databaseSurveyDataSource$clearLocalDemoSurvey$2.label = 2;
        if (a.R1(j, (ContinuationImpl)databaseSurveyDataSource$clearLocalDemoSurvey$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return pg2.j.a;
    }
    
    public final Object b(final c<? super LocalDemoSurvey> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof DatabaseSurveyDataSource$getLocalDemoSurvey.DatabaseSurveyDataSource$getLocalDemoSurvey$1) {
                final DatabaseSurveyDataSource$getLocalDemoSurvey.DatabaseSurveyDataSource$getLocalDemoSurvey$1 databaseSurveyDataSource$getLocalDemoSurvey$1 = (DatabaseSurveyDataSource$getLocalDemoSurvey.DatabaseSurveyDataSource$getLocalDemoSurvey$1)c;
                final int label = databaseSurveyDataSource$getLocalDemoSurvey$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseSurveyDataSource$getLocalDemoSurvey$1.label = label + Integer.MIN_VALUE;
                    o = databaseSurveyDataSource$getLocalDemoSurvey$1;
                    break Label_0047;
                }
            }
            o = new DatabaseSurveyDataSource$getLocalDemoSurvey.DatabaseSurveyDataSource$getLocalDemoSurvey$1(this, (c)c);
        }
        final Object result = ((DatabaseSurveyDataSource$getLocalDemoSurvey.DatabaseSurveyDataSource$getLocalDemoSurvey$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((DatabaseSurveyDataSource$getLocalDemoSurvey.DatabaseSurveyDataSource$getLocalDemoSurvey$1)o).label;
        Object a;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            a = result;
        }
        else {
            aj2.c.Q0(result);
            final z1 b = this.b;
            ((DatabaseSurveyDataSource$getLocalDemoSurvey.DatabaseSurveyDataSource$getLocalDemoSurvey$1)o).label = 1;
            if ((a = b.a((c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final z z = (z)CollectionsKt___CollectionsKt.s1((List)a);
        if (z != null) {
            final TriggerEvent[] values = TriggerEvent.values();
            for (int i = 0; i < values.length; ++i) {
                final TriggerEvent triggerEvent = values[i];
                if (f.a((Object)g70.a.b(triggerEvent), (Object)z.b)) {
                    return new LocalDemoSurvey(triggerEvent, z.c);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return null;
    }
    
    public final Serializable c(ArrayList l$0, final c c) {
        DatabaseSurveyDataSource$getSurveyTriggerCounts$1 databaseSurveyDataSource$getSurveyTriggerCounts$2 = null;
        Label_0050: {
            if (c instanceof DatabaseSurveyDataSource$getSurveyTriggerCounts$1) {
                final DatabaseSurveyDataSource$getSurveyTriggerCounts$1 databaseSurveyDataSource$getSurveyTriggerCounts$1 = (DatabaseSurveyDataSource$getSurveyTriggerCounts$1)c;
                final int label = databaseSurveyDataSource$getSurveyTriggerCounts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseSurveyDataSource$getSurveyTriggerCounts$1.label = label + Integer.MIN_VALUE;
                    databaseSurveyDataSource$getSurveyTriggerCounts$2 = databaseSurveyDataSource$getSurveyTriggerCounts$1;
                    break Label_0050;
                }
            }
            databaseSurveyDataSource$getSurveyTriggerCounts$2 = new DatabaseSurveyDataSource$getSurveyTriggerCounts$1(this, (c<? super DatabaseSurveyDataSource$getSurveyTriggerCounts$1>)c);
        }
        final Object result = databaseSurveyDataSource$getSurveyTriggerCounts$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = databaseSurveyDataSource$getSurveyTriggerCounts$2.label;
        Object e0;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (Iterable)databaseSurveyDataSource$getSurveyTriggerCounts$2.L$0;
            aj2.c.Q0(result);
            e0 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final ArrayList list = new ArrayList<String>(m.P0(l$0, 10));
            final Iterator iterator = ((ArrayList)l$0).iterator();
            while (iterator.hasNext()) {
                list.add(((gf0.c)iterator.next()).a);
            }
            databaseSurveyDataSource$getSurveyTriggerCounts$2.L$0 = l$0;
            databaseSurveyDataSource$getSurveyTriggerCounts$2.label = 1;
            if ((e0 = a.e0(list, databaseSurveyDataSource$getSurveyTriggerCounts$2)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
        }
        final Iterable iterable = (Iterable)e0;
        final int a2 = u1.A0(m.P0(iterable, 10));
        final int n = 16;
        int n2;
        if ((n2 = a2) < 16) {
            n2 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap<gf0.c, a0>(n2);
        for (final Object next : iterable) {
            final String a3 = ((a0)next).a;
            f.f((Object)a3, "value");
            linkedHashMap.put(new gf0.c(a3), (a0)next);
        }
        int a4 = u1.A0(m.P0(l$0, 10));
        if (a4 < 16) {
            a4 = n;
        }
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap(a4);
        for (final Object next2 : l$0) {
            final a0 a5 = linkedHashMap.get(new gf0.c(((gf0.c)next2).a));
            long b;
            if (a5 != null) {
                b = a5.b;
            }
            else {
                b = 0L;
            }
            linkedHashMap2.put(next2, (Object)new Long(b));
        }
        return linkedHashMap2;
    }
    
    public final Object d(final gf0.a a, final TriggerEvent triggerEvent, final c<? super Iterable<gf0.c>> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof DatabaseSurveyDataSource$incrementTriggerEvent.DatabaseSurveyDataSource$incrementTriggerEvent$1) {
                final DatabaseSurveyDataSource$incrementTriggerEvent.DatabaseSurveyDataSource$incrementTriggerEvent$1 databaseSurveyDataSource$incrementTriggerEvent$1 = (DatabaseSurveyDataSource$incrementTriggerEvent.DatabaseSurveyDataSource$incrementTriggerEvent$1)c;
                final int label = databaseSurveyDataSource$incrementTriggerEvent$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseSurveyDataSource$incrementTriggerEvent$1.label = label + Integer.MIN_VALUE;
                    o = databaseSurveyDataSource$incrementTriggerEvent$1;
                    break Label_0054;
                }
            }
            o = new DatabaseSurveyDataSource$incrementTriggerEvent.DatabaseSurveyDataSource$incrementTriggerEvent$1(this, (c)c);
        }
        final Object result = ((DatabaseSurveyDataSource$incrementTriggerEvent.DatabaseSurveyDataSource$incrementTriggerEvent$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((DatabaseSurveyDataSource$incrementTriggerEvent.DatabaseSurveyDataSource$incrementTriggerEvent$1)o).label;
        Set keySet;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            keySet = (Set)((DatabaseSurveyDataSource$incrementTriggerEvent.DatabaseSurveyDataSource$incrementTriggerEvent$1)o).L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            final Map a2 = a.a;
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (final Map.Entry<K, Survey> entry : a2.entrySet()) {
                if (entry.getValue().getTriggerEvent() == triggerEvent) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            keySet = linkedHashMap.keySet();
            final g a3 = this.a;
            final ArrayList list = new ArrayList<String>(m.P0((Iterable)keySet, 10));
            final Iterator iterator2 = keySet.iterator();
            while (iterator2.hasNext()) {
                list.add(((gf0.c)iterator2.next()).a);
            }
            ((DatabaseSurveyDataSource$incrementTriggerEvent.DatabaseSurveyDataSource$incrementTriggerEvent$1)o).L$0 = keySet;
            ((DatabaseSurveyDataSource$incrementTriggerEvent.DatabaseSurveyDataSource$incrementTriggerEvent$1)o).label = 1;
            if (a3.Z0(list, (c)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return keySet;
    }
    
    public final Object e(final LocalDemoSurvey localDemoSurvey, final c<? super j> c) {
        DatabaseSurveyDataSource$setAndClearLocalDemoSurvey.DatabaseSurveyDataSource$setAndClearLocalDemoSurvey$1 databaseSurveyDataSource$setAndClearLocalDemoSurvey$2 = null;
        Label_0050: {
            if (c instanceof DatabaseSurveyDataSource$setAndClearLocalDemoSurvey.DatabaseSurveyDataSource$setAndClearLocalDemoSurvey$1) {
                final DatabaseSurveyDataSource$setAndClearLocalDemoSurvey.DatabaseSurveyDataSource$setAndClearLocalDemoSurvey$1 databaseSurveyDataSource$setAndClearLocalDemoSurvey$1 = (DatabaseSurveyDataSource$setAndClearLocalDemoSurvey.DatabaseSurveyDataSource$setAndClearLocalDemoSurvey$1)c;
                final int label = databaseSurveyDataSource$setAndClearLocalDemoSurvey$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseSurveyDataSource$setAndClearLocalDemoSurvey$1.label = label + Integer.MIN_VALUE;
                    databaseSurveyDataSource$setAndClearLocalDemoSurvey$2 = databaseSurveyDataSource$setAndClearLocalDemoSurvey$1;
                    break Label_0050;
                }
            }
            databaseSurveyDataSource$setAndClearLocalDemoSurvey$2 = new DatabaseSurveyDataSource$setAndClearLocalDemoSurvey.DatabaseSurveyDataSource$setAndClearLocalDemoSurvey$1(this, (c)c);
        }
        final Object result = databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.label;
        DatabaseSurveyDataSource databaseSurveyDataSource;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    aj2.c.Q0(result);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                databaseSurveyDataSource = (DatabaseSurveyDataSource)databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.L$0;
                aj2.c.Q0(result);
            }
        }
        else {
            aj2.c.Q0(result);
            final z1 b = this.b;
            final String b2 = g70.a.b(localDemoSurvey.getTriggerEvent());
            f.c((Object)b2);
            final z z = new z(0, b2, localDemoSurvey.getTriggerCount());
            databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.L$0 = this;
            databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.label = 1;
            if (b.Q1(z, (c)databaseSurveyDataSource$setAndClearLocalDemoSurvey$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            databaseSurveyDataSource = this;
        }
        final g a = databaseSurveyDataSource.a;
        final String j = RedditSurveyRepository.j;
        databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.L$0 = null;
        databaseSurveyDataSource$setAndClearLocalDemoSurvey$2.label = 2;
        if (a.R1(j, (ContinuationImpl)databaseSurveyDataSource$setAndClearLocalDemoSurvey$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return pg2.j.a;
    }
}
