// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.deeplink;

import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import java.util.Collection;
import java.util.Arrays;
import java.util.Map;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class DeepLink
{
    public final JSONObject values;
    
    static {
        Covode.recordClassIndex(2559);
    }
    
    public DeepLink(final JSONObject values) {
        this.values = values;
    }
    
    public static DeepLink AFKeystoreWrapper(final Map<String, String> map) {
        final Set<String> keySet = map.keySet();
        keySet.removeAll(Arrays.asList("install_time", "path", "scheme", "host", "pid", "c", "af_prt", "af_mp", "clickid", "af_siteid", "af_sub_siteid", "af_c_id", "af_adset", "af_adset_id", "af_ad", "af_ad_id", "af_ad_type", "af_click_lookback", "af_viewthrough_lookback", "af_channel", "af_keywords", "af_cost_model", "af_cost_currency", "af_cost_value", "af_r", "af_web_dp", "af_dp", "af_force_deeplink", "af_ref", "is_incentivized", "af_param_forwarding", "is_retargeting", "af_reengagement_window", "is_branded_link", "is_universal_link", "esp_name", "af_generated_clk", "transaction_id", "af_fp_lookback_window", "af_vt_fp_lookback_window", "af_fp_priority", "af_generate_clk", "af_inactivity_window", "af_ol_red", "af_attr", "af_ol_lp", "af_blank_red", "af_source", "af_lp_src", "af_src_browser", "af_tranid", "af_wrt_clk", "af_ua", "af_ip", "af_lang", "advertising_id", "sha1_advertising_id", "md5_advertising_id", "android_id", "sha1_android_id", "md5_android_id", "imei", "sha1_imei", "md5_imei", "oaid", "sha1_oaid", "md5_oaid", "af_android_url", "sha1_el", "fire_advertising_id", "sha1_fire_advertising_id", "idfa", "md5_idfa", "af_ios_url", "af_ios_fallback", "sha1_idfa", "mac", "sha1_mac", "af_banner", "af_slk_web_endpoint", "af_chrome_lp", "af_android_custom_url", "af_ios_custom_url", "af_enc_data", "engmnt_source", "redirect_response_data", "shortlink", "advertiserId", "sha1_advertiserId", "advertiser_id", "sha1_advertiser_id", "muid", "idfv", "md5_idfv", "sha1_idfv", "af_installpostback", "http_referrer", "af_model", "af_os", "md5_advertiserId", "af_video_total_length", "af_video_played_length", "af_playable_played_length", "af_ad_time_viewed", "af_ad_displayed_percent", "af_audio_total_length", "af_audio_played_length", "link", "af_status", "af_web_id", "af_deeplink"));
        final HashMap hashMap = new HashMap();
        for (final String next : keySet) {
            hashMap.put(next, map.get(next));
        }
        return AFKeystoreWrapper(new JSONObject((Map)hashMap));
    }
    
    public static DeepLink AFKeystoreWrapper(final JSONObject jsonObject) {
        final JSONObject optJSONObject = jsonObject.optJSONObject("custom_params");
        if (optJSONObject != null) {
            jsonObject.remove("custom_params");
            final Iterator keys = optJSONObject.keys();
            while (keys.hasNext()) {
                final String s = keys.next();
                jsonObject.put(s, optJSONObject.opt(s));
            }
        }
        return new DeepLink(jsonObject);
    }
    
    public String getAfSub1() {
        Object opt;
        if ((opt = this.values.opt("af_sub1")) == JSONObject.NULL) {
            opt = null;
        }
        return (String)opt;
    }
    
    public String getAfSub2() {
        Object opt;
        if ((opt = this.values.opt("af_sub2")) == JSONObject.NULL) {
            opt = null;
        }
        return (String)opt;
    }
    
    public String getAfSub3() {
        Object opt;
        if ((opt = this.values.opt("af_sub3")) == JSONObject.NULL) {
            opt = null;
        }
        return (String)opt;
    }
    
    public String getAfSub4() {
        Object opt;
        if ((opt = this.values.opt("af_sub4")) == JSONObject.NULL) {
            opt = null;
        }
        return (String)opt;
    }
    
    public String getAfSub5() {
        Object opt;
        if ((opt = this.values.opt("af_sub5")) == JSONObject.NULL) {
            opt = null;
        }
        return (String)opt;
    }
    
    public String getCampaign() {
        Object opt;
        if ((opt = this.values.opt("campaign")) == JSONObject.NULL) {
            opt = null;
        }
        return (String)opt;
    }
    
    public String getCampaignId() {
        Object opt;
        if ((opt = this.values.opt("campaign_id")) == JSONObject.NULL) {
            opt = null;
        }
        return (String)opt;
    }
    
    public JSONObject getClickEvent() {
        return this.values;
    }
    
    public String getClickHttpReferrer() {
        Object opt;
        if ((opt = this.values.opt("click_http_referrer")) == JSONObject.NULL) {
            opt = null;
        }
        return (String)opt;
    }
    
    public String getDeepLinkValue() {
        Object opt;
        if ((opt = this.values.opt("deep_link_value")) == JSONObject.NULL) {
            opt = null;
        }
        return (String)opt;
    }
    
    public String getMatchType() {
        Object opt;
        if ((opt = this.values.opt("match_type")) == JSONObject.NULL) {
            opt = null;
        }
        return (String)opt;
    }
    
    public String getMediaSource() {
        Object opt;
        if ((opt = this.values.opt("media_source")) == JSONObject.NULL) {
            opt = null;
        }
        return (String)opt;
    }
    
    public String getStringValue(final String s) {
        final Object opt = this.values.opt(s);
        if (opt != JSONObject.NULL && opt != null) {
            return String.valueOf(opt);
        }
        return null;
    }
    
    public Boolean isDeferred() {
        Object opt;
        if ((opt = this.values.opt("is_deferred")) == JSONObject.NULL) {
            opt = null;
        }
        return (Boolean)opt;
    }
    
    @Override
    public String toString() {
        return this.values.toString();
    }
}
