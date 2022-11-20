// 
// Decompiled by Procyon v0.6.0
// 

package j92;

import android.os.Parcelable;
import android.os.Parcel;
import ng2.e;
import r82.r0;
import android.os.Parcelable$Creator;

public final class a extends g
{
    public static final Parcelable$Creator<a> CREATOR;
    public final r0 f;
    public final String g;
    public final boolean h;
    
    static {
        CREATOR = (Parcelable$Creator)new a$a();
    }
    
    public a(final r0 f, final String g, final boolean h) {
        e.f((Object)f, "state");
        e.f((Object)g, "masterKey");
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeParcelable((Parcelable)this.f, n);
        parcel.writeString(this.g);
        parcel.writeInt((int)(this.h ? 1 : 0));
    }
}
