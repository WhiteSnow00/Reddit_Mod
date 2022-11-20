// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import java.util.NoSuchElementException;
import java.util.Collection;
import dg2.o;
import java.net.URI;
import okhttp3.internal._UtilJvmKt;
import okhttp3.HttpUrl;
import java.util.Iterator;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import cg.d;
import java.net.InetAddress;
import okhttp3.internal._HostnamesCommonKt;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.net.Proxy;
import okhttp3.Route;
import java.net.InetSocketAddress;
import java.util.List;
import okhttp3.EventListener;
import okhttp3.Call;
import okhttp3.Address;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0002*+B/\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b(\u0010)J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\t\u0010\f\u001a\u00020\bH\u0086\u0002J\t\u0010\u000e\u001a\u00020\rH\u0086\u0002R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001f¨\u0006," }, d2 = { "Lokhttp3/internal/connection/RouteSelector;", "", "Lokhttp3/HttpUrl;", "url", "Ljava/net/Proxy;", "proxy", "Lcg2/j;", "resetNextProxy", "", "hasNextProxy", "nextProxy", "resetNextInetSocketAddress", "hasNext", "Lokhttp3/internal/connection/RouteSelector$Selection;", "next", "Lokhttp3/Address;", "address", "Lokhttp3/Address;", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "fastFallback", "Z", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "", "proxies", "Ljava/util/List;", "", "nextProxyIndex", "I", "Ljava/net/InetSocketAddress;", "inetSocketAddresses", "", "Lokhttp3/Route;", "postponedRoutes", "<init>", "(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/Call;ZLokhttp3/EventListener;)V", "Companion", "Selection", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class RouteSelector
{
    public static final Companion Companion;
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private final boolean fastFallback;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;
    
    static {
        Companion = new Companion(null);
    }
    
    public RouteSelector(final Address address, final RouteDatabase routeDatabase, final Call call, final boolean fastFallback, final EventListener eventListener) {
        e.f((Object)address, "address");
        e.f((Object)routeDatabase, "routeDatabase");
        e.f((Object)call, "call");
        e.f((Object)eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.fastFallback = fastFallback;
        this.eventListener = eventListener;
        final EmptyList instance = EmptyList.INSTANCE;
        this.proxies = (List<? extends Proxy>)instance;
        this.inetSocketAddresses = (List<? extends InetSocketAddress>)instance;
        this.postponedRoutes = new ArrayList<Route>();
        this.resetNextProxy(address.url(), address.proxy());
    }
    
    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }
    
    private final Proxy nextProxy() throws IOException {
        if (this.hasNextProxy()) {
            final Proxy proxy = (Proxy)this.proxies.get(this.nextProxyIndex++);
            this.resetNextInetSocketAddress(proxy);
            return proxy;
        }
        final StringBuilder t = a.t("No route to ");
        t.append(this.address.url().host());
        t.append("; exhausted proxy configurations: ");
        t.append(this.proxies);
        throw new SocketException(t.toString());
    }
    
    private final void resetNextInetSocketAddress(final Proxy proxy) throws IOException {
        final ArrayList inetSocketAddresses = new ArrayList();
        this.inetSocketAddresses = inetSocketAddresses;
        String s;
        int n;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            final SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(e.l((Object)((InetSocketAddress)address).getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
            }
            final Companion companion = RouteSelector.Companion;
            e.e((Object)address, "proxyAddress");
            final InetSocketAddress inetSocketAddress = (InetSocketAddress)address;
            s = companion.getSocketHost(inetSocketAddress);
            n = inetSocketAddress.getPort();
        }
        else {
            s = this.address.url().host();
            n = this.address.url().port();
        }
        int n2 = 0;
        if (1 <= n) {
            n2 = n2;
            if (n < 65536) {
                n2 = 1;
            }
        }
        if (n2 != 0) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                inetSocketAddresses.add(InetSocketAddress.createUnresolved(s, n));
            }
            else {
                List list;
                if (_HostnamesCommonKt.canParseAsIpAddress(s)) {
                    list = d.l3((Object)InetAddress.getByName(s));
                }
                else {
                    this.eventListener.dnsStart(this.call, s);
                    list = this.address.dns().lookup(s);
                    if (list.isEmpty()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(this.address.dns());
                        sb.append(" returned no addresses for ");
                        sb.append(s);
                        throw new UnknownHostException(sb.toString());
                    }
                    this.eventListener.dnsEnd(this.call, s, list);
                }
                List<InetAddress> reorderForHappyEyeballs = list;
                if (this.fastFallback) {
                    reorderForHappyEyeballs = InetAddressOrderKt.reorderForHappyEyeballs(list);
                }
                final Iterator<InetAddress> iterator = reorderForHappyEyeballs.iterator();
                while (iterator.hasNext()) {
                    inetSocketAddresses.add(new InetSocketAddress(iterator.next(), n));
                }
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("No route to ");
        sb2.append(s);
        sb2.append(':');
        sb2.append(n);
        sb2.append("; port is out of range");
        throw new SocketException(sb2.toString());
    }
    
    private final void resetNextProxy(final HttpUrl httpUrl, final Proxy proxy) {
        this.eventListener.proxySelectStart(this.call, httpUrl);
        final List<Proxy> resetNextProxy$selectProxies = resetNextProxy$selectProxies(proxy, httpUrl, this);
        this.proxies = resetNextProxy$selectProxies;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, httpUrl, (List)resetNextProxy$selectProxies);
    }
    
    private static final List<Proxy> resetNextProxy$selectProxies(final Proxy proxy, final HttpUrl httpUrl, final RouteSelector routeSelector) {
        if (proxy != null) {
            return d.l3((Object)proxy);
        }
        final URI uri = httpUrl.uri();
        if (uri.getHost() == null) {
            return _UtilJvmKt.immutableListOf(Proxy.NO_PROXY);
        }
        final List<Proxy> select = routeSelector.address.proxySelector().select(uri);
        if (select == null || select.isEmpty()) {
            return _UtilJvmKt.immutableListOf(Proxy.NO_PROXY);
        }
        e.e((Object)select, "proxiesOrNull");
        return _UtilJvmKt.toImmutableList((List<? extends Proxy>)select);
    }
    
    public final boolean hasNext() {
        final boolean hasNextProxy = this.hasNextProxy();
        boolean b = true;
        if (!hasNextProxy) {
            b = ((this.postponedRoutes.isEmpty() ^ true) && b);
        }
        return b;
    }
    
    public final Selection next() throws IOException {
        if (this.hasNext()) {
            final ArrayList list = new ArrayList();
            while (this.hasNextProxy()) {
                final Proxy nextProxy = this.nextProxy();
                final Iterator<? extends InetSocketAddress> iterator = this.inetSocketAddresses.iterator();
                while (iterator.hasNext()) {
                    final Route route = new Route(this.address, nextProxy, (InetSocketAddress)iterator.next());
                    if (this.routeDatabase.shouldPostpone(route)) {
                        this.postponedRoutes.add(route);
                    }
                    else {
                        list.add(route);
                    }
                }
                if (list.isEmpty() ^ true) {
                    break;
                }
            }
            if (list.isEmpty()) {
                o.B4((Iterable)this.postponedRoutes, (Collection)list);
                this.postponedRoutes.clear();
            }
            return new Selection(list);
        }
        throw new NoSuchElementException();
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lokhttp3/internal/connection/RouteSelector$Companion;", "", "()V", "socketHost", "", "Ljava/net/InetSocketAddress;", "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final String getSocketHost(final InetSocketAddress inetSocketAddress) {
            e.f((Object)inetSocketAddress, "<this>");
            final InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                final String hostName = inetSocketAddress.getHostName();
                e.e((Object)hostName, "hostName");
                return hostName;
            }
            final String hostAddress = address.getHostAddress();
            e.e((Object)hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }
    
    @Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u000bH\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r" }, d2 = { "Lokhttp3/internal/connection/RouteSelector$Selection;", "", "routes", "", "Lokhttp3/Route;", "(Ljava/util/List;)V", "nextRouteIndex", "", "getRoutes", "()Ljava/util/List;", "hasNext", "", "next", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Selection
    {
        private int nextRouteIndex;
        private final List<Route> routes;
        
        public Selection(final List<Route> routes) {
            e.f((Object)routes, "routes");
            this.routes = routes;
        }
        
        public final List<Route> getRoutes() {
            return this.routes;
        }
        
        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }
        
        public final Route next() {
            if (this.hasNext()) {
                return this.routes.get(this.nextRouteIndex++);
            }
            throw new NoSuchElementException();
        }
    }
}
