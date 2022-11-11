// 
// Decompiled by Procyon v0.6.0
// 

package c6;

public interface j
{
    public static final c a = new c();
    public static final b b = new b();
    
    public abstract static class a
    {
        public static final class a extends j.a
        {
            public final Throwable a;
            
            public a(final Throwable a) {
                this.a = a;
            }
            
            @Override
            public final String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }
        
        public static final class b extends j.a
        {
            @Override
            public final String toString() {
                return "IN_PROGRESS";
            }
        }
        
        public static final class c extends j.a
        {
            @Override
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
