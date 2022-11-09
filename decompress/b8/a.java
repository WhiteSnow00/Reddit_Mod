// 
// Decompiled by Procyon v0.6.0
// 

package b8;

import h7.k;
import rk2.b0;
import com.apollographql.apollo.api.internal.json.JsonEncodingException;
import java.io.IOException;
import java.io.Closeable;
import n02.r;
import pg2.j;
import ah2.f;
import kotlin.collections.c;
import java.util.Collections;
import java.util.Map;

public final class a implements d
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    public static Map c(Map unmodifiableMap) {
        unmodifiableMap = ((Map<Object, Map<Object, Object>>)unmodifiableMap).get("payload");
        if (unmodifiableMap == null) {
            unmodifiableMap = null;
        }
        else {
            unmodifiableMap = Collections.unmodifiableMap((Map<?, ? extends Map<Object, Object>>)unmodifiableMap);
        }
        Map<?, ? extends Map<Object, Object>> n1 = (Map<?, ? extends Map<Object, Object>>)unmodifiableMap;
        if (unmodifiableMap == null) {
            n1 = c.N1();
        }
        return n1;
    }
    
    public static e d(final k7.a a) {
        final Map<String, Object> g = new k7.e(a).g();
        if (g != null) {
            final String s = g.get("id");
            final String s2 = g.get("type");
            if (s2 != null) {
                e e = null;
                switch (s2.hashCode()) {
                    default: {
                        throw new IllegalArgumentException(f.l((Object)s2, "Unsupported message type "));
                    }
                    case 1270515624: {
                        if (s2.equals("connection_ack")) {
                            e = new e.b();
                            break;
                        }
                        throw new IllegalArgumentException(f.l((Object)s2, "Unsupported message type "));
                    }
                    case 1198953831: {
                        if (s2.equals("connection_error")) {
                            e = new e.c(c(g));
                            break;
                        }
                        throw new IllegalArgumentException(f.l((Object)s2, "Unsupported message type "));
                    }
                    case 96784904: {
                        if (s2.equals("error")) {
                            e = new e.f(s, c(g));
                            break;
                        }
                        throw new IllegalArgumentException(f.l((Object)s2, "Unsupported message type "));
                    }
                    case 3076010: {
                        if (s2.equals("data")) {
                            e = new e.e(s, c(g));
                            break;
                        }
                        throw new IllegalArgumentException(f.l((Object)s2, "Unsupported message type "));
                    }
                    case 3414: {
                        if (s2.equals("ka")) {
                            e = new e.d();
                            break;
                        }
                        throw new IllegalArgumentException(f.l((Object)s2, "Unsupported message type "));
                    }
                    case -599445191: {
                        if (s2.equals("complete")) {
                            e = new e.a(s);
                            break;
                        }
                        throw new IllegalArgumentException(f.l((Object)s2, "Unsupported message type "));
                    }
                }
                return e;
            }
            throw new IllegalArgumentException(f.l((Object)s2, "Unsupported message type "));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public static void e(final b8.c c, final k7.c c2) {
        if (c instanceof b8.c.a) {
            final b8.c.a a = (b8.c.a)c;
            c2.s("type");
            c2.A("connection_init");
            if (a.a.isEmpty() ^ true) {
                c2.s("payload");
                k7.f.a(a.a, c2);
            }
        }
        else if (c instanceof b8.c.b) {
            final b8.c.b b = (b8.c.b)c;
            c2.s("id");
            c2.A(b.a);
            c2.s("type");
            c2.A("start");
            c2.s("payload");
            c2.h();
            c2.s("variables");
            c2.F(((k)b.b).f().a(b.c));
            c2.s("operationName");
            c2.A(((k)b.b).name().name());
            if (!b.d || b.e) {
                c2.s("query");
                c2.A(((k)b.b).b());
            }
            if (b.d) {
                c2.s("extensions");
                c2.h();
                c2.s("persistedQuery");
                c2.h();
                c2.s("version");
                c2.H();
                c2.s("sha256Hash");
                c2.A(((k)b.b).e());
                c2.r();
                c2.r();
            }
            c2.r();
        }
        else if (c instanceof b8.c.c) {
            final b8.c.c c3 = (b8.c.c)c;
            c2.s("id");
            c2.A(c3.a);
            c2.s("type");
            c2.A("stop");
        }
        else if (c instanceof b8.c.d) {
            final b8.c.d d = (b8.c.d)c;
            c2.s("type");
            c2.A("connection_terminate");
        }
    }
    
    public final void a(final b8.c c, rk2.c c2) throws IOException {
        c2 = (rk2.c)new k7.c(c2);
        try {
            ((k7.c)c2).h();
            e(c, (k7.c)c2);
            ((k7.c)c2).r();
            final j a = j.a;
            r.o((Closeable)c2, (Throwable)null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                r.o((Closeable)c2, t);
            }
        }
    }
    
    public final e b(rk2.c c) throws IOException {
        try {
            final b0 peek = c.peek();
            try {
                final k7.a a = new k7.a((rk2.f)peek);
                try {
                    final Object d = d(a);
                    r.o((Closeable)a, (Throwable)null);
                    r.o((Closeable)peek, (Throwable)null);
                    c = (rk2.c)d;
                }
                finally {
                    try {}
                    finally {
                        final Throwable t;
                        r.o((Closeable)a, t);
                    }
                }
            }
            finally {
                try {}
                finally {
                    final Throwable t2;
                    r.o((Closeable)peek, t2);
                }
            }
        }
        catch (final Exception ex) {
            c = (rk2.c)new e.g(c.F());
        }
        catch (final IOException ex2) {
            throw ex2;
        }
        catch (final JsonEncodingException ex3) {
            c = (rk2.c)new e.g(c.F());
        }
        return (e)c;
    }
}
