// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.zzty;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

public final class tc implements cc
{
    public String f;
    public String g;
    public boolean h;
    public long i;
    public ArrayList j;
    public String k;
    
    public final /* bridge */ cc a(final String s) throws zzty {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(s);
            jsonObject.optString("localId", (String)null);
            jsonObject.optString("email", (String)null);
            this.f = jsonObject.optString("idToken", (String)null);
            this.g = jsonObject.optString("refreshToken", (String)null);
            this.h = jsonObject.optBoolean("isNewUser", false);
            this.i = jsonObject.optLong("expiresIn", 0L);
            this.j = dd.g(jsonObject.optJSONArray("mfaInfo"));
            this.k = jsonObject.optString("mfaPendingCredential", (String)null);
            return (cc)this;
        }
        catch (final NullPointerException jsonObject) {}
        catch (final JSONException ex) {}
        throw a.a((Exception)jsonObject, "tc", s);
    }
}
