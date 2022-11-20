// 
// Decompiled by Procyon v0.6.0
// 

package la2;

public abstract class f
{
    public static final class a extends f
    {
        public final int a;
        
        public a(final int a) {
            this.a = a;
        }
    }
    
    public static final class b extends f
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
}
