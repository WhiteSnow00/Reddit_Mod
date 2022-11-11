// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import us0.s;
import xd0.d0;
import ff0.r1;
import va0.c0;
import va0.f0;
import n20.e;
import si0.g;
import com.reddit.frontpage.ui.stream.a;
import se2.c;
import v40.k;
import se2.h;
import ib0.b;
import ff0.m;
import ff0.n;
import si0.f;
import javax.inject.Provider;
import dq0.d;

public final class o4
{
    public final d a;
    public final z0 b;
    public Provider<f> c;
    public Provider<n> d;
    public Provider<m> e;
    
    public o4(final z0 b, final d a) {
        this.b = b;
        this.a = a;
        this.c = (Provider<f>)h.a((Provider)ib0.b.b((Provider)b.h));
        final Provider b2 = se2.c.b((Provider)new k((Provider)b.b1, (Provider)b.c, (Provider)b.y, 3));
        this.d = (Provider<n>)b2;
        this.e = (Provider<m>)se2.c.b((Provider)new zz.c(b2, (Provider)b.U1, 22));
    }
    
    public final a a() {
        final d a = this.a;
        final v10.k k = new v10.k();
        final g g = (g)this.c.get();
        this.b.a.l1();
        final e a2 = n20.e.a;
        final jf0.d e4 = this.b.a.E4();
        ui.b.n((Object)e4);
        final f0 o3 = this.b.a.o3();
        ui.b.n((Object)o3);
        final c0 l7 = this.b.a.l7();
        ui.b.n((Object)l7);
        final r1 b = this.b();
        final d0 n4 = this.b.a.N4();
        ui.b.n((Object)n4);
        this.b.a.J5();
        return new a(a, k, g, (n20.c)a2, e4, o3, l7, b, n4, (n20.a)n20.b.a, (m)this.e.get());
    }
    
    public final r1 b() {
        final m20.b i4 = this.b.a.i4();
        ui.b.n((Object)i4);
        final s l2 = this.b.a.L2();
        ui.b.n((Object)l2);
        final i41.a w3 = this.b.a.w3();
        ui.b.n((Object)w3);
        return new r1(i4, l2, w3);
    }
}
