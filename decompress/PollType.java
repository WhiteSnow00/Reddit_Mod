// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0004\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013" }, d2 = { "Lcom/reddit/domain/model/PollType;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "POST_POLL", "PREDICTION", "model_release" }, k = 1, mv = { 1, 7, 1 })
public enum PollType implements Parcelable
{
    public static final Parcelable$Creator<PollType> CREATOR;
    
    POST_POLL("poll"), 
    PREDICTION("predict");
    
    private final String value;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    private PollType(final String value) {
        this.value = value;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final String getValue() {
        return this.value;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.name());
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<PollType>
    {
        public final PollType createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return PollType.valueOf(parcel.readString());
        }
        
        public final PollType[] newArray(final int n) {
            return new PollType[n];
        }
    }
}
