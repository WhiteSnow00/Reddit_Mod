// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;

public final class 0mq
{
    static {
        Covode.recordClassIndex(7666);
    }
    
    public static void LIZ(final int n) {
        String s;
        if (n == 1) {
            s = "anchor_linkmic_red_dot_shown";
        }
        else {
            s = "guest_linkmic_red_dot_shown";
        }
        LIZIZ(s);
    }
    
    public static boolean LIZ(final String s) {
        final Context context = 0jR.LIZ(IHostContext.class).context();
        return context != null && !H2k.LIZ(context, H2k.LIZIZ).LIZ(s, false);
    }
    
    public static void LIZIZ(final String s) {
        final Context context = 0jR.LIZ(IHostContext.class).context();
        if (context != null) {
            final H2k liz = H2k.LIZ(context, H2k.LIZIZ);
            liz.LIZ(s, (Object)true);
            liz.LIZ();
        }
    }
}
