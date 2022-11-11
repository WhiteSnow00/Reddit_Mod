// 
// Decompiled by Procyon v0.6.0
// 

package cc;

import cb.g;
import android.util.Log;
import cb.w;
import com.google.android.exoplayer2.source.p;

public final class c implements f$a
{
    public final int[] a;
    public final p[] b;
    
    public c(final int[] a, final p[] b) {
        this.a = a;
        this.b = b;
    }
    
    public final w a(final int n) {
        int n2 = 0;
        while (true) {
            final int[] a = this.a;
            if (n2 >= a.length) {
                final StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(n);
                Log.e("BaseMediaChunkOutput", sb.toString());
                return (w)new g();
            }
            if (n == a[n2]) {
                return (w)this.b[n2];
            }
            ++n2;
        }
    }
}
