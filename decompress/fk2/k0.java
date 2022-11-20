// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import cg.d;
import okio.ByteString;
import ng2.e;

public final class k0
{
    public static final c.a a;
    public static final int b;
    
    static {
        a = new c.a();
        b = -1234567890;
    }
    
    public static final boolean a(final byte[] array, final int n, final int n2, final int n3, final byte[] array2) {
        e.f((Object)array, "a");
        e.f((Object)array2, "b");
        if (n3 > 0) {
            int n4 = 0;
            while (true) {
                final int n5 = n4 + 1;
                if (array[n4 + n] != array2[n4 + n2]) {
                    return false;
                }
                if (n5 >= n3) {
                    break;
                }
                n4 = n5;
            }
        }
        return true;
    }
    
    public static final void b(final long n, final long n2, final long n3) {
        if ((n2 | n3) >= 0L && n2 <= n && n - n2 >= n3) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("size=");
        sb.append(n);
        sb.append(" offset=");
        sb.append(n2);
        sb.append(" byteCount=");
        sb.append(n3);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
    
    public static final int c(final ByteString byteString, final int n) {
        e.f((Object)byteString, "<this>");
        if (n == k0.b) {
            return byteString.size();
        }
        return n;
    }
    
    public static final String d(final byte b) {
        final char[] j = d.j;
        return new String(new char[] { j[b >> 4 & 0xF], j[b & 0xF] });
    }
}
