// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.os.Build$VERSION;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class bt
{
    static {
        Covode.recordClassIndex(2653);
    }
    
    public static boolean values(final Context context) {
        if (Build$VERSION.SDK_INT >= 26) {
            return context.getPackageManager().isInstantApp();
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        }
        catch (final ClassNotFoundException ex) {
            return false;
        }
    }
}
