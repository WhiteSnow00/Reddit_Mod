// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import java.io.IOException;
import android.net.Uri;
import java.util.List;
import com.google.android.exoplayer2.upstream.i$a;

public final class i<T extends h<T>> implements i$a<T>
{
    public final i$a<? extends T> a;
    public final List<m> b;
    
    public i(final i$a<? extends T> a, final List<m> b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final Uri uri, final zc.i i) throws IOException {
        final h h = (h)this.a.a(uri, i);
        final List<m> b = this.b;
        h h2 = h;
        if (b != null) {
            if (b.isEmpty()) {
                h2 = h;
            }
            else {
                h2 = h.a(this.b);
            }
        }
        return h2;
    }
}
