// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import rd.a;

public final class va extends a
{
    public static final Parcelable$Creator<va> CREATOR;
    public final String f;
    public final String g;
    public final String h;
    
    static {
        CREATOR = (Parcelable$Creator)new wa();
    }
    
    public va(final String f, final String g, final String h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void writeToParcel(final Parcel parcel, int b0) {
        b0 = i10.a.B0(parcel, 20293);
        i10.a.w0(parcel, 1, this.f);
        i10.a.w0(parcel, 2, this.g);
        i10.a.w0(parcel, 3, this.h);
        i10.a.G0(parcel, b0);
    }
}
