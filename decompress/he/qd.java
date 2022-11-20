// 
// Decompiled by Procyon v0.6.0
// 

package he;

import mg.d0;
import android.text.TextUtils;
import hh.y;
import com.google.android.gms.internal.firebase_auth_api.zzty;
import org.json.JSONException;
import vd.h;
import org.json.JSONObject;
import java.util.ArrayList;

public final class qd implements cc
{
    public boolean f;
    public String g;
    public String h;
    public long i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public ArrayList t;
    public String u;
    
    public final /* bridge */ cc a(final String s) throws zzty {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(s);
            this.f = jsonObject.optBoolean("needConfirmation", false);
            jsonObject.optBoolean("needEmail", false);
            this.g = vd.h.a(jsonObject.optString("idToken", (String)null));
            this.h = vd.h.a(jsonObject.optString("refreshToken", (String)null));
            this.i = jsonObject.optLong("expiresIn", 0L);
            vd.h.a(jsonObject.optString("localId", (String)null));
            this.j = vd.h.a(jsonObject.optString("email", (String)null));
            vd.h.a(jsonObject.optString("displayName", (String)null));
            vd.h.a(jsonObject.optString("photoUrl", (String)null));
            this.k = vd.h.a(jsonObject.optString("providerId", (String)null));
            this.l = vd.h.a(jsonObject.optString("rawUserInfo", (String)null));
            this.m = jsonObject.optBoolean("isNewUser", false);
            this.n = jsonObject.optString("oauthAccessToken", (String)null);
            this.o = jsonObject.optString("oauthIdToken", (String)null);
            this.q = vd.h.a(jsonObject.optString("errorMessage", (String)null));
            this.r = vd.h.a(jsonObject.optString("pendingToken", (String)null));
            this.s = vd.h.a(jsonObject.optString("tenantId", (String)null));
            this.t = dd.g(jsonObject.optJSONArray("mfaInfo"));
            this.u = vd.h.a(jsonObject.optString("mfaPendingCredential", (String)null));
            this.p = vd.h.a(jsonObject.optString("oauthTokenSecret", (String)null));
            return (cc)this;
        }
        catch (final NullPointerException jsonObject) {}
        catch (final JSONException ex) {}
        throw a.a((Exception)jsonObject, "qd", s);
    }
    
    public final y b() {
        if (TextUtils.isEmpty((CharSequence)this.n) && TextUtils.isEmpty((CharSequence)this.o)) {
            return null;
        }
        final String k = this.k;
        final String o = this.o;
        final String n = this.n;
        final String r = this.r;
        final String p = this.p;
        d0.w("Must specify a non-empty providerId", k);
        if (TextUtils.isEmpty((CharSequence)o) && TextUtils.isEmpty((CharSequence)n)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new y(k, o, n, (od)null, r, p, (String)null);
    }
}
