// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.UserManager;
import android.os.Build$VERSION;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 06f
{
    static {
        Covode.recordClassIndex(738);
    }
    
    public static boolean LIZ(final Context context) {
        return Build$VERSION.SDK_INT < 24 || ((UserManager)context.getSystemService((Class)UserManager.class)).isUserUnlocked();
    }
}
