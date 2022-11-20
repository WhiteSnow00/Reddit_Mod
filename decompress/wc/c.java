// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import bd.t;
import java.util.regex.Pattern;

public final class c
{
    public static final Pattern c;
    public static final Pattern d;
    public final t a;
    public final StringBuilder b;
    
    static {
        c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
        d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    }
    
    public c() {
        this.a = new t();
        this.b = new StringBuilder();
    }
    
    public static String a(final t t, final StringBuilder sb) {
        int n = 0;
        sb.setLength(0);
        int b = t.b;
        while (b < t.c && n == 0) {
            final char c = (char)t.a[b];
            if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c < '0' || c > '9') && c != '#' && c != '-' && c != '.' && c != '_') {
                n = 1;
            }
            else {
                ++b;
                sb.append(c);
            }
        }
        t.C(b - t.b);
        return sb.toString();
    }
    
    public static String b(final t t, final StringBuilder sb) {
        c(t);
        if (t.c - t.b == 0) {
            return null;
        }
        final String a = a(t, sb);
        if (!"".equals(a)) {
            return a;
        }
        final char c = (char)t.r();
        final StringBuilder sb2 = new StringBuilder(1);
        sb2.append(c);
        return sb2.toString();
    }
    
    public static void c(final t t) {
    Label_0197:
        while (true) {
            int n = 1;
            while (true) {
                final int c = t.c;
                final int b = t.b;
                if (c - b <= 0 || n == 0) {
                    break Label_0197;
                }
                final char c2 = (char)t.a[b];
                boolean b2;
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    b2 = false;
                }
                else {
                    t.C(1);
                    b2 = true;
                }
                if (b2) {
                    break;
                }
                final int b3 = t.b;
                int c3 = t.c;
                final byte[] a = t.a;
                boolean b4 = false;
                Label_0185: {
                    if (b3 + 2 <= c3) {
                        final int n2 = b3 + 1;
                        if (a[b3] == 47) {
                            int n3 = n2 + 1;
                            if (a[n2] == 42) {
                                while (true) {
                                    final int n4 = n3 + 1;
                                    if (n4 >= c3) {
                                        break;
                                    }
                                    if ((char)a[n3] == '*' && (char)a[n4] == '/') {
                                        c3 = (n3 = n4 + 1);
                                    }
                                    else {
                                        n3 = n4;
                                    }
                                }
                                t.C(c3 - t.b);
                                b4 = true;
                                break Label_0185;
                            }
                        }
                    }
                    b4 = false;
                }
                if (b4) {
                    break;
                }
                n = 0;
            }
        }
    }
}
