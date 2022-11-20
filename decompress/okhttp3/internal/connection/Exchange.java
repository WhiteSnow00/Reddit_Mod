// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import fk2.l;
import fk2.c;
import java.net.ProtocolException;
import fk2.k;
import okhttp3.Headers;
import okhttp3.Response$Builder;
import fk2.f;
import okhttp3.internal.http.RealResponseBody;
import fk2.g0;
import fk2.u;
import okhttp3.ResponseBody;
import okhttp3.Response;
import java.net.SocketException;
import okhttp3.internal.ws.RealWebSocket$Streams;
import okhttp3.RequestBody;
import fk2.e0;
import okhttp3.Request;
import okhttp3.Call;
import java.io.IOException;
import ng2.e;
import okhttp3.EventListener;
import okhttp3.internal.http.ExchangeCodec;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002IJB'\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\bG\u0010HJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0004J9\u0010%\u001a\u00028\u0000\"\n\b\u0000\u0010 *\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&J\u0006\u0010'\u001a\u00020\u0004R\u001a\u0010)\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R$\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R$\u0010?\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\u0014\u0010D\u001a\u00020A8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010>¨\u0006K" }, d2 = { "Lokhttp3/internal/connection/Exchange;", "", "Ljava/io/IOException;", "e", "Lcg2/j;", "trackFailure", "Lokhttp3/Request;", "request", "writeRequestHeaders", "", "duplex", "Lfk2/e0;", "createRequestBody", "flushRequest", "finishRequest", "responseHeadersStart", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "Lokhttp3/Response;", "response", "responseHeadersEnd", "Lokhttp3/ResponseBody;", "openResponseBody", "Lokhttp3/Headers;", "trailers", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "webSocketUpgradeFailed", "noNewExchangesOnConnection", "cancel", "detachWithViolence", "E", "", "bytesRead", "responseDone", "requestDone", "bodyComplete", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "noRequestBody", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "Lokhttp3/internal/connection/ExchangeFinder;", "finder", "Lokhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/http/ExchangeCodec;", "codec", "Lokhttp3/internal/http/ExchangeCodec;", "<set-?>", "isDuplex", "Z", "isDuplex$okhttp", "()Z", "hasFailure", "getHasFailure$okhttp", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "connection", "isCoalescedConnection$okhttp", "isCoalescedConnection", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "RequestBodySink", "ResponseBodySource", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class Exchange
{
    private final RealCall call;
    private final ExchangeCodec codec;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;
    
    public Exchange(final RealCall call, final EventListener eventListener, final ExchangeFinder finder, final ExchangeCodec codec) {
        e.f((Object)call, "call");
        e.f((Object)eventListener, "eventListener");
        e.f((Object)finder, "finder");
        e.f((Object)codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
    }
    
    private final void trackFailure(final IOException ex) {
        this.hasFailure = true;
        this.codec.getCarrier().trackFailure(this.call, ex);
    }
    
    public final <E extends IOException> E bodyComplete(final long n, final boolean b, final boolean b2, final E e) {
        if (e != null) {
            this.trackFailure(e);
        }
        if (b2) {
            if (e != null) {
                this.eventListener.requestFailed((Call)this.call, (IOException)e);
            }
            else {
                this.eventListener.requestBodyEnd((Call)this.call, n);
            }
        }
        if (b) {
            if (e != null) {
                this.eventListener.responseFailed((Call)this.call, (IOException)e);
            }
            else {
                this.eventListener.responseBodyEnd((Call)this.call, n);
            }
        }
        return this.call.messageDone$okhttp(this, b2, b, e);
    }
    
    public final void cancel() {
        this.codec.cancel();
    }
    
    public final e0 createRequestBody(final Request request, final boolean isDuplex) throws IOException {
        e.f((Object)request, "request");
        this.isDuplex = isDuplex;
        final RequestBody body = request.body();
        e.c((Object)body);
        final long contentLength = body.contentLength();
        this.eventListener.requestBodyStart((Call)this.call);
        return (e0)new RequestBodySink(this.codec.createRequestBody(request, contentLength), contentLength);
    }
    
    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, (IOException)null);
    }
    
    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        }
        catch (final IOException ex) {
            this.eventListener.requestFailed((Call)this.call, ex);
            this.trackFailure(ex);
            throw ex;
        }
    }
    
    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        }
        catch (final IOException ex) {
            this.eventListener.requestFailed((Call)this.call, ex);
            this.trackFailure(ex);
            throw ex;
        }
    }
    
    public final RealCall getCall$okhttp() {
        return this.call;
    }
    
    public final RealConnection getConnection$okhttp() {
        final ExchangeCodec.Carrier carrier = this.codec.getCarrier();
        RealConnection realConnection;
        if (carrier instanceof RealConnection) {
            realConnection = (RealConnection)carrier;
        }
        else {
            realConnection = null;
        }
        if (realConnection != null) {
            return realConnection;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels".toString());
    }
    
    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }
    
    public final ExchangeFinder getFinder$okhttp() {
        return this.finder;
    }
    
    public final boolean getHasFailure$okhttp() {
        return this.hasFailure;
    }
    
    public final boolean isCoalescedConnection$okhttp() {
        return e.a((Object)this.finder.getRoutePlanner().getAddress().url().host(), (Object)this.codec.getCarrier().getRoute().address().url().host()) ^ true;
    }
    
    public final boolean isDuplex$okhttp() {
        return this.isDuplex;
    }
    
    public final RealWebSocket$Streams newWebSocketStreams() throws SocketException {
        this.call.timeoutEarlyExit();
        return ((RealConnection)this.codec.getCarrier()).newWebSocketStreams$okhttp(this);
    }
    
    public final void noNewExchangesOnConnection() {
        this.codec.getCarrier().noNewExchanges();
    }
    
    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, (IOException)null);
    }
    
    public final ResponseBody openResponseBody(final Response response) throws IOException {
        e.f((Object)response, "response");
        try {
            final String header$default = Response.header$default(response, "Content-Type", (String)null, 2, (Object)null);
            final long reportedContentLength = this.codec.reportedContentLength(response);
            return new RealResponseBody(header$default, reportedContentLength, (f)u.b((g0)new ResponseBodySource(this.codec.openResponseBodySource(response), reportedContentLength)));
        }
        catch (final IOException ex) {
            this.eventListener.responseFailed((Call)this.call, ex);
            this.trackFailure(ex);
            throw ex;
        }
    }
    
    public final Response$Builder readResponseHeaders(final boolean b) throws IOException {
        try {
            final Response$Builder responseHeaders = this.codec.readResponseHeaders(b);
            if (responseHeaders != null) {
                responseHeaders.initExchange$okhttp(this);
            }
            return responseHeaders;
        }
        catch (final IOException ex) {
            this.eventListener.responseFailed((Call)this.call, ex);
            this.trackFailure(ex);
            throw ex;
        }
    }
    
    public final void responseHeadersEnd(final Response response) {
        e.f((Object)response, "response");
        this.eventListener.responseHeadersEnd((Call)this.call, response);
    }
    
    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart((Call)this.call);
    }
    
    public final Headers trailers() throws IOException {
        return this.codec.trailers();
    }
    
    public final void webSocketUpgradeFailed() {
        this.bodyComplete(-1L, true, true, (IOException)null);
    }
    
    public final void writeRequestHeaders(final Request request) throws IOException {
        e.f((Object)request, "request");
        try {
            this.eventListener.requestHeadersStart((Call)this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd((Call)this.call, request);
        }
        catch (final IOException ex) {
            this.eventListener.requestFailed((Call)this.call, ex);
            this.trackFailure(ex);
            throw ex;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001a" }, d2 = { "Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lfk2/k;", "Ljava/io/IOException;", "E", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lfk2/c;", "source", "", "byteCount", "Lcg2/j;", "write", "flush", "close", "contentLength", "J", "", "completed", "Z", "bytesReceived", "closed", "Lfk2/e0;", "delegate", "<init>", "(Lokhttp3/internal/connection/Exchange;Lfk2/e0;J)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class RequestBodySink extends k
    {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        public final Exchange this$0;
        
        public RequestBodySink(final Exchange this$0, final e0 e0, final long contentLength) {
            e.f((Object)this$0, "this$0");
            e.f((Object)e0, "delegate");
            this.this$0 = this$0;
            super(e0);
            this.contentLength = contentLength;
        }
        
        private final <E extends IOException> E complete(final E e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            return this.this$0.bodyComplete(this.bytesReceived, false, true, e);
        }
        
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            final long contentLength = this.contentLength;
            if (contentLength != -1L) {
                if (this.bytesReceived != contentLength) {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
            try {
                super.close();
                this.complete((IOException)null);
            }
            catch (final IOException ex) {
                throw this.complete(ex);
            }
        }
        
        public void flush() throws IOException {
            try {
                super.flush();
            }
            catch (final IOException ex) {
                throw this.complete(ex);
            }
        }
        
        public void write(final c c, final long n) throws IOException {
            e.f((Object)c, "source");
            if (this.closed ^ true) {
                final long contentLength = this.contentLength;
                if (contentLength != -1L) {
                    if (this.bytesReceived + n > contentLength) {
                        final StringBuilder t = a.t("expected ");
                        t.append(this.contentLength);
                        t.append(" bytes but received ");
                        t.append(this.bytesReceived + n);
                        throw new ProtocolException(t.toString());
                    }
                }
                try {
                    super.write(c, n);
                    this.bytesReceived += n;
                    return;
                }
                catch (final IOException ex) {
                    throw this.complete(ex);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001a" }, d2 = { "Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lfk2/l;", "Lfk2/c;", "sink", "", "byteCount", "read", "Lcg2/j;", "close", "Ljava/io/IOException;", "E", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "contentLength", "J", "bytesReceived", "", "invokeStartEvent", "Z", "completed", "closed", "Lfk2/g0;", "delegate", "<init>", "(Lokhttp3/internal/connection/Exchange;Lfk2/g0;J)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class ResponseBodySource extends l
    {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        public final Exchange this$0;
        
        public ResponseBodySource(final Exchange this$0, final g0 g0, final long contentLength) {
            e.f((Object)this$0, "this$0");
            e.f((Object)g0, "delegate");
            this.this$0 = this$0;
            super(g0);
            this.contentLength = contentLength;
            this.invokeStartEvent = true;
            if (contentLength == 0L) {
                this.complete((IOException)null);
            }
        }
        
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                this.complete((IOException)null);
            }
            catch (final IOException ex) {
                throw this.complete(ex);
            }
        }
        
        public final <E extends IOException> E complete(final E e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            if (e == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener$okhttp().responseBodyStart((Call)this.this$0.getCall$okhttp());
            }
            return this.this$0.bodyComplete(this.bytesReceived, true, false, e);
        }
        
        public long read(final c c, long bytesReceived) throws IOException {
            e.f((Object)c, "sink");
            if (this.closed ^ true) {
                try {
                    final long read = this.delegate().read(c, bytesReceived);
                    if (this.invokeStartEvent) {
                        this.invokeStartEvent = false;
                        this.this$0.getEventListener$okhttp().responseBodyStart((Call)this.this$0.getCall$okhttp());
                    }
                    if (read == -1L) {
                        this.complete((IOException)null);
                        return -1L;
                    }
                    bytesReceived = this.bytesReceived + read;
                    final long contentLength = this.contentLength;
                    if (contentLength != -1L && bytesReceived > contentLength) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("expected ");
                        sb.append(this.contentLength);
                        sb.append(" bytes but received ");
                        sb.append(bytesReceived);
                        throw new ProtocolException(sb.toString());
                    }
                    this.bytesReceived = bytesReceived;
                    if (bytesReceived == contentLength) {
                        this.complete((IOException)null);
                    }
                    return read;
                }
                catch (final IOException ex) {
                    throw this.complete(ex);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }
}
