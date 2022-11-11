// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.repository;

import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import nu2.w;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Map;
import kotlinx.coroutines.CoroutineDispatcher;
import java.util.Set;
import com.reddit.vault.data.local.LocalCommunitiesDataSource$allCommunities$$inlined$map$2;
import ig2.o;
import java.math.BigInteger;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.Pair;
import x82.h;
import java.util.LinkedHashMap;
import ig2.m;
import java.io.Serializable;
import javax.inject.Inject;
import java.util.Iterator;
import java.util.Collection;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import hg2.j;
import rg2.p;
import kotlin.collections.EmptyList;
import rg2.q;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import fb2.r;
import ej2.e0;
import x82.i0;
import x82.k0;
import x82.l0;
import kotlinx.coroutines.flow.StateFlowImpl;
import x82.h0;
import java.util.List;
import hj2.e;
import ej2.b0;
import com.reddit.vault.l;
import y82.d;
import y82.a;
import com.reddit.vault.data.local.LocalVaultDataSource;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import y82.c;
import zg2.k;
import y82.f;

public final class PointsRepositoryImpl implements f
{
    public static final /* synthetic */ k<Object>[] w;
    public static final long x;
    public final c a;
    public final RemoteVaultDataSource b;
    public final LocalVaultDataSource c;
    public final a d;
    public final d e;
    public final l f;
    public final a20.a g;
    public final b0 h;
    public final e<List<h0>> i;
    public final e<List<h0>> j;
    public final StateFlowImpl k;
    public final StateFlowImpl l;
    public final e<List<l0>> m;
    public final e<List<k0>> n;
    public final e<List<i0>> o;
    public final Object p;
    public e0<Boolean> q;
    public long r;
    public final boolean s;
    public final Object t;
    public e0<Boolean> u;
    public final r v;
    
    static {
        w = new k[] { (k)a81.e.u((Class)PointsRepositoryImpl.class, "isPollingTransactions", "isPollingTransactions()Z", 0) };
        x = TimeUnit.MILLISECONDS.convert(10L, TimeUnit.MINUTES);
    }
    
    @Inject
    public PointsRepositoryImpl(final c a, final RemoteVaultDataSource b, final LocalVaultDataSource c, final a d, final d e, final l f, final a20.a g, final b0 h) {
        sg2.e.f((Object)a, "communitiesRepository");
        sg2.e.f((Object)b, "remoteVaultDataSource");
        sg2.e.f((Object)c, "localVaultDataSource");
        sg2.e.f((Object)d, "accountRepository");
        sg2.e.f((Object)e, "credentialRepository");
        sg2.e.f((Object)f, "textManager");
        sg2.e.f((Object)g, "dispatcherProvider");
        sg2.e.f((Object)h, "userSessionScope");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        final ArrayList list = new ArrayList();
        this.i = kotlinx.coroutines.flow.a.r((e)new PointsRepositoryImpl$special$$inlined$map.PointsRepositoryImpl$special$$inlined$map$2(new PointsRepositoryImpl$special$$inlined$map.PointsRepositoryImpl$special$$inlined$map$1(new kotlinx.coroutines.flow.e((e)e.getAddress(), (e)c.j, (q)new PointsRepositoryImpl$claimablePoints.PointsRepositoryImpl$claimablePoints$1((lg2.c)null)), this), this));
        this.j = kotlinx.coroutines.flow.a.r((e)new PointsRepositoryImpl$special$$inlined$map.PointsRepositoryImpl$special$$inlined$map$4(new PointsRepositoryImpl$special$$inlined$map.PointsRepositoryImpl$special$$inlined$map$3(new kotlinx.coroutines.flow.e((e)e.getAddress(), (e)c.j, (q)new PointsRepositoryImpl$claimingPoints.PointsRepositoryImpl$claimingPoints$1((lg2.c)null)), this), this));
        final StateFlowImpl n = bg.d.n((Object)EmptyList.INSTANCE);
        this.k = n;
        this.l = n;
        final e r = kotlinx.coroutines.flow.a.r((e)new PointsRepositoryImpl$special$$inlined$map.PointsRepositoryImpl$special$$inlined$map$5(new kotlinx.coroutines.flow.e((e)e.getAddress(), (e)c.h, (q)new PointsRepositoryImpl$latestTransactions.PointsRepositoryImpl$latestTransactions$1((lg2.c)null)), this));
        this.m = r;
        this.n = kotlinx.coroutines.flow.a.r(new kotlinx.coroutines.flow.e((e)new PointsRepositoryImpl$special$$inlined$map.PointsRepositoryImpl$special$$inlined$map$6(new kotlinx.coroutines.flow.e((e)e.getAddress(), (e)c.f, (q)new PointsRepositoryImpl$points.PointsRepositoryImpl$points$1((lg2.c)null)), this), r, (q)new PointsRepositoryImpl$points.PointsRepositoryImpl$points$3(this, (lg2.c)null)));
        this.o = kotlinx.coroutines.flow.a.r(new kotlinx.coroutines.flow.e((e)new PointsRepositoryImpl$special$$inlined$map.PointsRepositoryImpl$special$$inlined$map$7(new kotlinx.coroutines.flow.e((e)e.getAddress(), (e)c.g, (q)new PointsRepositoryImpl$ethPoints.PointsRepositoryImpl$ethPoints$1((lg2.c)null)), this), r, (q)new PointsRepositoryImpl$ethPoints.PointsRepositoryImpl$ethPoints$3(this, (lg2.c)null)));
        this.p = new Object();
        this.s = (this.r > 0L);
        this.t = new Object();
        this.v = new r(Boolean.FALSE);
        list.add(ej2.g.i(h, (CoroutineContext)g.c(), (CoroutineStart)null, (p)new p<b0, lg2.c<? super j>, Object>() {
            public int label;
            public final /* synthetic */ PointsRepositoryImpl this$0;
            
            public final lg2.c<j> create(final Object o, final lg2.c<?> c) {
                return (lg2.c<j>)new p<b0, lg2.c<? super j>, Object>() {
                    public int label;
                    public final /* synthetic */ PointsRepositoryImpl this$0 = this.this$0;
                };
            }
            
            @Override
            public final Object invoke(final b0 b0, final lg2.c<? super j> c) {
                return ((PointsRepositoryImpl$1)this.create(b0, c)).invokeSuspend(hg2.j.a);
            }
            
            public final Object invokeSuspend(final Object o) {
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label = this.label;
                if (label != 0) {
                    if (label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yd.b.k0(o);
                }
                else {
                    yd.b.k0(o);
                    final PointsRepositoryImpl this$0 = this.this$0;
                    final e<List<h0>> j = this$0.j;
                    final hj2.f<List<? extends h0>> f = new hj2.f<List<? extends h0>>() {
                        @Override
                        public final Object emit(final Object o, final lg2.c c) {
                            if (((List)o).isEmpty() ^ true) {
                                PointsRepositoryImpl.o(this$0);
                            }
                            return hg2.j.a;
                        }
                    };
                    this.label = 1;
                    if (j.a(f, (lg2.c<? super j>)this) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                return hg2.j.a;
            }
        }, 2));
        list.add(ej2.g.i(h, (CoroutineContext)g.c(), (CoroutineStart)null, (p)new p<b0, lg2.c<? super j>, Object>() {
            public int label;
            public final /* synthetic */ PointsRepositoryImpl this$0;
            
            public final lg2.c<j> create(final Object o, final lg2.c<?> c) {
                return (lg2.c<j>)new p<b0, lg2.c<? super j>, Object>() {
                    public int label;
                    public final /* synthetic */ PointsRepositoryImpl this$0 = this.this$0;
                };
            }
            
            @Override
            public final Object invoke(final b0 b0, final lg2.c<? super j> c) {
                return ((PointsRepositoryImpl$2)this.create(b0, c)).invokeSuspend(hg2.j.a);
            }
            
            public final Object invokeSuspend(final Object o) {
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label = this.label;
                if (label != 0) {
                    if (label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yd.b.k0(o);
                }
                else {
                    yd.b.k0(o);
                    final PointsRepositoryImpl this$0 = this.this$0;
                    final e<List<l0>> m = this$0.m;
                    final hj2.f<List<? extends l0>> f = new hj2.f<List<? extends l0>>() {
                        @Override
                        public final Object emit(final Object o, final lg2.c c) {
                            final List list = (List)o;
                            final boolean b = list instanceof Collection;
                            final int n = 1;
                            int n2 = 0;
                            Label_0084: {
                                if (!b || !list.isEmpty()) {
                                    final Iterator iterator = list.iterator();
                                    while (iterator.hasNext()) {
                                        if (((l0)iterator.next()).o != null) {
                                            n2 = n;
                                            break Label_0084;
                                        }
                                    }
                                }
                                n2 = 0;
                            }
                            if (n2 != 0) {
                                PointsRepositoryImpl.o(this$0);
                            }
                            return hg2.j.a;
                        }
                    };
                    this.label = 1;
                    if (m.a(f, (lg2.c<? super j>)this) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                return hg2.j.a;
            }
        }, 2));
    }
    
    public static final Serializable m(PointsRepositoryImpl pointsRepositoryImpl, List list, List list2, final lg2.c c) {
        pointsRepositoryImpl.getClass();
        Object o = null;
        Label_0061: {
            if (c instanceof PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1) {
                final PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1 pointsRepositoryImpl$combineEthPointsWithPendingTransactions$1 = (PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)c;
                final int label = pointsRepositoryImpl$combineEthPointsWithPendingTransactions$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pointsRepositoryImpl$combineEthPointsWithPendingTransactions$1.label = label + Integer.MIN_VALUE;
                    o = pointsRepositoryImpl$combineEthPointsWithPendingTransactions$1;
                    break Label_0061;
                }
            }
            o = new PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1(pointsRepositoryImpl, c);
        }
        Object o2 = ((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).label;
        Label_0298: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        list2 = (List)((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).L$2;
                        list = (List)((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).L$1;
                        pointsRepositoryImpl = (PointsRepositoryImpl)((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).L$0;
                        b.k0(o2);
                        break Label_0298;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    list2 = (List)((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).L$2;
                    list = (List)((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).L$1;
                    pointsRepositoryImpl = (PointsRepositoryImpl)((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).L$0;
                    b.k0(o2);
                }
            }
            else {
                b.k0(o2);
                final c a = pointsRepositoryImpl.a;
                ((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).L$0 = pointsRepositoryImpl;
                ((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).L$1 = list;
                ((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).L$2 = list2;
                ((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).label = 1;
                if ((o2 = a.d((lg2.c<? super Boolean>)o)) == coroutine_SUSPENDED) {
                    final Object instance = coroutine_SUSPENDED;
                    return (Serializable)instance;
                }
            }
            if (!(boolean)o2) {
                final Object instance = EmptyList.INSTANCE;
                return (Serializable)instance;
            }
            final LocalCommunitiesDataSource$allCommunities$$inlined$map$2 c2 = pointsRepositoryImpl.a.c();
            ((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).L$0 = pointsRepositoryImpl;
            ((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).L$1 = list;
            ((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).L$2 = list2;
            ((PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1)o).label = 2;
            o2 = kotlinx.coroutines.flow.a.x((e)c2, (lg2.c)o);
            if (o2 == coroutine_SUSPENDED) {
                final Object instance = coroutine_SUSPENDED;
                return (Serializable)instance;
            }
        }
        final List list3 = (List)o2;
        int o3;
        if ((o3 = bg.d.o0(m.c3((Iterable)list3, 10))) < 16) {
            o3 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap<Object, Object>(o3);
        for (final h h : list3) {
            final Pair pair = new Pair((Object)h.f, (Object)h.o);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        final ArrayList<l0> list4 = new ArrayList<l0>();
        final Iterator iterator2 = list2.iterator();
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            final boolean b = false;
            if (!hasNext) {
                break;
            }
            final Object next = iterator2.next();
            final l0 l0 = (l0)next;
            int n = b ? 1 : 0;
            if (l0.j != null) {
                n = (b ? 1 : 0);
                if (l0.o != null) {
                    n = 1;
                }
            }
            if (n == 0) {
                continue;
            }
            list4.add((l0)next);
        }
        final ArrayList<l0> list5 = new ArrayList<l0>();
        for (final l0 next2 : list4) {
            if (linkedHashMap.containsKey(next2.j)) {
                list5.add(next2);
            }
        }
        final LinkedHashMap<String, List<l0>> linkedHashMap2 = new LinkedHashMap<String, List<l0>>();
        for (final l0 next3 : list5) {
            final String s = linkedHashMap.get(next3.j);
            List<l0> value;
            if ((value = linkedHashMap2.get(s)) == null) {
                value = new ArrayList<l0>();
                linkedHashMap2.put(s, value);
            }
            value.add(next3);
        }
        final ArrayList<i0> list6 = new ArrayList<i0>();
        final ArrayList<i0> list7 = new ArrayList<i0>();
        for (final Object next4 : list) {
            if (linkedHashMap.containsKey(((i0)next4).f)) {
                list7.add((i0)next4);
            }
        }
        for (final i0 i0 : list7) {
            Object o4;
            if ((o4 = linkedHashMap2.get(linkedHashMap.get(i0.f))) == null) {
                o4 = EmptyList.INSTANCE;
            }
            final List list8 = (List)o4;
            pointsRepositoryImpl.getClass();
            final BigInteger p4 = p(list8, (PropertyReference1Impl)PointsRepositoryImpl$pendingFeeBalance$1.INSTANCE, false);
            final BigInteger j = i0.i;
            final BigInteger bigInteger = null;
            BigInteger add;
            if (p4 == null && j == null) {
                add = null;
            }
            else {
                BigInteger zero;
                if ((zero = p4) == null) {
                    zero = BigInteger.ZERO;
                }
                BigInteger zero2;
                if ((zero2 = j) == null) {
                    zero2 = BigInteger.ZERO;
                }
                add = zero.add(zero2);
            }
            final BigInteger p5 = p(list8, (PropertyReference1Impl)PointsRepositoryImpl$pendingEthBalance$1.INSTANCE, false);
            final BigInteger h2 = i0.h;
            BigInteger add2;
            if (p5 == null && h2 == null) {
                add2 = bigInteger;
            }
            else {
                BigInteger zero3;
                if ((zero3 = p5) == null) {
                    zero3 = BigInteger.ZERO;
                }
                BigInteger zero4;
                if ((zero4 = h2) == null) {
                    zero4 = BigInteger.ZERO;
                }
                add2 = zero3.add(zero4);
            }
            final String f = i0.f;
            final x82.a g = i0.g;
            sg2.e.f((Object)f, "subredditId");
            list6.add(new i0(f, g, add2, add));
        }
        ig2.o.m3((List)list6, (rg2.l)PointsRepositoryImpl$combineEthPointsWithPendingTransactions$4.INSTANCE);
        final Object instance = list6;
        return (Serializable)instance;
    }
    
    public static final ArrayList n(final PointsRepositoryImpl pointsRepositoryImpl, final x82.a a, final List list, final boolean b) {
        pointsRepositoryImpl.getClass();
        final ArrayList list2 = new ArrayList(m.c3((Iterable)list, 10));
        for (final h0 h0 : list) {
            final List g = h0.g;
            final ArrayList<x82.e> list3 = new ArrayList<x82.e>();
            final Iterator iterator2 = g.iterator();
            while (true) {
                final boolean hasNext = iterator2.hasNext();
                boolean b2 = false;
                if (!hasNext) {
                    break;
                }
                final Object next = iterator2.next();
                final x82.e e = (x82.e)next;
                Label_0130: {
                    if (b) {
                        if (e.m == null) {
                            break Label_0130;
                        }
                    }
                    else if (e.m != null) {
                        break Label_0130;
                    }
                    b2 = true;
                }
                if (!b2) {
                    continue;
                }
                list3.add((x82.e)next);
            }
            final ArrayList<x82.e> list4 = new ArrayList<x82.e>();
            for (final x82.e next2 : list3) {
                final x82.e e2 = next2;
                boolean b3 = false;
                Label_0225: {
                    if (a != null) {
                        final x82.a i = e2.i;
                        if (i != null) {
                            if (!sg2.e.a((Object)i, (Object)a)) {
                                b3 = false;
                                break Label_0225;
                            }
                        }
                    }
                    b3 = true;
                }
                if (b3) {
                    list4.add(next2);
                }
            }
            list2.add(new h0(h0.f, (List)list4));
        }
        final ArrayList<h0> list5 = new ArrayList<h0>();
        for (final Object next3 : list2) {
            if (((h0)next3).g.isEmpty() ^ true) {
                list5.add((h0)next3);
            }
        }
        final ArrayList<h0> list6 = new ArrayList<h0>();
        for (final h0 next4 : list5) {
            final h0 h2 = next4;
            final Set a2 = fb2.d.a;
            if (fb2.d.a(h2.f.f) ^ true) {
                list6.add(next4);
            }
        }
        return list6;
    }
    
    public static final void o(final PointsRepositoryImpl pointsRepositoryImpl) {
        final LocalVaultDataSource c = pointsRepositoryImpl.c;
        while (true) {
            for (final Object next : c.e) {
                if (sg2.e.a((Object)((l82.g)next).b, (Object)c.a.f)) {
                    final l82.g g = (l82.g)next;
                    Long value;
                    if (g != null) {
                        final Integer r = g.r;
                        int intValue;
                        if (r != null) {
                            intValue = r;
                        }
                        else {
                            intValue = 30;
                        }
                        value = TimeUnit.MILLISECONDS.convert(intValue, TimeUnit.SECONDS);
                    }
                    else {
                        value = null;
                    }
                    if (value != null) {
                        final long longValue = value.longValue();
                        final r v = pointsRepositoryImpl.v;
                        final k<Object>[] w = PointsRepositoryImpl.w;
                        if (!(boolean)v.getValue((Object)pointsRepositoryImpl, (k)w[0])) {
                            pointsRepositoryImpl.v.setValue((Object)pointsRepositoryImpl, (k)w[0], (Object)Boolean.TRUE);
                            ej2.g.c(pointsRepositoryImpl.h, (CoroutineDispatcher)pointsRepositoryImpl.g.c(), (CoroutineStart)null, (p)new PointsRepositoryImpl$pollTransactions$1(longValue, pointsRepositoryImpl, null), 2);
                        }
                    }
                    return;
                }
            }
            Object next = null;
            continue;
        }
    }
    
    public static BigInteger p(final List list, final PropertyReference1Impl propertyReference1Impl, final boolean b) {
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final Object invoke = ((rg2.l<Object, Object>)propertyReference1Impl).invoke(iterator.next());
            if (invoke != null) {
                list2.add(invoke);
            }
        }
        BigInteger r;
        if (list2.isEmpty()) {
            r = null;
        }
        else {
            r = r(list2, b);
        }
        return r;
    }
    
    public static BigInteger q(final List list, final boolean b) {
        final ArrayList list2 = new ArrayList(m.c3((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((l0)iterator.next()).f);
        }
        return r(list2, b);
    }
    
    public static BigInteger r(final ArrayList list, final boolean b) {
        final BigInteger zero = BigInteger.ZERO;
        final Iterator iterator = list.iterator();
        BigInteger add = zero;
        while (iterator.hasNext()) {
            final BigInteger bigInteger = (BigInteger)iterator.next();
            if (b && bigInteger.compareTo(BigInteger.ZERO) < 0) {
                continue;
            }
            sg2.e.e((Object)add, "points");
            add = add.add(bigInteger);
            sg2.e.e((Object)add, "this.add(other)");
        }
        sg2.e.e((Object)add, "amounts\n      .fold(BigI\u2026 amount\n        }\n      }");
        return add;
    }
    
    @Override
    public final Object a(final lg2.c<? super j> c) {
        this.r = 0L;
        final Object a = this.c.a((lg2.c)c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return hg2.j.a;
    }
    
    @Override
    public final e<List<k0>> b() {
        return this.n;
    }
    
    @Override
    public final Object c(String l$1, Collection<String> l$2, boolean b, final lg2.c<? super j> c) {
        PointsRepositoryImpl$loadUserPoints$1 pointsRepositoryImpl$loadUserPoints$1 = null;
        Label_0057: {
            if (c instanceof PointsRepositoryImpl$loadUserPoints$1) {
                pointsRepositoryImpl$loadUserPoints$1 = (PointsRepositoryImpl$loadUserPoints$1)c;
                final int label = pointsRepositoryImpl$loadUserPoints$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pointsRepositoryImpl$loadUserPoints$1.label = label + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            pointsRepositoryImpl$loadUserPoints$1 = new PointsRepositoryImpl$loadUserPoints$1(this, (lg2.c)c);
        }
        final Object result = pointsRepositoryImpl$loadUserPoints$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = pointsRepositoryImpl$loadUserPoints$1.label;
        boolean b2 = false;
        Object b3 = null;
        Label_0841: {
            String l$3 = null;
            Object userPoints = null;
            Object l$4 = null;
            Label_0808: {
                Object o2 = null;
                Label_0687: {
                    String s = null;
                    PointsRepositoryImpl pointsRepositoryImpl2 = null;
                    Object o = null;
                    Collection<String> collection2 = null;
                    Label_0609: {
                        Object x = null;
                        String s3 = null;
                        Label_0440: {
                            if (label2 != 0) {
                                if (label2 != 1) {
                                    if (label2 != 2) {
                                        Label_0180: {
                                            if (label2 != 3) {
                                                if (label2 == 4) {
                                                    l$3 = (String)pointsRepositoryImpl$loadUserPoints$1.L$1;
                                                    final PointsRepositoryImpl pointsRepositoryImpl = (PointsRepositoryImpl)pointsRepositoryImpl$loadUserPoints$1.L$0;
                                                    l$1 = l$3;
                                                    l$2 = pointsRepositoryImpl;
                                                    Label_0833: {
                                                        try {
                                                            b.k0(result);
                                                            userPoints = result;
                                                            l$4 = pointsRepositoryImpl;
                                                            break Label_0808;
                                                        }
                                                        catch (final Exception ex) {
                                                            break Label_0833;
                                                        }
                                                        break Label_0180;
                                                    }
                                                    final Exception ex;
                                                    ex.printStackTrace();
                                                    b3 = null;
                                                    break Label_0841;
                                                }
                                                if (label2 == 5) {
                                                    b.k0(result);
                                                    return hg2.j.a;
                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        }
                                        final Collection collection = (Collection)pointsRepositoryImpl$loadUserPoints$1.L$2;
                                        s = (String)pointsRepositoryImpl$loadUserPoints$1.L$1;
                                        pointsRepositoryImpl2 = (PointsRepositoryImpl)pointsRepositoryImpl$loadUserPoints$1.L$0;
                                        b.k0(result);
                                        o = result;
                                        collection2 = collection;
                                        break Label_0609;
                                    }
                                    b = pointsRepositoryImpl$loadUserPoints$1.Z$0;
                                    l$2 = pointsRepositoryImpl$loadUserPoints$1.L$2;
                                    final String s2 = (String)pointsRepositoryImpl$loadUserPoints$1.L$1;
                                    pointsRepositoryImpl2 = (PointsRepositoryImpl)pointsRepositoryImpl$loadUserPoints$1.L$0;
                                    b.k0(result);
                                    x = result;
                                    s3 = s2;
                                    break Label_0440;
                                }
                                else {
                                    b = pointsRepositoryImpl$loadUserPoints$1.Z$0;
                                    l$2 = pointsRepositoryImpl$loadUserPoints$1.L$2;
                                    final String s4 = (String)pointsRepositoryImpl$loadUserPoints$1.L$1;
                                    pointsRepositoryImpl2 = (PointsRepositoryImpl)pointsRepositoryImpl$loadUserPoints$1.L$0;
                                    b.k0(result);
                                    s3 = s4;
                                }
                            }
                            else {
                                b.k0(result);
                                pointsRepositoryImpl$loadUserPoints$1.L$0 = this;
                                pointsRepositoryImpl$loadUserPoints$1.L$1 = l$1;
                                pointsRepositoryImpl$loadUserPoints$1.L$2 = l$2;
                                pointsRepositoryImpl$loadUserPoints$1.Z$0 = b;
                                pointsRepositoryImpl$loadUserPoints$1.label = 1;
                                if (this.i(false, (lg2.c<? super Boolean>)pointsRepositoryImpl$loadUserPoints$1) == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                                s3 = l$1;
                                pointsRepositoryImpl2 = this;
                            }
                            final LocalCommunitiesDataSource$allCommunities$$inlined$map$2 c2 = pointsRepositoryImpl2.a.c();
                            pointsRepositoryImpl$loadUserPoints$1.L$0 = pointsRepositoryImpl2;
                            pointsRepositoryImpl$loadUserPoints$1.L$1 = s3;
                            pointsRepositoryImpl$loadUserPoints$1.L$2 = l$2;
                            pointsRepositoryImpl$loadUserPoints$1.Z$0 = b;
                            pointsRepositoryImpl$loadUserPoints$1.label = 2;
                            if ((x = kotlinx.coroutines.flow.a.x((e)c2, (lg2.c)pointsRepositoryImpl$loadUserPoints$1)) == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                        }
                        final Iterable iterable = (Iterable)x;
                        Label_0517: {
                            if (!(iterable instanceof Collection) || !((Collection)iterable).isEmpty()) {
                                final Iterator iterator = iterable.iterator();
                                while (iterator.hasNext()) {
                                    if (sg2.e.a((Object)((h)iterator.next()).f, (Object)s3)) {
                                        break Label_0517;
                                    }
                                }
                            }
                            b2 = true;
                        }
                        if (b2) {
                            return hg2.j.a;
                        }
                        if (b) {
                            l$3 = s3;
                            l$4 = pointsRepositoryImpl2;
                            o2 = l$2;
                            break Label_0687;
                        }
                        final ChannelFlowTransformLatest h = pointsRepositoryImpl2.h(s3);
                        pointsRepositoryImpl$loadUserPoints$1.L$0 = pointsRepositoryImpl2;
                        pointsRepositoryImpl$loadUserPoints$1.L$1 = s3;
                        pointsRepositoryImpl$loadUserPoints$1.L$2 = l$2;
                        pointsRepositoryImpl$loadUserPoints$1.label = 3;
                        final Object x2 = kotlinx.coroutines.flow.a.x((e)h, (lg2.c)pointsRepositoryImpl$loadUserPoints$1);
                        if (x2 == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        final Object o3 = l$2;
                        s = s3;
                        collection2 = (Collection<String>)o3;
                        o = x2;
                    }
                    final Map map = (Map)o;
                    o2 = new ArrayList<String>();
                    for (final String next : collection2) {
                        if (map.containsKey(next) ^ true) {
                            ((ArrayList<String>)o2).add(next);
                        }
                    }
                    l$4 = pointsRepositoryImpl2;
                    l$3 = s;
                }
                if (((Collection)o2).isEmpty()) {
                    return hg2.j.a;
                }
                final String i3 = CollectionsKt___CollectionsKt.I3((Iterable)o2, (CharSequence)",", (String)null, (String)null, (rg2.l)null, 62);
                final RemoteVaultDataSource b4 = ((PointsRepositoryImpl)l$4).b;
                l$1 = l$3;
                pointsRepositoryImpl$loadUserPoints$1.L$0 = l$4;
                l$1 = l$3;
                pointsRepositoryImpl$loadUserPoints$1.L$1 = l$3;
                l$1 = l$3;
                pointsRepositoryImpl$loadUserPoints$1.L$2 = null;
                l$1 = l$3;
                pointsRepositoryImpl$loadUserPoints$1.label = 4;
                l$1 = l$3;
                if ((userPoints = b4.getUserPoints(l$3, i3, (lg2.c)pointsRepositoryImpl$loadUserPoints$1)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            l$1 = l$3;
            b3 = ((w)userPoints).b;
            l$1 = l$3;
            l$2 = l$4;
        }
        final Map map2 = (Map)b3;
        if (map2 != null) {
            final LocalVaultDataSource c3 = ((PointsRepositoryImpl)l$2).c;
            pointsRepositoryImpl$loadUserPoints$1.L$0 = null;
            pointsRepositoryImpl$loadUserPoints$1.L$1 = null;
            pointsRepositoryImpl$loadUserPoints$1.L$2 = null;
            pointsRepositoryImpl$loadUserPoints$1.label = 5;
            if (c3.d(l$1, map2, (lg2.c)pointsRepositoryImpl$loadUserPoints$1) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return hg2.j.a;
    }
    
    @Override
    public final StateFlowImpl d() {
        return this.l;
    }
    
    @Override
    public final Object e(final lg2.c c) {
        if (this.d.b().i) {
            return Boolean.TRUE;
        }
        return ej2.g.l((CoroutineContext)this.g.c(), (p)new PointsRepositoryImpl$fetchTransactions$2(this, null), c);
    }
    
    @Override
    public final e<List<l0>> f() {
        return this.m;
    }
    
    @Override
    public final e<List<i0>> g() {
        return this.o;
    }
    
    @Override
    public final ChannelFlowTransformLatest h(final String s) {
        sg2.e.f((Object)s, "subredditId");
        return kotlinx.coroutines.flow.a.O(kotlinx.coroutines.flow.a.r(new PointsRepositoryImpl$userPoints$$inlined$map$1((e)this.a.c(), s)), new PointsRepositoryImpl$userPoints$$inlined$flatMapLatest$1(null, (rg2.a)new PointsRepositoryImpl$userPoints$fetchPoints$1(this, s)));
    }
    
    @Override
    public final Object i(final boolean b, final lg2.c<? super Boolean> c) {
        if (!this.d.b().i) {
            if (b || this.r <= System.currentTimeMillis() - PointsRepositoryImpl.x) {
                return ej2.g.l((CoroutineContext)this.g.c(), (p)new PointsRepositoryImpl$fetchPointsInfo$2(this, null), (lg2.c)c);
            }
        }
        return Boolean.TRUE;
    }
    
    @Override
    public final e<List<h0>> j() {
        return this.i;
    }
    
    @Override
    public final Object k(final lg2.c<? super j> c) {
        PointsRepositoryImpl$ensureCopyLoaded$1 pointsRepositoryImpl$ensureCopyLoaded$2 = null;
        Label_0049: {
            if (c instanceof PointsRepositoryImpl$ensureCopyLoaded$1) {
                final PointsRepositoryImpl$ensureCopyLoaded$1 pointsRepositoryImpl$ensureCopyLoaded$1 = (PointsRepositoryImpl$ensureCopyLoaded$1)c;
                final int label = pointsRepositoryImpl$ensureCopyLoaded$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pointsRepositoryImpl$ensureCopyLoaded$1.label = label + Integer.MIN_VALUE;
                    pointsRepositoryImpl$ensureCopyLoaded$2 = pointsRepositoryImpl$ensureCopyLoaded$1;
                    break Label_0049;
                }
            }
            pointsRepositoryImpl$ensureCopyLoaded$2 = new PointsRepositoryImpl$ensureCopyLoaded$1(this, (lg2.c)c);
        }
        Object o = pointsRepositoryImpl$ensureCopyLoaded$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = pointsRepositoryImpl$ensureCopyLoaded$2.label;
        PointsRepositoryImpl pointsRepositoryImpl;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    yd.b.k0(o);
                    return o;
                }
                if (label2 == 3) {
                    yd.b.k0(o);
                    return hg2.j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                pointsRepositoryImpl = (PointsRepositoryImpl)pointsRepositoryImpl$ensureCopyLoaded$2.L$0;
                yd.b.k0(o);
            }
        }
        else {
            yd.b.k0(o);
            final StateFlowImpl ready = this.f.isReady();
            pointsRepositoryImpl$ensureCopyLoaded$2.L$0 = this;
            pointsRepositoryImpl$ensureCopyLoaded$2.label = 1;
            o = kotlinx.coroutines.flow.a.x((e)ready, (lg2.c)pointsRepositoryImpl$ensureCopyLoaded$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            pointsRepositoryImpl = this;
        }
        if (o) {
            return hg2.j.a;
        }
        if (pointsRepositoryImpl.d.b().i) {
            final mj2.a c2 = pointsRepositoryImpl.g.c();
            final PointsRepositoryImpl$ensureCopyLoaded.PointsRepositoryImpl$ensureCopyLoaded$2 pointsRepositoryImpl$ensureCopyLoaded$3 = new PointsRepositoryImpl$ensureCopyLoaded.PointsRepositoryImpl$ensureCopyLoaded$2(pointsRepositoryImpl, (lg2.c)null);
            pointsRepositoryImpl$ensureCopyLoaded$2.L$0 = null;
            pointsRepositoryImpl$ensureCopyLoaded$2.label = 2;
            if ((o = ej2.g.l((CoroutineContext)c2, (p)pointsRepositoryImpl$ensureCopyLoaded$3, (lg2.c)pointsRepositoryImpl$ensureCopyLoaded$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        else {
            pointsRepositoryImpl$ensureCopyLoaded$2.L$0 = null;
            pointsRepositoryImpl$ensureCopyLoaded$2.label = 3;
            if (pointsRepositoryImpl.i(false, (lg2.c<? super Boolean>)pointsRepositoryImpl$ensureCopyLoaded$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            return hg2.j.a;
        }
        return o;
    }
    
    @Override
    public final boolean l() {
        return this.s;
    }
}
