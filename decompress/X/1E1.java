// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collections;
import java.util.Map;
import java.util.Iterator;
import org.json.JSONArray;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.json.JSONObject;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class 1E1 implements 0Su
{
    public 0Re LIZ;
    
    static {
        Covode.recordClassIndex(4564);
    }
    
    public 1E1() {
        this.LIZ = new 1Di(1hk.LIZLLL().LIZIZ, "ad_tracker_c2s_store_v2_adym3");
        final 0Re ljff = 1hk.LIZLLL().LJFF;
        if (ljff != null && ljff.LIZJ("sp_c2s_store_version") < 2) {
            ljff.LIZIZ("sp_c2s_store_version");
            ljff.LIZJ();
        }
    }
    
    public static 1Dk LIZ(String optString) {
        if (TextUtils.isEmpty((CharSequence)optString)) {
            return null;
        }
        try {
            final JSONObject jsonObject = new JSONObject(optString);
            final String optString2 = jsonObject.optString("uuid");
            final String optString3 = jsonObject.optString("tracker_key");
            final long optLong = jsonObject.optLong("ad_id");
            final boolean optBoolean = jsonObject.optBoolean("is_standard");
            final long optLong2 = jsonObject.optLong("non_std_ad_id");
            final ArrayList list = new ArrayList();
            final JSONArray optJSONArray = jsonObject.optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); ++i) {
                    list.add(optJSONArray.getString(i));
                }
            }
            final String optString4 = jsonObject.optString("log_extra");
            final JSONObject optJSONObject = jsonObject.optJSONObject("ad_extra_data");
            try {
                final long optLong3 = jsonObject.optLong("create_timestamp");
                final String s = optString = jsonObject.optString("track_label");
                if (TextUtils.isEmpty((CharSequence)s)) {
                    optString = s;
                    if (jsonObject.has("track_type")) {
                        switch (jsonObject.optInt("track_type")) {
                            default: {
                                optString = "";
                                break;
                            }
                            case 0: {
                                optString = "show";
                                break;
                            }
                            case 1: {
                                optString = "play";
                                break;
                            }
                            case 2: {
                                optString = "click";
                                break;
                            }
                            case 4: {
                                optString = "play_valid";
                                break;
                            }
                            case 5: {
                                optString = "play_over";
                                break;
                            }
                            case 6: {
                                optString = "play_25";
                                break;
                            }
                            case 7: {
                                optString = "play_50";
                                break;
                            }
                            case 8: {
                                optString = "play_75";
                                break;
                            }
                            case 9: {
                                optString = "cpv_6s";
                                break;
                            }
                            case 10: {
                                optString = "cpv_15s";
                                break;
                            }
                        }
                    }
                }
                final int optInt = jsonObject.optInt("tried_count", 0);
                final boolean optBoolean2 = jsonObject.optBoolean("retry_when_network_available");
                final long optLong4 = jsonObject.optLong("expire_seconds", -1L);
                final JSONObject optJSONObject2 = jsonObject.optJSONObject("context_macro_map");
                Map<String, String> map2;
                if (optJSONObject2 != null) {
                    final Iterator keys = optJSONObject2.keys();
                    Map<String, String> map = null;
                    while (true) {
                        map2 = map;
                        if (!keys.hasNext()) {
                            break;
                        }
                        final String s2 = keys.next();
                        final String optString5 = optJSONObject2.optString(s2);
                        Map<String, String> map3;
                        if ((map3 = map) == null) {
                            map3 = new HashMap<String, String>();
                        }
                        map3.put(s2, optString5);
                        map = map3;
                    }
                }
                else {
                    map2 = null;
                }
                final 1Dk 1Dk = new 1Dk(optString2, optString3, optLong, list, optString, optBoolean, optLong2, optString4, optJSONObject, optInt, map2);
                1Dk.LJIIIIZZ = optLong3;
                1Dk.LJIIL = optBoolean2;
                1Dk.LJIILIIL = optLong4;
                return 1Dk;
            }
            finally {}
            return null;
        }
        finally {
            return null;
        }
    }
    
    public static String LIZLLL(final 1Dk 1Dk) {
        if (1Dk == null) {
            return "";
        }
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("uuid", (Object)1Dk.LIZ).put("tracker_key", (Object)1Dk.LIZIZ).put("ad_id", 1Dk.LIZJ).put("is_standard", 1Dk.LIZLLL).put("non_std_ad_id", 1Dk.LJ);
            final JSONArray jsonArray = new JSONArray();
            final List<String> ljff = 1Dk.LJFF;
            if (ljff != null) {
                final Iterator<String> iterator = ljff.iterator();
                while (iterator.hasNext()) {
                    jsonArray.put((Object)iterator.next());
                }
            }
            jsonObject.put("urls", (Object)jsonArray);
            jsonObject.put("log_extra", (Object)1Dk.LJI).put("ad_extra_data", (Object)1Dk.LJII).put("create_timestamp", 1Dk.LJIIIIZZ).put("track_label", (Object)1Dk.LJIIJ).put("tried_count", 1Dk.LJIIIZ).put("retry_when_network_available", 1Dk.LJIIL).put("expire_seconds", 1Dk.LJIILIIL);
            final Map<String, String> ljiijji = 1Dk.LJIIJJI;
            if (ljiijji != null && ljiijji.size()) {
                jsonObject.putOpt("context_macro_map", (Object)new JSONObject((Map)ljiijji));
            }
            return jsonObject.toString();
        }
        finally {
            return "";
        }
    }
    
    @Override
    public final List<1Dk> LIZ(final List<1Dk> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        final ArrayList list2 = new ArrayList();
        for (final 1Dk 1Dk : list) {
            if (!this.LIZ(1Dk)) {
                list2.add(1Dk);
            }
        }
        return list2;
    }
    
    @Override
    public final void LIZ() {
        final 0Re liz = this.LIZ;
        liz.LIZIZ();
        liz.LIZJ();
    }
    
    @Override
    public final void LIZ(final int n) {
    }
    
    @Override
    public final boolean LIZ(final 1Dk 1Dk) {
        if (1Dk == null || TextUtils.isEmpty((CharSequence)1Dk.LIZ)) {
            return false;
        }
        final String lizlll = LIZLLL(1Dk);
        if (TextUtils.isEmpty((CharSequence)lizlll)) {
            return false;
        }
        final 0Re liz = this.LIZ;
        liz.LIZ(1Dk.LIZ, lizlll);
        liz.LIZJ();
        return true;
    }
    
    @Override
    public final List<1Dk> LIZIZ() {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final Map<String, ?> liz = this.LIZ.LIZ();
        for (final String next : liz.keySet()) {
            final Object value = liz.get(next);
            if (value instanceof String) {
                final 1Dk liz2 = LIZ((String)value);
                if (liz2 != null) {
                    list.add(liz2);
                }
                else {
                    list2.add(next);
                }
            }
            else {
                list2.add(next);
            }
        }
        if (!list2.isEmpty()) {
            final Iterator iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                this.LIZ.LIZLLL((String)iterator2.next());
            }
            this.LIZ.LIZJ();
        }
        return list;
    }
    
    @Override
    public final void LIZIZ(final 1Dk 1Dk) {
        if (1Dk != null && !TextUtils.isEmpty((CharSequence)1Dk.LIZ)) {
            final String liz = 1Dk.LIZ;
            if (!TextUtils.isEmpty((CharSequence)liz)) {
                final 0Re liz2 = this.LIZ;
                liz2.LIZLLL(liz);
                liz2.LIZJ();
            }
        }
    }
    
    @Override
    public final List<1Dk> LIZJ() {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final Map<String, ?> liz = this.LIZ.LIZ();
        for (final String next : liz.keySet()) {
            final Object value = liz.get(next);
            if (value instanceof String) {
                final 1Dk liz2 = LIZ((String)value);
                if (liz2 != null) {
                    if (liz2.LJIIIZ <= 0) {
                        continue;
                    }
                    list.add(liz2);
                }
                else {
                    list2.add(next);
                }
            }
            else {
                list2.add(next);
            }
        }
        if (!list2.isEmpty()) {
            final Iterator iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                this.LIZ.LIZLLL((String)iterator2.next());
            }
            this.LIZ.LIZJ();
        }
        return list;
    }
    
    @Override
    public final void LIZJ(final 1Dk 1Dk) {
        this.LIZ(1Dk);
    }
    
    @Override
    public final void LIZLLL() {
        this.LIZ.LIZJ();
        this.LIZ = null;
    }
}
