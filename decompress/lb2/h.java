// 
// Decompiled by Procyon v0.6.0
// 

package lb2;

public abstract class h
{
    public static final class a extends h
    {
        public final int a;
        
        public a(final int a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && this.a == ((a)o).a);
        }
        
        @Override
        public final int hashCode() {
            return Integer.hashCode(this.a);
        }
        
        @Override
        public final String toString() {
            return d.j(a.t("Count(count="), this.a, ')');
        }
    }
    
    public static final class b extends h
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c extends h
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
}
