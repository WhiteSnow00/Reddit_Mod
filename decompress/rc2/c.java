// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import java.io.IOException;
import mc2.a;
import com.sendbird.android.shadow.okio.ByteString;

public final class c
{
    public static final ByteString a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    
    static {
        a = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[] { "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION" };
        c = new String[64];
        d = new String[256];
        final int n = 0;
        int n2 = 0;
        while (true) {
            final String[] d2 = rc2.c.d;
            if (n2 >= d2.length) {
                break;
            }
            d2[n2] = mc2.a.l("%8s", new Object[] { Integer.toBinaryString(n2) }).replace(' ', '0');
            ++n2;
        }
        final String[] c2 = rc2.c.c;
        c2[0] = "";
        c2[1] = "END_STREAM";
        final int[] array = { 1 };
        c2[8] = "PADDED";
        for (int i = 0; i < 1; ++i) {
            final int n3 = array[i];
            final String[] c3 = rc2.c.c;
            c3[n3 | 0x8] = a.o(new StringBuilder(), c3[n3], "|PADDED");
        }
        final String[] c4 = rc2.c.c;
        c4[4] = "END_HEADERS";
        c4[32] = "PRIORITY";
        c4[36] = "END_HEADERS|PRIORITY";
        int n4 = 0;
        int n5;
        while (true) {
            n5 = n;
            if (n4 >= 3) {
                break;
            }
            final int n6 = (new int[] { 4, 32, 36 })[n4];
            for (int j = 0; j < 1; ++j) {
                final int n7 = array[j];
                final String[] c5 = rc2.c.c;
                final int n8 = n7 | n6;
                final StringBuilder sb = new StringBuilder();
                sb.append(c5[n7]);
                sb.append('|');
                sb.append(c5[n6]);
                c5[n8] = sb.toString();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(c5[n7]);
                sb2.append('|');
                c5[n8 | 0x8] = a.o(sb2, c5[n6], "|PADDED");
            }
            ++n4;
        }
        while (true) {
            final String[] c6 = rc2.c.c;
            if (n5 >= c6.length) {
                break;
            }
            if (c6[n5] == null) {
                c6[n5] = rc2.c.d[n5];
            }
            ++n5;
        }
    }
    
    public static String a(final boolean b, final int n, final int n2, final byte b2, final byte b3) {
        final String[] b4 = rc2.c.b;
        String l;
        if (b2 < b4.length) {
            l = b4[b2];
        }
        else {
            l = mc2.a.l("0x%02x", new Object[] { b2 });
        }
        String s = null;
        Label_0202: {
            if (b3 == 0) {
                s = "";
            }
            else {
                if (b2 != 2 && b2 != 3) {
                    if (b2 != 4 && b2 != 6) {
                        if (b2 != 7 && b2 != 8) {
                            final String[] c = rc2.c.c;
                            if (b3 < c.length) {
                                s = c[b3];
                            }
                            else {
                                s = rc2.c.d[b3];
                            }
                            if (b2 == 5 && (b3 & 0x4) != 0x0) {
                                s = s.replace("HEADERS", "PUSH_PROMISE");
                                break Label_0202;
                            }
                            if (b2 == 0 && (b3 & 0x20) != 0x0) {
                                s = s.replace("PRIORITY", "COMPRESSED");
                            }
                            break Label_0202;
                        }
                    }
                    else {
                        if (b3 == 1) {
                            s = "ACK";
                            break Label_0202;
                        }
                        s = rc2.c.d[b3];
                        break Label_0202;
                    }
                }
                s = rc2.c.d[b3];
            }
        }
        String s2;
        if (b) {
            s2 = "<<";
        }
        else {
            s2 = ">>";
        }
        return mc2.a.l("%s 0x%08x %5d %-13s %s", new Object[] { s2, n, n2, l, s });
    }
    
    public static void b(final String s, final Object... array) throws IOException {
        throw new IOException(mc2.a.l(s, array));
    }
}
