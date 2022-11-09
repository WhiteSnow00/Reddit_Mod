// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.io.IOException;
import com.google.android.exoplayer2.upstream.b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;

public final class q implements a
{
    public final a a;
    public long b;
    public Uri c;
    public Map<String, List<String>> d;
    
    public q(final a a) {
        a.getClass();
        this.a = a;
        this.c = Uri.EMPTY;
        this.d = Collections.emptyMap();
    }
    
    public final long a(final b b) throws IOException {
        this.c = b.a;
        this.d = Collections.emptyMap();
        final long a = this.a.a(b);
        final Uri uri = this.getUri();
        uri.getClass();
        this.c = uri;
        this.d = this.e();
        return a;
    }
    
    public final void close() throws IOException {
        this.a.close();
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
    
    public final int read(final byte[] array, int read, final int n) throws IOException {
        read = ((f)this.a).read(array, read, n);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
