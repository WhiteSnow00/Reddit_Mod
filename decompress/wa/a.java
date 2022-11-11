// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import android.os.Looper;
import com.google.android.exoplayer2.source.i$b;
import com.google.common.collect.ImmutableList;
import za.e;
import za.g;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.drm.c;
import yc.d$a;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.w;

public interface a extends w.c, j, d$a, c
{
    void D();
    
    void a(final String p0);
    
    void b(final String p0);
    
    void c(final long p0, final Object p1);
    
    void d(final long p0, final long p1, final String p2);
    
    void e(final int p0, final long p1);
    
    void f(final int p0, final long p1);
    
    void g(final Exception p0);
    
    void h(final n p0, final g p1);
    
    void i(final e p0);
    
    void k(final Exception p0);
    
    void l(final long p0);
    
    void m(final Exception p0);
    
    void n(final e p0);
    
    void o(final e p0);
    
    void p(final n p0, final g p1);
    
    void q(final e p0);
    
    void r(final long p0, final long p1, final String p2);
    
    void release();
    
    void s(final int p0, final long p1, final long p2);
    
    void v(final ImmutableList p0, final i$b p1);
    
    void w(final w p0, final Looper p1);
    
    void y(final wa.b p0);
}
