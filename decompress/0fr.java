// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0fr
{
    public static final 0fr LIZ;
    
    static {
        Covode.recordClassIndex(6150);
        LIZ = new 0fr();
    }
    
    public final boolean LIZ(final Object... array) {
        CTM.LIZ((Object)array);
        int n = 0;
        while (array[n] != null) {
            if (++n < 4) {
                continue;
            }
            return false;
        }
        return true;
    }
}
