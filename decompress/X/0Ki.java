// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public interface 0ki
{
    public static final String LIZ = 0ki.class.getSimpleName();
    
    default static {
        Covode.recordClassIndex(7179);
    }
    
    public enum a
    {
        BAN_FOR_BROADCASTING(2), 
        BAN_FOR_LINK(13);
        
        public final int type;
        
        static {
            Covode.recordClassIndex(7180);
        }
        
        public a(final int type) {
            this.type = type;
        }
    }
}
