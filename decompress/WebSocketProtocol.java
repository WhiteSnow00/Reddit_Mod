// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.ws;

import jk2.c;
import jk2.c$a;
import okio.ByteString;
import sg2.e;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nR\u0014\u0010\u000e\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010 \u001a\u00020\u001f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u0014\u0010$\u001a\u00020\u001f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010!R\u0014\u0010%\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u0011R\u0014\u0010&\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u0011R\u0014\u0010'\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u0011¨\u0006*" }, d2 = { "Lokhttp3/internal/ws/WebSocketProtocol;", "", "Ljk2/c$a;", "cursor", "", "key", "Lhg2/j;", "toggleMask", "", "code", "", "closeCodeExceptionMessage", "validateCloseCode", "acceptHeader", "ACCEPT_MAGIC", "Ljava/lang/String;", "B0_FLAG_FIN", "I", "B0_FLAG_RSV1", "B0_FLAG_RSV2", "B0_FLAG_RSV3", "B0_MASK_OPCODE", "OPCODE_FLAG_CONTROL", "B1_FLAG_MASK", "B1_MASK_LENGTH", "OPCODE_CONTINUATION", "OPCODE_TEXT", "OPCODE_BINARY", "OPCODE_CONTROL_CLOSE", "OPCODE_CONTROL_PING", "OPCODE_CONTROL_PONG", "", "PAYLOAD_BYTE_MAX", "J", "CLOSE_MESSAGE_MAX", "PAYLOAD_SHORT", "PAYLOAD_SHORT_MAX", "PAYLOAD_LONG", "CLOSE_CLIENT_GOING_AWAY", "CLOSE_NO_STATUS_CODE", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class WebSocketProtocol
{
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123L;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE;
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125L;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535L;
    
    static {
        INSTANCE = new WebSocketProtocol();
    }
    
    private WebSocketProtocol() {
    }
    
    public final String acceptHeader(String l) {
        e.f((Object)l, "key");
        final ByteString.a companion = ByteString.Companion;
        l = e.l((Object)"258EAFA5-E914-47DA-95CA-C5AB0DC85B11", l);
        companion.getClass();
        return ByteString.a.c(l).sha1().base64();
    }
    
    public final String closeCodeExceptionMessage(final int n) {
        String s;
        if (n >= 1000 && n < 5000) {
            final int n2 = 1;
            if (1004 > n || n >= 1007) {
                int n3;
                if (1015 <= n && n < 3000) {
                    n3 = n2;
                }
                else {
                    n3 = 0;
                }
                if (n3 == 0) {
                    s = null;
                    return s;
                }
            }
            s = d.i("Code ", n, " is reserved and may not be used.");
        }
        else {
            s = e.l((Object)n, "Code must be in range [1000,5000): ");
        }
        return s;
    }
    
    public final void toggleMask(final c$a c$a, final byte[] array) {
        e.f((Object)c$a, "cursor");
        e.f((Object)array, "key");
        final int length = array.length;
        int n = 0;
        long n2;
        do {
            final byte[] j = c$a.j;
            int k = c$a.k;
            final int l = c$a.l;
            final int n3 = 1;
            int n4 = n;
            if (j != null) {
                while (true) {
                    n4 = n;
                    if (k >= l) {
                        break;
                    }
                    n %= length;
                    j[k] ^= array[n];
                    ++k;
                    ++n;
                }
            }
            final long i = c$a.i;
            final c f = c$a.f;
            e.c((Object)f);
            int n5;
            if (i != f.g) {
                n5 = n3;
            }
            else {
                n5 = 0;
            }
            if (n5 == 0) {
                throw new IllegalStateException("no more bytes".toString());
            }
            final long m = c$a.i;
            if (m == -1L) {
                n2 = 0L;
            }
            else {
                n2 = m + (c$a.l - c$a.k);
            }
            n = n4;
        } while (c$a.g(n2) != -1);
    }
    
    public final void validateCloseCode(int n) {
        final String closeCodeExceptionMessage = this.closeCodeExceptionMessage(n);
        if (closeCodeExceptionMessage == null) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            return;
        }
        e.c((Object)closeCodeExceptionMessage);
        throw new IllegalArgumentException(closeCodeExceptionMessage.toString());
    }
}
