// 
// Decompiled by Procyon v0.6.0
// 

package ge2;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public final String f;
    public final float g;
    public final float h;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new a(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final Parcel parcel) {
        this.f = parcel.readString();
        this.g = parcel.readFloat();
        this.h = parcel.readFloat();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.f);
        parcel.writeFloat(this.g);
        parcel.writeFloat(this.h);
    }
}
