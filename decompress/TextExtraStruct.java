// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.media;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class TextExtraStruct implements Parcelable
{
    public static final Parcelable$Creator<TextExtraStruct> CREATOR;
    @c(LIZ = "end")
    public int end;
    public transient boolean isAddPosition;
    @c(LIZ = "start")
    public int start;
    @c(LIZ = "user_id")
    public long userId;
    
    static {
        Covode.recordClassIndex(4948);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<TextExtraStruct>() {
            static {
                Covode.recordClassIndex(4949);
            }
        };
    }
    
    public TextExtraStruct() {
    }
    
    public TextExtraStruct(final Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readLong();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public int getEnd() {
        return this.end;
    }
    
    public int getStart() {
        return this.start;
    }
    
    public long getUserId() {
        return this.userId;
    }
    
    public boolean isAddPosition() {
        return this.isAddPosition;
    }
    
    public void setAddPosition(final boolean isAddPosition) {
        this.isAddPosition = isAddPosition;
    }
    
    public void setEnd(final int end) {
        this.end = end;
    }
    
    public void setStart(final int start) {
        this.start = start;
    }
    
    public void setUserId(final long userId) {
        this.userId = userId;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeLong(this.userId);
    }
}
