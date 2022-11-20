// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import rd.a;

public final class na extends a
{
    public static final Parcelable$Creator<na> CREATOR;
    public final String f;
    public final od g;
    
    static {
        CREATOR = (Parcelable$Creator)new oa();
    }
    
    public na(final String f, final od g) {
        this.f = f;
        this.g = g;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.w0(parcel, 1, this.f);
        i10.a.v0(parcel, 2, (Parcelable)this.g, n);
        i10.a.G0(parcel, b0);
    }
}
