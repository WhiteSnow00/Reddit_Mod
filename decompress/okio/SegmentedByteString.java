// 
// Decompiled by Procyon v0.6.0
// 

package okio;

import fk2.c0;
import fk2.c;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.security.MessageDigest;
import dg2.j;
import zg.a;
import fk2.k0;
import java.nio.ByteBuffer;
import ng2.e;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020!0@\u0012\u0006\u0010K\u001a\u00020F¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0001H\u0016J\b\u0010\u000b\u001a\u00020\u0001H\u0016J\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0018\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u0010\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0016J'\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0010¢\u0006\u0004\b-\u0010.J(\u00102\u001a\u0002012\u0006\u0010+\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0016J(\u00102\u001a\u0002012\u0006\u0010+\u001a\u00020\u00152\u0006\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0016J(\u00105\u001a\u00020'2\u0006\u0010+\u001a\u00020\u00152\u0006\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0016J\u0018\u00107\u001a\u00020\u00152\u0006\u0010/\u001a\u00020!2\u0006\u00106\u001a\u00020\u0015H\u0016J\u0018\u00108\u001a\u00020\u00152\u0006\u0010/\u001a\u00020!2\u0006\u00106\u001a\u00020\u0015H\u0016J\u000f\u0010;\u001a\u00020!H\u0010¢\u0006\u0004\b9\u0010:J\u0013\u0010=\u001a\u0002012\b\u0010/\u001a\u0004\u0018\u00010<H\u0096\u0002J\b\u0010>\u001a\u00020\u0015H\u0016J\b\u0010?\u001a\u00020\u0006H\u0016R \u0010E\u001a\b\u0012\u0004\u0012\u00020!0@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010K\u001a\u00020F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006N" }, d2 = { "Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "Ljava/nio/charset/Charset;", "charset", "", "string", "base64", "hex", "toAsciiLowercase", "toAsciiUppercase", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "", "beginIndex", "endIndex", "substring", "pos", "", "internalGet$okio", "(I)B", "internalGet", "getSize$okio", "()I", "getSize", "", "toByteArray", "Ljava/nio/ByteBuffer;", "asByteBuffer", "Ljava/io/OutputStream;", "out", "Lcg2/j;", "write", "Lfk2/c;", "buffer", "offset", "byteCount", "write$okio", "(Lfk2/c;II)V", "other", "otherOffset", "", "rangeEquals", "target", "targetOffset", "copyInto", "fromIndex", "indexOf", "lastIndexOf", "internalArray$okio", "()[B", "internalArray", "", "equals", "hashCode", "toString", "", "h", "[[B", "getSegments$okio", "()[[B", "segments", "", "i", "[I", "getDirectory$okio", "()[I", "directory", "<init>", "([[B[I)V", "okio" }, k = 1, mv = { 1, 5, 1 })
public final class SegmentedByteString extends ByteString
{
    public final transient byte[][] h;
    public final transient int[] i;
    
    public SegmentedByteString(final byte[][] h, final int[] i) {
        e.f((Object)h, "segments");
        e.f((Object)i, "directory");
        super(ByteString.EMPTY.getData$okio());
        this.h = h;
        this.i = i;
    }
    
    private final Object writeReplace() {
        return this.a();
    }
    
    public final ByteString a() {
        return new ByteString(this.toByteArray());
    }
    
    public ByteBuffer asByteBuffer() {
        final ByteBuffer readOnlyBuffer = ByteBuffer.wrap(this.toByteArray()).asReadOnlyBuffer();
        e.e((Object)readOnlyBuffer, "wrap(toByteArray()).asReadOnlyBuffer()");
        return readOnlyBuffer;
    }
    
    public String base64() {
        return this.a().base64();
    }
    
    public String base64Url() {
        return this.a().base64Url();
    }
    
    public void copyInto(int i, final byte[] array, int n, int i2) {
        e.f((Object)array, "target");
        final long n2 = this.size();
        final long n3 = i;
        final long n4 = i2;
        k0.b(n2, n3, n4);
        k0.b(array.length, n, n4);
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        for (n5 = i2 + i, i2 = a.i0(this, i); i < n5; i += n9, ++i2) {
            if (i2 == 0) {
                n6 = 0;
            }
            else {
                n6 = this.getDirectory$okio()[i2 - 1];
            }
            n7 = this.getDirectory$okio()[i2];
            n8 = this.getDirectory$okio()[this.getSegments$okio().length + i2];
            n9 = Math.min(n5, n7 - n6 + n6) - i;
            n10 = i - n6 + n8;
            j.M1(this.getSegments$okio()[i2], n, n10, n10 + n9, array);
            n += n9;
        }
    }
    
    public ByteString digest$okio(final String s) {
        e.f((Object)s, "algorithm");
        final MessageDigest instance = MessageDigest.getInstance(s);
        final int length = this.getSegments$okio().length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int n2 = this.getDirectory$okio()[length + i];
            final int n3 = this.getDirectory$okio()[i];
            instance.update(this.getSegments$okio()[i], n2, n3 - n);
            ++i;
            n = n3;
        }
        final byte[] digest = instance.digest();
        e.e((Object)digest, "digestBytes");
        return new ByteString(digest);
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof ByteString) {
                final ByteString byteString = (ByteString)o;
                if (byteString.size() == this.size() && this.rangeEquals(0, byteString, 0, this.size())) {
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public final int[] getDirectory$okio() {
        return this.i;
    }
    
    public final byte[][] getSegments$okio() {
        return this.h;
    }
    
    public int getSize$okio() {
        return this.getDirectory$okio()[this.getSegments$okio().length - 1];
    }
    
    public int hashCode() {
        int hashCode$okio = this.getHashCode$okio();
        if (hashCode$okio == 0) {
            final int length = this.getSegments$okio().length;
            int i = 0;
            hashCode$okio = 1;
            int n = 0;
            while (i < length) {
                final int n2 = this.getDirectory$okio()[length + i];
                final int n3 = this.getDirectory$okio()[i];
                final byte[] array = this.getSegments$okio()[i];
                for (int j = n2; j < n3 - n + n2; ++j) {
                    hashCode$okio = hashCode$okio * 31 + array[j];
                }
                ++i;
                n = n3;
            }
            this.setHashCode$okio(hashCode$okio);
        }
        return hashCode$okio;
    }
    
    public String hex() {
        return this.a().hex();
    }
    
    public ByteString hmac$okio(final String s, final ByteString byteString) {
        e.f((Object)s, "algorithm");
        e.f((Object)byteString, "key");
        try {
            final Mac instance = Mac.getInstance(s);
            instance.init(new SecretKeySpec(byteString.toByteArray(), s));
            final int length = this.getSegments$okio().length;
            int i = 0;
            int n = 0;
            while (i < length) {
                final int n2 = this.getDirectory$okio()[length + i];
                final int n3 = this.getDirectory$okio()[i];
                instance.update(this.getSegments$okio()[i], n2, n3 - n);
                ++i;
                n = n3;
            }
            final byte[] doFinal = instance.doFinal();
            e.e((Object)doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        }
        catch (final InvalidKeyException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
    
    public int indexOf(final byte[] array, final int n) {
        e.f((Object)array, "other");
        return this.a().indexOf(array, n);
    }
    
    public byte[] internalArray$okio() {
        return this.toByteArray();
    }
    
    public byte internalGet$okio(final int n) {
        k0.b(this.getDirectory$okio()[this.getSegments$okio().length - 1], n, 1L);
        final int i0 = a.i0(this, n);
        int n2;
        if (i0 == 0) {
            n2 = 0;
        }
        else {
            n2 = this.getDirectory$okio()[i0 - 1];
        }
        return this.getSegments$okio()[i0][n - n2 + this.getDirectory$okio()[this.getSegments$okio().length + i0]];
    }
    
    public int lastIndexOf(final byte[] array, final int n) {
        e.f((Object)array, "other");
        return this.a().lastIndexOf(array, n);
    }
    
    public boolean rangeEquals(int i, final ByteString byteString, int n, int i2) {
        e.f((Object)byteString, "other");
        boolean b2;
        final boolean b = b2 = false;
        if (i >= 0) {
            if (i > this.size() - i2) {
                b2 = b;
            }
            else {
                int n2;
                int n3;
                int n4;
                int n5;
                int n6;
                for (n2 = i2 + i, i2 = a.i0(this, i); i < n2; i += n6, ++i2) {
                    if (i2 == 0) {
                        n3 = 0;
                    }
                    else {
                        n3 = this.getDirectory$okio()[i2 - 1];
                    }
                    n4 = this.getDirectory$okio()[i2];
                    n5 = this.getDirectory$okio()[this.getSegments$okio().length + i2];
                    n6 = Math.min(n2, n4 - n3 + n3) - i;
                    if (!byteString.rangeEquals(n, this.getSegments$okio()[i2], i - n3 + n5, n6)) {
                        b2 = b;
                        return b2;
                    }
                    n += n6;
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    public boolean rangeEquals(int i, final byte[] array, int n, int n2) {
        e.f((Object)array, "other");
        boolean b2;
        final boolean b = b2 = false;
        if (i >= 0) {
            b2 = b;
            if (i <= this.size() - n2) {
                b2 = b;
                if (n >= 0) {
                    if (n > array.length - n2) {
                        b2 = b;
                    }
                    else {
                        final int n3 = n2 + i;
                        final int i2 = a.i0(this, i);
                        n2 = n;
                        int n4;
                        int n5;
                        int n6;
                        int n7;
                        for (n = i2; i < n3; i += n7, ++n) {
                            if (n == 0) {
                                n4 = 0;
                            }
                            else {
                                n4 = this.getDirectory$okio()[n - 1];
                            }
                            n5 = this.getDirectory$okio()[n];
                            n6 = this.getDirectory$okio()[this.getSegments$okio().length + n];
                            n7 = Math.min(n3, n5 - n4 + n4) - i;
                            if (!k0.a(this.getSegments$okio()[n], i - n4 + n6, n2, n7, array)) {
                                b2 = b;
                                return b2;
                            }
                            n2 += n7;
                        }
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public String string(final Charset charset) {
        e.f((Object)charset, "charset");
        return this.a().string(charset);
    }
    
    public ByteString substring(final int n, int n2) {
        final int c = k0.c(this, n2);
        final int n3 = 0;
        if (n >= 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            throw new IllegalArgumentException(aq2.a.l("beginIndex=", n, " < 0").toString());
        }
        if (c <= this.size()) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            final StringBuilder o = android.support.v4.media.a.o("endIndex=", c, " > length(");
            o.append(this.size());
            o.append(')');
            throw new IllegalArgumentException(o.toString().toString());
        }
        final int n4 = c - n;
        if (n4 >= 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            ByteString empty;
            if (n == 0 && c == this.size()) {
                empty = this;
            }
            else if (n == c) {
                empty = ByteString.EMPTY;
            }
            else {
                final int i0 = a.i0(this, n);
                final int i2 = a.i0(this, c - 1);
                final byte[][] array = (byte[][])j.U1(i0, i2 + 1, (Object[])this.getSegments$okio());
                final int[] array2 = new int[array.length * 2];
                if (i0 <= i2) {
                    n2 = 0;
                    int n5 = i0;
                    while (true) {
                        array2[n2] = Math.min(this.getDirectory$okio()[n5] - n, n4);
                        array2[n2 + array.length] = this.getDirectory$okio()[this.getSegments$okio().length + n5];
                        if (n5 == i2) {
                            break;
                        }
                        ++n5;
                        ++n2;
                    }
                }
                if (i0 == 0) {
                    n2 = n3;
                }
                else {
                    n2 = this.getDirectory$okio()[i0 - 1];
                }
                final int length = array.length;
                array2[length] += n - n2;
                empty = new SegmentedByteString(array, array2);
            }
            return empty;
        }
        throw new IllegalArgumentException(b.i("endIndex=", c, " < beginIndex=", n).toString());
    }
    
    public ByteString toAsciiLowercase() {
        return this.a().toAsciiLowercase();
    }
    
    public ByteString toAsciiUppercase() {
        return this.a().toAsciiUppercase();
    }
    
    public byte[] toByteArray() {
        final byte[] array = new byte[this.size()];
        final int length = this.getSegments$okio().length;
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < length) {
            final int n3 = this.getDirectory$okio()[length + i];
            final int n4 = this.getDirectory$okio()[i];
            final byte[] array2 = this.getSegments$okio()[i];
            final int n5 = n4 - n;
            j.M1(array2, n2, n3, n3 + n5, array);
            n2 += n5;
            ++i;
            n = n4;
        }
        return array;
    }
    
    public String toString() {
        return this.a().toString();
    }
    
    public void write(final OutputStream outputStream) throws IOException {
        e.f((Object)outputStream, "out");
        final int length = this.getSegments$okio().length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int n2 = this.getDirectory$okio()[length + i];
            final int n3 = this.getDirectory$okio()[i];
            outputStream.write(this.getSegments$okio()[i], n2, n3 - n);
            ++i;
            n = n3;
        }
    }
    
    public void write$okio(final c c, int i, final int n) {
        e.f((Object)c, "buffer");
        int n6;
        for (int n2 = i + n, i2 = a.i0(this, i); i < n2; i += n6, ++i2) {
            int n3;
            if (i2 == 0) {
                n3 = 0;
            }
            else {
                n3 = this.getDirectory$okio()[i2 - 1];
            }
            final int n4 = this.getDirectory$okio()[i2];
            final int n5 = this.getDirectory$okio()[this.getSegments$okio().length + i2];
            n6 = Math.min(n2, n4 - n3 + n3) - i;
            final int n7 = i - n3 + n5;
            final c0 f = new c0(this.getSegments$okio()[i2], n7, n7 + n6, true, false);
            final c0 f2 = c.f;
            if (f2 == null) {
                f.g = f;
                f.f = f;
                c.f = f;
            }
            else {
                final c0 g = f2.g;
                e.c((Object)g);
                g.b(f);
            }
        }
        c.g += n;
    }
}
