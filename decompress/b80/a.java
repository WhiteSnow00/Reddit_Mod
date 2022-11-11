// 
// Decompiled by Procyon v0.6.0
// 

package b80;

import com.google.common.cache.CacheBuilder;
import sg2.e;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public class a<T>
{
    public static final TimeUnit b;
    public final ConcurrentMap<String, T> a;
    
    static {
        b = TimeUnit.MINUTES;
    }
    
    public a() {
        this(0);
    }
    
    public a(final int n) {
        final TimeUnit b = b80.a.b;
        e.f((Object)b, "ttlUnits");
        final CacheBuilder cacheBuilder = new CacheBuilder();
        cacheBuilder.e(10L);
        cacheBuilder.d(1L, b);
        this.a = cacheBuilder.a().asMap();
    }
}
