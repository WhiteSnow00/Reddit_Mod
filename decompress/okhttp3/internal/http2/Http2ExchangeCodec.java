// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http2;

import java.net.ProtocolException;
import okhttp3.internal.http.StatusLine;
import okhttp3.Headers$Builder;
import aq2.a;
import java.util.Locale;
import okhttp3.internal.http.RequestLine;
import java.util.ArrayList;
import fk2.h0;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.internal.http.HttpHeaders;
import java.io.IOException;
import okhttp3.Response$Builder;
import fk2.g0;
import okhttp3.Response;
import fk2.e0;
import okhttp3.Request;
import ng2.e;
import okhttp3.OkHttpClient;
import okhttp3.internal._UtilJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Protocol;
import okhttp3.internal.http.RealInterceptorChain;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http.ExchangeCodec;

@Metadata(bv = {}, d1 = { "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001/B'\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u00060" }, d2 = { "Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/Request;", "request", "", "contentLength", "Lfk2/e0;", "createRequestBody", "Lcg2/j;", "writeRequestHeaders", "flushRequest", "finishRequest", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "Lokhttp3/Response;", "response", "reportedContentLength", "Lfk2/g0;", "openResponseBodySource", "Lokhttp3/Headers;", "trailers", "cancel", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "carrier", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "getCarrier", "()Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/internal/http2/Http2Connection;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "Lokhttp3/internal/http2/Http2Stream;", "stream", "Lokhttp3/internal/http2/Http2Stream;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "canceled", "Z", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/ExchangeCodec$Carrier;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/http2/Http2Connection;)V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class Http2ExchangeCodec implements ExchangeCodec
{
    private static final String CONNECTION = "connection";
    public static final Companion Companion;
    private static final String ENCODING = "encoding";
    private static final String HOST = "host";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS;
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS;
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";
    private static final String TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String UPGRADE = "upgrade";
    private volatile boolean canceled;
    private final Carrier carrier;
    private final RealInterceptorChain chain;
    private final Http2Connection http2Connection;
    private final Protocol protocol;
    private volatile Http2Stream stream;
    
    static {
        Companion = new Companion(null);
        HTTP_2_SKIPPED_REQUEST_HEADERS = _UtilJvmKt.immutableListOf("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
        HTTP_2_SKIPPED_RESPONSE_HEADERS = _UtilJvmKt.immutableListOf("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    }
    
    public Http2ExchangeCodec(final OkHttpClient okHttpClient, final Carrier carrier, final RealInterceptorChain chain, final Http2Connection http2Connection) {
        e.f((Object)okHttpClient, "client");
        e.f((Object)carrier, "carrier");
        e.f((Object)chain, "chain");
        e.f((Object)http2Connection, "http2Connection");
        this.carrier = carrier;
        this.chain = chain;
        this.http2Connection = http2Connection;
        final List protocols = okHttpClient.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!protocols.contains(protocol)) {
            protocol = Protocol.HTTP_2;
        }
        this.protocol = protocol;
    }
    
    public static final List access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp() {
        return Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS;
    }
    
    public static final List access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp() {
        return Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS;
    }
    
    @Override
    public void cancel() {
        this.canceled = true;
        final Http2Stream stream = this.stream;
        if (stream != null) {
            stream.closeLater(ErrorCode.CANCEL);
        }
    }
    
    @Override
    public e0 createRequestBody(final Request request, final long n) {
        e.f((Object)request, "request");
        final Http2Stream stream = this.stream;
        e.c((Object)stream);
        return stream.getSink();
    }
    
    @Override
    public void finishRequest() {
        final Http2Stream stream = this.stream;
        e.c((Object)stream);
        stream.getSink().close();
    }
    
    @Override
    public void flushRequest() {
        this.http2Connection.flush();
    }
    
    @Override
    public Carrier getCarrier() {
        return this.carrier;
    }
    
    @Override
    public g0 openResponseBodySource(final Response response) {
        e.f((Object)response, "response");
        final Http2Stream stream = this.stream;
        e.c((Object)stream);
        return stream.getSource$okhttp();
    }
    
    @Override
    public Response$Builder readResponseHeaders(final boolean b) {
        final Http2Stream stream = this.stream;
        if (stream != null) {
            Response$Builder http2HeadersList;
            final Response$Builder response$Builder = http2HeadersList = Http2ExchangeCodec.Companion.readHttp2HeadersList(stream.takeHeaders(), this.protocol);
            if (b) {
                http2HeadersList = response$Builder;
                if (response$Builder.getCode$okhttp() == 100) {
                    http2HeadersList = null;
                }
            }
            return http2HeadersList;
        }
        throw new IOException("stream wasn't created");
    }
    
    @Override
    public long reportedContentLength(final Response response) {
        e.f((Object)response, "response");
        long headersContentLength;
        if (!HttpHeaders.promisesBody(response)) {
            headersContentLength = 0L;
        }
        else {
            headersContentLength = _UtilJvmKt.headersContentLength(response);
        }
        return headersContentLength;
    }
    
    @Override
    public Headers trailers() {
        final Http2Stream stream = this.stream;
        e.c((Object)stream);
        return stream.trailers();
    }
    
    @Override
    public void writeRequestHeaders(final Request request) {
        e.f((Object)request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.newStream(Http2ExchangeCodec.Companion.http2HeadersList(request), request.body() != null);
        if (!this.canceled) {
            final Http2Stream stream = this.stream;
            e.c((Object)stream);
            final h0 timeout = stream.readTimeout();
            final long n = this.chain.getReadTimeoutMillis$okhttp();
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            timeout.timeout(n, milliseconds);
            final Http2Stream stream2 = this.stream;
            e.c((Object)stream2);
            stream2.writeTimeout().timeout(this.chain.getWriteTimeoutMillis$okhttp(), milliseconds);
            return;
        }
        final Http2Stream stream3 = this.stream;
        e.c((Object)stream3);
        stream3.closeLater(ErrorCode.CANCEL);
        throw new IOException("Canceled");
    }
    
    @Metadata(d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019" }, d2 = { "Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "()V", "CONNECTION", "", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "http2HeadersList", "Lokhttp3/internal/http2/Header;", "request", "Lokhttp3/Request;", "readHttp2HeadersList", "Lokhttp3/Response$Builder;", "headerBlock", "Lokhttp3/Headers;", "protocol", "Lokhttp3/Protocol;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final List<Header> http2HeadersList(final Request request) {
            e.f((Object)request, "request");
            final Headers headers = request.headers();
            final ArrayList list = new ArrayList<Header>(headers.size() + 4);
            list.add(new Header(Header.TARGET_METHOD, request.method()));
            list.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.url())));
            final String header = request.header("Host");
            if (header != null) {
                list.add(new Header(Header.TARGET_AUTHORITY, header));
            }
            list.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
            for (int i = 0; i < headers.size(); ++i) {
                final String name = headers.name(i);
                final Locale us = Locale.US;
                final String q = a.q(us, "US", name, us, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp().contains(q) || (e.a((Object)q, (Object)"te") && e.a((Object)headers.value(i), (Object)"trailers"))) {
                    list.add(new Header(q, headers.value(i)));
                }
            }
            return (List<Header>)list;
        }
        
        public final Response$Builder readHttp2HeadersList(final Headers headers, final Protocol protocol) {
            e.f((Object)headers, "headerBlock");
            e.f((Object)protocol, "protocol");
            final Headers$Builder headers$Builder = new Headers$Builder();
            final int size = headers.size();
            StatusLine statusLine = null;
            StatusLine parse;
            for (int i = 0; i < size; ++i, statusLine = parse) {
                final String name = headers.name(i);
                final String value = headers.value(i);
                if (e.a((Object)name, (Object)":status")) {
                    parse = StatusLine.Companion.parse(e.l((Object)value, "HTTP/1.1 "));
                }
                else {
                    parse = statusLine;
                    if (!Http2ExchangeCodec.access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp().contains(name)) {
                        headers$Builder.addLenient$okhttp(name, value);
                        parse = statusLine;
                    }
                }
            }
            if (statusLine != null) {
                return new Response$Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(headers$Builder.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }
}
