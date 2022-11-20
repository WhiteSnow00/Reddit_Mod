// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http1;

import okhttp3.internal._UtilCommonKt;
import okhttp3.CookieJar;
import kotlin.text.b;
import fk2.c;
import java.net.Proxy;
import okhttp3.internal.http.RequestLine;
import java.util.concurrent.TimeUnit;
import java.io.EOFException;
import java.io.IOException;
import okhttp3.internal.http.StatusLine;
import okhttp3.Response$Builder;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.HttpHeaders;
import java.net.ProtocolException;
import fk2.g0;
import okhttp3.HttpUrl;
import fk2.e0;
import okhttp3.Response;
import xi2.j;
import okhttp3.Request;
import fk2.h0;
import fk2.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import fk2.f;
import fk2.e;
import okhttp3.OkHttpClient;
import kotlin.Metadata;
import okhttp3.internal.http.ExchangeCodec;

@Metadata(bv = {}, d1 = { "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 B2\u00020\u0001:\u0007CDEBFGHB)\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0016\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u001d\u001a\u00020\u0006H\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0002J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020\u000eH\u0002J\u0010\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00106R\u0011\u00107\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0018\u00109\u001a\u00020\u0018*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0018\u00109\u001a\u00020\u0018*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010;¨\u0006I" }, d2 = { "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/Request;", "request", "", "contentLength", "Lfk2/e0;", "createRequestBody", "Lcg2/j;", "cancel", "writeRequestHeaders", "Lokhttp3/Response;", "response", "reportedContentLength", "Lfk2/g0;", "openResponseBodySource", "Lokhttp3/Headers;", "trailers", "flushRequest", "finishRequest", "headers", "", "requestLine", "writeRequest", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "skipConnectBody", "newChunkedSink", "newKnownLengthSink", "length", "newFixedLengthSource", "Lokhttp3/HttpUrl;", "url", "newChunkedSource", "newUnknownLengthSource", "Lfk2/m;", "timeout", "detachTimeout", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "carrier", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "getCarrier", "()Lokhttp3/internal/http/ExchangeCodec$Carrier;", "", "state", "I", "Lokhttp3/internal/http1/HeadersReader;", "headersReader", "Lokhttp3/internal/http1/HeadersReader;", "Lokhttp3/Headers;", "isClosed", "()Z", "isChunked", "(Lokhttp3/Response;)Z", "(Lokhttp3/Request;)Z", "Lfk2/f;", "source", "Lfk2/e;", "sink", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/ExchangeCodec$Carrier;Lfk2/f;Lfk2/e;)V", "Companion", "AbstractSource", "ChunkedSink", "ChunkedSource", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class Http1ExchangeCodec implements ExchangeCodec
{
    public static final Companion Companion;
    private static final long NO_CHUNK_YET = -1L;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final Carrier carrier;
    private final OkHttpClient client;
    private final HeadersReader headersReader;
    private final e sink;
    private final f source;
    private int state;
    private Headers trailers;
    
    static {
        Companion = new Companion(null);
    }
    
    public Http1ExchangeCodec(final OkHttpClient client, final Carrier carrier, final f source, final e sink) {
        ng2.e.f((Object)carrier, "carrier");
        ng2.e.f((Object)source, "source");
        ng2.e.f((Object)sink, "sink");
        this.client = client;
        this.carrier = carrier;
        this.source = source;
        this.sink = sink;
        this.headersReader = new HeadersReader(source);
    }
    
    public static final void access$detachTimeout(final Http1ExchangeCodec http1ExchangeCodec, final m m) {
        http1ExchangeCodec.detachTimeout(m);
    }
    
    public static final OkHttpClient access$getClient$p(final Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.client;
    }
    
    public static final HeadersReader access$getHeadersReader$p(final Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.headersReader;
    }
    
    public static final e access$getSink$p(final Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.sink;
    }
    
    public static final f access$getSource$p(final Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.source;
    }
    
    public static final int access$getState$p(final Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.state;
    }
    
    public static final Headers access$getTrailers$p(final Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.trailers;
    }
    
    public static final void access$setState$p(final Http1ExchangeCodec http1ExchangeCodec, final int state) {
        http1ExchangeCodec.state = state;
    }
    
    public static final void access$setTrailers$p(final Http1ExchangeCodec http1ExchangeCodec, final Headers trailers) {
        http1ExchangeCodec.trailers = trailers;
    }
    
    private final void detachTimeout(final m m) {
        final h0 a = m.a;
        final h0 none = h0.NONE;
        ng2.e.f((Object)none, "delegate");
        m.a = none;
        a.clearDeadline();
        a.clearTimeout();
    }
    
    private final boolean isChunked(final Request request) {
        return j.z0("chunked", request.header("Transfer-Encoding"), true);
    }
    
    private final boolean isChunked(final Response response) {
        return j.z0("chunked", Response.header$default(response, "Transfer-Encoding", (String)null, 2, (Object)null), true);
    }
    
    private final e0 newChunkedSink() {
        final int state = this.state;
        boolean b = true;
        if (state != 1) {
            b = false;
        }
        if (b) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(ng2.e.l((Object)state, "state: ").toString());
    }
    
    private final g0 newChunkedSource(final HttpUrl httpUrl) {
        final int state = this.state;
        if (state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        throw new IllegalStateException(ng2.e.l((Object)state, "state: ").toString());
    }
    
    private final g0 newFixedLengthSource(final long n) {
        final int state = this.state;
        if (state == 4) {
            this.state = 5;
            return new FixedLengthSource(n);
        }
        throw new IllegalStateException(ng2.e.l((Object)state, "state: ").toString());
    }
    
    private final e0 newKnownLengthSink() {
        final int state = this.state;
        boolean b = true;
        if (state != 1) {
            b = false;
        }
        if (b) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(ng2.e.l((Object)state, "state: ").toString());
    }
    
    private final g0 newUnknownLengthSource() {
        final int state = this.state;
        if (state == 4) {
            this.state = 5;
            this.getCarrier().noNewExchanges();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(ng2.e.l((Object)state, "state: ").toString());
    }
    
    @Override
    public void cancel() {
        this.getCarrier().cancel();
    }
    
    @Override
    public e0 createRequestBody(final Request request, final long n) {
        ng2.e.f((Object)request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        e0 e0;
        if (this.isChunked(request)) {
            e0 = this.newChunkedSink();
        }
        else {
            if (n == -1L) {
                throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
            }
            e0 = this.newKnownLengthSink();
        }
        return e0;
    }
    
    @Override
    public void finishRequest() {
        this.sink.flush();
    }
    
    @Override
    public void flushRequest() {
        this.sink.flush();
    }
    
    @Override
    public Carrier getCarrier() {
        return this.carrier;
    }
    
    public final boolean isClosed() {
        return this.state == 6;
    }
    
    @Override
    public g0 openResponseBodySource(final Response response) {
        ng2.e.f((Object)response, "response");
        g0 g0;
        if (!HttpHeaders.promisesBody(response)) {
            g0 = this.newFixedLengthSource(0L);
        }
        else if (this.isChunked(response)) {
            g0 = this.newChunkedSource(response.request().url());
        }
        else {
            final long headersContentLength = _UtilJvmKt.headersContentLength(response);
            if (headersContentLength != -1L) {
                g0 = this.newFixedLengthSource(headersContentLength);
            }
            else {
                g0 = this.newUnknownLengthSource();
            }
        }
        return g0;
    }
    
    @Override
    public Response$Builder readResponseHeaders(final boolean b) {
        final int state = this.state;
        int n2;
        final int n = n2 = 1;
        if (state != 1) {
            n2 = n;
            if (state != 2) {
                if (state == 3) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
            }
        }
        if (n2 != 0) {
            try {
                final StatusLine parse = StatusLine.Companion.parse(this.headersReader.readLine());
                Response$Builder headers = new Response$Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
                if (b && parse.code == 100) {
                    headers = null;
                }
                else if (parse.code == 100) {
                    this.state = 3;
                }
                else {
                    this.state = 4;
                }
                return headers;
            }
            catch (final EOFException ex) {
                throw new IOException(ng2.e.l((Object)this.getCarrier().getRoute().address().url().redact(), "unexpected end of stream on "), ex);
            }
        }
        throw new IllegalStateException(ng2.e.l((Object)state, "state: ").toString());
    }
    
    @Override
    public long reportedContentLength(final Response response) {
        ng2.e.f((Object)response, "response");
        long headersContentLength;
        if (!HttpHeaders.promisesBody(response)) {
            headersContentLength = 0L;
        }
        else if (this.isChunked(response)) {
            headersContentLength = -1L;
        }
        else {
            headersContentLength = _UtilJvmKt.headersContentLength(response);
        }
        return headersContentLength;
    }
    
    public final void skipConnectBody(final Response response) {
        ng2.e.f((Object)response, "response");
        final long headersContentLength = _UtilJvmKt.headersContentLength(response);
        if (headersContentLength == -1L) {
            return;
        }
        final g0 fixedLengthSource = this.newFixedLengthSource(headersContentLength);
        _UtilJvmKt.skipAll(fixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        fixedLengthSource.close();
    }
    
    @Override
    public Headers trailers() {
        if (this.state == 6) {
            Headers headers;
            if ((headers = this.trailers) == null) {
                headers = _UtilJvmKt.EMPTY_HEADERS;
            }
            return headers;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }
    
    public final void writeRequest(final Headers headers, final String s) {
        ng2.e.f((Object)headers, "headers");
        ng2.e.f((Object)s, "requestLine");
        final int state = this.state;
        final int n = 0;
        if (state == 0) {
            this.sink.a1(s).a1("\r\n");
            for (int size = headers.size(), i = n; i < size; ++i) {
                this.sink.a1(headers.name(i)).a1(": ").a1(headers.value(i)).a1("\r\n");
            }
            this.sink.a1("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException(ng2.e.l((Object)state, "state: ").toString());
    }
    
    @Override
    public void writeRequestHeaders(final Request request) {
        ng2.e.f((Object)request, "request");
        final RequestLine instance = RequestLine.INSTANCE;
        final Proxy.Type type = this.getCarrier().getRoute().proxy().type();
        ng2.e.e((Object)type, "carrier.route.proxy.type()");
        this.writeRequest(request.headers(), instance.get(request, type));
    }
    
    @Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\"\u0010\f\u001a\u00020\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00128\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lfk2/g0;", "Lfk2/h0;", "timeout", "Lfk2/c;", "sink", "", "byteCount", "read", "Lcg2/j;", "responseBodyComplete", "", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "Lfk2/m;", "Lfk2/m;", "getTimeout", "()Lfk2/m;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public abstract class AbstractSource implements g0
    {
        private boolean closed;
        public final Http1ExchangeCodec this$0;
        private final m timeout;
        
        public AbstractSource(final Http1ExchangeCodec this$0) {
            ng2.e.f((Object)this$0, "this$0");
            this.this$0 = this$0;
            this.timeout = new m(((g0)Http1ExchangeCodec.access$getSource$p(this$0)).timeout());
        }
        
        @Override
        public abstract void close() throws IOException;
        
        public final boolean getClosed() {
            return this.closed;
        }
        
        public final m getTimeout() {
            return this.timeout;
        }
        
        @Override
        public long read(final c c, long read) {
            ng2.e.f((Object)c, "sink");
            try {
                read = ((g0)Http1ExchangeCodec.access$getSource$p(this.this$0)).read(c, read);
                return read;
            }
            catch (final IOException ex) {
                this.this$0.getCarrier().noNewExchanges();
                this.responseBodyComplete();
                throw ex;
            }
        }
        
        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.access$getState$p(this.this$0) == 6) {
                return;
            }
            if (Http1ExchangeCodec.access$getState$p(this.this$0) == 5) {
                Http1ExchangeCodec.access$detachTimeout(this.this$0, this.timeout);
                Http1ExchangeCodec.access$setState$p(this.this$0, 6);
                return;
            }
            throw new IllegalStateException(ng2.e.l((Object)Http1ExchangeCodec.access$getState$p(this.this$0), "state: "));
        }
        
        public final void setClosed(final boolean closed) {
            this.closed = closed;
        }
        
        @Override
        public h0 timeout() {
            return (h0)this.timeout;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011" }, d2 = { "Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lfk2/e0;", "Lfk2/h0;", "timeout", "Lfk2/c;", "source", "", "byteCount", "Lcg2/j;", "write", "flush", "close", "", "closed", "Z", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class ChunkedSink implements e0
    {
        private boolean closed;
        public final Http1ExchangeCodec this$0;
        private final m timeout;
        
        public ChunkedSink(final Http1ExchangeCodec this$0) {
            ng2.e.f((Object)this$0, "this$0");
            this.this$0 = this$0;
            this.timeout = new m(((e0)Http1ExchangeCodec.access$getSink$p(this$0)).timeout());
        }
        
        @Override
        public void close() {
            synchronized (this) {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                Http1ExchangeCodec.access$getSink$p(this.this$0).a1("0\r\n\r\n");
                Http1ExchangeCodec.access$detachTimeout(this.this$0, this.timeout);
                Http1ExchangeCodec.access$setState$p(this.this$0, 3);
            }
        }
        
        @Override
        public void flush() {
            synchronized (this) {
                if (this.closed) {
                    return;
                }
                Http1ExchangeCodec.access$getSink$p(this.this$0).flush();
            }
        }
        
        @Override
        public h0 timeout() {
            return (h0)this.timeout;
        }
        
        @Override
        public void write(final c c, final long n) {
            ng2.e.f((Object)c, "source");
            if (!(this.closed ^ true)) {
                throw new IllegalStateException("closed".toString());
            }
            if (n == 0L) {
                return;
            }
            Http1ExchangeCodec.access$getSink$p(this.this$0).i(n);
            Http1ExchangeCodec.access$getSink$p(this.this$0).a1("\r\n");
            ((e0)Http1ExchangeCodec.access$getSink$p(this.this$0)).write(c, n);
            Http1ExchangeCodec.access$getSink$p(this.this$0).a1("\r\n");
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lcg2/j;", "readChunkSize", "Lfk2/c;", "sink", "", "byteCount", "read", "close", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/HttpUrl;", "bytesRemainingInChunk", "J", "", "hasMoreChunks", "Z", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class ChunkedSource extends AbstractSource
    {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        public final Http1ExchangeCodec this$0;
        private final HttpUrl url;
        
        public ChunkedSource(final Http1ExchangeCodec this$0, final HttpUrl url) {
            ng2.e.f((Object)this$0, "this$0");
            ng2.e.f((Object)url, "url");
            this.url = url;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }
        
        private final void readChunkSize() {
            if (this.bytesRemainingInChunk != -1L) {
                Http1ExchangeCodec.access$getSource$p(this.this$0).b1();
            }
            try {
                this.bytesRemainingInChunk = Http1ExchangeCodec.access$getSource$p(this.this$0).W0();
                final String string = b.u1((CharSequence)Http1ExchangeCodec.access$getSource$p(this.this$0).b1()).toString();
                if (this.bytesRemainingInChunk >= 0L && (string.length() <= 0 || j.I0(string, ";", false))) {
                    if (this.bytesRemainingInChunk == 0L) {
                        this.hasMoreChunks = false;
                        final Http1ExchangeCodec this$0 = this.this$0;
                        Http1ExchangeCodec.access$setTrailers$p(this$0, Http1ExchangeCodec.access$getHeadersReader$p(this$0).readHeaders());
                        final OkHttpClient access$getClient$p = Http1ExchangeCodec.access$getClient$p(this.this$0);
                        ng2.e.c((Object)access$getClient$p);
                        final CookieJar cookieJar = access$getClient$p.cookieJar();
                        final HttpUrl url = this.url;
                        final Headers access$getTrailers$p = Http1ExchangeCodec.access$getTrailers$p(this.this$0);
                        ng2.e.c((Object)access$getTrailers$p);
                        HttpHeaders.receiveHeaders(cookieJar, url, access$getTrailers$p);
                        ((AbstractSource)this).responseBodyComplete();
                    }
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("expected chunk size and optional extensions but was \"");
                sb.append(this.bytesRemainingInChunk);
                sb.append(string);
                sb.append('\"');
                throw new ProtocolException(sb.toString());
            }
            catch (final NumberFormatException ex) {
                throw new ProtocolException(ex.getMessage());
            }
        }
        
        @Override
        public void close() {
            if (((AbstractSource)this).getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getCarrier().noNewExchanges();
                ((AbstractSource)this).responseBodyComplete();
            }
            ((AbstractSource)this).setClosed(true);
        }
        
        @Override
        public long read(final c c, long read) {
            ng2.e.f((Object)c, "sink");
            if (read < 0L) {
                throw new IllegalArgumentException(ng2.e.l((Object)read, "byteCount < 0: ").toString());
            }
            if (!(((AbstractSource)this).getClosed() ^ true)) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            final long bytesRemainingInChunk = this.bytesRemainingInChunk;
            if (bytesRemainingInChunk == 0L || bytesRemainingInChunk == -1L) {
                this.readChunkSize();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            read = super.read(c, Math.min(read, this.bytesRemainingInChunk));
            if (read != -1L) {
                this.bytesRemainingInChunk -= read;
                return read;
            }
            this.this$0.getCarrier().noNewExchanges();
            final ProtocolException ex = new ProtocolException("unexpected end of stream");
            ((AbstractSource)this).responseBodyComplete();
            throw ex;
        }
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r" }, d2 = { "Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;", "", "()V", "NO_CHUNK_YET", "", "STATE_CLOSED", "", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e" }, d2 = { "Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lfk2/c;", "sink", "", "byteCount", "read", "Lcg2/j;", "close", "bytesRemaining", "J", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;J)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class FixedLengthSource extends AbstractSource
    {
        private long bytesRemaining;
        public final Http1ExchangeCodec this$0;
        
        public FixedLengthSource(final Http1ExchangeCodec this$0, final long bytesRemaining) {
            ng2.e.f((Object)this$0, "this$0");
            this.bytesRemaining = bytesRemaining;
            if (bytesRemaining == 0L) {
                ((AbstractSource)this).responseBodyComplete();
            }
        }
        
        @Override
        public void close() {
            if (((AbstractSource)this).getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0L && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getCarrier().noNewExchanges();
                ((AbstractSource)this).responseBodyComplete();
            }
            ((AbstractSource)this).setClosed(true);
        }
        
        @Override
        public long read(final c c, long bytesRemaining) {
            ng2.e.f((Object)c, "sink");
            if (bytesRemaining < 0L) {
                throw new IllegalArgumentException(ng2.e.l((Object)bytesRemaining, "byteCount < 0: ").toString());
            }
            if (!(((AbstractSource)this).getClosed() ^ true)) {
                throw new IllegalStateException("closed".toString());
            }
            final long bytesRemaining2 = this.bytesRemaining;
            if (bytesRemaining2 == 0L) {
                return -1L;
            }
            final long read = super.read(c, Math.min(bytesRemaining2, bytesRemaining));
            if (read != -1L) {
                bytesRemaining = this.bytesRemaining - read;
                this.bytesRemaining = bytesRemaining;
                if (bytesRemaining == 0L) {
                    ((AbstractSource)this).responseBodyComplete();
                }
                return read;
            }
            this.this$0.getCarrier().noNewExchanges();
            final ProtocolException ex = new ProtocolException("unexpected end of stream");
            ((AbstractSource)this).responseBodyComplete();
            throw ex;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011" }, d2 = { "Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lfk2/e0;", "Lfk2/h0;", "timeout", "Lfk2/c;", "source", "", "byteCount", "Lcg2/j;", "write", "flush", "close", "", "closed", "Z", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class KnownLengthSink implements e0
    {
        private boolean closed;
        public final Http1ExchangeCodec this$0;
        private final m timeout;
        
        public KnownLengthSink(final Http1ExchangeCodec this$0) {
            ng2.e.f((Object)this$0, "this$0");
            this.this$0 = this$0;
            this.timeout = new m(((e0)Http1ExchangeCodec.access$getSink$p(this$0)).timeout());
        }
        
        @Override
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.access$detachTimeout(this.this$0, this.timeout);
            Http1ExchangeCodec.access$setState$p(this.this$0, 3);
        }
        
        @Override
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.access$getSink$p(this.this$0).flush();
        }
        
        @Override
        public h0 timeout() {
            return (h0)this.timeout;
        }
        
        @Override
        public void write(final c c, final long n) {
            ng2.e.f((Object)c, "source");
            if (this.closed ^ true) {
                _UtilCommonKt.checkOffsetAndCount(c.g, 0L, n);
                ((e0)Http1ExchangeCodec.access$getSink$p(this.this$0)).write(c, n);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f" }, d2 = { "Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lfk2/c;", "sink", "", "byteCount", "read", "Lcg2/j;", "close", "", "inputExhausted", "Z", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class UnknownLengthSource extends AbstractSource
    {
        private boolean inputExhausted;
        public final Http1ExchangeCodec this$0;
        
        public UnknownLengthSource(final Http1ExchangeCodec this$0) {
            ng2.e.f((Object)this$0, "this$0");
        }
        
        @Override
        public void close() {
            if (((AbstractSource)this).getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                ((AbstractSource)this).responseBodyComplete();
            }
            ((AbstractSource)this).setClosed(true);
        }
        
        @Override
        public long read(final c c, long read) {
            ng2.e.f((Object)c, "sink");
            if (read < 0L) {
                throw new IllegalArgumentException(ng2.e.l((Object)read, "byteCount < 0: ").toString());
            }
            if (!(((AbstractSource)this).getClosed() ^ true)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.inputExhausted) {
                return -1L;
            }
            read = super.read(c, read);
            if (read == -1L) {
                this.inputExhausted = true;
                ((AbstractSource)this).responseBodyComplete();
                return -1L;
            }
            return read;
        }
    }
}
