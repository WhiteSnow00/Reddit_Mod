// 
// Decompiled by Procyon v0.6.0
// 

package ve2;

import io.branch.referral.Branch;
import org.json.JSONException;
import io.branch.referral.Defines$Jsonkey;
import org.json.JSONObject;
import io.branch.referral.Defines$RequestPath;
import android.content.Context;
import io.branch.referral.ServerRequest;

public final class k extends ServerRequest
{
    public k(final Context context) {
        super(context, Defines$RequestPath.RegisterClose);
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put(Defines$Jsonkey.RandomizedDeviceToken.getKey(), (Object)super.c.k());
            jsonObject.put(Defines$Jsonkey.RandomizedBundleToken.getKey(), (Object)super.c.j());
            jsonObject.put(Defines$Jsonkey.SessionID.getKey(), (Object)super.c.o());
            if (!super.c.p("bnc_link_click_id").equals("bnc_no_value")) {
                jsonObject.put(Defines$Jsonkey.LinkClickID.getKey(), (Object)super.c.p("bnc_link_click_id"));
            }
            if (io.branch.referral.k.c() != null) {
                jsonObject.put(Defines$Jsonkey.AppVersion.getKey(), (Object)io.branch.referral.k.c().a());
            }
            this.m(jsonObject);
        }
        catch (final JSONException ex) {
            ((Throwable)ex).printStackTrace();
            super.g = true;
        }
    }
    
    public k(final Defines$RequestPath defines$RequestPath, final JSONObject jsonObject, final Context context) {
        super(defines$RequestPath, jsonObject, context);
    }
    
    public final void b() {
    }
    
    public final void f(final int n, final String s) {
    }
    
    public final void g() {
    }
    
    public final boolean h() {
        return false;
    }
    
    public final void j(final l l, final Branch branch) {
        super.c.x("bnc_no_value");
    }
}
