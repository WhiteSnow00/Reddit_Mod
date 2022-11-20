// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcel;
import java.util.Collections;
import vd.h;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import rd.a;

public final class md extends a
{
    public static final Parcelable$Creator<md> CREATOR;
    public final int f;
    public List g;
    
    static {
        CREATOR = (Parcelable$Creator)new nd();
    }
    
    public md() {
        this.f = 1;
        this.g = new ArrayList();
    }
    
    public md(int i, final ArrayList list) {
        this.f = i;
        if (list != null && !list.isEmpty()) {
            for (i = 0; i < list.size(); ++i) {
                list.set(i, h.a((String)list.get(i)));
            }
            this.g = Collections.unmodifiableList((List<?>)list);
            return;
        }
        this.g = Collections.emptyList();
    }
    
    public final void writeToParcel(final Parcel parcel, int b0) {
        b0 = i10.a.B0(parcel, 20293);
        i10.a.s0(parcel, 1, this.f);
        i10.a.x0(parcel, 2, this.g);
        i10.a.G0(parcel, b0);
    }
}
