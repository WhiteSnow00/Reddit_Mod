// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcelable;
import android.os.Parcel;
import hh.y;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;
import rd.a;

public final class cb extends a
{
    public static final Parcelable$Creator<cb> CREATOR;
    public final Status f;
    public final y g;
    public final String h;
    public final String i;
    
    static {
        CREATOR = (Parcelable$Creator)new db();
    }
    
    public cb(final Status f, final y g, final String h, final String i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.v0(parcel, 1, (Parcelable)this.f, n);
        i10.a.v0(parcel, 2, (Parcelable)this.g, n);
        i10.a.w0(parcel, 3, this.h);
        i10.a.w0(parcel, 4, this.i);
        i10.a.G0(parcel, b0);
    }
}
