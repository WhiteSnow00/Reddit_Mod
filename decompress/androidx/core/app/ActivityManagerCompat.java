// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.app.ActivityManager;

public final class ActivityManagerCompat
{
    private ActivityManagerCompat() {
    }
    
    public static boolean isLowRamDevice(final ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
