// 
// Decompiled by Procyon v0.6.0
// 

package q7;

import zg2.p;
import h7.d;
import okhttp3.Response$Builder;
import okhttp3.ResponseBody;
import ah2.f;
import okhttp3.Response;
import com.apollographql.apollo.api.a$b;

public final class a implements a$b
{
    public static final a c;
    public final a b;
    
    static {
        c = new a();
    }
    
    public a(final Response response) {
        f.g((Object)response, "response");
        e(response);
        this.b = a.c;
    }
    
    public static Response e(Response response) {
        final Response$Builder builder = response.newBuilder();
        if (response.body() != null) {
            builder.body((ResponseBody)null);
        }
        final Response cacheResponse = response.cacheResponse();
        if (cacheResponse != null) {
            builder.cacheResponse(e(cacheResponse));
        }
        response = response.networkResponse();
        if (response != null) {
            builder.networkResponse(e(response));
        }
        response = builder.build();
        f.b((Object)response, "builder.build()");
        return response;
    }
    
    public final a a(final a.c<?> c) {
        f.g((Object)c, "key");
        Object b;
        if (f.a((Object)this.b, (Object)c)) {
            b = d.b;
        }
        else {
            b = this;
        }
        return (a)b;
    }
    
    public final a b(final a a) {
        return a.a.a((a)this, a);
    }
    
    public final a c(final a.c c) {
        f.g((Object)c, "key");
        a a;
        if (f.a((Object)this.b, (Object)c)) {
            a = this;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final <R> R d(final R r, final p<? super R, ? super a$b, ? extends R> p2) {
        f.g((Object)p2, "operation");
        return (R)p2.invoke((Object)r, (Object)this);
    }
    
    public final a getKey() {
        return this.b;
    }
    
    public static final class a implements c<q7.a>
    {
    }
}
