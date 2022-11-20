// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcel;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import rd.a;

public final class yc extends a
{
    public static final Parcelable$Creator<yc> CREATOR;
    public final List f;
    
    static {
        CREATOR = (Parcelable$Creator)new zc();
    }
    
    public yc() {
        this.f = new ArrayList();
    }
    
    public yc(final ArrayList list) {
        List<Object> f;
        if (list == null) {
            f = Collections.emptyList();
        }
        else {
            f = Collections.unmodifiableList((List<?>)list);
        }
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, int b0) {
        b0 = i10.a.B0(parcel, 20293);
        i10.a.z0(parcel, 2, this.f);
        i10.a.G0(parcel, b0);
    }
}
