// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.shadow.okio;

import java.io.OutputStream;
import java.util.Arrays;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import ml0.a;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import xc2.v;
import java.nio.charset.Charset;
import java.io.Serializable;

public class ByteString implements Serializable, Comparable<ByteString>
{
    public static final ByteString EMPTY;
    public static final char[] HEX_DIGITS;
    private static final long serialVersionUID = 1L;
    public final byte[] data;
    public transient int hashCode;
    public transient String utf8;
    
    static {
        HEX_DIGITS = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        EMPTY = of(new byte[0]);
    }
    
    public ByteString(final byte[] data) {
        this.data = data;
    }
    
    public static int a(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException(b.f("Unexpected hex digit: ", c));
            }
        }
        return c - c2 + 10;
    }
    
    public static int codePointIndexToCharIndex(final String s, final int n) {
        final int length = s.length();
        int i = 0;
        int n2 = 0;
        while (i < length) {
            if (n2 == n) {
                return i;
            }
            final int codePoint = s.codePointAt(i);
            if ((Character.isISOControl(codePoint) && codePoint != 10 && codePoint != 13) || codePoint == 65533) {
                return -1;
            }
            ++n2;
            i += Character.charCount(codePoint);
        }
        return s.length();
    }
    
    public static ByteString decodeBase64(final String s) {
        if (s != null) {
            int i;
            int n;
            for (i = s.length(); i > 0; i = n) {
                n = i - 1;
                final char char1 = s.charAt(n);
                if (char1 != '=' && char1 != '\n' && char1 != '\r' && char1 != ' ' && char1 != '\t') {
                    break;
                }
            }
            final int n2 = (int)(i * 6L / 8L);
            final byte[] array = new byte[n2];
            final int n4;
            final int n3 = n4 = 0;
            int n6;
            int n5 = n6 = n4;
            int n7 = n4;
            int n8 = n3;
            ByteString byteString = null;
            byte[] array2 = null;
            Label_0512: {
                int n16 = 0;
                Label_0415: {
                    while (true) {
                        byteString = null;
                        if (n8 < i) {
                            final char char2 = s.charAt(n8);
                            int n10 = 0;
                            int n11 = 0;
                            int n12 = 0;
                            Label_0382: {
                                int n9;
                                if (char2 >= 'A' && char2 <= 'Z') {
                                    n9 = char2 - 'A';
                                }
                                else if (char2 >= 'a' && char2 <= 'z') {
                                    n9 = char2 - 'G';
                                }
                                else if (char2 >= '0' && char2 <= '9') {
                                    n9 = char2 + '\u0004';
                                }
                                else if (char2 != '+' && char2 != '-') {
                                    if (char2 != '/' && char2 != '_') {
                                        n10 = n7;
                                        n11 = n6;
                                        n12 = n5;
                                        if (char2 == '\n') {
                                            break Label_0382;
                                        }
                                        n10 = n7;
                                        n11 = n6;
                                        n12 = n5;
                                        if (char2 == '\r') {
                                            break Label_0382;
                                        }
                                        n10 = n7;
                                        n11 = n6;
                                        n12 = n5;
                                        if (char2 == ' ') {
                                            break Label_0382;
                                        }
                                        if (char2 == '\t') {
                                            n10 = n7;
                                            n11 = n6;
                                            n12 = n5;
                                            break Label_0382;
                                        }
                                        break;
                                    }
                                    else {
                                        n9 = 63;
                                    }
                                }
                                else {
                                    n9 = 62;
                                }
                                final int n13 = n6 << 6 | (byte)n9;
                                n10 = ++n7;
                                n11 = n13;
                                n12 = n5;
                                if (n7 % 4 == 0) {
                                    final int n14 = n5 + 1;
                                    array[n5] = (byte)(n13 >> 16);
                                    final int n15 = n14 + 1;
                                    array[n14] = (byte)(n13 >> 8);
                                    array[n15] = (byte)n13;
                                    n12 = n15 + 1;
                                    n11 = n13;
                                    n10 = n7;
                                }
                            }
                            ++n8;
                            n7 = n10;
                            n6 = n11;
                            n5 = n12;
                        }
                        else {
                            n16 = n7 % 4;
                            if (n16 == 1) {
                                break;
                            }
                            break Label_0415;
                        }
                    }
                    array2 = null;
                    break Label_0512;
                }
                int n17;
                if (n16 == 2) {
                    array[n5] = (byte)(n6 << 12 >> 16);
                    n17 = n5 + 1;
                }
                else {
                    n17 = n5;
                    if (n16 == 3) {
                        final int n18 = n6 << 6;
                        final int n19 = n5 + 1;
                        array[n5] = (byte)(n18 >> 16);
                        n17 = n19 + 1;
                        array[n19] = (byte)(n18 >> 8);
                    }
                }
                if (n17 == n2) {
                    array2 = array;
                }
                else {
                    array2 = new byte[n17];
                    System.arraycopy(array, 0, array2, 0, n17);
                }
            }
            if (array2 != null) {
                byteString = new ByteString(array2);
            }
            return byteString;
        }
        throw new IllegalArgumentException("base64 == null");
    }
    
    public static ByteString decodeHex(final String s) {
        if (s == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (s.length() % 2 == 0) {
            final int n = s.length() / 2;
            final byte[] array = new byte[n];
            for (int i = 0; i < n; ++i) {
                final int n2 = i * 2;
                array[i] = (byte)(a(s.charAt(n2 + 1)) + (a(s.charAt(n2)) << 4));
            }
            return of(array);
        }
        throw new IllegalArgumentException(al0.b.h("Unexpected hex string: ", s));
    }
    
    public static ByteString encodeString(final String s, final Charset charset) {
        if (s == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new ByteString(s.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }
    
    public static ByteString encodeUtf8(final String utf8) {
        if (utf8 != null) {
            final ByteString byteString = new ByteString(utf8.getBytes(v.a));
            byteString.utf8 = utf8;
            return byteString;
        }
        throw new IllegalArgumentException("s == null");
    }
    
    public static ByteString of(final ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            final byte[] array = new byte[byteBuffer.remaining()];
            byteBuffer.get(array);
            return new ByteString(array);
        }
        throw new IllegalArgumentException("data == null");
    }
    
    public static ByteString of(final byte... array) {
        if (array != null) {
            return new ByteString(array.clone());
        }
        throw new IllegalArgumentException("data == null");
    }
    
    public static ByteString of(final byte[] array, final int n, final int n2) {
        if (array != null) {
            v.b((long)array.length, (long)n, (long)n2);
            final byte[] array2 = new byte[n2];
            System.arraycopy(array, n, array2, 0, n2);
            return new ByteString(array2);
        }
        throw new IllegalArgumentException("data == null");
    }
    
    public static ByteString read(final InputStream inputStream, final int n) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (n >= 0) {
            final byte[] array = new byte[n];
            int read;
            for (int i = 0; i < n; i += read) {
                read = inputStream.read(array, i, n - i);
                if (read == -1) {
                    throw new EOFException();
                }
            }
            return new ByteString(array);
        }
        throw new IllegalArgumentException(d.h("byteCount < 0: ", n));
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException {
        final ByteString read = read(objectInputStream, objectInputStream.readInt());
        try {
            final Field declaredField = ByteString.class.getDeclaredField("data");
            declaredField.setAccessible(true);
            declaredField.set(this, read.data);
        }
        catch (final IllegalAccessException ex) {
            throw new AssertionError();
        }
        catch (final NoSuchFieldException ex2) {
            throw new AssertionError();
        }
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }
    
    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(this.data).asReadOnlyBuffer();
    }
    
    public String base64() {
        return a.z(this.data, a.A);
    }
    
    public String base64Url() {
        return a.z(this.data, a.B);
    }
    
    public final ByteString c(final String s) {
        try {
            return of(MessageDigest.getInstance(s).digest(this.data));
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public int compareTo(final ByteString byteString) {
        final int size = this.size();
        final int size2 = byteString.size();
        final int min = Math.min(size, size2);
        int n = 0;
        while (true) {
            int n2 = -1;
            if (n < min) {
                final int n3 = this.getByte(n) & 0xFF;
                final int n4 = byteString.getByte(n) & 0xFF;
                if (n3 != n4) {
                    if (n3 >= n4) {
                        n2 = 1;
                    }
                    return n2;
                }
                ++n;
            }
            else {
                if (size == size2) {
                    return 0;
                }
                if (size >= size2) {
                    n2 = 1;
                }
                return n2;
            }
        }
    }
    
    public final ByteString d(ByteString of, final String s) {
        try {
            final Mac instance = Mac.getInstance(s);
            instance.init(new SecretKeySpec(of.toByteArray(), s));
            of = of(instance.doFinal(this.data));
            return of;
        }
        catch (final InvalidKeyException ex) {
            throw new IllegalArgumentException(ex);
        }
        catch (final NoSuchAlgorithmException ex2) {
            throw new AssertionError((Object)ex2);
        }
    }
    
    public final boolean endsWith(final ByteString byteString) {
        return this.rangeEquals(this.size() - byteString.size(), byteString, 0, byteString.size());
    }
    
    public final boolean endsWith(final byte[] array) {
        return this.rangeEquals(this.size() - array.length, array, 0, array.length);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof ByteString) {
            final ByteString byteString = (ByteString)o;
            final int size = byteString.size();
            final byte[] data = this.data;
            if (size == data.length && byteString.rangeEquals(0, data, 0, data.length)) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public byte getByte(final int n) {
        return this.data[n];
    }
    
    @Override
    public int hashCode() {
        int hashCode = this.hashCode;
        if (hashCode == 0) {
            hashCode = Arrays.hashCode(this.data);
            this.hashCode = hashCode;
        }
        return hashCode;
    }
    
    public String hex() {
        final byte[] data = this.data;
        final char[] array = new char[data.length * 2];
        final int length = data.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final byte b = data[i];
            final int n2 = n + 1;
            final char[] hex_DIGITS = ByteString.HEX_DIGITS;
            array[n] = hex_DIGITS[b >> 4 & 0xF];
            n = n2 + 1;
            array[n2] = hex_DIGITS[b & 0xF];
            ++i;
        }
        return new String(array);
    }
    
    public ByteString hmacSha1(final ByteString byteString) {
        return this.d(byteString, "HmacSHA1");
    }
    
    public ByteString hmacSha256(final ByteString byteString) {
        return this.d(byteString, "HmacSHA256");
    }
    
    public ByteString hmacSha512(final ByteString byteString) {
        return this.d(byteString, "HmacSHA512");
    }
    
    public final int indexOf(final ByteString byteString) {
        return this.indexOf(byteString.internalArray(), 0);
    }
    
    public final int indexOf(final ByteString byteString, final int n) {
        return this.indexOf(byteString.internalArray(), n);
    }
    
    public final int indexOf(final byte[] array) {
        return this.indexOf(array, 0);
    }
    
    public int indexOf(final byte[] array, int i) {
        for (i = Math.max(i, 0); i <= this.data.length - array.length; ++i) {
            if (v.a(this.data, i, 0, array.length, array)) {
                return i;
            }
        }
        return -1;
    }
    
    public byte[] internalArray() {
        return this.data;
    }
    
    public final int lastIndexOf(final ByteString byteString) {
        return this.lastIndexOf(byteString.internalArray(), this.size());
    }
    
    public final int lastIndexOf(final ByteString byteString, final int n) {
        return this.lastIndexOf(byteString.internalArray(), n);
    }
    
    public final int lastIndexOf(final byte[] array) {
        return this.lastIndexOf(array, this.size());
    }
    
    public int lastIndexOf(final byte[] array, int i) {
        for (i = Math.min(i, this.data.length - array.length); i >= 0; --i) {
            if (v.a(this.data, i, 0, array.length, array)) {
                return i;
            }
        }
        return -1;
    }
    
    public ByteString md5() {
        return this.c("MD5");
    }
    
    public boolean rangeEquals(final int n, final ByteString byteString, final int n2, final int n3) {
        return byteString.rangeEquals(n2, this.data, n, n3);
    }
    
    public boolean rangeEquals(final int n, final byte[] array, final int n2, final int n3) {
        if (n >= 0) {
            final byte[] data = this.data;
            if (n <= data.length - n3 && n2 >= 0 && n2 <= array.length - n3 && v.a(data, n, n2, n3, array)) {
                return true;
            }
        }
        return false;
    }
    
    public ByteString sha1() {
        return this.c("SHA-1");
    }
    
    public ByteString sha256() {
        return this.c("SHA-256");
    }
    
    public ByteString sha512() {
        return this.c("SHA-512");
    }
    
    public int size() {
        return this.data.length;
    }
    
    public final boolean startsWith(final ByteString byteString) {
        return this.rangeEquals(0, byteString, 0, byteString.size());
    }
    
    public final boolean startsWith(final byte[] array) {
        return this.rangeEquals(0, array, 0, array.length);
    }
    
    public String string(final Charset charset) {
        if (charset != null) {
            return new String(this.data, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }
    
    public ByteString substring(final int n) {
        return this.substring(n, this.data.length);
    }
    
    public ByteString substring(final int n, final int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        final byte[] data = this.data;
        if (n2 > data.length) {
            throw new IllegalArgumentException(al0.a.l(a.r("endIndex > length("), this.data.length, ")"));
        }
        final int n3 = n2 - n;
        if (n3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (n == 0 && n2 == data.length) {
            return this;
        }
        final byte[] array = new byte[n3];
        System.arraycopy(data, n, array, 0, n3);
        return new ByteString(array);
    }
    
    public ByteString toAsciiLowercase() {
        int n = 0;
        while (true) {
            final byte[] data = this.data;
            if (n >= data.length) {
                return this;
            }
            final byte b = data[n];
            if (b >= 65 && b <= 90) {
                final byte[] array = data.clone();
                final int n2 = n + 1;
                array[n] = (byte)(b + 32);
                for (int i = n2; i < array.length; ++i) {
                    final byte b2 = array[i];
                    if (b2 >= 65) {
                        if (b2 <= 90) {
                            array[i] = (byte)(b2 + 32);
                        }
                    }
                }
                return new ByteString(array);
            }
            ++n;
        }
    }
    
    public ByteString toAsciiUppercase() {
        int n = 0;
        while (true) {
            final byte[] data = this.data;
            if (n >= data.length) {
                return this;
            }
            final byte b = data[n];
            if (b >= 97 && b <= 122) {
                final byte[] array = data.clone();
                final int n2 = n + 1;
                array[n] = (byte)(b - 32);
                for (int i = n2; i < array.length; ++i) {
                    final byte b2 = array[i];
                    if (b2 >= 97) {
                        if (b2 <= 122) {
                            array[i] = (byte)(b2 - 32);
                        }
                    }
                }
                return new ByteString(array);
            }
            ++n;
        }
    }
    
    public byte[] toByteArray() {
        return this.data.clone();
    }
    
    @Override
    public String toString() {
        if (this.data.length == 0) {
            return "[size=0]";
        }
        final String utf8 = this.utf8();
        final int codePointIndexToCharIndex = codePointIndexToCharIndex(utf8, 64);
        if (codePointIndexToCharIndex == -1) {
            String s;
            if (this.data.length <= 64) {
                final StringBuilder r = a.r("[hex=");
                r.append(this.hex());
                r.append("]");
                s = r.toString();
            }
            else {
                final StringBuilder r2 = a.r("[size=");
                r2.append(this.data.length);
                r2.append(" hex=");
                r2.append(this.substring(0, 64).hex());
                r2.append("\u2026]");
                s = r2.toString();
            }
            return s;
        }
        final String replace = utf8.substring(0, codePointIndexToCharIndex).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        String s2;
        if (codePointIndexToCharIndex < utf8.length()) {
            final StringBuilder r3 = a.r("[size=");
            r3.append(this.data.length);
            r3.append(" text=");
            r3.append(replace);
            r3.append("\u2026]");
            s2 = r3.toString();
        }
        else {
            s2 = a.k("[text=", replace, "]");
        }
        return s2;
    }
    
    public String utf8() {
        String utf8 = this.utf8;
        if (utf8 == null) {
            utf8 = new String(this.data, v.a);
            this.utf8 = utf8;
        }
        return utf8;
    }
    
    public void write(final com.sendbird.android.shadow.okio.a a) {
        final byte[] data = this.data;
        a.y(0, data.length, data);
    }
    
    public void write(final OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.data);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }
}
