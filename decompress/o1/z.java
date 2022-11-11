// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import n1.a;
import n1.d;
import sg2.e;

public abstract class z
{
    public static final class a extends z
    {
        public final b0 a;
        
        public a(final h a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && e.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
    
    public static final class b extends z
    {
        public final d a;
        
        public b(final d a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && e.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
    
    public static final class c extends z
    {
        public final n1.e a;
        public final h b;
        
        public c(final n1.e a) {
            this.a = a;
            final float b = n1.a.b(a.h);
            final float b2 = n1.a.b(a.g);
            final int n = 1;
            final boolean b3 = b == b2 && n1.a.b(a.g) == n1.a.b(a.f) && n1.a.b(a.f) == n1.a.b(a.e);
            final boolean b4 = n1.a.c(a.h) == n1.a.c(a.g) && n1.a.c(a.g) == n1.a.c(a.f) && n1.a.c(a.f) == n1.a.c(a.e);
            int n2;
            if (b3 && b4) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            h b5;
            if (n2 == 0) {
                final h u = yg.a.u();
                u.h(a);
                b5 = u;
            }
            else {
                b5 = null;
            }
            this.b = b5;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && e.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
