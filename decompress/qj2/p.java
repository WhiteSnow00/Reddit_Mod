// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import ng2.e;

public final class p
{
    public static final String[] a;
    public static final byte[] b;
    
    static {
        final String[] a2 = new String[93];
        final int n = 0;
        for (int i = 0; i < 32; ++i) {
            final char b2 = b(i >> 12);
            final char b3 = b(i >> 8);
            final char b4 = b(i >> 4);
            final char b5 = b(i);
            final StringBuilder sb = new StringBuilder();
            sb.append("\\u");
            sb.append(b2);
            sb.append(b3);
            sb.append(b4);
            sb.append(b5);
            a2[i] = sb.toString();
        }
        a2[34] = "\\\"";
        a2[92] = "\\\\";
        a2[9] = "\\t";
        a2[8] = "\\b";
        a2[10] = "\\n";
        a2[13] = "\\r";
        a2[12] = "\\f";
        a = a2;
        final byte[] b6 = new byte[93];
        for (int j = n; j < 32; ++j) {
            b6[j] = 1;
        }
        b6[34] = 34;
        b6[92] = 92;
        b6[9] = 116;
        b6[8] = 98;
        b6[10] = 110;
        b6[13] = 114;
        b6[12] = 102;
        b = b6;
    }
    
    public static final void a(final String s, final StringBuilder sb) {
        e.f((Object)s, "value");
        sb.append('\"');
        final int length = s.length();
        int i = 0;
        int n = 0;
        while (i < length) {
            final char char1 = s.charAt(i);
            final String[] a = p.a;
            int n2 = n;
            if (char1 < a.length) {
                n2 = n;
                if (a[char1] != null) {
                    sb.append(s, n, i);
                    sb.append(a[char1]);
                    n2 = i + 1;
                }
            }
            ++i;
            n = n2;
        }
        if (n != 0) {
            sb.append(s, n, s.length());
        }
        else {
            sb.append(s);
        }
        sb.append('\"');
    }
    
    public static final char b(int n) {
        n &= 0xF;
        if (n < 10) {
            n += 48;
        }
        else {
            n = n - 10 + 97;
        }
        return (char)n;
    }
}
