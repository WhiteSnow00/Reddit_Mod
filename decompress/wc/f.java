// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import ac.t;
import com.google.android.exoplayer2.n;
import cc.m;
import java.util.List;
import cc.e;

public interface f extends i
{
    int a();
    
    boolean b(final int p0, final long p1);
    
    void d();
    
    default boolean e(final long n, final e e, final List<? extends m> list) {
        return false;
    }
    
    default void f() {
    }
    
    void i();
    
    int j(final long p0, final List<? extends m> p1);
    
    int k();
    
    n l();
    
    void m(final long p0, final long p1, final long p2, final List<? extends m> p3, final cc.n[] p4);
    
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
