// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http2;

import fk2.e0;
import java.util.List;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import java.util.logging.Level;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import fk2.e;
import fk2.c;
import java.util.logging.Logger;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = {}, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 =2\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010/\u001a\u00020\u0016¢\u0006\u0004\b;\u0010<J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J(\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002J\u001e\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$J\u0016\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0004J&\u0010+\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010,\u001a\u00020\u0006H\u0016J$\u0010.\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0014\u0010/\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00100R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006>" }, d2 = { "Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "", "streamId", "", "byteCount", "Lcg2/j;", "writeContinuationFrames", "connectionPreface", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "maxDataLength", "", "outFinished", "Lfk2/c;", "source", "data", "flags", "buffer", "dataFrame", "settings", "ack", "payload1", "payload2", "ping", "lastGoodStreamId", "", "debugData", "goAway", "windowSizeIncrement", "windowUpdate", "length", "type", "frameHeader", "close", "headerBlock", "headers", "client", "Z", "maxFrameSize", "I", "closed", "Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "Lfk2/e;", "sink", "<init>", "(Lfk2/e;Z)V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class Http2Writer implements Closeable
{
    public static final Companion Companion;
    private static final Logger logger;
    private final boolean client;
    private boolean closed;
    private final c hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final e sink;
    
    static {
        Companion = new Companion(null);
        logger = Logger.getLogger(Http2.class.getName());
    }
    
    public Http2Writer(final e sink, final boolean client) {
        ng2.e.f((Object)sink, "sink");
        this.sink = sink;
        this.client = client;
        final c hpackBuffer = new c();
        this.hpackBuffer = hpackBuffer;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, hpackBuffer, 3, null);
    }
    
    private final void writeContinuationFrames(final int n, long n2) throws IOException {
        while (n2 > 0L) {
            final long min = Math.min(this.maxFrameSize, n2);
            n2 -= min;
            final int n3 = (int)min;
            int n4;
            if (n2 == 0L) {
                n4 = 4;
            }
            else {
                n4 = 0;
            }
            this.frameHeader(n, n3, 9, n4);
            ((e0)this.sink).write(this.hpackBuffer, min);
        }
    }
    
    public final void applyAndAckSettings(final Settings settings) throws IOException {
        synchronized (this) {
            ng2.e.f((Object)settings, "peerSettings");
            if (!this.closed) {
                this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
                if (settings.getHeaderTableSize() != -1) {
                    this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
                }
                this.frameHeader(0, 0, 4, 1);
                this.sink.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    @Override
    public void close() throws IOException {
        synchronized (this) {
            this.closed = true;
            ((e0)this.sink).close();
        }
    }
    
    public final void connectionPreface() throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (!this.client) {
                return;
            }
            final Logger logger = Http2Writer.logger;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(_UtilJvmKt.format(ng2.e.l((Object)Http2.CONNECTION_PREFACE.hex(), ">> CONNECTION "), new Object[0]));
            }
            this.sink.F1(Http2.CONNECTION_PREFACE);
            this.sink.flush();
        }
    }
    
    public final void data(final boolean b, final int n, final c c, final int n2) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                this.dataFrame(n, b ? 1 : 0, c, n2);
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void dataFrame(final int n, final int n2, final c c, final int n3) throws IOException {
        this.frameHeader(n, n3, 0, n2);
        if (n3 > 0) {
            final e sink = this.sink;
            ng2.e.c((Object)c);
            ((e0)sink).write(c, n3);
        }
    }
    
    public final void flush() throws IOException {
        synchronized (this) {
            if (!this.closed) {
                this.sink.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void frameHeader(final int n, final int n2, final int n3, final int n4) throws IOException {
        final Logger logger = Http2Writer.logger;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.INSTANCE.frameLog(false, n, n2, n3, n4));
        }
        final int maxFrameSize = this.maxFrameSize;
        final int n5 = 1;
        if (n2 > maxFrameSize) {
            final StringBuilder t = a.t("FRAME_SIZE_ERROR length > ");
            t.append(this.maxFrameSize);
            t.append(": ");
            t.append(n2);
            throw new IllegalArgumentException(t.toString().toString());
        }
        int n6;
        if ((Integer.MIN_VALUE & n) == 0x0) {
            n6 = n5;
        }
        else {
            n6 = 0;
        }
        if (n6 != 0) {
            _UtilCommonKt.writeMedium(this.sink, n2);
            this.sink.writeByte(n3 & 0xFF);
            this.sink.writeByte(n4 & 0xFF);
            this.sink.writeInt(n & Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException(ng2.e.l((Object)n, "reserved bit set: ").toString());
    }
    
    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }
    
    public final void goAway(int n, final ErrorCode errorCode, final byte[] array) throws IOException {
        synchronized (this) {
            ng2.e.f((Object)errorCode, "errorCode");
            ng2.e.f((Object)array, "debugData");
            if (this.closed) {
                throw new IOException("closed");
            }
            final int httpCode = errorCode.getHttpCode();
            final int n2 = 0;
            if (httpCode != -1) {
                this.frameHeader(0, array.length + 8, 7, 0);
                this.sink.writeInt(n);
                this.sink.writeInt(errorCode.getHttpCode());
                n = n2;
                if (array.length == 0) {
                    n = 1;
                }
                if ((n ^ 0x1) != 0x0) {
                    this.sink.write(array);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
    }
    
    public final void headers(final boolean b, final int n, final List<Header> list) throws IOException {
        synchronized (this) {
            ng2.e.f((Object)list, "headerBlock");
            if (!this.closed) {
                this.hpackWriter.writeHeaders(list);
                final long g = this.hpackBuffer.g;
                final long min = Math.min(this.maxFrameSize, g);
                final long n2 = lcmp(g, min);
                int n3;
                if (n2 == 0) {
                    n3 = 4;
                }
                else {
                    n3 = 0;
                }
                int n4 = n3;
                if (b) {
                    n4 = (n3 | 0x1);
                }
                this.frameHeader(n, (int)min, 1, n4);
                ((e0)this.sink).write(this.hpackBuffer, min);
                if (n2 > 0) {
                    this.writeContinuationFrames(n, g - min);
                }
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final int maxDataLength() {
        return this.maxFrameSize;
    }
    
    public final void ping(final boolean b, final int n, final int n2) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                int n3;
                if (b) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                this.frameHeader(0, 8, 6, n3);
                this.sink.writeInt(n);
                this.sink.writeInt(n2);
                this.sink.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void pushPromise(final int n, final int n2, final List<Header> list) throws IOException {
        synchronized (this) {
            ng2.e.f((Object)list, "requestHeaders");
            if (!this.closed) {
                this.hpackWriter.writeHeaders(list);
                final long g = this.hpackBuffer.g;
                final int n3 = (int)Math.min(this.maxFrameSize - 4L, g);
                final long n4 = n3;
                final long n5 = lcmp(g, n4);
                int n6;
                if (n5 == 0) {
                    n6 = 4;
                }
                else {
                    n6 = 0;
                }
                this.frameHeader(n, n3 + 4, 5, n6);
                this.sink.writeInt(n2 & Integer.MAX_VALUE);
                ((e0)this.sink).write(this.hpackBuffer, n4);
                if (n5 > 0) {
                    this.writeContinuationFrames(n, g - n4);
                }
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void rstStream(final int n, final ErrorCode errorCode) throws IOException {
        synchronized (this) {
            ng2.e.f((Object)errorCode, "errorCode");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() != -1) {
                this.frameHeader(n, 4, 3, 0);
                this.sink.writeInt(errorCode.getHttpCode());
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
    
    public final void settings(final Settings settings) throws IOException {
        synchronized (this) {
            ng2.e.f((Object)settings, "settings");
            if (!this.closed) {
                final int size = settings.size();
                int i = 0;
                this.frameHeader(0, size * 6, 4, 0);
                while (i < 10) {
                    if (settings.isSet(i)) {
                        int n;
                        if (i != 4) {
                            if (i != 7) {
                                n = i;
                            }
                            else {
                                n = 4;
                            }
                        }
                        else {
                            n = 3;
                        }
                        this.sink.writeShort(n);
                        this.sink.writeInt(settings.get(i));
                    }
                    ++i;
                }
                this.sink.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void windowUpdate(final int n, final long n2) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (n2 != 0L && n2 <= 2147483647L) {
                this.frameHeader(n, 4, 8, 0);
                this.sink.writeInt((int)n2);
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException(ng2.e.l((Object)n2, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
        }
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006" }, d2 = { "Lokhttp3/internal/http2/Http2Writer$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
