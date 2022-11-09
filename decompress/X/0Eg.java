// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public interface 0Eg
{
    default static {
        Covode.recordClassIndex(1570);
    }
    
    d LIZ();
    
    public interface d
    {
        default static {
            Covode.recordClassIndex(1577);
        }
        
        long LIZ(final long p0);
    }
    
    public static final class a implements 0Eg
    {
        public long LIZ;
        
        static {
            Covode.recordClassIndex(1571);
        }
        
        @Override
        public final d LIZ() {
            return new 0Eg.a.a();
        }
        
        public final class a implements d
        {
            public final 04v<Long> LIZIZ;
            
            static {
                Covode.recordClassIndex(1572);
            }
            
            public a() {
                this.LIZIZ = new 04v<Long>();
            }
            
            @Override
            public final long LIZ(final long n) {
                Long value;
                if ((value = this.LIZIZ.LIZ(n, null)) == null) {
                    final 0Eg.a liz = 0Eg.a.this;
                    final long liz2 = liz.LIZ;
                    liz.LIZ = 1L + liz2;
                    value = liz2;
                    this.LIZIZ.LIZIZ(n, value);
                }
                return value;
            }
        }
    }
    
    public static final class b implements 0Eg
    {
        public final d LIZ;
        
        static {
            Covode.recordClassIndex(1573);
        }
        
        public b() {
            this.LIZ = new 16v();
        }
        
        @Override
        public final d LIZ() {
            return this.LIZ;
        }
    }
    
    public static final class c implements 0Eg
    {
        public final d LIZ;
        
        static {
            Covode.recordClassIndex(1575);
        }
        
        public c() {
            this.LIZ = new 16x();
        }
        
        @Override
        public final d LIZ() {
            return this.LIZ;
        }
    }
}
