// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.byted.cast.common.api.ILogger;

public final class 0Zu implements ILogger
{
    static {
        Covode.recordClassIndex(5464);
    }
    
    public final void onDebug(final String s, final String s2) {
        0ba.LIZ(3, s, s2);
    }
    
    public final void onError(final String s, final String s2) {
        0ba.LIZ(6, s, s2);
    }
    
    public final void onError(final String s, final String s2, final Throwable t) {
        0ba.LIZ(s, s2, t);
    }
    
    public final void onInfo(final String s, final String s2) {
        0ba.LIZ(4, s, s2);
    }
    
    public final void onVerbose(final String s, final String s2) {
        0ba.LIZ(2, s, s2);
    }
    
    public final void onWarn(final String s, final String s2) {
        0ba.LIZ(5, s, s2);
    }
}
