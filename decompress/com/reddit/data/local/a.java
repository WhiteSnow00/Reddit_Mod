// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import java.util.Iterator;
import java.util.ArrayList;
import ig2.m;
import b60.q;
import java.util.List;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import lg2.c;
import javax.inject.Inject;
import sg2.e;
import a60.l0;

public final class a
{
    public final l0 a;
    
    @Inject
    public a(final l0 a) {
        e.f((Object)a, "skippedGeoTaggingDao");
        this.a = a;
    }
    
    public final Serializable a(final c c) {
        Object o = null;
        Label_0047: {
            if (c instanceof DatabaseCrowdsourceTaggingDataSource$getSkippedCommunityIds$1) {
                final DatabaseCrowdsourceTaggingDataSource$getSkippedCommunityIds$1 databaseCrowdsourceTaggingDataSource$getSkippedCommunityIds$1 = (DatabaseCrowdsourceTaggingDataSource$getSkippedCommunityIds$1)c;
                final int label = databaseCrowdsourceTaggingDataSource$getSkippedCommunityIds$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseCrowdsourceTaggingDataSource$getSkippedCommunityIds$1.label = label + Integer.MIN_VALUE;
                    o = databaseCrowdsourceTaggingDataSource$getSkippedCommunityIds$1;
                    break Label_0047;
                }
            }
            o = new DatabaseCrowdsourceTaggingDataSource$getSkippedCommunityIds$1(this, c);
        }
        final Object result = ((DatabaseCrowdsourceTaggingDataSource$getSkippedCommunityIds$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((DatabaseCrowdsourceTaggingDataSource$getSkippedCommunityIds$1)o).label;
        Object a;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(result);
            a = result;
        }
        else {
            b.k0(result);
            final l0 a2 = this.a;
            ((DatabaseCrowdsourceTaggingDataSource$getSkippedCommunityIds$1)o).label = 1;
            if ((a = a2.a((c<? super List<q>>)o)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
        }
        final Iterable iterable = (Iterable)a;
        final ArrayList list = new ArrayList<String>(m.c3(iterable, 10));
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add(((q)iterator.next()).a);
        }
        return list;
    }
}
