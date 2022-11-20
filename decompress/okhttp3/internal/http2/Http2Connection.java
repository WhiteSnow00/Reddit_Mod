// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http2;

import fk2.g0;
import java.util.Collection;
import okio.ByteString;
import fk2.u;
import okhttp3.internal._UtilJvmKt;
import java.io.InterruptedIOException;
import okhttp3.internal._UtilCommonKt;
import kotlin.jvm.internal.Ref$IntRef;
import fk2.c;
import fk2.f;
import cg2.j;
import okhttp3.Headers;
import java.util.List;
import java.io.IOException;
import mg2.a;
import java.util.concurrent.TimeUnit;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.concurrent.TaskRunner;
import java.util.Map;
import java.net.Socket;
import okhttp3.internal.concurrent.TaskQueue;
import java.util.Set;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = {}, d1 = { "\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ²\u00012\u00020\u0001:\b³\u0001²\u0001´\u0001µ\u0001B\u0015\b\u0000\u0012\b\u0010¯\u0001\u001a\u00030®\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015J\u001c\u0010\u0018\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015J-\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010!\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u000bJ\u001f\u0010&\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\"H\u0000¢\u0006\u0004\b(\u0010%J\u001f\u0010-\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u000bH\u0000¢\u0006\u0004\b+\u0010,J\u001e\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0002J\u0006\u00102\u001a\u00020\rJ\u0006\u00101\u001a\u00020\rJ\u0006\u00103\u001a\u00020\rJ\u0006\u00104\u001a\u00020\rJ\u000e\u00105\u001a\u00020\r2\u0006\u0010'\u001a\u00020\"J\b\u00106\u001a\u00020\rH\u0016J)\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\"2\b\u0010:\u001a\u0004\u0018\u000109H\u0000¢\u0006\u0004\b;\u0010<J\u0012\u0010>\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0015H\u0007J\u000e\u0010A\u001a\u00020\r2\u0006\u0010@\u001a\u00020?J\u000e\u0010C\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u000bJ\u000f\u0010F\u001a\u00020\rH\u0000¢\u0006\u0004\bD\u0010EJ\u0017\u0010I\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\bG\u0010HJ%\u0010L\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\bJ\u0010KJ-\u0010P\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010M\u001a\u00020\u0015H\u0000¢\u0006\u0004\bN\u0010OJ/\u0010U\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010R\u001a\u00020Q2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u0015H\u0000¢\u0006\u0004\bS\u0010TJ\u001f\u0010W\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\bV\u0010%J&\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0012\u0010Y\u001a\u00020\r2\b\u0010X\u001a\u0004\u0018\u000109H\u0002R\u001a\u0010Z\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010_\u001a\u00020^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR&\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010i\u001a\u00020h8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\"\u0010m\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010s\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bs\u0010n\u001a\u0004\bt\u0010p\"\u0004\bu\u0010rR\u0016\u0010v\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010[R\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010|R\u0014\u0010~\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010|R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0083\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0083\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0083\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0083\u0001R\u001c\u0010\u008a\u0001\u001a\u00020?8\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R)\u0010\u008e\u0001\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008b\u0001\u001a\u0006\b\u008f\u0001\u0010\u008d\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u0093\u0001\u001a\u00020\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0083\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u0096\u0001\u001a\u00020\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0083\u0001\u001a\u0006\b\u0097\u0001\u0010\u0095\u0001R*\u0010\u0098\u0001\u001a\u00020\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0083\u0001\u001a\u0006\b\u0099\u0001\u0010\u0095\u0001R*\u0010\u009a\u0001\u001a\u00020\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0083\u0001\u001a\u0006\b\u009b\u0001\u0010\u0095\u0001R \u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001d\u0010¢\u0001\u001a\u00030¡\u00018\u0006¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R!\u0010§\u0001\u001a\u00070¦\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001e\u0010¬\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020«\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001¨\u0006¶\u0001" }, d2 = { "Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "", "openStreamCount", "id", "Lokhttp3/internal/http2/Http2Stream;", "getStream", "streamId", "removeStream$okhttp", "(I)Lokhttp3/internal/http2/Http2Stream;", "removeStream", "", "read", "Lcg2/j;", "updateConnectionFlowControl$okhttp", "(J)V", "updateConnectionFlowControl", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", "out", "pushStream", "newStream", "outFinished", "alternating", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "writeHeaders", "Lfk2/c;", "buffer", "byteCount", "writeData", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "writeSynResetLater$okhttp", "(ILokhttp3/internal/http2/ErrorCode;)V", "writeSynResetLater", "statusCode", "writeSynReset$okhttp", "writeSynReset", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "(IJ)V", "writeWindowUpdateLater", "reply", "payload1", "payload2", "writePing", "writePingAndAwaitPong", "awaitPong", "flush", "shutdown", "close", "connectionCode", "streamCode", "Ljava/io/IOException;", "cause", "close$okhttp", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "sendConnectionPreface", "start", "Lokhttp3/internal/http2/Settings;", "settings", "setSettings", "nowNs", "isHealthy", "sendDegradedPingLater$okhttp", "()V", "sendDegradedPingLater", "pushedStream$okhttp", "(I)Z", "pushedStream", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "pushRequestLater", "inFinished", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "pushHeadersLater", "Lfk2/f;", "source", "pushDataLater$okhttp", "(ILfk2/f;IZ)V", "pushDataLater", "pushResetLater$okhttp", "pushResetLater", "e", "failConnection", "client", "Z", "getClient$okhttp", "()Z", "Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "", "streams", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "lastGoodStreamId", "I", "getLastGoodStreamId$okhttp", "()I", "setLastGoodStreamId$okhttp", "(I)V", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "isShutdown", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/concurrent/TaskQueue;", "writerQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "pushQueue", "settingsListenerQueue", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "intervalPingsSent", "J", "intervalPongsReceived", "degradedPingsSent", "degradedPongsReceived", "awaitPingsSent", "awaitPongsReceived", "degradedPongDeadlineNs", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "(Lokhttp3/internal/http2/Settings;)V", "<set-?>", "readBytesTotal", "getReadBytesTotal", "()J", "readBytesAcknowledged", "getReadBytesAcknowledged", "writeBytesTotal", "getWriteBytesTotal", "writeBytesMaximum", "getWriteBytesMaximum", "Ljava/net/Socket;", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "", "currentPushRequests", "Ljava/util/Set;", "Lokhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "Companion", "Builder", "Listener", "ReaderRunnable", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class Http2Connection implements Closeable
{
    public static final int AWAIT_PING = 3;
    public static final Companion Companion;
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;
    
    static {
        Companion = new Companion(null);
        final Settings default_SETTINGS = new Settings();
        default_SETTINGS.set(7, 65535);
        default_SETTINGS.set(5, 16384);
        DEFAULT_SETTINGS = default_SETTINGS;
    }
    
    public Http2Connection(final Builder builder) {
        e.f((Object)builder, "builder");
        final boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap<Integer, Http2Stream>();
        final String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        int nextStreamId;
        if (builder.getClient$okhttp()) {
            nextStreamId = 3;
        }
        else {
            nextStreamId = 2;
        }
        this.nextStreamId = nextStreamId;
        final TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        final TaskQueue queue = taskRunner$okhttp.newQueue();
        this.writerQueue = queue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        final Settings okHttpSettings = new Settings();
        if (builder.getClient$okhttp()) {
            okHttpSettings.set(7, 16777216);
        }
        this.okHttpSettings = okHttpSettings;
        final Settings default_SETTINGS = Http2Connection.DEFAULT_SETTINGS;
        this.peerSettings = default_SETTINGS;
        this.writeBytesMaximum = default_SETTINGS.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet<Integer>();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            queue.schedule(e.l((Object)" ping", connectionName$okhttp), nanos, (a<Long>)new Http2Connection$1(this, nanos));
        }
    }
    
    public static final void access$failConnection(final Http2Connection http2Connection, final IOException ex) {
        http2Connection.failConnection(ex);
    }
    
    public static final long access$getAwaitPongsReceived$p(final Http2Connection http2Connection) {
        return http2Connection.awaitPongsReceived;
    }
    
    public static final Set access$getCurrentPushRequests$p(final Http2Connection http2Connection) {
        return http2Connection.currentPushRequests;
    }
    
    public static final Settings access$getDEFAULT_SETTINGS$cp() {
        return Http2Connection.DEFAULT_SETTINGS;
    }
    
    public static final long access$getDegradedPongsReceived$p(final Http2Connection http2Connection) {
        return http2Connection.degradedPongsReceived;
    }
    
    public static final long access$getIntervalPingsSent$p(final Http2Connection http2Connection) {
        return http2Connection.intervalPingsSent;
    }
    
    public static final long access$getIntervalPongsReceived$p(final Http2Connection http2Connection) {
        return http2Connection.intervalPongsReceived;
    }
    
    public static final PushObserver access$getPushObserver$p(final Http2Connection http2Connection) {
        return http2Connection.pushObserver;
    }
    
    public static final TaskQueue access$getSettingsListenerQueue$p(final Http2Connection http2Connection) {
        return http2Connection.settingsListenerQueue;
    }
    
    public static final TaskRunner access$getTaskRunner$p(final Http2Connection http2Connection) {
        return http2Connection.taskRunner;
    }
    
    public static final TaskQueue access$getWriterQueue$p(final Http2Connection http2Connection) {
        return http2Connection.writerQueue;
    }
    
    public static final boolean access$isShutdown$p(final Http2Connection http2Connection) {
        return http2Connection.isShutdown;
    }
    
    public static final void access$setAwaitPongsReceived$p(final Http2Connection http2Connection, final long awaitPongsReceived) {
        http2Connection.awaitPongsReceived = awaitPongsReceived;
    }
    
    public static final void access$setDegradedPongsReceived$p(final Http2Connection http2Connection, final long degradedPongsReceived) {
        http2Connection.degradedPongsReceived = degradedPongsReceived;
    }
    
    public static final void access$setIntervalPingsSent$p(final Http2Connection http2Connection, final long intervalPingsSent) {
        http2Connection.intervalPingsSent = intervalPingsSent;
    }
    
    public static final void access$setIntervalPongsReceived$p(final Http2Connection http2Connection, final long intervalPongsReceived) {
        http2Connection.intervalPongsReceived = intervalPongsReceived;
    }
    
    public static final void access$setShutdown$p(final Http2Connection http2Connection, final boolean isShutdown) {
        http2Connection.isShutdown = isShutdown;
    }
    
    public static final void access$setWriteBytesMaximum$p(final Http2Connection http2Connection, final long writeBytesMaximum) {
        http2Connection.writeBytesMaximum = writeBytesMaximum;
    }
    
    private final void failConnection(final IOException ex) {
        final ErrorCode protocol_ERROR = ErrorCode.PROTOCOL_ERROR;
        this.close$okhttp(protocol_ERROR, protocol_ERROR, ex);
    }
    
    private final Http2Stream newStream(final int n, final List<Header> list, final boolean b) throws IOException {
        final boolean b2 = b ^ true;
        synchronized (this.writer) {
            synchronized (this) {
                if (this.getNextStreamId$okhttp() > 1073741823) {
                    this.shutdown(ErrorCode.REFUSED_STREAM);
                }
                if (!this.isShutdown) {
                    final int nextStreamId$okhttp = this.getNextStreamId$okhttp();
                    this.setNextStreamId$okhttp(this.getNextStreamId$okhttp() + 2);
                    final Http2Stream http2Stream = new Http2Stream(nextStreamId$okhttp, this, b2, false, null);
                    final boolean b3 = !b || this.getWriteBytesTotal() >= this.getWriteBytesMaximum() || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                    if (http2Stream.isOpen()) {
                        this.getStreams$okhttp().put(nextStreamId$okhttp, http2Stream);
                    }
                    final j a = j.a;
                    monitorexit(this);
                    if (n == 0) {
                        this.getWriter().headers(b2, nextStreamId$okhttp, list);
                    }
                    else {
                        if (!(true ^ this.getClient$okhttp())) {
                            throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                        }
                        this.getWriter().pushPromise(n, nextStreamId$okhttp, list);
                    }
                    monitorexit(this.writer);
                    if (b3) {
                        this.writer.flush();
                    }
                    return http2Stream;
                }
                throw new ConnectionShutdownException();
            }
        }
    }
    
    public static void start$default(final Http2Connection http2Connection, boolean b, final int n, final Object o) throws IOException {
        if ((n & 0x1) != 0x0) {
            b = true;
        }
        http2Connection.start(b);
    }
    
    public final void awaitPong() throws InterruptedException {
        synchronized (this) {
            while (this.awaitPongsReceived < this.awaitPingsSent) {
                this.wait();
            }
        }
    }
    
    @Override
    public void close() {
        this.close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }
    
    public final void close$okhttp(final ErrorCode p0, final ErrorCode p1, final IOException p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "connectionCode"
        //     4: invokestatic    ng2/e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_2        
        //     8: ldc_w           "streamCode"
        //    11: invokestatic    ng2/e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: getstatic       okhttp3/internal/_UtilJvmKt.assertionsEnabled:Z
        //    17: ifeq            74
        //    20: aload_0        
        //    21: invokestatic    java/lang/Thread.holdsLock:(Ljava/lang/Object;)Z
        //    24: ifne            30
        //    27: goto            74
        //    30: ldc_w           "Thread "
        //    33: invokestatic    a.t:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    36: astore_1       
        //    37: aload_1        
        //    38: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    41: invokevirtual   java/lang/Thread.getName:()Ljava/lang/String;
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    47: pop            
        //    48: aload_1        
        //    49: ldc_w           " MUST NOT hold lock on "
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    55: pop            
        //    56: aload_1        
        //    57: aload_0        
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    61: pop            
        //    62: new             Ljava/lang/AssertionError;
        //    65: dup            
        //    66: aload_1        
        //    67: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    70: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //    73: athrow         
        //    74: aload_0        
        //    75: aload_1        
        //    76: invokevirtual   okhttp3/internal/http2/Http2Connection.shutdown:(Lokhttp3/internal/http2/ErrorCode;)V
        //    79: aconst_null    
        //    80: astore_1       
        //    81: aload_0        
        //    82: monitorenter   
        //    83: aload_0        
        //    84: invokevirtual   okhttp3/internal/http2/Http2Connection.getStreams$okhttp:()Ljava/util/Map;
        //    87: invokeinterface java/util/Map.isEmpty:()Z
        //    92: istore          6
        //    94: iconst_0       
        //    95: istore          4
        //    97: iload           6
        //    99: iconst_1       
        //   100: ixor           
        //   101: ifeq            152
        //   104: aload_0        
        //   105: invokevirtual   okhttp3/internal/http2/Http2Connection.getStreams$okhttp:()Ljava/util/Map;
        //   108: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   113: iconst_0       
        //   114: anewarray       Lokhttp3/internal/http2/Http2Stream;
        //   117: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   122: astore_1       
        //   123: aload_1        
        //   124: ifnull          139
        //   127: aload_0        
        //   128: invokevirtual   okhttp3/internal/http2/Http2Connection.getStreams$okhttp:()Ljava/util/Map;
        //   131: invokeinterface java/util/Map.clear:()V
        //   136: goto            152
        //   139: new             Ljava/lang/NullPointerException;
        //   142: astore_1       
        //   143: aload_1        
        //   144: ldc_w           "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
        //   147: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   150: aload_1        
        //   151: athrow         
        //   152: getstatic       cg2/j.a:Lcg2/j;
        //   155: astore          7
        //   157: aload_0        
        //   158: monitorexit    
        //   159: aload_1        
        //   160: checkcast       [Lokhttp3/internal/http2/Http2Stream;
        //   163: astore_1       
        //   164: aload_1        
        //   165: ifnonnull       171
        //   168: goto            201
        //   171: aload_1        
        //   172: arraylength    
        //   173: istore          5
        //   175: iload           4
        //   177: iload           5
        //   179: if_icmpge       201
        //   182: aload_1        
        //   183: iload           4
        //   185: aaload         
        //   186: astore          7
        //   188: iinc            4, 1
        //   191: aload           7
        //   193: aload_2        
        //   194: aload_3        
        //   195: invokevirtual   okhttp3/internal/http2/Http2Stream.close:(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V
        //   198: goto            175
        //   201: aload_0        
        //   202: invokevirtual   okhttp3/internal/http2/Http2Connection.getWriter:()Lokhttp3/internal/http2/Http2Writer;
        //   205: invokevirtual   okhttp3/internal/http2/Http2Writer.close:()V
        //   208: aload_0        
        //   209: invokevirtual   okhttp3/internal/http2/Http2Connection.getSocket$okhttp:()Ljava/net/Socket;
        //   212: invokevirtual   java/net/Socket.close:()V
        //   215: aload_0        
        //   216: getfield        okhttp3/internal/http2/Http2Connection.writerQueue:Lokhttp3/internal/concurrent/TaskQueue;
        //   219: invokevirtual   okhttp3/internal/concurrent/TaskQueue.shutdown:()V
        //   222: aload_0        
        //   223: getfield        okhttp3/internal/http2/Http2Connection.pushQueue:Lokhttp3/internal/concurrent/TaskQueue;
        //   226: invokevirtual   okhttp3/internal/concurrent/TaskQueue.shutdown:()V
        //   229: aload_0        
        //   230: getfield        okhttp3/internal/http2/Http2Connection.settingsListenerQueue:Lokhttp3/internal/concurrent/TaskQueue;
        //   233: invokevirtual   okhttp3/internal/concurrent/TaskQueue.shutdown:()V
        //   236: return         
        //   237: astore_1       
        //   238: aload_0        
        //   239: monitorexit    
        //   240: aload_1        
        //   241: athrow         
        //   242: astore_1       
        //   243: goto            79
        //   246: astore          7
        //   248: goto            175
        //   251: astore_1       
        //   252: goto            208
        //   255: astore_1       
        //   256: goto            215
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  74     79     242    246    Ljava/io/IOException;
        //  83     94     237    242    Any
        //  104    123    237    242    Any
        //  127    136    237    242    Any
        //  139    152    237    242    Any
        //  152    157    237    242    Any
        //  191    198    246    251    Ljava/io/IOException;
        //  201    208    251    255    Ljava/io/IOException;
        //  208    215    255    259    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void flush() throws IOException {
        this.writer.flush();
    }
    
    public final boolean getClient$okhttp() {
        return this.client;
    }
    
    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }
    
    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }
    
    public final Listener getListener$okhttp() {
        return this.listener;
    }
    
    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }
    
    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }
    
    public final Settings getPeerSettings() {
        return this.peerSettings;
    }
    
    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }
    
    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }
    
    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }
    
    public final Socket getSocket$okhttp() {
        return this.socket;
    }
    
    public final Http2Stream getStream(final int n) {
        synchronized (this) {
            return this.streams.get(n);
        }
    }
    
    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }
    
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }
    
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }
    
    public final Http2Writer getWriter() {
        return this.writer;
    }
    
    public final boolean isHealthy(final long n) {
        synchronized (this) {
            return !this.isShutdown && (this.degradedPongsReceived >= this.degradedPingsSent || n < this.degradedPongDeadlineNs);
        }
    }
    
    public final Http2Stream newStream(final List<Header> list, final boolean b) throws IOException {
        e.f((Object)list, "requestHeaders");
        return this.newStream(0, list, b);
    }
    
    public final int openStreamCount() {
        synchronized (this) {
            return this.streams.size();
        }
    }
    
    public final void pushDataLater$okhttp(final int n, final f f, final int n2, final boolean b) throws IOException {
        e.f((Object)f, "source");
        final c c = new c();
        final long n3 = n2;
        f.c1(n3);
        ((g0)f).read(c, n3);
        final TaskQueue pushQueue = this.pushQueue;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(n);
        sb.append("] onData");
        TaskQueue.execute$default(pushQueue, sb.toString(), 0L, false, (a)new Http2Connection$pushDataLater$1(this, n, c, n2, b), 6, null);
    }
    
    public final void pushHeadersLater$okhttp(final int n, final List<Header> list, final boolean b) {
        e.f((Object)list, "requestHeaders");
        final TaskQueue pushQueue = this.pushQueue;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(n);
        sb.append("] onHeaders");
        TaskQueue.execute$default(pushQueue, sb.toString(), 0L, false, (a)new Http2Connection$pushHeadersLater$1(this, n, (List)list, b), 6, null);
    }
    
    public final void pushRequestLater$okhttp(final int n, final List<Header> list) {
        e.f((Object)list, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(n)) {
                this.writeSynResetLater$okhttp(n, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(n);
            monitorexit(this);
            final TaskQueue pushQueue = this.pushQueue;
            final StringBuilder sb = new StringBuilder();
            sb.append(this.connectionName);
            sb.append('[');
            sb.append(n);
            sb.append("] onRequest");
            TaskQueue.execute$default(pushQueue, sb.toString(), 0L, false, (a)new Http2Connection$pushRequestLater$2(this, n, (List)list), 6, null);
        }
    }
    
    public final void pushResetLater$okhttp(final int n, final ErrorCode errorCode) {
        e.f((Object)errorCode, "errorCode");
        final TaskQueue pushQueue = this.pushQueue;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(n);
        sb.append("] onReset");
        TaskQueue.execute$default(pushQueue, sb.toString(), 0L, false, (a)new Http2Connection$pushResetLater$1(this, n, errorCode), 6, null);
    }
    
    public final Http2Stream pushStream(final int n, final List<Header> list, final boolean b) throws IOException {
        e.f((Object)list, "requestHeaders");
        if (this.client ^ true) {
            return this.newStream(n, list, b);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }
    
    public final boolean pushedStream$okhttp(final int n) {
        boolean b = true;
        if (n == 0 || (n & 0x1) != 0x0) {
            b = false;
        }
        return b;
    }
    
    public final Http2Stream removeStream$okhttp(final int n) {
        synchronized (this) {
            final Http2Stream http2Stream = this.streams.remove(n);
            this.notifyAll();
            return http2Stream;
        }
    }
    
    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            final long degradedPongsReceived = this.degradedPongsReceived;
            final long degradedPingsSent = this.degradedPingsSent;
            if (degradedPongsReceived < degradedPingsSent) {
                return;
            }
            this.degradedPingsSent = degradedPingsSent + 1L;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            final j a = j.a;
            monitorexit(this);
            TaskQueue.execute$default(this.writerQueue, e.l((Object)" ping", this.connectionName), 0L, false, (a)new Http2Connection$sendDegradedPingLater$2(this), 6, null);
        }
    }
    
    public final void setLastGoodStreamId$okhttp(final int lastGoodStreamId) {
        this.lastGoodStreamId = lastGoodStreamId;
    }
    
    public final void setNextStreamId$okhttp(final int nextStreamId) {
        this.nextStreamId = nextStreamId;
    }
    
    public final void setPeerSettings(final Settings peerSettings) {
        e.f((Object)peerSettings, "<set-?>");
        this.peerSettings = peerSettings;
    }
    
    public final void setSettings(final Settings settings) throws IOException {
        e.f((Object)settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.getOkHttpSettings().merge(settings);
                    final j a = j.a;
                    monitorexit(this);
                    this.getWriter().settings(settings);
                    return;
                }
                throw new ConnectionShutdownException();
            }
        }
    }
    
    public final void shutdown(final ErrorCode errorCode) throws IOException {
        e.f((Object)errorCode, "statusCode");
        synchronized (this.writer) {
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                ref$IntRef.element = this.getLastGoodStreamId$okhttp();
                final j a = j.a;
                monitorexit(this);
                this.getWriter().goAway(ref$IntRef.element, errorCode, _UtilCommonKt.EMPTY_BYTE_ARRAY);
            }
        }
    }
    
    public final void start() throws IOException {
        start$default(this, false, 1, null);
    }
    
    public final void start(final boolean b) throws IOException {
        if (b) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            final int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, initialWindowSize - 65535);
            }
        }
        TaskQueue.execute$default(this.taskRunner.newQueue(), this.connectionName, 0L, false, (a)this.readerRunnable, 6, null);
    }
    
    public final void updateConnectionFlowControl$okhttp(long readBytesTotal) {
        synchronized (this) {
            readBytesTotal += this.readBytesTotal;
            this.readBytesTotal = readBytesTotal;
            readBytesTotal -= this.readBytesAcknowledged;
            if (readBytesTotal >= this.okHttpSettings.getInitialWindowSize() / 2) {
                this.writeWindowUpdateLater$okhttp(0, readBytesTotal);
                this.readBytesAcknowledged += readBytesTotal;
            }
        }
    }
    
    public final void writeData(final int n, final boolean b, final c c, long n2) throws IOException {
        long n3 = n2;
        if (n2 == 0L) {
            this.writer.data(b, n, c, 0);
            return;
        }
        while (n3 > 0L) {
            monitorenter(this);
            try {
                try {
                    while (this.getWriteBytesTotal() >= this.getWriteBytesMaximum()) {
                        if (!this.getStreams$okhttp().containsKey(n)) {
                            throw new IOException("stream closed");
                        }
                        this.wait();
                    }
                    final int min = Math.min((int)Math.min(n3, this.getWriteBytesMaximum() - this.getWriteBytesTotal()), this.getWriter().maxDataLength());
                    final long writeBytesTotal = this.getWriteBytesTotal();
                    n2 = min;
                    this.writeBytesTotal = writeBytesTotal + n2;
                    final j a = j.a;
                    monitorexit(this);
                    n3 -= n2;
                    this.writer.data(b && n3 == 0L, n, c, min);
                }
                finally {}
            }
            catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
            monitorexit(this);
        }
    }
    
    public final void writeHeaders$okhttp(final int n, final boolean b, final List<Header> list) throws IOException {
        e.f((Object)list, "alternating");
        this.writer.headers(b, n, list);
    }
    
    public final void writePing() throws InterruptedException {
        synchronized (this) {
            ++this.awaitPingsSent;
            monitorexit(this);
            this.writePing(false, 3, 1330343787);
        }
    }
    
    public final void writePing(final boolean b, final int n, final int n2) {
        try {
            this.writer.ping(b, n, n2);
        }
        catch (final IOException ex) {
            this.failConnection(ex);
        }
    }
    
    public final void writePingAndAwaitPong() throws InterruptedException {
        this.writePing();
        this.awaitPong();
    }
    
    public final void writeSynReset$okhttp(final int n, final ErrorCode errorCode) throws IOException {
        e.f((Object)errorCode, "statusCode");
        this.writer.rstStream(n, errorCode);
    }
    
    public final void writeSynResetLater$okhttp(final int n, final ErrorCode errorCode) {
        e.f((Object)errorCode, "errorCode");
        final TaskQueue writerQueue = this.writerQueue;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(n);
        sb.append("] writeSynReset");
        TaskQueue.execute$default(writerQueue, sb.toString(), 0L, false, (a)new Http2Connection$writeSynResetLater$1(this, n, errorCode), 6, null);
    }
    
    public final void writeWindowUpdateLater$okhttp(final int n, final long n2) {
        final TaskQueue writerQueue = this.writerQueue;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(n);
        sb.append("] windowUpdate");
        TaskQueue.execute$default(writerQueue, sb.toString(), 0L, false, (a)new Http2Connection$writeWindowUpdateLater$1(this, n, n2), 6, null);
    }
    
    @Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b+\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\bB\u0010CJ.\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0010R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006D" }, d2 = { "Lokhttp3/internal/http2/Http2Connection$Builder;", "", "Ljava/net/Socket;", "socket", "", "peerName", "Lfk2/f;", "source", "Lfk2/e;", "sink", "Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "", "pingIntervalMillis", "Lokhttp3/internal/http2/Http2Connection;", "build", "", "client", "Z", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "I", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "Lfk2/f;", "getSource$okhttp", "()Lfk2/f;", "setSource$okhttp", "(Lfk2/f;)V", "Lfk2/e;", "getSink$okhttp", "()Lfk2/e;", "setSink$okhttp", "(Lfk2/e;)V", "<init>", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public static final class Builder
    {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public fk2.e sink;
        public Socket socket;
        public f source;
        private final TaskRunner taskRunner;
        
        public Builder(final boolean client, final TaskRunner taskRunner) {
            e.f((Object)taskRunner, "taskRunner");
            this.client = client;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }
        
        public static Builder socket$default(final Builder builder, final Socket socket, String peerName, f b, fk2.e a, final int n, final Object o) throws IOException {
            if ((n & 0x2) != 0x0) {
                peerName = _UtilJvmKt.peerName(socket);
            }
            if ((n & 0x4) != 0x0) {
                b = (f)u.b(u.h(socket));
            }
            if ((n & 0x8) != 0x0) {
                a = (fk2.e)u.a(u.e(socket));
            }
            return builder.socket(socket, peerName, b, a);
        }
        
        public final Http2Connection build() {
            return new Http2Connection(this);
        }
        
        public final boolean getClient$okhttp() {
            return this.client;
        }
        
        public final String getConnectionName$okhttp() {
            final String connectionName = this.connectionName;
            if (connectionName != null) {
                return connectionName;
            }
            e.n("connectionName");
            throw null;
        }
        
        public final Listener getListener$okhttp() {
            return this.listener;
        }
        
        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }
        
        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }
        
        public final fk2.e getSink$okhttp() {
            final fk2.e sink = this.sink;
            if (sink != null) {
                return sink;
            }
            e.n("sink");
            throw null;
        }
        
        public final Socket getSocket$okhttp() {
            final Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            e.n("socket");
            throw null;
        }
        
        public final f getSource$okhttp() {
            final f source = this.source;
            if (source != null) {
                return source;
            }
            e.n("source");
            throw null;
        }
        
        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }
        
        public final Builder listener(final Listener listener$okhttp) {
            e.f((Object)listener$okhttp, "listener");
            this.setListener$okhttp(listener$okhttp);
            return this;
        }
        
        public final Builder pingIntervalMillis(final int pingIntervalMillis$okhttp) {
            this.setPingIntervalMillis$okhttp(pingIntervalMillis$okhttp);
            return this;
        }
        
        public final Builder pushObserver(final PushObserver pushObserver$okhttp) {
            e.f((Object)pushObserver$okhttp, "pushObserver");
            this.setPushObserver$okhttp(pushObserver$okhttp);
            return this;
        }
        
        public final void setClient$okhttp(final boolean client) {
            this.client = client;
        }
        
        public final void setConnectionName$okhttp(final String connectionName) {
            e.f((Object)connectionName, "<set-?>");
            this.connectionName = connectionName;
        }
        
        public final void setListener$okhttp(final Listener listener) {
            e.f((Object)listener, "<set-?>");
            this.listener = listener;
        }
        
        public final void setPingIntervalMillis$okhttp(final int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
        }
        
        public final void setPushObserver$okhttp(final PushObserver pushObserver) {
            e.f((Object)pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }
        
        public final void setSink$okhttp(final fk2.e sink) {
            e.f((Object)sink, "<set-?>");
            this.sink = sink;
        }
        
        public final void setSocket$okhttp(final Socket socket) {
            e.f((Object)socket, "<set-?>");
            this.socket = socket;
        }
        
        public final void setSource$okhttp(final f source) {
            e.f((Object)source, "<set-?>");
            this.source = source;
        }
        
        public final Builder socket(final Socket socket) throws IOException {
            e.f((Object)socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }
        
        public final Builder socket(final Socket socket, final String s) throws IOException {
            e.f((Object)socket, "socket");
            e.f((Object)s, "peerName");
            return socket$default(this, socket, s, null, null, 12, null);
        }
        
        public final Builder socket(final Socket socket, final String s, final f f) throws IOException {
            e.f((Object)socket, "socket");
            e.f((Object)s, "peerName");
            e.f((Object)f, "source");
            return socket$default(this, socket, s, f, null, 8, null);
        }
        
        public final Builder socket(final Socket socket$okhttp, final String s, final f source$okhttp, final fk2.e sink$okhttp) throws IOException {
            e.f((Object)socket$okhttp, "socket");
            e.f((Object)s, "peerName");
            e.f((Object)source$okhttp, "source");
            e.f((Object)sink$okhttp, "sink");
            this.setSocket$okhttp(socket$okhttp);
            String connectionName$okhttp;
            if (this.getClient$okhttp()) {
                final StringBuilder sb = new StringBuilder();
                sb.append(_UtilJvmKt.okHttpName);
                sb.append(' ');
                sb.append(s);
                connectionName$okhttp = sb.toString();
            }
            else {
                connectionName$okhttp = e.l((Object)s, "MockWebServer ");
            }
            this.setConnectionName$okhttp(connectionName$okhttp);
            this.setSource$okhttp(source$okhttp);
            this.setSink$okhttp(sink$okhttp);
            return this;
        }
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r" }, d2 = { "Lokhttp3/internal/http2/Http2Connection$Companion;", "", "()V", "AWAIT_PING", "", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.access$getDEFAULT_SETTINGS$cp();
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e" }, d2 = { "Lokhttp3/internal/http2/Http2Connection$Listener;", "", "Lokhttp3/internal/http2/Http2Stream;", "stream", "Lcg2/j;", "onStream", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "<init>", "()V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public abstract static class Listener
    {
        public static final Companion Companion;
        public static final Listener REFUSE_INCOMING_STREAMS;
        
        static {
            Companion = new Companion(null);
            REFUSE_INCOMING_STREAMS = (Listener)new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();
        }
        
        public void onSettings(final Http2Connection http2Connection, final Settings settings) {
            e.f((Object)http2Connection, "connection");
            e.f((Object)settings, "settings");
        }
        
        public abstract void onStream(final Http2Stream p0) throws IOException;
        
        @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "()V", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
        public static final class Companion
        {
            private Companion() {
            }
            
            public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b8\u00109J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J \u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J \u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0016J(\u0010(\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0005H\u0016J&\u0010+\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J8\u00102\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\"H\u0016R\u001a\u00104\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006:" }, d2 = { "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "Lcg2/j;", "invoke", "", "inFinished", "", "streamId", "Lfk2/f;", "source", "length", "data", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "applyAndAckSettings", "ackSettings", "ack", "payload1", "payload2", "ping", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "goAway", "", "windowSizeIncrement", "windowUpdate", "streamDependency", "weight", "exclusive", "priority", "promisedStreamId", "requestHeaders", "pushPromise", "", "origin", "protocol", "host", "port", "maxAge", "alternateService", "Lokhttp3/internal/http2/Http2Reader;", "reader", "Lokhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "<init>", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class ReaderRunnable implements Handler, a<j>
    {
        private final Http2Reader reader;
        public final Http2Connection this$0;
        
        public ReaderRunnable(final Http2Connection this$0, final Http2Reader reader) {
            e.f((Object)this$0, "this$0");
            e.f((Object)reader, "reader");
            this.this$0 = this$0;
            this.reader = reader;
        }
        
        @Override
        public void ackSettings() {
        }
        
        @Override
        public void alternateService(final int n, final String s, final ByteString byteString, final String s2, final int n2, final long n3) {
            e.f((Object)s, "origin");
            e.f((Object)byteString, "protocol");
            e.f((Object)s2, "host");
        }
        
        public final void applyAndAckSettings(final boolean p0, final Settings p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "settings"
            //     3: invokestatic    ng2/e.f:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: new             Lkotlin/jvm/internal/Ref$ObjectRef;
            //     9: dup            
            //    10: invokespecial   kotlin/jvm/internal/Ref$ObjectRef.<init>:()V
            //    13: astore          10
            //    15: aload_0        
            //    16: getfield        okhttp3/internal/http2/Http2Connection$ReaderRunnable.this$0:Lokhttp3/internal/http2/Http2Connection;
            //    19: invokevirtual   okhttp3/internal/http2/Http2Connection.getWriter:()Lokhttp3/internal/http2/Http2Writer;
            //    22: astore          8
            //    24: aload_0        
            //    25: getfield        okhttp3/internal/http2/Http2Connection$ReaderRunnable.this$0:Lokhttp3/internal/http2/Http2Connection;
            //    28: astore          9
            //    30: aload           8
            //    32: monitorenter   
            //    33: aload           9
            //    35: monitorenter   
            //    36: aload           9
            //    38: invokevirtual   okhttp3/internal/http2/Http2Connection.getPeerSettings:()Lokhttp3/internal/http2/Settings;
            //    41: astore          11
            //    43: iload_1        
            //    44: ifeq            50
            //    47: goto            76
            //    50: new             Lokhttp3/internal/http2/Settings;
            //    53: astore          7
            //    55: aload           7
            //    57: invokespecial   okhttp3/internal/http2/Settings.<init>:()V
            //    60: aload           7
            //    62: aload           11
            //    64: invokevirtual   okhttp3/internal/http2/Settings.merge:(Lokhttp3/internal/http2/Settings;)V
            //    67: aload           7
            //    69: aload_2        
            //    70: invokevirtual   okhttp3/internal/http2/Settings.merge:(Lokhttp3/internal/http2/Settings;)V
            //    73: aload           7
            //    75: astore_2       
            //    76: aload           10
            //    78: aload_2        
            //    79: putfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
            //    82: aload_2        
            //    83: invokevirtual   okhttp3/internal/http2/Settings.getInitialWindowSize:()I
            //    86: i2l            
            //    87: aload           11
            //    89: invokevirtual   okhttp3/internal/http2/Settings.getInitialWindowSize:()I
            //    92: i2l            
            //    93: lsub           
            //    94: lstore          5
            //    96: iconst_0       
            //    97: istore_3       
            //    98: lload           5
            //   100: lconst_0       
            //   101: lcmp           
            //   102: ifeq            165
            //   105: aload           9
            //   107: invokevirtual   okhttp3/internal/http2/Http2Connection.getStreams$okhttp:()Ljava/util/Map;
            //   110: invokeinterface java/util/Map.isEmpty:()Z
            //   115: ifeq            121
            //   118: goto            165
            //   121: aload           9
            //   123: invokevirtual   okhttp3/internal/http2/Http2Connection.getStreams$okhttp:()Ljava/util/Map;
            //   126: invokeinterface java/util/Map.values:()Ljava/util/Collection;
            //   131: iconst_0       
            //   132: anewarray       Lokhttp3/internal/http2/Http2Stream;
            //   135: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
            //   140: astore_2       
            //   141: aload_2        
            //   142: ifnull          153
            //   145: aload_2        
            //   146: checkcast       [Lokhttp3/internal/http2/Http2Stream;
            //   149: astore_2       
            //   150: goto            167
            //   153: new             Ljava/lang/NullPointerException;
            //   156: astore_2       
            //   157: aload_2        
            //   158: ldc             "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            //   160: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   163: aload_2        
            //   164: athrow         
            //   165: aconst_null    
            //   166: astore_2       
            //   167: aload           9
            //   169: aload           10
            //   171: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
            //   174: checkcast       Lokhttp3/internal/http2/Settings;
            //   177: invokevirtual   okhttp3/internal/http2/Http2Connection.setPeerSettings:(Lokhttp3/internal/http2/Settings;)V
            //   180: aload           9
            //   182: invokestatic    okhttp3/internal/http2/Http2Connection.access$getSettingsListenerQueue$p:(Lokhttp3/internal/http2/Http2Connection;)Lokhttp3/internal/concurrent/TaskQueue;
            //   185: astore          11
            //   187: ldc             " onSettings"
            //   189: aload           9
            //   191: invokevirtual   okhttp3/internal/http2/Http2Connection.getConnectionName$okhttp:()Ljava/lang/String;
            //   194: invokestatic    ng2/e.l:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
            //   197: astore          12
            //   199: new             Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$applyAndAckSettings$1$1$2;
            //   202: astore          7
            //   204: aload           7
            //   206: aload           9
            //   208: aload           10
            //   210: invokespecial   okhttp3/internal/http2/Http2Connection$ReaderRunnable$applyAndAckSettings$1$1$2.<init>:(Lokhttp3/internal/http2/Http2Connection;Lkotlin/jvm/internal/Ref$ObjectRef;)V
            //   213: aload           11
            //   215: aload           12
            //   217: lconst_0       
            //   218: iconst_0       
            //   219: aload           7
            //   221: bipush          6
            //   223: aconst_null    
            //   224: invokestatic    okhttp3/internal/concurrent/TaskQueue.execute$default:(Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;JZLmg2/a;ILjava/lang/Object;)V
            //   227: getstatic       cg2/j.a:Lcg2/j;
            //   230: astore          7
            //   232: aload           9
            //   234: monitorexit    
            //   235: aload           9
            //   237: invokevirtual   okhttp3/internal/http2/Http2Connection.getWriter:()Lokhttp3/internal/http2/Http2Writer;
            //   240: aload           10
            //   242: getfield        kotlin/jvm/internal/Ref$ObjectRef.element:Ljava/lang/Object;
            //   245: checkcast       Lokhttp3/internal/http2/Settings;
            //   248: invokevirtual   okhttp3/internal/http2/Http2Writer.applyAndAckSettings:(Lokhttp3/internal/http2/Settings;)V
            //   251: goto            263
            //   254: astore          7
            //   256: aload           9
            //   258: aload           7
            //   260: invokestatic    okhttp3/internal/http2/Http2Connection.access$failConnection:(Lokhttp3/internal/http2/Http2Connection;Ljava/io/IOException;)V
            //   263: getstatic       cg2/j.a:Lcg2/j;
            //   266: astore          7
            //   268: aload           8
            //   270: monitorexit    
            //   271: aload_2        
            //   272: ifnull          320
            //   275: aload_2        
            //   276: arraylength    
            //   277: istore          4
            //   279: iload_3        
            //   280: iload           4
            //   282: if_icmpge       320
            //   285: aload_2        
            //   286: iload_3        
            //   287: aaload         
            //   288: astore          7
            //   290: iinc            3, 1
            //   293: aload           7
            //   295: monitorenter   
            //   296: aload           7
            //   298: lload           5
            //   300: invokevirtual   okhttp3/internal/http2/Http2Stream.addBytesToWriteWindow:(J)V
            //   303: getstatic       cg2/j.a:Lcg2/j;
            //   306: astore          8
            //   308: aload           7
            //   310: monitorexit    
            //   311: goto            279
            //   314: astore_2       
            //   315: aload           7
            //   317: monitorexit    
            //   318: aload_2        
            //   319: athrow         
            //   320: return         
            //   321: astore_2       
            //   322: aload           9
            //   324: monitorexit    
            //   325: aload_2        
            //   326: athrow         
            //   327: astore_2       
            //   328: aload           8
            //   330: monitorexit    
            //   331: aload_2        
            //   332: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  33     36     327    333    Any
            //  36     43     321    327    Any
            //  50     73     321    327    Any
            //  76     96     321    327    Any
            //  105    118    321    327    Any
            //  121    141    321    327    Any
            //  145    150    321    327    Any
            //  153    165    321    327    Any
            //  167    232    321    327    Any
            //  232    235    327    333    Any
            //  235    251    254    263    Ljava/io/IOException;
            //  235    251    327    333    Any
            //  256    263    327    333    Any
            //  263    268    327    333    Any
            //  296    308    314    320    Any
            //  322    327    327    333    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
            //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
            //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public void data(final boolean b, final int n, final f f, final int n2) throws IOException {
            e.f((Object)f, "source");
            if (this.this$0.pushedStream$okhttp(n)) {
                this.this$0.pushDataLater$okhttp(n, f, n2, b);
                return;
            }
            final Http2Stream stream = this.this$0.getStream(n);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(n, ErrorCode.PROTOCOL_ERROR);
                final Http2Connection this$0 = this.this$0;
                final long n3 = n2;
                this$0.updateConnectionFlowControl$okhttp(n3);
                f.skip(n3);
                return;
            }
            stream.receiveData(f, n2);
            if (b) {
                stream.receiveHeaders(_UtilJvmKt.EMPTY_HEADERS, true);
            }
        }
        
        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }
        
        @Override
        public void goAway(final int n, ErrorCode this$0, final ByteString byteString) {
            e.f((Object)this$0, "errorCode");
            e.f((Object)byteString, "debugData");
            byteString.size();
            this$0 = (ErrorCode)this.this$0;
            synchronized (this$0) {
                final Collection<Http2Stream> values = ((Http2Connection)this$0).getStreams$okhttp().values();
                int i = 0;
                final Http2Stream[] array = values.toArray(new Http2Stream[0]);
                if (array != null) {
                    Http2Connection.access$setShutdown$p((Http2Connection)this$0, true);
                    final j a = j.a;
                    monitorexit(this$0);
                    this$0 = (ErrorCode)(Object)array;
                    while (i < this$0.length) {
                        final Http2Stream http2Stream = this$0[i];
                        final int n2 = ++i;
                        if (http2Stream.getId() > n) {
                            i = n2;
                            if (!http2Stream.isLocallyInitiated()) {
                                continue;
                            }
                            http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                            this.this$0.removeStream$okhttp(http2Stream.getId());
                            i = n2;
                        }
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        
        @Override
        public void headers(final boolean b, final int lastGoodStreamId$okhttp, int n, final List<Header> list) {
            e.f((Object)list, "headerBlock");
            if (this.this$0.pushedStream$okhttp(lastGoodStreamId$okhttp)) {
                this.this$0.pushHeadersLater$okhttp(lastGoodStreamId$okhttp, list, b);
                return;
            }
            final Http2Connection this$0 = this.this$0;
            synchronized (this$0) {
                final Http2Stream stream = this$0.getStream(lastGoodStreamId$okhttp);
                if (stream != null) {
                    final j a = j.a;
                    monitorexit(this$0);
                    stream.receiveHeaders(_UtilJvmKt.toHeaders(list), b);
                    return;
                }
                if (Http2Connection.access$isShutdown$p(this$0)) {
                    return;
                }
                n = this$0.getLastGoodStreamId$okhttp();
                if (lastGoodStreamId$okhttp <= n) {
                    return;
                }
                n = this$0.getNextStreamId$okhttp();
                if (lastGoodStreamId$okhttp % 2 == n % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(lastGoodStreamId$okhttp, this$0, false, b, _UtilJvmKt.toHeaders(list));
                this$0.setLastGoodStreamId$okhttp(lastGoodStreamId$okhttp);
                this$0.getStreams$okhttp().put(lastGoodStreamId$okhttp, http2Stream);
                final TaskQueue queue = Http2Connection.access$getTaskRunner$p(this$0).newQueue();
                final StringBuilder sb = new StringBuilder();
                sb.append(this$0.getConnectionName$okhttp());
                sb.append('[');
                sb.append(lastGoodStreamId$okhttp);
                sb.append("] onStream");
                TaskQueue.execute$default(queue, sb.toString(), 0L, false, (a)new Http2Connection$ReaderRunnable$headers$1$1(this$0, http2Stream), 6, null);
            }
        }
        
        public /* bridge */ Object invoke() {
            this.invoke();
            return j.a;
        }
        
        public void invoke() {
            final ErrorCode internal_ERROR = ErrorCode.INTERNAL_ERROR;
            IOException ex = null;
            ErrorCode no_ERROR = null;
            IOException ex4 = null;
            Label_0112: {
                ErrorCode errorCode = null;
                try {
                    this.reader.readConnectionPreface((Http2Reader.Handler)this);
                    while (this.reader.nextFrame(false, (Http2Reader.Handler)this)) {}
                    errorCode = (no_ERROR = ErrorCode.NO_ERROR);
                    try {
                        final ErrorCode errorCode2 = ErrorCode.CANCEL;
                        final ReaderRunnable readerRunnable = this;
                        final Http2Connection http2Connection = readerRunnable.this$0;
                        final ErrorCode errorCode3 = errorCode;
                        final ErrorCode errorCode4 = errorCode2;
                        final IOException ex2 = null;
                        http2Connection.close$okhttp(errorCode3, errorCode4, ex2);
                    }
                    catch (final IOException ex3) {}
                }
                catch (final IOException ex3) {}
                finally {
                    final Object o;
                    ex = (IOException)o;
                    no_ERROR = internal_ERROR;
                    break Label_0112;
                }
                try {
                    final ErrorCode errorCode2 = ErrorCode.CANCEL;
                    final ReaderRunnable readerRunnable = this;
                    final Http2Connection http2Connection = readerRunnable.this$0;
                    final ErrorCode errorCode3 = errorCode;
                    final ErrorCode errorCode4 = errorCode2;
                    final IOException ex2 = null;
                    http2Connection.close$okhttp(errorCode3, errorCode4, ex2);
                    while (true) {
                        _UtilCommonKt.closeQuietly(this.reader);
                        return;
                        final IOException ex3;
                        ex = ex3;
                        final ErrorCode protocol_ERROR = ErrorCode.PROTOCOL_ERROR;
                        this.this$0.close$okhttp(protocol_ERROR, protocol_ERROR, ex3);
                        continue;
                    }
                }
                finally {
                    ex4 = ex;
                }
            }
            this.this$0.close$okhttp(no_ERROR, internal_ERROR, ex4);
            _UtilCommonKt.closeQuietly(this.reader);
        }
        
        @Override
        public void ping(final boolean b, final int n, final int n2) {
            if (b) {
                final Http2Connection this$0 = this.this$0;
                monitorenter(this$0);
                Label_0071: {
                    if (n == 1) {
                        break Label_0071;
                    }
                    Label_0056: {
                        if (n == 2) {
                            break Label_0056;
                        }
                        Label_0036: {
                            if (n == 3) {
                                break Label_0036;
                            }
                            try {
                                while (true) {
                                    final j a = j.a;
                                    return;
                                    Http2Connection.access$setIntervalPongsReceived$p(this$0, Http2Connection.access$getIntervalPongsReceived$p(this$0) + 1L);
                                    return;
                                    Http2Connection.access$setDegradedPongsReceived$p(this$0, Http2Connection.access$getDegradedPongsReceived$p(this$0) + 1L);
                                    return;
                                    Http2Connection.access$setAwaitPongsReceived$p(this$0, Http2Connection.access$getAwaitPongsReceived$p(this$0) + 1L);
                                    this$0.notifyAll();
                                    continue;
                                }
                            }
                            finally {
                                monitorexit(this$0);
                            }
                        }
                    }
                }
            }
            TaskQueue.execute$default(Http2Connection.access$getWriterQueue$p(this.this$0), e.l((Object)" ping", this.this$0.getConnectionName$okhttp()), 0L, false, (a)new Http2Connection$ReaderRunnable$ping$2(this.this$0, n, n2), 6, null);
        }
        
        @Override
        public void priority(final int n, final int n2, final int n3, final boolean b) {
        }
        
        @Override
        public void pushPromise(final int n, final int n2, final List<Header> list) {
            e.f((Object)list, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(n2, list);
        }
        
        @Override
        public void rstStream(final int n, final ErrorCode errorCode) {
            e.f((Object)errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(n)) {
                this.this$0.pushResetLater$okhttp(n, errorCode);
                return;
            }
            final Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(n);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }
        
        @Override
        public void settings(final boolean b, final Settings settings) {
            e.f((Object)settings, "settings");
            TaskQueue.execute$default(Http2Connection.access$getWriterQueue$p(this.this$0), e.l((Object)" applyAndAckSettings", this.this$0.getConnectionName$okhttp()), 0L, false, (a)new Http2Connection$ReaderRunnable$settings$1(this, b, settings), 6, null);
        }
        
        @Override
        public void windowUpdate(final int n, final long n2) {
            if (n == 0) {
                final Http2Connection this$0 = this.this$0;
                synchronized (this$0) {
                    Http2Connection.access$setWriteBytesMaximum$p(this$0, this$0.getWriteBytesMaximum() + n2);
                    this$0.notifyAll();
                    final j a = j.a;
                    return;
                }
            }
            final Http2Stream stream = this.this$0.getStream(n);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(n2);
                    final j a2 = j.a;
                }
            }
        }
    }
}
