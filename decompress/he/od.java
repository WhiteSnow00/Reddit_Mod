// 
// Decompiled by Procyon v0.6.0
// 

package he;

import org.json.JSONException;
import org.json.JSONObject;
import android.os.Parcel;
import android.text.TextUtils;
import mg.d0;
import dg.e1;
import android.os.Parcelable$Creator;
import rd.a;

public final class od extends a implements bc
{
    public static final Parcelable$Creator<od> CREATOR;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public boolean o;
    public String p;
    public String q;
    public String r;
    public String s;
    public boolean t;
    public String u;
    
    static {
        CREATOR = (Parcelable$Creator)new pd();
    }
    
    public od() {
        this.n = true;
        this.o = true;
    }
    
    public od(final e1 e1, final String r) {
        d0.y((Object)e1);
        final String q = (String)e1.f;
        d0.v(q);
        this.q = q;
        d0.v(r);
        this.r = r;
        final String j = (String)e1.h;
        d0.v(j);
        this.j = j;
        this.n = true;
        this.l = "providerId=".concat(String.valueOf(j));
    }
    
    public od(final String h, final String i, final String j, final String m, final String p8, final String s, final String u, final String s2) {
        this.f = "http://localhost";
        this.h = h;
        this.i = i;
        this.m = m;
        this.p = p8;
        this.s = s;
        this.u = u;
        this.n = true;
        if (TextUtils.isEmpty((CharSequence)h) && TextUtils.isEmpty((CharSequence)this.i) && TextUtils.isEmpty((CharSequence)this.p)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        d0.v(j);
        this.j = j;
        this.k = null;
        final StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty((CharSequence)this.h)) {
            sb.append("id_token=");
            sb.append(this.h);
            sb.append("&");
        }
        if (!TextUtils.isEmpty((CharSequence)this.i)) {
            sb.append("access_token=");
            sb.append(this.i);
            sb.append("&");
        }
        if (!TextUtils.isEmpty((CharSequence)this.k)) {
            sb.append("identifier=");
            sb.append(this.k);
            sb.append("&");
        }
        if (!TextUtils.isEmpty((CharSequence)this.m)) {
            sb.append("oauth_token_secret=");
            sb.append(this.m);
            sb.append("&");
        }
        if (!TextUtils.isEmpty((CharSequence)this.p)) {
            sb.append("code=");
            sb.append(this.p);
            sb.append("&");
        }
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            m5.a.r(sb, "nonce=", s2, "&");
        }
        sb.append("providerId=");
        sb.append(this.j);
        this.l = sb.toString();
        this.o = true;
    }
    
    public od(final String f, final String g, final String h, final String i, final String j, final String k, final String l, final String m, final boolean n, final boolean o, final String p16, final String q, final String r, final String s, final boolean t, final String u) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p16;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
    }
    
    public final void writeToParcel(final Parcel parcel, int b0) {
        b0 = i10.a.B0(parcel, 20293);
        i10.a.w0(parcel, 2, this.f);
        i10.a.w0(parcel, 3, this.g);
        i10.a.w0(parcel, 4, this.h);
        i10.a.w0(parcel, 5, this.i);
        i10.a.w0(parcel, 6, this.j);
        i10.a.w0(parcel, 7, this.k);
        i10.a.w0(parcel, 8, this.l);
        i10.a.w0(parcel, 9, this.m);
        i10.a.p0(parcel, 10, this.n);
        i10.a.p0(parcel, 11, this.o);
        i10.a.w0(parcel, 12, this.p);
        i10.a.w0(parcel, 13, this.q);
        i10.a.w0(parcel, 14, this.r);
        i10.a.w0(parcel, 15, this.s);
        i10.a.p0(parcel, 16, this.t);
        i10.a.w0(parcel, 17, this.u);
        i10.a.G0(parcel, b0);
    }
    
    public final String zza() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("autoCreate", this.o);
        jsonObject.put("returnSecureToken", this.n);
        final String g = this.g;
        if (g != null) {
            jsonObject.put("idToken", (Object)g);
        }
        final String l = this.l;
        if (l != null) {
            jsonObject.put("postBody", (Object)l);
        }
        final String s = this.s;
        if (s != null) {
            jsonObject.put("tenantId", (Object)s);
        }
        final String u = this.u;
        if (u != null) {
            jsonObject.put("pendingToken", (Object)u);
        }
        if (!TextUtils.isEmpty((CharSequence)this.q)) {
            jsonObject.put("sessionId", (Object)this.q);
        }
        if (!TextUtils.isEmpty((CharSequence)this.r)) {
            jsonObject.put("requestUri", (Object)this.r);
        }
        else {
            final String f = this.f;
            if (f != null) {
                jsonObject.put("requestUri", (Object)f);
            }
        }
        jsonObject.put("returnIdpCredential", this.t);
        return jsonObject.toString();
    }
}
