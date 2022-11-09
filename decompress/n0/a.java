// 
// Decompiled by Procyon v0.6.0
// 

package n0;

public abstract class a
{
    public static final class a extends n0.a
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends a
    {
        public final float a;
        public final long b;
        
        public b(final float a, final long b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class c extends a
    {
        public final long a;
        
        public c(final long a) {
            this.a = a;
        }
    }
    
    public static final class d extends a
    {
        public final float a;
        
        public d(final float a) {
            this.a = a;
        }
    }
}
