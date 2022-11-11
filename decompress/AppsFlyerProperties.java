// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer;

import android.content.SharedPreferences;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import com.appsflyer.internal.ai;
import android.content.Context;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.46U;
import android.os.Build$VERSION;
import X.3xs;
import android.content.SharedPreferences$Editor;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class AppsFlyerProperties
{
    public static AppsFlyerProperties AFInAppEventParameterName;
    public Map<String, Object> AFInAppEventType;
    public String AFKeystoreWrapper;
    public boolean valueOf;
    public boolean values;
    
    static {
        Covode.recordClassIndex(2548);
        AppsFlyerProperties.AFInAppEventParameterName = new AppsFlyerProperties();
    }
    
    public AppsFlyerProperties() {
        this.AFInAppEventType = new HashMap<String, Object>();
        this.values = false;
    }
    
    private boolean AFKeystoreWrapper() {
        return this.values;
    }
    
    public static void INVOKEINTERFACE_com_appsflyer_AppsFlyerProperties_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(final SharedPreferences$Editor sharedPreferences$Editor) {
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
    
    public static AppsFlyerProperties getInstance() {
        return AppsFlyerProperties.AFInAppEventParameterName;
    }
    
    public boolean getBoolean(String string, final boolean b) {
        string = this.getString(string);
        if (string == null) {
            return b;
        }
        return Boolean.valueOf(string);
    }
    
    public int getInt(String string, final int n) {
        string = this.getString(string);
        if (string == null) {
            return n;
        }
        return Integer.valueOf(string).intValue();
    }
    
    public long getLong(String string, final long n) {
        string = this.getString(string);
        if (string == null) {
            return n;
        }
        return Long.valueOf(string).longValue();
    }
    
    public Object getObject(final String s) {
        synchronized (this) {
            MethodCollector.i(1895);
            final Object value = this.AFInAppEventType.get(s);
            MethodCollector.o(1895);
            return value;
        }
    }
    
    public String getReferrer(final Context context) {
        final String afKeystoreWrapper = this.AFKeystoreWrapper;
        if (afKeystoreWrapper != null) {
            return afKeystoreWrapper;
        }
        if (this.getString("AF_REFERRER") != null) {
            return this.getString("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return ai.values(context).getString("referrer", (String)null);
    }
    
    public String getString(String s) {
        synchronized (this) {
            MethodCollector.i(116);
            s = this.AFInAppEventType.get(s);
            MethodCollector.o(116);
            return s;
        }
    }
    
    public boolean isEnableLog() {
        return this.getInt("logLevel", AFLogger.LogLevel.NONE.getLevel()) > AFLogger.LogLevel.NONE.getLevel();
    }
    
    public boolean isLogsDisabledCompletely() {
        return this.getBoolean("disableLogs", false);
    }
    
    public boolean isOtherSdkStringDisabled() {
        return this.getBoolean("disableOtherSdk", false);
    }
    
    public void loadProperties(final Context context) {
        synchronized (this) {
            MethodCollector.i(2918);
            if (this.AFKeystoreWrapper()) {
                MethodCollector.o(2918);
                return;
            }
            final String string = ai.values(context).getString("savedProperties", (String)null);
            if (string != null) {
                AFLogger.AFInAppEventType("Loading properties..");
                try {
                    final JSONObject jsonObject = new JSONObject(string);
                    final Iterator keys = jsonObject.keys();
                    while (keys.hasNext()) {
                        final String s = keys.next();
                        if (this.AFInAppEventType.get(s) == null) {
                            this.AFInAppEventType.put(s, jsonObject.getString(s));
                        }
                    }
                    this.values = true;
                }
                catch (final JSONException ex) {
                    AFLogger.valueOf("Failed loading properties", (Throwable)ex);
                }
                final StringBuilder sb = new StringBuilder("Done loading properties: ");
                sb.append(this.values);
                AFLogger.AFInAppEventType(sb.toString());
            }
            MethodCollector.o(2918);
        }
    }
    
    public void remove(final String s) {
        synchronized (this) {
            MethodCollector.i(5296);
            this.AFInAppEventType.remove(s);
            MethodCollector.o(5296);
        }
    }
    
    public void saveProperties(final SharedPreferences sharedPreferences) {
        synchronized (this) {
            MethodCollector.i(4212);
            INVOKEINTERFACE_com_appsflyer_AppsFlyerProperties_com_ss_android_ugc_aweme_lancet_SPLancet_applyProxy(sharedPreferences.edit().putString("savedProperties", new JSONObject((Map)this.AFInAppEventType).toString()));
            MethodCollector.o(4212);
        }
    }
    
    public void set(final String s, final int n) {
        synchronized (this) {
            MethodCollector.i(6133);
            this.AFInAppEventType.put(s, Integer.toString(n));
            MethodCollector.o(6133);
        }
    }
    
    public void set(final String s, final long n) {
        synchronized (this) {
            MethodCollector.i(6712);
            this.AFInAppEventType.put(s, Long.toString(n));
            MethodCollector.o(6712);
        }
    }
    
    public void set(final String s, final String s2) {
        synchronized (this) {
            MethodCollector.i(5813);
            this.AFInAppEventType.put(s, s2);
            MethodCollector.o(5813);
        }
    }
    
    public void set(final String s, final boolean b) {
        synchronized (this) {
            MethodCollector.i(7771);
            this.AFInAppEventType.put(s, Boolean.toString(b));
            MethodCollector.o(7771);
        }
    }
    
    public void set(final String s, final String[] array) {
        synchronized (this) {
            MethodCollector.i(6025);
            this.AFInAppEventType.put(s, array);
            MethodCollector.o(6025);
        }
    }
    
    public void setCustomData(final String s) {
        synchronized (this) {
            MethodCollector.i(41);
            this.AFInAppEventType.put("additionalCustomData", s);
            MethodCollector.o(41);
        }
    }
    
    public void setUserEmails(final String s) {
        synchronized (this) {
            MethodCollector.i(73);
            this.AFInAppEventType.put("userEmails", s);
            MethodCollector.o(73);
        }
    }
    
    public final boolean values() {
        return this.valueOf;
    }
    
    public enum EmailsCryptType
    {
        NONE(0), 
        SHA256(3);
        
        public final int values;
        
        static {
            Covode.recordClassIndex(2549);
        }
        
        public EmailsCryptType(final int values) {
            this.values = values;
        }
        
        public final int getValue() {
            return this.values;
        }
    }
}
