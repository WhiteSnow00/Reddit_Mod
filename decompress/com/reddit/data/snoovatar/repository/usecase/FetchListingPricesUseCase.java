// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository.usecase;

import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import bg.d;
import ig2.m;
import kotlin.collections.EmptyList;
import com.reddit.domain.model.ResultOrException;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.util.Map;
import javax.inject.Inject;
import sg2.e;
import qz.c;

public final class FetchListingPricesUseCase
{
    public final c a;
    
    @Inject
    public FetchListingPricesUseCase(final c a) {
        e.f((Object)a, "billingManager");
        this.a = a;
    }
    
    public final Object a(a l$0, final lg2.c<? super Map<String, ? extends tz.e>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof FetchListingPricesUseCase$invoke$1) {
                final FetchListingPricesUseCase$invoke$1 fetchListingPricesUseCase$invoke$1 = (FetchListingPricesUseCase$invoke$1)c;
                final int label = fetchListingPricesUseCase$invoke$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchListingPricesUseCase$invoke$1.label = label + Integer.MIN_VALUE;
                    o = fetchListingPricesUseCase$invoke$1;
                    break Label_0050;
                }
            }
            o = new FetchListingPricesUseCase$invoke$1(this, (lg2.c)c);
        }
        final Object result = ((FetchListingPricesUseCase$invoke$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FetchListingPricesUseCase$invoke$1)o).label;
        Object c2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (a)((FetchListingPricesUseCase$invoke$1)o).L$0;
            b.k0(result);
            c2 = result;
        }
        else {
            b.k0(result);
            final Set u4 = CollectionsKt___CollectionsKt.u4((Iterable)CollectionsKt___CollectionsKt.y3((Iterable)l$0.a.values()));
            final c a = this.a;
            final List q4 = CollectionsKt___CollectionsKt.q4((Iterable)u4);
            ((FetchListingPricesUseCase$invoke$1)o).L$0 = l$0;
            ((FetchListingPricesUseCase$invoke$1)o).label = 1;
            if ((c2 = a.c(q4, (lg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        Object instance;
        if ((instance = ((ResultOrException<List, E>)c2).getResult()) == null) {
            instance = EmptyList.INSTANCE;
        }
        int o2;
        if ((o2 = d.o0(m.c3((Iterable)instance, 10))) < 16) {
            o2 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap<String, tz.e>(o2);
        for (final Object next : instance) {
            linkedHashMap.put(((tz.e)next).b(), (tz.e)next);
        }
        final Map<String, String> a2 = l$0.a;
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final Map.Entry<K, String> entry : a2.entrySet()) {
            final String s = (String)entry.getKey();
            final tz.e e = linkedHashMap.get(entry.getValue());
            Object o3;
            if (e != null) {
                o3 = new Pair((Object)s, (Object)e);
            }
            else {
                o3 = null;
            }
            if (o3 != null) {
                list.add(o3);
            }
        }
        return kotlin.collections.c.g1((List)list);
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
            return a81.e.o(a.r("Params(listingIdToExternalId="), (Map)this.a, ')');
        }
    }
}
