// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import fk2.c;
import ng2.e;
import java.nio.channels.FileChannel;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010" }, d2 = { "Lokhttp3/internal/cache2/FileOperator;", "", "", "pos", "Lfk2/c;", "source", "byteCount", "Lcg2/j;", "write", "sink", "read", "Ljava/nio/channels/FileChannel;", "fileChannel", "Ljava/nio/channels/FileChannel;", "<init>", "(Ljava/nio/channels/FileChannel;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class FileOperator
{
    private final FileChannel fileChannel;
    
    public FileOperator(final FileChannel fileChannel) {
        e.f((Object)fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }
    
    public final void read(long n, final c c, long n2) {
        e.f((Object)c, "sink");
        if (n2 >= 0L) {
            while (n2 > 0L) {
                final long transferTo = this.fileChannel.transferTo(n, n2, (WritableByteChannel)c);
                n += transferTo;
                n2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
    
    public final void write(long n, final c c, long n2) throws IOException {
        e.f((Object)c, "source");
        if (n2 >= 0L && n2 <= c.g) {
            while (n2 > 0L) {
                final long transfer = this.fileChannel.transferFrom((ReadableByteChannel)c, n, n2);
                n += transfer;
                n2 -= transfer;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
