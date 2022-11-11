// 
// Decompiled by Procyon v0.6.0
// 

package vm2;

import org.xml.sax.SAXException;
import java.io.IOException;
import org.xml.sax.ContentHandler;
import java.net.URL;
import java.util.ArrayList;
import java.io.PushbackReader;
import java.io.BufferedReader;
import java.io.Reader;
import org.xml.sax.Locator;

public final class d implements i, Locator
{
    public static int[] l;
    public static short[][] m;
    public static int n;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public char[] i;
    public int j;
    public int[] k;
    
    static {
        d.l = new int[] { 1, 47, 5, 22, 1, 61, 4, 3, 1, 62, 6, 28, 1, 0, 27, 1, 1, -1, 6, 21, 1, 32, 4, 24, 1, 10, 4, 24, 1, 9, 4, 24, 2, 39, 7, 34, 2, 0, 27, 2, 2, -1, 8, 21, 2, 32, 29, 2, 2, 10, 29, 2, 2, 9, 29, 2, 3, 34, 28, 31, 3, 39, 28, 2, 3, 62, 8, 28, 3, 0, 27, 32, 3, -1, 8, 21, 3, 32, 28, 3, 3, 10, 28, 3, 3, 9, 28, 3, 4, 67, 28, 5, 4, 0, 28, 19, 4, -1, 28, 21, 5, 68, 28, 6, 5, 0, 28, 19, 5, -1, 28, 21, 6, 65, 28, 7, 6, 0, 28, 19, 6, -1, 28, 21, 7, 84, 28, 8, 7, 0, 28, 19, 7, -1, 28, 21, 8, 65, 28, 9, 8, 0, 28, 19, 8, -1, 28, 21, 9, 91, 28, 12, 9, 0, 28, 19, 9, -1, 28, 21, 10, 60, 27, 11, 10, 0, 27, 10, 10, -1, 23, 21, 11, 47, 32, 25, 11, 0, 27, 10, 11, -1, 32, 21, 12, 93, 27, 13, 12, 0, 27, 12, 12, -1, 28, 21, 13, 93, 27, 14, 13, 0, 27, 12, 13, -1, 28, 21, 14, 62, 9, 28, 14, 93, 27, 14, 14, 0, 27, 12, 14, -1, 28, 21, 15, 45, 28, 16, 15, 0, 27, 16, 15, -1, 10, 21, 16, 45, 28, 17, 16, 0, 27, 16, 16, -1, 10, 21, 17, 45, 28, 18, 17, 0, 20, 16, 17, -1, 10, 21, 18, 45, 22, 18, 18, 62, 10, 28, 18, 0, 21, 16, 18, -1, 10, 21, 19, 45, 28, 15, 19, 62, 28, 28, 19, 91, 28, 4, 19, 0, 27, 20, 19, -1, 28, 21, 20, 62, 11, 28, 20, 0, 27, 20, 20, -1, 28, 21, 22, 62, 12, 28, 22, 0, 27, 1, 22, 32, 28, 34, 22, 10, 28, 34, 22, 9, 28, 34, 23, 0, 13, 23, 23, -1, 13, 21, 24, 61, 28, 3, 24, 62, 3, 28, 24, 0, 2, 1, 24, -1, 3, 21, 24, 32, 28, 24, 24, 10, 28, 24, 24, 9, 28, 24, 25, 62, 15, 28, 25, 0, 27, 25, 25, -1, 15, 21, 25, 32, 28, 25, 25, 10, 28, 25, 25, 9, 28, 25, 26, 47, 28, 22, 26, 62, 17, 28, 26, 0, 27, 26, 26, -1, 28, 21, 26, 32, 16, 34, 26, 10, 16, 34, 26, 9, 16, 34, 27, 0, 13, 27, 27, -1, 13, 21, 28, 38, 14, 23, 28, 60, 23, 33, 28, 0, 27, 28, 28, -1, 23, 21, 29, 62, 24, 28, 29, 0, 27, 29, 29, -1, 24, 21, 30, 62, 26, 28, 30, 0, 27, 30, 30, -1, 26, 21, 30, 32, 25, 29, 30, 10, 25, 29, 30, 9, 25, 29, 31, 34, 7, 34, 31, 0, 27, 31, 31, -1, 8, 21, 31, 32, 29, 31, 31, 10, 29, 31, 31, 9, 29, 31, 32, 62, 8, 28, 32, 0, 27, 32, 32, -1, 8, 21, 32, 32, 7, 34, 32, 10, 7, 34, 32, 9, 7, 34, 33, 33, 28, 19, 33, 47, 28, 25, 33, 60, 27, 33, 33, 63, 28, 30, 33, 0, 27, 26, 33, -1, 19, 21, 33, 32, 18, 28, 33, 10, 18, 28, 33, 9, 18, 28, 34, 47, 28, 22, 34, 62, 30, 28, 34, 0, 27, 1, 34, -1, 30, 21, 34, 32, 28, 34, 34, 10, 28, 34, 34, 9, 28, 34, 35, 0, 13, 35, 35, -1, 13, 21 };
        int n2;
        int n = n2 = -1;
        int n3 = 0;
        while (true) {
            final int[] l = d.l;
            if (n3 >= l.length) {
                break;
            }
            final int n4 = l[n3];
            int n5;
            if (n4 > (n5 = n2)) {
                n5 = n4;
            }
            final int n6 = l[n3 + 1];
            int n7;
            if (n6 > (n7 = n)) {
                n7 = n6;
            }
            n3 += 4;
            n = n7;
            n2 = n5;
        }
        d.n = n + 1;
        d.m = new short[n2 + 1][n + 3];
        for (int i = 0; i <= n2; ++i) {
            for (int j = -2; j <= n; ++j) {
                int n8 = -1;
                int n10;
                int n9 = n10 = 0;
                Label_4140: {
                    while (true) {
                        final int[] k = d.l;
                        if (n9 >= k.length) {
                            break;
                        }
                        int n11;
                        int n12;
                        if (i != k[n9]) {
                            n11 = n10;
                            n12 = n8;
                            if (n10 != 0) {
                                break;
                            }
                        }
                        else {
                            final int n13 = k[n9 + 1];
                            if (n13 == 0) {
                                n11 = k[n9 + 2];
                                n12 = n9;
                            }
                            else {
                                n11 = n10;
                                n12 = n8;
                                if (n13 == j) {
                                    final int n14 = k[n9 + 2];
                                    break Label_4140;
                                }
                            }
                        }
                        n9 += 4;
                        n10 = n11;
                        n8 = n12;
                    }
                    n9 = n8;
                }
                d.m[i][j + 2] = (short)n9;
            }
        }
    }
    
    public d() {
        this.i = new char[200];
        this.k = new int[] { 8364, 65533, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 65533, 381, 65533, 65533, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 65533, 382, 376 };
    }
    
    public final void a(final Reader reader, final h h) throws IOException, SAXException {
        this.g = 28;
        PushbackReader pushbackReader;
        if (reader instanceof BufferedReader) {
            pushbackReader = new PushbackReader(reader, 5);
        }
        else {
            pushbackReader = new PushbackReader(new BufferedReader(reader), 5);
        }
        final int read = pushbackReader.read();
        short n2;
        final short n = n2 = -1;
        if (read != 65279) {
            n2 = n;
            if (read != -1) {
                pushbackReader.unread(read);
                n2 = n;
            }
        }
    Label_3093_Outer:
        while (true) {
            final int g = this.g;
            String s = "";
            Label_3166: {
                if (g == 21) {
                    break Label_3166;
                }
                int read2;
                final int n3 = read2 = pushbackReader.read();
                if (n3 >= 128 && (read2 = n3) <= 159) {
                    read2 = this.k[n3 - 128];
                }
                short n4;
                if ((n4 = (short)read2) == 13) {
                    final int read3 = pushbackReader.read();
                    if ((n4 = (short)read3) != 10) {
                        if (read3 != n2) {
                            pushbackReader.unread(read3);
                        }
                        n4 = 10;
                    }
                }
                final int n5 = 1;
                if (n4 == 10) {
                    ++this.e;
                    this.f = 0;
                }
                else {
                    ++this.f;
                }
                if (n4 < 32 && n4 != 10 && n4 != 9 && n4 != n2) {
                    continue Label_3093_Outer;
                }
                int n6;
                if (n4 >= n2 && n4 < vm2.d.n) {
                    n6 = n4;
                }
                else {
                    n6 = -2;
                }
                final short n7 = vm2.d.m[this.g][n6 + 2];
                int n8;
                if (n7 != n2) {
                    final int[] l = vm2.d.l;
                    n8 = l[n7 + 2];
                    this.h = l[n7 + 3];
                }
                else {
                    n8 = 0;
                }
                short n9 = n2;
            Label_2637_Outer:
                while (true) {
                Block_89_Outer:
                    while (true) {
                        Label_3108: {
                            final g g5;
                            final String q2;
                            final i g6;
                            switch (n8) {
                                default: {
                                    final StringBuffer sb = new StringBuffer();
                                    sb.append("Can't process state ");
                                    sb.append(n8);
                                    throw new Error(sb.toString());
                                }
                                case 13: {
                                    this.c();
                                    final char c = (char)n4;
                                    final int g2 = this.g;
                                    if (g2 == 23 && c == '#') {
                                        this.h = 27;
                                        this.d(n4, h);
                                        n9 = n2;
                                        break Label_3093;
                                    }
                                    if (g2 == 27 && (c == 'x' || c == 'X')) {
                                        this.h = 35;
                                        this.d(n4, h);
                                        n9 = n2;
                                        break Label_3093;
                                    }
                                    if (g2 == 23 && Character.isLetterOrDigit(c)) {
                                        this.d(n4, h);
                                        n9 = n2;
                                        break Label_3093;
                                    }
                                    if (this.g == 27 && Character.isDigit(c)) {
                                        this.d(n4, h);
                                        n9 = n2;
                                        break Label_3093;
                                    }
                                    if (this.g == 35 && (Character.isDigit(c) || "abcdefABCDEF".indexOf(c) != n2)) {
                                        this.d(n4, h);
                                        n9 = n2;
                                        break Label_3093;
                                    }
                                    final char[] i = this.i;
                                    final int j = this.j;
                                    final g g3 = (g)h;
                                    final int f = g3.f(i, 1, j - 1);
                                    g3.getClass();
                                    if (f != 0) {
                                        this.j = 0;
                                        int n10 = f;
                                        if (f >= 128 && (n10 = f) <= 159) {
                                            n10 = this.k[f - 128];
                                        }
                                        if (n10 >= 32) {
                                            if (n10 < 55296 || n10 > 57343) {
                                                if (n10 <= 65535) {
                                                    this.d(n10, h);
                                                }
                                                else {
                                                    final int n11 = n10 - 65536;
                                                    this.d((n11 >> 10) + 55296, h);
                                                    this.d((n11 & 0x3FF) + 56320, h);
                                                }
                                            }
                                        }
                                        if (n4 != 59) {
                                            if (n4 != n2) {
                                                pushbackReader.unread(n4);
                                            }
                                            --this.f;
                                        }
                                    }
                                    else {
                                        if (n4 != n2) {
                                            pushbackReader.unread(n4);
                                        }
                                        --this.f;
                                    }
                                    this.h = 28;
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 12: {
                                    this.c();
                                    final int k = this.j;
                                    if (k > 0) {
                                        ((g)h).e(this.i, k);
                                    }
                                    this.j = 0;
                                    final char[] m = this.i;
                                    final g g4 = (g)h;
                                    final cd.c s2 = g4.s;
                                    if (s2 == null) {
                                        n9 = n2;
                                        break Label_3093;
                                    }
                                    g4.m(s2);
                                    g4.c(m, 0);
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 11: {
                                    final char[] i2 = this.i;
                                    final int j2 = this.j;
                                    g5 = (g)h;
                                    g5.getClass();
                                    final String trim = new String(i2, 0, j2).trim();
                                    String[] array;
                                    if (trim.length() == 0) {
                                        array = new String[0];
                                    }
                                    else {
                                        final ArrayList<String> list = new ArrayList<String>();
                                        final int length = trim.length();
                                        final int n12 = 0;
                                        int n14;
                                        final int n13 = n14 = n12;
                                        int n16;
                                        int n15 = n16 = n14;
                                        int n17 = n13;
                                        int n18;
                                        char char1;
                                        int n19;
                                        int n20;
                                        int n21;
                                        char c2;
                                        for (n18 = n12; n18 < length; ++n18, c2 = char1, n17 = n19, n14 = n20, n16 = c2, n15 = n21) {
                                            char1 = trim.charAt(n18);
                                            if (n14 == 0 && char1 == '\'' && n16 != 92) {
                                                n15 ^= 0x1;
                                                n19 = n17;
                                                n20 = n14;
                                                n21 = n15;
                                                if (n17 >= 0) {
                                                    continue Label_2637_Outer;
                                                }
                                            }
                                            else if (n15 == 0 && char1 == '\"' && n16 != 92) {
                                                n14 ^= 0x1;
                                                n19 = n17;
                                                n20 = n14;
                                                n21 = n15;
                                                if (n17 >= 0) {
                                                    continue Label_2637_Outer;
                                                }
                                            }
                                            else {
                                                n19 = n17;
                                                n20 = n14;
                                                if ((n21 = n15) != 0) {
                                                    continue Label_2637_Outer;
                                                }
                                                n19 = n17;
                                                n20 = n14;
                                                n21 = n15;
                                                if (n14 != 0) {
                                                    continue Label_2637_Outer;
                                                }
                                                if (Character.isWhitespace(char1)) {
                                                    if (n17 >= 0) {
                                                        list.add(trim.substring(n17, n18));
                                                    }
                                                    n19 = -1;
                                                    n20 = n14;
                                                    n21 = n15;
                                                    continue Label_2637_Outer;
                                                }
                                                n19 = n17;
                                                n20 = n14;
                                                n21 = n15;
                                                if (n17 >= 0) {
                                                    continue Label_2637_Outer;
                                                }
                                                n19 = n17;
                                                n20 = n14;
                                                n21 = n15;
                                                if (char1 == ' ') {
                                                    continue Label_2637_Outer;
                                                }
                                            }
                                            n19 = n18;
                                            n21 = n15;
                                            n20 = n14;
                                        }
                                        list.add(trim.substring(n17, n18));
                                        array = list.toArray(new String[0]);
                                    }
                                    final int length2 = array.length;
                                    final String s3 = null;
                                    String s5 = null;
                                    String x = null;
                                    Label_2408: {
                                        Label_2403: {
                                            if (length2 > 0 && "DOCTYPE".equalsIgnoreCase(array[0])) {
                                                if (g5.u) {
                                                    break Label_2637;
                                                }
                                                g5.u = true;
                                                if (array.length > 1) {
                                                    final String s4 = array[1];
                                                    if (array.length > 3 && "SYSTEM".equals(array[2])) {
                                                        s = array[3];
                                                        s5 = null;
                                                        x = s4;
                                                        break Label_2408;
                                                    }
                                                    if (array.length <= 3 || !"PUBLIC".equals(array[2])) {
                                                        x = s4;
                                                        break Label_2403;
                                                    }
                                                    final String s6 = array[3];
                                                    x = s4;
                                                    s5 = s6;
                                                    if (array.length > 4) {
                                                        s = array[4];
                                                        x = s4;
                                                        s5 = s6;
                                                    }
                                                    break Label_2408;
                                                }
                                            }
                                            x = null;
                                        }
                                        s5 = null;
                                        s = null;
                                    }
                                    final String q = vm2.g.q(s5);
                                    q2 = vm2.g.q(s);
                                    if (x == null) {
                                        break Label_2637;
                                    }
                                    String trim2;
                                    if (q == null) {
                                        trim2 = s3;
                                    }
                                    else {
                                        final int length3 = q.length();
                                        final StringBuffer sb2 = new StringBuffer(length3);
                                        int n22 = 1;
                                        for (int n23 = 0; n23 < length3; ++n23) {
                                            final char char2 = q.charAt(n23);
                                            if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-'()+,./:=?;!*#@$_%".indexOf(char2) != -1) {
                                                sb2.append(char2);
                                                n22 = 0;
                                            }
                                            else if (n22 == 0) {
                                                sb2.append(' ');
                                                n22 = 1;
                                            }
                                        }
                                        trim2 = sb2.toString().trim();
                                    }
                                    g5.b.startDTD(x, trim2, q2);
                                    g5.b.endDTD();
                                    g5.x = x;
                                    g5.v = trim2;
                                    g6 = g5.g;
                                    if (g6 instanceof Locator) {
                                        break;
                                    }
                                    break Label_2637;
                                }
                                case 10: {
                                    break Label_3108;
                                }
                                case 9: {
                                    break Label_3108;
                                }
                                case 8: {
                                    break Label_3108;
                                }
                                case 7: {
                                    break Label_3108;
                                }
                                case 6: {
                                    break Label_3108;
                                }
                                case 5: {
                                    break Label_3108;
                                }
                                case 4: {
                                    break Label_3108;
                                }
                                case 3: {
                                    break Label_3108;
                                }
                                case 2: {
                                    break Label_3108;
                                }
                                case 1: {
                                    break Label_3108;
                                }
                                case 28: {
                                    break Label_3093;
                                }
                                case 32: {
                                    final int j3 = this.j;
                                    if (j3 > 0) {
                                        this.j = j3 - 1;
                                    }
                                    ((g)h).h(this.i, this.j);
                                    this.j = 0;
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 31: {
                                    if (n4 != n2) {
                                        pushbackReader.unread(n4);
                                    }
                                    --this.f;
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 30: {
                                    ((g)h).p(this.i, this.j);
                                    this.j = 0;
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 29: {
                                    this.d(32, h);
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 27: {
                                    this.d(n4, h);
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 26: {
                                    final char[] i3 = this.i;
                                    final int j4 = this.j;
                                    final g g7 = (g)h;
                                    if (g7.s == null) {
                                        g7.y = g7.g(i3, j4).replace(':', '_');
                                    }
                                    this.j = 0;
                                    g7.i(this.i, 0);
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 25: {
                                    final char[] i4 = this.i;
                                    final int j5 = this.j;
                                    final g g8 = (g)h;
                                    if (g8.s == null) {
                                        g8.y = g8.g(i4, j5).replace(':', '_');
                                    }
                                    this.j = 0;
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 24: {
                                    this.c();
                                    ((g)h).i(this.i, this.j);
                                    this.j = 0;
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 23: {
                                    this.c();
                                    ((g)h).h(this.i, this.j);
                                    this.j = 0;
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 22: {
                                    this.d(45, h);
                                    this.d(32, h);
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 21: {
                                    this.d(45, h);
                                    this.d(32, h);
                                }
                                case 20: {
                                    this.d(45, h);
                                    this.d(n4, h);
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 19: {
                                    this.c();
                                    this.d(60, h);
                                    ((g)h).h(this.i, this.j);
                                    this.j = 0;
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 18: {
                                    this.c();
                                    this.d(60, h);
                                    this.d(n4, h);
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 17: {
                                    final char[] i5 = this.i;
                                    final int j6 = this.j;
                                    final g g9 = (g)h;
                                    g9.e(i5, j6);
                                    this.j = 0;
                                    g9.p(this.i, 0);
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 16: {
                                    ((g)h).e(this.i, this.j);
                                    this.j = 0;
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 15: {
                                    final char[] i6 = this.i;
                                    final int j7 = this.j;
                                    final g g10 = (g)h;
                                    final String c3 = g10.z.c();
                                    int n25 = 0;
                                    Label_1276: {
                                        if (g10.q && (((c)g10.z.b).f & 0x2) != 0x0) {
                                            boolean b2;
                                            final boolean b = b2 = (j7 == c3.length());
                                            if (b) {
                                                int n24 = 0;
                                                while (true) {
                                                    b2 = b;
                                                    if (n24 >= j7) {
                                                        break;
                                                    }
                                                    if (Character.toLowerCase(i6[0 + n24]) != Character.toLowerCase(c3.charAt(n24))) {
                                                        b2 = false;
                                                        break;
                                                    }
                                                    ++n24;
                                                }
                                            }
                                            if (!b2) {
                                                final ContentHandler a = g10.a;
                                                final char[] d = vm2.g.D;
                                                a.characters(d, 0, 2);
                                                g10.a.characters(i6, 0, j7);
                                                g10.a.characters(d, 2, 1);
                                                g10.g.startCDATA();
                                                n25 = n5;
                                                break Label_1276;
                                            }
                                        }
                                        n25 = 0;
                                    }
                                    if (n25 == 0) {
                                        g10.c(i6, j7);
                                    }
                                    this.j = 0;
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 14: {
                                    final char[] i7 = this.i;
                                    final int j8 = this.j;
                                    final g g11 = (g)h;
                                    g11.h(i7, j8);
                                    this.j = 0;
                                    this.d(n4, (h)g11);
                                    n9 = n2;
                                    break Label_3093;
                                }
                                case 0: {
                                    break Label_3108;
                                }
                            }
                            g5.w = ((Locator)g6).getSystemId();
                            try {
                                g5.w = new URL(new URL(g5.w), q2).toString();
                                this.j = 0;
                                n9 = -1;
                                this.g = this.h;
                                n2 = n9;
                                continue Label_3093_Outer;
                                Label_2856: {
                                    final g g12;
                                    final char[] i8;
                                    final int j9;
                                    g12.t = g12.g(i8, j9).toLowerCase();
                                }
                                while (true) {
                                    g g12;
                                    char[] i8;
                                    int j9;
                                    g g13 = null;
                                    g g14;
                                    g g15;
                                    int j10;
                                    g g16;
                                    char[] i9;
                                    int j11;
                                    g g17;
                                    char[] i10;
                                    int j12;
                                    StringBuffer sb3;
                                    char[] i11;
                                    int j13;
                                    g g18;
                                    Label_3186:Label_3237_Outer:
                                    while (true) {
                                        break Label_2872;
                                        Label_3206:
                                        iftrue(Label_3237:)(g13.f.c.equals(""));
                                        Block_85: {
                                            Label_2715: {
                                                while (true) {
                                                    Block_90: {
                                                        break Block_90;
                                                        while (true) {
                                                        Label_3007_Outer:
                                                            while (true) {
                                                                this.j = 0;
                                                                g14.a();
                                                                n9 = n2;
                                                                continue Label_2637_Outer;
                                                                Block_84: {
                                                                Block_88:
                                                                    while (true) {
                                                                        this.j = 0;
                                                                        n9 = n2;
                                                                        continue Label_2637_Outer;
                                                                        g15 = (g)h;
                                                                        g15.a();
                                                                        this.j = 0;
                                                                        g15.p(this.i, 0);
                                                                        n9 = n2;
                                                                        continue Label_2637_Outer;
                                                                        g13.j();
                                                                        break Label_3186;
                                                                        i8 = this.i;
                                                                        j9 = this.j;
                                                                        g12 = (g)h;
                                                                        iftrue(Label_2856:)(g12.s != null);
                                                                        break Block_85;
                                                                        g13 = (g)h;
                                                                        iftrue(Label_3186:)(!g13.C);
                                                                        break Block_88;
                                                                        this.c();
                                                                        j10 = this.j;
                                                                        iftrue(Label_2715:)(j10 <= 1);
                                                                        break Block_84;
                                                                        Label_2991:
                                                                        g16.t = g16.g(i9, j11).toLowerCase();
                                                                        continue Block_89_Outer;
                                                                        g17 = (g)h;
                                                                        g17.a();
                                                                        this.j = 0;
                                                                        this.d(n4, (h)g17);
                                                                        n9 = n2;
                                                                        continue Label_2637_Outer;
                                                                        this.c();
                                                                        ((g)h).b.comment(this.i, 0, this.j);
                                                                        this.j = 0;
                                                                        n9 = n2;
                                                                        continue Label_2637_Outer;
                                                                        ((g)h).a();
                                                                        this.j = 0;
                                                                        n9 = n2;
                                                                        continue Label_2637_Outer;
                                                                        this.j = 0;
                                                                        g12.a();
                                                                        g12.p(this.i, this.j);
                                                                        n9 = n2;
                                                                        continue Label_2637_Outer;
                                                                        Label_2930:
                                                                        g14.t = g14.g(i10, j12).toLowerCase();
                                                                        continue Label_3007_Outer;
                                                                        continue Block_89_Outer;
                                                                    }
                                                                    g13.m(g13.B);
                                                                    break Label_3186;
                                                                }
                                                                this.j = j10 - 2;
                                                                break Label_2715;
                                                                g13.a.endDocument();
                                                                return;
                                                                i10 = this.i;
                                                                j12 = this.j;
                                                                g14 = (g)h;
                                                                iftrue(Label_2930:)(g14.s != null);
                                                                continue Label_3007_Outer;
                                                            }
                                                            i9 = this.i;
                                                            j11 = this.j;
                                                            g16 = (g)h;
                                                            iftrue(Label_2991:)(g16.s != null);
                                                            continue Label_3237_Outer;
                                                        }
                                                    }
                                                    g13.a.endPrefixMapping(g13.f.d);
                                                    continue;
                                                }
                                                sb3 = new StringBuffer();
                                                sb3.append("HTMLScanner can't cope with ");
                                                sb3.append(Integer.toString(n4));
                                                sb3.append(" in state ");
                                                sb3.append(Integer.toString(this.g));
                                                throw new Error(sb3.toString());
                                                i11 = this.i;
                                                j13 = this.j;
                                                g18 = (g)h;
                                                g18.b(i11, j13);
                                                this.j = 0;
                                                g18.p(this.i, 0);
                                                n9 = n2;
                                                continue Label_2637_Outer;
                                                ((g)h).b(this.i, this.j);
                                                this.j = 0;
                                                n9 = n2;
                                                continue Label_2637_Outer;
                                            }
                                            ((g)h).h(this.i, this.j);
                                            this.j = 0;
                                            n9 = n2;
                                            continue Label_2637_Outer;
                                        }
                                        continue Block_89_Outer;
                                    }
                                    iftrue(Label_3206:)(g13.z.d == null);
                                    continue;
                                }
                            }
                            catch (final Exception ex) {
                                continue;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public final void b(final String a, final String b) {
        this.a = a;
        this.b = b;
        this.f = 0;
        this.e = 0;
        this.d = 0;
        this.c = 0;
    }
    
    public final void c() {
        this.d = this.f;
        this.c = this.e;
    }
    
    public final void d(final int n, final h h) throws IOException, SAXException {
        final int j = this.j;
        final char[] i = this.i;
        if (j >= i.length - 20) {
            final int g = this.g;
            if (g != 28 && g != 10) {
                final char[] k = new char[i.length * 2];
                System.arraycopy(i, 0, k, 0, j + 1);
                this.i = k;
            }
            else {
                ((g)h).h(i, j);
                this.j = 0;
            }
        }
        this.i[this.j++] = (char)n;
    }
    
    public final int getColumnNumber() {
        return this.d;
    }
    
    public final int getLineNumber() {
        return this.c;
    }
    
    public final String getPublicId() {
        return this.a;
    }
    
    public final String getSystemId() {
        return this.b;
    }
    
    public final void startCDATA() {
        this.h = 10;
    }
}
