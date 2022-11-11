// 
// Decompiled by Procyon v0.6.0
// 

package okio;

import java.io.EOFException;
import jk2.c;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import lg.e0;
import java.security.MessageDigest;
import jk2.j0;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.InputStream;
import ig2.j;
import java.util.Arrays;
import java.nio.ByteBuffer;
import jk2.k0;
import java.nio.charset.Charset;
import sg2.e;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = {}, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 g2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001hB\u0011\b\u0000\u0012\u0006\u0010W\u001a\u00020+¢\u0006\u0004\be\u0010fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0016J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0016J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0000H\u0016J\b\u0010\u001b\u001a\u00020\u0000H\u0016J\u001c\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001cH\u0017J\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001cH\u0010¢\u0006\u0004\b\"\u0010#J\u0018\u0010'\u001a\u00020!2\u0006\u0010%\u001a\u00020\u001cH\u0087\u0002¢\u0006\u0004\b&\u0010#J\u000f\u0010*\u001a\u00020\u001cH\u0010¢\u0006\u0004\b(\u0010)J\b\u0010,\u001a\u00020+H\u0016J\u000f\u0010/\u001a\u00020+H\u0010¢\u0006\u0004\b-\u0010.J\b\u00101\u001a\u000200H\u0016J\u0010\u00105\u001a\u0002042\u0006\u00103\u001a\u000202H\u0016J'\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0010¢\u0006\u0004\b:\u0010;J(\u0010?\u001a\u00020>2\u0006\u00108\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0016J(\u0010?\u001a\u00020>2\u0006\u00108\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020+2\u0006\u0010=\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0016J,\u0010B\u001a\u0002042\b\b\u0002\u00108\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020+2\b\b\u0002\u0010A\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0016J\u000e\u0010D\u001a\u00020>2\u0006\u0010C\u001a\u00020\u0000J\u000e\u0010D\u001a\u00020>2\u0006\u0010C\u001a\u00020+J\u000e\u0010F\u001a\u00020>2\u0006\u0010E\u001a\u00020\u0000J\u000e\u0010F\u001a\u00020>2\u0006\u0010E\u001a\u00020+J\u001a\u0010H\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u00002\b\b\u0002\u0010G\u001a\u00020\u001cH\u0007J\u001a\u0010H\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020+2\b\b\u0002\u0010G\u001a\u00020\u001cH\u0017J\u001a\u0010I\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u00002\b\b\u0002\u0010G\u001a\u00020\u001cH\u0007J\u001a\u0010I\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020+2\b\b\u0002\u0010G\u001a\u00020\u001cH\u0017J\u0013\u0010K\u001a\u00020>2\b\u0010<\u001a\u0004\u0018\u00010JH\u0096\u0002J\b\u0010L\u001a\u00020\u001cH\u0016J\u0011\u0010M\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u0000H\u0096\u0002J\b\u0010N\u001a\u00020\u0003H\u0016J\u0017\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020\u001cH\u0007¢\u0006\u0004\bO\u0010#J\u000f\u0010Q\u001a\u00020\u001cH\u0007¢\u0006\u0004\bP\u0010)J\u0010\u0010T\u001a\u0002042\u0006\u0010S\u001a\u00020RH\u0002J\u0010\u0010V\u001a\u0002042\u0006\u00103\u001a\u00020UH\u0002R\u001a\u0010W\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010.R\"\u0010L\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010)\"\u0004\b]\u0010^R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0011\u0010Q\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\bQ\u0010)¨\u0006i" }, d2 = { "Lokio/ByteString;", "Ljava/io/Serializable;", "", "", "utf8", "Ljava/nio/charset/Charset;", "charset", "string", "base64", "md5", "sha1", "sha256", "sha512", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmacSha1", "hmacSha256", "hmacSha512", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "hex", "toAsciiLowercase", "toAsciiUppercase", "", "beginIndex", "endIndex", "substring", "pos", "", "internalGet$okio", "(I)B", "internalGet", "index", "getByte", "get", "getSize$okio", "()I", "getSize", "", "toByteArray", "internalArray$okio", "()[B", "internalArray", "Ljava/nio/ByteBuffer;", "asByteBuffer", "Ljava/io/OutputStream;", "out", "Lhg2/j;", "write", "Ljk2/c;", "buffer", "offset", "byteCount", "write$okio", "(Ljk2/c;II)V", "other", "otherOffset", "", "rangeEquals", "target", "targetOffset", "copyInto", "prefix", "startsWith", "suffix", "endsWith", "fromIndex", "indexOf", "lastIndexOf", "", "equals", "hashCode", "compareTo", "toString", "-deprecated_getByte", "-deprecated_size", "size", "Ljava/io/ObjectInputStream;", "in", "readObject", "Ljava/io/ObjectOutputStream;", "writeObject", "data", "[B", "getData$okio", "f", "I", "getHashCode$okio", "setHashCode$okio", "(I)V", "g", "Ljava/lang/String;", "getUtf8$okio", "()Ljava/lang/String;", "setUtf8$okio", "(Ljava/lang/String;)V", "<init>", "([B)V", "Companion", "a", "okio" }, k = 1, mv = { 1, 5, 1 })
public class ByteString implements Serializable, Comparable<ByteString>
{
    public static final a Companion;
    public static final ByteString EMPTY;
    private static final long serialVersionUID = 1L;
    private final byte[] data;
    public transient int f;
    public transient String g;
    
    static {
        Companion = new a();
        EMPTY = new ByteString(new byte[0]);
    }
    
    public ByteString(final byte[] data) {
        e.f((Object)data, "data");
        this.data = data;
    }
    
    public static final ByteString decodeBase64(final String s) {
        ByteString.Companion.getClass();
        return a.a(s);
    }
    
    public static final ByteString decodeHex(final String s) {
        ByteString.Companion.getClass();
        return a.b(s);
    }
    
    public static final ByteString encodeString(final String s, final Charset charset) {
        ByteString.Companion.getClass();
        e.f((Object)s, "<this>");
        e.f((Object)charset, "charset");
        final byte[] bytes = s.getBytes(charset);
        e.e((Object)bytes, "(this as java.lang.String).getBytes(charset)");
        return new ByteString(bytes);
    }
    
    public static final ByteString encodeUtf8(final String s) {
        ByteString.Companion.getClass();
        return a.c(s);
    }
    
    public static /* synthetic */ int indexOf$default(final ByteString byteString, final ByteString byteString2, int n, final int n2, final Object o) {
        if (o == null) {
            if ((n2 & 0x2) != 0x0) {
                n = 0;
            }
            return byteString.indexOf(byteString2, n);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }
    
    public static /* synthetic */ int indexOf$default(final ByteString byteString, final byte[] array, int n, final int n2, final Object o) {
        if (o == null) {
            if ((n2 & 0x2) != 0x0) {
                n = 0;
            }
            return byteString.indexOf(array, n);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }
    
    public static int lastIndexOf$default(final ByteString byteString, final ByteString byteString2, int b, final int n, final Object o) {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                b = k0.b;
            }
            return byteString.lastIndexOf(byteString2, b);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }
    
    public static int lastIndexOf$default(final ByteString byteString, final byte[] array, int b, final int n, final Object o) {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                b = k0.b;
            }
            return byteString.lastIndexOf(array, b);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }
    
    public static final ByteString of(final ByteBuffer byteBuffer) {
        ByteString.Companion.getClass();
        e.f((Object)byteBuffer, "<this>");
        final byte[] array = new byte[byteBuffer.remaining()];
        byteBuffer.get(array);
        return new ByteString(array);
    }
    
    public static final ByteString of(byte... copy) {
        ByteString.Companion.getClass();
        e.f((Object)copy, "data");
        copy = Arrays.copyOf(copy, copy.length);
        e.e((Object)copy, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copy);
    }
    
    public static final ByteString of(final byte[] array, final int n, final int n2) {
        ByteString.Companion.getClass();
        e.f((Object)array, "<this>");
        k0.b((long)array.length, (long)n, (long)n2);
        return new ByteString(j.J0(n, n2 + n, array));
    }
    
    public static final ByteString read(final InputStream inputStream, final int n) throws IOException {
        ByteString.Companion.getClass();
        return a.e(inputStream, n);
    }
    
    private final void readObject(final ObjectInputStream objectInputStream) throws IOException {
        final int int1 = objectInputStream.readInt();
        ByteString.Companion.getClass();
        final ByteString e = a.e(objectInputStream, int1);
        final Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, e.data);
    }
    
    public static ByteString substring$default(final ByteString byteString, int n, int b, final int n2, final Object o) {
        if (o == null) {
            if ((n2 & 0x1) != 0x0) {
                n = 0;
            }
            if ((n2 & 0x2) != 0x0) {
                b = k0.b;
            }
            return byteString.substring(n, b);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }
    
    private final void writeObject(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }
    
    public final byte -deprecated_getByte(final int n) {
        return this.getByte(n);
    }
    
    public final int -deprecated_size() {
        return this.size();
    }
    
    public ByteBuffer asByteBuffer() {
        final ByteBuffer readOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        e.e((Object)readOnlyBuffer, "wrap(data).asReadOnlyBuffer()");
        return readOnlyBuffer;
    }
    
    public String base64() {
        return j0.a(this.getData$okio(), j0.a);
    }
    
    public String base64Url() {
        return j0.a(this.getData$okio(), j0.b);
    }
    
    @Override
    public int compareTo(final ByteString byteString) {
        e.f((Object)byteString, "other");
        final int size = this.size();
        final int size2 = byteString.size();
        final int min = Math.min(size, size2);
        final int n = 0;
        while (true) {
            while (true) {
                for (int i = 0; i < min; ++i) {
                    final int n2 = this.getByte(i) & 0xFF;
                    final int n3 = byteString.getByte(i) & 0xFF;
                    if (n2 != n3) {
                        int n4;
                        if (n2 < n3) {
                            n4 = -1;
                        }
                        else {
                            n4 = 1;
                        }
                        return n4;
                    }
                }
                if (size == size2) {
                    return n;
                }
                if (size < size2) {
                    continue;
                }
                break;
            }
            continue;
        }
    }
    
    public void copyInto(final int n, final byte[] array, final int n2, final int n3) {
        e.f((Object)array, "target");
        j.D0(this.getData$okio(), n2, n, n3 + n, array);
    }
    
    public ByteString digest$okio(final String s) {
        e.f((Object)s, "algorithm");
        final MessageDigest instance = MessageDigest.getInstance(s);
        instance.update(this.getData$okio(), 0, this.size());
        final byte[] digest = instance.digest();
        e.e((Object)digest, "digestBytes");
        return new ByteString(digest);
    }
    
    public final boolean endsWith(final ByteString byteString) {
        e.f((Object)byteString, "suffix");
        return this.rangeEquals(this.size() - byteString.size(), byteString, 0, byteString.size());
    }
    
    public final boolean endsWith(final byte[] array) {
        e.f((Object)array, "suffix");
        return this.rangeEquals(this.size() - array.length, array, 0, array.length);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof ByteString) {
                final ByteString byteString = (ByteString)o;
                if (byteString.size() == this.getData$okio().length && byteString.rangeEquals(0, this.getData$okio(), 0, this.getData$okio().length)) {
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public final byte getByte(final int n) {
        return this.internalGet$okio(n);
    }
    
    public final byte[] getData$okio() {
        return this.data;
    }
    
    public final int getHashCode$okio() {
        return this.f;
    }
    
    public int getSize$okio() {
        return this.getData$okio().length;
    }
    
    public final String getUtf8$okio() {
        return this.g;
    }
    
    @Override
    public int hashCode() {
        int hashCode$okio = this.getHashCode$okio();
        if (hashCode$okio == 0) {
            hashCode$okio = Arrays.hashCode(this.getData$okio());
            this.setHashCode$okio(hashCode$okio);
        }
        return hashCode$okio;
    }
    
    public String hex() {
        final char[] array = new char[this.getData$okio().length * 2];
        final byte[] data$okio = this.getData$okio();
        byte b;
        int n2;
        char[] d;
        for (int length = data$okio.length, i = 0, n = 0; i < length; ++i, n2 = n + 1, d = e0.D, array[n] = d[b >> 4 & 0xF], n = n2 + 1, array[n2] = d[b & 0xF]) {
            b = data$okio[i];
        }
        return new String(array);
    }
    
    public ByteString hmac$okio(final String s, final ByteString byteString) {
        e.f((Object)s, "algorithm");
        e.f((Object)byteString, "key");
        try {
            final Mac instance = Mac.getInstance(s);
            instance.init(new SecretKeySpec(byteString.toByteArray(), s));
            final byte[] doFinal = instance.doFinal(this.data);
            e.e((Object)doFinal, "mac.doFinal(data)");
            return new ByteString(doFinal);
        }
        catch (final InvalidKeyException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
    
    public ByteString hmacSha1(final ByteString byteString) {
        e.f((Object)byteString, "key");
        return this.hmac$okio("HmacSHA1", byteString);
    }
    
    public ByteString hmacSha256(final ByteString byteString) {
        e.f((Object)byteString, "key");
        return this.hmac$okio("HmacSHA256", byteString);
    }
    
    public ByteString hmacSha512(final ByteString byteString) {
        e.f((Object)byteString, "key");
        return this.hmac$okio("HmacSHA512", byteString);
    }
    
    public final int indexOf(final ByteString byteString) {
        e.f((Object)byteString, "other");
        return indexOf$default(this, byteString, 0, 2, null);
    }
    
    public final int indexOf(final ByteString byteString, final int n) {
        e.f((Object)byteString, "other");
        return this.indexOf(byteString.internalArray$okio(), n);
    }
    
    public final int indexOf(final byte[] array) {
        e.f((Object)array, "other");
        return indexOf$default(this, array, 0, 2, null);
    }
    
    public int indexOf(final byte[] array, int max) {
        e.f((Object)array, "other");
        final int n = this.getData$okio().length - array.length;
        max = Math.max(max, 0);
        if (max <= n) {
            while (!k0.a(this.getData$okio(), max, 0, array.length, array)) {
                if (max == n) {
                    return -1;
                }
                ++max;
            }
            return max;
        }
        max = -1;
        return max;
    }
    
    public byte[] internalArray$okio() {
        return this.getData$okio();
    }
    
    public byte internalGet$okio(final int n) {
        return this.getData$okio()[n];
    }
    
    public final int lastIndexOf(final ByteString byteString) {
        e.f((Object)byteString, "other");
        return lastIndexOf$default(this, byteString, 0, 2, null);
    }
    
    public final int lastIndexOf(final ByteString byteString, final int n) {
        e.f((Object)byteString, "other");
        return this.lastIndexOf(byteString.internalArray$okio(), n);
    }
    
    public final int lastIndexOf(final byte[] array) {
        e.f((Object)array, "other");
        return lastIndexOf$default(this, array, 0, 2, null);
    }
    
    public int lastIndexOf(final byte[] array, int min) {
        e.f((Object)array, "other");
        min = Math.min(k0.c(this, min), this.getData$okio().length - array.length);
        if (min >= 0) {
            while (true) {
                final int n = min - 1;
                if (k0.a(this.getData$okio(), min, 0, array.length, array)) {
                    return min;
                }
                if (n < 0) {
                    break;
                }
                min = n;
            }
        }
        min = -1;
        return min;
    }
    
    public final ByteString md5() {
        return this.digest$okio("MD5");
    }
    
    public boolean rangeEquals(final int n, final ByteString byteString, final int n2, final int n3) {
        e.f((Object)byteString, "other");
        return byteString.rangeEquals(n2, this.getData$okio(), n, n3);
    }
    
    public boolean rangeEquals(final int n, final byte[] array, final int n2, final int n3) {
        e.f((Object)array, "other");
        return n >= 0 && n <= this.getData$okio().length - n3 && n2 >= 0 && n2 <= array.length - n3 && k0.a(this.getData$okio(), n, n2, n3, array);
    }
    
    public final void setHashCode$okio(final int f) {
        this.f = f;
    }
    
    public final void setUtf8$okio(final String g) {
        this.g = g;
    }
    
    public final ByteString sha1() {
        return this.digest$okio("SHA-1");
    }
    
    public final ByteString sha256() {
        return this.digest$okio("SHA-256");
    }
    
    public final ByteString sha512() {
        return this.digest$okio("SHA-512");
    }
    
    public final int size() {
        return this.getSize$okio();
    }
    
    public final boolean startsWith(final ByteString byteString) {
        e.f((Object)byteString, "prefix");
        return this.rangeEquals(0, byteString, 0, byteString.size());
    }
    
    public final boolean startsWith(final byte[] array) {
        e.f((Object)array, "prefix");
        return this.rangeEquals(0, array, 0, array.length);
    }
    
    public String string(final Charset charset) {
        e.f((Object)charset, "charset");
        return new String(this.data, charset);
    }
    
    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }
    
    public final ByteString substring(final int n) {
        return substring$default(this, n, 0, 2, null);
    }
    
    public ByteString substring(final int n, int n2) {
        final int c = k0.c(this, n2);
        final int n3 = 1;
        if (n >= 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (c <= this.getData$okio().length) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            throw new IllegalArgumentException(d.l(a.r("endIndex > length("), this.getData$okio().length, ')').toString());
        }
        if (c - n >= 0) {
            n2 = n3;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            ByteString byteString;
            if (n == 0 && c == this.getData$okio().length) {
                byteString = this;
            }
            else {
                byteString = new ByteString(j.J0(n, c, this.getData$okio()));
            }
            return byteString;
        }
        throw new IllegalArgumentException("endIndex < beginIndex".toString());
    }
    
    public ByteString toAsciiLowercase() {
        for (int i = 0; i < this.getData$okio().length; ++i) {
            final byte b = this.getData$okio()[i];
            final byte b2 = 65;
            if (b >= b2) {
                final byte b3 = 90;
                if (b <= b3) {
                    final byte[] data$okio = this.getData$okio();
                    final byte[] copy = Arrays.copyOf(data$okio, data$okio.length);
                    e.e((Object)copy, "java.util.Arrays.copyOf(this, size)");
                    final int n = i + 1;
                    copy[i] = (byte)(b + 32);
                    for (int j = n; j < copy.length; ++j) {
                        final byte b4 = copy[j];
                        if (b4 >= b2) {
                            if (b4 <= b3) {
                                copy[j] = (byte)(b4 + 32);
                            }
                        }
                    }
                    return new ByteString(copy);
                }
            }
        }
        return this;
    }
    
    public ByteString toAsciiUppercase() {
        for (int i = 0; i < this.getData$okio().length; ++i) {
            final byte b = this.getData$okio()[i];
            final byte b2 = 97;
            if (b >= b2) {
                final byte b3 = 122;
                if (b <= b3) {
                    final byte[] data$okio = this.getData$okio();
                    final byte[] copy = Arrays.copyOf(data$okio, data$okio.length);
                    e.e((Object)copy, "java.util.Arrays.copyOf(this, size)");
                    final int n = i + 1;
                    copy[i] = (byte)(b - 32);
                    for (int j = n; j < copy.length; ++j) {
                        final byte b4 = copy[j];
                        if (b4 >= b2) {
                            if (b4 <= b3) {
                                copy[j] = (byte)(b4 - 32);
                            }
                        }
                    }
                    return new ByteString(copy);
                }
            }
        }
        return this;
    }
    
    public byte[] toByteArray() {
        final byte[] data$okio = this.getData$okio();
        final byte[] copy = Arrays.copyOf(data$okio, data$okio.length);
        e.e((Object)copy, "java.util.Arrays.copyOf(this, size)");
        return copy;
    }
    
    @Override
    public String toString() {
        String s;
        if (this.getData$okio().length == 0) {
            s = "[size=0]";
        }
        else {
            final byte[] data$okio = this.getData$okio();
            final int length = data$okio.length;
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            Label_1452: {
            Label_1449:
                while (true) {
                    n4 = n3;
                    if (n >= length) {
                        break Label_1452;
                    }
                    final byte b = data$okio[n];
                    if (b >= 0) {
                        final int n5 = n2 + 1;
                        if (n2 == 64) {
                            n4 = n3;
                            break Label_1452;
                        }
                        if (b != 10 && b != 13 && ((b >= 0 && b <= 31) || (127 <= b && b <= 159))) {
                            break;
                        }
                        if (b == 65533) {
                            break;
                        }
                        int n6;
                        if (b < 65536) {
                            n6 = 1;
                        }
                        else {
                            n6 = 2;
                        }
                        final int n7 = n3 + n6;
                        int n8 = n + 1;
                        int n9 = n5;
                        n4 = n7;
                        while (true) {
                            final int n10 = n9;
                            n = n8;
                            n2 = n10;
                            n3 = n4;
                            if (n8 >= length) {
                                break;
                            }
                            final byte b2 = data$okio[n8];
                            n = n8;
                            n2 = n10;
                            n3 = n4;
                            if (b2 < 0) {
                                break;
                            }
                            ++n8;
                            final int n11 = n10 + 1;
                            if (n10 == 64) {
                                break Label_1452;
                            }
                            if (b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 <= 31) || (127 <= b2 && b2 <= 159))) {
                                break Label_1449;
                            }
                            if (b2 == 65533) {
                                break Label_1449;
                            }
                            int n12;
                            if (b2 < 65536) {
                                n12 = 1;
                            }
                            else {
                                n12 = 2;
                            }
                            n4 += n12;
                            n9 = n11;
                        }
                    }
                    else if (b >> 5 == -2) {
                        final int n13 = n + 1;
                        if (length <= n13) {
                            if (n2 == 64) {
                                n4 = n3;
                                break Label_1452;
                            }
                            break;
                        }
                        else {
                            final byte b3 = data$okio[n13];
                            if ((b3 & 0xC0) != 0x80) {
                                if (n2 == 64) {
                                    n4 = n3;
                                    break Label_1452;
                                }
                                break;
                            }
                            else {
                                final int n14 = b << 6 ^ (b3 ^ 0xF80);
                                if (n14 < 128) {
                                    if (n2 == 64) {
                                        n4 = n3;
                                        break Label_1452;
                                    }
                                    break;
                                }
                                else {
                                    if (n2 == 64) {
                                        n4 = n3;
                                        break Label_1452;
                                    }
                                    if (n14 != 10 && n14 != 13 && ((n14 >= 0 && n14 <= 31) || (127 <= n14 && n14 <= 159))) {
                                        break;
                                    }
                                    if (n14 == 65533) {
                                        break;
                                    }
                                    int n15;
                                    if (n14 < 65536) {
                                        n15 = 1;
                                    }
                                    else {
                                        n15 = 2;
                                    }
                                    n3 += n15;
                                    final hg2.j a = hg2.j.a;
                                    n += 2;
                                    ++n2;
                                }
                            }
                        }
                    }
                    else if (b >> 4 == -2) {
                        final int n16 = n + 2;
                        if (length <= n16) {
                            if (n2 == 64) {
                                n4 = n3;
                                break Label_1452;
                            }
                            break;
                        }
                        else {
                            final byte b4 = data$okio[n + 1];
                            if ((b4 & 0xC0) != 0x80) {
                                if (n2 == 64) {
                                    n4 = n3;
                                    break Label_1452;
                                }
                                break;
                            }
                            else {
                                final byte b5 = data$okio[n16];
                                if ((b5 & 0xC0) != 0x80) {
                                    if (n2 == 64) {
                                        n4 = n3;
                                        break Label_1452;
                                    }
                                    break;
                                }
                                else {
                                    final int n17 = b << 12 ^ (b5 ^ 0xFFFE1F80 ^ b4 << 6);
                                    if (n17 < 2048) {
                                        if (n2 == 64) {
                                            n4 = n3;
                                            break Label_1452;
                                        }
                                        break;
                                    }
                                    else if (55296 <= n17 && n17 <= 57343) {
                                        if (n2 == 64) {
                                            n4 = n3;
                                            break Label_1452;
                                        }
                                        break;
                                    }
                                    else {
                                        if (n2 == 64) {
                                            n4 = n3;
                                            break Label_1452;
                                        }
                                        if (n17 != 10 && n17 != 13 && ((n17 >= 0 && n17 <= 31) || (127 <= n17 && n17 <= 159))) {
                                            break;
                                        }
                                        if (n17 == 65533) {
                                            break;
                                        }
                                        int n18;
                                        if (n17 < 65536) {
                                            n18 = 1;
                                        }
                                        else {
                                            n18 = 2;
                                        }
                                        n3 += n18;
                                        final hg2.j a2 = hg2.j.a;
                                        n += 3;
                                        ++n2;
                                    }
                                }
                            }
                        }
                    }
                    else if (b >> 3 == -2) {
                        final int n19 = n + 3;
                        if (length <= n19) {
                            if (n2 == 64) {
                                n4 = n3;
                                break Label_1452;
                            }
                            break;
                        }
                        else {
                            final byte b6 = data$okio[n + 1];
                            if ((b6 & 0xC0) != 0x80) {
                                if (n2 == 64) {
                                    n4 = n3;
                                    break Label_1452;
                                }
                                break;
                            }
                            else {
                                final byte b7 = data$okio[n + 2];
                                if ((b7 & 0xC0) != 0x80) {
                                    if (n2 == 64) {
                                        n4 = n3;
                                        break Label_1452;
                                    }
                                    break;
                                }
                                else {
                                    final byte b8 = data$okio[n19];
                                    if ((b8 & 0xC0) != 0x80) {
                                        if (n2 == 64) {
                                            n4 = n3;
                                            break Label_1452;
                                        }
                                        break;
                                    }
                                    else {
                                        final int n20 = b << 18 ^ (b8 ^ 0x381F80 ^ b7 << 6 ^ b6 << 12);
                                        if (n20 > 1114111) {
                                            if (n2 == 64) {
                                                n4 = n3;
                                                break Label_1452;
                                            }
                                            break;
                                        }
                                        else if (55296 <= n20 && n20 <= 57343) {
                                            if (n2 == 64) {
                                                n4 = n3;
                                                break Label_1452;
                                            }
                                            break;
                                        }
                                        else if (n20 < 65536) {
                                            if (n2 == 64) {
                                                n4 = n3;
                                                break Label_1452;
                                            }
                                            break;
                                        }
                                        else {
                                            if (n2 == 64) {
                                                n4 = n3;
                                                break Label_1452;
                                            }
                                            if (n20 != 10 && n20 != 13 && ((n20 >= 0 && n20 <= 31) || (127 <= n20 && n20 <= 159))) {
                                                break;
                                            }
                                            if (n20 == 65533) {
                                                break;
                                            }
                                            int n21;
                                            if (n20 < 65536) {
                                                n21 = 1;
                                            }
                                            else {
                                                n21 = 2;
                                            }
                                            n3 += n21;
                                            final hg2.j a3 = hg2.j.a;
                                            n += 4;
                                            ++n2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        if (n2 == 64) {
                            n4 = n3;
                            break Label_1452;
                        }
                        break;
                    }
                }
                n4 = -1;
            }
            if (n4 == -1) {
                if (this.getData$okio().length <= 64) {
                    final StringBuilder r = a.r("[hex=");
                    r.append(this.hex());
                    r.append(']');
                    s = r.toString();
                }
                else {
                    final StringBuilder r2 = a.r("[size=");
                    r2.append(this.getData$okio().length);
                    r2.append(" hex=");
                    final int c = k0.c(this, 64);
                    if (c > this.getData$okio().length) {
                        throw new IllegalArgumentException(d.l(a.r("endIndex > length("), this.getData$okio().length, ')').toString());
                    }
                    if (c + 0 < 0) {
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    ByteString byteString;
                    if (c == this.getData$okio().length) {
                        byteString = this;
                    }
                    else {
                        byteString = new ByteString(j.J0(0, c, this.getData$okio()));
                    }
                    r2.append(byteString.hex());
                    r2.append("\u2026]");
                    s = r2.toString();
                }
            }
            else {
                final String utf8 = this.utf8();
                if (utf8 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring = utf8.substring(0, n4);
                e.e((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final String k0 = cj2.j.K0(cj2.j.K0(cj2.j.K0(substring, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
                if (n4 < utf8.length()) {
                    final StringBuilder r3 = a.r("[size=");
                    r3.append(this.getData$okio().length);
                    r3.append(" text=");
                    r3.append(k0);
                    r3.append("\u2026]");
                    s = r3.toString();
                }
                else {
                    s = b.g("[text=", k0, ']');
                }
            }
        }
        return s;
    }
    
    public String utf8() {
        String utf8$okio;
        if ((utf8$okio = this.getUtf8$okio()) == null) {
            final byte[] internalArray$okio = this.internalArray$okio();
            e.f((Object)internalArray$okio, "<this>");
            utf8$okio = new String(internalArray$okio, cj2.a.b);
            this.setUtf8$okio(utf8$okio);
        }
        return utf8$okio;
    }
    
    public void write(final OutputStream outputStream) throws IOException {
        e.f((Object)outputStream, "out");
        outputStream.write(this.data);
    }
    
    public void write$okio(final c c, final int n, final int n2) {
        e.f((Object)c, "buffer");
        c.K(n, n2, this.getData$okio());
    }
    
    public static final class a
    {
        public static ByteString a(final String s) {
            e.f((Object)s, "<this>");
            final byte[] a = j0.a;
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
            ByteString byteString = null;
            byte[] copy = null;
            Label_0580: {
                Label_0578: {
                    int n9 = 0;
                    int n10 = 0;
                    int n11 = 0;
                    if (i > 0) {
                        int n3 = 0;
                        int n4 = 0;
                        int n5 = 0;
                        int n6 = 0;
                        while (true) {
                            final int n7 = n3 + 1;
                            final char char2 = s.charAt(n3);
                            Label_0428: {
                                int n8;
                                if ('A' <= char2 && char2 <= 'Z') {
                                    n8 = char2 - 'A';
                                }
                                else if ('a' <= char2 && char2 <= 'z') {
                                    n8 = char2 - 'G';
                                }
                                else if ('0' <= char2 && char2 <= '9') {
                                    n8 = char2 + '\u0004';
                                }
                                else if (char2 != '+' && char2 != '-') {
                                    if (char2 != '/' && char2 != '_') {
                                        n9 = n4;
                                        n10 = n5;
                                        n11 = n6;
                                        if (char2 == '\n') {
                                            break Label_0428;
                                        }
                                        n9 = n4;
                                        n10 = n5;
                                        n11 = n6;
                                        if (char2 == '\r') {
                                            break Label_0428;
                                        }
                                        n9 = n4;
                                        n10 = n5;
                                        n11 = n6;
                                        if (char2 == ' ') {
                                            break Label_0428;
                                        }
                                        if (char2 == '\t') {
                                            n9 = n4;
                                            n10 = n5;
                                            n11 = n6;
                                            break Label_0428;
                                        }
                                        break Label_0578;
                                    }
                                    else {
                                        n8 = 63;
                                    }
                                }
                                else {
                                    n8 = 62;
                                }
                                final int n12 = n6 << 6 | n8;
                                ++n5;
                                n9 = n4;
                                n10 = n5;
                                n11 = n12;
                                if (n5 % 4 == 0) {
                                    final int n13 = n4 + 1;
                                    array[n4] = (byte)(n12 >> 16);
                                    final int n14 = n13 + 1;
                                    array[n13] = (byte)(n12 >> 8);
                                    n9 = n14 + 1;
                                    array[n14] = (byte)n12;
                                    n11 = n12;
                                    n10 = n5;
                                }
                            }
                            if (n7 >= i) {
                                break;
                            }
                            n3 = n7;
                            n4 = n9;
                            n5 = n10;
                            n6 = n11;
                        }
                    }
                    else {
                        n10 = 0;
                        n9 = 0;
                        n11 = 0;
                    }
                    final int n15 = n10 % 4;
                    if (n15 != 1) {
                        if (n15 != 2) {
                            if (n15 == 3) {
                                final int n16 = n11 << 6;
                                final int n17 = n9 + 1;
                                array[n9] = (byte)(n16 >> 16);
                                n9 = n17 + 1;
                                array[n17] = (byte)(n16 >> 8);
                            }
                        }
                        else {
                            array[n9] = (byte)(n11 << 12 >> 16);
                            ++n9;
                        }
                        if (n9 == n2) {
                            copy = array;
                            break Label_0580;
                        }
                        copy = Arrays.copyOf(array, n9);
                        e.e((Object)copy, "java.util.Arrays.copyOf(this, newSize)");
                        break Label_0580;
                    }
                }
                copy = null;
            }
            if (copy != null) {
                byteString = new ByteString(copy);
            }
            return byteString;
        }
        
        public static ByteString b(final String s) {
            e.f((Object)s, "<this>");
            final int length = s.length();
            final int n = 0;
            if (length % 2 == 0) {
                final int n2 = s.length() / 2;
                final byte[] array = new byte[n2];
                final int n3 = n2 - 1;
                if (n3 >= 0) {
                    int n4 = n;
                    while (true) {
                        final int n5 = n4 + 1;
                        final int n6 = n4 * 2;
                        array[n4] = (byte)(e0.i(s.charAt(n6 + 1)) + (e0.i(s.charAt(n6)) << 4));
                        if (n5 > n3) {
                            break;
                        }
                        n4 = n5;
                    }
                }
                return new ByteString(array);
            }
            throw new IllegalArgumentException(e.l((Object)s, "Unexpected hex string: ").toString());
        }
        
        public static ByteString c(final String utf8$okio) {
            e.f((Object)utf8$okio, "<this>");
            final byte[] bytes = utf8$okio.getBytes(cj2.a.b);
            e.e((Object)bytes, "(this as java.lang.String).getBytes(charset)");
            final ByteString byteString = new ByteString(bytes);
            byteString.setUtf8$okio(utf8$okio);
            return byteString;
        }
        
        public static ByteString d(final a a, final byte[] array) {
            final int length = array.length;
            a.getClass();
            k0.b((long)array.length, (long)0, (long)length);
            return new ByteString(j.J0(0, length + 0, array));
        }
        
        public static ByteString e(final InputStream inputStream, final int n) throws IOException {
            e.f((Object)inputStream, "<this>");
            final int n2 = 0;
            if (n >= 0) {
                final byte[] array = new byte[n];
                int read;
                for (int i = n2; i < n; i += read) {
                    read = inputStream.read(array, i, n - i);
                    if (read == -1) {
                        throw new EOFException();
                    }
                }
                return new ByteString(array);
            }
            throw new IllegalArgumentException(e.l((Object)n, "byteCount < 0: ").toString());
        }
    }
}
