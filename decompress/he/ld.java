// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.zzty;
import org.json.JSONException;
import vd.h;
import org.json.JSONObject;

public final class ld implements cc
{
    public hd f;
    public String g;
    public String h;
    public long i;
    
    public final /* bridge */ cc a(final String s) throws zzty {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(s);
            vd.h.a(jsonObject.optString("email", (String)null));
            vd.h.a(jsonObject.optString("passwordHash", (String)null));
            jsonObject.optBoolean("emailVerified", false);
            vd.h.a(jsonObject.optString("displayName", (String)null));
            vd.h.a(jsonObject.optString("photoUrl", (String)null));
            this.f = hd.g(jsonObject.optJSONArray("providerUserInfo"));
            this.g = vd.h.a(jsonObject.optString("idToken", (String)null));
            this.h = vd.h.a(jsonObject.optString("refreshToken", (String)null));
            this.i = jsonObject.optLong("expiresIn", 0L);
            return (cc)this;
        }
        catch (final NullPointerException jsonObject) {}
        catch (final JSONException ex) {}
        throw a.a((Exception)jsonObject, "ld", s);
    }
}
