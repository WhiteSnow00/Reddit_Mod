// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import xi2.a;
import ng2.e;
import okio.ByteString$a;
import okio.ByteString;

public final class j0
{
    public static final byte[] a;
    public static final byte[] b;
    
    static {
        ByteString.Companion.getClass();
        a = ByteString$a.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        b = ByteString$a.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }
    
    public static final String a(final byte[] array, final byte[] array2) {
        e.f((Object)array, "<this>");
        e.f((Object)array2, "map");
        byte[] array3;
        int n;
        int i;
        int n2;
        int n3;
        byte b;
        byte b2;
        byte b3;
        int n4;
        int n5;
        int n6;
        for (array3 = new byte[(array.length + 2) / 3 * 4], n = array.length - array.length % 3, i = 0, n2 = 0; i < n; i = n3 + 1, b2 = array[n3], b3 = array[i], n4 = n2 + 1, array3[n2] = array2[(b & 0xFF) >> 2], n5 = n4 + 1, array3[n4] = array2[(b & 0x3) << 4 | (b2 & 0xFF) >> 4], n6 = n5 + 1, array3[n5] = array2[(b2 & 0xF) << 2 | (b3 & 0xFF) >> 6], n2 = n6 + 1, array3[n6] = array2[b3 & 0x3F], ++i) {
            n3 = i + 1;
            b = array[i];
        }
        final int n7 = array.length - n;
        if (n7 != 1) {
            if (n7 == 2) {
                final byte b4 = array[i];
                final byte b5 = array[i + 1];
                final int n8 = n2 + 1;
                array3[n2] = array2[(b4 & 0xFF) >> 2];
                final int n9 = n8 + 1;
                array3[n8] = array2[(b4 & 0x3) << 4 | (b5 & 0xFF) >> 4];
                array3[n9] = array2[(b5 & 0xF) << 2];
                array3[n9 + 1] = 61;
            }
        }
        else {
            final byte b6 = array[i];
            final int n10 = n2 + 1;
            array3[n2] = array2[(b6 & 0xFF) >> 2];
            final int n11 = n10 + 1;
            array3[n10] = array2[(b6 & 0x3) << 4];
            array3[n11 + 1] = (array3[n11] = 61);
        }
        return new String(array3, xi2.a.b);
    }
}
