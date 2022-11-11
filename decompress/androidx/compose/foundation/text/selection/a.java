// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import lg.e0;
import kotlin.text.b;
import rg2.l;
import i2.o;
import i2.n;

public interface a
{
    long a(final n p0, final long p1, final boolean p2, final o p3);
    
    public static final class a
    {
        public static final a$a$a a;
        public static final a$a$e b;
        
        static {
            new a$a$c();
            a = new a$a$a();
            b = new a$a$e();
            new a$a$d();
            new a$a$b();
        }
        
        public static final long a(final n n, long n2, final l l) {
            if (n.a.a.length() == 0) {
                n2 = o.b;
            }
            else {
                final int v0 = kotlin.text.b.V0((CharSequence)n.a.a);
                final int c = o.c;
                final long a = l.invoke(e0.v((int)(n2 >> 32), 0, v0)).a;
                final long a2 = l.invoke(e0.v(o.c(n2), 0, v0)).a;
                int c2;
                if (o.g(n2)) {
                    c2 = o.c(a);
                }
                else {
                    c2 = (int)(a >> 32);
                }
                int c3;
                if (o.g(n2)) {
                    c3 = (int)(a2 >> 32);
                }
                else {
                    c3 = o.c(a2);
                }
                n2 = wd.a.i(c2, c3);
            }
            return n2;
        }
    }
}
