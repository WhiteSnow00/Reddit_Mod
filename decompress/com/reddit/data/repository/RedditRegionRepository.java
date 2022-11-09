// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.data.model.RemoteRegionDataModel;
import java.util.ArrayList;
import java.util.Map;
import sf2.g;
import a4.u1;
import g60.p;
import sf2.o;
import g60.n0;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import kotlinx.coroutines.rx2.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import javax.inject.Inject;
import kotlin.collections.EmptyList;
import pg2.f;
import com.reddit.domain.model.Region;
import java.util.List;
import db0.c0;
import c50.k0;
import com.reddit.data.remote.RemoteRegionDataSource;
import r20.a;
import java.util.concurrent.TimeUnit;
import ge0.f0;

public final class RedditRegionRepository implements f0
{
    public static final TimeUnit h;
    public final r20.a a;
    public final RemoteRegionDataSource b;
    public final k0 c;
    public final c0 d;
    public List<Region> e;
    public long f;
    public final f g;
    
    static {
        h = TimeUnit.HOURS;
    }
    
    @Inject
    public RedditRegionRepository(final r20.a a, final RemoteRegionDataSource b, final k0 c, final c0 d) {
        ah2.f.f((Object)a, "backgroundThread");
        ah2.f.f((Object)b, "remote");
        ah2.f.f((Object)c, "local");
        ah2.f.f((Object)d, "startupFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (List<Region>)EmptyList.INSTANCE;
        this.f = -1L;
        this.g = kotlin.a.b((zg2.a)new RedditRegionRepository$store.RedditRegionRepository$store$2(this));
    }
    
    public final Object a(String l$0, final c<? super Region> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RedditRegionRepository$findRegionByGeoFilter.RedditRegionRepository$findRegionByGeoFilter$1) {
                final RedditRegionRepository$findRegionByGeoFilter.RedditRegionRepository$findRegionByGeoFilter$1 redditRegionRepository$findRegionByGeoFilter$1 = (RedditRegionRepository$findRegionByGeoFilter.RedditRegionRepository$findRegionByGeoFilter$1)c;
                final int label = redditRegionRepository$findRegionByGeoFilter$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRegionRepository$findRegionByGeoFilter$1.label = label + Integer.MIN_VALUE;
                    o = redditRegionRepository$findRegionByGeoFilter$1;
                    break Label_0050;
                }
            }
            o = new RedditRegionRepository$findRegionByGeoFilter.RedditRegionRepository$findRegionByGeoFilter$1(this, (c)c);
        }
        final Object result = ((RedditRegionRepository$findRegionByGeoFilter.RedditRegionRepository$findRegionByGeoFilter$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditRegionRepository$findRegionByGeoFilter.RedditRegionRepository$findRegionByGeoFilter$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (String)((RedditRegionRepository$findRegionByGeoFilter.RedditRegionRepository$findRegionByGeoFilter$1)o).L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final nf2.c0<List<Region>> regions = this.getRegions();
            ((RedditRegionRepository$findRegionByGeoFilter.RedditRegionRepository$findRegionByGeoFilter$1)o).L$0 = l$0;
            ((RedditRegionRepository$findRegionByGeoFilter.RedditRegionRepository$findRegionByGeoFilter$1)o).label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b((nf2.c0)regions, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(b, "getRegions().await()");
        for (final Object next : CollectionsKt___CollectionsKt.O1((Collection)b, (Object)Region.DEFAULT)) {
            if (ah2.f.a((Object)((Region)next).getGeoFilter(), (Object)l$0)) {
                return next;
            }
        }
        return null;
    }
    
    public final void b() {
        if (System.currentTimeMillis() - this.f > RedditRegionRepository.h.toMillis(1L)) {
            final nf2.c0 w = this.b.getRegions().w((o)new n0(4));
            ah2.f.e((Object)w, "remote.getRegions()\n    \u2026emoteToDomain(it)\n      }");
            final nf2.c0 p = w.p((o)new p(this, 4));
            ah2.f.e((Object)p, "fetchRegions()\n        .flatMap { local.save(it) }");
            u1.j1(p, (r20.d)this.a).E();
        }
    }
    
    public final nf2.c0<List<Region>> getRegions() {
        nf2.c0 c0;
        if (this.e.isEmpty() ^ true) {
            c0 = nf2.c0.v((Object)this.e).n((g)new u(this, 2));
            ah2.f.e((Object)c0, "{\n      Single.just(cach\u2026fNeeded()\n        }\n    }");
        }
        else {
            c0 = this.c.get().h((g)new com.reddit.data.repository.f(this, 1)).y();
            ah2.f.e((Object)c0, "{\n      local.get()\n    \u2026        .toSingle()\n    }");
        }
        return (nf2.c0<List<Region>>)c0;
    }
    
    public static final class a
    {
        public static List a(final Map map) {
            if (map == null) {
                return (List)EmptyList.INSTANCE;
            }
            final ArrayList list = new ArrayList();
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                final String s = entry.getKey();
                final RemoteRegionDataModel remoteRegionDataModel = (RemoteRegionDataModel)entry.getValue();
                list.add(new Region(s, remoteRegionDataModel.getName(), remoteRegionDataModel.getGeoFilter()));
            }
            return list;
        }
    }
}
