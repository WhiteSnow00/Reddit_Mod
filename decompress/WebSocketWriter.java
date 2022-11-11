// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.ws;

import java.io.IOException;
import okio.ByteString;
import jk2.e;
import java.util.Random;
import jk2.c;
import jk2.c$a;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006," }, d2 = { "Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "opcode", "Lokio/ByteString;", "payload", "Lhg2/j;", "writeControlFrame", "writePing", "writePong", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", "close", "", "isClient", "Z", "Ljava/util/Random;", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "J", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "", "maskKey", "[B", "Ljk2/e;", "sink", "Ljk2/e;", "getSink", "()Ljk2/e;", "<init>", "(ZLjk2/e;Ljava/util/Random;ZZJ)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class WebSocketWriter implements Closeable
{
    private final boolean isClient;
    private final c$a maskCursor;
    private final byte[] maskKey;
    private final c messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final e sink;
    private final c sinkBuffer;
    private boolean writerClosed;
    
    public WebSocketWriter(final boolean isClient, final e sink, final Random random, final boolean perMessageDeflate, final boolean noContextTakeover, final long minimumDeflateSize) {
        sg2.e.f((Object)sink, "sink");
        sg2.e.f((Object)random, "random");
        this.isClient = isClient;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = perMessageDeflate;
        this.noContextTakeover = noContextTakeover;
        this.minimumDeflateSize = minimumDeflateSize;
        this.messageBuffer = new c();
        this.sinkBuffer = sink.getBuffer();
        final c$a c$a = null;
        byte[] maskKey;
        if (isClient) {
            maskKey = new byte[4];
        }
        else {
            maskKey = null;
        }
        this.maskKey = maskKey;
        c$a maskCursor = c$a;
        if (isClient) {
            maskCursor = new c$a();
        }
        this.maskCursor = maskCursor;
    }
    
    private final void writeControlFrame(final int n, final ByteString byteString) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        final int size = byteString.size();
        if (size <= 125L) {
            this.sinkBuffer.O(n | 0x80);
            if (this.isClient) {
                this.sinkBuffer.O(size | 0x80);
                final Random random = this.random;
                final byte[] maskKey = this.maskKey;
                sg2.e.c((Object)maskKey);
                random.nextBytes(maskKey);
                this.sinkBuffer.write(this.maskKey);
                if (size > 0) {
                    final c sinkBuffer = this.sinkBuffer;
                    final long g = sinkBuffer.g;
                    sinkBuffer.M(byteString);
                    final c sinkBuffer2 = this.sinkBuffer;
                    final c$a maskCursor = this.maskCursor;
                    sg2.e.c((Object)maskCursor);
                    sinkBuffer2.w(maskCursor);
                    this.maskCursor.g(g);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            else {
                this.sinkBuffer.O(size);
                this.sinkBuffer.M(byteString);
            }
            this.sink.flush();
            return;
        }
        throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
    }
    
    @Override
    public void close() {
        try (final MessageDeflater messageDeflater = this.messageDeflater) {}
    }
    
    public final Random getRandom() {
        return this.random;
    }
    
    public final e getSink() {
        return this.sink;
    }
    
    public final void writeClose(final int n, final ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (n != 0 || byteString != null) {
            if (n != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(n);
            }
            final c c = new c();
            c.V(n);
            if (byteString != null) {
                c.M(byteString);
            }
            byteString2 = c.C1();
        }
        try {
            this.writeControlFrame(8, byteString2);
        }
        finally {
            this.writerClosed = true;
        }
    }
    
    public final void writeMessageFrame(int n, final ByteString byteString) throws IOException {
        sg2.e.f((Object)byteString, "data");
        if (!this.writerClosed) {
            this.messageBuffer.M(byteString);
            final int n2 = 128;
            final int n3 = n |= 0x80;
            if (this.perMessageDeflate) {
                n = n3;
                if (byteString.size() >= this.minimumDeflateSize) {
                    MessageDeflater messageDeflater;
                    if ((messageDeflater = this.messageDeflater) == null) {
                        messageDeflater = new MessageDeflater(this.noContextTakeover);
                        this.messageDeflater = messageDeflater;
                    }
                    messageDeflater.deflate(this.messageBuffer);
                    n = (n3 | 0x40);
                }
            }
            final long g = this.messageBuffer.g;
            this.sinkBuffer.O(n);
            if (this.isClient) {
                n = n2;
            }
            else {
                n = 0;
            }
            if (g <= 125L) {
                this.sinkBuffer.O((int)g | n);
            }
            else if (g <= 65535L) {
                this.sinkBuffer.O(n | 0x7E);
                this.sinkBuffer.V((int)g);
            }
            else {
                this.sinkBuffer.O(n | 0x7F);
                this.sinkBuffer.U(g);
            }
            if (this.isClient) {
                final Random random = this.random;
                final byte[] maskKey = this.maskKey;
                sg2.e.c((Object)maskKey);
                random.nextBytes(maskKey);
                this.sinkBuffer.write(this.maskKey);
                if (g > 0L) {
                    final c messageBuffer = this.messageBuffer;
                    final c$a maskCursor = this.maskCursor;
                    sg2.e.c((Object)maskCursor);
                    messageBuffer.w(maskCursor);
                    this.maskCursor.g(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, g);
            this.sink.X0();
            return;
        }
        throw new IOException("closed");
    }
    
    public final void writePing(final ByteString byteString) throws IOException {
        sg2.e.f((Object)byteString, "payload");
        this.writeControlFrame(9, byteString);
    }
    
    public final void writePong(final ByteString byteString) throws IOException {
        sg2.e.f((Object)byteString, "payload");
        this.writeControlFrame(10, byteString);
    }
}
