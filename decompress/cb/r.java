// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import java.io.IOException;
import java.io.EOFException;
import ub.g;
import pb.a;
import ub.g$a;
import ad.s;

public final class r
{
    public final s a;
    
    public r() {
        this.a = new s(10);
    }
    
    public final a a(final e e, final g$a g$a) throws IOException {
        Object z0 = null;
        int n = 0;
        while (true) {
            try {
                while (true) {
                    e.g(this.a.a, 0, 10, false);
                    this.a.B(0);
                    if (this.a.t() != 4801587) {
                        break;
                    }
                    this.a.C(3);
                    final int q = this.a.q();
                    final int n2 = q + 10;
                    if (z0 == null) {
                        z0 = new byte[n2];
                        System.arraycopy(this.a.a, 0, z0, 0, 10);
                        e.g((byte[])z0, 10, q, false);
                        z0 = new g(g$a).Z0(n2, (byte[])z0);
                    }
                    else {
                        e.j(q, false);
                    }
                    n += n2;
                }
                e.f = 0;
                e.j(n, false);
                return (a)z0;
            }
            catch (final EOFException ex) {
                continue;
            }
            break;
        }
    }
}
