// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import rd.a;

public final class ja extends a
{
    public static final Parcelable$Creator<ja> CREATOR;
    public final String f;
    
    static {
        CREATOR = (Parcelable$Creator)new ka();
    }
    
    public ja(final String f) {
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, int b0) {
        b0 = i10.a.B0(parcel, 20293);
        i10.a.w0(parcel, 1, this.f);
        i10.a.G0(parcel, b0);
    }
}
