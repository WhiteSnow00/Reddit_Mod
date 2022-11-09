// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.powerups;

import com.reddit.mutations.b8$e;
import com.reddit.mutations.b8$f;
import com.reddit.mutations.b8$a;
import com.reddit.mutations.b8$d;
import com.reddit.mutations.b8$c;
import com.reddit.mutations.b8;
import o22.r4;
import com.reddit.type.PowerupsSettingsInput;
import com.reddit.mutations.a5$d;
import com.reddit.mutations.a5$c;
import com.reddit.mutations.a5$b;
import com.reddit.mutations.a5;
import o22.g2;
import zg2.l;
import kotlin.sequences.b;
import com.reddit.queries.RedditorsPowerupsQuery$Data;
import com.reddit.queries.RedditorsPowerupsQuery;
import com.reddit.queries.SubredditsPowerupBenefitsQuery$c;
import java.util.Iterator;
import com.reddit.domain.powerups.PowerupsBenefit;
import com.reddit.type.SubredditBenefit;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.LinkedHashMap;
import a4.u1;
import kotlin.collections.EmptySet;
import kotlin.Pair;
import qg2.m;
import com.reddit.queries.SubredditsPowerupBenefitsQuery$d;
import com.reddit.queries.SubredditsPowerupBenefitsQuery$a;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import com.reddit.queries.SubredditsPowerupBenefitsQuery$Data;
import com.reddit.queries.SubredditsPowerupBenefitsQuery;
import java.io.Serializable;
import java.util.List;
import com.reddit.mutations.i$a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.i$d;
import com.reddit.mutations.i$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import tg2.c;
import com.reddit.fragment.SubredditPowerupInfoMin$a;
import com.reddit.fragment.SubredditPowerupInfoMin;
import javax.inject.Inject;
import ah2.f;
import com.reddit.data.model.graphql.GqlFragmentsMapper;
import ur0.g;

public final class RemoteGqlPowerupsDataSource
{
    public final g a;
    public final GqlFragmentsMapper b;
    
    @Inject
    public RemoteGqlPowerupsDataSource(final g a, final GqlFragmentsMapper b) {
        f.f((Object)a, "graphQlClient");
        f.f((Object)b, "gqlFragmentsMapper");
        this.a = a;
        this.b = b;
    }
    
    public static kd0.g e(final SubredditPowerupInfoMin subredditPowerupInfoMin, final String s, final boolean b, final boolean b2, final int n, final boolean b3, final Long n2, final Long n3) {
        final String b4 = subredditPowerupInfoMin.b;
        final String c = subredditPowerupInfoMin.c;
        final String d = subredditPowerupInfoMin.d;
        final SubredditPowerupInfoMin$a e = subredditPowerupInfoMin.e;
        String string = null;
        Label_0054: {
            if (e != null) {
                final Object b5 = e.b;
                if (b5 != null) {
                    string = b5.toString();
                    break Label_0054;
                }
            }
            string = null;
        }
        final SubredditPowerupInfoMin$a e2 = subredditPowerupInfoMin.e;
        if (e2 != null) {
            final Object c2 = e2.c;
            if (c2 != null) {
                final String string2 = c2.toString();
                return new kd0.g(s, b, b2, b4, c, d, string, string2, n, b3, n2, n3);
            }
        }
        final String string2 = null;
        return new kd0.g(s, b, b2, b4, c, d, string, string2, n, b3, n2, n3);
    }
    
    public final Object a(String b, final c<? super j> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlPowerupsDataSource$cancelPaidPowerup.RemoteGqlPowerupsDataSource$cancelPaidPowerup$1) {
                final RemoteGqlPowerupsDataSource$cancelPaidPowerup.RemoteGqlPowerupsDataSource$cancelPaidPowerup$1 remoteGqlPowerupsDataSource$cancelPaidPowerup$1 = (RemoteGqlPowerupsDataSource$cancelPaidPowerup.RemoteGqlPowerupsDataSource$cancelPaidPowerup$1)c;
                final int label = remoteGqlPowerupsDataSource$cancelPaidPowerup$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPowerupsDataSource$cancelPaidPowerup$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPowerupsDataSource$cancelPaidPowerup$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlPowerupsDataSource$cancelPaidPowerup.RemoteGqlPowerupsDataSource$cancelPaidPowerup$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPowerupsDataSource$cancelPaidPowerup.RemoteGqlPowerupsDataSource$cancelPaidPowerup$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPowerupsDataSource$cancelPaidPowerup.RemoteGqlPowerupsDataSource$cancelPaidPowerup$1)o).label;
        boolean b2 = true;
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
            final i i = new i(b);
            ((RemoteGqlPowerupsDataSource$cancelPaidPowerup.RemoteGqlPowerupsDataSource$cancelPaidPowerup$1)o).label = 1;
            if ((b3 = e$a.b(14, (k)i, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final i$a a2 = ((i$c)b3).a;
        if (a2 == null || !a2.b) {
            b2 = false;
        }
        if (!b2) {
            if (a2 != null) {
                final List c2 = a2.c;
                if (c2 != null) {
                    final i$d i$d = (i$d)CollectionsKt___CollectionsKt.s1(c2);
                    if (i$d != null && (b = i$d.b) != null) {
                        throw new IllegalStateException(b.toString());
                    }
                }
            }
            b = "GQL backend returned an error";
            throw new IllegalStateException(b.toString());
        }
        return j.a;
    }
    
    public final Serializable b(final List list, final c c) {
        RemoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$1 remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$2 = null;
        Label_0050: {
            if (c instanceof RemoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$1) {
                final RemoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$1 remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$1 = (RemoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$1)c;
                final int label = remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$1.label = label + Integer.MIN_VALUE;
                    remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$2 = remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$1;
                    break Label_0050;
                }
            }
            remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$2 = new RemoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$1(this, (c<? super RemoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$1>)c);
        }
        final Object result = remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$2.label;
        RemoteGqlPowerupsDataSource remoteGqlPowerupsDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlPowerupsDataSource = (RemoteGqlPowerupsDataSource)remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$2.L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final SubredditsPowerupBenefitsQuery subredditsPowerupBenefitsQuery = new SubredditsPowerupBenefitsQuery(list);
            remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$2.L$0 = this;
            remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$2.label = 1;
            b = e$a.b(14, (k)subredditsPowerupBenefitsQuery, (e)a, (RetryAlgo)null, (Map)null, (c)remoteGqlPowerupsDataSource$getSubredditsPowerupBenefits$2, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            remoteGqlPowerupsDataSource = this;
        }
        Object o;
        if ((o = ((SubredditsPowerupBenefitsQuery$Data)b).a) == null) {
            o = EmptyList.INSTANCE;
        }
        final ArrayList<SubredditsPowerupBenefitsQuery$a> list2 = new ArrayList<SubredditsPowerupBenefitsQuery$a>();
        for (final SubredditsPowerupBenefitsQuery$d subredditsPowerupBenefitsQuery$d : o) {
            SubredditsPowerupBenefitsQuery$a d;
            if (subredditsPowerupBenefitsQuery$d != null) {
                d = subredditsPowerupBenefitsQuery$d.d;
            }
            else {
                d = null;
            }
            if (d != null) {
                list2.add(d);
            }
        }
        final ArrayList list3 = new ArrayList<Pair>(m.P0((Iterable)list2, 10));
        for (final SubredditsPowerupBenefitsQuery$a subredditsPowerupBenefitsQuery$a : list2) {
            final String b2 = subredditsPowerupBenefitsQuery$a.b;
            final SubredditsPowerupBenefitsQuery$c d2 = subredditsPowerupBenefitsQuery$a.d;
            Object o2 = null;
            Label_0318: {
                if (d2 != null) {
                    final List b3 = d2.b;
                    if (b3 != null && (o2 = CollectionsKt___CollectionsKt.l2((Iterable)b3)) != null) {
                        break Label_0318;
                    }
                }
                o2 = EmptySet.INSTANCE;
            }
            list3.add(new Pair((Object)b2, o2));
        }
        final Map x1 = kotlin.collections.c.X1((List)list3);
        final LinkedHashMap linkedHashMap = new LinkedHashMap(u1.A0(x1.size()));
        for (final Map.Entry<Object, V> entry : x1.entrySet()) {
            final Object key = entry.getKey();
            final Set set = (Set)entry.getValue();
            final LinkedHashSet set2 = new LinkedHashSet();
            for (final SubredditBenefit subredditBenefit : set) {
                remoteGqlPowerupsDataSource.getClass();
                final PowerupsBenefit.a companion = PowerupsBenefit.Companion;
                final String rawValue = subredditBenefit.getRawValue();
                companion.getClass();
                final PowerupsBenefit a2 = PowerupsBenefit.a.a(rawValue);
                if (a2 != null) {
                    set2.add(a2);
                }
            }
            linkedHashMap.put(key, (Object)set2);
        }
        return linkedHashMap;
    }
    
    public final Object c(final List<String> list, final c<? super Map<String, ? extends Set<String>>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds.RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds$1) {
                final RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds.RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds$1 remoteGqlPowerupsDataSource$getUsersSupportedSubredditIds$1 = (RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds.RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds$1)c;
                final int label = remoteGqlPowerupsDataSource$getUsersSupportedSubredditIds$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPowerupsDataSource$getUsersSupportedSubredditIds$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPowerupsDataSource$getUsersSupportedSubredditIds$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds.RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds.RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds.RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds$1)o).label;
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
            final RedditorsPowerupsQuery redditorsPowerupsQuery = new RedditorsPowerupsQuery((List)list);
            ((RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds.RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds$1)o).label = 1;
            if ((b = e$a.b(14, (k)redditorsPowerupsQuery, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        Object o2;
        if ((o2 = ((RedditorsPowerupsQuery$Data)b).a) == null) {
            o2 = EmptyList.INSTANCE;
        }
        return kotlin.collections.c.Z1((jj2.k)kotlin.sequences.b.e1((jj2.k)CollectionsKt___CollectionsKt.e1((Iterable)o2), (l)RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds.RemoteGqlPowerupsDataSource$getUsersSupportedSubredditIds$2.INSTANCE));
    }
    
    public final Object d(String b, int n, final boolean b2, final c<? super j> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteGqlPowerupsDataSource$reallocatePowerups.RemoteGqlPowerupsDataSource$reallocatePowerups$1) {
                final RemoteGqlPowerupsDataSource$reallocatePowerups.RemoteGqlPowerupsDataSource$reallocatePowerups$1 remoteGqlPowerupsDataSource$reallocatePowerups$1 = (RemoteGqlPowerupsDataSource$reallocatePowerups.RemoteGqlPowerupsDataSource$reallocatePowerups$1)c;
                final int label = remoteGqlPowerupsDataSource$reallocatePowerups$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPowerupsDataSource$reallocatePowerups$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPowerupsDataSource$reallocatePowerups$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlPowerupsDataSource$reallocatePowerups.RemoteGqlPowerupsDataSource$reallocatePowerups$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPowerupsDataSource$reallocatePowerups.RemoteGqlPowerupsDataSource$reallocatePowerups$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPowerupsDataSource$reallocatePowerups.RemoteGqlPowerupsDataSource$reallocatePowerups$1)o).label;
        final int n2 = 1;
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
            final g2 g2 = new g2(b, n, b2);
            final g a = this.a;
            final a5 a2 = new a5(g2);
            ((RemoteGqlPowerupsDataSource$reallocatePowerups.RemoteGqlPowerupsDataSource$reallocatePowerups$1)o).label = 1;
            if ((b3 = e$a.b(14, (k)a2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final a5$d a3 = ((a5$b)b3).a;
        if (a3 != null && a3.b) {
            n = n2;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            if (a3 != null) {
                final List c2 = a3.c;
                if (c2 != null) {
                    final a5$c a5$c = (a5$c)CollectionsKt___CollectionsKt.s1(c2);
                    if (a5$c != null) {
                        b = a5$c.b;
                        throw new IllegalStateException(ak0.m.l("GQL backend returned an error: ", b).toString());
                    }
                }
            }
            b = null;
            throw new IllegalStateException(ak0.m.l("GQL backend returned an error: ", b).toString());
        }
        return j.a;
    }
    
    public final Serializable f(String b, final SubredditBenefit subredditBenefit, final boolean b2, final c c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RemoteGqlPowerupsDataSource$updateBenefitSetting$1) {
                final RemoteGqlPowerupsDataSource$updateBenefitSetting$1 remoteGqlPowerupsDataSource$updateBenefitSetting$1 = (RemoteGqlPowerupsDataSource$updateBenefitSetting$1)c;
                final int label = remoteGqlPowerupsDataSource$updateBenefitSetting$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPowerupsDataSource$updateBenefitSetting$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPowerupsDataSource$updateBenefitSetting$1;
                    break Label_0059;
                }
            }
            o = new RemoteGqlPowerupsDataSource$updateBenefitSetting$1(this, (c<? super RemoteGqlPowerupsDataSource$updateBenefitSetting$1>)c);
        }
        final Object result = ((RemoteGqlPowerupsDataSource$updateBenefitSetting$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPowerupsDataSource$updateBenefitSetting$1)o).label;
        boolean b3 = true;
        Object b4;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b4 = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final b8 b5 = new b8(new r4(b, new PowerupsSettingsInput(ah2.c.X((Object)new o22.e(subredditBenefit, b2)))));
            ((RemoteGqlPowerupsDataSource$updateBenefitSetting$1)o).label = 1;
            if ((b4 = e$a.b(14, (k)b5, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
        }
        final b8$f a2 = ((b8$c)b4).a;
        if (a2 == null || !a2.b) {
            b3 = false;
        }
        if (!b3) {
            if (a2 != null) {
                final List d = a2.d;
                if (d != null) {
                    final b8$d b8$d = (b8$d)CollectionsKt___CollectionsKt.s1(d);
                    if (b8$d != null && (b = b8$d.b) != null) {
                        throw new IllegalStateException(b.toString());
                    }
                }
            }
            b = "GQL backend returned an error";
            throw new IllegalStateException(b.toString());
        }
        if (a2 != null) {
            final b8$e c2 = a2.c;
            if (c2 != null) {
                final List b6 = c2.b;
                if (b6 != null) {
                    final ArrayList<Object> list = new ArrayList<Object>();
                    final Iterator iterator = b6.iterator();
                    while (true) {
                        final Object instance = list;
                        if (!iterator.hasNext()) {
                            return (Serializable)instance;
                        }
                        final b8$a b8$a = (b8$a)iterator.next();
                        final SubredditBenefit b7 = b8$a.b;
                        final PowerupsBenefit.a companion = PowerupsBenefit.Companion;
                        final String rawValue = b7.getRawValue();
                        companion.getClass();
                        final PowerupsBenefit a3 = PowerupsBenefit.a.a(rawValue);
                        Object o2;
                        if (a3 != null) {
                            o2 = new kd0.c(a3, b8$a.c);
                        }
                        else {
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
        final Object instance = EmptyList.INSTANCE;
        return (Serializable)instance;
    }
}
