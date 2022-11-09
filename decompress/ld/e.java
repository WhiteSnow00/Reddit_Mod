// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.android.gms.common.api.Status;
import qd.a1;
import qd.o;
import ud.a;

public final class e implements Runnable
{
    public static final a h;
    public final String f;
    public final o g;
    
    static {
        h = new a("RevokeAccessOperation", new String[0]);
    }
    
    public e(final String f) {
        yd.a.P0(f);
        this.f = f;
        this.g = new o((a1)null);
    }
    
    @Override
    public final void run() {
        Status m;
        Status status;
        Status k = status = (m = Status.m);
        try {
            m = k;
            status = k;
            final String value = String.valueOf(this.f);
            m = k;
            status = k;
            String concat;
            if (value.length() != 0) {
                m = k;
                status = k;
                concat = "https://accounts.google.com/o/oauth2/revoke?token=".concat(value);
            }
            else {
                m = k;
                status = k;
                concat = new String("https://accounts.google.com/o/oauth2/revoke?token=");
            }
            m = k;
            status = k;
            final URL url = new URL(concat);
            m = k;
            status = k;
            final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            m = k;
            status = k;
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            m = k;
            status = k;
            final int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                m = k;
                status = k;
                k = Status.k;
            }
            else {
                m = k;
                status = k;
                e.h.c("Unable to revoke access!", new Object[0]);
            }
            m = k;
            status = k;
            final a h = e.h;
            m = k;
            status = k;
            m = k;
            status = k;
            final StringBuilder sb = new StringBuilder(26);
            m = k;
            status = k;
            sb.append("Response Code: ");
            m = k;
            status = k;
            sb.append(responseCode);
            m = k;
            status = k;
            h.a(sb.toString(), new Object[0]);
        }
        catch (final Exception ex) {
            final a h2 = e.h;
            final String value2 = String.valueOf(ex.toString());
            String concat2;
            if (value2.length() != 0) {
                concat2 = "Exception when revoking access: ".concat(value2);
            }
            else {
                concat2 = new String("Exception when revoking access: ");
            }
            h2.c(concat2, new Object[0]);
            k = m;
        }
        catch (final IOException ex2) {
            final a h3 = e.h;
            final String value3 = String.valueOf(ex2.toString());
            String concat3;
            if (value3.length() != 0) {
                concat3 = "IOException when revoking access: ".concat(value3);
            }
            else {
                concat3 = new String("IOException when revoking access: ");
            }
            h3.c(concat3, new Object[0]);
            k = status;
        }
        ((BasePendingResult<Status>)this.g).g(k);
    }
}
