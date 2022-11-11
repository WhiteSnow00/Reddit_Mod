// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.datasource.remote;

import com.reddit.mutations.a0$b;
import com.reddit.mutations.a0;
import com.reddit.mutations.a0$d;
import k60.d$a;
import k60.d$b;
import com.reddit.mutations.a0$c;
import com.reddit.mutations.y$b;
import com.reddit.mutations.y;
import com.reddit.type.CreateAvatarInput;
import k60.c$a;
import com.reddit.mutations.y$d;
import k60.c$b;
import com.reddit.mutations.y$c;
import com.reddit.mutations.j1$b;
import k60.e$b;
import com.reddit.queries.j1$d;
import com.reddit.queries.j1$e;
import com.reddit.queries.j1;
import k60.g$b;
import java.util.LinkedHashMap;
import bg.d;
import kotlin.collections.CollectionsKt___CollectionsKt;
import cj2.j;
import com.reddit.queries.j1$a;
import kotlin.Pair;
import k60.g$a;
import com.reddit.queries.j1$c;
import k60.g;
import com.reddit.queries.w2$j;
import com.reddit.queries.w2$h;
import com.reddit.queries.w2$a;
import kotlin.collections.EmptyList;
import com.reddit.domain.snoovatar.model.explore.DistributionListing;
import com.reddit.domain.snoovatar.model.explore.DistributionListing$Status;
import com.reddit.queries.w2$i;
import com.reddit.queries.w2$g;
import com.reddit.queries.w2$f;
import kotlin.Result;
import com.reddit.queries.k$g;
import k60.b$a;
import k60.b$b;
import com.reddit.queries.k$m;
import com.reddit.queries.ld$b;
import com.reddit.queries.ld;
import k60.a$a;
import k60.a$b;
import com.reddit.queries.ld$d;
import com.reddit.mutations.w2$c;
import java.util.Iterator;
import com.reddit.mutations.w2$d;
import ig2.m;
import k60.f$b;
import ml0.a;
import com.reddit.mutations.w2$b;
import okhttp3.OkHttpClient;
import com.reddit.network.common.RetryAlgo;
import h7.k;
import mr0.e$a;
import com.reddit.mutations.w2;
import com.reddit.type.AvatarDownloadAvatarInput;
import java.io.IOException;
import k60.f$a;
import h7.h;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import k60.f;
import lg2.c;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import sg2.e;
import j60.b;

public final class RemoteGqlSnoovatarDataSource
{
    public final b a;
    
    @Inject
    public RemoteGqlSnoovatarDataSource(final b a) {
        e.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Object a(final List<String> list, final Map<String, String> map, final c<? super f> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlSnoovatarDataSource$downloadAvatar$1) {
                final RemoteGqlSnoovatarDataSource$downloadAvatar$1 remoteGqlSnoovatarDataSource$downloadAvatar$1 = (RemoteGqlSnoovatarDataSource$downloadAvatar$1)c;
                final int label = remoteGqlSnoovatarDataSource$downloadAvatar$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSnoovatarDataSource$downloadAvatar$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSnoovatarDataSource$downloadAvatar$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlSnoovatarDataSource$downloadAvatar$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSnoovatarDataSource$downloadAvatar$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSnoovatarDataSource$downloadAvatar$1)o).label;
        boolean b = true;
        Object b2 = null;
        Label_0276: {
            ArrayList<g22.b> list2 = null;
            Label_0106: {
                if (label2 == 0) {
                    break Label_0106;
                }
                Label_0096: {
                    if (label2 != 1) {
                        break Label_0096;
                    }
                    try {
                        yd.b.k0(result);
                        b2 = result;
                        break Label_0276;
                        while (true) {
                            final Iterator<Map.Entry<String, String>> iterator;
                            iftrue(Label_0204:)(!iterator.hasNext());
                            Block_15: {
                                break Block_15;
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                yd.b.k0(result);
                                list2 = new ArrayList<g22.b>(map.size());
                                iterator = map.entrySet().iterator();
                                continue;
                            }
                            final Map.Entry<String, V> entry = iterator.next();
                            list2.add(new g22.b((String)entry.getKey(), h.a.c(entry.getValue())));
                            continue;
                        }
                    }
                    catch (final IOException ex) {
                        return new f$a(lw0.b.t1((Object)ex.getMessage()));
                    }
                }
            }
            final w2 w2;
            Label_0204: {
                w2 = new w2(new g22.c(new AvatarDownloadAvatarInput((List)list, h.a.c(list2))));
            }
            final b a = this.a;
            ((RemoteGqlSnoovatarDataSource$downloadAvatar$1)o).label = 1;
            if ((b2 = e$a.b(14, (k)w2, (mr0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final w2$c a2 = ((w2$b)b2).a;
        if (a2 == null || !a2.b) {
            b = false;
        }
        final List list3 = null;
        if (b) {
            final Object c2 = a2.c;
            String s;
            if (c2 instanceof String) {
                s = (String)c2;
            }
            else {
                s = null;
            }
            if (ml0.a.Y((CharSequence)s)) {
                final Object c3 = a2.c;
                e.d(c3, "null cannot be cast to non-null type kotlin.String");
                return new f$b((String)c3);
            }
        }
        List list4 = list3;
        if (a2 != null) {
            final List d = a2.d;
            list4 = list3;
            if (d != null) {
                final ArrayList list5 = new ArrayList<String>(m.c3((Iterable)d, 10));
                final Iterator iterator2 = d.iterator();
                while (true) {
                    list4 = list5;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    list5.add((Object)((w2$d)iterator2.next()).b);
                }
            }
        }
        return new f$a(list4);
    }
    
    public final Object b(final c<? super k60.a> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteGqlSnoovatarDataSource$getAccountInfo$1) {
                final RemoteGqlSnoovatarDataSource$getAccountInfo$1 remoteGqlSnoovatarDataSource$getAccountInfo$1 = (RemoteGqlSnoovatarDataSource$getAccountInfo$1)c;
                final int label = remoteGqlSnoovatarDataSource$getAccountInfo$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSnoovatarDataSource$getAccountInfo$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSnoovatarDataSource$getAccountInfo$1;
                    break Label_0047;
                }
            }
            o = new RemoteGqlSnoovatarDataSource$getAccountInfo$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSnoovatarDataSource$getAccountInfo$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSnoovatarDataSource$getAccountInfo$1)o).label;
        Label_0090: {
            if (label2 == 0) {
                break Label_0090;
            }
            Label_0080: {
                if (label2 != 1) {
                    break Label_0080;
                }
                try {
                    yd.b.k0(result);
                    Object b = result;
                    final ld$b a;
                    Label_0137: {
                        a = ((ld$d)b).a;
                    }
                    Object a2;
                    if (a != null) {
                        a2 = new a$b(a);
                    }
                    else {
                        a2 = a$a.a;
                    }
                    return a2;
                    yd.b.k0(result);
                    final b a3 = this.a;
                    final ld ld = new ld();
                    ((RemoteGqlSnoovatarDataSource$getAccountInfo$1)o).label = 1;
                    iftrue(Label_0137:)((b = e$a.b(14, (k)ld, (mr0.e)a3, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final IOException ex) {
                    return a$a.a;
                }
            }
        }
    }
    
    public final Object c(final c<? super k60.b> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteGqlSnoovatarDataSource$getCatalog$1) {
                final RemoteGqlSnoovatarDataSource$getCatalog$1 remoteGqlSnoovatarDataSource$getCatalog$1 = (RemoteGqlSnoovatarDataSource$getCatalog$1)c;
                final int label = remoteGqlSnoovatarDataSource$getCatalog$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSnoovatarDataSource$getCatalog$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSnoovatarDataSource$getCatalog$1;
                    break Label_0047;
                }
            }
            o = new RemoteGqlSnoovatarDataSource$getCatalog$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSnoovatarDataSource$getCatalog$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSnoovatarDataSource$getCatalog$1)o).label;
        Label_0090: {
            if (label2 == 0) {
                break Label_0090;
            }
            Label_0080: {
                if (label2 != 1) {
                    break Label_0080;
                }
                try {
                    yd.b.k0(result);
                    Object b = result;
                    final k$g a;
                    Label_0138: {
                        a = ((k$m)b).a;
                    }
                    Object a2;
                    if (a != null) {
                        a2 = new b$b(a);
                    }
                    else {
                        a2 = b$a.a;
                    }
                    return a2;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    yd.b.k0(result);
                    final b a3 = this.a;
                    final com.reddit.queries.k k = new com.reddit.queries.k();
                    ((RemoteGqlSnoovatarDataSource$getCatalog$1)o).label = 1;
                    iftrue(Label_0138:)((b = e$a.b(14, (k)k, (mr0.e)a3, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                catch (final IOException ex) {
                    return b$a.a;
                }
            }
        }
    }
    
    public final Object d(final c<? super Result<? extends List<je0.a>>> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteGqlSnoovatarDataSource$getDistributionCampaigns$1) {
                final RemoteGqlSnoovatarDataSource$getDistributionCampaigns$1 remoteGqlSnoovatarDataSource$getDistributionCampaigns$1 = (RemoteGqlSnoovatarDataSource$getDistributionCampaigns$1)c;
                final int label = remoteGqlSnoovatarDataSource$getDistributionCampaigns$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSnoovatarDataSource$getDistributionCampaigns$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSnoovatarDataSource$getDistributionCampaigns$1;
                    break Label_0047;
                }
            }
            o = new RemoteGqlSnoovatarDataSource$getDistributionCampaigns$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSnoovatarDataSource$getDistributionCampaigns$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSnoovatarDataSource$getDistributionCampaigns$1)o).label;
        Object constructor-impl = null;
        Label_0090: {
            if (label2 == 0) {
                break Label_0090;
            }
            Label_0080: {
                if (label2 != 1) {
                    break Label_0080;
                }
                try {
                    yd.b.k0(result);
                    Object b = result;
                    Label_0137: {
                        Result.constructor-impl((Object)b);
                    }
                    break Label_0090;
                    yd.b.k0(result);
                    final b a = this.a;
                    final com.reddit.queries.w2 w2 = new com.reddit.queries.w2();
                    ((RemoteGqlSnoovatarDataSource$getDistributionCampaigns$1)o).label = 1;
                    iftrue(Label_0137:)((b = e$a.b(14, (k)w2, (mr0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                finally {
                    final Throwable t;
                    constructor-impl = Result.constructor-impl((Object)yd.b.o(t));
                }
            }
        }
        Object o3;
        if (Result.isSuccess-impl(constructor-impl)) {
            final w2$a a2 = ((w2$f)constructor-impl).a;
            ArrayList list = null;
            if (a2 != null) {
                final List b2 = a2.b;
                list = list;
                if (b2 != null) {
                    final ArrayList list2 = new ArrayList();
                    for (final w2$g w2$g : b2) {
                        e.f((Object)w2$g, "<this>");
                        final String b3 = w2$g.b;
                        final String c2 = w2$g.c;
                        final List d = w2$g.d;
                        List<Object> list4;
                        if (d != null) {
                            final ArrayList<Object> list3 = new ArrayList<Object>();
                            final Iterator iterator2 = d.iterator();
                            while (true) {
                                list4 = list3;
                                if (!iterator2.hasNext()) {
                                    break;
                                }
                                final w2$i w2$i = (w2$i)iterator2.next();
                                Object o2 = null;
                                Label_0494: {
                                    if (w2$i != null) {
                                        final w2$h f = w2$i.f;
                                        if (f != null) {
                                            final com.reddit.queries.w2$b b4 = f.d.b;
                                            if (b4 != null) {
                                                final w2$j c3 = b4.c;
                                                if (c3 != null) {
                                                    final com.reddit.queries.w2$c d2 = b4.d;
                                                    if (d2 != null) {
                                                        final int n = o60.m.a[((Enum)w2$i.e).ordinal()];
                                                        DistributionListing$Status distributionListing$Status;
                                                        if (n != 1) {
                                                            if (n != 2) {
                                                                if (n != 3) {
                                                                    distributionListing$Status = null;
                                                                }
                                                                else {
                                                                    distributionListing$Status = DistributionListing$Status.Expired;
                                                                }
                                                            }
                                                            else {
                                                                distributionListing$Status = DistributionListing$Status.SoldOut;
                                                            }
                                                        }
                                                        else {
                                                            distributionListing$Status = DistributionListing$Status.Available;
                                                        }
                                                        if (distributionListing$Status != null) {
                                                            o2 = new DistributionListing(w2$i.b, w2$i.f.c, c3.b.toString(), d2.b.toString(), w2$i.c, w2$i.d, distributionListing$Status, w2$i.f.b, b4.b);
                                                            break Label_0494;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    o2 = null;
                                }
                                if (o2 == null) {
                                    continue;
                                }
                                list3.add(o2);
                            }
                        }
                        else {
                            list4 = null;
                        }
                        Object instance;
                        if ((instance = list4) == null) {
                            instance = EmptyList.INSTANCE;
                        }
                        je0.a a3 = new je0.a(b3, c2, (List)instance);
                        if (!(a3.c.isEmpty() ^ true)) {
                            a3 = null;
                        }
                        if (a3 != null) {
                            list2.add(a3);
                        }
                    }
                    list = list2;
                }
            }
            Object instance2;
            if ((instance2 = list) == null) {
                instance2 = EmptyList.INSTANCE;
            }
            o3 = Result.constructor-impl(instance2);
        }
        else {
            o3 = Result.constructor-impl(constructor-impl);
        }
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(o3);
        if (exceptionOrNull-impl != null) {
            su2.a.a.e(exceptionOrNull-impl);
        }
        return o3;
    }
    
    public final Object e(final c<? super g> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteGqlSnoovatarDataSource$getMarketingEvents$1) {
                final RemoteGqlSnoovatarDataSource$getMarketingEvents$1 remoteGqlSnoovatarDataSource$getMarketingEvents$1 = (RemoteGqlSnoovatarDataSource$getMarketingEvents$1)c;
                final int label = remoteGqlSnoovatarDataSource$getMarketingEvents$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSnoovatarDataSource$getMarketingEvents$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSnoovatarDataSource$getMarketingEvents$1;
                    break Label_0047;
                }
            }
            o = new RemoteGqlSnoovatarDataSource$getMarketingEvents$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSnoovatarDataSource$getMarketingEvents$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSnoovatarDataSource$getMarketingEvents$1)o).label;
        Label_0090: {
            if (label2 == 0) {
                break Label_0090;
            }
            Label_0080: {
                if (label2 != 1) {
                    break Label_0080;
                }
                try {
                    yd.b.k0(result);
                    Object b = result;
                    final j1$c j1$c;
                    Label_0137: {
                        j1$c = (j1$c)b;
                    }
                    final j1$e b2 = j1$c.b;
                    if (b2 == null) {
                        return g$a.a;
                    }
                    final j1$d a = j1$c.a;
                    if (a != null) {
                        final List b3 = a.b;
                        if (b3 != null) {
                            final ArrayList<Pair> list = new ArrayList<Pair>();
                            for (final j1$a j1$a : b3) {
                                e.f((Object)j1$a, "<this>");
                                final List h = j1$a.h;
                                final Pair pair = null;
                                Pair pair2 = null;
                                Label_0364: {
                                    Object o2;
                                    if (h != null) {
                                        final Iterator iterator2 = h.iterator();
                                        Object m3 = null;
                                        while (true) {
                                            o2 = m3;
                                            if (!iterator2.hasNext()) {
                                                break;
                                            }
                                            final String s = (String)iterator2.next();
                                            if (e.a((Object)s, (Object)"avatar_promo_archived")) {
                                                pair2 = pair;
                                                break Label_0364;
                                            }
                                            int n = 0;
                                            if (s != null) {
                                                n = n;
                                                if (j.O0(s, "avatar_event:", false)) {
                                                    n = 1;
                                                }
                                            }
                                            if (n == 0) {
                                                continue;
                                            }
                                            m3 = CollectionsKt___CollectionsKt.M3(kotlin.text.b.n1((CharSequence)s, new String[] { ":" }));
                                        }
                                    }
                                    else {
                                        o2 = null;
                                    }
                                    final String s2 = (String)o2;
                                    pair2 = pair;
                                    if (s2 != null) {
                                        pair2 = new Pair((Object)s2, (Object)j1$a);
                                    }
                                }
                                if (pair2 != null) {
                                    list.add(pair2);
                                }
                            }
                            int o3;
                            if ((o3 = d.o0(m.c3((Iterable)list, 10))) < 16) {
                                o3 = 16;
                            }
                            final LinkedHashMap linkedHashMap = new LinkedHashMap(o3);
                            for (final Pair pair3 : list) {
                                linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
                            }
                            return new g$b(linkedHashMap, b2);
                        }
                    }
                    return g$a.a;
                    yd.b.k0(result);
                    final b a2 = this.a;
                    final j1 j1 = new j1();
                    ((RemoteGqlSnoovatarDataSource$getMarketingEvents$1)o).label = 1;
                    iftrue(Label_0137:)((b = e$a.b(14, (k)j1, (mr0.e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final IOException ex) {
                    return g$a.a;
                }
            }
        }
    }
    
    public final Object f(final c<? super k60.e> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteGqlSnoovatarDataSource$getRandomSnoovatar$1) {
                final RemoteGqlSnoovatarDataSource$getRandomSnoovatar$1 remoteGqlSnoovatarDataSource$getRandomSnoovatar$1 = (RemoteGqlSnoovatarDataSource$getRandomSnoovatar$1)c;
                final int label = remoteGqlSnoovatarDataSource$getRandomSnoovatar$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSnoovatarDataSource$getRandomSnoovatar$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSnoovatarDataSource$getRandomSnoovatar$1;
                    break Label_0047;
                }
            }
            o = new RemoteGqlSnoovatarDataSource$getRandomSnoovatar$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSnoovatarDataSource$getRandomSnoovatar$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSnoovatarDataSource$getRandomSnoovatar$1)o).label;
        boolean b = true;
        Label_0095: {
            if (label2 == 0) {
                break Label_0095;
            }
            Label_0085: {
                if (label2 != 1) {
                    break Label_0085;
                }
                try {
                    yd.b.k0(result);
                    Object b2 = result;
                    final j1$b a;
                    Label_0160: {
                        a = ((com.reddit.mutations.j1$c)b2).a;
                    }
                    if (a == null || !a.d) {
                        b = false;
                    }
                    Object o2;
                    if (b) {
                        o2 = new e$b(a.c, String.valueOf(a.b));
                    }
                    else {
                        ArrayList list2 = null;
                        Label_0281: {
                            if (a != null) {
                                final List e = a.e;
                                if (e != null) {
                                    final ArrayList list = new ArrayList<String>(m.c3((Iterable)e, 10));
                                    final Iterator iterator = e.iterator();
                                    while (true) {
                                        list2 = list;
                                        if (!iterator.hasNext()) {
                                            break Label_0281;
                                        }
                                        list.add((Object)((com.reddit.mutations.j1$d)iterator.next()).b);
                                    }
                                }
                            }
                            list2 = null;
                        }
                        o2 = new k60.e$a((ArrayList)list2);
                    }
                    return o2;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    yd.b.k0(result);
                    final b a2 = this.a;
                    final com.reddit.mutations.j1 j1 = new com.reddit.mutations.j1(new g22.d(h.a.c(Boolean.FALSE)));
                    ((RemoteGqlSnoovatarDataSource$getRandomSnoovatar$1)o).label = 1;
                    iftrue(Label_0160:)((b2 = e$a.b(14, (k)j1, (mr0.e)a2, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                catch (final IOException ex) {
                    return new k60.e$a((ArrayList)null);
                }
            }
        }
    }
    
    public final Object g(final List<String> list, final Map<String, String> map, final c<? super k60.c> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlSnoovatarDataSource$saveAvatar$1) {
                final RemoteGqlSnoovatarDataSource$saveAvatar$1 remoteGqlSnoovatarDataSource$saveAvatar$1 = (RemoteGqlSnoovatarDataSource$saveAvatar$1)c;
                final int label = remoteGqlSnoovatarDataSource$saveAvatar$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSnoovatarDataSource$saveAvatar$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSnoovatarDataSource$saveAvatar$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlSnoovatarDataSource$saveAvatar$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSnoovatarDataSource$saveAvatar$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSnoovatarDataSource$saveAvatar$1)o).label;
        boolean b = true;
        Label_0106: {
            if (label2 == 0) {
                break Label_0106;
            }
            Label_0096: {
                if (label2 != 1) {
                    break Label_0096;
                }
                try {
                    yd.b.k0(result);
                    Object b2 = result;
                    final y$b a;
                    Label_0272: {
                        a = ((y$c)b2).a;
                    }
                    if (a == null || !a.b) {
                        b = false;
                    }
                    Object a2;
                    if (b) {
                        a2 = c$b.a;
                    }
                    else {
                        ArrayList list3 = null;
                        Label_0377: {
                            if (a != null) {
                                final List c2 = a.c;
                                if (c2 != null) {
                                    final ArrayList list2 = new ArrayList<String>(m.c3((Iterable)c2, 10));
                                    final Iterator iterator = c2.iterator();
                                    while (true) {
                                        list3 = list2;
                                        if (!iterator.hasNext()) {
                                            break Label_0377;
                                        }
                                        list2.add((Object)((y$d)iterator.next()).b);
                                    }
                                }
                            }
                            list3 = null;
                        }
                        a2 = new c$a((ArrayList)list3);
                    }
                    return a2;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    yd.b.k0(result);
                    final b a3 = this.a;
                    final ArrayList<g22.b> list4 = new ArrayList<g22.b>(map.size());
                    final Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();
                    while (true) {
                        Label_0146: {
                            break Label_0146;
                            Label_0206:
                            final y y = new y(new CreateAvatarInput((List)list, h.a.c(list4), h.a.c(Boolean.FALSE)));
                            ((RemoteGqlSnoovatarDataSource$saveAvatar$1)o).label = 1;
                            iftrue(Label_0272:)((b2 = e$a.b(14, (k)y, (mr0.e)a3, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
                            final Map.Entry<String, V> entry = iterator2.next();
                            list4.add(new g22.b((String)entry.getKey(), h.a.c(entry.getValue())));
                        }
                        iftrue(Label_0206:)(!iterator2.hasNext());
                        continue;
                    }
                }
                catch (final IOException ex) {
                    return new c$a((ArrayList)null);
                }
            }
        }
    }
    
    public final Object h(final List<String> list, final Map<String, String> map, final c<? super k60.d> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlSnoovatarDataSource$shareAvatar$1) {
                final RemoteGqlSnoovatarDataSource$shareAvatar$1 remoteGqlSnoovatarDataSource$shareAvatar$1 = (RemoteGqlSnoovatarDataSource$shareAvatar$1)c;
                final int label = remoteGqlSnoovatarDataSource$shareAvatar$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlSnoovatarDataSource$shareAvatar$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlSnoovatarDataSource$shareAvatar$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlSnoovatarDataSource$shareAvatar$1(this, (c)c);
        }
        final Object result = ((RemoteGqlSnoovatarDataSource$shareAvatar$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlSnoovatarDataSource$shareAvatar$1)o).label;
        boolean b = true;
        Label_0106: {
            if (label2 == 0) {
                break Label_0106;
            }
            Label_0096: {
                if (label2 != 1) {
                    break Label_0096;
                }
                try {
                    yd.b.k0(result);
                    Object b2 = result;
                    final a0$b a;
                    Label_0272: {
                        a = ((a0$c)b2).a;
                    }
                    if (a == null || !a.c) {
                        b = false;
                    }
                    if (b) {
                        final Object b3 = a.b;
                        if (b3 != null) {
                            return new d$b(String.valueOf(b3));
                        }
                    }
                    if (a != null) {
                        final List d = a.d;
                        if (d != null) {
                            final ArrayList list2 = new ArrayList(m.c3((Iterable)d, 10));
                            final Iterator iterator = d.iterator();
                            while (true) {
                                final ArrayList list3 = list2;
                                if (!iterator.hasNext()) {
                                    return new d$a((ArrayList)list3);
                                }
                                list2.add((Object)((a0$d)iterator.next()).b);
                            }
                        }
                    }
                    final ArrayList list3 = null;
                    return new d$a((ArrayList)list3);
                    while (true) {
                        final Iterator<Map.Entry<String, String>> iterator2;
                        final Map.Entry<String, V> entry = iterator2.next();
                        final ArrayList<g22.b> list4;
                        list4.add(new g22.b((String)entry.getKey(), h.a.c(entry.getValue())));
                        Label_0145: {
                            break Label_0145;
                            Label_0206:
                            final a0 a2 = new a0(new CreateAvatarInput((List)list, h.a.c(list4), h.a.c(Boolean.TRUE)));
                            ((RemoteGqlSnoovatarDataSource$shareAvatar$1)o).label = 1;
                            final b a3;
                            iftrue(Label_0272:)((b2 = e$a.b(14, (k)a2, (mr0.e)a3, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
                            yd.b.k0(result);
                            a3 = this.a;
                            list4 = new ArrayList<g22.b>(map.size());
                            iterator2 = map.entrySet().iterator();
                            break Label_0145;
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iftrue(Label_0206:)(!iterator2.hasNext());
                        continue;
                    }
                }
                catch (final IOException ex) {
                    return new d$a((ArrayList)null);
                }
            }
        }
    }
}
