// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.Response$Builder;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Request$Builder;
import okhttp3.Request;
import okhttp3.ResponseBody;
import fk2.f;
import fk2.u;
import fk2.g0;
import fk2.o;
import xi2.j;
import okhttp3.internal._UtilJvmKt;
import okhttp3.Response;
import okhttp3.Interceptor$Chain;
import java.util.Iterator;
import cg.d;
import okhttp3.Cookie;
import java.util.List;
import ng2.e;
import okhttp3.CookieJar;
import kotlin.Metadata;
import okhttp3.Interceptor;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e" }, d2 = { "Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "cookieJar", "Lokhttp3/CookieJar;", "(Lokhttp3/CookieJar;)V", "cookieHeader", "", "cookies", "", "Lokhttp3/Cookie;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class BridgeInterceptor implements Interceptor
{
    private final CookieJar cookieJar;
    
    public BridgeInterceptor(final CookieJar cookieJar) {
        e.f((Object)cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }
    
    private final String cookieHeader(final List<Cookie> list) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<Object> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Cookie next = iterator.next();
            if (n < 0) {
                d.a4();
                throw null;
            }
            final Cookie cookie = next;
            if (n > 0) {
                sb.append("; ");
            }
            sb.append(cookie.name());
            sb.append('=');
            sb.append(cookie.value());
            ++n;
        }
        final String string = sb.toString();
        e.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public Response intercept(final Interceptor$Chain interceptor$Chain) throws IOException {
        e.f((Object)interceptor$Chain, "chain");
        final Request request = interceptor$Chain.request();
        final Request$Builder builder = request.newBuilder();
        final RequestBody body = request.body();
        if (body != null) {
            final MediaType contentType = body.contentType();
            if (contentType != null) {
                builder.header("Content-Type", contentType.toString());
            }
            final long contentLength = body.contentLength();
            if (contentLength != -1L) {
                builder.header("Content-Length", String.valueOf(contentLength));
                builder.removeHeader("Transfer-Encoding");
            }
            else {
                builder.header("Transfer-Encoding", "chunked");
                builder.removeHeader("Content-Length");
            }
        }
        final String header = request.header("Host");
        final int n = 0;
        if (header == null) {
            builder.header("Host", _UtilJvmKt.toHostHeader$default(request.url(), false, 1, null));
        }
        if (request.header("Connection") == null) {
            builder.header("Connection", "Keep-Alive");
        }
        int n2 = n;
        if (request.header("Accept-Encoding") == null) {
            n2 = n;
            if (request.header("Range") == null) {
                builder.header("Accept-Encoding", "gzip");
                n2 = 1;
            }
        }
        final List loadForRequest = this.cookieJar.loadForRequest(request.url());
        if (loadForRequest.isEmpty() ^ true) {
            builder.header("Cookie", this.cookieHeader(loadForRequest));
        }
        if (request.header("User-Agent") == null) {
            builder.header("User-Agent", "okhttp/5.0.0-alpha.6");
        }
        final Request build = builder.build();
        final Response proceed = interceptor$Chain.proceed(build);
        HttpHeaders.receiveHeaders(this.cookieJar, build.url(), proceed.headers());
        final Response$Builder request2 = proceed.newBuilder().request(build);
        if (n2 != 0 && j.z0("gzip", Response.header$default(proceed, "Content-Encoding", (String)null, 2, (Object)null), true) && HttpHeaders.promisesBody(proceed)) {
            final ResponseBody body2 = proceed.body();
            if (body2 != null) {
                final o o = new o((g0)body2.source());
                request2.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
                request2.body((ResponseBody)new RealResponseBody(Response.header$default(proceed, "Content-Type", (String)null, 2, (Object)null), -1L, (f)u.b((g0)o)));
            }
        }
        return request2.build();
    }
}
