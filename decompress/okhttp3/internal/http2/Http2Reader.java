// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http2;

import fk2.h0;
import fk2.c;
import okhttp3.internal._UtilJvmKt;
import java.io.EOFException;
import java.util.logging.Level;
import tg2.g;
import zd.b;
import aq2.a;
import java.util.List;
import okio.ByteString;
import okhttp3.internal._UtilCommonKt;
import java.io.IOException;
import fk2.g0;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import fk2.f;
import java.util.logging.Logger;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0003'()B\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b%\u0010&J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u001a\u001a\u00020\bH\u0016R\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006*" }, d2 = { "Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "handler", "", "length", "flags", "streamId", "Lcg2/j;", "readHeaders", "padding", "", "Lokhttp3/internal/http2/Header;", "readHeaderBlock", "readData", "readPriority", "readRstStream", "readSettings", "readPushPromise", "readPing", "readGoAway", "readWindowUpdate", "readConnectionPreface", "", "requireSettings", "nextFrame", "close", "client", "Z", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "continuation", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokhttp3/internal/http2/Hpack$Reader;", "hpackReader", "Lokhttp3/internal/http2/Hpack$Reader;", "Lfk2/f;", "source", "<init>", "(Lfk2/f;Z)V", "Companion", "ContinuationSource", "Handler", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class Http2Reader implements Closeable
{
    public static final Companion Companion;
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final f source;
    
    static {
        Companion = new Companion(null);
        final Logger logger2 = Logger.getLogger(Http2.class.getName());
        e.e((Object)logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }
    
    public Http2Reader(final f source, final boolean client) {
        e.f((Object)source, "source");
        this.source = source;
        this.client = client;
        final ContinuationSource continuation = new ContinuationSource(source);
        this.continuation = continuation;
        this.hpackReader = new Hpack.Reader(continuation, 4096, 0, 4, null);
    }
    
    public static final Logger access$getLogger$cp() {
        return Http2Reader.logger;
    }
    
    private final void readData(final Handler handler, int lengthWithoutPadding, final int n, final int n2) throws IOException {
        if (n2 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final int n3 = 0;
        boolean b = true;
        final boolean b2 = (n & 0x1) != 0x0;
        if ((n & 0x20) == 0x0) {
            b = false;
        }
        if (!b) {
            int and = n3;
            if ((n & 0x8) != 0x0) {
                and = _UtilCommonKt.and(this.source.readByte(), 255);
            }
            lengthWithoutPadding = Http2Reader.Companion.lengthWithoutPadding(lengthWithoutPadding, n, and);
            handler.data(b2, n2, this.source, lengthWithoutPadding);
            this.source.skip((long)and);
            return;
        }
        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
    }
    
    private final void readGoAway(final Handler handler, int n, int int1, int int2) throws IOException {
        if (n < 8) {
            throw new IOException(e.l((Object)n, "TYPE_GOAWAY length < 8: "));
        }
        if (int2 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int1 = this.source.readInt();
        int2 = this.source.readInt();
        n -= 8;
        final ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(int2);
        if (fromHttp2 != null) {
            ByteString byteString = ByteString.EMPTY;
            if (n > 0) {
                byteString = this.source.U0((long)n);
            }
            handler.goAway(int1, fromHttp2, byteString);
            return;
        }
        throw new IOException(e.l((Object)int2, "TYPE_GOAWAY unexpected error code: "));
    }
    
    private final List<Header> readHeaderBlock(final int left, final int padding, final int flags, final int streamId) throws IOException {
        this.continuation.setLeft(left);
        final ContinuationSource continuation = this.continuation;
        continuation.setLength(continuation.getLeft());
        this.continuation.setPadding(padding);
        this.continuation.setFlags(flags);
        this.continuation.setStreamId(streamId);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }
    
    private final void readHeaders(final Handler handler, final int n, final int n2, final int n3) throws IOException {
        if (n3 != 0) {
            int and = 0;
            final boolean b = (n2 & 0x1) != 0x0;
            if ((n2 & 0x8) != 0x0) {
                and = _UtilCommonKt.and(this.source.readByte(), 255);
            }
            int n4 = n;
            if ((n2 & 0x20) != 0x0) {
                this.readPriority(handler, n3);
                n4 = n - 5;
            }
            handler.headers(b, n3, -1, this.readHeaderBlock(Http2Reader.Companion.lengthWithoutPadding(n4, n2, and), and, n2, n3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }
    
    private final void readPing(final Handler handler, int int1, final int n, int int2) throws IOException {
        if (int1 != 8) {
            throw new IOException(e.l((Object)int1, "TYPE_PING length != 8: "));
        }
        if (int2 == 0) {
            int2 = this.source.readInt();
            int1 = this.source.readInt();
            boolean b = true;
            if ((n & 0x1) == 0x0) {
                b = false;
            }
            handler.ping(b, int2, int1);
            return;
        }
        throw new IOException("TYPE_PING streamId != 0");
    }
    
    private final void readPriority(final Handler handler, final int n) throws IOException {
        final int int1 = this.source.readInt();
        handler.priority(n, int1 & Integer.MAX_VALUE, _UtilCommonKt.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & int1) != 0x0);
    }
    
    private final void readPriority(final Handler handler, final int n, final int n2, final int n3) throws IOException {
        if (n != 5) {
            throw new IOException(a.l("TYPE_PRIORITY length: ", n, " != 5"));
        }
        if (n3 != 0) {
            this.readPriority(handler, n3);
            return;
        }
        throw new IOException("TYPE_PRIORITY streamId == 0");
    }
    
    private final void readPushPromise(final Handler handler, final int n, final int n2, final int n3) throws IOException {
        if (n3 != 0) {
            int and;
            if ((n2 & 0x8) != 0x0) {
                and = _UtilCommonKt.and(this.source.readByte(), 255);
            }
            else {
                and = 0;
            }
            handler.pushPromise(n3, this.source.readInt() & Integer.MAX_VALUE, this.readHeaderBlock(Http2Reader.Companion.lengthWithoutPadding(n - 4, n2, and), and, n2, n3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
    
    private final void readRstStream(final Handler handler, int int1, final int n, final int n2) throws IOException {
        if (int1 != 4) {
            throw new IOException(a.l("TYPE_RST_STREAM length: ", int1, " != 4"));
        }
        if (n2 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int1 = this.source.readInt();
        final ErrorCode fromHttp2 = ErrorCode.Companion.fromHttp2(int1);
        if (fromHttp2 != null) {
            handler.rstStream(n2, fromHttp2);
            return;
        }
        throw new IOException(e.l((Object)int1, "TYPE_RST_STREAM unexpected error code: "));
    }
    
    private final void readSettings(final Handler handler, int f, int n, int and) throws IOException {
        if (and != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((n & 0x1) != 0x0) {
            if (f == 0) {
                handler.ackSettings();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        }
        else {
            if (f % 6 == 0) {
                final Settings settings = new Settings();
                final g f2 = b.f1(b.w1(0, f), 6);
                f = f2.f;
                final int g = f2.g;
                final int h = f2.h;
                Label_0290: {
                    if (h <= 0 || (n = f) > g) {
                        if (h >= 0 || g > f) {
                            break Label_0290;
                        }
                        n = f;
                    }
                    while (true) {
                        and = _UtilCommonKt.and(this.source.readShort(), 65535);
                        final int int1 = this.source.readInt();
                        if (and != 2) {
                            if (and != 3) {
                                if (and != 4) {
                                    if (and != 5) {
                                        f = and;
                                    }
                                    else {
                                        if (int1 < 16384 || int1 > 16777215) {
                                            throw new IOException(e.l((Object)int1, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        }
                                        f = and;
                                    }
                                }
                                else {
                                    f = 7;
                                    if (int1 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                }
                            }
                            else {
                                f = 4;
                            }
                        }
                        else {
                            f = and;
                            if (int1 != 0) {
                                if (int1 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                f = and;
                            }
                        }
                        settings.set(f, int1);
                        if (n == g) {
                            break;
                        }
                        n += h;
                    }
                }
                handler.settings(false, settings);
                return;
            }
            throw new IOException(e.l((Object)f, "TYPE_SETTINGS length % 6 != 0: "));
        }
    }
    
    private final void readWindowUpdate(final Handler handler, final int n, final int n2, final int n3) throws IOException {
        if (n != 4) {
            throw new IOException(e.l((Object)n, "TYPE_WINDOW_UPDATE length !=4: "));
        }
        final long and = _UtilCommonKt.and(this.source.readInt(), 2147483647L);
        if (and != 0L) {
            handler.windowUpdate(n3, and);
            return;
        }
        throw new IOException("windowSizeIncrement was 0");
    }
    
    @Override
    public void close() throws IOException {
        ((g0)this.source).close();
    }
    
    public final boolean nextFrame(final boolean b, final Handler handler) throws IOException {
        e.f((Object)handler, "handler");
        try {
            this.source.c1(9L);
            final int medium = _UtilCommonKt.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException(e.l((Object)medium, "FRAME_SIZE_ERROR: "));
            }
            final int and = _UtilCommonKt.and(this.source.readByte(), 255);
            final int and2 = _UtilCommonKt.and(this.source.readByte(), 255);
            final int n = this.source.readInt() & Integer.MAX_VALUE;
            final Logger logger = Http2Reader.logger;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.INSTANCE.frameLog(true, n, medium, and, and2));
            }
            if (b && and != 4) {
                throw new IOException(e.l((Object)Http2.INSTANCE.formattedType$okhttp(and), "Expected a SETTINGS frame but was "));
            }
            switch (and) {
                default: {
                    this.source.skip((long)medium);
                    break;
                }
                case 8: {
                    this.readWindowUpdate(handler, medium, and2, n);
                    break;
                }
                case 7: {
                    this.readGoAway(handler, medium, and2, n);
                    break;
                }
                case 6: {
                    this.readPing(handler, medium, and2, n);
                    break;
                }
                case 5: {
                    this.readPushPromise(handler, medium, and2, n);
                    break;
                }
                case 4: {
                    this.readSettings(handler, medium, and2, n);
                    break;
                }
                case 3: {
                    this.readRstStream(handler, medium, and2, n);
                    break;
                }
                case 2: {
                    this.readPriority(handler, medium, and2, n);
                    break;
                }
                case 1: {
                    this.readHeaders(handler, medium, and2, n);
                    break;
                }
                case 0: {
                    this.readData(handler, medium, and2, n);
                    break;
                }
            }
            return true;
        }
        catch (final EOFException ex) {
            return false;
        }
    }
    
    public final void readConnectionPreface(final Handler handler) throws IOException {
        e.f((Object)handler, "handler");
        if (this.client) {
            if (!this.nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
        }
        else {
            final f source = this.source;
            final ByteString connection_PREFACE = Http2.CONNECTION_PREFACE;
            final ByteString u0 = source.U0((long)connection_PREFACE.size());
            final Logger logger = Http2Reader.logger;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(_UtilJvmKt.format(e.l((Object)u0.hex(), "<< CONNECTION "), new Object[0]));
            }
            if (!e.a((Object)connection_PREFACE, (Object)u0)) {
                throw new IOException(e.l((Object)u0.utf8(), "Expected a connection header but was "));
            }
        }
    }
    
    @Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f" }, d2 = { "Lokhttp3/internal/http2/Http2Reader$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "lengthWithoutPadding", "", "length", "flags", "padding", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final Logger getLogger() {
            return Http2Reader.access$getLogger$cp();
        }
        
        public final int lengthWithoutPadding(final int n, final int n2, final int n3) throws IOException {
            int n4 = n;
            if ((n2 & 0x8) != 0x0) {
                n4 = n - 1;
            }
            if (n3 <= n4) {
                return n4 - n3;
            }
            throw new IOException(b.i("PROTOCOL_ERROR padding ", n3, " > remaining length ", n4));
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006#" }, d2 = { "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lfk2/g0;", "Lcg2/j;", "readContinuationHeader", "Lfk2/c;", "sink", "", "byteCount", "read", "Lfk2/h0;", "timeout", "close", "", "length", "I", "getLength", "()I", "setLength", "(I)V", "flags", "getFlags", "setFlags", "streamId", "getStreamId", "setStreamId", "left", "getLeft", "setLeft", "padding", "getPadding", "setPadding", "Lfk2/f;", "source", "<init>", "(Lfk2/f;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public static final class ContinuationSource implements g0
    {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final f source;
        private int streamId;
        
        public ContinuationSource(final f source) {
            e.f((Object)source, "source");
            this.source = source;
        }
        
        private final void readContinuationHeader() throws IOException {
            final int streamId = this.streamId;
            final int medium = _UtilCommonKt.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            final int and = _UtilCommonKt.and(this.source.readByte(), 255);
            this.flags = _UtilCommonKt.and(this.source.readByte(), 255);
            final Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
            }
            final int streamId2 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = streamId2;
            if (and != 9) {
                final StringBuilder sb = new StringBuilder();
                sb.append(and);
                sb.append(" != TYPE_CONTINUATION");
                throw new IOException(sb.toString());
            }
            if (streamId2 == streamId) {
                return;
            }
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
        
        @Override
        public void close() throws IOException {
        }
        
        public final int getFlags() {
            return this.flags;
        }
        
        public final int getLeft() {
            return this.left;
        }
        
        public final int getLength() {
            return this.length;
        }
        
        public final int getPadding() {
            return this.padding;
        }
        
        public final int getStreamId() {
            return this.streamId;
        }
        
        @Override
        public long read(final c c, long read) throws IOException {
            e.f((Object)c, "sink");
            while (true) {
                final int left = this.left;
                if (left == 0) {
                    this.source.skip((long)this.padding);
                    this.padding = 0;
                    if ((this.flags & 0x4) != 0x0) {
                        return -1L;
                    }
                    this.readContinuationHeader();
                }
                else {
                    read = ((g0)this.source).read(c, Math.min(read, left));
                    if (read == -1L) {
                        return -1L;
                    }
                    this.left -= (int)read;
                    return read;
                }
            }
        }
        
        public final void setFlags(final int flags) {
            this.flags = flags;
        }
        
        public final void setLeft(final int left) {
            this.left = left;
        }
        
        public final void setLength(final int length) {
            this.length = length;
        }
        
        public final void setPadding(final int padding) {
            this.padding = padding;
        }
        
        public final void setStreamId(final int streamId) {
            this.streamId = streamId;
        }
        
        @Override
        public h0 timeout() {
            return ((g0)this.source).timeout();
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J.\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0016\u001a\u00020\tH&J \u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H&J \u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH&J(\u0010%\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0002H&J&\u0010(\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J8\u0010/\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001fH&¨\u00060" }, d2 = { "Lokhttp3/internal/http2/Http2Reader$Handler;", "", "", "inFinished", "", "streamId", "Lfk2/f;", "source", "length", "Lcg2/j;", "data", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "ackSettings", "ack", "payload1", "payload2", "ping", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "goAway", "", "windowSizeIncrement", "windowUpdate", "streamDependency", "weight", "exclusive", "priority", "promisedStreamId", "requestHeaders", "pushPromise", "", "origin", "protocol", "host", "port", "maxAge", "alternateService", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public interface Handler
    {
        void ackSettings();
        
        void alternateService(final int p0, final String p1, final ByteString p2, final String p3, final int p4, final long p5);
        
        void data(final boolean p0, final int p1, final f p2, final int p3) throws IOException;
        
        void goAway(final int p0, final ErrorCode p1, final ByteString p2);
        
        void headers(final boolean p0, final int p1, final int p2, final List<Header> p3);
        
        void ping(final boolean p0, final int p1, final int p2);
        
        void priority(final int p0, final int p1, final int p2, final boolean p3);
        
        void pushPromise(final int p0, final int p1, final List<Header> p2) throws IOException;
        
        void rstStream(final int p0, final ErrorCode p1);
        
        void settings(final boolean p0, final Settings p1);
        
        void windowUpdate(final int p0, final long p1);
    }
}
