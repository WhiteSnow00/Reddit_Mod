// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import android.os.Parcel;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0006\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/streaming/VideoCorrelation;", "Landroid/os/Parcelable;", "", "component1", "id", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class VideoCorrelation implements Parcelable
{
    public static final Parcelable$Creator<VideoCorrelation> CREATOR;
    public static final Companion Companion;
    private final String id;
    
    static {
        Companion = new Companion(null);
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public VideoCorrelation(final String id) {
        f.f((Object)id, "id");
        this.id = id;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final VideoCorrelation copy(final String s) {
        f.f((Object)s, "id");
        return new VideoCorrelation(s);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof VideoCorrelation && f.a((Object)this.id, (Object)((VideoCorrelation)o).id));
    }
    
    public final String getId() {
        return this.id;
    }
    
    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
    
    @Override
    public String toString() {
        return b.k(a.k("VideoCorrelation(id="), this.id, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.id);
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/model/streaming/VideoCorrelation$Companion;", "", "()V", "newInstance", "Lcom/reddit/domain/model/streaming/VideoCorrelation;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final VideoCorrelation newInstance() {
            return new VideoCorrelation(a2.b.g("randomUUID().toString()"));
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<VideoCorrelation>
    {
        public final VideoCorrelation createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new VideoCorrelation(parcel.readString());
        }
        
        public final VideoCorrelation[] newArray(final int n) {
            return new VideoCorrelation[n];
        }
    }
}
