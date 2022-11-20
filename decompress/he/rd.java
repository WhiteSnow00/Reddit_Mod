// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcel;
import com.google.android.gms.internal.firebase_auth_api.zzty;
import org.json.JSONException;
import vd.h;
import org.json.JSONObject;
import android.os.Parcelable$Creator;
import rd.a;

public final class rd extends a implements cc<rd>
{
    public static final Parcelable$Creator<rd> CREATOR;
    public static final String j;
    public String f;
    public String g;
    public long h;
    public boolean i;
    
    static {
        j = rd.class.getSimpleName();
        CREATOR = (Parcelable$Creator)new sd();
    }
    
    public rd() {
    }
    
    public rd(final long h, final String f, final String g, final boolean i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final /* bridge */ cc a(final String s) throws zzty {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(s);
            this.f = vd.h.a(jsonObject.optString("idToken", (String)null));
            this.g = vd.h.a(jsonObject.optString("refreshToken", (String)null));
            this.h = jsonObject.optLong("expiresIn", 0L);
            this.i = jsonObject.optBoolean("isNewUser", false);
            return (cc)this;
        }
        catch (final NullPointerException jsonObject) {}
        catch (final JSONException ex) {}
        throw he.a.a((Exception)jsonObject, rd.j, s);
    }
    
    public final void writeToParcel(final Parcel parcel, int b0) {
        b0 = i10.a.B0(parcel, 20293);
        i10.a.w0(parcel, 2, this.f);
        i10.a.w0(parcel, 3, this.g);
        i10.a.t0(parcel, 4, this.h);
        i10.a.p0(parcel, 5, this.i);
        i10.a.G0(parcel, b0);
    }
}
