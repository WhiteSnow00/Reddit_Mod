// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import javax.crypto.AEADBadTagException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.GeneralSecurityException;

public abstract class g4
{
    public final e4 a;
    public final e4 b;
    
    public g4(final byte[] array) throws GeneralSecurityException {
        if (w9.c(1)) {
            this.a = this.a(1, array);
            this.b = this.a(0, array);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }
    
    public abstract e4 a(final int p0, final byte[] p1) throws InvalidKeyException;
    
    public final byte[] b(final ByteBuffer byteBuffer, final byte[] array, final byte[] array2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 16) {
            final int position = byteBuffer.position();
            final byte[] array3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(array3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            try {
                final e4 b = this.b;
                final int n = 0;
                final ByteBuffer c = b.c(0, array);
                final byte[] array4 = new byte[32];
                c.get(array4);
                final int remaining = byteBuffer.remaining();
                final int n2 = remaining % 16;
                int n3;
                if (n2 == 0) {
                    n3 = remaining;
                }
                else {
                    n3 = remaining + 16 - n2;
                }
                final ByteBuffer order = ByteBuffer.allocate(n3 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(array2);
                order.position(0);
                order.put(byteBuffer);
                order.position(n3);
                order.putLong(0L);
                order.putLong(remaining);
                if (!n9.f(k0.a(array4, order.array()), array3)) {
                    throw new GeneralSecurityException("invalid MAC");
                }
                byteBuffer.position(position);
                final e4 a = this.a;
                a.getClass();
                final ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                if (array.length == a.a()) {
                    final int remaining2 = byteBuffer.remaining();
                    for (int n4 = remaining2 / 64 + 1, i = n; i < n4; ++i) {
                        final ByteBuffer c2 = a.c(a.b + i, array);
                        if (i == n4 - 1) {
                            n9.d(allocate, byteBuffer, c2, remaining2 % 64);
                        }
                        else {
                            n9.d(allocate, byteBuffer, c2, 64);
                        }
                    }
                    return allocate.array();
                }
                final StringBuilder k = a.k("The nonce length (in bytes) must be ");
                k.append(a.a());
                throw new GeneralSecurityException(k.toString());
            }
            catch (final GeneralSecurityException ex) {
                throw new AEADBadTagException(ex.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
