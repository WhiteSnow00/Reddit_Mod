// 
// Decompiled by Procyon v0.6.0
// 

package id;

import android.os.Parcelable;
import android.os.Parcel;
import mg.d0;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import rd.a;

public final class b extends a
{
    public static final Parcelable$Creator<b> CREATOR;
    public final PendingIntent f;
    
    static {
        CREATOR = (Parcelable$Creator)new g();
    }
    
    public b(final PendingIntent f) {
        d0.y((Object)f);
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.v0(parcel, 1, (Parcelable)this.f, n);
        i10.a.G0(parcel, b0);
    }
}
