// 
// Decompiled by Procyon v0.6.0
// 

package re;

import ke.e3;
import java.util.ArrayList;
import ke.o3;

public final class e7
{
    public o3 a;
    public ArrayList b;
    public ArrayList c;
    public long d;
    public final /* synthetic */ g7 e;
    
    public final boolean a(final long n, final e3 e3) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (!this.c.isEmpty() && this.c.get(0).u() / 1000L / 60L / 60L != e3.u() / 1000L / 60L / 60L) {
            return false;
        }
        final long d = this.d + e3.f();
        this.e.J();
        if (d >= Math.max(0, (int)q2.j.a((Object)null))) {
            return false;
        }
        this.d = d;
        this.c.add(e3);
        this.b.add(n);
        final int size = this.c.size();
        this.e.J();
        return size < Math.max(1, (int)q2.k.a((Object)null));
    }
}
