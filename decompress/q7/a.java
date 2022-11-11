// 
// Decompiled by Procyon v0.6.0
// 

package q7;

import rg2.p;
import com.apollographql.apollo.api.a$a;
import h7.d;
import com.apollographql.apollo.api.a$c;
import okhttp3.Response$Builder;
import okhttp3.ResponseBody;
import sg2.e;
import okhttp3.Response;
import com.apollographql.apollo.api.a$b;

public final class a implements a$b
{
    public static final a.a$a c;
    public final a.a$a b;
    
    static {
        c = new a.a$a();
    }
    
    public a(final Response response) {
        e.g((Object)response, "response");
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
        e.b((Object)response, "builder.build()");
        return response;
    }
    
    public final com.apollographql.apollo.api.a a(final a$c<?> a$c) {
        e.g((Object)a$c, "key");
        Object b;
        if (e.a((Object)this.b, (Object)a$c)) {
            b = d.b;
        }
        else {
            b = this;
        }
        return (com.apollographql.apollo.api.a)b;
    }
    
    public final com.apollographql.apollo.api.a b(final a a) {
        return a$a.a((com.apollographql.apollo.api.a)this, a);
    }
    
    public final a c(final a$c a$c) {
        e.g((Object)a$c, "key");
        a a;
        if (e.a((Object)this.b, (Object)a$c)) {
            a = this;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final <R> R d(final R r, final p<? super R, ? super a$b, ? extends R> p2) {
        e.g((Object)p2, "operation");
        return (R)p2.invoke(r, (Object)this);
    }
    
    public final a.a$a getKey() {
        return this.b;
    }
}
