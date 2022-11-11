// 
// Decompiled by Procyon v0.6.0
// 

package rm2;

import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;

public final class h
{
    static {
        try {
            final String s = AccessController.doPrivileged((PrivilegedAction<String>)new PrivilegedAction<String>() {
                @Override
                public final Object run() {
                    return System.getProperty("line.separator");
                }
            });
            return;
        }
        catch (final Exception ex) {
            final String s2 = "%n";
            final int n = 0;
            final Object[] array = new Object[n];
            String.format(s2, array);
        }
        try {
            final String s2 = "%n";
            final int n = 0;
            final Object[] array = new Object[n];
            String.format(s2, array);
        }
        catch (final Exception ex2) {}
    }
    
    public static String a(final byte[] array) {
        final int length = array.length;
        final char[] array2 = new char[length];
        for (int i = 0; i != length; ++i) {
            array2[i] = (char)(array[i] & 0xFF);
        }
        return new String(array2);
    }
    
    public static byte[] b(final String s) {
        final int length = s.length();
        final byte[] array = new byte[length];
        for (int i = 0; i != length; ++i) {
            array[i] = (byte)s.charAt(i);
        }
        return array;
    }
    
    public static String c(String s) {
        final char[] charArray = s.toCharArray();
        int i = 0;
        int n = 0;
        while (i != charArray.length) {
            final char c = charArray[i];
            int n2 = n;
            if ('A' <= c) {
                n2 = n;
                if ('Z' >= c) {
                    charArray[i] = (char)(c - 'A' + 97);
                    n2 = 1;
                }
            }
            ++i;
            n = n2;
        }
        if (n != 0) {
            s = new String(charArray);
        }
        return s;
    }
    
    public static void d(final char[] array, final ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        for (int i = 0; i < array.length; ++i) {
            int n = array[i];
            if (n >= 128) {
                int n2;
                if (n < 2048) {
                    n2 = (n >> 6 | 0xC0);
                }
                else {
                    int n3;
                    if (n >= 55296 && n <= 57343) {
                        if (++i >= array.length) {
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                        final char c = array[i];
                        if (n > 56319) {
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                        n = ((n & 0x3FF) << 10 | (c & '\u03ff')) + 65536;
                        byteArrayOutputStream.write(n >> 18 | 0xF0);
                        n3 = ((n >> 12 & 0x3F) | 0x80);
                    }
                    else {
                        n3 = (n >> 12 | 0xE0);
                    }
                    byteArrayOutputStream.write(n3);
                    n2 = ((n >> 6 & 0x3F) | 0x80);
                }
                byteArrayOutputStream.write(n2);
                n = ((n & 0x3F) | 0x80);
            }
            byteArrayOutputStream.write(n);
        }
    }
}
