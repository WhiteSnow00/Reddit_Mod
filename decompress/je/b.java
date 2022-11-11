// 
// Decompiled by Procyon v0.6.0
// 

package je;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class b implements Parcelable, Comparable<b>
{
    public static final Parcelable$Creator<b> CREATOR;
    public final String f;
    public final long g;
    public final int h;
    public final String i;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    public b(final int h, final String f, final long g) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = "";
    }
    
    public b(final Parcel parcel) {
        this.f = parcel.readString();
        this.g = parcel.readLong();
        this.h = parcel.readInt();
        this.i = parcel.readString();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        return this.f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
    }
}
