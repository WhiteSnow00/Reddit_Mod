// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import com.appsflyer.share.LinkGenerator;
import X.0II;
import java.io.DataOutputStream;
import com.appsflyer.internal.o;
import java.util.HashMap;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import javax.net.ssl.HttpsURLConnection;
import android.content.Context;
import com.appsflyer.internal.ai;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import com.appsflyer.internal.am;

public final class CreateOneLinkHttpTask extends am
{
    public ResponseListener AFInAppEventParameterName;
    public String AFKeystoreWrapper;
    public final Map<String, String> AFLogger$LogLevel;
    public final String getLevel;
    public String init;
    
    static {
        Covode.recordClassIndex(2550);
    }
    
    public CreateOneLinkHttpTask(final String afInAppEventType, final Map<String, String> afLogger$LogLevel, final ai ai, final Context context) {
        super(ai, context, "POST");
        this.init = "";
        if (context != null) {
            this.init = context.getPackageName();
        }
        else {
            AFLogger.AFLogger$LogLevel("CreateOneLinkHttpTask: context can't be null");
        }
        super.AFInAppEventType = afInAppEventType;
        this.getLevel = "-1";
        this.AFLogger$LogLevel = afLogger$LogLevel;
    }
    
    @Override
    public final void AFKeystoreWrapper(final HttpsURLConnection httpsURLConnection) {
        MethodCollector.i(495);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        final HashMap hashMap = new HashMap();
        hashMap.put("ttl", this.getLevel);
        hashMap.put("uuid", super.AppsFlyer2dXConversionCallback);
        hashMap.put("data", this.AFLogger$LogLevel);
        hashMap.put("meta", super.AFVersionDeclaration);
        final String afKeystoreWrapper = this.AFKeystoreWrapper;
        if (afKeystoreWrapper != null) {
            hashMap.put("brand_domain", afKeystoreWrapper);
        }
        final String string = o.AFInAppEventParameterName(hashMap).toString();
        this.values(httpsURLConnection, super.valueOf, string);
        httpsURLConnection.connect();
        final DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(string);
        dataOutputStream.flush();
        dataOutputStream.close();
        MethodCollector.o(495);
    }
    
    @Override
    public final String valueOf() {
        final StringBuilder sb = new StringBuilder();
        sb.append(0II.LIZ(am.values, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName() }));
        sb.append("/");
        sb.append(super.AFInAppEventType);
        return sb.toString();
    }
    
    @Override
    public final void values() {
        final String string = AppsFlyerProperties.getInstance().getString("onelinkDomain");
        final LinkGenerator linkGenerator = new LinkGenerator("af_app_invites");
        linkGenerator.setBaseURL(super.AFInAppEventType, string, this.init);
        linkGenerator.addParameter("af_siteid", this.init);
        linkGenerator.addParameters(this.AFLogger$LogLevel);
        ai.valueOf();
        final String string2 = AppsFlyerProperties.getInstance().getString("AppUserId");
        if (string2 != null) {
            linkGenerator.setReferrerCustomerId(string2);
        }
        this.AFInAppEventParameterName.onResponse(linkGenerator.generateLink());
    }
    
    @Override
    public final void values(final String s) {
        try {
            final JSONObject jsonObject = new JSONObject(s);
            final Iterator keys = jsonObject.keys();
            while (keys.hasNext()) {
                this.AFInAppEventParameterName.onResponse(jsonObject.optString((String)keys.next()));
            }
        }
        catch (final JSONException ex) {
            this.AFInAppEventParameterName.onResponseError("Can't parse one link data");
            AFLogger.valueOf("Error while parsing to json ".concat(String.valueOf(s)), (Throwable)ex);
        }
    }
    
    public interface ResponseListener
    {
        default static {
            Covode.recordClassIndex(2551);
        }
        
        void onResponse(final String p0);
        
        void onResponseError(final String p0);
    }
}
