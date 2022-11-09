// 
// Decompiled by Procyon v0.6.0
// 

package xc;

import bc.t;
import dc.e;
import dc.n;
import dc.m;
import java.util.List;

public interface f extends i
{
    void a(final long p0, final long p1, final long p2, final List<? extends m> p3, final n[] p4);
    
    int b();
    
    default boolean c(final long n, final e e, final List<? extends m> list) {
        return false;
    }
    
    void d();
    
    boolean e(final int p0, final long p1);
    
    default void g() {
    }
    
    void j();
    
    int k(final long p0, final List<? extends m> p1);
    
    int l();
    
    com.google.android.exoplayer2.n m();
    
    default void n() {
    }
    
    boolean o(final int p0, final long p1);
    
    void q(final float p0);
    
    Object r();
    
    default void s(final boolean b) {
    }
    
    int u();
    
    public static final class a
    {
        public final t a;
        public final int[] b;
        public final int c;
        
        public a() {
            throw null;
        }
        
        public a(final int c, final t a, final int[] b) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public interface b
    {
    }
}
