// 
// Decompiled by Procyon v0.6.0
// 

package he;

import org.json.JSONException;
import android.text.TextUtils;
import org.json.JSONObject;

public final class vd implements bc
{
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    
    public final String zza() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        if (!TextUtils.isEmpty((CharSequence)this.i)) {
            jsonObject.put("phoneNumber", (Object)this.f);
            jsonObject.put("temporaryProof", (Object)this.i);
        }
        else {
            jsonObject.put("sessionInfo", (Object)this.g);
            jsonObject.put("code", (Object)this.h);
        }
        final String j = this.j;
        if (j != null) {
            jsonObject.put("idToken", (Object)j);
        }
        if (!this.k) {
            jsonObject.put("operation", 2);
        }
        return jsonObject.toString();
    }
}
