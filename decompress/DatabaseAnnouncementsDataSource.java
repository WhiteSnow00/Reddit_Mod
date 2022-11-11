// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import java.util.Map;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import rg2.p;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import hg2.j;
import lg2.c;
import javax.inject.Inject;
import sg2.e;
import a20.a;
import a60.f;
import javax.inject.Provider;

public final class DatabaseAnnouncementsDataSource
{
    public final Provider<f> a;
    public final a b;
    
    @Inject
    public DatabaseAnnouncementsDataSource(final Provider<f> a, final a b) {
        e.f((Object)a, "announcementDaoProvider");
        e.f((Object)b, "dispatcherProvider");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final c<? super j> c) {
        final Object l = g.l((CoroutineContext)this.b.c(), (p)new DatabaseAnnouncementsDataSource$clearAll$2(this, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return j.a;
    }
    
    public final Object b(final c<? super List<uw.c>> c) {
        return g.l((CoroutineContext)this.b.c(), (p)new DatabaseAnnouncementsDataSource$getAllStatuses$2(this, (c)null), (c)c);
    }
    
    public final f c() {
        final Object value = this.a.get();
        e.e(value, "announcementDaoProvider.get()");
        return (f)value;
    }
    
    public final Object d(final Iterable<uw.a> iterable, final c<? super Map<uw.a, uw.c>> c) {
        return g.l((CoroutineContext)this.b.c(), (p)new DatabaseAnnouncementsDataSource$getStatuses$2(this, (Iterable)iterable, (c)null), (c)c);
    }
}
