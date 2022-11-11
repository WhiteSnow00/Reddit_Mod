// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 0eu
{
    static {
        Covode.recordClassIndex(6004);
    }
    
    public static boolean LIZ(final Context context) {
        return context != null && (context.getResources().getConfiguration().locale.getLanguage().equals("ar") || context.getResources().getConfiguration().getLayoutDirection() == 1);
    }
}
