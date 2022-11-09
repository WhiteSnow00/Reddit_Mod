// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.bytedance.covode.number.Covode;

public final class an
{
    public a AFInAppEventType;
    
    static {
        Covode.recordClassIndex(2607);
    }
    
    public an() {
        this.AFInAppEventType = (a)new a() {
            static {
                Covode.recordClassIndex(2608);
            }
            
            @Override
            public final Class<?> values(final String s) {
                return Class.forName(s);
            }
        };
    }
    
    private boolean AFInAppEventParameterName(final String s) {
        try {
            this.AFInAppEventType.values(s);
            final StringBuilder sb = new StringBuilder("Class: ");
            sb.append(s);
            sb.append(" is found.");
            AFLogger.AFInAppEventParameterName(sb.toString());
            return true;
        }
        catch (final ClassNotFoundException ex) {
            goto Label_0052;
        }
        finally {
            final Throwable t;
            AFLogger.valueOf(t.getMessage(), t);
        }
    }
    
    public final String AFKeystoreWrapper() {
        for (final d d : d.values()) {
            if (this.AFInAppEventParameterName(d.valueOf(d))) {
                return d.values(d);
            }
        }
        return d.values(d.valueOf);
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(2609);
        }
        
        Class<?> values(final String p0);
    }
    
    public enum d
    {
        AFInAppEventParameterName("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"), 
        AFInAppEventType("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"), 
        AFKeystoreWrapper("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"), 
        AFLogger$LogLevel("android_native_script", "com.tns.NativeScriptActivity"), 
        AFVersionDeclaration("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"), 
        AppsFlyer2dXConversionCallback("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"), 
        getLevel("android_segment", "com.segment.analytics.android.integrations.appsflyer.AppsflyerIntegration"), 
        init("android_mparticle", "com.mparticle.kits.AppsFlyerKit"), 
        onAppOpenAttributionNative("android_xamarin", "mono.android.Runtime"), 
        onDeepLinkingNative("android_unreal", "com.epicgames.ue4.GameActivity"), 
        onInstallConversionDataLoadedNative("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"), 
        valueOf("android_native", "android_native"), 
        values("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity");
        
        public String onAttributionFailureNative;
        public String onInstallConversionFailureNative;
        
        static {
            Covode.recordClassIndex(2610);
        }
        
        public d(final String onAttributionFailureNative, final String onInstallConversionFailureNative) {
            this.onAttributionFailureNative = onAttributionFailureNative;
            this.onInstallConversionFailureNative = onInstallConversionFailureNative;
        }
        
        public static /* synthetic */ String valueOf(final d d) {
            return d.onInstallConversionFailureNative;
        }
        
        public static /* synthetic */ String values(final d d) {
            return d.onAttributionFailureNative;
        }
    }
}
