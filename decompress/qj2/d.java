// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

public final class d
{
    public static final char[] a;
    public static final byte[] b;
    
    static {
        a = new char[117];
        b = new byte[126];
        final int n = 0;
        for (int i = 0; i < 32; ++i) {
            a('u', i);
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        for (int j = n; j < 33; ++j) {
            d.b[j] = 127;
        }
        final byte[] b2 = d.b;
        b2[10] = (b2[9] = 3);
        b2[32] = (b2[13] = 3);
        b2[44] = 4;
        b2[58] = 5;
        b2[123] = 6;
        b2[125] = 7;
        b2[91] = 8;
        b2[93] = 9;
        b2[34] = 1;
        b2[92] = 2;
    }
    
    public static void a(final char c, final int n) {
        if (c != 'u') {
            d.a[c] = (char)n;
        }
    }
}
