// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import java.lang.ref.WeakReference;
import okhttp3.Dispatcher;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import fk2.h0;
import java.lang.ref.Reference;
import java.io.Closeable;
import okhttp3.internal._UtilCommonKt;
import okhttp3.Interceptor;
import java.util.List;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import java.util.Collection;
import dg2.o;
import java.util.ArrayList;
import okhttp3.Response;
import cg2.j;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.Callback;
import java.util.Iterator;
import java.io.InterruptedIOException;
import okhttp3.CertificatePinner;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.HostnameVerifier;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.internal.platform.Platform;
import java.net.Socket;
import okhttp3.Connection;
import okhttp3.internal._UtilJvmKt;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import ng2.e;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.Request;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import kotlin.Metadata;
import okhttp3.Call;

@Metadata(bv = {}, d1 = { "\u0000µ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001X\u0018\u00002\u00020\u00012\u00020\u0002:\u0002wxB\u001f\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010H\u001a\u00020\u0006\u0012\u0006\u0010L\u001a\u00020\n¢\u0006\u0004\bu\u0010vJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0001H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\u000f\u0010\u0014\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dJ;\u0010(\u001a\u00028\u0000\"\n\b\u0000\u0010!*\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00028\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010+\u001a\u0004\u0018\u00010 2\b\u0010%\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b)\u0010*J\u0011\u0010/\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0004\b-\u0010.J\u0006\u00100\u001a\u00020\bJ\u0017\u00104\u001a\u00020\b2\u0006\u00101\u001a\u00020\nH\u0000¢\u0006\u0004\b2\u00103J\u0006\u00105\u001a\u00020\nJ\u000f\u00109\u001a\u000206H\u0000¢\u0006\u0004\b7\u00108J\b\u0010:\u001a\u00020\bH\u0002J#\u0010;\u001a\u00028\u0000\"\n\b\u0000\u0010!*\u0004\u0018\u00010 2\u0006\u0010%\u001a\u00028\u0000H\u0002¢\u0006\u0004\b;\u0010*J#\u0010=\u001a\u00028\u0000\"\n\b\u0000\u0010!*\u0004\u0018\u00010 2\u0006\u0010<\u001a\u00028\u0000H\u0002¢\u0006\u0004\b=\u0010*J\u0010\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020>H\u0002J\b\u0010B\u001a\u000206H\u0002R\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010H\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010L\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010\u0004\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010c\u001a\u0004\u0018\u00010\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010d\u001a\u0004\be\u0010fR\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010MR(\u0010g\u001a\u0004\u0018\u00010\u00192\b\u0010c\u001a\u0004\u0018\u00010\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010MR\u0016\u0010l\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010MR\u0016\u0010m\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010MR\u0016\u0010n\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010MR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010hR \u0010q\u001a\b\u0012\u0004\u0012\u00020p0o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t¨\u0006y" }, d2 = { "Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "", "Lfk2/h0;", "timeout", "clone", "Lokhttp3/Request;", "request", "Lcg2/j;", "cancel", "", "isCanceled", "Lokhttp3/Response;", "execute", "Lokhttp3/Callback;", "responseCallback", "enqueue", "isExecuted", "getResponseWithInterceptorChain$okhttp", "()Lokhttp3/Response;", "getResponseWithInterceptorChain", "newRoutePlanner", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "enterNetworkInterceptorExchange", "Lokhttp3/internal/connection/Exchange;", "initExchange$okhttp", "(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/connection/Exchange;", "initExchange", "Lokhttp3/internal/connection/RealConnection;", "connection", "acquireConnectionNoEvents", "Ljava/io/IOException;", "E", "exchange", "requestDone", "responseDone", "e", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "messageDone", "noMoreExchanges$okhttp", "(Ljava/io/IOException;)Ljava/io/IOException;", "noMoreExchanges", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "()Ljava/net/Socket;", "releaseConnectionNoEvents", "timeoutEarlyExit", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "(Z)V", "exitNetworkInterceptorExchange", "retryAfterFailure", "", "redactedUrl$okhttp", "()Ljava/lang/String;", "redactedUrl", "callStart", "callDone", "cause", "timeoutExit", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Address;", "createAddress", "toLoggableString", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "originalRequest", "Lokhttp3/Request;", "getOriginalRequest", "()Lokhttp3/Request;", "forWebSocket", "Z", "getForWebSocket", "()Z", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "okhttp3/internal/connection/RealCall$timeout$1", "Lokhttp3/internal/connection/RealCall$timeout$1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "callStackTrace", "Ljava/lang/Object;", "Lokhttp3/internal/connection/ExchangeFinder;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "<set-?>", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "interceptorScopedExchange", "Lokhttp3/internal/connection/Exchange;", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", "canceled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "plansToCancel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPlansToCancel$okhttp", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "AsyncCall", "CallReference", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class RealCall implements Call, Cloneable
{
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private final EventListener eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private Exchange interceptorScopedExchange;
    private final Request originalRequest;
    private final CopyOnWriteArrayList<RoutePlanner.Plan> plansToCancel;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final RealCall$timeout.RealCall$timeout$1 timeout;
    private boolean timeoutEarlyExit;
    
    public RealCall(final OkHttpClient client, final Request originalRequest, final boolean forWebSocket) {
        e.f((Object)client, "client");
        e.f((Object)originalRequest, "originalRequest");
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = forWebSocket;
        this.connectionPool = client.connectionPool().getDelegate$okhttp();
        this.eventListener = client.eventListenerFactory().create((Call)this);
        final RealCall$timeout.RealCall$timeout$1 timeout = new RealCall$timeout.RealCall$timeout$1(this);
        ((h0)timeout).timeout(this.getClient().callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = timeout;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
        this.plansToCancel = new CopyOnWriteArrayList<RoutePlanner.Plan>();
    }
    
    public static final RealCall$timeout.RealCall$timeout$1 access$getTimeout$p(final RealCall realCall) {
        return realCall.timeout;
    }
    
    public static final String access$toLoggableString(final RealCall realCall) {
        return realCall.toLoggableString();
    }
    
    private final <E extends IOException> E callDone(final E e) {
        final boolean assertionsEnabled = _UtilJvmKt.assertionsEnabled;
        if (assertionsEnabled && Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST NOT hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        final RealConnection connection = this.connection;
        if (connection != null) {
            if (assertionsEnabled && Thread.holdsLock(connection)) {
                final StringBuilder t2 = a.t("Thread ");
                t2.append((Object)Thread.currentThread().getName());
                t2.append(" MUST NOT hold lock on ");
                t2.append(connection);
                throw new AssertionError((Object)t2.toString());
            }
            synchronized (connection) {
                final Socket releaseConnectionNoEvents$okhttp = this.releaseConnectionNoEvents$okhttp();
                monitorexit(connection);
                if (this.connection == null) {
                    if (releaseConnectionNoEvents$okhttp != null) {
                        _UtilJvmKt.closeQuietly(releaseConnectionNoEvents$okhttp);
                    }
                    this.eventListener.connectionReleased((Call)this, (Connection)connection);
                }
                else if (releaseConnectionNoEvents$okhttp != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        final IOException timeoutExit = this.timeoutExit((IOException)e);
        if (e != null) {
            final EventListener eventListener = this.eventListener;
            e.c((Object)timeoutExit);
            eventListener.callFailed((Call)this, timeoutExit);
        }
        else {
            this.eventListener.callEnd((Call)this);
        }
        return (E)timeoutExit;
    }
    
    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart((Call)this);
    }
    
    private final Address createAddress(final HttpUrl httpUrl) {
        SSLSocketFactory sslSocketFactory;
        Object hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.isHttps()) {
            sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        }
        else {
            sslSocketFactory = null;
            hostnameVerifier = (certificatePinner = null);
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sslSocketFactory, (HostnameVerifier)hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }
    
    private final <E extends IOException> E timeoutExit(final E e) {
        if (this.timeoutEarlyExit) {
            return e;
        }
        if (!((fk2.a)this.timeout).exit()) {
            return e;
        }
        final IOException ex = new InterruptedIOException("timeout");
        if (e != null) {
            ex.initCause(e);
        }
        return (E)ex;
    }
    
    private final String toLoggableString() {
        final StringBuilder sb = new StringBuilder();
        String s;
        if (this.isCanceled()) {
            s = "canceled ";
        }
        else {
            s = "";
        }
        sb.append(s);
        String s2;
        if (this.forWebSocket) {
            s2 = "web socket";
        }
        else {
            s2 = "call";
        }
        sb.append(s2);
        sb.append(" to ");
        sb.append(this.redactedUrl$okhttp());
        return sb.toString();
    }
    
    public final void acquireConnectionNoEvents(final RealConnection connection) {
        e.f((Object)connection, "connection");
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(connection)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(connection);
            throw new AssertionError((Object)t.toString());
        }
        if (this.connection == null) {
            this.connection = connection;
            connection.getCalls().add(new CallReference(this, this.callStackTrace));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        final Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        final Iterator<RoutePlanner.Plan> iterator = this.plansToCancel.iterator();
        while (iterator.hasNext()) {
            iterator.next().cancel();
        }
        this.eventListener.canceled((Call)this);
    }
    
    public /* bridge */ Object clone() {
        return this.clone();
    }
    
    public Call clone() {
        return (Call)new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }
    
    public void enqueue(final Callback callback) {
        e.f((Object)callback, "responseCallback");
        if (this.executed.compareAndSet(false, true)) {
            this.callStart();
            this.client.dispatcher().enqueue$okhttp(new AsyncCall(callback));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }
    
    public final void enterNetworkInterceptorExchange(final Request request, final boolean b, final RealInterceptorChain realInterceptorChain) {
        e.f((Object)request, "request");
        e.f((Object)realInterceptorChain, "chain");
        if (this.interceptorScopedExchange == null) {
            synchronized (this) {
                if (!(this.responseBodyOpen ^ true)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (this.requestBodyOpen ^ true) {
                    final j a = j.a;
                    monitorexit(this);
                    if (b) {
                        final RealRoutePlanner realRoutePlanner = new RealRoutePlanner(this.client, this.createAddress(request.url()), this, realInterceptorChain);
                        ExchangeFinder exchangeFinder;
                        if (this.client.fastFallback()) {
                            exchangeFinder = new FastFallbackExchangeFinder(realRoutePlanner, this.client.getTaskRunner$okhttp());
                        }
                        else {
                            exchangeFinder = new SequentialExchangeFinder(realRoutePlanner);
                        }
                        this.exchangeFinder = exchangeFinder;
                    }
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public Response execute() {
        if (this.executed.compareAndSet(false, true)) {
            ((fk2.a)this.timeout).enter();
            this.callStart();
            try {
                this.client.dispatcher().executed$okhttp(this);
                return this.getResponseWithInterceptorChain$okhttp();
            }
            finally {
                this.client.dispatcher().finished$okhttp(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }
    
    public final void exitNetworkInterceptorExchange$okhttp(final boolean b) {
        synchronized (this) {
            if (this.expectMoreExchanges) {
                final j a = j.a;
                monitorexit(this);
                if (b) {
                    final Exchange exchange = this.exchange;
                    if (exchange != null) {
                        exchange.detachWithViolence();
                    }
                }
                this.interceptorScopedExchange = null;
                return;
            }
            throw new IllegalStateException("released".toString());
        }
    }
    
    public final OkHttpClient getClient() {
        return this.client;
    }
    
    public final RealConnection getConnection() {
        return this.connection;
    }
    
    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }
    
    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }
    
    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }
    
    public final Request getOriginalRequest() {
        return this.originalRequest;
    }
    
    public final CopyOnWriteArrayList<RoutePlanner.Plan> getPlansToCancel$okhttp() {
        return this.plansToCancel;
    }
    
    public final Response getResponseWithInterceptorChain$okhttp() throws IOException {
        final ArrayList list = new ArrayList();
        o.B4((Iterable)this.client.interceptors(), (Collection)list);
        list.add(new RetryAndFollowUpInterceptor(this.client));
        list.add(new BridgeInterceptor(this.client.cookieJar()));
        list.add(new CacheInterceptor(this.client.cache()));
        list.add(ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            o.B4((Iterable)this.client.networkInterceptors(), (Collection)list);
        }
        list.add(new CallServerInterceptor(this.forWebSocket));
        final RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this, list, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis());
        boolean b = false;
        try {
            final Response proceed = realInterceptorChain.proceed(this.originalRequest);
            if (!this.isCanceled()) {
                this.noMoreExchanges$okhttp(null);
                return proceed;
            }
            _UtilCommonKt.closeQuietly((Closeable)proceed);
            throw new IOException("Canceled");
        }
        catch (final IOException ex) {
            try {
                final IOException noMoreExchanges$okhttp = this.noMoreExchanges$okhttp(ex);
                if (noMoreExchanges$okhttp == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw noMoreExchanges$okhttp;
            }
            finally {
                b = true;
            }
        }
        if (!b) {
            this.noMoreExchanges$okhttp(null);
        }
        throw;
    }
    
    public final Exchange initExchange$okhttp(final RealInterceptorChain realInterceptorChain) {
        e.f((Object)realInterceptorChain, "chain");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released".toString());
            }
            if (this.responseBodyOpen ^ true) {
                if (this.requestBodyOpen ^ true) {
                    final j a = j.a;
                    monitorexit(this);
                    final ExchangeFinder exchangeFinder = this.exchangeFinder;
                    e.c((Object)exchangeFinder);
                    final Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find().newCodec$okhttp(this.client, realInterceptorChain));
                    this.interceptorScopedExchange = exchange;
                    this.exchange = exchange;
                    synchronized (this) {
                        this.requestBodyOpen = true;
                        this.responseBodyOpen = true;
                        monitorexit(this);
                        if (!this.canceled) {
                            return exchange;
                        }
                        throw new IOException("Canceled");
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }
    
    public boolean isCanceled() {
        return this.canceled;
    }
    
    public boolean isExecuted() {
        return this.executed.get();
    }
    
    public final <E extends IOException> E messageDone$okhttp(final Exchange exchange, final boolean b, final boolean b2, final E e) {
        e.f((Object)exchange, "exchange");
        if (!e.a((Object)exchange, (Object)this.exchange)) {
            return e;
        }
        monitorenter(this);
        boolean b3 = false;
        final boolean b4 = false;
        int n = 0;
        Label_0140: {
            Label_0058: {
                Label_0047: {
                    if (b) {
                        Label_0187: {
                            try {
                                if (this.requestBodyOpen) {
                                    break Label_0058;
                                }
                            }
                            finally {
                                break Label_0187;
                            }
                            break Label_0047;
                        }
                        monitorexit(this);
                    }
                }
                if (!b2 || !this.responseBodyOpen) {
                    n = 0;
                    break Label_0140;
                }
            }
            if (b) {
                this.requestBodyOpen = false;
            }
            if (b2) {
                this.responseBodyOpen = false;
            }
            final boolean requestBodyOpen = this.requestBodyOpen;
            b3 = (!requestBodyOpen && !this.responseBodyOpen);
            n = (b4 ? 1 : 0);
            if (!requestBodyOpen) {
                n = (b4 ? 1 : 0);
                if (!this.responseBodyOpen) {
                    n = (b4 ? 1 : 0);
                    if (!this.expectMoreExchanges) {
                        n = 1;
                    }
                }
            }
        }
        final j a = j.a;
        monitorexit(this);
        if (b3) {
            this.exchange = null;
            final RealConnection connection = this.connection;
            if (connection != null) {
                connection.incrementSuccessCount$okhttp();
            }
        }
        if (n != 0) {
            return this.callDone(e);
        }
        return e;
    }
    
    public final IOException noMoreExchanges$okhttp(final IOException ex) {
        synchronized (this) {
            final boolean expectMoreExchanges = this.expectMoreExchanges;
            int n2;
            final int n = n2 = 0;
            if (expectMoreExchanges) {
                this.expectMoreExchanges = false;
                n2 = n;
                if (!this.requestBodyOpen) {
                    n2 = n;
                    if (!this.responseBodyOpen) {
                        n2 = 1;
                    }
                }
            }
            final j a = j.a;
            monitorexit(this);
            IOException callDone = ex;
            if (n2 != 0) {
                callDone = this.callDone(ex);
            }
            return callDone;
        }
    }
    
    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }
    
    public final Socket releaseConnectionNoEvents$okhttp() {
        final RealConnection connection = this.connection;
        e.c((Object)connection);
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(connection)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(connection);
            throw new AssertionError((Object)t.toString());
        }
        final List<Reference<RealCall>> calls = connection.getCalls();
        final Iterator<Reference<RealCall>> iterator = calls.iterator();
        boolean b = false;
        int n = 0;
        while (true) {
            while (iterator.hasNext()) {
                if (e.a(((Reference<Object>)iterator.next()).get(), (Object)this)) {
                    if (n != -1) {
                        b = true;
                    }
                    if (b) {
                        calls.remove(n);
                        this.connection = null;
                        if (calls.isEmpty()) {
                            connection.setIdleAtNs(System.nanoTime());
                            if (this.connectionPool.connectionBecameIdle(connection)) {
                                return connection.socket();
                            }
                        }
                        return null;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                else {
                    ++n;
                }
            }
            n = -1;
            continue;
        }
    }
    
    public Request request() {
        return this.originalRequest;
    }
    
    public final boolean retryAfterFailure() {
        final Exchange exchange = this.exchange;
        final boolean b = false;
        final boolean b2 = exchange != null && exchange.getHasFailure$okhttp();
        boolean b3 = b;
        if (b2) {
            final ExchangeFinder exchangeFinder = this.exchangeFinder;
            e.c((Object)exchangeFinder);
            final RoutePlanner routePlanner = exchangeFinder.getRoutePlanner();
            final Exchange exchange2 = this.exchange;
            RealConnection connection$okhttp;
            if (exchange2 == null) {
                connection$okhttp = null;
            }
            else {
                connection$okhttp = exchange2.getConnection$okhttp();
            }
            b3 = b;
            if (routePlanner.hasNext(connection$okhttp)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public h0 timeout() {
        return (h0)this.timeout;
    }
    
    public final void timeoutEarlyExit() {
        if (this.timeoutEarlyExit ^ true) {
            this.timeoutEarlyExit = true;
            ((fk2.a)this.timeout).exit();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    @Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 " }, d2 = { "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "Lokhttp3/internal/connection/RealCall;", "other", "Lcg2/j;", "reuseCallsPerHostFrom", "Ljava/util/concurrent/ExecutorService;", "executorService", "executeOn", "run", "Lokhttp3/Callback;", "responseCallback", "Lokhttp3/Callback;", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "callsPerHost", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "", "getHost", "()Ljava/lang/String;", "host", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "request", "getCall", "()Lokhttp3/internal/connection/RealCall;", "call", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class AsyncCall implements Runnable
    {
        private volatile AtomicInteger callsPerHost;
        private final Callback responseCallback;
        public final RealCall this$0;
        
        public AsyncCall(final RealCall this$0, final Callback responseCallback) {
            e.f((Object)this$0, "this$0");
            e.f((Object)responseCallback, "responseCallback");
            this.this$0 = this$0;
            this.responseCallback = responseCallback;
            this.callsPerHost = new AtomicInteger(0);
        }
        
        public final void executeOn(final ExecutorService executorService) {
            e.f((Object)executorService, "executorService");
            final Dispatcher dispatcher = this.this$0.getClient().dispatcher();
            if (_UtilJvmKt.assertionsEnabled) {
                if (Thread.holdsLock(dispatcher)) {
                    final StringBuilder t = a.t("Thread ");
                    t.append((Object)Thread.currentThread().getName());
                    t.append(" MUST NOT hold lock on ");
                    t.append(dispatcher);
                    throw new AssertionError((Object)t.toString());
                }
            }
            try {
                try {
                    executorService.execute(this);
                }
                finally {}
            }
            catch (final RejectedExecutionException ex) {
                final InterruptedIOException ex2 = new InterruptedIOException("executor rejected");
                ex2.initCause(ex);
                this.this$0.noMoreExchanges$okhttp(ex2);
                this.responseCallback.onFailure((Call)this.this$0, (IOException)ex2);
                this.this$0.getClient().dispatcher().finished$okhttp(this);
            }
            return;
            this.this$0.getClient().dispatcher().finished$okhttp(this);
        }
        
        public final RealCall getCall() {
            return this.this$0;
        }
        
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }
        
        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }
        
        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }
        
        public final void reuseCallsPerHostFrom(final AsyncCall asyncCall) {
            e.f((Object)asyncCall, "other");
            this.callsPerHost = asyncCall.callsPerHost;
        }
        
        @Override
        public void run() {
            final String l = e.l((Object)this.this$0.redactedUrl$okhttp(), "OkHttp ");
            final RealCall this$0 = this.this$0;
            final Thread currentThread = Thread.currentThread();
            final String name = currentThread.getName();
            currentThread.setName(l);
            try {
                while (true) {
                    ((fk2.a)RealCall.access$getTimeout$p(this$0)).enter();
                    while (true) {
                        boolean b;
                        try {
                            final Response responseWithInterceptorChain$okhttp = this$0.getResponseWithInterceptorChain$okhttp();
                            try {
                                this.responseCallback.onResponse((Call)this$0, responseWithInterceptorChain$okhttp);
                                final Dispatcher dispatcher = this$0.getClient().dispatcher();
                                dispatcher.finished$okhttp(this);
                            }
                            catch (final IOException ex) {}
                        }
                        catch (final IOException ex2) {
                            b = false;
                        }
                        finally {
                            b = false;
                        }
                        final IOException ex2;
                        try {
                            this$0.cancel();
                            if (!b) {
                                final IOException ex3 = new IOException(e.l((Object)ex2, "canceled due to "));
                                xd.a.t((Throwable)ex3, (Throwable)ex2);
                                this.responseCallback.onFailure((Call)this$0, ex3);
                            }
                            throw ex2;
                        }
                        finally {}
                        if (b) {
                            Platform.Companion.get().log(e.l((Object)RealCall.access$toLoggableString(this$0), "Callback failure for "), 4, (Throwable)ex2);
                        }
                        else {
                            this.responseCallback.onFailure((Call)this$0, ex2);
                        }
                        final Dispatcher dispatcher = this$0.getClient().dispatcher();
                        continue;
                    }
                }
            }
            finally {
                currentThread.setName(name);
            }
        }
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "callStackTrace", "", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "getCallStackTrace", "()Ljava/lang/Object;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class CallReference extends WeakReference<RealCall>
    {
        private final Object callStackTrace;
        
        public CallReference(final RealCall realCall, final Object callStackTrace) {
            e.f((Object)realCall, "referent");
            super(realCall);
            this.callStackTrace = callStackTrace;
        }
        
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }
}
