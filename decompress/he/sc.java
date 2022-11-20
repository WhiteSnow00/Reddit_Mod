// 
// Decompiled by Procyon v0.6.0
// 

package he;

import org.json.JSONException;
import java.util.Map;
import org.json.JSONObject;
import mg.d0;
import hh.d;
import td.a;

public final class sc implements bc
{
    public final String f;
    public final String g;
    public final String h;
    
    static {
        new a(sc.class.getSimpleName(), new String[0]);
    }
    
    public sc(final d d, final String h) {
        final String f = d.f;
        d0.v(f);
        this.f = f;
        final String h2 = d.h;
        d0.v(h2);
        this.g = h2;
        this.h = h;
    }
    
    public final String zza() throws JSONException {
        final String g = this.g;
        final Map c = hh.a.c;
        d0.v(g);
        Object b = null;
        hh.a a;
        try {
            a = new hh.a(g);
        }
        catch (final IllegalArgumentException ex) {
            a = null;
        }
        String a2;
        if (a != null) {
            a2 = a.a;
        }
        else {
            a2 = null;
        }
        if (a != null) {
            b = a.b;
        }
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", (Object)this.f);
        if (a2 != null) {
            jsonObject.put("oobCode", (Object)a2);
        }
        if (b != null) {
            jsonObject.put("tenantId", b);
        }
        final String h = this.h;
        if (h != null) {
            jsonObject.put("idToken", (Object)h);
        }
        return jsonObject.toString();
    }
}
