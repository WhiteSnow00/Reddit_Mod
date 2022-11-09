// 
// Decompiled by Procyon v0.6.0
// 

package v8;

import l9.j;
import java.util.ArrayDeque;

public final class m<A, B>
{
    public final l a;
    
    public m() {
        this.a = new l();
    }
    
    public static final class a<A>
    {
        public static final ArrayDeque d;
        public int a;
        public int b;
        public A c;
        
        static {
            final char[] a = j.a;
            d = new ArrayDeque(0);
        }
        
        public static a a(final int b, final int a, final Object c) {
            Object d = m.a.d;
            synchronized (d) {
                final a a2 = ((ArrayDeque<a>)d).poll();
                monitorexit(d);
                d = a2;
                if (a2 == null) {
                    d = new a();
                }
                ((a)d).c = (A)c;
                ((a)d).b = b;
                ((a)d).a = a;
                return (a)d;
            }
        }
        
        @Override
        public final boolean equals(final Object o) {
            final boolean b = o instanceof a;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final a a = (a)o;
                b3 = b2;
                if (this.b == a.b) {
                    b3 = b2;
                    if (this.a == a.a) {
                        b3 = b2;
                        if (this.c.equals(a.c)) {
                            b3 = true;
                        }
                    }
                }
            }
            return b3;
        }
        
        @Override
        public final int hashCode() {
            return this.c.hashCode() + (this.a * 31 + this.b) * 31;
        }
    }
}
