// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u00d6\u0001j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/PollPredictionState;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "<init>", "(Ljava/lang/String;I)V", "Cancelled", "VOTING_OPEN", "PENDING_RESOLUTION", "RESOLVED", "model_release" }, k = 1, mv = { 1, 7, 1 })
public enum PollPredictionState implements Parcelable
{
    public static final Parcelable$Creator<PollPredictionState> CREATOR;
    
    Cancelled, 
    PENDING_RESOLUTION, 
    RESOLVED, 
    VOTING_OPEN;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.name());
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<PollPredictionState>
    {
        public final PollPredictionState createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return PollPredictionState.valueOf(parcel.readString());
        }
        
        public final PollPredictionState[] newArray(final int n) {
            return new PollPredictionState[n];
        }
    }
}
