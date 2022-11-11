// 
// Decompiled by Procyon v0.6.0
// 

package t7;

import java.util.Iterator;
import okhttp3.ResponseBody;
import okio.ByteString;
import com.apollographql.apollo.exception.ApolloException;
import java.io.Closeable;
import lw0.b;
import hg2.j;
import k7.f;
import ig2.m;
import k7.a;
import java.util.ArrayList;
import okhttp3.Response;
import sg2.e;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import okhttp3.Call$Factory;
import okhttp3.HttpUrl;
import java.util.List;

public final class c
{
    public final List<d> a;
    public final HttpUrl b;
    public final Call$Factory c;
    public final ScalarTypeAdapters d;
    
    public c(final List<d> a, final HttpUrl b, final Call$Factory c, final ScalarTypeAdapters d) {
        e.g((Object)a, "queryList");
        e.g((Object)b, "serverUrl");
        e.g((Object)c, "httpCallFactory");
        e.g((Object)d, "scalarTypeAdapters");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static final ArrayList a(c c, final Response response) {
        c.getClass();
        final ResponseBody body = response.body();
        final ArrayList list = null;
        c = null;
        ArrayList<Response> list2;
        if (body == null) {
            list2 = list;
        }
        else {
            final jk2.f source = body.source();
            if (source == null) {
                list2 = list;
            }
            else {
                final List<Object> f = new k7.e(new a(source)).f();
                if (f != null) {
                    c = (c)new ArrayList(m.c3((Iterable)f, 10));
                    for (final Object next : f) {
                        final jk2.c c2 = new jk2.c();
                        final k7.c c3 = new k7.c(c2);
                        try {
                            k7.f.a(next, (k7.d)c3);
                            final j a = j.a;
                            b.X((Closeable)c3, (Throwable)null);
                            ((ArrayList<ByteString>)c).add(c2.C1());
                            continue;
                        }
                        finally {
                            try {}
                            finally {
                                b.X((Closeable)c3, (Throwable)c);
                            }
                        }
                        break;
                    }
                }
                if (c == null) {
                    throw new ApolloException("Unable to extract individual responses from batch response body");
                }
                final ArrayList<Response> list3 = new ArrayList<Response>(m.c3((Iterable)c, 10));
                final Iterator<Object> iterator2 = ((Iterable<Object>)c).iterator();
                while (iterator2.hasNext()) {
                    list3.add(response.newBuilder().body(ResponseBody.create(v7.m.i, (ByteString)iterator2.next())).build());
                }
                list2 = list3;
            }
        }
        if (list2 != null) {
            return list2;
        }
        throw new ApolloException("Unable to read batch response body");
    }
}
