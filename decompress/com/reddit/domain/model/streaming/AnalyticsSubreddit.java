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

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u00d6\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/streaming/AnalyticsSubreddit;", "Landroid/os/Parcelable;", "", "component1", "component2", "subredditName", "subredditId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getSubredditName", "()Ljava/lang/String;", "getSubredditId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class AnalyticsSubreddit implements Parcelable
{
    public static final Parcelable$Creator<AnalyticsSubreddit> CREATOR;
    private final String subredditId;
    private final String subredditName;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public AnalyticsSubreddit(final String subredditName, final String subredditId) {
        f.f((Object)subredditName, "subredditName");
        this.subredditName = subredditName;
        this.subredditId = subredditId;
    }
    
    public final String component1() {
        return this.subredditName;
    }
    
    public final String component2() {
        return this.subredditId;
    }
    
    public final AnalyticsSubreddit copy(final String s, final String s2) {
        f.f((Object)s, "subredditName");
        return new AnalyticsSubreddit(s, s2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyticsSubreddit)) {
            return false;
        }
        final AnalyticsSubreddit analyticsSubreddit = (AnalyticsSubreddit)o;
        return f.a((Object)this.subredditName, (Object)analyticsSubreddit.subredditName) && f.a((Object)this.subredditId, (Object)analyticsSubreddit.subredditId);
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    public final String getSubredditName() {
        return this.subredditName;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.subredditName.hashCode();
        final String subredditId = this.subredditId;
        int hashCode2;
        if (subredditId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subredditId.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AnalyticsSubreddit(subredditName=");
        k.append(this.subredditName);
        k.append(", subredditId=");
        return b.k(k, this.subredditId, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.subredditName);
        parcel.writeString(this.subredditId);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<AnalyticsSubreddit>
    {
        public final AnalyticsSubreddit createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new AnalyticsSubreddit(parcel.readString(), parcel.readString());
        }
        
        public final AnalyticsSubreddit[] newArray(final int n) {
            return new AnalyticsSubreddit[n];
        }
    }
}
