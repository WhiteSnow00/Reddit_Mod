// 
// Decompiled by Procyon v0.6.0
// 

package zi2;

import gg2.c;
import wi2.k;
import cg2.j;
import mg2.l;
import kotlinx.coroutines.JobSupport;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext$a;

public interface z0 extends CoroutineContext$a
{
    public static final int d4 = 0;
    
    CancellationException E();
    
    p F(final JobSupport p0);
    
    m0 R(final l<? super Throwable, j> p0);
    
    void a(final CancellationException p0);
    
    boolean b();
    
    k<z0> h();
    
    boolean isActive();
    
    boolean isCancelled();
    
    Object k(final c<? super j> p0);
    
    m0 o(final boolean p0, final boolean p1, final l<? super Throwable, j> p2);
    
    boolean start();
    
    public static final class a
    {
        public static m0 a(final z0 z0, boolean b, final c1 c1, final int n) {
            boolean b2 = false;
            if ((n & 0x1) != 0x0) {
                b = false;
            }
            if ((n & 0x2) != 0x0) {
                b2 = true;
            }
            return z0.o(b, b2, (l<? super Throwable, j>)c1);
        }
    }
}
