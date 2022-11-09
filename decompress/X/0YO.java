// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class 0yo
{
    public static final 0yo LIZ;
    public HashMap<String, String> LIZIZ;
    
    static {
        Covode.recordClassIndex(10439);
        LIZ = a.LIZ;
    }
    
    public 0yo() {
        this.LIZIZ = new HashMap<String, String>();
    }
    
    public final String LIZ(final String s) {
        return this.LIZIZ.get(s);
    }
    
    public final void LIZ(final String s, final String s2) {
        this.LIZIZ.put(s, s2);
    }
    
    public static final class a
    {
        public static final 0yo LIZ;
        
        static {
            Covode.recordClassIndex(10440);
            LIZ = new 0yo((byte)0);
        }
    }
}
