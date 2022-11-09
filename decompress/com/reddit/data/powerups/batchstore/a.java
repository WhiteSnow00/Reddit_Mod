// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.powerups.batchstore;

import kotlin.coroutines.CoroutineContext;
import mj2.g;
import java.util.Set;
import ah2.f;
import java.util.concurrent.TimeUnit;
import com.nytimes.android.external.cache3.CacheBuilder;
import java.util.concurrent.ConcurrentMap;
import java.util.Map;
import tg2.c;
import java.util.List;
import zg2.p;

public final class a<Key, Value>
{
    public final p<List<? extends Key>, c<? super Map<Key, ? extends Value>>, Object> a;
    public final ConcurrentMap<Key, Value> b;
    public final e20.a c;
    
    public a(final p a, final e20.a c) {
        final CacheBuilder cacheBuilder = new CacheBuilder();
        cacheBuilder.f(200L);
        cacheBuilder.e(30L, TimeUnit.MINUTES);
        final ConcurrentMap map = cacheBuilder.a().asMap();
        f.e((Object)map, "newBuilder()\n    .maximu\u2026ey, Value>()\n    .asMap()");
        f.f((Object)c, "dispatcherProvider");
        this.a = (p<List<? extends Key>, c<? super Map<Key, ? extends Value>>, Object>)a;
        this.b = map;
        this.c = c;
    }
    
    public final Object a(final Set set, final c c) {
        return g.l((CoroutineContext)this.c.c(), (p)new BatchStore$get$2(false, this, set, (c)null), c);
    }
}
