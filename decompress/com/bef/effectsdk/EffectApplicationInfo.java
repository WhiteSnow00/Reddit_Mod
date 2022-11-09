// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.5ek;
import java.io.File;
import com.bytedance.covode.number.Covode;
import android.content.Context;

public class EffectApplicationInfo
{
    public static Context appContext;
    
    static {
        Covode.recordClassIndex(2774);
    }
    
    public static File INVOKEVIRTUAL_com_bef_effectsdk_EffectApplicationInfo_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(final Context context) {
        if (5ek.LIZJ == null || !5ek.LJ) {
            return 5ek.LIZJ = context.getFilesDir();
        }
        return 5ek.LIZJ;
    }
    
    public static Context getAppContext() {
        return EffectApplicationInfo.appContext;
    }
    
    public static native int nativeSetHomeDir(final String p0);
    
    public static void onSetAppContext() {
        MethodCollector.i(3595);
        final Context appContext = EffectApplicationInfo.appContext;
        if (appContext != null) {
            nativeSetHomeDir(INVOKEVIRTUAL_com_bef_effectsdk_EffectApplicationInfo_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(appContext).getAbsolutePath());
        }
        MethodCollector.o(3595);
    }
    
    public static void setAppContext(final Context appContext) {
        EffectApplicationInfo.appContext = appContext;
        onSetAppContext();
    }
}
