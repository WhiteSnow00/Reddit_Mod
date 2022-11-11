// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import X.46U;
import android.os.Build$VERSION;
import X.3xs;
import android.content.SharedPreferences$Editor;
import com.bytedance.covode.number.Covode;
import android.content.SharedPreferences;

public final class bc implements ba
{
    public final SharedPreferences values;
    
    static {
        Covode.recordClassIndex(2634);
    }
    
    public bc(final SharedPreferences values) {
        this.values = values;
    }
    
    public static void INVOKEINTERFACE_com_appsflyer_internal_bc_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(final SharedPreferences$Editor sharedPreferences$Editor) {
        if (!3xs.LIZ() || Build$VERSION.SDK_INT < 26) {
            sharedPreferences$Editor.apply();
            return;
        }
        if (!sharedPreferences$Editor.getClass().getName().equals("android.app.SharedPreferencesImpl$EditorImpl")) {
            sharedPreferences$Editor.apply();
            return;
        }
        final Object liz = 46U.LIZ((Object)sharedPreferences$Editor);
        if (liz == null || !46U.LIZIZ((Object)sharedPreferences$Editor, liz)) {
            sharedPreferences$Editor.apply();
            if (liz == null) {
                return;
            }
        }
        46U.LIZ((Object)sharedPreferences$Editor, liz);
    }
    
    @Override
    public final boolean AFInAppEventType(final String s) {
        return this.values.getBoolean(s, false);
    }
    
    @Override
    public final void AFKeystoreWrapper(final String s) {
        INVOKEINTERFACE_com_appsflyer_internal_bc_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(this.values.edit().putBoolean(s, true));
    }
}
