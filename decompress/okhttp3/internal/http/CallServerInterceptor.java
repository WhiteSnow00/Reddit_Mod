// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http;

import okhttp3.ResponseBody;
import okhttp3.Response$Builder;
import fk2.a0;
import okhttp3.RequestBody;
import okhttp3.Request;
import okhttp3.internal.connection.Exchange;
import xd.a;
import java.net.ProtocolException;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http2.ConnectionShutdownException;
import fk2.u;
import java.io.IOException;
import xi2.j;
import ng2.e;
import okhttp3.Response;
import okhttp3.Interceptor$Chain;
import kotlin.Metadata;
import okhttp3.Interceptor;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t" }, d2 = { "Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class CallServerInterceptor implements Interceptor
{
    private final boolean forWebSocket;
    
    public CallServerInterceptor(final boolean forWebSocket) {
        this.forWebSocket = forWebSocket;
    }
    
    public Response intercept(final Interceptor$Chain interceptor$Chain) throws IOException {
        e.f((Object)interceptor$Chain, "chain");
        final RealInterceptorChain realInterceptorChain = (RealInterceptorChain)interceptor$Chain;
        final Exchange exchange$okhttp = realInterceptorChain.getExchange$okhttp();
        e.c((Object)exchange$okhttp);
        final Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        final RequestBody body = request$okhttp.body();
        final long currentTimeMillis = System.currentTimeMillis();
        final Object o = null;
        Object responseHeaders = null;
        Object o2 = null;
        int n3 = 0;
        final IOException ex;
        Label_0366: {
            Label_0346: {
                try {
                    exchange$okhttp.writeRequestHeaders(request$okhttp);
                    Label_0283: {
                        if (!HttpMethod.permitsRequestBody(request$okhttp.method()) || body == null) {
                            break Label_0283;
                        }
                        int n = 0;
                        Label_0114: {
                            if (j.z0("100-continue", request$okhttp.header("Expect"), true)) {
                                exchange$okhttp.flushRequest();
                                responseHeaders = exchange$okhttp.readResponseHeaders(true);
                                try {
                                    exchange$okhttp.responseHeadersStart();
                                    n = 0;
                                    break Label_0114;
                                }
                                catch (final IOException ex) {
                                    break Label_0346;
                                }
                            }
                            responseHeaders = null;
                            n = 1;
                        }
                        Label_0228: {
                            if (responseHeaders != null) {
                                break Label_0228;
                            }
                            o2 = responseHeaders;
                            int n2 = n;
                            try {
                                Object o3;
                                if (body.isDuplex()) {
                                    o2 = responseHeaders;
                                    n2 = n;
                                    exchange$okhttp.flushRequest();
                                    o2 = responseHeaders;
                                    n2 = n;
                                    body.writeTo((fk2.e)u.a(exchange$okhttp.createRequestBody(request$okhttp, true)));
                                    o3 = responseHeaders;
                                    n3 = n;
                                }
                                else {
                                    o2 = responseHeaders;
                                    n2 = n;
                                    final a0 a = u.a(exchange$okhttp.createRequestBody(request$okhttp, false));
                                    o2 = responseHeaders;
                                    n2 = n;
                                    body.writeTo((fk2.e)a);
                                    o2 = responseHeaders;
                                    n2 = n;
                                    a.close();
                                    o3 = responseHeaders;
                                    n3 = n;
                                }
                                while (true) {
                                    Label_0322: {
                                        if (body != null) {
                                            o2 = o3;
                                            n2 = n3;
                                            if (body.isDuplex()) {
                                                break Label_0322;
                                            }
                                        }
                                        o2 = o3;
                                        n2 = n3;
                                        exchange$okhttp.finishRequest();
                                    }
                                    o2 = null;
                                    responseHeaders = o3;
                                    break Label_0366;
                                    o2 = responseHeaders;
                                    n2 = n;
                                    exchange$okhttp.noRequestBody();
                                    o3 = responseHeaders;
                                    n3 = n;
                                    o2 = responseHeaders;
                                    n2 = n;
                                    iftrue(Label_0292:)(exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp());
                                    o2 = responseHeaders;
                                    n2 = n;
                                    exchange$okhttp.noNewExchangesOnConnection();
                                    o3 = responseHeaders;
                                    n3 = n;
                                    continue;
                                }
                                exchange$okhttp.noRequestBody();
                                o3 = null;
                                n3 = 1;
                            }
                            catch (final IOException ex) {
                                responseHeaders = o2;
                                n3 = n2;
                            }
                        }
                    }
                }
                catch (final IOException ex) {
                    responseHeaders = null;
                }
            }
            n3 = 1;
            if (ex instanceof ConnectionShutdownException) {
                throw ex;
            }
            if (!exchange$okhttp.getHasFailure$okhttp()) {
                throw ex;
            }
            o2 = ex;
        }
        Object o4 = responseHeaders;
        int n4 = n3;
        Label_0408: {
            if (responseHeaders != null) {
                break Label_0408;
            }
            try {
                final Response$Builder responseHeaders2 = exchange$okhttp.readResponseHeaders(false);
                e.c((Object)responseHeaders2);
                o4 = responseHeaders2;
                n4 = n3;
                if (n3 != 0) {
                    exchange$okhttp.responseHeadersStart();
                    n4 = 0;
                    o4 = responseHeaders2;
                }
                Response response = ((Response$Builder)o4).request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                int n5;
                if ((n5 = response.code()) == 100) {
                    final Response$Builder responseHeaders3 = exchange$okhttp.readResponseHeaders(false);
                    e.c((Object)responseHeaders3);
                    if (n4 != 0) {
                        exchange$okhttp.responseHeadersStart();
                    }
                    response = responseHeaders3.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                    n5 = response.code();
                }
                exchange$okhttp.responseHeadersEnd(response);
                Response response2;
                if (this.forWebSocket && n5 == 101) {
                    response2 = response.newBuilder().body(_UtilJvmKt.EMPTY_RESPONSE).build();
                }
                else {
                    response2 = response.newBuilder().body(exchange$okhttp.openResponseBody(response)).build();
                }
                if (j.z0("close", response2.request().header("Connection"), true) || j.z0("close", Response.header$default(response2, "Connection", (String)null, 2, (Object)null), true)) {
                    exchange$okhttp.noNewExchangesOnConnection();
                }
                if (n5 == 204 || n5 == 205) {
                    final ResponseBody body2 = response2.body();
                    long contentLength;
                    if (body2 == null) {
                        contentLength = -1L;
                    }
                    else {
                        contentLength = body2.contentLength();
                    }
                    if (contentLength > 0L) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("HTTP ");
                        sb.append(n5);
                        sb.append(" had non-zero Content-Length: ");
                        final ResponseBody body3 = response2.body();
                        Object value;
                        if (body3 == null) {
                            value = o;
                        }
                        else {
                            value = body3.contentLength();
                        }
                        sb.append(value);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return response2;
            }
            catch (final IOException ex2) {
                if (o2 != null) {
                    a.t((Throwable)o2, (Throwable)ex2);
                    throw o2;
                }
                throw ex2;
            }
        }
        throw ex;
    }
}
