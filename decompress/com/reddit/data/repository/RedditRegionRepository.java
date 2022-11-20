// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import b60.d0;
import ff2.g;
import ff2.o;
import b60.q0;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import af2.c0;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import javax.inject.Inject;
import kotlin.collections.EmptyList;
import ng2.e;
import cg2.f;
import com.reddit.domain.model.Region;
import java.util.List;
import wa0.a0;
import x40.g0;
import com.reddit.data.remote.RemoteRegionDataSource;
import q20.a;
import java.util.concurrent.TimeUnit;
import xd0.x;

public final class RedditRegionRepository implements x
{
    public static final TimeUnit h;
    public final a a;
    public final RemoteRegionDataSource b;
    public final g0 c;
    public final a0 d;
    public List<Region> e;
    public long f;
    public final f g;
    
    static {
        h = TimeUnit.HOURS;
    }
    
    @Inject
    public RedditRegionRepository(final a a, final RemoteRegionDataSource b, final g0 c, final a0 d) {
        ng2.e.f((Object)a, "backgroundThread");
        ng2.e.f((Object)b, "remote");
        ng2.e.f((Object)c, "local");
        ng2.e.f((Object)d, "startupFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (List<Region>)EmptyList.INSTANCE;
        this.f = -1L;
        this.g = kotlin.a.b((mg2.a)new RedditRegionRepository$store$2(this));
    }
    
    @Override
    public final Object a(String l$0, final c<? super Region> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RedditRegionRepository$findRegionByGeoFilter$1) {
                final RedditRegionRepository$findRegionByGeoFilter$1 redditRegionRepository$findRegionByGeoFilter$1 = (RedditRegionRepository$findRegionByGeoFilter$1)c;
                final int label = redditRegionRepository$findRegionByGeoFilter$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditRegionRepository$findRegionByGeoFilter$1.label = label + Integer.MIN_VALUE;
                    o = redditRegionRepository$findRegionByGeoFilter$1;
                    break Label_0051;
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
            cg.d.b4(result);
            b = result;
        }
        else {
            cg.d.b4(result);
            final c0<List<Region>> regions = this.getRegions();
            ((RedditRegionRepository$findRegionByGeoFilter$1)o).L$0 = l$0;
            ((RedditRegionRepository$findRegionByGeoFilter$1)o).label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(regions, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ng2.e.e(b, "getRegions().await()");
        for (final Object next : CollectionsKt___CollectionsKt.p5((Collection)b, (Object)Region.DEFAULT)) {
            if (ng2.e.a((Object)((Region)next).getGeoFilter(), (Object)l$0)) {
                return next;
            }
        }
        return null;
    }
    
    public final void b() {
        if (System.currentTimeMillis() - this.f > RedditRegionRepository.h.toMillis(1L)) {
            final c0 w = this.b.getRegions().w((o)new q0(6));
            ng2.e.e((Object)w, "remote.getRegions()\n    \u2026emoteToDomain(it)\n      }");
            final c0 p = w.p((o)new b60.o((Object)this, 1));
            ng2.e.e((Object)p, "fetchRegions()\n        .flatMap { local.save(it) }");
            px1.a.K0((c0)p, (q20.d)this.a).E();
        }
    }
    
    @Override
    public final c0<List<Region>> getRegions() {
        c0<List<Region>> c0;
        if (this.e.isEmpty() ^ true) {
            c0 = af2.c0.v(this.e).n((ff2.g<? super List<Region>>)new l(this, 2));
            ng2.e.e((Object)c0, "{\n      Single.just(cach\u2026fNeeded()\n        }\n    }");
        }
        else {
            c0 = this.c.get().h((ff2.g<? super List<Region>>)new d0((Object)this, 2)).y();
            ng2.e.e((Object)c0, "{\n      local.get()\n    \u2026        .toSingle()\n    }");
        }
        return c0;
    }
}
