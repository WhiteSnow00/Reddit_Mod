// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import rd.a;

public final class ta extends a
{
    public static final Parcelable$Creator<ta> CREATOR;
    public final String f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new ua();
    }
    
    public ta(final String f, final String g) {
        this.f = f;
        this.g = g;
    }
    
    public final void writeToParcel(final Parcel parcel, int b0) {
        b0 = i10.a.B0(parcel, 20293);
        i10.a.w0(parcel, 1, this.f);
        i10.a.w0(parcel, 2, this.g);
        i10.a.G0(parcel, b0);
    }
}
