// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.zzjd;
import java.io.IOException;
import java.nio.charset.Charset;
import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.d;

public final class m5
{
    public final d a;
    
    public m5(final c a) {
        final Charset a2 = i6.a;
        this.a = (d)a;
        ((d)a).a = this;
    }
    
    public final void a(final int n, final int n2) throws IOException {
        this.a.n(n, n2 >> 31 ^ n2 + n2);
    }
    
    public final void b(final int n, final long n2) throws IOException {
        this.a.p(n, n2 >> 63 ^ n2 + n2);
    }
    
    public final void c(final int n, final int n2) throws IOException {
        this.a.n(n, n2);
    }
    
    public final void d(final int n, final long n2) throws IOException {
        this.a.p(n, n2);
    }
    
    public final void e(final int n, final boolean b) throws IOException {
        this.a.d(n, b);
    }
    
    public final void f(final int n, final zzjd zzjd) throws IOException {
        this.a.e(n, zzjd);
    }
    
    public final void g(final double n, final int n2) throws IOException {
        this.a.h(n2, Double.doubleToRawLongBits(n));
    }
    
    public final void h(final int n, final int n2) throws IOException {
        this.a.j(n, n2);
    }
    
    public final void i(final int n, final int n2) throws IOException {
        this.a.f(n, n2);
    }
    
    public final void j(final int n, final long n2) throws IOException {
        this.a.h(n, n2);
    }
    
    public final void k(final float n, final int n2) throws IOException {
        this.a.f(n2, Float.floatToRawIntBits(n));
    }
    
    public final void l(final int n, final k7 k7, final Object o) throws IOException {
        final d a = this.a;
        final z6 z6 = (z6)o;
        a.m(n, 3);
        k7.g(z6, a.a);
        a.m(n, 4);
    }
    
    public final void m(final int n, final int n2) throws IOException {
        this.a.j(n, n2);
    }
    
    public final void n(final int n, final long n2) throws IOException {
        this.a.p(n, n2);
    }
    
    public final void o(int n, final k7 k7, final Object o) throws IOException {
        final d a = this.a;
        final z6 z6 = (z6)o;
        final c c = (c)a;
        c.o(n << 3 | 0x2);
        final b b = (b)z6;
        if ((n = b.b()) == -1) {
            n = k7.c(b);
            b.h(n);
        }
        c.o(n);
        k7.g(z6, ((d)c).a);
    }
    
    public final void p(final int n, final int n2) throws IOException {
        this.a.f(n, n2);
    }
    
    public final void q(final int n, final long n2) throws IOException {
        this.a.h(n, n2);
    }
}
