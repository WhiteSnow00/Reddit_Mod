// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer;

import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import com.appsflyer.deeplink.DeepLinkListener;

public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener
{
    static {
        Covode.recordClassIndex(2544);
    }
    
    private void AFInAppEventType(final String s, final String s2) {
        MethodCollector.i(695);
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("status", (Object)"failure");
            jsonObject.put("data", (Object)s2);
            final int hashCode = s.hashCode();
            if (hashCode != -1390007222) {
                if (hashCode == 1050716216 && s.equals("onInstallConversionFailure")) {
                    this.onInstallConversionFailureNative(jsonObject);
                    MethodCollector.o(695);
                    return;
                }
            }
            else if (s.equals("onAttributionFailure")) {
                this.onAttributionFailureNative(jsonObject);
            }
            MethodCollector.o(695);
        }
        catch (final JSONException ex) {
            ((Throwable)ex).printStackTrace();
            MethodCollector.o(695);
        }
    }
    
    @Override
    public void onAppOpenAttribution(final Map<String, String> map) {
        MethodCollector.i(6073);
        this.onAppOpenAttributionNative(map);
        MethodCollector.o(6073);
    }
    
    public native void onAppOpenAttributionNative(final Object p0);
    
    @Override
    public void onAttributionFailure(final String s) {
        this.AFInAppEventType("onInstallConversionFailure", s);
    }
    
    public native void onAttributionFailureNative(final Object p0);
    
    @Override
    public void onConversionDataFail(final String s) {
        this.AFInAppEventType("onAttributionFailure", s);
    }
    
    @Override
    public void onConversionDataSuccess(final Map<String, Object> map) {
        MethodCollector.i(5854);
        this.onInstallConversionDataLoadedNative(map);
        MethodCollector.o(5854);
    }
    
    @Override
    public void onDeepLinking(final DeepLinkResult deepLinkResult) {
        MethodCollector.i(6812);
        this.onDeepLinkingNative(deepLinkResult);
        MethodCollector.o(6812);
    }
    
    public native void onDeepLinkingNative(final DeepLinkResult p0);
    
    public native void onInstallConversionDataLoadedNative(final Object p0);
    
    public native void onInstallConversionFailureNative(final Object p0);
}
