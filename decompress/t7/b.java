// 
// Decompiled by Procyon v0.6.0
// 

package t7;

import java.util.List;
import java.util.ArrayList;
import m7.j;
import java.util.Collection;
import h7.n;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import okhttp3.Response;
import java.util.Iterator;
import com.apollographql.apollo.exception.ApolloException;
import ah2.f;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;

public final class b implements Callback
{
    public final /* synthetic */ c f;
    
    public b(final c f) {
        this.f = f;
    }
    
    public final void onFailure(final Call call, final IOException ex) {
        ah2.f.g((Object)call, "call");
        ah2.f.g((Object)ex, "e");
        for (final d d : this.f.a) {
            final StringBuilder k = a.k("Failed to execute http call for operation '");
            k.append(d.a.b.name().name());
            k.append('\'');
            d.b.a(new ApolloException(k.toString(), ex));
        }
    }
    
    public final void onResponse(final Call call, final Response response) {
        ah2.f.g((Object)call, "call");
        ah2.f.g((Object)response, "response");
        Label_0161: {
            try {
                try {
                    final ArrayList a = c.a(this.f, response);
                    if (a.size() == this.f.a.size()) {
                        final List<d> a2 = this.f.a;
                        int n = 0;
                    Label_0148:
                        for (final d next : a2) {
                            if (n < 0) {
                                break Label_0148;
                            }
                            final d d = next;
                            d.b.c(new ApolloInterceptor.c((Response)a.get(n), null, null));
                            d.b.onCompleted();
                            ++n;
                        }
                        ah2.c.x0();
                        throw null;
                    }
                    break Label_0161;
                }
                finally {}
            }
            catch (final Exception ex) {
                for (final d d2 : this.f.a) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to parse batch http response for operation '");
                    sb.append(d2.a.b.name().name());
                    sb.append('\'');
                    d2.b.a(new ApolloException(sb.toString(), ex));
                }
                break Label_0161;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Batch response has missing data, expected ");
                sb2.append(this.f.a.size());
                sb2.append(", got ");
                final List list;
                sb2.append(list.size());
                throw new ApolloException(sb2.toString());
            }
        }
        response.close();
        return;
        response.close();
    }
}
