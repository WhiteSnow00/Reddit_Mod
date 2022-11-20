// 
// Decompiled by Procyon v0.6.0
// 

package he;

import org.json.JSONException;
import org.json.JSONObject;
import mg.d0;

public final class td implements bc
{
    public final String f;
    public final String g;
    public final String h;
    
    public td(final String f, final String g, final String h) {
        d0.v(f);
        this.f = f;
        d0.v(g);
        this.g = g;
        this.h = h;
    }
    
    public final String zza() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", (Object)this.f);
        jsonObject.put("password", (Object)this.g);
        jsonObject.put("returnSecureToken", true);
        final String h = this.h;
        if (h != null) {
            jsonObject.put("tenantId", (Object)h);
        }
        return jsonObject.toString();
    }
}
