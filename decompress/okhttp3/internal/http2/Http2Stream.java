// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http2;

import java.net.SocketTimeoutException;
import java.io.EOFException;
import fk2.c;
import java.util.List;
import java.io.InterruptedIOException;
import fk2.f;
import fk2.h0;
import fk2.g0;
import fk2.e0;
import cg2.j;
import okhttp3.internal._UtilJvmKt;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import java.util.ArrayDeque;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 k2\u00020\u0001:\u0004klmnB3\b\u0000\u0012\u0006\u00100\u001a\u00020\u001e\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bi\u0010jJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J$\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0013J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0015J\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0016\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0015J\u000f\u0010'\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010&J\u000e\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(J\u000f\u0010,\u001a\u00020\u000bH\u0000¢\u0006\u0004\b+\u0010&J\u000f\u0010.\u001a\u00020\u000bH\u0000¢\u0006\u0004\b-\u0010&J\u001a\u0010/\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002R\u0017\u00100\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R*\u0010:\u001a\u00020(2\u0006\u00109\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010@\u001a\u00020(2\u0006\u00109\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R*\u0010C\u001a\u00020(2\u0006\u00109\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010;\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R*\u0010F\u001a\u00020(2\u0006\u00109\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010\u001d\u001a\u00060NR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010O\u001a\u0004\bP\u0010QR\u001e\u0010S\u001a\u00060RR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001e\u0010\u000f\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bY\u0010ZR\u001e\u0010\u0010\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010X\u001a\u0004\b[\u0010ZR$\u0010\u001a\u001a\u0004\u0018\u00010\u00158@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0011\u0010f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010h\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bh\u0010g¨\u0006o" }, d2 = { "Lokhttp3/internal/http2/Http2Stream;", "", "Lokhttp3/Headers;", "takeHeaders", "trailers", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "", "outFinished", "flushHeaders", "Lcg2/j;", "writeHeaders", "enqueueTrailers", "Lfk2/h0;", "readTimeout", "writeTimeout", "Lfk2/g0;", "getSource", "Lfk2/e0;", "getSink", "Lokhttp3/internal/http2/ErrorCode;", "rstStatusCode", "Ljava/io/IOException;", "errorException", "close", "errorCode", "closeLater", "Lfk2/f;", "source", "", "length", "receiveData", "headers", "inFinished", "receiveHeaders", "receiveRstStream", "cancelStreamIfNecessary$okhttp", "()V", "cancelStreamIfNecessary", "", "delta", "addBytesToWriteWindow", "checkOutNotClosed$okhttp", "checkOutNotClosed", "waitForIo$okhttp", "waitForIo", "closeInternal", "id", "I", "getId", "()I", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "<set-?>", "readBytesTotal", "J", "getReadBytesTotal", "()J", "setReadBytesTotal$okhttp", "(J)V", "readBytesAcknowledged", "getReadBytesAcknowledged", "setReadBytesAcknowledged$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "hasResponseHeaders", "Z", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getWriteTimeout$okhttp", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "isOpen", "()Z", "isLocallyInitiated", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class Http2Stream
{
    public static final Companion Companion;
    public static final long EMIT_BUFFER_SIZE = 16384L;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;
    
    static {
        Companion = new Companion(null);
    }
    
    public Http2Stream(final int id, final Http2Connection connection, final boolean b, final boolean b2, final Headers headers) {
        e.f((Object)connection, "connection");
        this.id = id;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().getInitialWindowSize();
        final ArrayDeque headersQueue = new ArrayDeque();
        this.headersQueue = headersQueue;
        this.source = new FramingSource(connection.getOkHttpSettings().getInitialWindowSize(), b2);
        this.sink = new FramingSink(b);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!(this.isLocallyInitiated() ^ true)) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            headersQueue.add(headers);
        }
        else if (!this.isLocallyInitiated()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }
    
    private final boolean closeInternal(final ErrorCode errorCode$okhttp, final IOException errorException$okhttp) {
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST NOT hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        synchronized (this) {
            if (this.getErrorCode$okhttp() != null) {
                return false;
            }
            if (this.getSource$okhttp().getFinished$okhttp() && this.getSink$okhttp().getFinished()) {
                return false;
            }
            this.setErrorCode$okhttp(errorCode$okhttp);
            this.setErrorException$okhttp(errorException$okhttp);
            this.notifyAll();
            final j a = j.a;
            monitorexit(this);
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }
    
    public final void addBytesToWriteWindow(final long n) {
        this.writeBytesMaximum += n;
        if (n > 0L) {
            this.notifyAll();
        }
    }
    
    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST NOT hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        synchronized (this) {
            final boolean b = !this.getSource$okhttp().getFinished$okhttp() && this.getSource$okhttp().getClosed$okhttp() && (this.getSink$okhttp().getFinished() || this.getSink$okhttp().getClosed());
            final boolean open = this.isOpen();
            final j a = j.a;
            monitorexit(this);
            if (b) {
                this.close(ErrorCode.CANCEL, null);
            }
            else if (!open) {
                this.connection.removeStream$okhttp(this.id);
            }
        }
    }
    
    public final void checkOutNotClosed$okhttp() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException errorException;
            if ((errorException = this.errorException) == null) {
                final ErrorCode errorCode = this.errorCode;
                e.c((Object)errorCode);
                errorException = new StreamResetException(errorCode);
            }
            throw errorException;
        }
    }
    
    public final void close(final ErrorCode errorCode, final IOException ex) throws IOException {
        e.f((Object)errorCode, "rstStatusCode");
        if (!this.closeInternal(errorCode, ex)) {
            return;
        }
        this.connection.writeSynReset$okhttp(this.id, errorCode);
    }
    
    public final void closeLater(final ErrorCode errorCode) {
        e.f((Object)errorCode, "errorCode");
        if (!this.closeInternal(errorCode, null)) {
            return;
        }
        this.connection.writeSynResetLater$okhttp(this.id, errorCode);
    }
    
    public final void enqueueTrailers(final Headers trailers) {
        e.f((Object)trailers, "trailers");
        synchronized (this) {
            final boolean finished = this.getSink$okhttp().getFinished();
            boolean b = true;
            if (!(finished ^ true)) {
                throw new IllegalStateException("already finished".toString());
            }
            if (trailers.size() == 0) {
                b = false;
            }
            if (b) {
                this.getSink$okhttp().setTrailers(trailers);
                final j a = j.a;
                return;
            }
            throw new IllegalArgumentException("trailers.size() == 0".toString());
        }
    }
    
    public final Http2Connection getConnection() {
        return this.connection;
    }
    
    public final ErrorCode getErrorCode$okhttp() {
        synchronized (this) {
            return this.errorCode;
        }
    }
    
    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }
    
    public final int getId() {
        return this.id;
    }
    
    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }
    
    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }
    
    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }
    
    public final e0 getSink() {
        synchronized (this) {
            if (this.hasResponseHeaders || this.isLocallyInitiated()) {
                final j a = j.a;
                monitorexit(this);
                return this.sink;
            }
            throw new IllegalStateException("reply before requesting the sink".toString());
        }
    }
    
    public final FramingSink getSink$okhttp() {
        return this.sink;
    }
    
    public final g0 getSource() {
        return this.source;
    }
    
    public final FramingSource getSource$okhttp() {
        return this.source;
    }
    
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }
    
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }
    
    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }
    
    public final boolean isLocallyInitiated() {
        final int id = this.id;
        final boolean b = true;
        return this.connection.getClient$okhttp() == ((id & 0x1) == 0x1) && b;
    }
    
    public final boolean isOpen() {
        synchronized (this) {
            return this.errorCode == null && ((!this.source.getFinished$okhttp() && !this.source.getClosed$okhttp()) || (!this.sink.getFinished() && !this.sink.getClosed()) || !this.hasResponseHeaders);
        }
    }
    
    public final h0 readTimeout() {
        return (h0)this.readTimeout;
    }
    
    public final void receiveData(final f f, final int n) throws IOException {
        e.f((Object)f, "source");
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST NOT hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        this.source.receive$okhttp(f, n);
    }
    
    public final void receiveHeaders(final Headers trailers, final boolean b) {
        e.f((Object)trailers, "headers");
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST NOT hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        synchronized (this) {
            if (this.hasResponseHeaders && b) {
                this.getSource$okhttp().setTrailers(trailers);
            }
            else {
                this.hasResponseHeaders = true;
                this.headersQueue.add(trailers);
            }
            if (b) {
                this.getSource$okhttp().setFinished$okhttp(true);
            }
            final boolean open = this.isOpen();
            this.notifyAll();
            final j a = j.a;
            monitorexit(this);
            if (!open) {
                this.connection.removeStream$okhttp(this.id);
            }
        }
    }
    
    public final void receiveRstStream(final ErrorCode errorCode) {
        synchronized (this) {
            e.f((Object)errorCode, "errorCode");
            if (this.errorCode == null) {
                this.errorCode = errorCode;
                this.notifyAll();
            }
        }
    }
    
    public final void setErrorCode$okhttp(final ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
    
    public final void setErrorException$okhttp(final IOException errorException) {
        this.errorException = errorException;
    }
    
    public final void setReadBytesAcknowledged$okhttp(final long readBytesAcknowledged) {
        this.readBytesAcknowledged = readBytesAcknowledged;
    }
    
    public final void setReadBytesTotal$okhttp(final long readBytesTotal) {
        this.readBytesTotal = readBytesTotal;
    }
    
    public final void setWriteBytesMaximum$okhttp(final long writeBytesMaximum) {
        this.writeBytesMaximum = writeBytesMaximum;
    }
    
    public final void setWriteBytesTotal$okhttp(final long writeBytesTotal) {
        this.writeBytesTotal = writeBytesTotal;
    }
    
    public final Headers takeHeaders() throws IOException {
        synchronized (this) {
            this.readTimeout.enter();
            try {
                while (this.headersQueue.isEmpty() && this.errorCode == null) {
                    this.waitForIo$okhttp();
                }
                this.readTimeout.exitAndThrowIfTimedOut();
                if (this.headersQueue.isEmpty() ^ true) {
                    final Headers removeFirst = this.headersQueue.removeFirst();
                    e.e((Object)removeFirst, "headersQueue.removeFirst()");
                    return removeFirst;
                }
                IOException errorException;
                if ((errorException = this.errorException) == null) {
                    errorException = new(okhttp3.internal.http2.StreamResetException.class)();
                    final ErrorCode errorCode = this.errorCode;
                    e.c((Object)errorCode);
                    new StreamResetException(errorCode);
                }
                throw errorException;
            }
            finally {
                this.readTimeout.exitAndThrowIfTimedOut();
            }
        }
    }
    
    public final Headers trailers() throws IOException {
        synchronized (this) {
            if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().e1() && this.source.getReadBuffer().e1()) {
                Headers headers;
                if ((headers = this.source.getTrailers()) == null) {
                    headers = _UtilJvmKt.EMPTY_HEADERS;
                }
                return headers;
            }
            if (this.errorCode != null) {
                IOException errorException;
                if ((errorException = this.errorException) == null) {
                    errorException = new(okhttp3.internal.http2.StreamResetException.class)();
                    final ErrorCode errorCode = this.errorCode;
                    e.c((Object)errorCode);
                    new StreamResetException(errorCode);
                }
                throw errorException;
            }
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
    }
    
    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            this.wait();
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
    
    public final void writeHeaders(final List<Header> list, final boolean b, final boolean b2) throws IOException {
        e.f((Object)list, "responseHeaders");
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            final StringBuilder t = a.t("Thread ");
            t.append((Object)Thread.currentThread().getName());
            t.append(" MUST NOT hold lock on ");
            t.append(this);
            throw new AssertionError((Object)t.toString());
        }
        monitorenter(this);
        final int n = 1;
        try {
            this.hasResponseHeaders = true;
            if (b) {
                this.getSink$okhttp().setFinished(true);
            }
            final j a = j.a;
            monitorexit(this);
            int n2 = b2 ? 1 : 0;
            if (!b2) {
                synchronized (this.connection) {
                    int n3;
                    if (this.getConnection().getWriteBytesTotal() >= this.getConnection().getWriteBytesMaximum()) {
                        n3 = n;
                    }
                    else {
                        n3 = 0;
                    }
                    monitorexit(this.connection);
                    n2 = n3;
                }
            }
            this.connection.writeHeaders$okhttp(this.id, b, list);
            if (n2 != 0) {
                this.connection.flush();
            }
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final h0 writeTimeout() {
        return (h0)this.writeTimeout;
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006!" }, d2 = { "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lfk2/e0;", "", "outFinishedOnLastFrame", "Lcg2/j;", "emitFrame", "Lfk2/c;", "source", "", "byteCount", "write", "flush", "Lfk2/h0;", "timeout", "close", "finished", "Z", "getFinished", "()Z", "setFinished", "(Z)V", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed", "setClosed", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class FramingSink implements e0
    {
        private boolean closed;
        private boolean finished;
        private final c sendBuffer;
        public final Http2Stream this$0;
        private Headers trailers;
        
        public FramingSink(final Http2Stream this$0, final boolean finished) {
            e.f((Object)this$0, "this$0");
            this.this$0 = this$0;
            this.finished = finished;
            this.sendBuffer = new c();
        }
        
        public FramingSink(final Http2Stream this$0, boolean b, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
            this.this$0 = this$0;
            if ((n & 0x1) != 0x0) {
                b = false;
            }
            this(b);
        }
        
        private final void emitFrame(final boolean b) throws IOException {
            final Http2Stream this$0 = this.this$0;
            synchronized (this$0) {
                this$0.getWriteTimeout$okhttp().enter();
                try {
                    while (this$0.getWriteBytesTotal() >= this$0.getWriteBytesMaximum() && !this.getFinished() && !this.getClosed() && this$0.getErrorCode$okhttp() == null) {
                        this$0.waitForIo$okhttp();
                    }
                    this$0.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                    this$0.checkOutNotClosed$okhttp();
                    final long min = Math.min(this$0.getWriteBytesMaximum() - this$0.getWriteBytesTotal(), this.sendBuffer.g);
                    this$0.setWriteBytesTotal$okhttp(this$0.getWriteBytesTotal() + min);
                    final boolean b2 = b && min == this.sendBuffer.g;
                    final j a = j.a;
                    monitorexit(this$0);
                    this.this$0.getWriteTimeout$okhttp().enter();
                    try {
                        this.this$0.getConnection().writeData(this.this$0.getId(), b2, this.sendBuffer, min);
                    }
                    finally {
                        this.this$0.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                    }
                }
                finally {
                    this$0.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                }
            }
        }
        
        @Override
        public void close() throws IOException {
            final Http2Stream this$0 = this.this$0;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this$0)) {
                final StringBuilder t = a.t("Thread ");
                t.append((Object)Thread.currentThread().getName());
                t.append(" MUST NOT hold lock on ");
                t.append(this$0);
                throw new AssertionError((Object)t.toString());
            }
            Object o = this.this$0;
            synchronized (o) {
                if (this.getClosed()) {
                    return;
                }
                final boolean b = ((Http2Stream)o).getErrorCode$okhttp() == null;
                final j a = j.a;
                monitorexit(o);
                if (!this.this$0.getSink$okhttp().finished) {
                    final boolean b2 = this.sendBuffer.g > 0L;
                    if (this.trailers != null) {
                        while (this.sendBuffer.g > 0L) {
                            this.emitFrame(false);
                        }
                        o = this.this$0.getConnection();
                        final int id = this.this$0.getId();
                        final Headers trailers = this.trailers;
                        e.c((Object)trailers);
                        ((Http2Connection)o).writeHeaders$okhttp(id, b, _UtilJvmKt.toHeaderList(trailers));
                    }
                    else if (b2) {
                        while (this.sendBuffer.g > 0L) {
                            this.emitFrame(true);
                        }
                    }
                    else if (b) {
                        this.this$0.getConnection().writeData(this.this$0.getId(), true, null, 0L);
                    }
                }
                synchronized (this.this$0) {
                    this.setClosed(true);
                    final j a2 = j.a;
                    monitorexit(this.this$0);
                    this.this$0.getConnection().flush();
                    this.this$0.cancelStreamIfNecessary$okhttp();
                }
            }
        }
        
        @Override
        public void flush() throws IOException {
            final Http2Stream this$0 = this.this$0;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this$0)) {
                final StringBuilder t = a.t("Thread ");
                t.append((Object)Thread.currentThread().getName());
                t.append(" MUST NOT hold lock on ");
                t.append(this$0);
                throw new AssertionError((Object)t.toString());
            }
            final Http2Stream this$2 = this.this$0;
            synchronized (this$2) {
                this$2.checkOutNotClosed$okhttp();
                final j a = j.a;
                monitorexit(this$2);
                while (this.sendBuffer.g > 0L) {
                    this.emitFrame(false);
                    this.this$0.getConnection().flush();
                }
            }
        }
        
        public final boolean getClosed() {
            return this.closed;
        }
        
        public final boolean getFinished() {
            return this.finished;
        }
        
        public final Headers getTrailers() {
            return this.trailers;
        }
        
        public final void setClosed(final boolean closed) {
            this.closed = closed;
        }
        
        public final void setFinished(final boolean finished) {
            this.finished = finished;
        }
        
        public final void setTrailers(final Headers trailers) {
            this.trailers = trailers;
        }
        
        @Override
        public h0 timeout() {
            return (h0)this.this$0.getWriteTimeout$okhttp();
        }
        
        @Override
        public void write(final c c, final long n) throws IOException {
            e.f((Object)c, "source");
            final Http2Stream this$0 = this.this$0;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this$0)) {
                final StringBuilder t = a.t("Thread ");
                t.append((Object)Thread.currentThread().getName());
                t.append(" MUST NOT hold lock on ");
                t.append(this$0);
                throw new AssertionError((Object)t.toString());
            }
            this.sendBuffer.write(c, n);
            while (this.sendBuffer.g >= 16384L) {
                this.emitFrame(false);
            }
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u0017\u0010$\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006," }, d2 = { "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lfk2/g0;", "", "read", "Lcg2/j;", "updateConnectionFlowControl", "Lfk2/c;", "sink", "byteCount", "Lfk2/f;", "source", "receive$okhttp", "(Lfk2/f;J)V", "receive", "Lfk2/h0;", "timeout", "close", "maxByteCount", "J", "", "finished", "Z", "getFinished$okhttp", "()Z", "setFinished$okhttp", "(Z)V", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed$okhttp", "setClosed$okhttp", "receiveBuffer", "Lfk2/c;", "getReceiveBuffer", "()Lfk2/c;", "readBuffer", "getReadBuffer", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class FramingSource implements g0
    {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final c readBuffer;
        private final c receiveBuffer;
        public final Http2Stream this$0;
        private Headers trailers;
        
        public FramingSource(final Http2Stream this$0, final long maxByteCount, final boolean finished) {
            e.f((Object)this$0, "this$0");
            this.this$0 = this$0;
            this.maxByteCount = maxByteCount;
            this.finished = finished;
            this.receiveBuffer = new c();
            this.readBuffer = new c();
        }
        
        private final void updateConnectionFlowControl(final long n) {
            final Http2Stream this$0 = this.this$0;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this$0)) {
                final StringBuilder t = a.t("Thread ");
                t.append((Object)Thread.currentThread().getName());
                t.append(" MUST NOT hold lock on ");
                t.append(this$0);
                throw new AssertionError((Object)t.toString());
            }
            this.this$0.getConnection().updateConnectionFlowControl$okhttp(n);
        }
        
        @Override
        public void close() throws IOException {
            final Http2Stream this$0 = this.this$0;
            synchronized (this$0) {
                this.setClosed$okhttp(true);
                final long g = this.getReadBuffer().g;
                this.getReadBuffer().b();
                this$0.notifyAll();
                final j a = j.a;
                monitorexit(this$0);
                if (g > 0L) {
                    this.updateConnectionFlowControl(g);
                }
                this.this$0.cancelStreamIfNecessary$okhttp();
            }
        }
        
        public final boolean getClosed$okhttp() {
            return this.closed;
        }
        
        public final boolean getFinished$okhttp() {
            return this.finished;
        }
        
        public final c getReadBuffer() {
            return this.readBuffer;
        }
        
        public final c getReceiveBuffer() {
            return this.receiveBuffer;
        }
        
        public final Headers getTrailers() {
            return this.trailers;
        }
        
        @Override
        public long read(final c c, final long n) throws IOException {
            e.f((Object)c, "sink");
            if (n >= 0L) {
                while (true) {
                    final IOException ex = null;
                    final Http2Stream this$0 = this.this$0;
                    synchronized (this$0) {
                        this$0.getReadTimeout$okhttp().enter();
                        IOException errorException$okhttp = ex;
                        Label_0346: {
                            long n3 = 0L;
                            boolean b = false;
                            Label_0280: {
                                Label_0277: {
                                    try {
                                        if (this$0.getErrorCode$okhttp() != null) {
                                            errorException$okhttp = ex;
                                            if (!this.getFinished$okhttp() && (errorException$okhttp = this$0.getErrorException$okhttp()) == null) {
                                                errorException$okhttp = new(okhttp3.internal.http2.StreamResetException.class)();
                                                final ErrorCode errorCode$okhttp = this$0.getErrorCode$okhttp();
                                                e.c((Object)errorCode$okhttp);
                                                new StreamResetException(errorCode$okhttp);
                                            }
                                        }
                                        if (this.getClosed$okhttp()) {
                                            throw new IOException("stream closed");
                                        }
                                        if (this.getReadBuffer().g > 0L) {
                                            final long read = this.getReadBuffer().read(c, Math.min(n, this.getReadBuffer().g));
                                            this$0.setReadBytesTotal$okhttp(this$0.getReadBytesTotal() + read);
                                            final long n2 = this$0.getReadBytesTotal() - this$0.getReadBytesAcknowledged();
                                            n3 = read;
                                            if (errorException$okhttp != null) {
                                                break Label_0277;
                                            }
                                            n3 = read;
                                            if (n2 >= this$0.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                                this$0.getConnection().writeWindowUpdateLater$okhttp(this$0.getId(), n2);
                                                this$0.setReadBytesAcknowledged$okhttp(this$0.getReadBytesTotal());
                                                n3 = read;
                                            }
                                            break Label_0277;
                                        }
                                    }
                                    finally {
                                        break Label_0346;
                                    }
                                    if (!this.getFinished$okhttp() && errorException$okhttp == null) {
                                        this$0.waitForIo$okhttp();
                                        n3 = -1L;
                                        b = true;
                                        break Label_0280;
                                    }
                                    n3 = -1L;
                                }
                                b = false;
                            }
                            this$0.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                            final j a = j.a;
                            monitorexit(this$0);
                            if (b) {
                                continue;
                            }
                            if (n3 != -1L) {
                                this.updateConnectionFlowControl(n3);
                                return n3;
                            }
                            if (errorException$okhttp == null) {
                                return -1L;
                            }
                            throw errorException$okhttp;
                        }
                        this$0.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                    }
                    break;
                }
            }
            throw new IllegalArgumentException(e.l((Object)n, "byteCount < 0: ").toString());
        }
        
        public final void receive$okhttp(final f f, long n) throws IOException {
            e.f((Object)f, "source");
            final Http2Stream this$0 = this.this$0;
            long n2 = n;
            if (_UtilJvmKt.assertionsEnabled) {
                if (Thread.holdsLock(this$0)) {
                    final StringBuilder t = a.t("Thread ");
                    t.append((Object)Thread.currentThread().getName());
                    t.append(" MUST NOT hold lock on ");
                    t.append(this$0);
                    throw new AssertionError((Object)t.toString());
                }
                n2 = n;
            }
            while (n2 > 0L) {
                Http2Stream http2Stream = this.this$0;
                synchronized (http2Stream) {
                    final boolean finished$okhttp = this.getFinished$okhttp();
                    n = this.getReadBuffer().g;
                    final long maxByteCount = this.maxByteCount;
                    final int n3 = 1;
                    final boolean b = n + n2 > maxByteCount;
                    final j a = j.a;
                    monitorexit(http2Stream);
                    if (b) {
                        f.skip(n2);
                        this.this$0.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    }
                    if (finished$okhttp) {
                        f.skip(n2);
                        return;
                    }
                    n = ((g0)f).read(this.receiveBuffer, n2);
                    if (n != -1L) {
                        final long n4 = n2 - n;
                        http2Stream = this.this$0;
                        synchronized (http2Stream) {
                            if (this.getClosed$okhttp()) {
                                n = this.getReceiveBuffer().g;
                                this.getReceiveBuffer().b();
                            }
                            else {
                                int n5;
                                if (this.getReadBuffer().g == 0L) {
                                    n5 = n3;
                                }
                                else {
                                    n5 = 0;
                                }
                                this.getReadBuffer().T1((g0)this.getReceiveBuffer());
                                if (n5 != 0) {
                                    http2Stream.notifyAll();
                                }
                                n = 0L;
                            }
                            monitorexit(http2Stream);
                            n2 = n4;
                            if (n > 0L) {
                                this.updateConnectionFlowControl(n);
                                n2 = n4;
                                continue;
                            }
                            continue;
                        }
                    }
                    throw new EOFException();
                }
                break;
            }
        }
        
        public final void setClosed$okhttp(final boolean closed) {
            this.closed = closed;
        }
        
        public final void setFinished$okhttp(final boolean finished) {
            this.finished = finished;
        }
        
        public final void setTrailers(final Headers trailers) {
            this.trailers = trailers;
        }
        
        @Override
        public h0 timeout() {
            return (h0)this.this$0.getReadTimeout$okhttp();
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n" }, d2 = { "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lfk2/a;", "Lcg2/j;", "timedOut", "Ljava/io/IOException;", "cause", "newTimeoutException", "exitAndThrowIfTimedOut", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public final class StreamTimeout extends fk2.a
    {
        public final Http2Stream this$0;
        
        public StreamTimeout(final Http2Stream this$0) {
            e.f((Object)this$0, "this$0");
            this.this$0 = this$0;
        }
        
        public final void exitAndThrowIfTimedOut() throws IOException {
            if (!this.exit()) {
                return;
            }
            throw this.newTimeoutException(null);
        }
        
        public IOException newTimeoutException(final IOException ex) {
            final SocketTimeoutException ex2 = new SocketTimeoutException("timeout");
            if (ex != null) {
                ex2.initCause(ex);
            }
            return ex2;
        }
        
        public void timedOut() {
            this.this$0.closeLater(ErrorCode.CANCEL);
            this.this$0.getConnection().sendDegradedPingLater$okhttp();
        }
    }
}
