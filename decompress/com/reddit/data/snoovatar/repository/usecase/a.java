// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository.usecase;

import java.util.Iterator;
import java.util.List;
import xz.e;
import java.util.LinkedHashMap;
import a4.u1;
import qg2.m;
import kotlin.collections.EmptyList;
import com.reddit.domain.model.ResultOrException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Inject;
import ah2.f;
import uz.c;

public final class a
{
    public final c a;
    
    @Inject
    public a(final c a) {
        f.f((Object)a, "billingManager");
        this.a = a;
    }
    
    public final Serializable a(final ArrayList list, final tg2.c c) {
        Object o = null;
        Label_0050: {
            if (c instanceof FetchGooglePlaySkuPricesUseCase$invoke$1) {
                final FetchGooglePlaySkuPricesUseCase$invoke$1 fetchGooglePlaySkuPricesUseCase$invoke$1 = (FetchGooglePlaySkuPricesUseCase$invoke$1)c;
                final int label = fetchGooglePlaySkuPricesUseCase$invoke$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchGooglePlaySkuPricesUseCase$invoke$1.label = label + Integer.MIN_VALUE;
                    o = fetchGooglePlaySkuPricesUseCase$invoke$1;
                    break Label_0050;
                }
            }
            o = new FetchGooglePlaySkuPricesUseCase$invoke$1(this, (tg2.c<? super FetchGooglePlaySkuPricesUseCase$invoke$1>)c);
        }
        final Object result = ((FetchGooglePlaySkuPricesUseCase$invoke$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FetchGooglePlaySkuPricesUseCase$invoke$1)o).label;
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
            final c a2 = this.a;
            final List h1 = CollectionsKt___CollectionsKt.h1((Iterable)list);
            ((FetchGooglePlaySkuPricesUseCase$invoke$1)o).label = 1;
            if ((a = a2.a(h1, (tg2.c)o)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
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
        final LinkedHashMap linkedHashMap = new LinkedHashMap(a3);
        for (final Object next : instance) {
            linkedHashMap.put((Object)((e)next).b(), next);
        }
        return linkedHashMap;
    }
}
