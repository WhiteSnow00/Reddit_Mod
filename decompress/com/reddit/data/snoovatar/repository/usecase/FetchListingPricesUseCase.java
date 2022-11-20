// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository.usecase;

import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import dg2.m;
import kotlin.collections.EmptyList;
import com.reddit.domain.model.ResultOrException;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.util.Map;
import javax.inject.Inject;
import ng2.e;
import sz.c;

public final class FetchListingPricesUseCase
{
    public final c a;
    
    @Inject
    public FetchListingPricesUseCase(final c a) {
        e.f((Object)a, "billingManager");
        this.a = a;
    }
    
    public final Object a(a l$0, final gg2.c<? super Map<String, ? extends vz.e>> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof FetchListingPricesUseCase$invoke$1) {
                final FetchListingPricesUseCase$invoke$1 fetchListingPricesUseCase$invoke$1 = (FetchListingPricesUseCase$invoke$1)c;
                final int label = fetchListingPricesUseCase$invoke$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchListingPricesUseCase$invoke$1.label = label + Integer.MIN_VALUE;
                    o = fetchListingPricesUseCase$invoke$1;
                    break Label_0051;
                }
            }
            o = new FetchListingPricesUseCase$invoke$1(this, (gg2.c)c);
        }
        final Object result = ((FetchListingPricesUseCase$invoke$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FetchListingPricesUseCase$invoke$1)o).label;
        Object d;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (a)((FetchListingPricesUseCase$invoke$1)o).L$0;
            cg.d.b4(result);
            d = result;
        }
        else {
            cg.d.b4(result);
            final Set m5 = CollectionsKt___CollectionsKt.M5((Iterable)CollectionsKt___CollectionsKt.Q4((Iterable)l$0.a.values()));
            final c a = this.a;
            final List i5 = CollectionsKt___CollectionsKt.I5((Iterable)m5);
            ((FetchListingPricesUseCase$invoke$1)o).L$0 = l$0;
            ((FetchListingPricesUseCase$invoke$1)o).label = 1;
            if ((d = a.d(i5, (gg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        Object instance;
        if ((instance = ((ResultOrException<List, E>)d).getResult()) == null) {
            instance = EmptyList.INSTANCE;
        }
        int p2;
        if ((p2 = cg.d.p3(m.u4((Iterable)instance, 10))) < 16) {
            p2 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap<String, vz.e>(p2);
        for (final Object next : instance) {
            linkedHashMap.put(((vz.e)next).b(), (vz.e)next);
        }
        final Map<String, String> a2 = l$0.a;
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final Map.Entry<K, String> entry : a2.entrySet()) {
            final String s = (String)entry.getKey();
            final vz.e e = linkedHashMap.get(entry.getValue());
            Object o2;
            if (e != null) {
                o2 = new Pair((Object)s, (Object)e);
            }
            else {
                o2 = null;
            }
            if (o2 != null) {
                list.add(o2);
            }
        }
        return kotlin.collections.c.E4((List)list);
    }
    
    public static final class a
    {
        public final Map<String, String> a;
        
        public a(final Map<String, String> a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && e.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return aq2.a.p(a.t("Params(listingIdToExternalId="), (Map)this.a, ')');
        }
    }
}
