// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.share;

import com.appsflyer.internal.k;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import android.content.Context;
import java.util.Iterator;
import X.0II;
import com.appsflyer.internal.ai;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.co;
import java.io.UnsupportedEncodingException;
import com.appsflyer.AFLogger;
import java.net.URLEncoder;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class LinkGenerator
{
    public String AFInAppEventParameterName;
    public String AFInAppEventType;
    public String AFKeystoreWrapper;
    public String AFLogger$LogLevel;
    public String AFVersionDeclaration;
    public String AppsFlyer2dXConversionCallback;
    public String getLevel;
    public String init;
    public Map<String, String> onAttributionFailureNative;
    public String onDeepLinkingNative;
    public Map<String, String> onInstallConversionDataLoadedNative;
    public String onInstallConversionFailureNative;
    public String valueOf;
    public String values;
    
    static {
        Covode.recordClassIndex(2725);
    }
    
    public LinkGenerator(final String valueOf) {
        this.onAttributionFailureNative = new HashMap<String, String>();
        this.onInstallConversionDataLoadedNative = new HashMap<String, String>();
        this.valueOf = valueOf;
    }
    
    public static String AFInAppEventParameterName(final String s, final String s2) {
        try {
            return URLEncoder.encode(s, "utf8");
        }
        catch (final UnsupportedEncodingException ex) {
            final StringBuilder sb = new StringBuilder("Illegal ");
            sb.append(s2);
            sb.append(": ");
            sb.append(s);
            AFLogger.valueOf(sb.toString(), ex);
            return "";
        }
        finally {
            final Throwable t;
            AFLogger.valueOf(t);
            return "";
        }
    }
    
    private StringBuilder values() {
        final StringBuilder sb = new StringBuilder();
        final String afInAppEventParameterName = this.AFInAppEventParameterName;
        if (afInAppEventParameterName != null && afInAppEventParameterName.startsWith("http")) {
            sb.append(this.AFInAppEventParameterName);
        }
        else {
            sb.append(0II.LIZ(co.valueOf, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName() }));
        }
        if (this.AFKeystoreWrapper != null) {
            sb.append('/');
            sb.append(this.AFKeystoreWrapper);
        }
        this.onInstallConversionDataLoadedNative.put("pid", this.valueOf);
        sb.append('?');
        sb.append("pid=");
        sb.append(AFInAppEventParameterName(this.valueOf, "media source"));
        final String getLevel = this.getLevel;
        if (getLevel != null) {
            this.onInstallConversionDataLoadedNative.put("af_referrer_uid", getLevel);
            sb.append('&');
            sb.append("af_referrer_uid=");
            sb.append(AFInAppEventParameterName(this.getLevel, "referrerUID"));
        }
        final String values = this.values;
        if (values != null) {
            this.onInstallConversionDataLoadedNative.put("af_channel", values);
            sb.append('&');
            sb.append("af_channel=");
            sb.append(AFInAppEventParameterName(this.values, "channel"));
        }
        final String appsFlyer2dXConversionCallback = this.AppsFlyer2dXConversionCallback;
        if (appsFlyer2dXConversionCallback != null) {
            this.onInstallConversionDataLoadedNative.put("af_referrer_customer_id", appsFlyer2dXConversionCallback);
            sb.append('&');
            sb.append("af_referrer_customer_id=");
            sb.append(AFInAppEventParameterName(this.AppsFlyer2dXConversionCallback, "referrerCustomerId"));
        }
        final String afInAppEventType = this.AFInAppEventType;
        if (afInAppEventType != null) {
            this.onInstallConversionDataLoadedNative.put("c", afInAppEventType);
            sb.append('&');
            sb.append("c=");
            sb.append(AFInAppEventParameterName(this.AFInAppEventType, "campaign"));
        }
        final String afLogger$LogLevel = this.AFLogger$LogLevel;
        if (afLogger$LogLevel != null) {
            this.onInstallConversionDataLoadedNative.put("af_referrer_name", afLogger$LogLevel);
            sb.append('&');
            sb.append("af_referrer_name=");
            sb.append(AFInAppEventParameterName(this.AFLogger$LogLevel, "referrerName"));
        }
        final String afVersionDeclaration = this.AFVersionDeclaration;
        if (afVersionDeclaration != null) {
            this.onInstallConversionDataLoadedNative.put("af_referrer_image_url", afVersionDeclaration);
            sb.append('&');
            sb.append("af_referrer_image_url=");
            sb.append(AFInAppEventParameterName(this.AFVersionDeclaration, "referrerImageURL"));
        }
        if (this.onDeepLinkingNative != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(this.onDeepLinkingNative);
            final boolean endsWith = this.onDeepLinkingNative.endsWith("/");
            final String s = "";
            String s2;
            if (endsWith) {
                s2 = "";
            }
            else {
                s2 = "/";
            }
            sb2.append(s2);
            final String init = this.init;
            if (init != null) {
                sb2.append(init);
            }
            this.onInstallConversionDataLoadedNative.put("af_dp", sb2.toString());
            sb.append('&');
            sb.append("af_dp=");
            sb.append(AFInAppEventParameterName(this.onDeepLinkingNative, "baseDeeplink"));
            if (this.init != null) {
                String s3;
                if (this.onDeepLinkingNative.endsWith("/")) {
                    s3 = s;
                }
                else {
                    s3 = "%2F";
                }
                sb.append(s3);
                sb.append(AFInAppEventParameterName(this.init, "deeplinkPath"));
            }
        }
        for (final String s4 : this.onAttributionFailureNative.keySet()) {
            final String string = sb.toString();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(s4);
            sb3.append("=");
            sb3.append(AFInAppEventParameterName(this.onAttributionFailureNative.get(s4), s4));
            if (!string.contains(sb3.toString())) {
                sb.append('&');
                sb.append(s4);
                sb.append('=');
                sb.append(AFInAppEventParameterName(this.onAttributionFailureNative.get(s4), s4));
            }
        }
        return sb;
    }
    
    public LinkGenerator addParameter(final String s, final String s2) {
        this.onAttributionFailureNative.put(s, s2);
        return this;
    }
    
    public LinkGenerator addParameters(final Map<String, String> map) {
        if (map != null) {
            this.onAttributionFailureNative.putAll(map);
        }
        return this;
    }
    
    public String generateLink() {
        return this.values().toString();
    }
    
    public void generateLink(final Context context, final CreateOneLinkHttpTask.ResponseListener afInAppEventParameterName) {
        final String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        if (!this.onAttributionFailureNative.isEmpty()) {
            for (final Map.Entry<String, V> entry : this.onAttributionFailureNative.entrySet()) {
                this.onInstallConversionDataLoadedNative.put(entry.getKey(), (String)entry.getValue());
            }
        }
        this.values();
        final String onInstallConversionFailureNative = this.onInstallConversionFailureNative;
        final Map<String, String> onInstallConversionDataLoadedNative = this.onInstallConversionDataLoadedNative;
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.values("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        final CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, onInstallConversionDataLoadedNative, ai.valueOf(), context);
        createOneLinkHttpTask.AFInAppEventParameterName = afInAppEventParameterName;
        createOneLinkHttpTask.AFKeystoreWrapper = onInstallConversionFailureNative;
        if (k.values == null) {
            k.values = new k();
        }
        k.values.AFKeystoreWrapper().execute(createOneLinkHttpTask);
    }
    
    public String getBrandDomain() {
        return this.onInstallConversionFailureNative;
    }
    
    public String getCampaign() {
        return this.AFInAppEventType;
    }
    
    public String getChannel() {
        return this.values;
    }
    
    public String getMediaSource() {
        return this.valueOf;
    }
    
    public Map<String, String> getParameters() {
        return this.onAttributionFailureNative;
    }
    
    public LinkGenerator setBaseDeeplink(final String onDeepLinkingNative) {
        this.onDeepLinkingNative = onDeepLinkingNative;
        return this;
    }
    
    public LinkGenerator setBaseURL(final String s, final String s2, String s3) {
        if (s == null || s.length() <= 0) {
            this.AFInAppEventParameterName = 0II.LIZ("https://%s/%s", new Object[] { 0II.LIZ("%sapp.%s", new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName() }), s3 });
        }
        else {
            Label_0080: {
                if (s2 != null) {
                    s3 = s2;
                    if (s2.length() >= 5) {
                        break Label_0080;
                    }
                }
                s3 = "go.onelink.me";
            }
            this.AFInAppEventParameterName = 0II.LIZ("https://%s/%s", new Object[] { s3, s });
        }
        return this;
    }
    
    public LinkGenerator setBrandDomain(final String onInstallConversionFailureNative) {
        this.onInstallConversionFailureNative = onInstallConversionFailureNative;
        return this;
    }
    
    public LinkGenerator setCampaign(final String afInAppEventType) {
        this.AFInAppEventType = afInAppEventType;
        return this;
    }
    
    public LinkGenerator setChannel(final String values) {
        this.values = values;
        return this;
    }
    
    public LinkGenerator setDeeplinkPath(final String init) {
        this.init = init;
        return this;
    }
    
    public LinkGenerator setReferrerCustomerId(final String appsFlyer2dXConversionCallback) {
        this.AppsFlyer2dXConversionCallback = appsFlyer2dXConversionCallback;
        return this;
    }
    
    public LinkGenerator setReferrerImageURL(final String afVersionDeclaration) {
        this.AFVersionDeclaration = afVersionDeclaration;
        return this;
    }
    
    public LinkGenerator setReferrerName(final String afLogger$LogLevel) {
        this.AFLogger$LogLevel = afLogger$LogLevel;
        return this;
    }
    
    public LinkGenerator setReferrerUID(final String getLevel) {
        this.getLevel = getLevel;
        return this;
    }
}
