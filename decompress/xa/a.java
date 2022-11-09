// 
// Decompiled by Procyon v0.6.0
// 

package xa;

import android.os.Looper;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.source.i$b;
import com.google.common.collect.ImmutableList;
import ab.g;
import com.google.android.exoplayer2.n;
import ab.e;
import com.google.android.exoplayer2.drm.c;
import zc.d;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.w$c;

public interface a extends w$c, j, d.a, c
{
    void A1(final int p0, final long p1, final long p2);
    
    void C1(final e p0);
    
    void G0(final Exception p0);
    
    void I0(final long p0);
    
    void J0(final Exception p0);
    
    void N8();
    
    void Q(final e p0);
    
    void U(final n p0, final g p1);
    
    void W(final e p0);
    
    void X(final long p0, final Object p1);
    
    void Yb(final b p0);
    
    void b0(final long p0, final long p1, final String p2);
    
    void d0(final int p0, final long p1);
    
    void k(final String p0);
    
    void m0(final int p0, final long p1);
    
    void n0(final n p0, final g p1);
    
    void p4(final ImmutableList p0, final i$b p1);
    
    void q0(final Exception p0);
    
    void release();
    
    void v4(final w p0, final Looper p1);
    
    void x(final e p0);
    
    void y(final String p0);
    
    void y1(final long p0, final long p1, final String p2);
}
