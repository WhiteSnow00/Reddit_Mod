// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository.usecase;

import java.util.Iterator;
import java.util.LinkedHashMap;
import dg2.m;
import kotlin.collections.EmptyList;
import com.reddit.domain.model.ResultOrException;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Inject;
import ng2.e;
import sz.c;

public final class a
{
    public final c a;
    
    @Inject
    public a(final c a) {
        e.f((Object)a, "billingManager");
        this.a = a;
    }
    
    public final Serializable a(final ArrayList list, final gg2.c c) {
        Object o = null;
        Label_0051: {
            if (c instanceof FetchGooglePlaySkuPricesUseCase$invoke$1) {
                final FetchGooglePlaySkuPricesUseCase$invoke$1 fetchGooglePlaySkuPricesUseCase$invoke$1 = (FetchGooglePlaySkuPricesUseCase$invoke$1)c;
                final int label = fetchGooglePlaySkuPricesUseCase$invoke$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchGooglePlaySkuPricesUseCase$invoke$1.label = label + Integer.MIN_VALUE;
                    o = fetchGooglePlaySkuPricesUseCase$invoke$1;
                    break Label_0051;
                }
            }
            o = new FetchGooglePlaySkuPricesUseCase$invoke$1(this, c);
        }
        final Object result = ((FetchGooglePlaySkuPricesUseCase$invoke$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FetchGooglePlaySkuPricesUseCase$invoke$1)o).label;
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
            final c a = this.a;
            final List l4 = CollectionsKt___CollectionsKt.L4((Iterable)list);
            ((FetchGooglePlaySkuPricesUseCase$invoke$1)o).label = 1;
            if ((d = a.d(l4, (gg2.c)o)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
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
        final LinkedHashMap linkedHashMap = new LinkedHashMap(p2);
        for (final Object next : instance) {
            linkedHashMap.put((Object)((vz.e)next).b(), next);
        }
        return linkedHashMap;
    }
}
