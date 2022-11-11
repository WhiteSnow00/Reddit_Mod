// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONException;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public abstract class 0bf
{
    static {
        Covode.recordClassIndex(5665);
    }
    
    public abstract JSONObject LIZ();
    
    public final JSONObject LIZ(Map<String, ?> iterator) {
        if (iterator == null) {
            return null;
        }
        final JSONObject jsonObject = new JSONObject();
        iterator = ((Map<String, ?>)iterator).entrySet().iterator();
        while (iterator.hasNext()) {
            try {
                final Map.Entry entry = iterator.next();
                jsonObject.put((String)entry.getKey(), entry.getValue());
            }
            catch (final Exception ex) {
                0II.LIZ(ex);
            }
        }
        return jsonObject;
    }
    
    public final void LIZ(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s) && !TextUtils.isEmpty((CharSequence)s2)) {
            1NI.LIZIZ(new 0bh(s, s2));
        }
    }
    
    public final void LIZ(final String s, final Map<String, ?> map) {
        if (!TextUtils.isEmpty((CharSequence)s) && map != null) {
            1NI.LIZIZ(new 0bg(this, s, map));
        }
    }
    
    public final void LIZ(final String s, final JSONObject jsonObject) {
        if (!TextUtils.isEmpty((CharSequence)s) && jsonObject != null) {
            1NI.LIZIZ(new 0bm(this, s, jsonObject));
        }
    }
    
    public final void LIZIZ(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s) && !TextUtils.isEmpty((CharSequence)s2)) {
            1NI.LIZIZ(new 0bn(s, s2));
        }
    }
    
    public final void LIZIZ(final String s, final Map<String, ?> map) {
        if (!TextUtils.isEmpty((CharSequence)s) && map != null) {
            1NI.LIZIZ(new 0bp(this, s, map));
        }
    }
    
    public final void LIZIZ(final String s, final JSONObject jsonObject) {
        if (!TextUtils.isEmpty((CharSequence)s) && jsonObject != null) {
            1NI.LIZIZ(new 0bo(this, s, jsonObject));
        }
    }
    
    public final void LIZJ(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s) && !TextUtils.isEmpty((CharSequence)s2)) {
            1NI.LIZIZ(new 0bi(s, s2));
        }
    }
    
    public final void LIZJ(final String s, final Map<String, ?> map) {
        if (!TextUtils.isEmpty((CharSequence)s) && map != null) {
            1NI.LIZIZ(new 0bk(this, s, map));
        }
    }
    
    public final void LIZJ(final String s, final JSONObject jsonObject) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        1NI.LIZIZ(new 0bj(this, s, jsonObject));
    }
    
    public final void LIZLLL(final String s, final JSONObject jsonObject) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        1NI.LIZIZ(new 0bl(this, s, jsonObject));
    }
    
    public final String LJ(String string, final JSONObject jsonObject) {
        final JSONObject jsonObject2 = new JSONObject();
        this.LIZ();
        try {
            jsonObject2.put("tag", (Object)string);
            jsonObject2.put("params", (Object)this.LIZ());
            if (jsonObject != null) {
                string = jsonObject.toString();
            }
            else {
                string = "";
            }
            jsonObject2.put("data", (Object)string);
        }
        catch (final JSONException ex) {
            0II.LIZ((Exception)ex);
        }
        return jsonObject2.toString();
    }
}
