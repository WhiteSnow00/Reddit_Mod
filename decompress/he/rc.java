// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.android.gms.internal.firebase_auth_api.zzty;

public final class rc implements cc
{
    public String f;
    
    public final /* bridge */ cc a(final String s) throws zzty {
        this.b(s);
        return (cc)this;
    }
    
    public final void b(final String s) throws zzty {
        Object string = null;
        try {
            string = new JSONObject(s);
            string = ((JSONObject)string).getString("error");
            final JSONObject jsonObject = new JSONObject((String)string);
            jsonObject.getInt("code");
            this.f = jsonObject.getString("message");
            return;
        }
        catch (final NullPointerException string) {}
        catch (final JSONException ex) {}
        final String message = ((Throwable)string).getMessage();
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse error for string [");
        sb.append(s);
        sb.append("] with exception: ");
        sb.append(message);
        Log.e("he.rc", sb.toString());
        throw new zzty(a.n("Failed to parse error for string [", s, "]"), (Throwable)string);
    }
}
