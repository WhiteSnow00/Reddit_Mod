// 
// Decompiled by Procyon v0.6.0
// 

package io.branch.referral;

import qe2.m;
import qe2.c;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;

public final class u extends r
{
    public u(final Context context, final Branch$d j, final boolean b) {
        super(context, Defines$RequestPath.RegisterOpen, b);
        super.j = j;
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put(Defines$Jsonkey.RandomizedDeviceToken.getKey(), (Object)((ServerRequest)this).c.k());
            jsonObject.put(Defines$Jsonkey.RandomizedBundleToken.getKey(), (Object)((ServerRequest)this).c.j());
            this.m(jsonObject);
        }
        catch (final JSONException ex) {
            ((Throwable)ex).printStackTrace();
            ((ServerRequest)this).g = true;
        }
    }
    
    public u(final Defines$RequestPath defines$RequestPath, final JSONObject jsonObject, final Context context, final boolean b) {
        super(defines$RequestPath, jsonObject, context, b);
    }
    
    public final void b() {
        super.j = null;
    }
    
    public final void f(final int n, final String s) {
        if (super.j != null && !Boolean.parseBoolean(Branch.i().m.get(Defines$Jsonkey.InstantDeepLinkSession.getKey()))) {
            final JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("error_message", (Object)"Trouble reaching server. Please try again in a few minutes");
            }
            catch (final JSONException ex) {
                ((Throwable)ex).printStackTrace();
            }
            super.j.a(new c(b.l("Trouble initializing Branch. ", s), n), jsonObject);
        }
    }
    
    public final void g() {
    }
    
    public final void i() {
        super.i();
        if (Branch.i().t) {
            final Branch$d j = super.j;
            if (j != null) {
                j.a((c)null, Branch.i().j());
            }
            Branch.i().a(Defines$Jsonkey.InstantDeepLinkSession.getKey(), "true");
            Branch.i().t = false;
        }
    }
    
    public final void j(final m m, final Branch branch) {
        super.j(m, branch);
        try {
            final JSONObject a = m.a();
            final Defines$Jsonkey linkClickID = Defines$Jsonkey.LinkClickID;
            if (a.has(linkClickID.getKey())) {
                ((ServerRequest)this).c.t(m.a().getString(linkClickID.getKey()));
            }
            else {
                ((ServerRequest)this).c.t("bnc_no_value");
            }
            final JSONObject a2 = m.a();
            final Defines$Jsonkey data = Defines$Jsonkey.Data;
            if (a2.has(data.getKey())) {
                ((ServerRequest)this).c.x(m.a().getString(data.getKey()));
            }
            else {
                ((ServerRequest)this).c.x("bnc_no_value");
            }
            if (super.j != null && !Boolean.parseBoolean(Branch.i().m.get(Defines$Jsonkey.InstantDeepLinkSession.getKey()))) {
                super.j.a((c)null, branch.j());
            }
            ((ServerRequest)this).c.y("bnc_app_version", k.c().a());
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        r.t(branch);
    }
    
    public final boolean n() {
        return true;
    }
    
    public final String r() {
        return "open";
    }
}
