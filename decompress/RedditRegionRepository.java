// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.data.model.RemoteRegionDataModel;
import java.util.ArrayList;
import java.util.Map;
import kf2.g;
import z50.p;
import kf2.o;
import z50.f0;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import ff2.c0;
import kotlinx.coroutines.rx2.d;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import javax.inject.Inject;
import kotlin.collections.EmptyList;
import sg2.e;
import hg2.f;
import com.reddit.domain.model.Region;
import java.util.List;
import va0.b0;
import v40.i0;
import com.reddit.data.remote.RemoteRegionDataSource;
import n20.a;
import java.util.concurrent.TimeUnit;
import xd0.x;

public final class RedditRegionRepository implements x
{
    public static final TimeUnit h;
    public final n20.a a;
    public final RemoteRegionDataSource b;
    public final i0 c;
    public final b0 d;
    public List<Region> e;
    public long f;
    public final f g;
    
    static {
        h = TimeUnit.HOURS;
    }
    
    @Inject
    public RedditRegionRepository(final n20.a a, final RemoteRegionDataSource b, final i0 c, final b0 d) {
        sg2.e.f((Object)a, "backgroundThread");
        sg2.e.f((Object)b, "remote");
        sg2.e.f((Object)c, "local");
        sg2.e.f((Object)d, "startupFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (List<Region>)EmptyList.INSTANCE;
        this.f = -1L;
        this.g = kotlin.a.b((rg2.a)new RedditRegionRepository$store$2(this));
    }
    
    public final Object a(String l$0, final c<? super Region> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RedditRegionRepository$findRegionByGeoFilter$1) {
                final RedditRegionRepository$findRegionByGeoFilter$1 redditRegionRepository$findRegionByGeoFilter$1 = (RedditRegionRepository$findRegionByGeoFilter$1)c;
                final int label = redditRegionRepository$findRegionByGeoFilter$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRegionRepository$findRegionByGeoFilter$1.label = label + Integer.MIN_VALUE;
                    o = redditRegionRepository$findRegionByGeoFilter$1;
                    break Label_0050;
                }
            }
            o = new RedditRegionRepository$findRegionByGeoFilter$1(this, (c)c);
        }
        final Object result = ((RedditRegionRepository$findRegionByGeoFilter$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditRegionRepository$findRegionByGeoFilter$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (String)((RedditRegionRepository$findRegionByGeoFilter$1)o).L$0;
            yd.b.k0(result);
            b = result;
        }
        else {
            yd.b.k0(result);
            final c0<List<Region>> regions = this.getRegions();
            ((RedditRegionRepository$findRegionByGeoFilter$1)o).L$0 = l$0;
            ((RedditRegionRepository$findRegionByGeoFilter$1)o).label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b((c0)regions, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(b, "getRegions().await()");
        for (final Object next : CollectionsKt___CollectionsKt.X3((Collection)b, (Object)Region.DEFAULT)) {
            if (sg2.e.a((Object)((Region)next).getGeoFilter(), (Object)l$0)) {
                return next;
            }
        }
        return null;
    }
    
    public final void b() {
        if (System.currentTimeMillis() - this.f > RedditRegionRepository.h.toMillis(1L)) {
            final c0 w = this.b.getRegions().w((o)new f0(4));
            sg2.e.e((Object)w, "remote.getRegions()\n    \u2026emoteToDomain(it)\n      }");
            final c0 p = w.p((o)new p((Object)this, 4));
            sg2.e.e((Object)p, "fetchRegions()\n        .flatMap { local.save(it) }");
            nn0.a.V((c0)p, (n20.d)this.a).E();
        }
    }
    
    public final c0<List<Region>> getRegions() {
        c0<List<Region>> c0;
        if (this.e.isEmpty() ^ true) {
            c0 = ff2.c0.v(this.e).n((kf2.g<? super List<Region>>)new s(this, 3));
            sg2.e.e((Object)c0, "{\n      Single.just(cach\u2026fNeeded()\n        }\n    }");
        }
        else {
            c0 = this.c.get().h((g)new com.reddit.data.repository.d(this, 1)).x();
            sg2.e.e((Object)c0, "{\n      local.get()\n    \u2026        .toSingle()\n    }");
        }
        return c0;
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
