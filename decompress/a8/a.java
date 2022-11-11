// 
// Decompiled by Procyon v0.6.0
// 

package a8;

import h7.k;
import jk2.b0;
import com.apollographql.apollo.api.internal.json.JsonEncodingException;
import java.io.IOException;
import java.io.Closeable;
import lw0.b;
import hg2.j;
import k7.f;
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
        Map<?, ? extends Map<Object, Object>> v0 = (Map<?, ? extends Map<Object, Object>>)unmodifiableMap;
        if (unmodifiableMap == null) {
            v0 = c.V0();
        }
        return v0;
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
                        throw new IllegalArgumentException(sg2.e.l((Object)s2, "Unsupported message type "));
                    }
                    case 1270515624: {
                        if (s2.equals("connection_ack")) {
                            e = new e.b();
                            break;
                        }
                        throw new IllegalArgumentException(sg2.e.l((Object)s2, "Unsupported message type "));
                    }
                    case 1198953831: {
                        if (s2.equals("connection_error")) {
                            e = new e.c(c(g));
                            break;
                        }
                        throw new IllegalArgumentException(sg2.e.l((Object)s2, "Unsupported message type "));
                    }
                    case 96784904: {
                        if (s2.equals("error")) {
                            e = new e.f(s, c(g));
                            break;
                        }
                        throw new IllegalArgumentException(sg2.e.l((Object)s2, "Unsupported message type "));
                    }
                    case 3076010: {
                        if (s2.equals("data")) {
                            e = new e.e(s, c(g));
                            break;
                        }
                        throw new IllegalArgumentException(sg2.e.l((Object)s2, "Unsupported message type "));
                    }
                    case 3414: {
                        if (s2.equals("ka")) {
                            e = new e.d();
                            break;
                        }
                        throw new IllegalArgumentException(sg2.e.l((Object)s2, "Unsupported message type "));
                    }
                    case -599445191: {
                        if (s2.equals("complete")) {
                            e = new e.a(s);
                            break;
                        }
                        throw new IllegalArgumentException(sg2.e.l((Object)s2, "Unsupported message type "));
                    }
                }
                return e;
            }
            throw new IllegalArgumentException(sg2.e.l((Object)s2, "Unsupported message type "));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public static void e(final a8.c c, final k7.c c2) {
        if (c instanceof a8.c.a) {
            final a8.c.a a = (a8.c.a)c;
            c2.s("type");
            c2.A("connection_init");
            if (a.a.isEmpty() ^ true) {
                c2.s("payload");
                f.a(a.a, (k7.d)c2);
            }
        }
        else if (c instanceof a8.c.b) {
            final a8.c.b b = (a8.c.b)c;
            c2.s("id");
            c2.A(b.a);
            c2.s("type");
            c2.A("start");
            c2.s("payload");
            c2.h();
            c2.s("variables");
            c2.G(((k.b)b.b.f()).a(b.c));
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
        else if (c instanceof a8.c.c) {
            final a8.c.c c3 = (a8.c.c)c;
            c2.s("id");
            c2.A(c3.a);
            c2.s("type");
            c2.A("stop");
        }
        else if (c instanceof a8.c.d) {
            final a8.c.d d = (a8.c.d)c;
            c2.s("type");
            c2.A("connection_terminate");
        }
    }
    
    @Override
    public final void a(final a8.c c, jk2.c c2) throws IOException {
        c2 = (jk2.c)new k7.c(c2);
        try {
            ((k7.c)c2).h();
            e(c, (k7.c)c2);
            ((k7.c)c2).r();
            final j a = j.a;
            b.X((Closeable)c2, (Throwable)null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                b.X((Closeable)c2, t);
            }
        }
    }
    
    @Override
    public final e b(jk2.c c) throws IOException {
        try {
            final b0 peek = c.peek();
            try {
                final k7.a a = new k7.a((jk2.f)peek);
                try {
                    final Object d = d(a);
                    b.X((Closeable)a, (Throwable)null);
                    b.X((Closeable)peek, (Throwable)null);
                    c = (jk2.c)d;
                }
                finally {
                    try {}
                    finally {
                        final Throwable t;
                        b.X((Closeable)a, t);
                    }
                }
            }
            finally {
                try {}
                finally {
                    final Throwable t2;
                    b.X((Closeable)peek, t2);
                }
            }
        }
        catch (final Exception ex) {
            c = (jk2.c)new e.g(c.E());
        }
        catch (final IOException ex2) {
            throw ex2;
        }
        catch (final JsonEncodingException ex3) {
            c = (jk2.c)new e.g(c.E());
        }
        return (e)c;
    }
}
