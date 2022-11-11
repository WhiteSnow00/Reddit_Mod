// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;

public class GeneralParam
{
    public static GetNetWorkInfo sGetNetworkInfo;
    
    static {
        Covode.recordClassIndex(2798);
    }
    
    public static String convertMapToString(final HashMap<String, String> hashMap) {
        if (hashMap.isEmpty()) {
            return "";
        }
        final Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        final Map.Entry<String, V> entry = (Map.Entry<String, V>)iterator.next();
        final StringBuilder sb = new StringBuilder();
        sb.append(entry.getKey());
        sb.append("=");
        sb.append((String)entry.getValue());
        String s = sb.toString();
        while (iterator.hasNext()) {
            final Map.Entry<String, V> entry2 = (Map.Entry<String, V>)iterator.next();
            final String s2 = entry2.getKey();
            final String s3 = (String)entry2.getValue();
            if (!s2.isEmpty() && !s3.isEmpty()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s);
                sb2.append("&");
                sb2.append(s2);
                sb2.append("=");
                sb2.append(s3);
                s = sb2.toString();
            }
        }
        return s;
    }
    
    public static String getHeaderStr(final String s) {
        final GetNetWorkInfo sGetNetworkInfo = GeneralParam.sGetNetworkInfo;
        if (sGetNetworkInfo == null) {
            return "";
        }
        return convertMapToString(sGetNetworkInfo.getHeader(s));
    }
    
    public static String getParamByKey(String nativeGetParamByKey) {
        MethodCollector.i(2555);
        nativeGetParamByKey = nativeGetParamByKey(nativeGetParamByKey);
        MethodCollector.o(2555);
        return nativeGetParamByKey;
    }
    
    public static String getParamStr(final String s) {
        final GetNetWorkInfo sGetNetworkInfo = GeneralParam.sGetNetworkInfo;
        if (sGetNetworkInfo == null) {
            return "";
        }
        return convertMapToString(sGetNetworkInfo.getParam(s));
    }
    
    public static native String nativeGetParamByKey(final String p0);
    
    public static native void nativeSetParamWithKey(final String p0, final String p1);
    
    public static native void nativeSetParams(final HashMap<String, String> p0);
    
    public static void setNetWorkInfoCallback(final GetNetWorkInfo sGetNetworkInfo) {
        GeneralParam.sGetNetworkInfo = sGetNetworkInfo;
    }
    
    public static void setParamWithKey(final String s, final String s2) {
        MethodCollector.i(2542);
        nativeSetParamWithKey(s, s2);
        MethodCollector.o(2542);
    }
    
    public static void setParams(final HashMap<String, String> hashMap) {
        MethodCollector.i(2322);
        nativeSetParams(hashMap);
        MethodCollector.o(2322);
    }
    
    public interface GetNetWorkInfo
    {
        default static {
            Covode.recordClassIndex(2799);
        }
        
        HashMap<String, String> getHeader(final String p0);
        
        HashMap<String, String> getParam(final String p0);
    }
}
