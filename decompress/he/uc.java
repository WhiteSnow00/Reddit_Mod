// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.internal.firebase_auth_api.zzty;
import org.json.JSONArray;
import org.json.JSONException;
import hh.y;
import vd.h;
import java.util.ArrayList;
import org.json.JSONObject;
import java.util.List;
import java.util.Collection;
import android.os.Parcelable$Creator;
import rd.a;

public final class uc extends a implements cc<uc>
{
    public static final Parcelable$Creator<uc> CREATOR;
    public static final String g;
    public yc f;
    
    static {
        g = uc.class.getSimpleName();
        CREATOR = (Parcelable$Creator)new vc();
    }
    
    public uc() {
    }
    
    public uc(yc f) {
        if (f == null) {
            f = new yc();
        }
        else {
            final List f2 = f.f;
            f = new yc();
            if (f2 != null && !f2.isEmpty()) {
                f.f.addAll(f2);
            }
        }
        this.f = f;
    }
    
    public final /* bridge */ cc a(final String s) throws zzty {
        yc f = null;
        Label_0269: {
            Label_0249: {
                ArrayList list;
                try {
                    final JSONObject jsonObject = new JSONObject(s);
                    if (!jsonObject.has("users")) {
                        this.f = new yc();
                        return (cc)this;
                    }
                    final JSONArray optJSONArray = jsonObject.optJSONArray("users");
                    if (optJSONArray == null || optJSONArray.length() == 0) {
                        break Label_0249;
                    }
                    list = new ArrayList<wc>(optJSONArray.length());
                    for (int i = 0; i < optJSONArray.length(); ++i) {
                        final JSONObject jsonObject2 = optJSONArray.getJSONObject(i);
                        wc wc;
                        if (jsonObject2 == null) {
                            wc = new wc();
                        }
                        else {
                            wc = new wc(h.a(jsonObject2.optString("localId", (String)null)), h.a(jsonObject2.optString("email", (String)null)), jsonObject2.optBoolean("emailVerified", false), h.a(jsonObject2.optString("displayName", (String)null)), h.a(jsonObject2.optString("photoUrl", (String)null)), hd.g(jsonObject2.optJSONArray("providerUserInfo")), h.a(jsonObject2.optString("rawPassword", (String)null)), h.a(jsonObject2.optString("phoneNumber", (String)null)), jsonObject2.optLong("createdAt", 0L), jsonObject2.optLong("lastLoginAt", 0L), false, null, dd.g(jsonObject2.optJSONArray("mfaInfo")));
                        }
                        list.add(wc);
                    }
                }
                catch (final NullPointerException ex) {
                    throw he.a.a((Exception)ex, uc.g, s);
                }
                catch (final JSONException ex) {
                    throw he.a.a((Exception)ex, uc.g, s);
                }
                f = new yc(list);
                break Label_0269;
            }
            f = new yc(new ArrayList());
        }
        this.f = f;
        return (cc)this;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.v0(parcel, 2, (Parcelable)this.f, n);
        i10.a.G0(parcel, b0);
    }
}
