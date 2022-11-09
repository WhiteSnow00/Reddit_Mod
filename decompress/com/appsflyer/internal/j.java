// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.net.Uri;
import X.5WL;
import java.util.HashMap;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.app.Application;
import java.util.Map;
import com.appsflyer.attribution.AppsFlyerRequestListener;

public abstract class j
{
    public AppsFlyerRequestListener AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public Map<String, Object> AFKeystoreWrapper;
    public String AFLogger$LogLevel;
    public String AFVersionDeclaration;
    public String AppsFlyer2dXConversionCallback;
    public String getLevel;
    public byte[] init;
    public String onAppOpenAttributionNative;
    public int onAttributionFailureNative;
    public boolean onDeepLinkingNative;
    public final boolean onInstallConversionDataLoadedNative;
    public Application valueOf;
    public String values;
    
    static {
        Covode.recordClassIndex(2700);
    }
    
    public j() {
        this(null, null, null, null);
    }
    
    public j(final String afLogger$LogLevel, final String onAppOpenAttributionNative, final Boolean b, final Context context) {
        this.AFInAppEventType = new HashMap<String, Object>();
        this.AFLogger$LogLevel = afLogger$LogLevel;
        this.onAppOpenAttributionNative = onAppOpenAttributionNative;
        this.onInstallConversionDataLoadedNative = (b == null || b);
        if (context != null) {
            this.valueOf = (Application)INVOKEVIRTUAL_com_appsflyer_internal_j_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        }
    }
    
    public static Context INVOKEVIRTUAL_com_appsflyer_internal_j_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    public final String AFInAppEventParameterName(final String s) {
        final String value = ai.valueOf().valueOf((Context)this.valueOf);
        String string = s;
        if (value != null) {
            string = Uri.parse(s).buildUpon().appendQueryParameter("channel", value).build().toString();
        }
        return string;
    }
    
    public final Map<String, Object> AFInAppEventParameterName() {
        return this.AFInAppEventType;
    }
    
    public final j AFInAppEventType(final Map<String, ?> map) {
        this.AFInAppEventType.putAll(map);
        return this;
    }
    
    public final boolean AFInAppEventType() {
        return this.onInstallConversionDataLoadedNative;
    }
    
    public final boolean AFKeystoreWrapper() {
        return this.onDeepLinkingNative;
    }
    
    public j valueOf(final String onAppOpenAttributionNative) {
        this.onAppOpenAttributionNative = onAppOpenAttributionNative;
        return this;
    }
    
    public final byte[] valueOf() {
        return this.init;
    }
}
