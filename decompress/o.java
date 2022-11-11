// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.HashMap;
import X.5WL;
import java.util.Iterator;
import java.lang.reflect.Array;
import java.util.Collection;
import org.json.JSONException;
import java.util.Map;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import com.bytedance.covode.number.Covode;
import android.content.Context;

public final class o
{
    public final Context valueOf;
    
    static {
        Covode.recordClassIndex(2707);
    }
    
    public o() {
    }
    
    public o(final Context context) {
        this.valueOf = INVOKEVIRTUAL_com_appsflyer_internal_o_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
    }
    
    public static List<Object> AFInAppEventParameterName(final JSONArray jsonArray) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < jsonArray.length(); ++i) {
            final Object value = jsonArray.get(i);
            Object o;
            if (value instanceof JSONArray) {
                o = AFInAppEventParameterName((JSONArray)value);
            }
            else {
                o = value;
                if (value instanceof JSONObject) {
                    o = values((JSONObject)value);
                }
            }
            list.add(o);
        }
        return list;
    }
    
    public static JSONObject AFInAppEventParameterName(Map<String, ?> iterator) {
        final JSONObject jsonObject = new JSONObject();
        iterator = ((Map<String, ?>)iterator).entrySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return jsonObject;
            }
            final Map.Entry entry = iterator.next();
            final Object afKeystoreWrapper = AFKeystoreWrapper(entry.getValue());
            try {
                jsonObject.put((String)entry.getKey(), afKeystoreWrapper);
                continue;
            }
            catch (final JSONException ex) {}
        }
    }
    
    public static Object AFKeystoreWrapper(final Object o) {
        if (o == null) {
            return JSONObject.NULL;
        }
        Object null = o;
        if (!(o instanceof JSONArray)) {
            if (o instanceof JSONObject) {
                null = o;
            }
            else {
                if (o.equals(JSONObject.NULL)) {
                    return o;
                }
                JSONArray jsonArray;
                try {
                    if (o instanceof Collection) {
                        jsonArray = new JSONArray();
                        final Iterator iterator = ((Collection)o).iterator();
                        while (iterator.hasNext()) {
                            jsonArray.put(AFKeystoreWrapper(iterator.next()));
                        }
                    }
                    else {
                        if (o.getClass().isArray()) {
                            final int length = Array.getLength(o);
                            final JSONArray jsonArray2 = new JSONArray();
                            for (int i = 0; i < length; ++i) {
                                jsonArray2.put(AFKeystoreWrapper(Array.get(o, i)));
                            }
                            return jsonArray2;
                        }
                        if (o instanceof Map) {
                            return AFInAppEventParameterName((Map<String, ?>)o);
                        }
                        Object string = o;
                        if (!(o instanceof Boolean)) {
                            string = o;
                            if (!(o instanceof Byte)) {
                                string = o;
                                if (!(o instanceof Character)) {
                                    string = o;
                                    if (!(o instanceof Double)) {
                                        string = o;
                                        if (!(o instanceof Float)) {
                                            string = o;
                                            if (!(o instanceof Integer)) {
                                                string = o;
                                                if (!(o instanceof Long)) {
                                                    string = o;
                                                    if (!(o instanceof Short)) {
                                                        if (o instanceof String) {
                                                            string = o;
                                                        }
                                                        else {
                                                            string = o.toString();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return string;
                    }
                }
                catch (final Exception ex) {
                    null = JSONObject.NULL;
                    return null;
                }
                return jsonArray;
            }
        }
        return null;
    }
    
    public static Context INVOKEVIRTUAL_com_appsflyer_internal_o_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    public static Map<String, Object> values(final JSONObject jsonObject) {
        final HashMap hashMap = new HashMap();
        final Iterator keys = jsonObject.keys();
        while (keys.hasNext()) {
            final String s = keys.next();
            final Object value = jsonObject.get(s);
            Object o;
            if (value instanceof JSONArray) {
                o = AFInAppEventParameterName((JSONArray)value);
            }
            else {
                o = value;
                if (value instanceof JSONObject) {
                    o = values((JSONObject)value);
                }
            }
            hashMap.put(s, o);
        }
        return hashMap;
    }
}
