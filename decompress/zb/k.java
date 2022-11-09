// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import java.io.IOException;
import zc.i;
import android.net.Uri;
import java.util.List;
import com.google.android.exoplayer2.upstream.i$a;

public final class k<T extends j<T>> implements i$a<T>
{
    public final i$a<? extends T> a;
    public final List<o> b;
    
    public k(final i$a<? extends T> a, final List<o> b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final Uri uri, final i i) throws IOException {
        final j j = (j)this.a.a(uri, i);
        final List<o> b = this.b;
        j k = j;
        if (b != null) {
            if (b.isEmpty()) {
                k = j;
            }
            else {
                k = j.a(this.b);
            }
        }
        return k;
    }
}
