// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import X.5WL;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.content.SharedPreferences;
import android.app.Application;
import java.util.Map;

public final class au
{
    public final Map<String, Object> AFKeystoreWrapper;
    public final Application valueOf;
    public final SharedPreferences values;
    
    static {
        Covode.recordClassIndex(2622);
    }
    
    public au(final Context context) {
        this.AFKeystoreWrapper = new ConcurrentHashMap<String, Object>();
        final Application valueOf = (Application)INVOKEVIRTUAL_com_appsflyer_internal_au_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        this.valueOf = valueOf;
        this.values = ai.values((Context)valueOf);
    }
    
    public static Context INVOKEVIRTUAL_com_appsflyer_internal_au_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    public final boolean valueOf() {
        ai.valueOf();
        return ai.AFInAppEventParameterName(this.values, "appsFlyerCount", false) == 0;
    }
}
