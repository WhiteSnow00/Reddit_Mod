// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository.usecase;

import java.util.Iterator;
import java.util.Set;
import java.util.List;
import kotlin.Pair;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import a4.u1;
import qg2.m;
import kotlin.collections.EmptyList;
import com.reddit.domain.model.ResultOrException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xz.e;
import java.util.Map;
import javax.inject.Inject;
import ah2.f;
import uz.c;

public final class FetchListingPricesUseCase
{
    public final c a;
    
    @Inject
    public FetchListingPricesUseCase(final c a) {
        f.f((Object)a, "billingManager");
        this.a = a;
    }
    
    public final Object a(a l$0, final tg2.c<? super Map<String, ? extends e>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof FetchListingPricesUseCase$invoke.FetchListingPricesUseCase$invoke$1) {
                final FetchListingPricesUseCase$invoke.FetchListingPricesUseCase$invoke$1 fetchListingPricesUseCase$invoke$1 = (FetchListingPricesUseCase$invoke.FetchListingPricesUseCase$invoke$1)c;
                final int label = fetchListingPricesUseCase$invoke$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchListingPricesUseCase$invoke$1.label = label + Integer.MIN_VALUE;
                    o = fetchListingPricesUseCase$invoke$1;
                    break Label_0050;
                }
            }
            o = new FetchListingPricesUseCase$invoke.FetchListingPricesUseCase$invoke$1(this, (tg2.c)c);
        }
        final Object result = ((FetchListingPricesUseCase$invoke.FetchListingPricesUseCase$invoke$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FetchListingPricesUseCase$invoke.FetchListingPricesUseCase$invoke$1)o).label;
        Object a;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (a)((FetchListingPricesUseCase$invoke.FetchListingPricesUseCase$invoke$1)o).L$0;
            aj2.c.Q0(result);
            a = result;
        }
        else {
            aj2.c.Q0(result);
            final Set l2 = CollectionsKt___CollectionsKt.l2((Iterable)CollectionsKt___CollectionsKt.n1((Iterable)l$0.a.values()));
            final c a2 = this.a;
            final List h2 = CollectionsKt___CollectionsKt.h2((Iterable)l2);
            ((FetchListingPricesUseCase$invoke.FetchListingPricesUseCase$invoke$1)o).L$0 = l$0;
            ((FetchListingPricesUseCase$invoke.FetchListingPricesUseCase$invoke$1)o).label = 1;
            if ((a = a2.a(h2, (tg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        Object instance;
        if ((instance = ((ResultOrException)a).getResult()) == null) {
            instance = EmptyList.INSTANCE;
        }
        int a3;
        if ((a3 = u1.A0(m.P0((Iterable)instance, 10))) < 16) {
            a3 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap<String, e>(a3);
        for (final Object next : instance) {
            linkedHashMap.put(((e)next).b(), (e)next);
        }
        final Map<String, String> a4 = l$0.a;
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final Map.Entry<K, String> entry : a4.entrySet()) {
            final String s = (String)entry.getKey();
            final e e = linkedHashMap.get(entry.getValue());
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
        return kotlin.collections.c.X1((List)list);
    }
    
    public static final class a
    {
        public final Map<String, String> a;
        
        public a(final Map<String, String> a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && f.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return a40.f.p(a.k("Params(listingIdToExternalId="), (Map)this.a, ')');
        }
    }
}
