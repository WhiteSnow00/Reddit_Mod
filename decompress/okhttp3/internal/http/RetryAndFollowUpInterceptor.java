// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http;

import okhttp3.Response$Builder;
import java.util.List;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import okhttp3.internal.http2.ConnectionShutdownException;
import java.io.Closeable;
import okhttp3.internal._UtilCommonKt;
import okhttp3.ResponseBody;
import kotlin.collections.EmptyList;
import okhttp3.Interceptor$Chain;
import kotlin.text.Regex;
import java.io.FileNotFoundException;
import okhttp3.internal.connection.RealCall;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import java.net.SocketTimeoutException;
import java.io.InterruptedIOException;
import java.io.IOException;
import okhttp3.Route;
import okhttp3.internal.connection.RealConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import okhttp3.internal.connection.Exchange;
import okhttp3.Request$Builder;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilJvmKt;
import okhttp3.RequestBody;
import okhttp3.Request;
import okhttp3.Response;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import kotlin.Metadata;
import okhttp3.Interceptor;

@Metadata(d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f" }, d2 = { "Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "buildRedirectRequest", "Lokhttp3/Request;", "userResponse", "Lokhttp3/Response;", "method", "", "followUpRequest", "exchange", "Lokhttp3/internal/connection/Exchange;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "isRecoverable", "", "e", "Ljava/io/IOException;", "requestSendStarted", "recover", "call", "Lokhttp3/internal/connection/RealCall;", "userRequest", "requestIsOneShot", "retryAfter", "", "defaultDelay", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class RetryAndFollowUpInterceptor implements Interceptor
{
    public static final Companion Companion;
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;
    
    static {
        Companion = new Companion(null);
    }
    
    public RetryAndFollowUpInterceptor(final OkHttpClient client) {
        e.f((Object)client, "client");
        this.client = client;
    }
    
    private final Request buildRedirectRequest(final Response response, final String s) {
        final boolean followRedirects = this.client.followRedirects();
        RequestBody body = null;
        if (!followRedirects) {
            return null;
        }
        final String header$default = Response.header$default(response, "Location", (String)null, 2, (Object)null);
        if (header$default == null) {
            return null;
        }
        final HttpUrl resolve = response.request().url().resolve(header$default);
        if (resolve == null) {
            return null;
        }
        if (!e.a((Object)resolve.scheme(), (Object)response.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        final Request$Builder builder = response.request().newBuilder();
        if (HttpMethod.permitsRequestBody(s)) {
            final int code = response.code();
            final HttpMethod instance = HttpMethod.INSTANCE;
            final boolean b = instance.redirectsWithBody(s) || code == 308 || code == 307;
            if (instance.redirectsToGet(s) && code != 308 && code != 307) {
                builder.method("GET", (RequestBody)null);
            }
            else {
                if (b) {
                    body = response.request().body();
                }
                builder.method(s, body);
            }
            if (!b) {
                builder.removeHeader("Transfer-Encoding");
                builder.removeHeader("Content-Length");
                builder.removeHeader("Content-Type");
            }
        }
        if (!_UtilJvmKt.canReuseConnectionFor(response.request().url(), resolve)) {
            builder.removeHeader("Authorization");
        }
        return builder.url(resolve).build();
    }
    
    private final Request followUpRequest(final Response response, final Exchange exchange) throws IOException {
        Route route = null;
        Label_0031: {
            if (exchange != null) {
                final RealConnection connection$okhttp = exchange.getConnection$okhttp();
                if (connection$okhttp != null) {
                    route = connection$okhttp.route();
                    break Label_0031;
                }
            }
            route = null;
        }
        final int code = response.code();
        final String method = response.request().method();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.client.authenticator().authenticate(route, response);
            }
            if (code != 421) {
                if (code != 503) {
                    if (code != 407) {
                        if (code != 408) {
                            switch (code) {
                                default: {
                                    return null;
                                }
                                case 300:
                                case 301:
                                case 302:
                                case 303: {
                                    break;
                                }
                            }
                        }
                        else {
                            if (!this.client.retryOnConnectionFailure()) {
                                return null;
                            }
                            final RequestBody body = response.request().body();
                            if (body != null && body.isOneShot()) {
                                return null;
                            }
                            final Response priorResponse = response.priorResponse();
                            if (priorResponse != null && priorResponse.code() == 408) {
                                return null;
                            }
                            if (this.retryAfter(response, 0) > 0) {
                                return null;
                            }
                            return response.request();
                        }
                    }
                    else {
                        e.c((Object)route);
                        if (route.proxy().type() == Proxy.Type.HTTP) {
                            return this.client.proxyAuthenticator().authenticate(route, response);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                }
                else {
                    final Response priorResponse2 = response.priorResponse();
                    if (priorResponse2 != null && priorResponse2.code() == 503) {
                        return null;
                    }
                    if (this.retryAfter(response, Integer.MAX_VALUE) == 0) {
                        return response.request();
                    }
                    return null;
                }
            }
            else {
                final RequestBody body2 = response.request().body();
                if (body2 != null && body2.isOneShot()) {
                    return null;
                }
                if (exchange != null && exchange.isCoalescedConnection$okhttp()) {
                    exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                    return response.request();
                }
                return null;
            }
        }
        return this.buildRedirectRequest(response, method);
    }
    
    private final boolean isRecoverable(final IOException ex, final boolean b) {
        final boolean b2 = ex instanceof ProtocolException;
        final boolean b3 = false;
        if (b2) {
            return false;
        }
        if (ex instanceof InterruptedIOException) {
            boolean b4 = b3;
            if (ex instanceof SocketTimeoutException) {
                b4 = b3;
                if (!b) {
                    b4 = true;
                }
            }
            return b4;
        }
        return (!(ex instanceof SSLHandshakeException) || !(ex.getCause() instanceof CertificateException)) && !(ex instanceof SSLPeerUnverifiedException);
    }
    
    private final boolean recover(final IOException ex, final RealCall realCall, final Request request, final boolean b) {
        return this.client.retryOnConnectionFailure() && (!b || !this.requestIsOneShot(ex, request)) && this.isRecoverable(ex, b) && realCall.retryAfterFailure();
    }
    
    private final boolean requestIsOneShot(final IOException ex, final Request request) {
        final RequestBody body = request.body();
        return (body != null && body.isOneShot()) || ex instanceof FileNotFoundException;
    }
    
    private final int retryAfter(final Response response, final int n) {
        final String header$default = Response.header$default(response, "Retry-After", (String)null, 2, (Object)null);
        if (header$default == null) {
            return n;
        }
        if (new Regex("\\d+").matches(header$default)) {
            final Integer value = Integer.valueOf(header$default);
            e.e((Object)value, "valueOf(header)");
            return value.intValue();
        }
        return Integer.MAX_VALUE;
    }
    
    public Response intercept(Interceptor$Chain instance) throws IOException {
        e.f((Object)instance, "chain");
        final RealInterceptorChain realInterceptorChain = (RealInterceptorChain)instance;
        Object o = realInterceptorChain.getRequest$okhttp();
        final RealCall call$okhttp = realInterceptorChain.getCall$okhttp();
        instance = (Interceptor$Chain)EmptyList.INSTANCE;
        boolean b = true;
        Response build = null;
        int n = 0;
        while (true) {
            call$okhttp.enterNetworkInterceptorExchange((Request)o, b, realInterceptorChain);
            try {
                b = call$okhttp.isCanceled();
                if (!b) {
                    try {
                        o = realInterceptorChain.proceed((Request)o).newBuilder().request((Request)o);
                        if (build != null) {
                            ((Response$Builder)o).priorResponse(build.newBuilder().body((ResponseBody)null).build());
                        }
                        build = ((Response$Builder)o).build();
                        final Exchange interceptorScopedExchange$okhttp = call$okhttp.getInterceptorScopedExchange$okhttp();
                        o = this.followUpRequest(build, interceptorScopedExchange$okhttp);
                        if (o == null) {
                            if (interceptorScopedExchange$okhttp != null && interceptorScopedExchange$okhttp.isDuplex$okhttp()) {
                                call$okhttp.timeoutEarlyExit();
                            }
                            call$okhttp.exitNetworkInterceptorExchange$okhttp(false);
                            return build;
                        }
                        final RequestBody body = ((Request)o).body();
                        if (body != null) {
                            b = body.isOneShot();
                            if (b) {
                                call$okhttp.exitNetworkInterceptorExchange$okhttp(false);
                                return build;
                            }
                        }
                        final ResponseBody body2 = build.body();
                        if (body2 != null) {
                            _UtilCommonKt.closeQuietly((Closeable)body2);
                        }
                        if (++n <= 20) {
                            call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                            b = true;
                            continue;
                        }
                        instance = (Interceptor$Chain)new ProtocolException(e.l((Object)n, "Too many follow-up requests: "));
                        throw instance;
                    }
                    catch (final IOException ex) {
                        b = !(ex instanceof ConnectionShutdownException);
                        if (this.recover(ex, call$okhttp, (Request)o, b)) {
                            CollectionsKt___CollectionsKt.p5((Collection)instance, (Object)ex);
                            call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                            b = false;
                            continue;
                        }
                        throw _UtilCommonKt.withSuppressed(ex, (List<? extends Exception>)instance);
                    }
                }
                throw new IOException("Canceled");
            }
            finally {
                call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
            }
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "()V", "MAX_FOLLOW_UPS", "", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
