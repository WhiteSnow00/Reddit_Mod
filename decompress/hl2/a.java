// 
// Decompiled by Procyon v0.6.0
// 

package hl2;

import jl2.e;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import rm2.h;
import dl2.b;

public final class a
{
    public byte[] a;
    public byte[] b;
    public int c;
    public il2.a d;
    public byte[] e;
    
    public a(final b b) {
        final il2.a d = new il2.a(b);
        this.d = d;
        this.e = new byte[d.b];
    }
    
    public static byte[] a(final char[] array) {
        if (array != null) {
            final int a = h.a;
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                h.d(array, byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            catch (final IOException ex) {
                throw new IllegalStateException("cannot encode string to byte array!");
            }
        }
        return new byte[0];
    }
    
    public final e b(int n) {
        final int n2 = n / 8;
        final int b = this.d.b;
        final int n3 = (n2 + b - 1) / b;
        final byte[] array = new byte[4];
        final byte[] array2 = new byte[n3 * b];
        final byte[] a = this.a;
        this.d.b(new e(a, a.length));
        int i = 1;
        n = 0;
        while (i <= n3) {
            int n4 = 3;
            while (true) {
                final byte b2 = (byte)(array[n4] + 1);
                array[n4] = b2;
                if (b2 != 0) {
                    break;
                }
                --n4;
            }
            final byte[] b3 = this.b;
            final int c = this.c;
            if (c == 0) {
                throw new IllegalArgumentException("iteration count must be at least 1.");
            }
            if (b3 != null) {
                this.d.c(b3.length, b3);
            }
            this.d.c(4, array);
            this.d.a(this.e);
            final byte[] e = this.e;
            System.arraycopy(e, 0, array2, n, e.length);
            for (int j = 1; j < c; ++j) {
                final il2.a d = this.d;
                final byte[] e2 = this.e;
                d.c(e2.length, e2);
                this.d.a(this.e);
                int n5 = 0;
                while (true) {
                    final byte[] e3 = this.e;
                    if (n5 == e3.length) {
                        break;
                    }
                    final int n6 = n + n5;
                    array2[n6] ^= e3[n5];
                    ++n5;
                }
            }
            n += b;
            ++i;
        }
        return new e(array2, n2);
    }
}
