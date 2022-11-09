// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 0eB
{
    public final List<0e9> LIZ;
    
    static {
        Covode.recordClassIndex(5938);
    }
    
    public 0eB(final a a) {
        (this.LIZ = new ArrayList<0e9>()).addAll(a.LIZ);
    }
    
    public static final class a
    {
        public final List<0e9> LIZ;
        
        static {
            Covode.recordClassIndex(5939);
        }
        
        public a() {
            this.LIZ = new ArrayList<0e9>();
        }
        
        public final a LIZ(final 0e9 0e9) {
            if (0e9 != null) {
                this.LIZ.add(0e9);
            }
            return this;
        }
        
        public final 0eB LIZ() {
            return new 0eB(this);
        }
    }
}
