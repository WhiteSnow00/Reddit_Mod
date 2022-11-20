// 
// Decompiled by Procyon v0.6.0
// 

package hk2;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.File;

public final class j extends a
{
    public j(final e.b b, final File file) {
        super(b, file);
    }
    
    public final void a() throws IOException {
        final File b = super.b;
        try {
            final RandomAccessFile randomAccessFile = new RandomAccessFile(b, "rw");
            randomAccessFile.seek(0L);
            final f b2 = super.a.b();
            final ec.e e = new ec.e((Object)b2, super.b.length());
            final long n = ((h)b2).d().a();
            int n2;
            if (((h)b2).d().b() == 16) {
                n2 = 1;
            }
            else {
                n2 = 2;
            }
            final byte c = ((h)b2).d().c();
            final long n3 = e.f - 44L;
            final long n4 = 36L + n3;
            final long n5 = c * n * n2 / 8L;
            randomAccessFile.write(new byte[] { 82, 73, 70, 70, (byte)(n4 & 0xFFL), (byte)(n4 >> 8 & 0xFFL), (byte)(n4 >> 16 & 0xFFL), (byte)(n4 >> 24 & 0xFFL), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte)n2, 0, (byte)(n & 0xFFL), (byte)(n >> 8 & 0xFFL), (byte)(n >> 16 & 0xFFL), (byte)(n >> 24 & 0xFFL), (byte)(n5 & 0xFFL), (byte)(n5 >> 8 & 0xFFL), (byte)(n5 >> 16 & 0xFFL), (byte)(n5 >> 24 & 0xFFL), (byte)(c / 8 * n2), 0, c, 0, 100, 97, 116, 97, (byte)(n3 & 0xFFL), (byte)(n3 >> 8 & 0xFFL), (byte)(n3 >> 16 & 0xFFL), (byte)(n3 >> 24 & 0xFFL) });
            randomAccessFile.close();
        }
        catch (final FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}
