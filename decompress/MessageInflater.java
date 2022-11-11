// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.ws;

import sg2.e;
import java.io.IOException;
import jk2.g0;
import jk2.p;
import java.util.zip.Inflater;
import jk2.c;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f" }, d2 = { "Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "Ljk2/c;", "buffer", "Lhg2/j;", "inflate", "close", "", "noContextTakeover", "Z", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "<init>", "(Z)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class MessageInflater implements Closeable
{
    private final c deflatedBytes;
    private final Inflater inflater;
    private final p inflaterSource;
    private final boolean noContextTakeover;
    
    public MessageInflater(final boolean noContextTakeover) {
        this.noContextTakeover = noContextTakeover;
        final c deflatedBytes = new c();
        this.deflatedBytes = deflatedBytes;
        final Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new p((g0)deflatedBytes, inflater);
    }
    
    @Override
    public void close() throws IOException {
        this.inflaterSource.close();
    }
    
    public final void inflate(final c c) throws IOException {
        e.f((Object)c, "buffer");
        if (this.deflatedBytes.g == 0L) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.N1((g0)c);
            this.deflatedBytes.T(65535);
            do {
                this.inflaterSource.a(c, Long.MAX_VALUE);
            } while (this.inflater.getBytesRead() < this.inflater.getBytesRead() + this.deflatedBytes.g);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
