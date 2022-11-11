// 
// Decompiled by Procyon v0.6.0
// 

package ve2;

import org.json.JSONException;
import io.branch.referral.Defines$Jsonkey;
import io.branch.referral.Branch;
import android.content.Context;
import org.json.JSONObject;
import io.branch.referral.Defines$RequestPath;
import io.branch.referral.ServerRequest;

public final class j extends ServerRequest
{
    public j(final Defines$RequestPath defines$RequestPath, final JSONObject jsonObject, final Context context) {
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
        try {
            try {
                super.c.y("bnc_session_id", l.a().getString(Defines$Jsonkey.SessionID.getKey()));
                super.c.y("bnc_randomized_bundle_token", l.a().getString(Defines$Jsonkey.RandomizedBundleToken.getKey()));
                super.c.y("bnc_user_url", l.a().getString(Defines$Jsonkey.Link.getKey()));
                super.c.y("bnc_install_params", "bnc_no_value");
                super.c.x("bnc_no_value");
                super.c.y("bnc_identity", "bnc_no_value");
                super.c.b();
            }
            finally {}
        }
        catch (final JSONException ex) {
            ((Throwable)ex).printStackTrace();
        }
    }
}
