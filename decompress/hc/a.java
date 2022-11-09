// 
// Decompiled by Procyon v0.6.0
// 

package hc;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import zc.s;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.io.InputStream;
import zc.i;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import com.google.android.exoplayer2.upstream.b;
import javax.crypto.CipherInputStream;

public final class a implements com.google.android.exoplayer2.upstream.a
{
    public final com.google.android.exoplayer2.upstream.a a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;
    
    public a(final com.google.android.exoplayer2.upstream.a a, final byte[] b, final byte[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final long a(b ex) throws IOException {
        try {
            final Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            final SecretKeySpec secretKeySpec = new SecretKeySpec(this.b, "AES");
            final IvParameterSpec ivParameterSpec = new IvParameterSpec(this.c);
            try {
                instance.init(2, secretKeySpec, ivParameterSpec);
                ex = (InvalidAlgorithmParameterException)new i(this.a, (b)ex);
                this.d = new CipherInputStream((InputStream)ex, instance);
                ((i)ex).b();
                return -1L;
            }
            catch (final InvalidAlgorithmParameterException ex) {}
            catch (final InvalidKeyException ex2) {}
            throw new RuntimeException(ex);
        }
        catch (final NoSuchPaddingException ex) {}
        catch (final NoSuchAlgorithmException ex3) {}
        throw new RuntimeException(ex);
    }
    
    public final void close() throws IOException {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }
    
    public final void d(final s s) {
        s.getClass();
        this.a.d(s);
    }
    
    public final Map<String, List<String>> e() {
        return this.a.e();
    }
    
    public final Uri getUri() {
        return this.a.getUri();
    }
    
    public final int read(final byte[] array, int read, int n) throws IOException {
        this.d.getClass();
        n = (read = this.d.read(array, read, n));
        if (n < 0) {
            read = -1;
        }
        return read;
    }
}
