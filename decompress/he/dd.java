// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcel;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;
import mg.d0;
import android.os.Parcelable$Creator;
import rd.a;

public final class dd extends a
{
    public static final Parcelable$Creator<dd> CREATOR;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    
    static {
        CREATOR = (Parcelable$Creator)new ed();
    }
    
    public dd(final String f, final String g, final String h, final long i) {
        this.f = f;
        d0.v(g);
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static ArrayList g(final JSONArray jsonArray) throws JSONException {
        if (jsonArray != null && jsonArray.length() != 0) {
            final ArrayList list = new ArrayList();
            for (int i = 0; i < jsonArray.length(); ++i) {
                final JSONObject jsonObject = jsonArray.getJSONObject(i);
                final String optString = jsonObject.optString("phoneInfo", (String)null);
                final String optString2 = jsonObject.optString("mfaEnrollmentId", (String)null);
                final String optString3 = jsonObject.optString("displayName", (String)null);
                long optLong = 0L;
                Label_0124: {
                    if (jsonObject.has("enrolledAt")) {
                        final JSONObject optJSONObject = jsonObject.optJSONObject("enrolledAt");
                        if (optJSONObject != null) {
                            if (optJSONObject.has("seconds")) {
                                optLong = optJSONObject.optLong("seconds", 0L);
                                break Label_0124;
                            }
                        }
                    }
                    optLong = 0L;
                }
                final dd dd = new dd(optString, optString2, optString3, optLong);
                jsonObject.optString("unobfuscatedPhoneInfo");
                list.add(dd);
            }
            return list;
        }
        return new ArrayList();
    }
    
    public final void writeToParcel(final Parcel parcel, int b0) {
        b0 = i10.a.B0(parcel, 20293);
        i10.a.w0(parcel, 1, this.f);
        i10.a.w0(parcel, 2, this.g);
        i10.a.w0(parcel, 3, this.h);
        i10.a.t0(parcel, 4, this.i);
        i10.a.G0(parcel, b0);
    }
}
