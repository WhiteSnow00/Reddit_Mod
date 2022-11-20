// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import fk2.e0;
import fk2.g0;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.CipherSuite;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.ws.RealWebSocket$Streams;
import java.net.SocketException;
import fk2.h0;
import okhttp3.internal.http1.Http1ExchangeCodec;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.CertificatePinner;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.Address;
import okhttp3.OkHttpClient;
import okhttp3.internal._UtilJvmKt;
import java.io.IOException;
import java.util.Iterator;
import java.net.Proxy;
import java.util.Collection;
import java.security.cert.X509Certificate;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.HttpUrl;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.concurrent.TaskRunner;
import fk2.f;
import fk2.e;
import okhttp3.Route;
import java.net.Socket;
import okhttp3.Protocol;
import okhttp3.Handshake;
import java.lang.ref.Reference;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.Connection;
import okhttp3.internal.http2.Http2Connection;

@Metadata(bv = {}, d1 = { "\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0080\u0001Bc\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010N\u001a\u00020M\u0012\u0006\u0010#\u001a\u00020\u000f\u0012\b\u0010U\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\u0010{\u001a\u0004\u0018\u00010z\u0012\b\u0010}\u001a\u0004\u0018\u00010|\u0012\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\b~\u0010\u007fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\u0004J'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b \u0010!J\b\u0010#\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020%H\u0016J\u000e\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016J\u0018\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016J\n\u00102\u001a\u0004\u0018\u000101H\u0016J'\u00108\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u000f2\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J\u001a\u0010<\u001a\u00020\u00042\u0006\u0010:\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u000104H\u0016J\b\u0010>\u001a\u00020=H\u0016J\b\u0010@\u001a\u00020?H\u0016J\b\u0010A\u001a\u00020\u0004H\u0002J\u0016\u0010C\u001a\u00020\u00112\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0010\u0010F\u001a\u00020\u00112\u0006\u0010E\u001a\u00020DH\u0002J\u0018\u0010G\u001a\u00020\u00112\u0006\u0010E\u001a\u00020D2\u0006\u00102\u001a\u000201H\u0002R\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010N\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010#\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010R\u001a\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010VR\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010WR\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\"\u0010\u0005\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0016\u0010\b\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010^R\"\u0010c\u001a\u00020Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010[\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010[R\u0016\u0010i\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010[R\u0016\u0010j\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010[R#\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090l0k8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\"\u0010r\u001a\u00020q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bx\u0010`¨\u0006\u0081\u0001" }, d2 = { "Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lcg2/j;", "noNewExchanges", "noCoalescedConnections$okhttp", "()V", "noCoalescedConnections", "incrementSuccessCount$okhttp", "incrementSuccessCount", "start", "Lokhttp3/Address;", "address", "", "Lokhttp3/Route;", "routes", "", "isEligible$okhttp", "(Lokhttp3/Address;Ljava/util/List;)Z", "isEligible", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "newCodec$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "newCodec", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams$okhttp", "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "route", "cancel", "Ljava/net/Socket;", "socket", "doExtensiveChecks", "isHealthy", "Lokhttp3/internal/http2/Http2Stream;", "stream", "onStream", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "Lokhttp3/Handshake;", "handshake", "failedRoute", "Ljava/io/IOException;", "failure", "connectFailed$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "connectFailed", "Lokhttp3/internal/connection/RealCall;", "call", "e", "trackFailure", "Lokhttp3/Protocol;", "protocol", "", "toString", "startHttp2", "candidates", "routeMatchesAny", "Lokhttp3/HttpUrl;", "url", "supportsUrl", "certificateSupportHost", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner", "()Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/Route;", "getRoute", "()Lokhttp3/Route;", "rawSocket", "Ljava/net/Socket;", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "", "pingIntervalMillis", "I", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "Z", "getNoNewExchanges", "()Z", "setNoNewExchanges", "(Z)V", "routeFailureCount", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "successCount", "refusedStreamCount", "allocationLimit", "", "Ljava/lang/ref/Reference;", "calls", "Ljava/util/List;", "getCalls", "()Ljava/util/List;", "", "idleAtNs", "J", "getIdleAtNs", "()J", "setIdleAtNs", "(J)V", "isMultiplexed$okhttp", "isMultiplexed", "Lfk2/f;", "source", "Lfk2/e;", "sink", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;Ljava/net/Socket;Ljava/net/Socket;Lokhttp3/Handshake;Lokhttp3/Protocol;Lfk2/f;Lfk2/e;I)V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class RealConnection extends Listener implements Connection, Carrier
{
    public static final Companion Companion;
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private int allocationLimit;
    private final List<Reference<RealCall>> calls;
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private final int pingIntervalMillis;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private e sink;
    private Socket socket;
    private f source;
    private int successCount;
    private final TaskRunner taskRunner;
    
    static {
        Companion = new Companion(null);
    }
    
    public RealConnection(final TaskRunner taskRunner, final RealConnectionPool connectionPool, final Route route, final Socket rawSocket, final Socket socket, final Handshake handshake, final Protocol protocol, final f source, final e sink, final int pingIntervalMillis) {
        ng2.e.f((Object)taskRunner, "taskRunner");
        ng2.e.f((Object)connectionPool, "connectionPool");
        ng2.e.f((Object)route, "route");
        this.taskRunner = taskRunner;
        this.connectionPool = connectionPool;
        this.route = route;
        this.rawSocket = rawSocket;
        this.socket = socket;
        this.handshake = handshake;
        this.protocol = protocol;
        this.source = source;
        this.sink = sink;
        this.pingIntervalMillis = pingIntervalMillis;
        this.allocationLimit = 1;
        this.calls = new ArrayList<Reference<RealCall>>();
        this.idleAtNs = Long.MAX_VALUE;
    }
    
    private final boolean certificateSupportHost(final HttpUrl httpUrl, final Handshake handshake) {
        final List peerCertificates = handshake.peerCertificates();
        final boolean empty = peerCertificates.isEmpty();
        boolean b = true;
        if (!(empty ^ true) || !OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate)peerCertificates.get(0))) {
            b = false;
        }
        return b;
    }
    
    private final boolean routeMatchesAny(final List<Route> list) {
        final boolean b = list instanceof Collection;
        boolean b2 = true;
        if (!b || !list.isEmpty()) {
            for (final Route route : list) {
                if (route.proxy().type() == Proxy.Type.DIRECT && this.getRoute().proxy().type() == Proxy.Type.DIRECT && ng2.e.a((Object)this.getRoute().socketAddress(), (Object)route.socketAddress())) {
                    return b2;
                }
            }
        }
        b2 = false;
        return b2;
    }
    
    private final void startHttp2() throws IOException {
        final Socket socket = this.socket;
        ng2.e.c((Object)socket);
        final f source = this.source;
        ng2.e.c((Object)source);
        final e sink = this.sink;
        ng2.e.c((Object)sink);
        socket.setSoTimeout(0);
        final Http2Connection build = new Http2Connection.Builder(true, this.taskRunner).socket(socket, this.getRoute().address().url().host(), source, sink).listener(this).pingIntervalMillis(this.pingIntervalMillis).build();
        this.http2Connection = build;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(build, false, 1, null);
    }
    
    private final boolean supportsUrl(final HttpUrl httpUrl) {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        final HttpUrl url = this.getRoute().address().url();
        final int port = httpUrl.port();
        final int port2 = url.port();
        final boolean b = false;
        if (port != port2) {
            return false;
        }
        if (ng2.e.a((Object)httpUrl.host(), (Object)url.host())) {
            return true;
        }
        boolean b2 = b;
        if (!this.noCoalescedConnections) {
            final Handshake handshake = this.handshake;
            b2 = b;
            if (handshake != null) {
                ng2.e.c((Object)handshake);
                b2 = b;
                if (this.certificateSupportHost(httpUrl, handshake)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public void cancel() {
        final Socket rawSocket = this.rawSocket;
        if (rawSocket != null) {
            _UtilJvmKt.closeQuietly(rawSocket);
        }
    }
    
    public final void connectFailed$okhttp(final OkHttpClient okHttpClient, final Route route, final IOException ex) {
        ng2.e.f((Object)okHttpClient, "client");
        ng2.e.f((Object)route, "failedRoute");
        ng2.e.f((Object)ex, "failure");
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            final Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), ex);
        }
        okHttpClient.getRouteDatabase$okhttp().failed(route);
    }
    
    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }
    
    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }
    
    public final long getIdleAtNs() {
        return this.idleAtNs;
    }
    
    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }
    
    public Route getRoute() {
        return this.route;
    }
    
    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }
    
    public final TaskRunner getTaskRunner() {
        return this.taskRunner;
    }
    
    public Handshake handshake() {
        return this.handshake;
    }
    
    public final void incrementSuccessCount$okhttp() {
        synchronized (this) {
            ++this.successCount;
        }
    }
    
    public final boolean isEligible$okhttp(final Address address, final List<Route> list) {
        ng2.e.f((Object)address, "address");
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        if (this.calls.size() >= this.allocationLimit) {
            return false;
        }
        if (this.noNewExchanges) {
            return false;
        }
        if (!this.getRoute().address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (ng2.e.a((Object)address.url().host(), (Object)this.route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null) {
            return false;
        }
        if (list == null) {
            return false;
        }
        if (!this.routeMatchesAny(list)) {
            return false;
        }
        if (address.hostnameVerifier() != OkHostnameVerifier.INSTANCE) {
            return false;
        }
        if (!this.supportsUrl(address.url())) {
            return false;
        }
        try {
            final CertificatePinner certificatePinner = address.certificatePinner();
            ng2.e.c((Object)certificatePinner);
            final String host = address.url().host();
            final Handshake handshake = this.handshake();
            ng2.e.c((Object)handshake);
            certificatePinner.check(host, handshake.peerCertificates());
            return true;
        }
        catch (final SSLPeerUnverifiedException ex) {
            return false;
        }
    }
    
    public final boolean isHealthy(final boolean b) {
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST NOT hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        final long nanoTime = System.nanoTime();
        final Socket rawSocket = this.rawSocket;
        ng2.e.c((Object)rawSocket);
        final Socket socket = this.socket;
        ng2.e.c((Object)socket);
        final f source = this.source;
        ng2.e.c((Object)source);
        if (!rawSocket.isClosed() && !socket.isClosed() && !socket.isInputShutdown()) {
            if (!socket.isOutputShutdown()) {
                final Http2Connection http2Connection = this.http2Connection;
                if (http2Connection != null) {
                    return http2Connection.isHealthy(nanoTime);
                }
                synchronized (this) {
                    final long idleAtNs = this.getIdleAtNs();
                    monitorexit(this);
                    return nanoTime - idleAtNs < 10000000000L || !b || _UtilJvmKt.isHealthy(socket, source);
                }
            }
        }
        return false;
    }
    
    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }
    
    public final ExchangeCodec newCodec$okhttp(final OkHttpClient okHttpClient, final RealInterceptorChain realInterceptorChain) throws SocketException {
        ng2.e.f((Object)okHttpClient, "client");
        ng2.e.f((Object)realInterceptorChain, "chain");
        final Socket socket = this.socket;
        ng2.e.c((Object)socket);
        final f source = this.source;
        ng2.e.c((Object)source);
        final e sink = this.sink;
        ng2.e.c((Object)sink);
        final Http2Connection http2Connection = this.http2Connection;
        ExchangeCodec exchangeCodec;
        if (http2Connection != null) {
            exchangeCodec = new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        else {
            socket.setSoTimeout(realInterceptorChain.readTimeoutMillis());
            final h0 timeout = ((g0)source).timeout();
            final long n = realInterceptorChain.getReadTimeoutMillis$okhttp();
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            timeout.timeout(n, milliseconds);
            ((e0)sink).timeout().timeout(realInterceptorChain.getWriteTimeoutMillis$okhttp(), milliseconds);
            exchangeCodec = new Http1ExchangeCodec(okHttpClient, this, source, sink);
        }
        return exchangeCodec;
    }
    
    public final RealWebSocket$Streams newWebSocketStreams$okhttp(final Exchange exchange) throws SocketException {
        ng2.e.f((Object)exchange, "exchange");
        final Socket socket = this.socket;
        ng2.e.c((Object)socket);
        final f source = this.source;
        ng2.e.c((Object)source);
        final e sink = this.sink;
        ng2.e.c((Object)sink);
        socket.setSoTimeout(0);
        this.noNewExchanges();
        return (RealWebSocket$Streams)new RealConnection$newWebSocketStreams.RealConnection$newWebSocketStreams$1(source, sink, exchange);
    }
    
    public final void noCoalescedConnections$okhttp() {
        synchronized (this) {
            this.noCoalescedConnections = true;
        }
    }
    
    public void noNewExchanges() {
        synchronized (this) {
            this.noNewExchanges = true;
        }
    }
    
    @Override
    public void onSettings(final Http2Connection http2Connection, final Settings settings) {
        synchronized (this) {
            ng2.e.f((Object)http2Connection, "connection");
            ng2.e.f((Object)settings, "settings");
            this.allocationLimit = settings.getMaxConcurrentStreams();
        }
    }
    
    @Override
    public void onStream(final Http2Stream http2Stream) throws IOException {
        ng2.e.f((Object)http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }
    
    public Protocol protocol() {
        final Protocol protocol = this.protocol;
        ng2.e.c((Object)protocol);
        return protocol;
    }
    
    public Route route() {
        return this.getRoute();
    }
    
    public final void setIdleAtNs(final long idleAtNs) {
        this.idleAtNs = idleAtNs;
    }
    
    public final void setNoNewExchanges(final boolean noNewExchanges) {
        this.noNewExchanges = noNewExchanges;
    }
    
    public final void setRouteFailureCount$okhttp(final int routeFailureCount) {
        this.routeFailureCount = routeFailureCount;
    }
    
    public Socket socket() {
        final Socket socket = this.socket;
        ng2.e.c((Object)socket);
        return socket;
    }
    
    public final void start() throws IOException {
        this.idleAtNs = System.nanoTime();
        final Protocol protocol = this.protocol;
        if (protocol == Protocol.HTTP_2 || protocol == Protocol.H2_PRIOR_KNOWLEDGE) {
            this.startHttp2();
        }
    }
    
    public String toString() {
        final StringBuilder t = a.t("Connection{");
        t.append(this.getRoute().address().url().host());
        t.append(':');
        t.append(this.getRoute().address().url().port());
        t.append(", proxy=");
        t.append(this.getRoute().proxy());
        t.append(" hostAddress=");
        t.append(this.getRoute().socketAddress());
        t.append(" cipherSuite=");
        final Handshake handshake = this.handshake;
        String s = "none";
        if (handshake != null) {
            final CipherSuite cipherSuite = handshake.cipherSuite();
            if (cipherSuite != null) {
                s = (String)cipherSuite;
            }
        }
        t.append((Object)s);
        t.append(" protocol=");
        t.append(this.protocol);
        t.append('}');
        return t.toString();
    }
    
    public void trackFailure(final RealCall realCall, final IOException ex) {
        synchronized (this) {
            ng2.e.f((Object)realCall, "call");
            if (ex instanceof StreamResetException) {
                if (((StreamResetException)ex).errorCode == ErrorCode.REFUSED_STREAM) {
                    if (++this.refusedStreamCount > 1) {
                        this.noNewExchanges = true;
                        ++this.routeFailureCount;
                    }
                }
                else if (((StreamResetException)ex).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                    this.noNewExchanges = true;
                    ++this.routeFailureCount;
                }
            }
            else if (!this.isMultiplexed$okhttp() || ex instanceof ConnectionShutdownException) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (ex != null) {
                        this.connectFailed$okhttp(realCall.getClient(), this.getRoute(), ex);
                    }
                    ++this.routeFailureCount;
                }
            }
        }
    }
    
    @Metadata(d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010" }, d2 = { "Lokhttp3/internal/connection/RealConnection$Companion;", "", "()V", "IDLE_CONNECTION_HEALTHY_NS", "", "newTestConnection", "Lokhttp3/internal/connection/RealConnection;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "idleAtNs", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final RealConnection newTestConnection(final TaskRunner taskRunner, final RealConnectionPool realConnectionPool, final Route route, final Socket socket, final long idleAtNs) {
            ng2.e.f((Object)taskRunner, "taskRunner");
            ng2.e.f((Object)realConnectionPool, "connectionPool");
            ng2.e.f((Object)route, "route");
            ng2.e.f((Object)socket, "socket");
            final RealConnection realConnection = new RealConnection(taskRunner, realConnectionPool, route, null, socket, null, null, null, null, 0);
            realConnection.setIdleAtNs(idleAtNs);
            return realConnection;
        }
    }
}
