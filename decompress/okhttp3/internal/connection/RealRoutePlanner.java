// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import okhttp3.HttpUrl;
import okhttp3.internal.platform.Platform;
import java.net.UnknownServiceException;
import okhttp3.ConnectionSpec;
import java.net.Socket;
import okhttp3.Connection;
import okhttp3.Call;
import java.util.List;
import java.io.IOException;
import okhttp3.Protocol;
import okhttp3.Response$Builder;
import okhttp3.internal._UtilJvmKt;
import okhttp3.RequestBody;
import okhttp3.Request$Builder;
import okhttp3.Request;
import ng2.e;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.Route;
import okhttp3.OkHttpClient;
import okhttp3.Address;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u00102\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\"H\u0000¢\u0006\u0002\b#J\n\u0010$\u001a\u0004\u0018\u00010%H\u0002J-\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001f2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\"H\u0000¢\u0006\u0002\b(J\u0012\u0010)\u001a\u0004\u0018\u00010\u00102\u0006\u0010*\u001a\u00020\u001aH\u0002J\u0010\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020-H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006." }, d2 = { "Lokhttp3/internal/connection/RealRoutePlanner;", "Lokhttp3/internal/connection/RoutePlanner;", "client", "Lokhttp3/OkHttpClient;", "address", "Lokhttp3/Address;", "call", "Lokhttp3/internal/connection/RealCall;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "(Lokhttp3/OkHttpClient;Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Lokhttp3/internal/http/RealInterceptorChain;)V", "getAddress", "()Lokhttp3/Address;", "doExtensiveHealthChecks", "", "nextRouteToTry", "Lokhttp3/Route;", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "createTunnelRequest", "Lokhttp3/Request;", "route", "hasNext", "failedConnection", "Lokhttp3/internal/connection/RealConnection;", "isCanceled", "plan", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "planConnect", "Lokhttp3/internal/connection/ConnectPlan;", "planConnectToRoute", "routes", "", "planConnectToRoute$okhttp", "planReuseCallConnection", "Lokhttp3/internal/connection/ReusePlan;", "planReusePooledConnection", "planToReplace", "planReusePooledConnection$okhttp", "retryRoute", "connection", "sameHostAndPort", "url", "Lokhttp3/HttpUrl;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class RealRoutePlanner implements RoutePlanner
{
    private final Address address;
    private final RealCall call;
    private final OkHttpClient client;
    private final boolean doExtensiveHealthChecks;
    private Route nextRouteToTry;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;
    
    public RealRoutePlanner(final OkHttpClient client, final Address address, final RealCall call, final RealInterceptorChain realInterceptorChain) {
        e.f((Object)client, "client");
        e.f((Object)address, "address");
        e.f((Object)call, "call");
        e.f((Object)realInterceptorChain, "chain");
        this.client = client;
        this.address = address;
        this.call = call;
        this.doExtensiveHealthChecks = (e.a((Object)realInterceptorChain.getRequest$okhttp().method(), (Object)"GET") ^ true);
    }
    
    private final Request createTunnelRequest(final Route route) throws IOException {
        final Request build = new Request$Builder().url(route.address().url()).method("CONNECT", (RequestBody)null).header("Host", _UtilJvmKt.toHostHeader(route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", "okhttp/5.0.0-alpha.6").build();
        Request authenticate = route.address().proxyAuthenticator().authenticate(route, new Response$Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(_UtilJvmKt.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        if (authenticate == null) {
            authenticate = build;
        }
        return authenticate;
    }
    
    private final ConnectPlan planConnect() throws IOException {
        final Route nextRouteToTry = this.nextRouteToTry;
        if (nextRouteToTry != null) {
            this.nextRouteToTry = null;
            return planConnectToRoute$okhttp$default(this, nextRouteToTry, null, 2, null);
        }
        final RouteSelector.Selection routeSelection = this.routeSelection;
        if (routeSelection != null && routeSelection.hasNext()) {
            return planConnectToRoute$okhttp$default(this, routeSelection.next(), null, 2, null);
        }
        RouteSelector routeSelector;
        if ((routeSelector = this.routeSelector) == null) {
            routeSelector = new RouteSelector(this.getAddress(), this.call.getClient().getRouteDatabase$okhttp(), (Call)this.call, this.client.fastFallback(), this.call.getEventListener$okhttp());
            this.routeSelector = routeSelector;
        }
        if (!routeSelector.hasNext()) {
            throw new IOException("exhausted all routes");
        }
        final RouteSelector.Selection next = routeSelector.next();
        this.routeSelection = next;
        if (!this.call.isCanceled()) {
            return this.planConnectToRoute$okhttp(next.next(), next.getRoutes());
        }
        throw new IOException("Canceled");
    }
    
    public static ConnectPlan planConnectToRoute$okhttp$default(final RealRoutePlanner realRoutePlanner, final Route route, List list, final int n, final Object o) throws IOException {
        if ((n & 0x2) != 0x0) {
            list = null;
        }
        return realRoutePlanner.planConnectToRoute$okhttp(route, list);
    }
    
    private final ReusePlan planReuseCallConnection() {
        final RealConnection connection = this.call.getConnection();
        if (connection == null) {
            return null;
        }
        final boolean healthy = connection.isHealthy(this.doExtensiveHealthChecks);
        monitorenter(connection);
        boolean b = true;
        Label_0052: {
            if (healthy) {
                break Label_0052;
            }
            try {
                connection.setNoNewExchanges(true);
                Socket socket = this.call.releaseConnectionNoEvents$okhttp();
                while (true) {
                    monitorexit(connection);
                    if (this.call.getConnection() == null) {
                        if (socket != null) {
                            _UtilJvmKt.closeQuietly(socket);
                        }
                        this.call.getEventListener$okhttp().connectionReleased((Call)this.call, (Connection)connection);
                        return null;
                    }
                    if (socket != null) {
                        b = false;
                    }
                    if (b) {
                        return new ReusePlan(connection);
                    }
                    throw new IllegalStateException("Check failed.".toString());
                    iftrue(Label_0086:)(connection.getNoNewExchanges() || !this.sameHostAndPort(connection.route().address().url()));
                    socket = null;
                    continue;
                    Label_0086: {
                        socket = this.call.releaseConnectionNoEvents$okhttp();
                    }
                    continue;
                }
            }
            finally {
                monitorexit(connection);
            }
        }
    }
    
    public static ReusePlan planReusePooledConnection$okhttp$default(final RealRoutePlanner realRoutePlanner, ConnectPlan connectPlan, List list, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            connectPlan = null;
        }
        if ((n & 0x2) != 0x0) {
            list = null;
        }
        return realRoutePlanner.planReusePooledConnection$okhttp(connectPlan, list);
    }
    
    private final Route retryRoute(final RealConnection realConnection) {
        synchronized (realConnection) {
            if (realConnection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (!realConnection.getNoNewExchanges()) {
                return null;
            }
            if (!_UtilJvmKt.canReuseConnectionFor(realConnection.route().address().url(), this.getAddress().url())) {
                return null;
            }
            return realConnection.route();
        }
    }
    
    @Override
    public Address getAddress() {
        return this.address;
    }
    
    @Override
    public boolean hasNext(final RealConnection realConnection) {
        if (this.nextRouteToTry != null) {
            return true;
        }
        if (realConnection != null) {
            final Route retryRoute = this.retryRoute(realConnection);
            if (retryRoute != null) {
                this.nextRouteToTry = retryRoute;
                return true;
            }
        }
        final RouteSelector.Selection routeSelection = this.routeSelection;
        boolean b = false;
        if (routeSelection != null) {
            if (routeSelection.hasNext()) {
                b = true;
            }
        }
        if (b) {
            return true;
        }
        final RouteSelector routeSelector = this.routeSelector;
        return routeSelector == null || routeSelector.hasNext();
    }
    
    @Override
    public boolean isCanceled() {
        return this.call.isCanceled();
    }
    
    @Override
    public Plan plan() throws IOException {
        final ReusePlan planReuseCallConnection = this.planReuseCallConnection();
        if (planReuseCallConnection != null) {
            return planReuseCallConnection;
        }
        final ReusePlan planReusePooledConnection$okhttp$default = planReusePooledConnection$okhttp$default(this, null, null, 3, null);
        if (planReusePooledConnection$okhttp$default != null) {
            return planReusePooledConnection$okhttp$default;
        }
        final ConnectPlan planConnect = this.planConnect();
        final ReusePlan planReusePooledConnection$okhttp = this.planReusePooledConnection$okhttp(planConnect, planConnect.getRoutes$okhttp());
        if (planReusePooledConnection$okhttp != null) {
            return planReusePooledConnection$okhttp;
        }
        return planConnect;
    }
    
    public final ConnectPlan planConnectToRoute$okhttp(final Route route, final List<Route> list) throws IOException {
        e.f((Object)route, "route");
        if (route.address().sslSocketFactory() == null) {
            if (!route.address().connectionSpecs().contains(ConnectionSpec.CLEARTEXT)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            final String host = route.address().url().host();
            if (!Platform.Companion.get().isCleartextTrafficPermitted(host)) {
                throw new UnknownServiceException(a.n("CLEARTEXT communication to ", host, " not permitted by network security policy"));
            }
        }
        else if (route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        Request tunnelRequest;
        if (route.requiresTunnel()) {
            tunnelRequest = this.createTunnelRequest(route);
        }
        else {
            tunnelRequest = null;
        }
        return new ConnectPlan(this.client, this.call, this, route, list, 0, tunnelRequest, -1, false);
    }
    
    public final ReusePlan planReusePooledConnection$okhttp(final ConnectPlan connectPlan, final List<Route> list) {
        final RealConnection callAcquirePooledConnection = this.client.connectionPool().getDelegate$okhttp().callAcquirePooledConnection(this.doExtensiveHealthChecks, this.getAddress(), this.call, list, connectPlan != null && connectPlan.isReady());
        if (callAcquirePooledConnection == null) {
            return null;
        }
        if (connectPlan != null) {
            this.nextRouteToTry = connectPlan.getRoute();
            connectPlan.closeQuietly();
        }
        this.call.getEventListener$okhttp().connectionAcquired((Call)this.call, (Connection)callAcquirePooledConnection);
        return new ReusePlan(callAcquirePooledConnection);
    }
    
    @Override
    public boolean sameHostAndPort(final HttpUrl httpUrl) {
        e.f((Object)httpUrl, "url");
        final HttpUrl url = this.getAddress().url();
        return httpUrl.port() == url.port() && e.a((Object)httpUrl.host(), (Object)url.host());
    }
}
