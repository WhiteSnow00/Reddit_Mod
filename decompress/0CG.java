// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Date;
import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;

public final class 0cG
{
    public static final SimpleDateFormat LIZ;
    
    static {
        Covode.recordClassIndex(5704);
        LIZ = new SimpleDateFormat("yyyy-MM-dd");
    }
    
    public static boolean LIZ(final long n) {
        final SimpleDateFormat liz = 0cG.LIZ;
        return liz.format(new Date(n)).equals(liz.format(new Date()));
    }
}
