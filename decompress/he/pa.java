// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcelable;
import android.os.Parcel;
import hh.o;
import android.os.Parcelable$Creator;
import rd.a;

public final class pa extends a
{
    public static final Parcelable$Creator<pa> CREATOR;
    public final String f;
    public final o g;
    
    static {
        CREATOR = (Parcelable$Creator)new qa();
    }
    
    public pa(final o g, final String f) {
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
