// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Debug;
import android.os.Debug$MemoryInfo;
import com.bytedance.covode.number.Covode;

public final class 0c9
{
    public static long LIZ;
    public static String LIZIZ;
    
    static {
        Covode.recordClassIndex(5696);
        0c9.LIZ = -1L;
        0c9.LIZIZ = "";
    }
    
    public static long LIZ() {
        final Debug$MemoryInfo debug$MemoryInfo = new Debug$MemoryInfo();
        Debug.getMemoryInfo(debug$MemoryInfo);
        return debug$MemoryInfo.getTotalPss();
    }
}
