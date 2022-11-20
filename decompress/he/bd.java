// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcel;
import com.google.android.gms.internal.firebase_auth_api.zzty;
import vd.h;
import org.json.JSONException;
import com.google.android.gms.internal.firebase_auth_api.zzpp;
import android.util.Log;
import org.json.JSONObject;
import android.os.Parcelable$Creator;
import rd.a;

public final class bd extends a implements cc<bd>
{
    public static final Parcelable$Creator<bd> CREATOR;
    public static final String k;
    public String f;
    public String g;
    public Long h;
    public String i;
    public Long j;
    
    static {
        k = bd.class.getSimpleName();
        CREATOR = (Parcelable$Creator)new cd();
    }
    
    public bd() {
        this.j = System.currentTimeMillis();
    }
    
    public bd(final Long h, final Long j, final String f, final String g, final String i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public bd(final String s, final String s2, final Long n, final String s3) {
        this(n, System.currentTimeMillis(), s, s2, s3);
    }
    
    public static bd g(final String s) {
        try {
            final JSONObject jsonObject = new JSONObject(s);
            final bd bd = new bd();
            bd.f = jsonObject.optString("refresh_token", (String)null);
            bd.g = jsonObject.optString("access_token", (String)null);
            bd.h = jsonObject.optLong("expires_in");
            bd.i = jsonObject.optString("token_type", (String)null);
            bd.j = jsonObject.optLong("issued_at");
            return bd;
        }
        catch (final JSONException ex) {
            Log.d(bd.k, "Failed to read GetTokenResponse from JSONObject");
            throw new zzpp((Throwable)ex);
        }
    }
    
    public final /* bridge */ cc a(final String s) throws zzty {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(s);
            this.f = vd.h.a(jsonObject.optString("refresh_token"));
            this.g = vd.h.a(jsonObject.optString("access_token"));
            this.h = jsonObject.optLong("expires_in", 0L);
            this.i = vd.h.a(jsonObject.optString("token_type"));
            this.j = System.currentTimeMillis();
            return (cc)this;
        }
        catch (final NullPointerException jsonObject) {}
        catch (final JSONException ex) {}
        throw he.a.a((Exception)jsonObject, bd.k, s);
    }
    
    public final String q() {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("refresh_token", (Object)this.f);
            jsonObject.put("access_token", (Object)this.g);
            jsonObject.put("expires_in", (Object)this.h);
            jsonObject.put("token_type", (Object)this.i);
            jsonObject.put("issued_at", (Object)this.j);
            return jsonObject.toString();
        }
        catch (final JSONException ex) {
            Log.d(bd.k, "Failed to convert GetTokenResponse to JSON");
            throw new zzpp((Throwable)ex);
        }
    }
    
    public final boolean u() {
        return System.currentTimeMillis() + 300000L < this.h * 1000L + this.j;
    }
    
    public final void writeToParcel(final Parcel parcel, int b0) {
        b0 = i10.a.B0(parcel, 20293);
        i10.a.w0(parcel, 2, this.f);
        i10.a.w0(parcel, 3, this.g);
        final Long h = this.h;
        long longValue;
        if (h == null) {
            longValue = 0L;
        }
        else {
            longValue = h;
        }
        i10.a.u0(parcel, 4, Long.valueOf(longValue));
        i10.a.w0(parcel, 5, this.i);
        i10.a.u0(parcel, 6, Long.valueOf((long)this.j));
        i10.a.G0(parcel, b0);
    }
}
