// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.logging;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
import java.io.IOException;
import fk2.f;
import okhttp3.ResponseBody;
import okhttp3.MediaType;
import okhttp3.Connection;
import okhttp3.RequestBody;
import okhttp3.Request;
import okhttp3.internal.http.HttpHeaders;
import java.util.concurrent.TimeUnit;
import okhttp3.logging.internal.Utf8Kt;
import java.nio.charset.Charset;
import okhttp3.internal.Internal;
import java.io.Closeable;
import zd.b;
import fk2.g0;
import fk2.o;
import fk2.c;
import okhttp3.Response;
import okhttp3.Interceptor$Chain;
import xi2.j;
import okhttp3.Headers;
import kotlin.collections.EmptySet;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.Interceptor;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\"#B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u000e\u0010\u001f¨\u0006$" }, d2 = { "Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Headers;", "headers", "", "i", "Lcg2/j;", "logHeader", "", "bodyHasUnknownEncoding", "", "name", "redactHeader", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "setLevel", "-deprecated_level", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "headersToRedact", "Ljava/util/Set;", "<set-?>", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Level", "Logger", "logging-interceptor" }, k = 1, mv = { 1, 6, 0 })
public final class HttpLoggingInterceptor implements Interceptor
{
    private volatile Set<String> headersToRedact;
    private volatile HttpLoggingInterceptor.HttpLoggingInterceptor$Level level;
    private final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger;
    
    public HttpLoggingInterceptor() {
        this(null, 1, null);
    }
    
    public HttpLoggingInterceptor(final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger) {
        e.f((Object)logger, "logger");
        this.logger = logger;
        this.headersToRedact = (Set<String>)EmptySet.INSTANCE;
        this.level = HttpLoggingInterceptor.HttpLoggingInterceptor$Level.NONE;
    }
    
    public HttpLoggingInterceptor(HttpLoggingInterceptor.HttpLoggingInterceptor$Logger default1, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            default1 = HttpLoggingInterceptor.HttpLoggingInterceptor$Logger.DEFAULT;
        }
        this(default1);
    }
    
    private final boolean bodyHasUnknownEncoding(final Headers headers) {
        final String value = headers.get("Content-Encoding");
        final boolean b = false;
        if (value == null) {
            return false;
        }
        boolean b2 = b;
        if (!j.z0(value, "identity", true)) {
            b2 = b;
            if (!j.z0(value, "gzip", true)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    private final void logHeader(final Headers headers, final int n) {
        String value;
        if (this.headersToRedact.contains(headers.name(n))) {
            value = "\u2588\u2588";
        }
        else {
            value = headers.value(n);
        }
        final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger = this.logger;
        final StringBuilder sb = new StringBuilder();
        sb.append(headers.name(n));
        sb.append(": ");
        sb.append(value);
        logger.log(sb.toString());
    }
    
    public final HttpLoggingInterceptor.HttpLoggingInterceptor$Level -deprecated_level() {
        return this.level;
    }
    
    public final HttpLoggingInterceptor.HttpLoggingInterceptor$Level getLevel() {
        return this.level;
    }
    
    public Response intercept(final Interceptor$Chain interceptor$Chain) throws IOException {
        e.f((Object)interceptor$Chain, "chain");
        final HttpLoggingInterceptor.HttpLoggingInterceptor$Level level = this.level;
        final Request request = interceptor$Chain.request();
        if (level == HttpLoggingInterceptor.HttpLoggingInterceptor$Level.NONE) {
            return interceptor$Chain.proceed(request);
        }
        final boolean b = level == HttpLoggingInterceptor.HttpLoggingInterceptor$Level.BODY;
        final boolean b2 = b || level == HttpLoggingInterceptor.HttpLoggingInterceptor$Level.HEADERS;
        final RequestBody body = request.body();
        final Connection connection = interceptor$Chain.connection();
        final StringBuilder t = a.t("--> ");
        t.append(request.method());
        t.append(' ');
        t.append(request.url());
        String l;
        if (connection != null) {
            l = e.l((Object)connection.protocol(), " ");
        }
        else {
            l = "";
        }
        t.append(l);
        String s2;
        final String s = s2 = t.toString();
        if (!b2) {
            s2 = s;
            if (body != null) {
                final StringBuilder q = android.support.v4.media.a.q(s, " (");
                q.append(body.contentLength());
                q.append("-byte body)");
                s2 = q.toString();
            }
        }
        this.logger.log(s2);
        if (b2) {
            final Headers headers = request.headers();
            if (body != null) {
                final MediaType contentType = body.contentType();
                if (contentType != null) {
                    if (headers.get("Content-Type") == null) {
                        this.logger.log(e.l((Object)contentType, "Content-Type: "));
                    }
                }
                if (body.contentLength() != -1L && headers.get("Content-Length") == null) {
                    this.logger.log(e.l((Object)body.contentLength(), "Content-Length: "));
                }
            }
            for (int size = headers.size(), i = 0; i < size; ++i) {
                this.logHeader(headers, i);
            }
            if (b && body != null) {
                if (this.bodyHasUnknownEncoding(request.headers())) {
                    final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger = this.logger;
                    final StringBuilder t2 = a.t("--> END ");
                    t2.append(request.method());
                    t2.append(" (encoded body omitted)");
                    logger.log(t2.toString());
                }
                else if (body.isDuplex()) {
                    final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger2 = this.logger;
                    final StringBuilder t3 = a.t("--> END ");
                    t3.append(request.method());
                    t3.append(" (duplex request body omitted)");
                    logger2.log(t3.toString());
                }
                else if (body.isOneShot()) {
                    final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger3 = this.logger;
                    final StringBuilder t4 = a.t("--> END ");
                    t4.append(request.method());
                    t4.append(" (one-shot body omitted)");
                    logger3.log(t4.toString());
                }
                else {
                    c c = new c();
                    body.writeTo((fk2.e)c);
                    final Throwable t5;
                    Label_0646: {
                        if (j.z0("gzip", headers.get("Content-Encoding"), true)) {
                            c.g;
                            final o o = new o((g0)c);
                            try {
                                c = new c();
                                c.T1((g0)o);
                                zd.b.u((Closeable)o, null);
                                break Label_0646;
                            }
                            finally {
                                try {}
                                finally {
                                    zd.b.u((Closeable)o, (Throwable)interceptor$Chain);
                                }
                            }
                        }
                        t5 = null;
                    }
                    final Charset charset$default = Internal.charset$default(body.contentType(), (Charset)null, 1, (Object)null);
                    this.logger.log("");
                    if (!Utf8Kt.isProbablyUtf8(c)) {
                        final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger4 = this.logger;
                        final StringBuilder t6 = a.t("--> END ");
                        t6.append(request.method());
                        t6.append(" (binary ");
                        t6.append(body.contentLength());
                        t6.append("-byte body omitted)");
                        logger4.log(t6.toString());
                    }
                    else if (t5 != null) {
                        final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger5 = this.logger;
                        final StringBuilder t7 = a.t("--> END ");
                        t7.append(request.method());
                        t7.append(" (");
                        t7.append(c.g);
                        t7.append("-byte, ");
                        t7.append(t5);
                        t7.append("-gzipped-byte body)");
                        logger5.log(t7.toString());
                    }
                    else {
                        this.logger.log(c.V0(charset$default));
                        final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger6 = this.logger;
                        final StringBuilder t8 = a.t("--> END ");
                        t8.append(request.method());
                        t8.append(" (");
                        t8.append(body.contentLength());
                        t8.append("-byte body)");
                        logger6.log(t8.toString());
                    }
                }
            }
            else {
                this.logger.log(e.l((Object)request.method(), "--> END "));
            }
        }
        final long nanoTime = System.nanoTime();
        try {
            final Response proceed = interceptor$Chain.proceed(request);
            final long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            final ResponseBody body2 = proceed.body();
            e.c((Object)body2);
            final long contentLength = body2.contentLength();
            String string;
            if (contentLength != -1L) {
                final StringBuilder sb = new StringBuilder();
                sb.append(contentLength);
                sb.append("-byte");
                string = sb.toString();
            }
            else {
                string = "unknown-length";
            }
            final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger7 = this.logger;
            final StringBuilder t9 = a.t("<-- ");
            t9.append(proceed.code());
            String string2;
            if (proceed.message().length() == 0) {
                string2 = "";
            }
            else {
                final String message = proceed.message();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(' ');
                sb2.append(message);
                string2 = sb2.toString();
            }
            t9.append(string2);
            t9.append(' ');
            t9.append(proceed.request().url());
            t9.append(" (");
            t9.append(millis);
            t9.append("ms");
            String n;
            if (!b2) {
                n = a.n(", ", string, " body");
            }
            else {
                n = "";
            }
            t9.append(n);
            t9.append(')');
            logger7.log(t9.toString());
            if (b2) {
                final Headers headers2 = proceed.headers();
                for (int size2 = headers2.size(), j = 0; j < size2; ++j) {
                    this.logHeader(headers2, j);
                }
                if (b && HttpHeaders.promisesBody(proceed)) {
                    if (this.bodyHasUnknownEncoding(proceed.headers())) {
                        this.logger.log("<-- END HTTP (encoded body omitted)");
                    }
                    else {
                        final f source = body2.source();
                        source.request(Long.MAX_VALUE);
                        final c buffer = source.getBuffer();
                        final Throwable t10;
                        Label_1416: {
                            if (j.z0("gzip", headers2.get("Content-Encoding"), true)) {
                                buffer.g;
                                final o o2 = new o((g0)buffer.h());
                                try {
                                    new c().T1((g0)o2);
                                    zd.b.u((Closeable)o2, null);
                                    break Label_1416;
                                }
                                finally {
                                    try {}
                                    finally {
                                        zd.b.u((Closeable)o2, t10);
                                    }
                                }
                            }
                            t10 = null;
                        }
                        final Charset charset$default2 = Internal.charset$default(body2.contentType(), (Charset)null, 1, (Object)null);
                        if (!Utf8Kt.isProbablyUtf8(buffer)) {
                            this.logger.log("");
                            final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger8 = this.logger;
                            final StringBuilder t11 = a.t("<-- END HTTP (binary ");
                            t11.append(buffer.g);
                            t11.append("-byte body omitted)");
                            logger8.log(t11.toString());
                            return proceed;
                        }
                        if (contentLength != 0L) {
                            this.logger.log("");
                            this.logger.log(buffer.h().V0(charset$default2));
                        }
                        if (t10 != null) {
                            final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger9 = this.logger;
                            final StringBuilder t12 = a.t("<-- END HTTP (");
                            t12.append(buffer.g);
                            t12.append("-byte, ");
                            t12.append(t10);
                            t12.append("-gzipped-byte body)");
                            logger9.log(t12.toString());
                        }
                        else {
                            final HttpLoggingInterceptor.HttpLoggingInterceptor$Logger logger10 = this.logger;
                            final StringBuilder t13 = a.t("<-- END HTTP (");
                            t13.append(buffer.g);
                            t13.append("-byte body)");
                            logger10.log(t13.toString());
                        }
                    }
                }
                else {
                    this.logger.log("<-- END HTTP");
                }
            }
            return proceed;
        }
        catch (final Exception ex) {
            this.logger.log(e.l((Object)ex, "<-- HTTP FAILED: "));
            throw ex;
        }
    }
    
    public final void level(final HttpLoggingInterceptor.HttpLoggingInterceptor$Level level) {
        e.f((Object)level, "<set-?>");
        this.level = level;
    }
    
    public final void redactHeader(final String s) {
        e.f((Object)s, "name");
        final TreeSet headersToRedact = new TreeSet(j.A0());
        dg2.o.B4((Iterable)this.headersToRedact, (Collection)headersToRedact);
        headersToRedact.add(s);
        this.headersToRedact = headersToRedact;
    }
    
    public final HttpLoggingInterceptor setLevel(final HttpLoggingInterceptor.HttpLoggingInterceptor$Level httpLoggingInterceptor$Level) {
        e.f((Object)httpLoggingInterceptor$Level, "level");
        this.level(httpLoggingInterceptor$Level);
        return this;
    }
}
