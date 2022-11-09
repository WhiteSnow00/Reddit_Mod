// 
// Decompiled by Procyon v0.6.0
// 

package com.android.installreferrer.commons;

import android.util.Log;
import com.bytedance.covode.number.Covode;

public final class InstallReferrerCommons
{
    static {
        Covode.recordClassIndex(2537);
    }
    
    public static void logVerbose(final String s, final String s2) {
        Log.isLoggable(s, 2);
    }
    
    public static void logWarn(final String s, final String s2) {
        Log.isLoggable(s, 5);
    }
}
