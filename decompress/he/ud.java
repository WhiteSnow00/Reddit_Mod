// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.zzty;
import org.json.JSONException;
import vd.h;
import org.json.JSONObject;
import java.util.ArrayList;

public final class ud implements cc
{
    public String f;
    public String g;
    public long h;
    public ArrayList i;
    public String j;
    
    public final /* bridge */ cc a(final String s) throws zzty {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(s);
            vd.h.a(jsonObject.optString("localId", (String)null));
            vd.h.a(jsonObject.optString("email", (String)null));
            vd.h.a(jsonObject.optString("displayName", (String)null));
            this.f = vd.h.a(jsonObject.optString("idToken", (String)null));
            vd.h.a(jsonObject.optString("photoUrl", (String)null));
            this.g = vd.h.a(jsonObject.optString("refreshToken", (String)null));
            this.h = jsonObject.optLong("expiresIn", 0L);
            this.i = dd.g(jsonObject.optJSONArray("mfaInfo"));
            this.j = jsonObject.optString("mfaPendingCredential", (String)null);
            return (cc)this;
        }
        catch (final NullPointerException jsonObject) {}
        catch (final JSONException ex) {}
        throw a.a((Exception)jsonObject, "ud", s);
    }
}
