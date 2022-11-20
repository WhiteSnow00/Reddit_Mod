// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.coins.usecase;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import mg.d0;
import com.reddit.domain.model.MyAccount;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import java.util.Iterator;
import r82.h;
import java.math.BigInteger;
import r82.k0;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlin.collections.EmptyList;
import java.io.Serializable;
import com.reddit.domain.model.ResultOrException;
import java.util.List;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.util.ArrayList;
import javax.inject.Inject;
import ng2.e;
import wa0.j;
import com.reddit.session.n;
import n12.m;
import m82.c;
import jr0.a;
import ir0.b;

public final class FetchCoinsDataUseCase
{
    public final ir0.b a;
    public final jr0.a b;
    public final c c;
    public final m d;
    public final sa0.b e;
    public final n f;
    public final sz.c g;
    public final d20.a h;
    public final j i;
    
    @Inject
    public FetchCoinsDataUseCase(final ir0.b a, final jr0.a b, final c c, final m d, final sa0.b e, final n f, final sz.c g, final d20.a h, final j i) {
        ng2.e.f((Object)a, "goldRepository");
        ng2.e.f((Object)b, "features");
        ng2.e.f((Object)c, "vaultRepository");
        ng2.e.f((Object)d, "systemTimeProvider");
        ng2.e.f((Object)e, "coinsSettings");
        ng2.e.f((Object)f, "sessionManager");
        ng2.e.f((Object)g, "billingManager");
        ng2.e.f((Object)h, "dispatcherProvider");
        ng2.e.f((Object)i, "internalFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static final Object a(final FetchCoinsDataUseCase fetchCoinsDataUseCase, final ArrayList list, final gg2.c c) {
        fetchCoinsDataUseCase.getClass();
        Object o = null;
        Label_0056: {
            if (c instanceof FetchCoinsDataUseCase$fetchCoinPackagesSkuDetails$1) {
                final FetchCoinsDataUseCase$fetchCoinPackagesSkuDetails$1 fetchCoinsDataUseCase$fetchCoinPackagesSkuDetails$1 = (FetchCoinsDataUseCase$fetchCoinPackagesSkuDetails$1)c;
                final int label = fetchCoinsDataUseCase$fetchCoinPackagesSkuDetails$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchCoinsDataUseCase$fetchCoinPackagesSkuDetails$1.label = label + Integer.MIN_VALUE;
                    o = fetchCoinsDataUseCase$fetchCoinPackagesSkuDetails$1;
                    break Label_0056;
                }
            }
            o = new FetchCoinsDataUseCase$fetchCoinPackagesSkuDetails$1(fetchCoinsDataUseCase, c);
        }
        final Object result = ((FetchCoinsDataUseCase$fetchCoinPackagesSkuDetails$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FetchCoinsDataUseCase$fetchCoinPackagesSkuDetails$1)o).label;
        Object d;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            d = result;
        }
        else {
            cg.d.b4(result);
            fetchCoinsDataUseCase.i.h();
            final sz.c g = fetchCoinsDataUseCase.g;
            ((FetchCoinsDataUseCase$fetchCoinPackagesSkuDetails$1)o).label = 1;
            if ((d = g.d((List)list, (gg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return ((ResultOrException<List<?>, E>)d).tryUnwrap();
    }
    
    public static final Object b(FetchCoinsDataUseCase l$0, final gg2.c c) {
        l$0.getClass();
        Object o = null;
        Label_0056: {
            if (c instanceof FetchCoinsDataUseCase$fetchFreeAwardAvailable$1) {
                final FetchCoinsDataUseCase$fetchFreeAwardAvailable$1 fetchCoinsDataUseCase$fetchFreeAwardAvailable$1 = (FetchCoinsDataUseCase$fetchFreeAwardAvailable$1)c;
                final int label = fetchCoinsDataUseCase$fetchFreeAwardAvailable$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchCoinsDataUseCase$fetchFreeAwardAvailable$1.label = label + Integer.MIN_VALUE;
                    o = fetchCoinsDataUseCase$fetchFreeAwardAvailable$1;
                    break Label_0056;
                }
            }
            o = new FetchCoinsDataUseCase$fetchFreeAwardAvailable$1(l$0, c);
        }
        final Object result = ((FetchCoinsDataUseCase$fetchFreeAwardAvailable$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FetchCoinsDataUseCase$fetchFreeAwardAvailable$1)o).label;
        boolean b = true;
        Object f;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (FetchCoinsDataUseCase)((FetchCoinsDataUseCase$fetchFreeAwardAvailable$1)o).L$0;
            d.b4(result);
            f = result;
        }
        else {
            d.b4(result);
            final ir0.b a = l$0.a;
            ((FetchCoinsDataUseCase$fetchFreeAwardAvailable$1)o).L$0 = l$0;
            ((FetchCoinsDataUseCase$fetchFreeAwardAvailable$1)o).label = 1;
            if ((f = a.f((gg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final kr0.d b2 = ((kr0.c)f).b;
        if (b2 != null) {
            final long a2 = l$0.d.a();
            int n2 = 0;
            Label_0255: {
                if (!b2.a) {
                    final Long n = (Long)b2.b;
                    boolean b3 = false;
                    Label_0241: {
                        if (n != null) {
                            n.longValue();
                            if (a2 >= (long)b2.b) {
                                b3 = true;
                                break Label_0241;
                            }
                        }
                        b3 = false;
                    }
                    if (!b3) {
                        n2 = 0;
                        break Label_0255;
                    }
                }
                n2 = 1;
            }
            if (n2 == 1) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static final Serializable c(FetchCoinsDataUseCase l$0, final gg2.c c) {
        l$0.getClass();
        FetchCoinsDataUseCase$fetchNonZeroPointsNames$1 fetchCoinsDataUseCase$fetchNonZeroPointsNames$2 = null;
        Label_0056: {
            if (c instanceof FetchCoinsDataUseCase$fetchNonZeroPointsNames$1) {
                final FetchCoinsDataUseCase$fetchNonZeroPointsNames$1 fetchCoinsDataUseCase$fetchNonZeroPointsNames$1 = (FetchCoinsDataUseCase$fetchNonZeroPointsNames$1)c;
                final int label = fetchCoinsDataUseCase$fetchNonZeroPointsNames$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchCoinsDataUseCase$fetchNonZeroPointsNames$1.label = label + Integer.MIN_VALUE;
                    fetchCoinsDataUseCase$fetchNonZeroPointsNames$2 = fetchCoinsDataUseCase$fetchNonZeroPointsNames$1;
                    break Label_0056;
                }
            }
            fetchCoinsDataUseCase$fetchNonZeroPointsNames$2 = new FetchCoinsDataUseCase$fetchNonZeroPointsNames$1(l$0, c);
        }
        Object o = fetchCoinsDataUseCase$fetchNonZeroPointsNames$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = fetchCoinsDataUseCase$fetchNonZeroPointsNames$2.label;
        List list = null;
        Object o2 = null;
        Label_0261: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        list = (List)fetchCoinsDataUseCase$fetchNonZeroPointsNames$2.L$0;
                        d.b4(o);
                        break Label_0261;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    l$0 = (FetchCoinsDataUseCase)fetchCoinsDataUseCase$fetchNonZeroPointsNames$2.L$0;
                    d.b4(o);
                }
            }
            else {
                d.b4(o);
                if (!l$0.b.d()) {
                    o2 = EmptyList.INSTANCE;
                    return (Serializable)o2;
                }
                final cj2.e<List<k0>> f = l$0.c.f();
                fetchCoinsDataUseCase$fetchNonZeroPointsNames$2.L$0 = l$0;
                fetchCoinsDataUseCase$fetchNonZeroPointsNames$2.label = 1;
                if ((o = FlowKt__ReduceKt.c((cj2.e<?>)f, (gg2.c<? super Object>)fetchCoinsDataUseCase$fetchNonZeroPointsNames$2)) == coroutine_SUSPENDED) {
                    o2 = coroutine_SUSPENDED;
                    return (Serializable)o2;
                }
            }
            final List l$2 = (List)o;
            if (l$2 == null) {
                o2 = EmptyList.INSTANCE;
                return (Serializable)o2;
            }
            final cj2.e<List<h>> a = l$0.c.a();
            fetchCoinsDataUseCase$fetchNonZeroPointsNames$2.L$0 = l$2;
            fetchCoinsDataUseCase$fetchNonZeroPointsNames$2.label = 2;
            o = FlowKt__ReduceKt.c((cj2.e<?>)a, (gg2.c<? super Object>)fetchCoinsDataUseCase$fetchNonZeroPointsNames$2);
            if (o == coroutine_SUSPENDED) {
                o2 = coroutine_SUSPENDED;
                return (Serializable)o2;
            }
            list = l$2;
        }
        final List list2 = (List)o;
        if (list2 == null) {
            o2 = EmptyList.INSTANCE;
        }
        else {
            final ArrayList<k0> list3 = new ArrayList<k0>();
            for (final Object next : list) {
                if (((k0)next).h.compareTo(BigInteger.ZERO) > 0) {
                    list3.add((k0)next);
                }
            }
            final ArrayList<String> list4 = new ArrayList<String>();
            final Iterator<k0> iterator2 = list3.iterator();
        Label_0364:
            while (true) {
                o2 = list4;
                if (iterator2.hasNext()) {
                    final k0 k0 = iterator2.next();
                    final Iterator iterator3 = list2.iterator();
                    while (true) {
                        Object next2;
                        do {
                            final boolean hasNext = iterator3.hasNext();
                            final String s = null;
                            if (hasNext) {
                                next2 = iterator3.next();
                            }
                            else {
                                next2 = null;
                                final h h = (h)next2;
                                String l = s;
                                if (h != null) {
                                    l = h.l;
                                }
                                if (l != null) {
                                    list4.add(l);
                                    continue Label_0364;
                                }
                                continue Label_0364;
                            }
                        } while (!e.a((Object)((h)next2).f, (Object)k0.f));
                        continue;
                    }
                }
                break;
            }
        }
        return (Serializable)o2;
    }
    
    public static final Object d(final FetchCoinsDataUseCase fetchCoinsDataUseCase, final List list, final gg2.c c) {
        fetchCoinsDataUseCase.getClass();
        Object o = null;
        Label_0056: {
            if (c instanceof FetchCoinsDataUseCase$fetchPremiumSkuDetails$1) {
                final FetchCoinsDataUseCase$fetchPremiumSkuDetails$1 fetchCoinsDataUseCase$fetchPremiumSkuDetails$1 = (FetchCoinsDataUseCase$fetchPremiumSkuDetails$1)c;
                final int label = fetchCoinsDataUseCase$fetchPremiumSkuDetails$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchCoinsDataUseCase$fetchPremiumSkuDetails$1.label = label + Integer.MIN_VALUE;
                    o = fetchCoinsDataUseCase$fetchPremiumSkuDetails$1;
                    break Label_0056;
                }
            }
            o = new FetchCoinsDataUseCase$fetchPremiumSkuDetails$1(fetchCoinsDataUseCase, c);
        }
        final Object result = ((FetchCoinsDataUseCase$fetchPremiumSkuDetails$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FetchCoinsDataUseCase$fetchPremiumSkuDetails$1)o).label;
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
            final sz.c g = fetchCoinsDataUseCase.g;
            ((FetchCoinsDataUseCase$fetchPremiumSkuDetails$1)o).label = 1;
            if ((a = g.a(list, (gg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return ((ResultOrException<Object, E>)a).tryUnwrap();
    }
    
    public static final Object e(final FetchCoinsDataUseCase fetchCoinsDataUseCase, final String s, final gg2.c c) {
        fetchCoinsDataUseCase.getClass();
        FetchCoinsDataUseCase$fetchPurchasePackages$1 fetchCoinsDataUseCase$fetchPurchasePackages$2 = null;
        Label_0056: {
            if (c instanceof FetchCoinsDataUseCase$fetchPurchasePackages$1) {
                final FetchCoinsDataUseCase$fetchPurchasePackages$1 fetchCoinsDataUseCase$fetchPurchasePackages$1 = (FetchCoinsDataUseCase$fetchPurchasePackages$1)c;
                final int label = fetchCoinsDataUseCase$fetchPurchasePackages$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchCoinsDataUseCase$fetchPurchasePackages$1.label = label + Integer.MIN_VALUE;
                    fetchCoinsDataUseCase$fetchPurchasePackages$2 = fetchCoinsDataUseCase$fetchPurchasePackages$1;
                    break Label_0056;
                }
            }
            fetchCoinsDataUseCase$fetchPurchasePackages$2 = new FetchCoinsDataUseCase$fetchPurchasePackages$1(fetchCoinsDataUseCase, c);
        }
        final Object result = fetchCoinsDataUseCase$fetchPurchasePackages$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = fetchCoinsDataUseCase$fetchPurchasePackages$2.label;
        Object j;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            j = result;
        }
        else {
            d.b4(result);
            final ij2.a c2 = fetchCoinsDataUseCase.h.c();
            final FetchCoinsDataUseCase$fetchPurchasePackages$2 fetchCoinsDataUseCase$fetchPurchasePackages$3 = new FetchCoinsDataUseCase$fetchPurchasePackages$2(fetchCoinsDataUseCase, s, (gg2.c)null);
            fetchCoinsDataUseCase$fetchPurchasePackages$2.label = 1;
            if ((j = g.j((CoroutineContext)c2, (p)fetchCoinsDataUseCase$fetchPurchasePackages$3, (gg2.c)fetchCoinsDataUseCase$fetchPurchasePackages$2)) == coroutine_SUSPENDED) {
                j = coroutine_SUSPENDED;
                return j;
            }
        }
        e.e(j, "private suspend fun fetc\u2026tionId).await()\n    }\n  }");
        return j;
    }
    
    public static final Object f(final FetchCoinsDataUseCase fetchCoinsDataUseCase, final gg2.c c) {
        fetchCoinsDataUseCase.getClass();
        Object o = null;
        Label_0056: {
            if (c instanceof FetchCoinsDataUseCase$fetchShowPointsPopup$1) {
                final FetchCoinsDataUseCase$fetchShowPointsPopup$1 fetchCoinsDataUseCase$fetchShowPointsPopup$1 = (FetchCoinsDataUseCase$fetchShowPointsPopup$1)c;
                final int label = fetchCoinsDataUseCase$fetchShowPointsPopup$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchCoinsDataUseCase$fetchShowPointsPopup$1.label = label + Integer.MIN_VALUE;
                    o = fetchCoinsDataUseCase$fetchShowPointsPopup$1;
                    break Label_0056;
                }
            }
            o = new FetchCoinsDataUseCase$fetchShowPointsPopup$1(fetchCoinsDataUseCase, c);
        }
        final Object result = ((FetchCoinsDataUseCase$fetchShowPointsPopup$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FetchCoinsDataUseCase$fetchShowPointsPopup$1)o).label;
        boolean b = true;
        Object c2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            c2 = result;
        }
        else {
            d.b4(result);
            if (!fetchCoinsDataUseCase.b.d()) {
                return Boolean.FALSE;
            }
            if (fetchCoinsDataUseCase.e.d3()) {
                return Boolean.FALSE;
            }
            final cj2.e<List<k0>> f = fetchCoinsDataUseCase.c.f();
            ((FetchCoinsDataUseCase$fetchShowPointsPopup$1)o).label = 1;
            if ((c2 = FlowKt__ReduceKt.c((cj2.e<?>)f, (gg2.c<? super Object>)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final List list = (List)c2;
        if (list != null) {
            int n = 0;
            Label_0258: {
                if (!list.isEmpty()) {
                    final Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        if (((k0)iterator.next()).h.compareTo(BigInteger.ZERO) > 0) {
                            n = 1;
                            break Label_0258;
                        }
                    }
                }
                n = 0;
            }
            if (n == 1) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static final boolean g(final FetchCoinsDataUseCase fetchCoinsDataUseCase) {
        final MyAccount c = fetchCoinsDataUseCase.f.C();
        boolean b = true;
        if (c == null || (((com.reddit.session.m)c).isPremiumSubscriber() || ((com.reddit.session.m)c).getHasSubscribedToPremium())) {
            b = false;
        }
        return b;
    }
    
    public final Object h(final a a, final gg2.c<? super ta0.a> c) {
        if (a instanceof a.FetchCoinsDataUseCase$a$a) {
            final a.FetchCoinsDataUseCase$a$a fetchCoinsDataUseCase$a$a = (a.FetchCoinsDataUseCase$a$a)a;
            if (fetchCoinsDataUseCase$a$a.b) {
                return d0.G((p)new FetchCoinsDataUseCase$fetchDataSkippingGoogle$2(this, (gg2.c)null), (gg2.c)c);
            }
            return d0.G((p)new FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2(this, fetchCoinsDataUseCase$a$a.a, (gg2.c)null), (gg2.c)c);
        }
        else {
            if (!ng2.e.a((Object)a, (Object)FetchCoinsDataUseCase.a.FetchCoinsDataUseCase$a$b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            final Object g = d0.G((p)new FetchCoinsDataUseCase$fetchData$2(this, (gg2.c)null), (gg2.c)c);
            if (g == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return g;
            }
            return g;
        }
    }
    
    public final Object i(final a a, final gg2.c<? super b> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof FetchCoinsDataUseCase$invoke$1) {
                final FetchCoinsDataUseCase$invoke$1 fetchCoinsDataUseCase$invoke$1 = (FetchCoinsDataUseCase$invoke$1)c;
                final int label = fetchCoinsDataUseCase$invoke$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchCoinsDataUseCase$invoke$1.label = label + Integer.MIN_VALUE;
                    o = fetchCoinsDataUseCase$invoke$1;
                    break Label_0051;
                }
            }
            o = new FetchCoinsDataUseCase$invoke$1(this, (gg2.c)c);
        }
        final Object result = ((FetchCoinsDataUseCase$invoke$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FetchCoinsDataUseCase$invoke$1)o).label;
        Object o2 = null;
        Label_0097: {
            if (label2 == 0) {
                break Label_0097;
            }
            Label_0087: {
                if (label2 != 1) {
                    break Label_0087;
                }
                try {
                    cg.d.b4(result);
                    Object h = result;
                    Label_0125: {
                        o2 = new b.FetchCoinsDataUseCase$b$b((ta0.a)h);
                    }
                    return o2;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    cg.d.b4(result);
                    ((FetchCoinsDataUseCase$invoke$1)o).label = 1;
                    iftrue(Label_0125:)((h = this.h(a, (gg2.c<? super ta0.a>)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                catch (final Exception ex) {
                    if (ex instanceof CancellationException) {
                        throw ex;
                    }
                    o2 = new b.FetchCoinsDataUseCase$b$a(ex);
                }
            }
        }
        return o2;
    }
    
    public abstract static class a
    {
    }
    
    public abstract static class b
    {
    }
}
