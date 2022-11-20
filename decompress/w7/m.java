// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import java.util.Collection;
import h7.n;
import com.apollographql.apollo.interceptor.ApolloInterceptor$c;
import okhttp3.Response;
import java.util.concurrent.atomic.AtomicReference;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import aq2.a;
import ng2.e;
import java.io.IOException;
import com.apollographql.apollo.interceptor.ApolloInterceptor$a;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;
import okhttp3.Call;
import okhttp3.Callback;

public final class m implements Callback
{
    public final l f;
    public final Call g;
    public final ApolloInterceptor$b h;
    public final ApolloInterceptor$a i;
    
    public m(final l f, final Call g, final ApolloInterceptor$b h, final ApolloInterceptor$a i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void onFailure(final Call call, final IOException ex) {
        e.g((Object)call, "call");
        e.g((Object)ex, "e");
        if (this.f.h) {
            return;
        }
        final AtomicReference<Call> g = this.f.g;
        final Call g2 = this.g;
        while (true) {
            while (!g.compareAndSet(g2, null)) {
                if (g.get() != g2) {
                    final boolean b = false;
                    if (b) {
                        final String m = a.m("Failed to execute http call for operation '", this.h.b.name().name(), '\'');
                        this.f.e.P(ex, m, new Object[0]);
                        this.i.a((ApolloException)new ApolloNetworkException(m, ex));
                    }
                    return;
                }
            }
            final boolean b = true;
            continue;
        }
    }
    
    public final void onResponse(Call g, final Response response) {
        e.g((Object)g, "call");
        e.g((Object)response, "response");
        if (this.f.h) {
            return;
        }
        final AtomicReference<Call> g2 = this.f.g;
        g = this.g;
        while (true) {
            while (!g2.compareAndSet(g, null)) {
                if (g2.get() != g) {
                    final boolean b = false;
                    if (b) {
                        this.i.c(new ApolloInterceptor$c(response, (n)null, (Collection)null));
                        this.i.onCompleted();
                    }
                    return;
                }
            }
            final boolean b = true;
            continue;
        }
    }
}
