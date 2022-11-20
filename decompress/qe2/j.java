// 
// Decompiled by Procyon v0.6.0
// 

package qe2;

import io.branch.referral.Branch;
import io.branch.referral.Defines$Jsonkey;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import org.json.JSONException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import android.util.Log;
import android.text.TextUtils;
import android.content.Context;
import org.json.JSONObject;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;

public final class j
{
    public static j g;
    public final SharedPreferences a;
    public SharedPreferences$Editor b;
    public final JSONObject c;
    public final JSONObject d;
    public final JSONObject e;
    public final e f;
    
    public j(final Context context) {
        this.c = new JSONObject();
        this.d = new JSONObject();
        this.e = new JSONObject();
        this.f = new e();
        final SharedPreferences sharedPreferences = context.getSharedPreferences("branch_referral_shared_pref", 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }
    
    public static void a(final String s, final Exception ex) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            Log.e("BranchSDK", s, (Throwable)ex);
        }
    }
    
    public static j g(final Context context) {
        if (j.g == null) {
            j.g = new j(context);
        }
        return j.g;
    }
    
    public final void b() {
        for (final String s : this.c()) {
            final ArrayList<String> c = this.c();
            if (!c.contains(s)) {
                c.add(s);
                this.r(c);
            }
            this.b.putInt(b.l("bnc_total_base_", s), 0).apply();
            final StringBuilder sb = new StringBuilder();
            sb.append("bnc_balance_base_");
            sb.append(s);
            this.b.putInt(sb.toString(), 0).apply();
        }
        this.r(new ArrayList<String>());
    }
    
    public final ArrayList<String> c() {
        final String p = this.p("bnc_actions");
        if (p.equals("bnc_no_value")) {
            return new ArrayList<String>();
        }
        final ArrayList list = new ArrayList();
        Collections.addAll(list, p.split(","));
        return list;
    }
    
    public final boolean d(final String s) {
        return this.a.getBoolean(s, false);
    }
    
    public final String e() {
        return this.p("bnc_branch_key");
    }
    
    public final String f(String string) {
        if (string == null) {
            return null;
        }
        try {
            string = this.d.get(string).toString();
            return string;
        }
        catch (final JSONException ex) {
            return null;
        }
    }
    
    public final int h(final int n, final String s) {
        return this.a.getInt(s, n);
    }
    
    public final long i(final String s) {
        return this.a.getLong(s, 0L);
    }
    
    public final String j() {
        final String p = this.p("bnc_randomized_bundle_token");
        if (!TextUtils.isEmpty((CharSequence)p) && !p.equals("bnc_no_value")) {
            return p;
        }
        return this.p("bnc_identity_id");
    }
    
    public final String k() {
        final String p = this.p("bnc_randomized_device_token");
        if (!TextUtils.isEmpty((CharSequence)p) && !p.equals("bnc_no_value")) {
            return p;
        }
        return this.p("bnc_device_fingerprint_id");
    }
    
    public final String l() {
        final String p = this.p("bnc_gclid_json_object");
        if (p.equals("bnc_no_value")) {
            return "bnc_no_value";
        }
        String string = null;
        try {
            final JSONObject jsonObject = new JSONObject(p);
            if ((long)jsonObject.get("bnc_gclid_expiration_date") - System.currentTimeMillis() > 0L) {
                string = jsonObject.getString("bnc_gclid_value");
            }
            else {
                this.b.remove("bnc_gclid_json_object").apply();
            }
        }
        catch (final JSONException ex) {
            this.b.remove("bnc_gclid_json_object").apply();
            ((Throwable)ex).printStackTrace();
        }
        return string;
    }
    
    public final int m() {
        return this.h(3, "bnc_retry_count");
    }
    
    public final int n() {
        return this.h(1000, "bnc_retry_interval");
    }
    
    public final String o() {
        return this.p("bnc_session_id");
    }
    
    public final String p(final String s) {
        return this.a.getString(s, "bnc_no_value");
    }
    
    public final void q(final JSONObject jsonObject) throws JSONException {
        final e f = this.f;
        final JSONObject jsonObject2 = new JSONObject();
        for (final Map.Entry<K, ConcurrentHashMap> entry : f.a.entrySet()) {
            final JSONObject jsonObject3 = new JSONObject();
            for (final Map.Entry<String, V> entry2 : entry.getValue().entrySet()) {
                jsonObject3.put((String)entry2.getKey(), (Object)entry2.getValue());
            }
            jsonObject2.put((String)entry.getKey(), (Object)jsonObject3);
        }
        jsonObject.put(Defines$Jsonkey.PartnerData.getKey(), (Object)jsonObject2);
    }
    
    public final void r(final ArrayList<String> list) {
        if (list.size() == 0) {
            this.y("bnc_actions", "bnc_no_value");
        }
        else {
            final Iterator iterator = list.iterator();
            String n = "";
            while (iterator.hasNext()) {
                n = a.n(n, (String)iterator.next(), ",");
            }
            this.y("bnc_actions", n.substring(0, n.length() - 1));
        }
    }
    
    public final void s(final String s) {
        if (!this.p("bnc_branch_key").equals(s)) {
            final String p = this.p("bnc_link_click_id");
            final String p2 = this.p("bnc_link_click_identifier");
            final String p3 = this.p("bnc_app_link");
            final String p4 = this.p("bnc_push_identifier");
            this.b.clear();
            this.t(p);
            this.u(p2);
            this.y("bnc_app_link", p3);
            this.y("bnc_push_identifier", p4);
            this.b.apply();
            this.y("bnc_branch_key", s);
            if (Branch.i() != null) {
                Branch.i().h.clear();
                Branch.i().f.a();
            }
        }
    }
    
    public final void t(final String s) {
        this.y("bnc_link_click_id", s);
    }
    
    public final void u(final String s) {
        this.y("bnc_link_click_identifier", s);
    }
    
    public final void v(final long n, final String s) {
        this.b.putLong(s, n).apply();
    }
    
    public final void w(final String s) {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("bnc_gclid_value", (Object)s);
            jsonObject.put("bnc_gclid_expiration_date", System.currentTimeMillis() + this.a.getLong("bnc_gclid_expiration_window", 2592000000L));
            this.y("bnc_gclid_json_object", jsonObject.toString());
        }
        catch (final JSONException ex) {
            ((Throwable)ex).printStackTrace();
        }
    }
    
    public final void x(final String s) {
        this.y("bnc_session_params", s);
    }
    
    public final void y(final String s, final String s2) {
        this.b.putString(s, s2).apply();
    }
}
