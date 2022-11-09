// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class RoomStatus implements Parcelable
{
    public static final Parcelable$Creator<RoomStatus> CREATOR;
    public long LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    
    static {
        Covode.recordClassIndex(4908);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<RoomStatus>() {
            static {
                Covode.recordClassIndex(4909);
            }
        };
    }
    
    public RoomStatus() {
    }
    
    public RoomStatus(final Parcel parcel) {
        this.LIZ = parcel.readLong();
        this.LIZIZ = parcel.readLong();
        this.LIZJ = (parcel.readByte() != 0);
        this.LIZLLL = parcel.readInt();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.LIZ);
        parcel.writeLong(this.LIZIZ);
        parcel.writeByte((byte)(byte)(this.LIZJ ? 1 : 0));
        parcel.writeInt(this.LIZLLL);
    }
}
