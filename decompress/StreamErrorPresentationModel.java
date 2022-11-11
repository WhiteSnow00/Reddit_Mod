// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import android.os.Parcel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u00d6\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamErrorPresentationModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "errorMessage", "errorDescription", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "getErrorDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class StreamErrorPresentationModel implements Parcelable
{
    public static final Parcelable$Creator<StreamErrorPresentationModel> CREATOR;
    private final String errorDescription;
    private final String errorMessage;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public StreamErrorPresentationModel(final String errorMessage, final String errorDescription) {
        f.f((Object)errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        this.errorDescription = errorDescription;
    }
    
    public final String component1() {
        return this.errorMessage;
    }
    
    public final String component2() {
        return this.errorDescription;
    }
    
    public final StreamErrorPresentationModel copy(final String s, final String s2) {
        f.f((Object)s, "errorMessage");
        return new StreamErrorPresentationModel(s, s2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamErrorPresentationModel)) {
            return false;
        }
        final StreamErrorPresentationModel streamErrorPresentationModel = (StreamErrorPresentationModel)o;
        return f.a((Object)this.errorMessage, (Object)streamErrorPresentationModel.errorMessage) && f.a((Object)this.errorDescription, (Object)streamErrorPresentationModel.errorDescription);
    }
    
    public final String getErrorDescription() {
        return this.errorDescription;
    }
    
    public final String getErrorMessage() {
        return this.errorMessage;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.errorMessage.hashCode();
        final String errorDescription = this.errorDescription;
        int hashCode2;
        if (errorDescription == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = errorDescription.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("StreamErrorPresentationModel(errorMessage=");
        k.append(this.errorMessage);
        k.append(", errorDescription=");
        return b.k(k, this.errorDescription, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.errorDescription);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<StreamErrorPresentationModel>
    {
        public final StreamErrorPresentationModel createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new StreamErrorPresentationModel(parcel.readString(), parcel.readString());
        }
        
        public final StreamErrorPresentationModel[] newArray(final int n) {
            return new StreamErrorPresentationModel[n];
        }
    }
}
