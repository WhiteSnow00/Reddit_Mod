// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import al0.g7;
import sg2.e;

public abstract class k
{
    public final boolean a;
    
    public k(final boolean a) {
        this.a = a;
    }
    
    public static final class a extends k
    {
        public final Throwable b;
        
        public a(final Throwable b) {
            e.f((Object)b, "error");
            super(false);
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o instanceof a) {
                final boolean a = super.a;
                final a a2 = (a)o;
                if (a == a2.a && e.a((Object)this.b, (Object)a2.b)) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + Boolean.hashCode(super.a);
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("Error(endOfPaginationReached=");
            r.append(super.a);
            r.append(", error=");
            return al0.a.n(r, this.b, ')');
        }
    }
    
    public static final class b extends k
    {
        public static final b b;
        
        static {
            b = new b();
        }
        
        public b() {
            super(false);
        }
        
        @Override
        public final boolean equals(final Object o) {
            return o instanceof b && super.a == ((b)o).a;
        }
        
        @Override
        public final int hashCode() {
            return Boolean.hashCode(super.a);
        }
        
        @Override
        public final String toString() {
            return g7.m(a.r("Loading(endOfPaginationReached="), super.a, ')');
        }
    }
    
    public static final class c extends k
    {
        public static final c b;
        public static final c c;
        
        static {
            b = new c(true);
            c = new c(false);
        }
        
        public c(final boolean b) {
            super(b);
        }
        
        @Override
        public final boolean equals(final Object o) {
            return o instanceof c && super.a == ((c)o).a;
        }
        
        @Override
        public final int hashCode() {
            return Boolean.hashCode(super.a);
        }
        
        @Override
        public final String toString() {
            return g7.m(a.r("NotLoading(endOfPaginationReached="), super.a, ')');
        }
    }
}
