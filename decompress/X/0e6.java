// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 0e6
{
    public final List<0e4> LIZ;
    public int LIZIZ;
    
    static {
        Covode.recordClassIndex(5926);
    }
    
    public 0e6(final a a) {
        (this.LIZ = new ArrayList<0e4>()).addAll(a.LIZ);
        this.LIZIZ = a.LIZIZ;
    }
    
    public static final class a
    {
        public final List<0e4> LIZ;
        public int LIZIZ;
        
        static {
            Covode.recordClassIndex(5927);
        }
        
        public a() {
            this.LIZ = new ArrayList<0e4>();
            this.LIZIZ = 0;
        }
        
        public final a LIZ(final 0e4 0e4) {
            if (0e4 != null) {
                this.LIZ.add(0e4);
            }
            return this;
        }
        
        public final 0e6 LIZ() {
            return new 0e6(this, (byte)0);
        }
    }
}
