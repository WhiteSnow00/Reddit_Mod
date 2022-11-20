// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.ArrayList;
import hh.y;
import java.util.List;
import android.os.Parcelable$Creator;
import rd.a;

public final class eb extends a
{
    public static final Parcelable$Creator<eb> CREATOR;
    public final String f;
    public final List g;
    public final y h;
    
    static {
        CREATOR = (Parcelable$Creator)new fb();
    }
    
    public eb(final String f, final ArrayList g, final y h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.w0(parcel, 1, this.f);
        i10.a.z0(parcel, 2, this.g);
        i10.a.v0(parcel, 3, (Parcelable)this.h, n);
        i10.a.G0(parcel, b0);
    }
}
