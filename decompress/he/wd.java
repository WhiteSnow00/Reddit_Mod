// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.zzty;
import org.json.JSONException;
import vd.h;
import org.json.JSONObject;

public final class wd implements cc
{
    public String f;
    public String g;
    public long h;
    public boolean i;
    public String j;
    public String k;
    
    public final /* bridge */ cc a(final String s) throws zzty {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(s);
            this.f = vd.h.a(jsonObject.optString("idToken", (String)null));
            this.g = vd.h.a(jsonObject.optString("refreshToken", (String)null));
            this.h = jsonObject.optLong("expiresIn", 0L);
            vd.h.a(jsonObject.optString("localId", (String)null));
            this.i = jsonObject.optBoolean("isNewUser", false);
            this.j = vd.h.a(jsonObject.optString("temporaryProof", (String)null));
            this.k = vd.h.a(jsonObject.optString("phoneNumber", (String)null));
            return (cc)this;
        }
        catch (final NullPointerException jsonObject) {}
        catch (final JSONException ex) {}
        throw a.a((Exception)jsonObject, "wd", s);
    }
}
