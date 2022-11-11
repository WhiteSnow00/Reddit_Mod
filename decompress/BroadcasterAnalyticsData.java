// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import android.os.Parcel;
import ah2.f;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u00d6\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/streaming/BroadcasterAnalyticsData;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/model/streaming/StreamCorrelation;", "component1", "Lcom/reddit/domain/model/streaming/ProfileCardSource;", "component2", "correlation", "source", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Lcom/reddit/domain/model/streaming/StreamCorrelation;", "getCorrelation", "()Lcom/reddit/domain/model/streaming/StreamCorrelation;", "Lcom/reddit/domain/model/streaming/ProfileCardSource;", "getSource", "()Lcom/reddit/domain/model/streaming/ProfileCardSource;", "<init>", "(Lcom/reddit/domain/model/streaming/StreamCorrelation;Lcom/reddit/domain/model/streaming/ProfileCardSource;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class BroadcasterAnalyticsData implements Parcelable
{
    public static final Parcelable$Creator<BroadcasterAnalyticsData> CREATOR;
    private final StreamCorrelation correlation;
    private final ProfileCardSource source;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public BroadcasterAnalyticsData(final StreamCorrelation correlation, final ProfileCardSource source) {
        f.f((Object)correlation, "correlation");
        f.f((Object)source, "source");
        this.correlation = correlation;
        this.source = source;
    }
    
    public final StreamCorrelation component1() {
        return this.correlation;
    }
    
    public final ProfileCardSource component2() {
        return this.source;
    }
    
    public final BroadcasterAnalyticsData copy(final StreamCorrelation streamCorrelation, final ProfileCardSource profileCardSource) {
        f.f((Object)streamCorrelation, "correlation");
        f.f((Object)profileCardSource, "source");
        return new BroadcasterAnalyticsData(streamCorrelation, profileCardSource);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BroadcasterAnalyticsData)) {
            return false;
        }
        final BroadcasterAnalyticsData broadcasterAnalyticsData = (BroadcasterAnalyticsData)o;
        return f.a((Object)this.correlation, (Object)broadcasterAnalyticsData.correlation) && this.source == broadcasterAnalyticsData.source;
    }
    
    public final StreamCorrelation getCorrelation() {
        return this.correlation;
    }
    
    public final ProfileCardSource getSource() {
        return this.source;
    }
    
    @Override
    public int hashCode() {
        return this.source.hashCode() + this.correlation.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("BroadcasterAnalyticsData(correlation=");
        k.append(this.correlation);
        k.append(", source=");
        k.append(this.source);
        k.append(')');
        return k.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        this.correlation.writeToParcel(parcel, n);
        parcel.writeString(this.source.name());
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<BroadcasterAnalyticsData>
    {
        public final BroadcasterAnalyticsData createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new BroadcasterAnalyticsData((StreamCorrelation)StreamCorrelation.CREATOR.createFromParcel(parcel), ProfileCardSource.valueOf(parcel.readString()));
        }
        
        public final BroadcasterAnalyticsData[] newArray(final int n) {
            return new BroadcasterAnalyticsData[n];
        }
    }
}
