// 
// Decompiled by Procyon v0.6.0
// 

package v3;

import android.os.UserManager;
import android.content.Context;

public final class l
{
    public static boolean a(final Context context) {
        return ((UserManager)context.getSystemService((Class)UserManager.class)).isUserUnlocked();
    }
}
