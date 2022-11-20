// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http2;

import xi2.j;
import okhttp3.internal._UtilJvmKt;
import ng2.e;
import okio.ByteString$a;
import okio.ByteString;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bJ\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000bH\u0000¢\u0006\u0002\b#J.\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0014\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006)" }, d2 = { "Lokhttp3/internal/http2/Http2;", "", "()V", "BINARY", "", "", "[Ljava/lang/String;", "CONNECTION_PREFACE", "Lokio/ByteString;", "FLAGS", "FLAG_ACK", "", "FLAG_COMPRESSED", "FLAG_END_HEADERS", "FLAG_END_PUSH_PROMISE", "FLAG_END_STREAM", "FLAG_NONE", "FLAG_PADDED", "FLAG_PRIORITY", "FRAME_NAMES", "INITIAL_MAX_FRAME_SIZE", "TYPE_CONTINUATION", "TYPE_DATA", "TYPE_GOAWAY", "TYPE_HEADERS", "TYPE_PING", "TYPE_PRIORITY", "TYPE_PUSH_PROMISE", "TYPE_RST_STREAM", "TYPE_SETTINGS", "TYPE_WINDOW_UPDATE", "formatFlags", "type", "flags", "formattedType", "formattedType$okhttp", "frameLog", "inbound", "", "streamId", "length", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class Http2
{
    private static final String[] BINARY;
    public static final ByteString CONNECTION_PREFACE;
    private static final String[] FLAGS;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final String[] FRAME_NAMES;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final Http2 INSTANCE;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;
    
    static {
        INSTANCE = new Http2();
        ByteString.Companion.getClass();
        CONNECTION_PREFACE = ByteString$a.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        FRAME_NAMES = new String[] { "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION" };
        FLAGS = new String[64];
        final String[] binary = new String[256];
        final int n = 0;
        for (int i = 0; i < 256; ++i) {
            final String binaryString = Integer.toBinaryString(i);
            e.e((Object)binaryString, "toBinaryString(it)");
            binary[i] = j.F0(_UtilJvmKt.format("%8s", binaryString), ' ', '0');
        }
        BINARY = binary;
        final String[] flags = Http2.FLAGS;
        flags[0] = "";
        flags[1] = "END_STREAM";
        final int[] array = { 1 };
        flags[8] = "PADDED";
        int n2;
        String[] flags2;
        for (int j = 0; j < 1; ++j, flags2 = Http2.FLAGS, flags2[n2 | 0x8] = e.l((Object)"|PADDED", flags2[n2])) {
            n2 = array[j];
        }
        final String[] flags3 = Http2.FLAGS;
        flags3[4] = "END_HEADERS";
        flags3[32] = "PRIORITY";
        flags3[36] = "END_HEADERS|PRIORITY";
        int k = 0;
        while (k < 3) {
            final int n3 = (new int[] { 4, 32, 36 })[k];
            final int n4 = k + 1;
            int n5 = 0;
            while (true) {
                k = n4;
                if (n5 >= 1) {
                    break;
                }
                final int n6 = array[n5];
                ++n5;
                final String[] flags4 = Http2.FLAGS;
                final int n7 = n6 | n3;
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)flags4[n6]);
                sb.append('|');
                sb.append((Object)flags4[n3]);
                flags4[n7] = sb.toString();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append((Object)flags4[n6]);
                sb2.append('|');
                sb2.append((Object)flags4[n3]);
                sb2.append("|PADDED");
                flags4[n7 | 0x8] = sb2.toString();
            }
        }
        for (int length = Http2.FLAGS.length, l = n; l < length; ++l) {
            final String[] flags5 = Http2.FLAGS;
            if (flags5[l] == null) {
                flags5[l] = Http2.BINARY[l];
            }
        }
    }
    
    private Http2() {
    }
    
    public final String formatFlags(final int n, final int n2) {
        if (n2 == 0) {
            return "";
        }
        if (n != 2 && n != 3) {
            if (n == 4 || n == 6) {
                String s;
                if (n2 == 1) {
                    s = "ACK";
                }
                else {
                    s = Http2.BINARY[n2];
                }
                return s;
            }
            if (n != 7 && n != 8) {
                final String[] flags = Http2.FLAGS;
                String s2;
                if (n2 < flags.length) {
                    s2 = flags[n2];
                    e.c((Object)s2);
                }
                else {
                    s2 = Http2.BINARY[n2];
                }
                String s3;
                if (n == 5 && (n2 & 0x4) != 0x0) {
                    s3 = j.E0(s2, "HEADERS", "PUSH_PROMISE", false);
                }
                else {
                    s3 = s2;
                    if (n == 0) {
                        s3 = s2;
                        if ((n2 & 0x20) != 0x0) {
                            s3 = j.E0(s2, "PRIORITY", "COMPRESSED", false);
                        }
                    }
                }
                return s3;
            }
        }
        return Http2.BINARY[n2];
    }
    
    public final String formattedType$okhttp(final int n) {
        final String[] frame_NAMES = Http2.FRAME_NAMES;
        String format;
        if (n < frame_NAMES.length) {
            format = frame_NAMES[n];
        }
        else {
            format = _UtilJvmKt.format("0x%02x", n);
        }
        return format;
    }
    
    public final String frameLog(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final String formattedType$okhttp = this.formattedType$okhttp(n3);
        final String formatFlags = this.formatFlags(n3, n4);
        String s;
        if (b) {
            s = "<<";
        }
        else {
            s = ">>";
        }
        return _UtilJvmKt.format("%s 0x%08x %5d %-13s %s", s, n, n2, formattedType$okhttp, formatFlags);
    }
}
