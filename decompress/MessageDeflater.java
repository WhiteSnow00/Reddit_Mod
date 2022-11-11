// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.ws;

import jk2.c$a;
import lw0.b;
import jk2.k0;
import sg2.e;
import java.io.IOException;
import okio.ByteString;
import jk2.e0;
import jk2.u;
import jk2.g;
import java.util.zip.Deflater;
import jk2.c;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012" }, d2 = { "Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "Ljk2/c;", "Lokio/ByteString;", "suffix", "", "endsWith", "buffer", "Lhg2/j;", "deflate", "close", "noContextTakeover", "Z", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "<init>", "(Z)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class MessageDeflater implements Closeable
{
    private final c deflatedBytes;
    private final Deflater deflater;
    private final g deflaterSink;
    private final boolean noContextTakeover;
    
    public MessageDeflater(final boolean noContextTakeover) {
        this.noContextTakeover = noContextTakeover;
        final c deflatedBytes = new c();
        this.deflatedBytes = deflatedBytes;
        final Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new g(u.a((e0)deflatedBytes), deflater);
    }
    
    private final boolean endsWith(final c c, final ByteString byteString) {
        return c.n1(c.g - byteString.size(), byteString);
    }
    
    @Override
    public void close() throws IOException {
        this.deflaterSink.close();
    }
    
    public final void deflate(final c c) throws IOException {
        e.f((Object)c, "buffer");
        if (this.deflatedBytes.g == 0L) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(c, c.g);
            this.deflaterSink.flush();
            Label_0137: {
                if (this.endsWith(this.deflatedBytes, MessageDeflaterKt.access$getEMPTY_DEFLATE_BLOCK$p())) {
                    final c deflatedBytes = this.deflatedBytes;
                    final long g = deflatedBytes.g;
                    final long n = 4;
                    final c$a w = deflatedBytes.w(k0.a);
                    try {
                        w.f(g - n);
                        b.X((Closeable)w, (Throwable)null);
                        break Label_0137;
                    }
                    finally {
                        try {}
                        finally {
                            b.X((Closeable)w, (Throwable)c);
                        }
                    }
                }
                this.deflatedBytes.O(0);
            }
            final c deflatedBytes2 = this.deflatedBytes;
            c.write(deflatedBytes2, deflatedBytes2.g);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
