// 
// Decompiled by Procyon v0.6.0
// 

package nd;

import android.os.Parcelable;
import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;

public final class a extends sd.a
{
    public static final Parcelable$Creator<a> CREATOR;
    public Intent f;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    public a(final Intent f) {
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i2 = dg.d.i2(parcel, 20293);
        dg.d.Z1(parcel, 1, (Parcelable)this.f, n);
        dg.d.w2(parcel, i2);
    }
}
