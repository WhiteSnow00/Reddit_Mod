// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable
{
    public static final Parcelable$Creator<ParcelableVolumeInfo> CREATOR;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ParcelableVolumeInfo>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new ParcelableVolumeInfo(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new ParcelableVolumeInfo[n];
            }
        };
    }
    
    public ParcelableVolumeInfo(final Parcel parcel) {
        this.f = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.g = parcel.readInt();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.g);
    }
}
