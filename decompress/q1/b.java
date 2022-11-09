// 
// Decompiled by Procyon v0.6.0
// 

package q1;

import n1.c;
import o1.p;
import a80.a;
import n1.f;
import o1.b0;
import o1.h;

public final class b
{
    public final /* synthetic */ d a;
    
    public b(final d a) {
        this.a = a;
    }
    
    public final void a(final h h, final int n) {
        this.a.a().h((b0)h, n);
    }
    
    public final void b(final float n, final float n2, final float n3, final float n4, final int n5) {
        this.a.a().e(n, n2, n3, n4, n5);
    }
    
    public final void c(final float n, final float n2, final float n3, final float n4) {
        final p a = this.a.a();
        final d a2 = this.a;
        final long f = a80.a.f(n1.f.e(a2.b()) - (n3 + n), n1.f.c(this.a.b()) - (n4 + n2));
        if (n1.f.e(f) >= 0.0f && n1.f.c(f) >= 0.0f) {
            a2.c(f);
            a.f(n, n2);
            return;
        }
        throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
    }
    
    public final void d(final float n, final long n2) {
        final p a = this.a.a();
        a.f(c.c(n2), c.d(n2));
        a.l(n);
        a.f(-c.c(n2), -c.d(n2));
    }
    
    public final void e(final float n, final float n2, final long n3) {
        final p a = this.a.a();
        a.f(c.c(n3), c.d(n3));
        a.j(n, n2);
        a.f(-c.c(n3), -c.d(n3));
    }
    
    public final void f(final float[] array) {
        this.a.a().o(array);
    }
    
    public final void g(final float n, final float n2) {
        this.a.a().f(n, n2);
    }
}
