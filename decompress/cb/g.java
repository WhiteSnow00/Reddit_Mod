// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import ad.s;
import java.io.IOException;
import java.io.EOFException;
import yc.f;
import com.google.android.exoplayer2.n;

public final class g implements w
{
    public final byte[] a;
    
    public g() {
        this.a = new byte[4096];
    }
    
    public final void a(final long n, final int n2, final int n3, final int n4, final w$a w$a) {
    }
    
    public final void b(final n n) {
    }
    
    public final int c(final f f, int n, final boolean b) throws IOException {
        n = Math.min(this.a.length, n);
        n = f.read(this.a, 0, n);
        if (n != -1) {
            return n;
        }
        if (b) {
            return -1;
        }
        throw new EOFException();
    }
    
    public final void f(final s s, final int n) {
        s.C(n);
    }
}
