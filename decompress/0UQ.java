// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class 0uq
{
    public static final Map<Integer, String> LIZ;
    
    static {
        Covode.recordClassIndex(9571);
        LIZ = FJ3.LIZIZ(new 8si[] { 8sj.LIZ((Object)0, (Object)"audio"), 8sj.LIZ((Object)1, (Object)"enhance"), 8sj.LIZ((Object)2, (Object)"enhance"), 8sj.LIZ((Object)3, (Object)"props") });
    }
    
    public static final String LIZ(final int n) {
        String s;
        if ((s = 0uq.LIZ.get(n)) == null) {
            s = "audio";
        }
        return s;
    }
}
