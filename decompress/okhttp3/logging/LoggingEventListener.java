// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.logging;

import okhttp3.EventListener$Factory;
import okhttp3.Handshake;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.InetAddress;
import java.util.List;
import okhttp3.Connection;
import okhttp3.Protocol;
import java.net.Proxy;
import java.net.InetSocketAddress;
import java.io.IOException;
import ng2.e;
import okhttp3.Response;
import okhttp3.Call;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import okhttp3.EventListener;

@Metadata(bv = {}, d1 = { "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001FB\u0011\b\u0002\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0016J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J*\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J2\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020/H\u0016J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\rH\u0002R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006G" }, d2 = { "Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "Lokhttp3/Call;", "call", "Lcg2/j;", "callStart", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "", "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", "protocol", "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lokhttp3/Connection;", "connection", "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "message", "logWithTime", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "startNs", "J", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Factory", "logging-interceptor" }, k = 1, mv = { 1, 6, 0 })
public final class LoggingEventListener extends EventListener
{
    private final HttpLoggingInterceptor$Logger logger;
    private long startNs;
    
    private LoggingEventListener(final HttpLoggingInterceptor$Logger logger) {
        this.logger = logger;
    }
    
    public LoggingEventListener(final HttpLoggingInterceptor$Logger httpLoggingInterceptor$Logger, final DefaultConstructorMarker defaultConstructorMarker) {
        this(httpLoggingInterceptor$Logger);
    }
    
    private final void logWithTime(final String s) {
        final long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        final HttpLoggingInterceptor$Logger logger = this.logger;
        final StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(millis);
        sb.append(" ms] ");
        sb.append(s);
        logger.log(sb.toString());
    }
    
    public void cacheConditionalHit(final Call call, final Response response) {
        e.f((Object)call, "call");
        e.f((Object)response, "cachedResponse");
        this.logWithTime(e.l((Object)response, "cacheConditionalHit: "));
    }
    
    public void cacheHit(final Call call, final Response response) {
        e.f((Object)call, "call");
        e.f((Object)response, "response");
        this.logWithTime(e.l((Object)response, "cacheHit: "));
    }
    
    public void cacheMiss(final Call call) {
        e.f((Object)call, "call");
        this.logWithTime("cacheMiss");
    }
    
    public void callEnd(final Call call) {
        e.f((Object)call, "call");
        this.logWithTime("callEnd");
    }
    
    public void callFailed(final Call call, final IOException ex) {
        e.f((Object)call, "call");
        e.f((Object)ex, "ioe");
        this.logWithTime(e.l((Object)ex, "callFailed: "));
    }
    
    public void callStart(final Call call) {
        e.f((Object)call, "call");
        this.startNs = System.nanoTime();
        this.logWithTime(e.l((Object)call.request(), "callStart: "));
    }
    
    public void canceled(final Call call) {
        e.f((Object)call, "call");
        this.logWithTime("canceled");
    }
    
    public void connectEnd(final Call call, final InetSocketAddress inetSocketAddress, final Proxy proxy, final Protocol protocol) {
        e.f((Object)call, "call");
        e.f((Object)inetSocketAddress, "inetSocketAddress");
        e.f((Object)proxy, "proxy");
        this.logWithTime(e.l((Object)protocol, "connectEnd: "));
    }
    
    public void connectFailed(final Call call, final InetSocketAddress inetSocketAddress, final Proxy proxy, final Protocol protocol, final IOException ex) {
        e.f((Object)call, "call");
        e.f((Object)inetSocketAddress, "inetSocketAddress");
        e.f((Object)proxy, "proxy");
        e.f((Object)ex, "ioe");
        final StringBuilder sb = new StringBuilder();
        sb.append("connectFailed: ");
        sb.append(protocol);
        sb.append(' ');
        sb.append(ex);
        this.logWithTime(sb.toString());
    }
    
    public void connectStart(final Call call, final InetSocketAddress inetSocketAddress, final Proxy proxy) {
        e.f((Object)call, "call");
        e.f((Object)inetSocketAddress, "inetSocketAddress");
        e.f((Object)proxy, "proxy");
        final StringBuilder sb = new StringBuilder();
        sb.append("connectStart: ");
        sb.append(inetSocketAddress);
        sb.append(' ');
        sb.append(proxy);
        this.logWithTime(sb.toString());
    }
    
    public void connectionAcquired(final Call call, final Connection connection) {
        e.f((Object)call, "call");
        e.f((Object)connection, "connection");
        this.logWithTime(e.l((Object)connection, "connectionAcquired: "));
    }
    
    public void connectionReleased(final Call call, final Connection connection) {
        e.f((Object)call, "call");
        e.f((Object)connection, "connection");
        this.logWithTime("connectionReleased");
    }
    
    public void dnsEnd(final Call call, final String s, final List<? extends InetAddress> list) {
        e.f((Object)call, "call");
        e.f((Object)s, "domainName");
        e.f((Object)list, "inetAddressList");
        this.logWithTime(e.l((Object)list, "dnsEnd: "));
    }
    
    public void dnsStart(final Call call, final String s) {
        e.f((Object)call, "call");
        e.f((Object)s, "domainName");
        this.logWithTime(e.l((Object)s, "dnsStart: "));
    }
    
    public void proxySelectEnd(final Call call, final HttpUrl httpUrl, final List<? extends Proxy> list) {
        e.f((Object)call, "call");
        e.f((Object)httpUrl, "url");
        e.f((Object)list, "proxies");
        this.logWithTime(e.l((Object)list, "proxySelectEnd: "));
    }
    
    public void proxySelectStart(final Call call, final HttpUrl httpUrl) {
        e.f((Object)call, "call");
        e.f((Object)httpUrl, "url");
        this.logWithTime(e.l((Object)httpUrl, "proxySelectStart: "));
    }
    
    public void requestBodyEnd(final Call call, final long n) {
        e.f((Object)call, "call");
        this.logWithTime(e.l((Object)n, "requestBodyEnd: byteCount="));
    }
    
    public void requestBodyStart(final Call call) {
        e.f((Object)call, "call");
        this.logWithTime("requestBodyStart");
    }
    
    public void requestFailed(final Call call, final IOException ex) {
        e.f((Object)call, "call");
        e.f((Object)ex, "ioe");
        this.logWithTime(e.l((Object)ex, "requestFailed: "));
    }
    
    public void requestHeadersEnd(final Call call, final Request request) {
        e.f((Object)call, "call");
        e.f((Object)request, "request");
        this.logWithTime("requestHeadersEnd");
    }
    
    public void requestHeadersStart(final Call call) {
        e.f((Object)call, "call");
        this.logWithTime("requestHeadersStart");
    }
    
    public void responseBodyEnd(final Call call, final long n) {
        e.f((Object)call, "call");
        this.logWithTime(e.l((Object)n, "responseBodyEnd: byteCount="));
    }
    
    public void responseBodyStart(final Call call) {
        e.f((Object)call, "call");
        this.logWithTime("responseBodyStart");
    }
    
    public void responseFailed(final Call call, final IOException ex) {
        e.f((Object)call, "call");
        e.f((Object)ex, "ioe");
        this.logWithTime(e.l((Object)ex, "responseFailed: "));
    }
    
    public void responseHeadersEnd(final Call call, final Response response) {
        e.f((Object)call, "call");
        e.f((Object)response, "response");
        this.logWithTime(e.l((Object)response, "responseHeadersEnd: "));
    }
    
    public void responseHeadersStart(final Call call) {
        e.f((Object)call, "call");
        this.logWithTime("responseHeadersStart");
    }
    
    public void satisfactionFailure(final Call call, final Response response) {
        e.f((Object)call, "call");
        e.f((Object)response, "response");
        this.logWithTime(e.l((Object)response, "satisfactionFailure: "));
    }
    
    public void secureConnectEnd(final Call call, final Handshake handshake) {
        e.f((Object)call, "call");
        this.logWithTime(e.l((Object)handshake, "secureConnectEnd: "));
    }
    
    public void secureConnectStart(final Call call) {
        e.f((Object)call, "call");
        this.logWithTime("secureConnectStart");
    }
    
    @Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t" }, d2 = { "Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "create", "Lokhttp3/EventListener;", "call", "Lokhttp3/Call;", "logging-interceptor" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static class Factory implements EventListener$Factory
    {
        private final HttpLoggingInterceptor$Logger logger;
        
        public Factory() {
            this(null, 1, null);
        }
        
        public Factory(final HttpLoggingInterceptor$Logger logger) {
            e.f((Object)logger, "logger");
            this.logger = logger;
        }
        
        public Factory(HttpLoggingInterceptor$Logger default1, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
            if ((n & 0x1) != 0x0) {
                default1 = HttpLoggingInterceptor$Logger.DEFAULT;
            }
            this(default1);
        }
        
        public EventListener create(final Call call) {
            e.f((Object)call, "call");
            return new LoggingEventListener(this.logger, null);
        }
    }
}
