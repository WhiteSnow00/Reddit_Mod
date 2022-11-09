// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.model;

import X.CTM;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class GameLiveConvertInfo implements Parcelable
{
    public static final Parcelable$Creator<GameLiveConvertInfo> CREATOR;
    @c(LIZ = "convert_type")
    public int LIZ;
    @c(LIZ = "title")
    public String LIZIZ;
    @c(LIZ = "text")
    public String LIZJ;
    @c(LIZ = "acu_type")
    public int LIZLLL;
    
    static {
        Covode.recordClassIndex(5473);
        CREATOR = (Parcelable$Creator)new GameLiveConvertInfo.a();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        CTM.LIZ((Object)parcel);
        parcel.writeInt(1);
    }
}
