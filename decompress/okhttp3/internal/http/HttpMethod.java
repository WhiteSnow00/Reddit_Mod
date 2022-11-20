// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http;

import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b" }, d2 = { "Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", "method", "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class HttpMethod
{
    public static final HttpMethod INSTANCE;
    
    static {
        INSTANCE = new HttpMethod();
    }
    
    private HttpMethod() {
    }
    
    public static final boolean invalidatesCache(final String s) {
        e.f((Object)s, "method");
        return e.a((Object)s, (Object)"POST") || e.a((Object)s, (Object)"PATCH") || e.a((Object)s, (Object)"PUT") || e.a((Object)s, (Object)"DELETE") || e.a((Object)s, (Object)"MOVE");
    }
    
    public static final boolean permitsRequestBody(final String s) {
        e.f((Object)s, "method");
        return !e.a((Object)s, (Object)"GET") && !e.a((Object)s, (Object)"HEAD");
    }
    
    public static final boolean requiresRequestBody(final String s) {
        e.f((Object)s, "method");
        return e.a((Object)s, (Object)"POST") || e.a((Object)s, (Object)"PUT") || e.a((Object)s, (Object)"PATCH") || e.a((Object)s, (Object)"PROPPATCH") || e.a((Object)s, (Object)"REPORT");
    }
    
    public final boolean redirectsToGet(final String s) {
        e.f((Object)s, "method");
        return e.a((Object)s, (Object)"PROPFIND") ^ true;
    }
    
    public final boolean redirectsWithBody(final String s) {
        e.f((Object)s, "method");
        return e.a((Object)s, (Object)"PROPFIND");
    }
}
