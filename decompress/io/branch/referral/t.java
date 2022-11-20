// 
// Decompiled by Procyon v0.6.0
// 

package io.branch.referral;

import qe2.m;
import ai2.h;
import qe2.c;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;

public final class t extends r
{
    public t(final Context context, final Branch$d j, final boolean b) {
        super(context, Defines$RequestPath.RegisterInstall, b);
        super.j = j;
        try {
            this.m(new JSONObject());
        }
        catch (final JSONException ex) {
            ((Throwable)ex).printStackTrace();
            ((ServerRequest)this).g = true;
        }
    }
    
    public t(final Defines$RequestPath defines$RequestPath, final JSONObject jsonObject, final Context context, final boolean b) {
        super(defines$RequestPath, jsonObject, context, b);
    }
    
    public final void b() {
        super.j = null;
    }
    
    public final void f(final int n, final String s) {
        if (super.j != null) {
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
        final long i = ((ServerRequest)this).c.i("bnc_referrer_click_ts");
        final long j = ((ServerRequest)this).c.i("bnc_install_begin_ts");
        Label_0045: {
            if (i <= 0L) {
                break Label_0045;
            }
            try {
                ((ServerRequest)this).a.put(Defines$Jsonkey.ClickedReferrerTimeStamp.getKey(), i);
                if (j > 0L) {
                    ((ServerRequest)this).a.put(Defines$Jsonkey.InstallBeginTimeStamp.getKey(), j);
                }
                if (!h.a.equals("bnc_no_value")) {
                    ((ServerRequest)this).a.put(Defines$Jsonkey.LinkClickID.getKey(), (Object)h.a);
                }
            }
            catch (final JSONException ex) {}
        }
    }
    
    public final void j(final m m, final Branch branch) {
        super.j(m, branch);
        try {
            ((ServerRequest)this).c.y("bnc_user_url", m.a().getString(Defines$Jsonkey.Link.getKey()));
            final JSONObject a = m.a();
            final Defines$Jsonkey data = Defines$Jsonkey.Data;
            if (a.has(data.getKey())) {
                final JSONObject jsonObject = new JSONObject(m.a().getString(data.getKey()));
                final Defines$Jsonkey clicked_Branch_Link = Defines$Jsonkey.Clicked_Branch_Link;
                if (jsonObject.has(clicked_Branch_Link.getKey()) && jsonObject.getBoolean(clicked_Branch_Link.getKey()) && ((ServerRequest)this).c.p("bnc_install_params").equals("bnc_no_value")) {
                    ((ServerRequest)this).c.y("bnc_install_params", m.a().getString(data.getKey()));
                }
            }
            final JSONObject a2 = m.a();
            final Defines$Jsonkey linkClickID = Defines$Jsonkey.LinkClickID;
            if (a2.has(linkClickID.getKey())) {
                ((ServerRequest)this).c.t(m.a().getString(linkClickID.getKey()));
            }
            else {
                ((ServerRequest)this).c.t("bnc_no_value");
            }
            if (m.a().has(data.getKey())) {
                ((ServerRequest)this).c.x(m.a().getString(data.getKey()));
            }
            else {
                ((ServerRequest)this).c.x("bnc_no_value");
            }
            final Branch$d j = super.j;
            if (j != null) {
                j.a((c)null, branch.j());
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
        return "install";
    }
}
