// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import java.lang.reflect.Field;
import h7.h;
import java.util.Collection;
import h7.g;
import java.io.File;
import okhttp3.MultipartBody;
import okhttp3.MultipartBody$Builder;
import java.util.ArrayList;
import okhttp3.RequestBody;
import okhttp3.HttpUrl$Builder;
import k7.d;
import fk2.c;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import xi2.j;
import l7.a;
import h7.k;
import okhttp3.Request$Builder;
import i5.i;
import com.apollographql.apollo.interceptor.ApolloInterceptor$a;
import java.util.concurrent.Executor;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;
import ng2.e;
import okhttp3.Call;
import java.util.concurrent.atomic.AtomicReference;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import zd.b;
import com.apollographql.apollo.api.cache.http.HttpCachePolicy$b;
import com.apollographql.apollo.api.internal.Optional;
import okhttp3.Call$Factory;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import com.apollographql.apollo.interceptor.ApolloInterceptor;

public final class l implements ApolloInterceptor
{
    public static final MediaType i;
    public final HttpUrl a;
    public final Call$Factory b;
    public final Optional<HttpCachePolicy$b> c;
    public final boolean d;
    public final zd.b e;
    public final ScalarTypeAdapters f;
    public AtomicReference<Call> g;
    public volatile boolean h;
    
    static {
        i = MediaType.parse("application/json; charset=utf-8");
    }
    
    public l(final HttpUrl a, final Call$Factory b, final HttpCachePolicy$b httpCachePolicy$b, final ScalarTypeAdapters f, final zd.b e) {
        ng2.e.g((Object)a, "serverUrl");
        ng2.e.g((Object)b, "httpCallFactory");
        ng2.e.g((Object)f, "scalarTypeAdapters");
        ng2.e.g((Object)e, "logger");
        this.g = new AtomicReference<Call>();
        this.a = a;
        this.b = b;
        final Optional fromNullable = Optional.fromNullable((Object)httpCachePolicy$b);
        ng2.e.b((Object)fromNullable, "fromNullable(cachePolicy)");
        this.c = (Optional<HttpCachePolicy$b>)fromNullable;
        this.d = false;
        this.f = f;
        this.e = e;
    }
    
    public final void a(final ApolloInterceptor$b apolloInterceptor$b, final n n, final Executor executor, final ApolloInterceptor$a apolloInterceptor$a) {
        ng2.e.g((Object)apolloInterceptor$b, "request");
        ng2.e.g((Object)executor, "dispatcher");
        ng2.e.g((Object)apolloInterceptor$a, "callBack");
        executor.execute((Runnable)new i((Object)this, 1, (Object)apolloInterceptor$b, (Object)apolloInterceptor$a));
    }
    
    public final void b(final Request$Builder request$Builder, final k<?, ?, ?> k, final l7.a a, final z7.a a2) throws IOException {
        request$Builder.header("Accept", "application/json").header("X-APOLLO-OPERATION-ID", k.d()).header("X-APOLLO-OPERATION-NAME", k.name().name()).tag((Object)k.d());
        for (final String s : a2.a.keySet()) {
            request$Builder.header(s, (String)a2.a.get(s));
        }
        if (this.c.isPresent()) {
            final HttpCachePolicy$b httpCachePolicy$b = (HttpCachePolicy$b)this.c.get();
            final boolean z0 = j.z0("true", (String)a.a.get("do-not-store"), true);
            final ScalarTypeAdapters f = this.f;
            if (f == null) {
                ng2.e.m();
                throw null;
            }
            final Request$Builder header = request$Builder.header("X-APOLLO-CACHE-KEY", k.c(true, true, f).md5().hex()).header("X-APOLLO-CACHE-FETCH-STRATEGY", ((Enum)httpCachePolicy$b.a).name());
            final TimeUnit c = httpCachePolicy$b.c;
            long millis;
            if (c == null) {
                millis = 0L;
            }
            else {
                millis = c.toMillis(httpCachePolicy$b.b);
            }
            header.header("X-APOLLO-EXPIRE-TIMEOUT", String.valueOf(millis)).header("X-APOLLO-EXPIRE-AFTER-READ", Boolean.toString(httpCachePolicy$b.d)).header("X-APOLLO-PREFETCH", Boolean.toString(this.d)).header("X-APOLLO-CACHE-DO-NOT-STORE", Boolean.toString(z0));
        }
    }
    
    public final Call c(final k<?, ?, ?> k, final l7.a a, final z7.a a2, final boolean b, final boolean b2) throws IOException {
        final Request$Builder request$Builder = new Request$Builder();
        final HttpUrl a3 = this.a;
        final ScalarTypeAdapters f = this.f;
        ng2.e.g((Object)a3, "serverUrl");
        final HttpUrl$Builder builder = a3.newBuilder();
        if (!b2 || b) {
            builder.addQueryParameter("query", k.b());
        }
        if (k.e() != k.a) {
            ng2.e.b((Object)builder, "urlBuilder");
            final c c = new c();
            final k7.c c2 = new k7.c(c);
            c2.j = true;
            c2.h();
            final j7.d b3 = k.e().b();
            if (f == null) {
                ng2.e.m();
                throw null;
            }
            b3.a((j7.e)new k7.b(c2, f));
            c2.r();
            c2.close();
            builder.addQueryParameter("variables", c.E());
        }
        builder.addQueryParameter("operationName", k.name().name());
        if (b2) {
            final c c3 = new c();
            final k7.c c4 = new k7.c(c3);
            c4.j = true;
            c4.h();
            c4.s("persistedQuery");
            c4.h();
            c4.s("version");
            c4.H();
            c4.s("sha256Hash");
            c4.A(k.d());
            c4.r();
            c4.r();
            c4.close();
            builder.addQueryParameter("extensions", c3.E());
        }
        final HttpUrl build = builder.build();
        ng2.e.b((Object)build, "urlBuilder.build()");
        final Request$Builder value = request$Builder.url(build).get();
        ng2.e.b((Object)value, "requestBuilder");
        this.b(value, k, a, a2);
        final Call call = this.b.newCall(value.build());
        ng2.e.b((Object)call, "httpCallFactory.newCall(requestBuilder.build())");
        return call;
    }
    
    public final Call d(final k<?, ?, ?> k, final l7.a a, final z7.a a2, final boolean b, final boolean b2) throws IOException {
        final MediaType i = l.i;
        final ScalarTypeAdapters f = this.f;
        if (f != null) {
            Object o = RequestBody.create(i, k.c(b2, b, f));
            final ArrayList list = new ArrayList();
            for (final String s : k.e().c().keySet()) {
                l.a.a(k.e().c().get(s), ng2.e.l((Object)s, "variables."), list);
            }
            if (!list.isEmpty()) {
                final c c = new c();
                final k7.c c2 = new k7.c(c);
                c2.h();
                final Iterator iterator2 = list.iterator();
                final int n = 0;
                int n2 = 0;
                while (iterator2.hasNext()) {
                    final Object next = iterator2.next();
                    if (n2 < 0) {
                        cg.d.a4();
                        throw null;
                    }
                    final b b3 = (b)next;
                    c2.s(String.valueOf(n2));
                    c2.b();
                    c2.A(b3.a);
                    c2.q();
                    ++n2;
                }
                c2.r();
                c2.close();
                final MultipartBody$Builder addFormDataPart = new MultipartBody$Builder().setType(MultipartBody.FORM).addFormDataPart("operations", (String)null, (RequestBody)o).addFormDataPart("map", (String)null, RequestBody.create(l.i, c.D1()));
                final Iterator iterator3 = list.iterator();
                int n3 = n;
                while (iterator3.hasNext()) {
                    final Object next2 = iterator3.next();
                    if (n3 < 0) {
                        cg.d.a4();
                        throw null;
                    }
                    final b b4 = (b)next2;
                    final String b5 = b4.b.b;
                    File file;
                    if (b5 == null) {
                        file = null;
                    }
                    else {
                        file = new File(b5);
                    }
                    final MediaType parse = MediaType.parse(b4.b.a);
                    if (file == null) {
                        b4.b.getClass();
                        throw new UnsupportedOperationException("ApolloGraphQL: if you're not passing a `filePath` parameter, you must override `FileUpload.fileName`");
                    }
                    addFormDataPart.addFormDataPart(String.valueOf(n3), file.getName(), RequestBody.create(parse, file));
                    ++n3;
                }
                o = addFormDataPart.build();
                ng2.e.b(o, "multipartBodyBuilder.build()");
            }
            final Request$Builder post = new Request$Builder().url(this.a).header("Content-Type", "application/json").post((RequestBody)o);
            ng2.e.b((Object)post, "requestBuilder");
            this.b(post, k, a, a2);
            final Call call = this.b.newCall(post.build());
            ng2.e.b((Object)call, "httpCallFactory.newCall(requestBuilder.build())");
            return call;
        }
        ng2.e.m();
        throw null;
    }
    
    public final void dispose() {
        this.h = true;
        final Call call = this.g.getAndSet(null);
        if (call != null) {
            call.cancel();
        }
    }
    
    public static final class a
    {
        public static void a(Object o, final String s, final ArrayList list) {
            final boolean b = o instanceof h7.i;
            final int n = 0;
            final int n2 = 0;
            int i = 0;
            Label_0123: {
                if (!b) {
                    break Label_0123;
                }
                try {
                    final Field[] declaredFields = o.getClass().getDeclaredFields();
                    e.b((Object)declaredFields, "fields");
                    while (i < declaredFields.length) {
                        final Field field = declaredFields[i];
                        ++i;
                        field.setAccessible(true);
                        final Object value = field.get(o);
                        final String name = field.getName();
                        final StringBuilder sb = new StringBuilder();
                        sb.append(s);
                        sb.append('.');
                        sb.append((Object)name);
                        a(value, sb.toString(), list);
                    }
                    Label_0439: {
                        return;
                    }
                    while (true) {
                        while (true) {
                            g g;
                            Iterator iterator = null;
                            Object next;
                            int n3;
                            Iterator iterator2;
                            int n4;
                            int length;
                            MediaType j;
                            StringBuilder sb2;
                            Object[] array;
                            g g2;
                            StringBuilder sb3;
                            int n5;
                            String string;
                            ArrayList list2;
                            Label_0360:Label_0248_Outer:
                            while (true) {
                                g = (g)o;
                                list.add(new b(s, g.a, g));
                                return;
                                Label_0340:
                                iftrue(Label_0439:)(!(o instanceof Collection));
                                Label_0207_Outer:Label_0232_Outer:
                                while (true) {
                                    while (true) {
                                    Block_8:
                                        while (true) {
                                            Block_9: {
                                                Block_7: {
                                                    Block_12: {
                                                        Block_4: {
                                                            Block_10: {
                                                                break Block_10;
                                                                iftrue(Label_0145:)(!(o instanceof h));
                                                                break Block_4;
                                                                next = iterator.next();
                                                                iftrue(Label_0434:)(n3 < 0);
                                                                break Block_12;
                                                            }
                                                            iterator = ((Iterable)o).iterator();
                                                            n3 = n2;
                                                            break Label_0360;
                                                            iftrue(Label_0439:)(!iterator2.hasNext());
                                                            break Block_9;
                                                            iftrue(Label_0238:)(n4 >= length);
                                                            break Block_7;
                                                        }
                                                        a(((h)o).a, s, list);
                                                        return;
                                                    }
                                                    j = l.i;
                                                    sb2 = new StringBuilder();
                                                    sb2.append(s);
                                                    sb2.append('.');
                                                    sb2.append(n3);
                                                    a(next, sb2.toString(), list);
                                                    ++n3;
                                                    break Label_0360;
                                                }
                                                o = array[n4];
                                                iftrue(Label_0232:)(!(o instanceof g));
                                                break Block_8;
                                            }
                                            g2 = (g)iterator2.next();
                                            sb3 = new StringBuilder();
                                            sb3.append(s);
                                            sb3.append('.');
                                            sb3.append(n5);
                                            string = sb3.toString();
                                            list.add(new b(string, g2.a, g2));
                                            System.out.println((Object)string);
                                            ++n5;
                                            continue Label_0207_Outer;
                                            ++n4;
                                            continue Label_0232_Outer;
                                            array = (Object[])o;
                                            list2 = new ArrayList();
                                            length = array.length;
                                            n4 = 0;
                                            continue Label_0232_Outer;
                                        }
                                        list2.add(o);
                                        continue;
                                    }
                                    Label_0238:
                                    iterator2 = list2.iterator();
                                    n5 = n;
                                    continue Label_0207_Outer;
                                }
                                Label_0145:
                                iftrue(Label_0178:)(!(o instanceof g));
                                continue Label_0248_Outer;
                            }
                            iftrue(Label_0439:)(!iterator.hasNext());
                            continue;
                        }
                        Label_0434:
                        cg.d.a4();
                        throw null;
                        Label_0178:
                        iftrue(Label_0340:)(!(o instanceof Object[]));
                        continue;
                    }
                }
                catch (final IllegalAccessException ex) {}
            }
        }
    }
    
    public static final class b
    {
        public final String a;
        public final g b;
        
        public b(final String a, final String s, final g b) {
            e.g((Object)a, "key");
            e.g((Object)s, "mimetype");
            e.g((Object)b, "fileUpload");
            this.a = a;
            this.b = b;
        }
    }
}
