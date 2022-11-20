// 
// Decompiled by Procyon v0.6.0
// 

package j92;

import android.os.Parcelable;
import android.os.Parcel;
import ng2.e;
import r82.r0;
import android.os.Parcelable$Creator;

public final class b extends g
{
    public static final Parcelable$Creator<b> CREATOR;
    public final r0 f;
    public final boolean g;
    
    static {
        CREATOR = (Parcelable$Creator)new b$a();
    }
    
    public b(final r0 f, final boolean g) {
        e.f((Object)f, "state");
        this.f = f;
        this.g = g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeParcelable((Parcelable)this.f, n);
        parcel.writeInt((int)(this.g ? 1 : 0));
    }
}
