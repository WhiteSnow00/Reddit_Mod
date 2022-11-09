// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public class 0d3
{
    static {
        Covode.recordClassIndex(5786);
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final double n) {
        try {
            jsonObject.put(s, n);
        }
        catch (final JSONException ex) {
            0ba.LIZ("BaseMonitor", "", (Throwable)ex);
        }
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final float n) {
        final double n2 = n;
        try {
            jsonObject.put(s, n2);
        }
        catch (final JSONException ex) {
            0ba.LIZ("BaseMonitor", "", (Throwable)ex);
        }
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final int n) {
        try {
            jsonObject.put(s, n);
        }
        catch (final JSONException ex) {
            0ba.LIZ("BaseMonitor", "", (Throwable)ex);
        }
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final long n) {
        try {
            jsonObject.put(s, n);
        }
        catch (final JSONException ex) {
            0ba.LIZ("BaseMonitor", "", (Throwable)ex);
        }
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final String s2) {
        try {
            jsonObject.put(s, (Object)s2);
        }
        catch (final JSONException ex) {
            0ba.LIZ("BaseMonitor", "", (Throwable)ex);
        }
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final JSONArray jsonArray) {
        try {
            jsonObject.put(s, (Object)jsonArray);
        }
        catch (final JSONException ex) {
            0ba.LIZ("BaseMonitor", "", (Throwable)ex);
        }
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final JSONObject jsonObject2) {
        try {
            jsonObject.put(s, (Object)jsonObject2);
        }
        catch (final JSONException ex) {
            0ba.LIZ("BaseMonitor", "", (Throwable)ex);
        }
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final boolean b) {
        try {
            jsonObject.put(s, b);
        }
        catch (final JSONException ex) {
            0ba.LIZ("BaseMonitor", "", (Throwable)ex);
        }
    }
}
