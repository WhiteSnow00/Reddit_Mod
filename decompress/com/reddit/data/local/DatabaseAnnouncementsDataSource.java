// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import java.util.Map;
import com.reddit.domain.model.AnnouncementStatus;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import pg2.j;
import tg2.c;
import javax.inject.Inject;
import e20.a;
import h60.f;
import javax.inject.Provider;

public final class DatabaseAnnouncementsDataSource
{
    public final Provider<f> a;
    public final a b;
    
    @Inject
    public DatabaseAnnouncementsDataSource(final Provider<f> a, final a b) {
        ah2.f.f((Object)a, "announcementDaoProvider");
        ah2.f.f((Object)b, "dispatcherProvider");
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
    
    public final Object b(final c<? super List<AnnouncementStatus>> c) {
        return g.l((CoroutineContext)this.b.c(), (p)new DatabaseAnnouncementsDataSource$getAllStatuses$2(this, (c)null), (c)c);
    }
    
    public final f c() {
        final Object value = this.a.get();
        ah2.f.e(value, "announcementDaoProvider.get()");
        return (f)value;
    }
    
    public final Object d(final Iterable<xw.a> iterable, final c<? super Map<xw.a, AnnouncementStatus>> c) {
        return g.l((CoroutineContext)this.b.c(), (p)new DatabaseAnnouncementsDataSource$getStatuses$2(this, (Iterable)iterable, (c)null), (c)c);
    }
}
