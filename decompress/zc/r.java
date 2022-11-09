// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.upstream.a;

public final class r implements a
{
    public final a a;
    public final h b;
    public boolean c;
    public long d;
    
    public r(final a a, final CacheDataSink b) {
        this.a = a;
        b.getClass();
        this.b = (h)b;
    }
    
    public final long a(final b b) throws IOException {
        final long a = this.a.a(b);
        this.d = a;
        if (a == 0L) {
            return 0L;
        }
        b b2 = b;
        if (b.g == -1L) {
            b2 = b;
            if (a != -1L) {
                b2 = b.b(0L, a);
            }
        }
        this.c = true;
        this.b.a(b2);
        return this.d;
    }
    
    public final void close() throws IOException {
        try {
            this.a.close();
        }
        finally {
            if (this.c) {
                this.c = false;
                this.b.close();
            }
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
    
    public final int read(final byte[] array, final int n, int read) throws IOException {
        if (this.d == 0L) {
            return -1;
        }
        read = ((f)this.a).read(array, n, read);
        if (read > 0) {
            this.b.write(array, n, read);
            final long d = this.d;
            if (d != -1L) {
                this.d = d - read;
            }
        }
        return read;
    }
}
