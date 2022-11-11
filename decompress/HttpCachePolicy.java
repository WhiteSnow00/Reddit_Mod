// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.api.cache.http;

import ah2.f;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

public final class HttpCachePolicy
{
    public static final b a;
    
    static {
        new HttpCachePolicy.HttpCachePolicy$a(FetchStrategy.CACHE_ONLY);
        a = new b(FetchStrategy.NETWORK_ONLY);
        new HttpCachePolicy.HttpCachePolicy$a(FetchStrategy.CACHE_FIRST);
        new HttpCachePolicy.HttpCachePolicy$a(FetchStrategy.NETWORK_FIRST);
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "Lcom/apollographql/apollo/api/cache/http/HttpCachePolicy$FetchStrategy;", "", "(Ljava/lang/String;I)V", "CACHE_ONLY", "NETWORK_ONLY", "CACHE_FIRST", "NETWORK_FIRST", "apollo-http-cache-api" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
    public enum FetchStrategy
    {
        CACHE_FIRST, 
        CACHE_ONLY, 
        NETWORK_FIRST, 
        NETWORK_ONLY;
    }
    
    public static class b
    {
        public final FetchStrategy a;
        public final long b;
        public final TimeUnit c;
        public final boolean d;
        
        public b(final FetchStrategy a) {
            f.g((Object)a, "fetchStrategy");
            this.a = a;
            this.b = 0L;
            this.c = null;
            this.d = false;
        }
    }
}
