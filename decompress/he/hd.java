// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcel;
import org.json.JSONException;
import org.json.JSONObject;
import vd.h;
import org.json.JSONArray;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import rd.a;

public final class hd extends a
{
    public static final Parcelable$Creator<hd> CREATOR;
    public final List f;
    
    static {
        CREATOR = (Parcelable$Creator)new id();
    }
    
    public hd() {
        this.f = new ArrayList();
    }
    
    public hd(final ArrayList list) {
        if (list != null && !list.isEmpty()) {
            this.f = Collections.unmodifiableList((List<?>)list);
            return;
        }
        this.f = Collections.emptyList();
    }
    
    public static hd g(final JSONArray jsonArray) throws JSONException {
        if (jsonArray != null && jsonArray.length() != 0) {
            final ArrayList list = new ArrayList();
            for (int i = 0; i < jsonArray.length(); ++i) {
                final JSONObject jsonObject = jsonArray.getJSONObject(i);
                fd fd;
                if (jsonObject == null) {
                    fd = new fd();
                }
                else {
                    fd = new fd(h.a(jsonObject.optString("federatedId", (String)null)), h.a(jsonObject.optString("displayName", (String)null)), h.a(jsonObject.optString("photoUrl", (String)null)), h.a(jsonObject.optString("providerId", (String)null)), null, h.a(jsonObject.optString("phoneNumber", (String)null)), h.a(jsonObject.optString("email", (String)null)));
                }
                list.add(fd);
            }
            return new hd(list);
        }
        return new hd(new ArrayList());
    }
    
    public final void writeToParcel(final Parcel parcel, int b0) {
        b0 = i10.a.B0(parcel, 20293);
        i10.a.z0(parcel, 2, this.f);
        i10.a.G0(parcel, b0);
    }
}
