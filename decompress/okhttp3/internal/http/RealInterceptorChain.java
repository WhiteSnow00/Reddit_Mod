// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http;

import okhttp3.internal._UtilJvmKt;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import okhttp3.Response;
import okhttp3.Connection;
import okhttp3.Call;
import ng2.e;
import okhttp3.Request;
import okhttp3.Interceptor;
import java.util.List;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import kotlin.Metadata;
import okhttp3.Interceptor$Chain;

@Metadata(d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0002\u0010\u0010J\b\u0010\u0002\u001a\u00020\u001cH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010(\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006)" }, d2 = { "Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "call", "Lokhttp3/internal/connection/RealCall;", "interceptors", "", "Lokhttp3/Interceptor;", "index", "", "exchange", "Lokhttp3/internal/connection/Exchange;", "request", "Lokhttp3/Request;", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "calls", "getConnectTimeoutMillis$okhttp", "()I", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getReadTimeoutMillis$okhttp", "getRequest$okhttp", "()Lokhttp3/Request;", "getWriteTimeoutMillis$okhttp", "Lokhttp3/Call;", "connection", "Lokhttp3/Connection;", "copy", "copy$okhttp", "proceed", "Lokhttp3/Response;", "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class RealInterceptorChain implements Interceptor$Chain
{
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    private final Exchange exchange;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeoutMillis;
    private final Request request;
    private final int writeTimeoutMillis;
    
    public RealInterceptorChain(final RealCall call, final List<? extends Interceptor> interceptors, final int index, final Exchange exchange, final Request request, final int connectTimeoutMillis, final int readTimeoutMillis, final int writeTimeoutMillis) {
        e.f((Object)call, "call");
        e.f((Object)interceptors, "interceptors");
        e.f((Object)request, "request");
        this.call = call;
        this.interceptors = (List<Interceptor>)interceptors;
        this.index = index;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = connectTimeoutMillis;
        this.readTimeoutMillis = readTimeoutMillis;
        this.writeTimeoutMillis = writeTimeoutMillis;
    }
    
    public static RealInterceptorChain copy$okhttp$default(final RealInterceptorChain realInterceptorChain, int index, Exchange exchange, Request request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            index = realInterceptorChain.index;
        }
        if ((n & 0x2) != 0x0) {
            exchange = realInterceptorChain.exchange;
        }
        if ((n & 0x4) != 0x0) {
            request = realInterceptorChain.request;
        }
        if ((n & 0x8) != 0x0) {
            connectTimeoutMillis = realInterceptorChain.connectTimeoutMillis;
        }
        if ((n & 0x10) != 0x0) {
            readTimeoutMillis = realInterceptorChain.readTimeoutMillis;
        }
        if ((n & 0x20) != 0x0) {
            writeTimeoutMillis = realInterceptorChain.writeTimeoutMillis;
        }
        return realInterceptorChain.copy$okhttp(index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }
    
    public Call call() {
        return (Call)this.call;
    }
    
    public int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }
    
    public Connection connection() {
        final Exchange exchange = this.exchange;
        Object connection$okhttp;
        if (exchange == null) {
            connection$okhttp = null;
        }
        else {
            connection$okhttp = exchange.getConnection$okhttp();
        }
        return (Connection)connection$okhttp;
    }
    
    public final RealInterceptorChain copy$okhttp(final int n, final Exchange exchange, final Request request, final int n2, final int n3, final int n4) {
        e.f((Object)request, "request");
        return new RealInterceptorChain(this.call, this.interceptors, n, exchange, request, n2, n3, n4);
    }
    
    public final RealCall getCall$okhttp() {
        return this.call;
    }
    
    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }
    
    public final Exchange getExchange$okhttp() {
        return this.exchange;
    }
    
    public final int getReadTimeoutMillis$okhttp() {
        return this.readTimeoutMillis;
    }
    
    public final Request getRequest$okhttp() {
        return this.request;
    }
    
    public final int getWriteTimeoutMillis$okhttp() {
        return this.writeTimeoutMillis;
    }
    
    public Response proceed(final Request request) throws IOException {
        e.f((Object)request, "request");
        final int index = this.index;
        final int size = this.interceptors.size();
        final int n = 0;
        if (index >= size) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ++this.calls;
        final Exchange exchange = this.exchange;
        if (exchange != null) {
            if (!exchange.getFinder$okhttp().getRoutePlanner().sameHostAndPort(request.url())) {
                final StringBuilder t = a.t("network interceptor ");
                t.append(this.interceptors.get(this.index - 1));
                t.append(" must retain the same host and port");
                throw new IllegalStateException(t.toString().toString());
            }
            if (this.calls != 1) {
                final StringBuilder t2 = a.t("network interceptor ");
                t2.append(this.interceptors.get(this.index - 1));
                t2.append(" must call proceed() exactly once");
                throw new IllegalStateException(t2.toString().toString());
            }
        }
        final RealInterceptorChain copy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        final Interceptor interceptor = this.interceptors.get(this.index);
        final Response intercept = interceptor.intercept((Interceptor$Chain)copy$okhttp$default);
        if (intercept == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("interceptor ");
            sb.append(interceptor);
            sb.append(" returned null");
            throw new NullPointerException(sb.toString());
        }
        if (this.exchange != null && (this.index + 1 < this.interceptors.size() && copy$okhttp$default.calls != 1)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("network interceptor ");
            sb2.append(interceptor);
            sb2.append(" must call proceed() exactly once");
            throw new IllegalStateException(sb2.toString().toString());
        }
        int n2 = n;
        if (intercept.body() != null) {
            n2 = 1;
        }
        if (n2 != 0) {
            return intercept;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("interceptor ");
        sb3.append(interceptor);
        sb3.append(" returned a response with no body");
        throw new IllegalStateException(sb3.toString().toString());
    }
    
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }
    
    public Request request() {
        return this.request;
    }
    
    public Interceptor$Chain withConnectTimeout(final int n, final TimeUnit timeUnit) {
        e.f((Object)timeUnit, "unit");
        if (this.exchange == null) {
            return (Interceptor$Chain)copy$okhttp$default(this, 0, null, null, _UtilJvmKt.checkDuration("connectTimeout", n, timeUnit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }
    
    public Interceptor$Chain withReadTimeout(final int n, final TimeUnit timeUnit) {
        e.f((Object)timeUnit, "unit");
        if (this.exchange == null) {
            return (Interceptor$Chain)copy$okhttp$default(this, 0, null, null, 0, _UtilJvmKt.checkDuration("readTimeout", n, timeUnit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }
    
    public Interceptor$Chain withWriteTimeout(final int n, final TimeUnit timeUnit) {
        e.f((Object)timeUnit, "unit");
        if (this.exchange == null) {
            return (Interceptor$Chain)copy$okhttp$default(this, 0, null, null, 0, 0, _UtilJvmKt.checkDuration("writeTimeout", n, timeUnit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }
    
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}
