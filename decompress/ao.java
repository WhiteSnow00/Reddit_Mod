// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.Iterator;
import org.json.JSONException;
import java.util.Map;
import org.json.JSONObject;
import java.util.HashMap;
import X.0II;
import com.appsflyer.AppsFlyerLib;
import javax.net.ssl.HttpsURLConnection;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import android.text.TextUtils;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

public final class ao extends am
{
    public c AFInAppEventParameterName;
    public boolean AFKeystoreWrapper;
    public String AFLogger$LogLevel;
    public String getLevel;
    
    static {
        Covode.recordClassIndex(2611);
    }
    
    public ao(final Uri uri, final ai ai, final Context context) {
        super(ai, context, "GET");
        if (!TextUtils.isEmpty((CharSequence)uri.getHost()) && !TextUtils.isEmpty((CharSequence)uri.getPath())) {
            final int n = 0;
            int n2 = 0;
            int n3 = 0;
            do {
                if (uri.getHost().contains((new String[] { "onelink.me", "onelnk.com", "app.aflink.com" })[n2])) {
                    n3 = 1;
                }
            } while (++n2 < 3);
            int n4 = n3;
            if (i.AppsFlyer2dXConversionCallback != null) {
                final StringBuilder sb = new StringBuilder("Validate if link ");
                sb.append(uri);
                sb.append(" belongs to custom domains: ");
                sb.append(Arrays.asList(i.AppsFlyer2dXConversionCallback));
                AFLogger.AFInAppEventParameterName(sb.toString());
                final String[] appsFlyer2dXConversionCallback = i.AppsFlyer2dXConversionCallback;
                final int length = appsFlyer2dXConversionCallback.length;
                int n5 = n;
                while (true) {
                    n4 = n3;
                    if (n5 >= length) {
                        break;
                    }
                    final String s = appsFlyer2dXConversionCallback[n5];
                    int n6 = n3;
                    if (uri.getHost().contains(s)) {
                        n6 = n3;
                        if (!TextUtils.isEmpty((CharSequence)s)) {
                            AFLogger.AFInAppEventType("Link matches custom domain: ".concat(String.valueOf(s)));
                            this.AFKeystoreWrapper = true;
                            n6 = 1;
                        }
                    }
                    ++n5;
                    n3 = n6;
                }
            }
            final String[] split = uri.getPath().split("/");
            if (n4 != 0 && split.length == 3) {
                super.AFInAppEventType = split[1];
                this.getLevel = split[2];
                this.AFLogger$LogLevel = uri.toString();
            }
        }
    }
    
    @Override
    public final void AFKeystoreWrapper(final HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestProperty("Af-UUID", super.AppsFlyer2dXConversionCallback);
        final String value = String.valueOf(super.AFVersionDeclaration.get("build_number"));
        httpsURLConnection.setRequestProperty("Af-Meta-Sdk-Ver", value);
        httpsURLConnection.setRequestProperty("Af-Meta-Counter", String.valueOf(super.AFVersionDeclaration.get("counter")));
        httpsURLConnection.setRequestProperty("Af-Meta-Model", String.valueOf(super.AFVersionDeclaration.get("model")));
        httpsURLConnection.setRequestProperty("Af-Meta-Platform", String.valueOf(super.AFVersionDeclaration.get("platformextension")));
        httpsURLConnection.setRequestProperty("Af-Meta-System-Version", String.valueOf(super.AFVersionDeclaration.get("sdk")));
        this.values(httpsURLConnection, super.valueOf, super.AppsFlyer2dXConversionCallback, super.AFInAppEventType, this.getLevel, value);
    }
    
    public final boolean AFKeystoreWrapper() {
        return !TextUtils.isEmpty((CharSequence)super.AFInAppEventType) && !TextUtils.isEmpty((CharSequence)this.getLevel) && !super.AFInAppEventType.equals("app");
    }
    
    @Override
    public final String valueOf() {
        final StringBuilder sb = new StringBuilder();
        sb.append(0II.LIZ(am.values, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName() }));
        sb.append("/");
        sb.append(super.AFInAppEventType);
        sb.append("?id=");
        sb.append(this.getLevel);
        return sb.toString();
    }
    
    @Override
    public final void values() {
        String afLogger$LogLevel = this.AFLogger$LogLevel;
        if (afLogger$LogLevel == null) {
            afLogger$LogLevel = "Can't get OneLink data";
        }
        this.AFInAppEventParameterName.AFKeystoreWrapper(afLogger$LogLevel);
    }
    
    @Override
    public final void values(final String s) {
        try {
            final HashMap hashMap = new HashMap();
            final JSONObject jsonObject = new JSONObject(s);
            final Iterator keys = jsonObject.keys();
            while (keys.hasNext()) {
                final String s2 = keys.next();
                hashMap.put(s2, jsonObject.optString(s2));
            }
            this.AFInAppEventParameterName.valueOf(hashMap);
        }
        catch (final JSONException ex) {
            this.AFInAppEventParameterName.AFKeystoreWrapper("Can't parse OneLink data");
            AFLogger.valueOf("Error while parsing to json ".concat(String.valueOf(s)), (Throwable)ex);
        }
    }
    
    public interface c
    {
        default static {
            Covode.recordClassIndex(2612);
        }
        
        void AFKeystoreWrapper(final String p0);
        
        void valueOf(final Map<String, String> p0);
    }
}
