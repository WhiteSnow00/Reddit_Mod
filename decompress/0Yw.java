// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import com.bytedance.android.livesdk.livesetting.other.NetMonitorAllowListSettings;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 0yw
{
    public static 0yx LIZ;
    public static List<String> LIZIZ;
    
    static {
        Covode.recordClassIndex(10461);
        0yw.LIZ = 1dc.LIZ;
        0yw.LIZIZ = Arrays.asList(NetMonitorAllowListSettings.INSTANCE.getValue());
    }
}
