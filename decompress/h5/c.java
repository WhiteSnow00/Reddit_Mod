// 
// Decompiled by Procyon v0.6.0
// 

package h5;

import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;

public final class c
{
    public static byte[] a(final byte[] array) throws IOException {
        final Deflater deflater = new Deflater(1);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            final DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(array);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            }
            finally {
                try {
                    deflaterOutputStream.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)(Object)array).addSuppressed(t);
                }
            }
        }
        finally {
            deflater.end();
        }
    }
    
    public static byte[] b(final InputStream inputStream, final int n) throws IOException {
        final byte[] array = new byte[n];
        int read;
        for (int i = 0; i < n; i += read) {
            read = inputStream.read(array, i, n - i);
            if (read < 0) {
                throw new IllegalStateException(d.h("Not enough bytes to read: ", n));
            }
        }
        return array;
    }
    
    public static byte[] c(final FileInputStream fileInputStream, final int n, final int n2) throws IOException {
        final Inflater inflater = new Inflater();
        try {
            final byte[] array = new byte[n2];
            final byte[] array2 = new byte[2048];
            int n4;
            int n3 = n4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && n3 < n) {
                final int read = fileInputStream.read(array2);
                if (read >= 0) {
                    inflater.setInput(array2, 0, read);
                    try {
                        n4 += inflater.inflate(array, n4, n2 - n4);
                        n3 += read;
                        continue;
                    }
                    catch (final DataFormatException ex) {
                        throw new IllegalStateException(ex.getMessage());
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ");
                sb.append(n);
                sb.append(" bytes");
                throw new IllegalStateException(sb.toString());
            }
            if (n3 != n) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Didn't read enough bytes during decompression. expected=");
                sb2.append(n);
                sb2.append(" actual=");
                sb2.append(n3);
                throw new IllegalStateException(sb2.toString());
            }
            if (inflater.finished()) {
                return array;
            }
            throw new IllegalStateException("Inflater did not finish");
        }
        finally {
            inflater.end();
        }
    }
    
    public static long d(final InputStream inputStream, final int n) throws IOException {
        final byte[] b = b(inputStream, n);
        long n2 = 0L;
        for (int i = 0; i < n; ++i) {
            n2 += (long)(b[i] & 0xFF) << i * 8;
        }
        return n2;
    }
    
    public static int e(final InputStream inputStream) throws IOException {
        return (int)d(inputStream, 2);
    }
    
    public static void f(final ByteArrayOutputStream byteArrayOutputStream, final long n, final int n2) throws IOException {
        final byte[] array = new byte[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = (byte)(n >> i * 8 & 0xFFL);
        }
        byteArrayOutputStream.write(array);
    }
    
    public static void g(final ByteArrayOutputStream byteArrayOutputStream, final int n) throws IOException {
        f(byteArrayOutputStream, n, 2);
    }
}
