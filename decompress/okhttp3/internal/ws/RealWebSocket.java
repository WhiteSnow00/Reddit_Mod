// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.ws;

import java.net.SocketTimeoutException;
import java.io.Closeable;
import okhttp3.internal._UtilCommonKt;
import okhttp3.Callback;
import okhttp3.internal.connection.RealCall;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.internal.connection.Exchange;
import okhttp3.Response;
import java.util.concurrent.TimeUnit;
import okhttp3.internal._UtilJvmKt;
import tg2.i;
import okio.ByteString$a;
import cg2.j;
import ng2.e;
import okhttp3.internal.concurrent.TaskRunner;
import cg.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import java.util.Random;
import okio.ByteString;
import okhttp3.Request;
import java.util.ArrayDeque;
import okhttp3.WebSocketListener;
import okhttp3.Call;
import okhttp3.Protocol;
import java.util.List;
import kotlin.Metadata;
import okhttp3.WebSocket;

@Metadata(bv = {}, d1 = { "\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0005srtuvBA\u0012\u0006\u0010o\u001a\u00020n\u0012\u0006\u0010A\u001a\u00020\u0003\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020\u0005\u0012\b\u0010M\u001a\u0004\u0018\u00010<\u0012\u0006\u0010O\u001a\u00020\u0005¢\u0006\u0004\bp\u0010qJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0007J\u0006\u0010\u001a\u001a\u00020\u0019J\u0016\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u0007J\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\u0006\u0010#\u001a\u00020 J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0013H\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010(\u001a\u00020&H\u0016J\u0018\u0010-\u001a\u00020\u00072\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u0013H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0013H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0016J\u000e\u0010/\u001a\u00020\u00192\u0006\u0010(\u001a\u00020&J\u001a\u00100\u001a\u00020\u00192\u0006\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u0013H\u0016J \u00100\u001a\u00020\u00192\u0006\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u00132\u0006\u00101\u001a\u00020\u0005J\u000f\u00104\u001a\u00020\u0019H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00107\u001a\u00020\u0007H\u0000¢\u0006\u0004\b5\u00106J\u001c\u0010;\u001a\u00020\u00072\n\u0010:\u001a\u000608j\u0002`92\b\u0010\r\u001a\u0004\u0018\u00010\fJ\f\u0010=\u001a\u00020\u0019*\u00020<H\u0002J\u0018\u0010.\u001a\u00020\u00192\u0006\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020 H\u0002J\b\u0010@\u001a\u00020\u0007H\u0002R\u0014\u0010A\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\u00020C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010LR\u0014\u0010P\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010QR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010aR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020&0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020e0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010dR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010LR\u0016\u0010g\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010QR\u0016\u0010l\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010hR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010jR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010jR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010jR\u0016\u0010m\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010h¨\u0006w" }, d2 = { "Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/Request;", "request", "", "queueSize", "Lcg2/j;", "cancel", "Lokhttp3/OkHttpClient;", "client", "connect", "Lokhttp3/Response;", "response", "Lokhttp3/internal/connection/Exchange;", "exchange", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)V", "checkUpgradeSuccess", "", "name", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "streams", "initReaderAndWriter", "loopReader", "", "processNextFrame", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "awaitTermination", "tearDown", "", "sentPingCount", "receivedPingCount", "receivedPongCount", "text", "onReadMessage", "Lokio/ByteString;", "bytes", "payload", "onReadPing", "onReadPong", "code", "reason", "onReadClose", "send", "pong", "close", "cancelAfterCloseMillis", "writeOneFrame$okhttp", "()Z", "writeOneFrame", "writePingFrame$okhttp", "()V", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failWebSocket", "Lokhttp3/internal/ws/WebSocketExtensions;", "isValid", "data", "formatOpcode", "runWriter", "originalRequest", "Lokhttp3/Request;", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "pingIntervalMillis", "J", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "minimumDeflateSize", "key", "Ljava/lang/String;", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/util/ArrayDeque;", "pongQueue", "Ljava/util/ArrayDeque;", "", "messageAndCloseQueue", "enqueuedClose", "Z", "receivedCloseCode", "I", "receivedCloseReason", "failed", "awaitingPong", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "Companion", "Close", "Message", "Streams", "WriterTask", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class RealWebSocket implements WebSocket, WebSocketReader$FrameCallback
{
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000L;
    public static final RealWebSocket.RealWebSocket$Companion Companion;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024L;
    private static final long MAX_QUEUE_SIZE = 16777216L;
    private static final List<Protocol> ONLY_HTTP1;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<ByteString> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private RealWebSocket.RealWebSocket$Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;
    
    static {
        Companion = new RealWebSocket.RealWebSocket$Companion((DefaultConstructorMarker)null);
        ONLY_HTTP1 = d.l3((Object)Protocol.HTTP_1_1);
    }
    
    public RealWebSocket(final TaskRunner taskRunner, final Request originalRequest, final WebSocketListener listener, final Random random, final long pingIntervalMillis, final WebSocketExtensions extensions, final long minimumDeflateSize) {
        e.f((Object)taskRunner, "taskRunner");
        e.f((Object)originalRequest, "originalRequest");
        e.f((Object)listener, "listener");
        e.f((Object)random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = pingIntervalMillis;
        this.extensions = extensions;
        this.minimumDeflateSize = minimumDeflateSize;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<ByteString>();
        this.messageAndCloseQueue = new ArrayDeque<Object>();
        this.receivedCloseCode = -1;
        if (e.a((Object)"GET", (Object)originalRequest.method())) {
            final ByteString$a companion = ByteString.Companion;
            final byte[] array = new byte[16];
            random.nextBytes(array);
            final j a = j.a;
            this.key = ByteString$a.d(companion, array).base64();
            return;
        }
        throw new IllegalArgumentException(e.l((Object)originalRequest.method(), "Request must be GET: ").toString());
    }
    
    public static final ArrayDeque access$getMessageAndCloseQueue$p(final RealWebSocket realWebSocket) {
        return realWebSocket.messageAndCloseQueue;
    }
    
    public static final String access$getName$p(final RealWebSocket realWebSocket) {
        return realWebSocket.name;
    }
    
    public static final boolean access$isValid(final RealWebSocket realWebSocket, final WebSocketExtensions webSocketExtensions) {
        return realWebSocket.isValid(webSocketExtensions);
    }
    
    public static final void access$setExtensions$p(final RealWebSocket realWebSocket, final WebSocketExtensions extensions) {
        realWebSocket.extensions = extensions;
    }
    
    private final boolean isValid(final WebSocketExtensions webSocketExtensions) {
        return !webSocketExtensions.unknownValues && webSocketExtensions.clientMaxWindowBits == null && (webSocketExtensions.serverMaxWindowBits == null || new i(8, 15).g((int)webSocketExtensions.serverMaxWindowBits));
    }
    
    private final void runWriter() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        final Task writerTask = this.writerTask;
        if (writerTask != null) {
            TaskQueue.schedule$default(this.taskQueue, writerTask, 0L, 2, null);
        }
    }
    
    private final boolean send(final ByteString byteString, final int n) {
        synchronized (this) {
            if (this.failed || this.enqueuedClose) {
                return false;
            }
            if (this.queueSize + byteString.size() > 16777216L) {
                this.close(1001, null);
                return false;
            }
            this.queueSize += byteString.size();
            this.messageAndCloseQueue.add(new RealWebSocket.RealWebSocket$Message(n, byteString));
            this.runWriter();
            return true;
        }
    }
    
    public final void awaitTermination(final long n, final TimeUnit timeUnit) throws InterruptedException {
        e.f((Object)timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(n, timeUnit);
    }
    
    public void cancel() {
        final Call call = this.call;
        e.c((Object)call);
        call.cancel();
    }
    
    public final void checkUpgradeSuccess$okhttp(final Response response, final Exchange exchange) throws IOException {
        e.f((Object)response, "response");
        if (response.code() != 101) {
            final StringBuilder t = a.t("Expected HTTP 101 response but was '");
            t.append(response.code());
            t.append(' ');
            t.append(response.message());
            t.append('\'');
            throw new ProtocolException(t.toString());
        }
        final String header$default = Response.header$default(response, "Connection", (String)null, 2, (Object)null);
        if (!xi2.j.z0("Upgrade", header$default, true)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected 'Connection' header value 'Upgrade' but was '");
            sb.append((Object)header$default);
            sb.append('\'');
            throw new ProtocolException(sb.toString());
        }
        final String header$default2 = Response.header$default(response, "Upgrade", (String)null, 2, (Object)null);
        if (!xi2.j.z0("websocket", header$default2, true)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected 'Upgrade' header value 'websocket' but was '");
            sb2.append((Object)header$default2);
            sb2.append('\'');
            throw new ProtocolException(sb2.toString());
        }
        final String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", (String)null, 2, (Object)null);
        final ByteString$a companion = ByteString.Companion;
        final String l = e.l((Object)"258EAFA5-E914-47DA-95CA-C5AB0DC85B11", this.key);
        companion.getClass();
        final String base64 = ByteString$a.c(l).sha1().base64();
        if (!e.a((Object)base64, (Object)header$default3)) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Expected 'Sec-WebSocket-Accept' header value '");
            sb3.append(base64);
            sb3.append("' but was '");
            sb3.append((Object)header$default3);
            sb3.append('\'');
            throw new ProtocolException(sb3.toString());
        }
        if (exchange != null) {
            return;
        }
        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
    }
    
    public boolean close(final int n, final String s) {
        return this.close(n, s, 60000L);
    }
    
    public final boolean close(final int n, final String s, final long n2) {
        synchronized (this) {
            WebSocketProtocol.INSTANCE.validateCloseCode(n);
            ByteString c = null;
            if (s != null) {
                ByteString.Companion.getClass();
                c = ByteString$a.c(s);
                if (c.size() > 123L) {
                    throw new IllegalArgumentException(e.l((Object)s, "reason.size() > 123: ").toString());
                }
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new RealWebSocket.RealWebSocket$Close(n, c, n2));
                this.runWriter();
                return true;
            }
            return false;
        }
    }
    
    public final void connect(final OkHttpClient okHttpClient) {
        e.f((Object)okHttpClient, "client");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            this.failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        final OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols((List)RealWebSocket.ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        (this.call = (Call)new RealCall(build, build2, true)).enqueue((Callback)new RealWebSocket$connect.RealWebSocket$connect$1(this, build2));
    }
    
    public final void failWebSocket(final Exception ex, final Response response) {
        e.f((Object)ex, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            final RealWebSocket.RealWebSocket$Streams streams = this.streams;
            this.streams = null;
            final WebSocketReader reader = this.reader;
            this.reader = null;
            final WebSocketWriter writer = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            final j a = j.a;
            monitorexit(this);
            try {
                this.listener.onFailure((WebSocket)this, (Throwable)ex, response);
            }
            finally {
                if (streams != null) {
                    _UtilCommonKt.closeQuietly((Closeable)streams);
                }
                if (reader != null) {
                    _UtilCommonKt.closeQuietly((Closeable)reader);
                }
                if (writer != null) {
                    _UtilCommonKt.closeQuietly((Closeable)writer);
                }
            }
        }
    }
    
    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }
    
    public final void initReaderAndWriter(final String name, final RealWebSocket.RealWebSocket$Streams streams) throws IOException {
        e.f((Object)name, "name");
        e.f((Object)streams, "streams");
        final WebSocketExtensions extensions = this.extensions;
        e.c((Object)extensions);
        synchronized (this) {
            this.name = name;
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, extensions.perMessageDeflate, extensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            final long pingIntervalMillis = this.pingIntervalMillis;
            if (pingIntervalMillis != 0L) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(pingIntervalMillis);
                this.taskQueue.schedule(e.l((Object)" ping", name), nanos, (mg2.a<Long>)new RealWebSocket$initReaderAndWriter$1$1(this, nanos));
            }
            if (this.messageAndCloseQueue.isEmpty() ^ true) {
                this.runWriter();
            }
            final j a = j.a;
            monitorexit(this);
            this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), (WebSocketReader$FrameCallback)this, extensions.perMessageDeflate, extensions.noContextTakeover(streams.getClient() ^ true));
        }
    }
    
    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            final WebSocketReader reader = this.reader;
            e.c((Object)reader);
            reader.processNextFrame();
        }
    }
    
    public void onReadClose(final int receivedCloseCode, final String receivedCloseReason) {
        e.f((Object)receivedCloseReason, "reason");
        final int n = 1;
        if (receivedCloseCode != -1) {
            synchronized (this) {
                int n2;
                if (this.receivedCloseCode == -1) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 != 0) {
                    this.receivedCloseCode = receivedCloseCode;
                    this.receivedCloseReason = receivedCloseReason;
                    final boolean enqueuedClose = this.enqueuedClose;
                    Object streams = null;
                    Object reader;
                    Object writer;
                    if (enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                        streams = this.streams;
                        this.streams = null;
                        reader = this.reader;
                        this.reader = null;
                        writer = this.writer;
                        this.writer = null;
                        this.taskQueue.shutdown();
                    }
                    else {
                        reader = null;
                        writer = null;
                    }
                    final j a = j.a;
                    monitorexit(this);
                    try {
                        this.listener.onClosing((WebSocket)this, receivedCloseCode, receivedCloseReason);
                        if (streams != null) {
                            this.listener.onClosed((WebSocket)this, receivedCloseCode, receivedCloseReason);
                        }
                        return;
                    }
                    finally {
                        if (streams != null) {
                            _UtilCommonKt.closeQuietly((Closeable)streams);
                        }
                        if (reader != null) {
                            _UtilCommonKt.closeQuietly((Closeable)reader);
                        }
                        if (writer != null) {
                            _UtilCommonKt.closeQuietly((Closeable)writer);
                        }
                    }
                }
                throw new IllegalStateException("already closed".toString());
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public void onReadMessage(final String s) throws IOException {
        e.f((Object)s, "text");
        this.listener.onMessage((WebSocket)this, s);
    }
    
    public void onReadMessage(final ByteString byteString) throws IOException {
        e.f((Object)byteString, "bytes");
        this.listener.onMessage((WebSocket)this, byteString);
    }
    
    public void onReadPing(final ByteString byteString) {
        synchronized (this) {
            e.f((Object)byteString, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(byteString);
                this.runWriter();
                ++this.receivedPingCount;
            }
        }
    }
    
    public void onReadPong(final ByteString byteString) {
        synchronized (this) {
            e.f((Object)byteString, "payload");
            ++this.receivedPongCount;
            this.awaitingPong = false;
        }
    }
    
    public final boolean pong(final ByteString byteString) {
        synchronized (this) {
            e.f((Object)byteString, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(byteString);
                this.runWriter();
                return true;
            }
            return false;
        }
    }
    
    public final boolean processNextFrame() throws IOException {
        boolean b = false;
        try {
            final WebSocketReader reader = this.reader;
            e.c((Object)reader);
            reader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                b = true;
            }
        }
        catch (final Exception ex) {
            this.failWebSocket(ex, null);
        }
        return b;
    }
    
    public long queueSize() {
        synchronized (this) {
            return this.queueSize;
        }
    }
    
    public final int receivedPingCount() {
        synchronized (this) {
            return this.receivedPingCount;
        }
    }
    
    public final int receivedPongCount() {
        synchronized (this) {
            return this.receivedPongCount;
        }
    }
    
    public Request request() {
        return this.originalRequest;
    }
    
    public boolean send(final String s) {
        e.f((Object)s, "text");
        ByteString.Companion.getClass();
        return this.send(ByteString$a.c(s), 1);
    }
    
    public boolean send(final ByteString byteString) {
        e.f((Object)byteString, "bytes");
        return this.send(byteString, 2);
    }
    
    public final int sentPingCount() {
        synchronized (this) {
            return this.sentPingCount;
        }
    }
    
    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }
    
    public final boolean writeOneFrame$okhttp() throws IOException {
        synchronized (this) {
            if (this.failed) {
                return false;
            }
            final WebSocketWriter writer = this.writer;
            final ByteString poll = this.pongQueue.poll();
            int receivedCloseCode = -1;
            Object o = null;
            Object reader = null;
            Object writer2 = null;
            Object o2 = null;
            Label_0234: {
                if (poll == null) {
                    final RealWebSocket.RealWebSocket$Message poll2 = this.messageAndCloseQueue.poll();
                    if (poll2 instanceof RealWebSocket.RealWebSocket$Close) {
                        receivedCloseCode = this.receivedCloseCode;
                        final Object receivedCloseReason = this.receivedCloseReason;
                        if (receivedCloseCode != -1) {
                            final RealWebSocket.RealWebSocket$Streams streams = this.streams;
                            this.streams = null;
                            reader = this.reader;
                            this.reader = null;
                            writer2 = this.writer;
                            this.writer = null;
                            this.taskQueue.shutdown();
                            o = poll2;
                            o2 = streams;
                            break Label_0234;
                        }
                        TaskQueue.execute$default(this.taskQueue, e.l((Object)" cancel", this.name), TimeUnit.MILLISECONDS.toNanos(((RealWebSocket.RealWebSocket$Close)poll2).getCancelAfterCloseMillis()), false, (mg2.a)new RealWebSocket$writeOneFrame$1$1(this), 4, null);
                    }
                    else {
                        if (poll2 == null) {
                            return false;
                        }
                        final Object receivedCloseReason = null;
                    }
                    reader = null;
                    final Closeable closeable = null;
                    writer2 = null;
                    o = poll2;
                    o2 = closeable;
                }
                else {
                    o2 = null;
                    final Object receivedCloseReason = null;
                    reader = (writer2 = receivedCloseReason);
                }
            }
            final j a = j.a;
            monitorexit(this);
            Label_0264: {
                if (poll == null) {
                    break Label_0264;
                }
                try {
                    e.c((Object)writer);
                    writer.writePong((ByteString)poll);
                    Label_0391: {
                        return true;
                    }
                    iftrue(Label_0331:)(!(o instanceof RealWebSocket.RealWebSocket$Message));
                    final RealWebSocket.RealWebSocket$Message realWebSocket$Message = (RealWebSocket.RealWebSocket$Message)o;
                    e.c((Object)writer);
                    writer.writeMessageFrame(realWebSocket$Message.getFormatOpcode(), realWebSocket$Message.getData());
                    synchronized (this) {
                        this.queueSize -= realWebSocket$Message.getData().size();
                        return true;
                    }
                Block_13:
                    while (true) {
                        Label_0331: {
                            break Label_0331;
                            Label_0432:
                            throw new AssertionError();
                            final RealWebSocket.RealWebSocket$Close realWebSocket$Close = (RealWebSocket.RealWebSocket$Close)o;
                            e.c((Object)writer);
                            writer.writeClose(realWebSocket$Close.getCode(), realWebSocket$Close.getReason());
                            iftrue(Label_0391:)(o2 == null);
                            break Block_13;
                        }
                        iftrue(Label_0432:)(!(o instanceof RealWebSocket.RealWebSocket$Close));
                        continue;
                    }
                    final WebSocketListener listener = this.listener;
                    final Object receivedCloseReason;
                    e.c(receivedCloseReason);
                    listener.onClosed((WebSocket)this, receivedCloseCode, (String)receivedCloseReason);
                }
                finally {
                    if (o2 != null) {
                        _UtilCommonKt.closeQuietly((Closeable)o2);
                    }
                    if (reader != null) {
                        _UtilCommonKt.closeQuietly((Closeable)reader);
                    }
                    if (writer2 != null) {
                        _UtilCommonKt.closeQuietly((Closeable)writer2);
                    }
                }
            }
        }
    }
    
    public final void writePingFrame$okhttp() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            final WebSocketWriter writer = this.writer;
            if (writer == null) {
                return;
            }
            int sentPingCount;
            if (this.awaitingPong) {
                sentPingCount = this.sentPingCount;
            }
            else {
                sentPingCount = -1;
            }
            ++this.sentPingCount;
            this.awaitingPong = true;
            final j a = j.a;
            monitorexit(this);
            if (sentPingCount != -1) {
                final StringBuilder t = a.t("sent ping but didn't receive pong within ");
                t.append(this.pingIntervalMillis);
                t.append("ms (after ");
                t.append(sentPingCount - 1);
                t.append(" successful ping/pongs)");
                this.failWebSocket(new SocketTimeoutException(t.toString()), null);
                return;
            }
            try {
                writer.writePing(ByteString.EMPTY);
            }
            catch (final IOException ex) {
                this.failWebSocket(ex, null);
            }
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005" }, d2 = { "Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public final class WriterTask extends Task
    {
        public final RealWebSocket this$0;
        
        public WriterTask(final RealWebSocket this$0) {
            e.f((Object)this$0, "this$0");
            this.this$0 = this$0;
            super(e.l((Object)" writer", RealWebSocket.access$getName$p(this$0)), false, 2, null);
        }
        
        @Override
        public long runOnce() {
            try {
                if (this.this$0.writeOneFrame$okhttp()) {
                    return 0L;
                }
            }
            catch (final IOException ex) {
                this.this$0.failWebSocket(ex, null);
            }
            return -1L;
        }
    }
}
