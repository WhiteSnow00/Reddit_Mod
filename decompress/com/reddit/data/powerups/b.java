// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.powerups;

import com.reddit.mutations.k6$d;
import pg2.j;
import zg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.k6$b;
import com.reddit.mutations.k6;
import com.reddit.fragment.UserAchievementFlair;
import com.reddit.queries.GetUserAchievementFlairsQuery$a;
import java.util.Collection;
import com.reddit.queries.GetUserAchievementFlairsQuery$d;
import kd0.q;
import com.reddit.queries.GetUserAchievementFlairsQuery$e;
import kd0.r;
import com.reddit.queries.GetUserAchievementFlairsQuery$c;
import com.reddit.queries.GetUserAchievementFlairsQuery$Data;
import com.reddit.queries.GetUserAchievementFlairsQuery;
import kl0.b50;
import com.reddit.fragment.SubredditAchievementFlair;
import java.util.Iterator;
import java.util.List;
import com.reddit.queries.j5$a;
import com.reddit.queries.j5$e;
import com.reddit.domain.powerups.FlairCategory;
import w50.i;
import kd0.a;
import com.reddit.queries.j5$d;
import kd0.o;
import java.util.ArrayList;
import qg2.m;
import kotlin.collections.EmptyList;
import com.reddit.queries.j5$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.j5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class b
{
    public final g a;
    
    @Inject
    public b(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Serializable a(final String s, final c c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlPowerupAchievementFlairsDataSource$getSubredditAchievementFlairs$1) {
                final RemoteGqlPowerupAchievementFlairsDataSource$getSubredditAchievementFlairs$1 remoteGqlPowerupAchievementFlairsDataSource$getSubredditAchievementFlairs$1 = (RemoteGqlPowerupAchievementFlairsDataSource$getSubredditAchievementFlairs$1)c;
                final int label = remoteGqlPowerupAchievementFlairsDataSource$getSubredditAchievementFlairs$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPowerupAchievementFlairsDataSource$getSubredditAchievementFlairs$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPowerupAchievementFlairsDataSource$getSubredditAchievementFlairs$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlPowerupAchievementFlairsDataSource$getSubredditAchievementFlairs$1(this, (c<? super RemoteGqlPowerupAchievementFlairsDataSource$getSubredditAchievementFlairs$1>)c);
        }
        final Object result = ((RemoteGqlPowerupAchievementFlairsDataSource$getSubredditAchievementFlairs$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPowerupAchievementFlairsDataSource$getSubredditAchievementFlairs$1)o).label;
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
            final j5 j5 = new j5(s);
            ((RemoteGqlPowerupAchievementFlairsDataSource$getSubredditAchievementFlairs$1)o).label = 1;
            if ((b = e$a.b(14, (k)j5, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
        }
        final j5$e a2 = ((j5$c)b).a;
        List b3 = null;
        Label_0173: {
            if (a2 != null) {
                final j5$a b2 = a2.b;
                if (b2 != null) {
                    b3 = b2.b;
                    break Label_0173;
                }
            }
            b3 = null;
        }
        Object instance = b3;
        if (b3 == null) {
            instance = EmptyList.INSTANCE;
        }
        final ArrayList list = new ArrayList<o>(m.P0((Iterable)instance, 10));
        for (final j5$d j5$d : instance) {
            f.f((Object)j5$d, "flair");
            final SubredditAchievementFlair a3 = j5$d.b.a;
            final b50 a4 = a3.f.b.a;
            f.f((Object)a4, "icon");
            final a a5 = new a(a4.b.toString(), a4.c);
            final String b4 = a3.b;
            final String c2 = a3.c;
            final com.reddit.type.FlairCategory d = a3.d;
            int n;
            if (d == null) {
                n = -1;
            }
            else {
                n = i.a[((Enum)d).ordinal()];
            }
            FlairCategory flairCategory;
            if (n != 1) {
                if (n != 2) {
                    flairCategory = FlairCategory.ACHIEVEMENT;
                }
                else {
                    flairCategory = FlairCategory.ACHIEVEMENT;
                }
            }
            else {
                flairCategory = FlairCategory.SUPPORTER;
            }
            list.add(new o(a5, b4, c2, flairCategory, a3.e));
        }
        return list;
    }
    
    public final Serializable b(List a, List o, final c c) {
        Object o2 = null;
        Label_0054: {
            if (c instanceof RemoteGqlPowerupAchievementFlairsDataSource$getUserAchievementFlairs$1) {
                final RemoteGqlPowerupAchievementFlairsDataSource$getUserAchievementFlairs$1 remoteGqlPowerupAchievementFlairsDataSource$getUserAchievementFlairs$1 = (RemoteGqlPowerupAchievementFlairsDataSource$getUserAchievementFlairs$1)c;
                final int label = remoteGqlPowerupAchievementFlairsDataSource$getUserAchievementFlairs$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPowerupAchievementFlairsDataSource$getUserAchievementFlairs$1.label = label + Integer.MIN_VALUE;
                    o2 = remoteGqlPowerupAchievementFlairsDataSource$getUserAchievementFlairs$1;
                    break Label_0054;
                }
            }
            o2 = new RemoteGqlPowerupAchievementFlairsDataSource$getUserAchievementFlairs$1(this, (c<? super RemoteGqlPowerupAchievementFlairsDataSource$getUserAchievementFlairs$1>)c);
        }
        final Object result = ((RemoteGqlPowerupAchievementFlairsDataSource$getUserAchievementFlairs$1)o2).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPowerupAchievementFlairsDataSource$getUserAchievementFlairs$1)o2).label;
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
            final g a2 = this.a;
            final GetUserAchievementFlairsQuery getUserAchievementFlairsQuery = new GetUserAchievementFlairsQuery(a, (List)o);
            ((RemoteGqlPowerupAchievementFlairsDataSource$getUserAchievementFlairs$1)o2).label = 1;
            if ((b = e$a.b(14, (k)getUserAchievementFlairsQuery, (e)a2, (RetryAlgo)null, (Map)null, (c)o2, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
        }
        a = ((GetUserAchievementFlairsQuery$Data)b).a;
        Serializable s;
        if (a != null) {
            final ArrayList<Object> list = new ArrayList<Object>();
            Iterator iterator = a.iterator();
            while (true) {
                s = list;
                if (!iterator.hasNext()) {
                    break;
                }
                final GetUserAchievementFlairsQuery$c getUserAchievementFlairsQuery$c = (GetUserAchievementFlairsQuery$c)iterator.next();
                Object instance = null;
                Label_0542: {
                    if (getUserAchievementFlairsQuery$c != null) {
                        final GetUserAchievementFlairsQuery$a b2 = getUserAchievementFlairsQuery$c.b;
                        if (b2 != null) {
                            final String b3 = b2.b;
                            final String c2 = b2.c;
                            if ((o = b2.d) == null) {
                                o = EmptyList.INSTANCE;
                            }
                            final ArrayList list2 = new ArrayList<r>(m.P0((Iterable)o, 10));
                            for (final GetUserAchievementFlairsQuery$e getUserAchievementFlairsQuery$e : o) {
                                final String b4 = getUserAchievementFlairsQuery$e.b;
                                o = getUserAchievementFlairsQuery$e.c;
                                final ArrayList list3 = new ArrayList<q>(m.P0((Iterable)o, 10));
                                final Iterator iterator3 = ((Iterable)o).iterator();
                                final Iterator iterator4 = iterator;
                                while (iterator3.hasNext()) {
                                    final UserAchievementFlair a3 = ((GetUserAchievementFlairsQuery$d)iterator3.next()).b.a;
                                    f.f((Object)a3, "fragment");
                                    final b50 a4 = a3.e.b.a;
                                    f.f((Object)a4, "icon");
                                    final a a5 = new a(a4.b.toString(), a4.c);
                                    final String b5 = a3.b;
                                    final String c3 = a3.c;
                                    final com.reddit.type.FlairCategory d = a3.d;
                                    int n;
                                    if (d == null) {
                                        n = -1;
                                    }
                                    else {
                                        n = i.a[((Enum)d).ordinal()];
                                    }
                                    FlairCategory flairCategory;
                                    if (n != 1) {
                                        if (n != 2) {
                                            flairCategory = FlairCategory.ACHIEVEMENT;
                                        }
                                        else {
                                            flairCategory = FlairCategory.ACHIEVEMENT;
                                        }
                                    }
                                    else {
                                        flairCategory = FlairCategory.SUPPORTER;
                                    }
                                    list3.add(new q(a5, b5, c3, flairCategory, a3.f));
                                }
                                list2.add(new r(b3, c2, (List)list3, b4, getUserAchievementFlairsQuery$e.d));
                                iterator = iterator4;
                            }
                            instance = list2;
                            break Label_0542;
                        }
                    }
                    instance = EmptyList.INSTANCE;
                }
                qg2.o.W0((Iterable)instance, (Collection)list);
            }
        }
        else {
            s = null;
        }
        Object instance2;
        if ((instance2 = s) == null) {
            instance2 = EmptyList.INSTANCE;
        }
        return (Serializable)instance2;
    }
    
    public final Object c(final String s, List instance, final c c, final boolean b) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1) {
                final RemoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1 remoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1 = (RemoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1)c;
                final int label = remoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1(this, (c<? super RemoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1>)c);
        }
        final Object result = ((RemoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1)o).label;
        final boolean b2 = false;
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
            final k6 k6 = new k6(s, b, (List)instance);
            ((RemoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$1)o).label = 1;
            if ((b3 = e$a.b(14, (k)k6, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final k6$d a2 = ((k6$b)b3).a;
        int n = b2 ? 1 : 0;
        if (a2 != null) {
            n = (b2 ? 1 : 0);
            if (a2.b) {
                n = 1;
            }
        }
        if (n == 0) {
            List c2;
            if (a2 != null) {
                c2 = a2.c;
            }
            else {
                c2 = null;
            }
            instance = c2;
            if (c2 == null) {
                instance = EmptyList.INSTANCE;
            }
            throw new IllegalStateException(ak0.m.l("Failed to update Achievement Flair preference: ", CollectionsKt___CollectionsKt.y1((Iterable)instance, (CharSequence)null, (String)null, (String)null, (l)RemoteGqlPowerupAchievementFlairsDataSource$updateAchievementFlairPreference$2$errorMessages$1.INSTANCE, 31)).toString());
        }
        return j.a;
    }
}
