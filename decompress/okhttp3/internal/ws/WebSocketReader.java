// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.ws;

import jk2.g0;
import okio.ByteString;
import java.util.concurrent.TimeUnit;
import okhttp3.internal._UtilCommonKt;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.internal._UtilJvmKt;
import sg2.e;
import jk2.f;
import jk2.c$a;
import jk2.c;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001)B/\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006*" }, d2 = { "Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "Lhg2/j;", "readHeader", "readControlFrame", "readMessageFrame", "readUntilNonControlFrame", "readMessage", "processNextFrame", "close", "", "isClient", "Z", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "frameCallback", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "perMessageDeflate", "noContextTakeover", "closed", "", "opcode", "I", "", "frameLength", "J", "isFinalFrame", "isControlFrame", "readingCompressedMessage", "Lokhttp3/internal/ws/MessageInflater;", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", "", "maskKey", "[B", "Ljk2/f;", "source", "Ljk2/f;", "getSource", "()Ljk2/f;", "<init>", "(ZLjk2/f;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "FrameCallback", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class WebSocketReader implements Closeable
{
    private boolean closed;
    private final c controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final c$a maskCursor;
    private final byte[] maskKey;
    private final c messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final f source;
    
    public WebSocketReader(final boolean isClient, final f source, final FrameCallback frameCallback, final boolean perMessageDeflate, final boolean noContextTakeover) {
        e.f((Object)source, "source");
        e.f((Object)frameCallback, "frameCallback");
        this.isClient = isClient;
        this.source = source;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = perMessageDeflate;
        this.noContextTakeover = noContextTakeover;
        this.controlFrameBuffer = new c();
        this.messageFrameBuffer = new c();
        final c$a c$a = null;
        byte[] maskKey;
        if (isClient) {
            maskKey = null;
        }
        else {
            maskKey = new byte[4];
        }
        this.maskKey = maskKey;
        c$a maskCursor;
        if (isClient) {
            maskCursor = c$a;
        }
        else {
            maskCursor = new c$a();
        }
        this.maskCursor = maskCursor;
    }
    
    private final void readControlFrame() throws IOException {
        final long frameLength = this.frameLength;
        if (frameLength > 0L) {
            this.source.S1(this.controlFrameBuffer, frameLength);
            if (!this.isClient) {
                final c controlFrameBuffer = this.controlFrameBuffer;
                final c$a maskCursor = this.maskCursor;
                e.c((Object)maskCursor);
                controlFrameBuffer.w(maskCursor);
                this.maskCursor.g(0L);
                final WebSocketProtocol instance = WebSocketProtocol.INSTANCE;
                final c$a maskCursor2 = this.maskCursor;
                final byte[] maskKey = this.maskKey;
                e.c((Object)maskKey);
                instance.toggleMask(maskCursor2, maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            default: {
                throw new ProtocolException(e.l((Object)_UtilJvmKt.toHexString(this.opcode), "Unknown control opcode: "));
            }
            case 10: {
                this.frameCallback.onReadPong(this.controlFrameBuffer.C1());
                break;
            }
            case 9: {
                this.frameCallback.onReadPing(this.controlFrameBuffer.C1());
                break;
            }
            case 8: {
                int short1 = 1005;
                final c controlFrameBuffer2 = this.controlFrameBuffer;
                final long g = controlFrameBuffer2.g;
                if (g != 1L) {
                    String e;
                    if (g != 0L) {
                        short1 = controlFrameBuffer2.readShort();
                        e = this.controlFrameBuffer.E();
                        final String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(short1);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    }
                    else {
                        e = "";
                    }
                    this.frameCallback.onReadClose(short1, e);
                    this.closed = true;
                    break;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            }
        }
    }
    
    private final void readHeader() throws IOException, ProtocolException {
        if (!this.closed) {
            long n = ((g0)this.source).timeout().timeoutNanos();
            ((g0)this.source).timeout().clearTimeout();
            try {
                final int and = _UtilCommonKt.and(this.source.readByte(), 255);
                ((g0)this.source).timeout().timeout(n, TimeUnit.NANOSECONDS);
                final int opcode = and & 0xF;
                this.opcode = opcode;
                final boolean b = false;
                final boolean isFinalFrame = (and & 0x80) != 0x0;
                this.isFinalFrame = isFinalFrame;
                final boolean isControlFrame = (and & 0x8) != 0x0;
                this.isControlFrame = isControlFrame;
                if (isControlFrame && !isFinalFrame) {
                    throw new ProtocolException("Control frames must be final.");
                }
                final boolean b2 = (and & 0x40) != 0x0;
                if (opcode != 1 && opcode != 2) {
                    if (b2) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                }
                else {
                    boolean readingCompressedMessage;
                    if (b2) {
                        if (!this.perMessageDeflate) {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        readingCompressedMessage = true;
                    }
                    else {
                        readingCompressedMessage = false;
                    }
                    this.readingCompressedMessage = readingCompressedMessage;
                }
                if ((and & 0x20) != 0x0) {
                    throw new ProtocolException("Unexpected rsv2 flag");
                }
                if ((and & 0x10) != 0x0) {
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                final int and2 = _UtilCommonKt.and(this.source.readByte(), 255);
                boolean b3 = b;
                if ((and2 & 0x80) != 0x0) {
                    b3 = true;
                }
                if (b3 == this.isClient) {
                    String s;
                    if (this.isClient) {
                        s = "Server-sent frames must not be masked.";
                    }
                    else {
                        s = "Client-sent frames must be masked.";
                    }
                    throw new ProtocolException(s);
                }
                n = (and2 & 0x7F);
                this.frameLength = n;
                if (n == 126L) {
                    this.frameLength = _UtilCommonKt.and(this.source.readShort(), 65535);
                }
                else if (n == 127L) {
                    n = this.source.readLong();
                    this.frameLength = n;
                    if (n < 0L) {
                        final StringBuilder r = a.r("Frame length 0x");
                        r.append(_UtilJvmKt.toHexString(this.frameLength));
                        r.append(" > 0x7FFFFFFFFFFFFFFF");
                        throw new ProtocolException(r.toString());
                    }
                }
                if (this.isControlFrame && this.frameLength > 125L) {
                    throw new ProtocolException("Control frame must be less than 125B.");
                }
                if (b3) {
                    final f source = this.source;
                    final byte[] maskKey = this.maskKey;
                    e.c((Object)maskKey);
                    source.readFully(maskKey);
                }
                return;
            }
            finally {
                ((g0)this.source).timeout().timeout(n, TimeUnit.NANOSECONDS);
            }
        }
        throw new IOException("closed");
    }
    
    private final void readMessage() throws IOException {
        while (!this.closed) {
            final long frameLength = this.frameLength;
            if (frameLength > 0L) {
                this.source.S1(this.messageFrameBuffer, frameLength);
                if (!this.isClient) {
                    final c messageFrameBuffer = this.messageFrameBuffer;
                    final c$a maskCursor = this.maskCursor;
                    e.c((Object)maskCursor);
                    messageFrameBuffer.w(maskCursor);
                    this.maskCursor.g(this.messageFrameBuffer.g - this.frameLength);
                    final WebSocketProtocol instance = WebSocketProtocol.INSTANCE;
                    final c$a maskCursor2 = this.maskCursor;
                    final byte[] maskKey = this.maskKey;
                    e.c((Object)maskKey);
                    instance.toggleMask(maskCursor2, maskKey);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            this.readUntilNonControlFrame();
            if (this.opcode == 0) {
                continue;
            }
            throw new ProtocolException(e.l((Object)_UtilJvmKt.toHexString(this.opcode), "Expected continuation opcode. Got: "));
        }
        throw new IOException("closed");
    }
    
    private final void readMessageFrame() throws IOException {
        final int opcode = this.opcode;
        if (opcode != 1 && opcode != 2) {
            throw new ProtocolException(e.l((Object)_UtilJvmKt.toHexString(opcode), "Unknown opcode: "));
        }
        this.readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater;
            if ((messageInflater = this.messageInflater) == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (opcode == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.E());
        }
        else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.C1());
        }
    }
    
    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            this.readHeader();
            if (!this.isControlFrame) {
                break;
            }
            this.readControlFrame();
        }
    }
    
    @Override
    public void close() throws IOException {
        try (final MessageInflater messageInflater = this.messageInflater) {}
    }
    
    public final f getSource() {
        return this.source;
    }
    
    public final void processNextFrame() throws IOException {
        this.readHeader();
        if (this.isControlFrame) {
            this.readControlFrame();
        }
        else {
            this.readMessageFrame();
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H&J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H&¨\u0006\u000f" }, d2 = { "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "", "text", "Lhg2/j;", "onReadMessage", "Lokio/ByteString;", "bytes", "payload", "onReadPing", "onReadPong", "", "code", "reason", "onReadClose", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public interface FrameCallback
    {
        void onReadClose(final int p0, final String p1);
        
        void onReadMessage(final String p0) throws IOException;
        
        void onReadMessage(final ByteString p0) throws IOException;
        
        void onReadPing(final ByteString p0);
        
        void onReadPong(final ByteString p0);
    }
}
