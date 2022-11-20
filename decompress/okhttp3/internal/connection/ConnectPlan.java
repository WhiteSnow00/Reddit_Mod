// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import fk2.e0;
import fk2.g0;
import java.net.UnknownServiceException;
import java.util.Arrays;
import okhttp3.Connection;
import java.net.ProtocolException;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.Call;
import okhttp3.Response$Builder;
import fk2.h0;
import okhttp3.HttpUrl;
import xi2.j;
import okhttp3.Response;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.Http1ExchangeCodec;
import javax.net.ssl.HostnameVerifier;
import okhttp3.Handshake$Companion;
import javax.net.ssl.SSLSession;
import okhttp3.Address;
import okhttp3.internal._UtilJvmKt;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.tls.OkHostnameVerifier;
import java.security.cert.Certificate;
import okhttp3.CertificatePinner;
import java.security.cert.X509Certificate;
import mg2.a;
import okhttp3.ConnectionSpec;
import javax.net.ssl.SSLSocket;
import java.net.Proxy;
import java.net.ConnectException;
import java.io.IOException;
import fk2.u;
import okhttp3.internal.platform.Platform;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Request;
import fk2.f;
import fk2.e;
import java.util.List;
import okhttp3.Route;
import java.net.Socket;
import okhttp3.Protocol;
import okhttp3.Handshake;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import kotlin.Metadata;
import okhttp3.internal.http.ExchangeCodec;

@Metadata(bv = {}, d1 = { "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001YBY\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u000202\u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bW\u0010XJ2\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u000f\u0010\u0018\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001d\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u0004\u0018\u00010\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\b\u0010!\u001a\u00020 H\u0016J\u001a\u0010&\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\b\u0010'\u001a\u00020\u000bH\u0016J\b\u0010(\u001a\u00020\u000bH\u0016J\b\u0010)\u001a\u00020\u0001H\u0016J\u0006\u0010*\u001a\u00020\u000bR\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u00107\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u001a\u0010\u0007\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b=\u0010>R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010?R\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010I\u001a\u0004\u0018\u00010F8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010H\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010T\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010A¨\u0006Z" }, d2 = { "Lokhttp3/internal/connection/ConnectPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "", "attempt", "Lokhttp3/Request;", "tunnelRequest", "connectionSpecIndex", "", "isTlsFallback", "copy", "Lcg2/j;", "connectSocket", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "Lokhttp3/ConnectionSpec;", "connectionSpec", "connectTls", "createTunnel", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTcp", "connectTlsEtc", "connectTunnel$okhttp", "()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTunnel", "", "connectionSpecs", "planWithCurrentOrInitialConnectionSpec$okhttp", "(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/connection/ConnectPlan;", "planWithCurrentOrInitialConnectionSpec", "nextConnectionSpec$okhttp", "nextConnectionSpec", "Lokhttp3/internal/connection/RealConnection;", "handleSuccess", "Lokhttp3/internal/connection/RealCall;", "call", "Ljava/io/IOException;", "e", "trackFailure", "noNewExchanges", "cancel", "retry", "closeQuietly", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "Lokhttp3/internal/connection/RealCall;", "Lokhttp3/internal/connection/RealRoutePlanner;", "routePlanner", "Lokhttp3/internal/connection/RealRoutePlanner;", "Lokhttp3/Route;", "route", "Lokhttp3/Route;", "getRoute", "()Lokhttp3/Route;", "routes", "Ljava/util/List;", "getRoutes$okhttp", "()Ljava/util/List;", "I", "Lokhttp3/Request;", "getConnectionSpecIndex$okhttp", "()I", "Z", "isTlsFallback$okhttp", "()Z", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "canceled", "Ljava/net/Socket;", "rawSocket", "Ljava/net/Socket;", "socket", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "connection", "Lokhttp3/internal/connection/RealConnection;", "isReady", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealRoutePlanner;Lokhttp3/Route;Ljava/util/List;ILokhttp3/Request;IZ)V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class ConnectPlan implements Plan, Carrier
{
    public static final Companion Companion;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private final int attempt;
    private final RealCall call;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final int connectionSpecIndex;
    private final EventListener eventListener;
    private Handshake handshake;
    private final boolean isTlsFallback;
    private Protocol protocol;
    private Socket rawSocket;
    private final Route route;
    private final RealRoutePlanner routePlanner;
    private final List<Route> routes;
    private e sink;
    private Socket socket;
    private f source;
    private final Request tunnelRequest;
    
    static {
        Companion = new Companion(null);
    }
    
    public ConnectPlan(final OkHttpClient client, final RealCall call, final RealRoutePlanner routePlanner, final Route route, final List<Route> routes, final int attempt, final Request tunnelRequest, final int connectionSpecIndex, final boolean isTlsFallback) {
        ng2.e.f((Object)client, "client");
        ng2.e.f((Object)call, "call");
        ng2.e.f((Object)routePlanner, "routePlanner");
        ng2.e.f((Object)route, "route");
        this.client = client;
        this.call = call;
        this.routePlanner = routePlanner;
        this.route = route;
        this.routes = routes;
        this.attempt = attempt;
        this.tunnelRequest = tunnelRequest;
        this.connectionSpecIndex = connectionSpecIndex;
        this.isTlsFallback = isTlsFallback;
        this.eventListener = call.getEventListener$okhttp();
    }
    
    private final void connectSocket() throws IOException {
        final Proxy.Type type = this.getRoute().proxy().type();
        int n;
        if (type == null) {
            n = -1;
        }
        else {
            n = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        Socket socket;
        if (n != 1 && n != 2) {
            socket = new Socket(this.getRoute().proxy());
        }
        else {
            socket = this.getRoute().address().socketFactory().createSocket();
            ng2.e.c((Object)socket);
        }
        this.rawSocket = socket;
        if (!this.canceled) {
            socket.setSoTimeout(this.client.readTimeoutMillis());
            try {
                Platform.Companion.get().connectSocket(socket, this.getRoute().socketAddress(), this.client.connectTimeoutMillis());
                try {
                    this.source = (f)u.b(u.h(socket));
                    this.sink = (e)u.a(u.e(socket));
                }
                catch (final NullPointerException ex) {
                    if (ng2.e.a((Object)ex.getMessage(), (Object)"throw with null exception")) {
                        throw new IOException(ex);
                    }
                }
                return;
            }
            catch (final ConnectException ex2) {
                final ConnectException ex3 = new ConnectException(ng2.e.l((Object)this.getRoute().socketAddress(), "Failed to connect to "));
                ex3.initCause(ex2);
                throw ex3;
            }
        }
        throw new IOException("canceled");
    }
    
    private final void connectTls(final SSLSocket socket, final ConnectionSpec connectionSpec) throws IOException {
        final Address address = this.getRoute().address();
        try {
            if (connectionSpec.supportsTlsExtensions()) {
                Platform.Companion.get().configureTlsExtensions(socket, address.url().host(), address.protocols());
            }
            socket.startHandshake();
            final SSLSession session = socket.getSession();
            final Handshake$Companion companion = Handshake.Companion;
            ng2.e.e((Object)session, "sslSocketSession");
            final Handshake value = companion.get(session);
            final HostnameVerifier hostnameVerifier = address.hostnameVerifier();
            ng2.e.c((Object)hostnameVerifier);
            final boolean verify = hostnameVerifier.verify(address.url().host(), session);
            String selectedProtocol = null;
            if (verify) {
                final CertificatePinner certificatePinner = address.certificatePinner();
                ng2.e.c((Object)certificatePinner);
                final Handshake handshake = new Handshake(value.tlsVersion(), value.cipherSuite(), value.localCertificates(), (a)new ConnectPlan$connectTls$handshake$1(certificatePinner, value, address));
                this.handshake = handshake;
                certificatePinner.check$okhttp(address.url().host(), (a)new ConnectPlan$connectTls$1(handshake));
                if (connectionSpec.supportsTlsExtensions()) {
                    selectedProtocol = Platform.Companion.get().getSelectedProtocol(socket);
                }
                this.socket = socket;
                this.source = (f)u.b(u.h(socket));
                this.sink = (e)u.a(u.e(socket));
                Protocol protocol;
                if (selectedProtocol != null) {
                    protocol = Protocol.Companion.get(selectedProtocol);
                }
                else {
                    protocol = Protocol.HTTP_1_1;
                }
                this.protocol = protocol;
                Platform.Companion.get().afterHandshake(socket);
                return;
            }
            final List peerCertificates = value.peerCertificates();
            if (peerCertificates.isEmpty() ^ true) {
                final X509Certificate x509Certificate = peerCertificates.get(0);
                final StringBuilder sb = new StringBuilder();
                sb.append("\n            |Hostname ");
                sb.append(address.url().host());
                sb.append(" not verified:\n            |    certificate: ");
                sb.append(CertificatePinner.Companion.pin((Certificate)x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append((Object)x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(kotlin.text.a.s0(sb.toString()));
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Hostname ");
            sb2.append(address.url().host());
            sb2.append(" not verified (no certificates)");
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
        finally {
            Platform.Companion.get().afterHandshake(socket);
            _UtilJvmKt.closeQuietly(socket);
        }
    }
    
    private final ConnectPlan copy(final int n, final Request request, final int n2, final boolean b) {
        return new ConnectPlan(this.client, this.call, this.routePlanner, this.getRoute(), this.routes, n, request, n2, b);
    }
    
    public static ConnectPlan copy$default(final ConnectPlan connectPlan, int attempt, Request tunnelRequest, int connectionSpecIndex, boolean isTlsFallback, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            attempt = connectPlan.attempt;
        }
        if ((n & 0x2) != 0x0) {
            tunnelRequest = connectPlan.tunnelRequest;
        }
        if ((n & 0x4) != 0x0) {
            connectionSpecIndex = connectPlan.connectionSpecIndex;
        }
        if ((n & 0x8) != 0x0) {
            isTlsFallback = connectPlan.isTlsFallback;
        }
        return connectPlan.copy(attempt, tunnelRequest, connectionSpecIndex, isTlsFallback);
    }
    
    private final Request createTunnel() throws IOException {
        Request request = this.tunnelRequest;
        ng2.e.c((Object)request);
        final HttpUrl url = this.getRoute().address().url();
        final StringBuilder t = a.t("CONNECT ");
        t.append(_UtilJvmKt.toHostHeader(url, true));
        t.append(" HTTP/1.1");
        final String string = t.toString();
        while (true) {
            final f source = this.source;
            ng2.e.c((Object)source);
            final e sink = this.sink;
            ng2.e.c((Object)sink);
            final Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, source, sink);
            final h0 timeout = ((g0)source).timeout();
            final long n = this.client.readTimeoutMillis();
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            timeout.timeout(n, milliseconds);
            ((e0)sink).timeout().timeout(this.client.writeTimeoutMillis(), milliseconds);
            http1ExchangeCodec.writeRequest(request.headers(), string);
            http1ExchangeCodec.finishRequest();
            final Response$Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            ng2.e.c((Object)responseHeaders);
            final Response build = responseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(build);
            final int code = build.code();
            if (code != 200) {
                if (code != 407) {
                    throw new IOException(ng2.e.l((Object)build.code(), "Unexpected response code for CONNECT: "));
                }
                request = this.getRoute().address().proxyAuthenticator().authenticate(this.getRoute(), build);
                if (request == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (j.z0("close", Response.header$default(build, "Connection", (String)null, 2, (Object)null), true)) {
                    return request;
                }
                continue;
            }
            else {
                if (source.getBuffer().e1() && sink.getBuffer().e1()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }
    
    @Override
    public void cancel() {
        this.canceled = true;
        final Socket rawSocket = this.rawSocket;
        if (rawSocket != null) {
            _UtilJvmKt.closeQuietly(rawSocket);
        }
    }
    
    public final void closeQuietly() {
        final Socket socket = this.socket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }
    
    @Override
    public ConnectResult connectTcp() {
        final Socket rawSocket = this.rawSocket;
        final int n = 1;
        int n2 = 1;
        int n3;
        if (rawSocket == null) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (n3 == 0) {
            throw new IllegalStateException("TCP already connected".toString());
        }
        this.call.getPlansToCancel$okhttp().add(this);
        Label_0208: {
            try {
                this.eventListener.connectStart((Call)this.call, this.getRoute().socketAddress(), this.getRoute().proxy());
                this.connectSocket();
                n3 = n;
                try {
                    final ConnectPlan connectPlan = this;
                    final Plan plan = null;
                    final Throwable t = null;
                    final int n4 = 6;
                    final DefaultConstructorMarker defaultConstructorMarker = null;
                    final RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(connectPlan, plan, t, n4, defaultConstructorMarker);
                    final ConnectPlan connectPlan2 = this;
                    final RealCall realCall = connectPlan2.call;
                    final CopyOnWriteArrayList<Plan> list = realCall.getPlansToCancel$okhttp();
                    final ConnectPlan connectPlan3 = this;
                    list.remove(connectPlan3);
                    return connectResult;
                }
                catch (final IOException ex) {}
            }
            catch (final IOException ex) {
                n2 = 0;
            }
            finally {
                n3 = 0;
                break Label_0208;
            }
            try {
                final ConnectPlan connectPlan = this;
                final Plan plan = null;
                final Throwable t = null;
                final int n4 = 6;
                final DefaultConstructorMarker defaultConstructorMarker = null;
                final RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(connectPlan, plan, t, n4, defaultConstructorMarker);
                final ConnectPlan connectPlan2 = this;
                final RealCall realCall = connectPlan2.call;
                final CopyOnWriteArrayList<Plan> list = realCall.getPlansToCancel$okhttp();
                final ConnectPlan connectPlan3 = this;
                list.remove(connectPlan3);
                return connectResult;
                Socket rawSocket2;
                ConnectResult connectResult3 = null;
                while (true) {
                    rawSocket2 = this.rawSocket;
                    iftrue(Label_0198:)(rawSocket2 != null);
                    return connectResult3;
                    n3 = n2;
                    final IOException ex;
                    this.eventListener.connectFailed((Call)this.call, this.getRoute().socketAddress(), this.getRoute().proxy(), (Protocol)null, ex);
                    n3 = n2;
                    connectResult3 = new RoutePlanner.ConnectResult(this, null, ex, 2, null);
                    this.call.getPlansToCancel$okhttp().remove(this);
                    iftrue(Label_0203:)(n2 != 0);
                    continue;
                }
                Label_0198: {
                    _UtilJvmKt.closeQuietly(rawSocket2);
                }
                Label_0203:
                return connectResult3;
            }
            finally {}
        }
        this.call.getPlansToCancel$okhttp().remove(this);
        if (n3 == 0) {
            final Socket rawSocket3 = this.rawSocket;
            if (rawSocket3 != null) {
                _UtilJvmKt.closeQuietly(rawSocket3);
            }
        }
    }
    
    @Override
    public ConnectResult connectTlsEtc() {
        final Socket rawSocket = this.rawSocket;
        int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        if (rawSocket == null) {
            throw new IllegalStateException("TCP not connected".toString());
        }
        if (!(this.isReady() ^ true)) {
            throw new IllegalStateException("already connected".toString());
        }
        final List connectionSpecs = this.getRoute().address().connectionSpecs();
        this.call.getPlansToCancel$okhttp().add(this);
        final Plan plan = null;
        int n4 = n;
        Object connection = null;
        Plan plan2;
        try {
            try {
                Label_0163: {
                    if (this.tunnelRequest != null) {
                        n4 = n;
                        connection = this.connectTunnel$okhttp();
                        n4 = n;
                        if (((RoutePlanner.ConnectResult)connection).getNextPlan() == null) {
                            n4 = n;
                            if (((RoutePlanner.ConnectResult)connection).getThrowable() == null) {
                                break Label_0163;
                            }
                        }
                        this.call.getPlansToCancel$okhttp().remove(this);
                        final Socket socket = this.socket;
                        if (socket != null) {
                            _UtilJvmKt.closeQuietly(socket);
                        }
                        final Socket rawSocket2 = this.rawSocket;
                        if (rawSocket2 != null) {
                            _UtilJvmKt.closeQuietly(rawSocket2);
                        }
                        return (ConnectResult)connection;
                    }
                }
                n4 = n;
                Label_0436: {
                    if (this.getRoute().address().sslSocketFactory() != null) {
                        n4 = n;
                        this.eventListener.secureConnectStart((Call)this.call);
                        n4 = n;
                        connection = this.getRoute().address().sslSocketFactory().createSocket(this.rawSocket, this.getRoute().address().url().host(), this.getRoute().address().url().port(), true);
                        if (connection != null) {
                            n4 = n;
                            connection = connection;
                            n4 = n;
                            final ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp = this.planWithCurrentOrInitialConnectionSpec$okhttp(connectionSpecs, (SSLSocket)connection);
                            n4 = n;
                            final ConnectionSpec connectionSpec = connectionSpecs.get(planWithCurrentOrInitialConnectionSpec$okhttp.connectionSpecIndex);
                            n4 = n;
                            planWithCurrentOrInitialConnectionSpec$okhttp.nextConnectionSpec$okhttp(connectionSpecs, (SSLSocket)connection);
                            n4 = n;
                            try {
                                connectionSpec.apply$okhttp((SSLSocket)connection, planWithCurrentOrInitialConnectionSpec$okhttp.isTlsFallback);
                                n4 = n;
                                this.connectTls((SSLSocket)connection, connectionSpec);
                                n4 = n;
                                this.eventListener.secureConnectEnd((Call)this.call, this.handshake);
                                break Label_0436;
                            }
                            catch (final IOException connection) {
                                n = n2;
                            }
                        }
                        n4 = n;
                        n4 = n;
                        final NullPointerException ex = new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                        n4 = n;
                        throw ex;
                    }
                    n4 = n;
                    this.socket = this.rawSocket;
                    n4 = n;
                    connection = this.getRoute().address().protocols();
                    n4 = n;
                    Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    n4 = n;
                    if (!((List)connection).contains(protocol)) {
                        n4 = n;
                        protocol = Protocol.HTTP_1_1;
                    }
                    n4 = n;
                    this.protocol = protocol;
                }
                n4 = n;
                try {
                    connection = new(okhttp3.internal.connection.RealConnection.class)();
                    n4 = n;
                    new RealConnection(this.client.getTaskRunner$okhttp(), this.client.connectionPool().getDelegate$okhttp(), this.getRoute(), this.rawSocket, this.socket, this.handshake, this.protocol, this.source, this.sink, this.client.pingIntervalMillis());
                    n4 = n;
                    this.connection = (RealConnection)connection;
                    n4 = n;
                    ((RealConnection)connection).start();
                    n4 = n;
                    this.eventListener.connectEnd((Call)this.call, this.getRoute().socketAddress(), this.getRoute().proxy(), this.protocol);
                    try {
                        connection = new RoutePlanner.ConnectResult(this, null, null, 6, null);
                        this.call.getPlansToCancel$okhttp().remove(this);
                        return (ConnectResult)connection;
                    }
                    catch (final IOException connection) {}
                    finally {
                        n4 = 1;
                    }
                }
                catch (final IOException connection) {
                    n = n3;
                }
            }
            finally {}
        }
        catch (final IOException connection) {
            plan2 = null;
            n = n2;
        }
        this.eventListener.connectFailed((Call)this.call, this.getRoute().socketAddress(), this.getRoute().proxy(), (Protocol)null, (IOException)connection);
        Plan plan3 = plan;
        if (this.client.retryOnConnectionFailure()) {
            if (!TlsHandshakeKt.retryTlsHandshake((IOException)connection)) {
                plan3 = plan;
            }
            else {
                plan3 = plan2;
            }
        }
        final RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, plan3, (Throwable)connection);
        this.call.getPlansToCancel$okhttp().remove(this);
        if (n == 0) {
            final Socket socket2 = this.socket;
            if (socket2 != null) {
                _UtilJvmKt.closeQuietly(socket2);
            }
            final Socket rawSocket3 = this.rawSocket;
            if (rawSocket3 != null) {
                _UtilJvmKt.closeQuietly(rawSocket3);
            }
        }
        return connectResult;
        this.call.getPlansToCancel$okhttp().remove(this);
        if (n4 == 0) {
            final Socket socket3 = this.socket;
            if (socket3 != null) {
                _UtilJvmKt.closeQuietly(socket3);
            }
            final Socket rawSocket4 = this.rawSocket;
            if (rawSocket4 != null) {
                _UtilJvmKt.closeQuietly(rawSocket4);
            }
        }
    }
    
    public final ConnectResult connectTunnel$okhttp() throws IOException {
        final Request tunnel = this.createTunnel();
        if (tunnel == null) {
            return new RoutePlanner.ConnectResult(this, null, null, 6, null);
        }
        final Socket rawSocket = this.rawSocket;
        if (rawSocket != null) {
            _UtilJvmKt.closeQuietly(rawSocket);
        }
        final int n = this.attempt + 1;
        if (n < 21) {
            this.eventListener.connectEnd((Call)this.call, this.getRoute().socketAddress(), this.getRoute().proxy(), (Protocol)null);
            return new RoutePlanner.ConnectResult(this, copy$default(this, n, tunnel, 0, false, 12, null), null, 4, null);
        }
        final ProtocolException ex = new ProtocolException("Too many tunnel connections attempted: 21");
        this.eventListener.connectFailed((Call)this.call, this.getRoute().socketAddress(), this.getRoute().proxy(), (Protocol)null, (IOException)ex);
        return new RoutePlanner.ConnectResult(this, null, ex, 2, null);
    }
    
    public final int getConnectionSpecIndex$okhttp() {
        return this.connectionSpecIndex;
    }
    
    @Override
    public Route getRoute() {
        return this.route;
    }
    
    public final List<Route> getRoutes$okhttp() {
        return this.routes;
    }
    
    public final Socket getSocket$okhttp() {
        return this.socket;
    }
    
    @Override
    public RealConnection handleSuccess() {
        this.call.getClient().getRouteDatabase$okhttp().connected(this.getRoute());
        final ReusePlan planReusePooledConnection$okhttp = this.routePlanner.planReusePooledConnection$okhttp(this, this.routes);
        if (planReusePooledConnection$okhttp != null) {
            return planReusePooledConnection$okhttp.getConnection();
        }
        final RealConnection connection = this.connection;
        ng2.e.c((Object)connection);
        synchronized (connection) {
            this.client.connectionPool().getDelegate$okhttp().put(connection);
            this.call.acquireConnectionNoEvents(connection);
            final cg2.j a = cg2.j.a;
            monitorexit(connection);
            this.eventListener.connectionAcquired((Call)this.call, (Connection)connection);
            return connection;
        }
    }
    
    @Override
    public boolean isReady() {
        return this.protocol != null;
    }
    
    public final boolean isTlsFallback$okhttp() {
        return this.isTlsFallback;
    }
    
    public final ConnectPlan nextConnectionSpec$okhttp(final List<ConnectionSpec> list, final SSLSocket sslSocket) {
        ng2.e.f((Object)list, "connectionSpecs");
        ng2.e.f((Object)sslSocket, "sslSocket");
        int connectionSpecIndex = this.connectionSpecIndex;
        boolean b = true;
        ++connectionSpecIndex;
        final int size = list.size();
        int n;
        do {
            n = connectionSpecIndex;
            if (n >= size) {
                return null;
            }
            connectionSpecIndex = n + 1;
        } while (!((ConnectionSpec)list.get(n)).isCompatible(sslSocket));
        if (this.connectionSpecIndex == -1) {
            b = false;
        }
        return copy$default(this, 0, null, n, b, 3, null);
    }
    
    @Override
    public void noNewExchanges() {
    }
    
    public final ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp(final List<ConnectionSpec> list, final SSLSocket sslSocket) throws IOException {
        ng2.e.f((Object)list, "connectionSpecs");
        ng2.e.f((Object)sslSocket, "sslSocket");
        if (this.connectionSpecIndex != -1) {
            return this;
        }
        final ConnectPlan nextConnectionSpec$okhttp = this.nextConnectionSpec$okhttp(list, sslSocket);
        if (nextConnectionSpec$okhttp != null) {
            return nextConnectionSpec$okhttp;
        }
        final StringBuilder t = a.t("Unable to find acceptable protocols. isFallback=");
        t.append(this.isTlsFallback);
        t.append(", modes=");
        t.append(list);
        t.append(", supported protocols=");
        final String[] enabledProtocols = sslSocket.getEnabledProtocols();
        ng2.e.c((Object)enabledProtocols);
        final String string = Arrays.toString(enabledProtocols);
        ng2.e.e((Object)string, "toString(this)");
        t.append(string);
        throw new UnknownServiceException(t.toString());
    }
    
    @Override
    public Plan retry() {
        return new ConnectPlan(this.client, this.call, this.routePlanner, this.getRoute(), this.routes, this.attempt, this.tunnelRequest, this.connectionSpecIndex, this.isTlsFallback);
    }
    
    public final void setSocket$okhttp(final Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void trackFailure(final RealCall realCall, final IOException ex) {
        ng2.e.f((Object)realCall, "call");
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lokhttp3/internal/connection/ConnectPlan$Companion;", "", "()V", "MAX_TUNNEL_ATTEMPTS", "", "NPE_THROW_WITH_NULL", "", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
    
    @Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
    public final class WhenMappings
    {
        public static final int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[Proxy.Type.values().length];
            $EnumSwitchMapping$[Proxy.Type.DIRECT.ordinal()] = 1;
            $EnumSwitchMapping$[Proxy.Type.HTTP.ordinal()] = 2;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
