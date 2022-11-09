// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import android.os.Parcel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u00d6\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/chat/model/TopicInfo;", "Lcom/reddit/domain/chat/model/SubredditOrTopicInfo;", "", "component1", "component2", "topicId", "topicName", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getTopicId", "()Ljava/lang/String;", "getTopicName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class TopicInfo extends SubredditOrTopicInfo
{
    public static final Parcelable$Creator<TopicInfo> CREATOR;
    private final String topicId;
    private final String topicName;
    
    static {
        CREATOR = (Parcelable$Creator)new TopicInfo$Creator();
    }
    
    public TopicInfo(final String topicId, final String topicName) {
        f.f((Object)topicId, "topicId");
        f.f((Object)topicName, "topicName");
        super((DefaultConstructorMarker)null);
        this.topicId = topicId;
        this.topicName = topicName;
    }
    
    public final String component1() {
        return this.topicId;
    }
    
    public final String component2() {
        return this.topicName;
    }
    
    public final TopicInfo copy(final String s, final String s2) {
        f.f((Object)s, "topicId");
        f.f((Object)s2, "topicName");
        return new TopicInfo(s, s2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopicInfo)) {
            return false;
        }
        final TopicInfo topicInfo = (TopicInfo)o;
        return f.a((Object)this.topicId, (Object)topicInfo.topicId) && f.a((Object)this.topicName, (Object)topicInfo.topicName);
    }
    
    public final String getTopicId() {
        return this.topicId;
    }
    
    public final String getTopicName() {
        return this.topicName;
    }
    
    public int hashCode() {
        return this.topicName.hashCode() + this.topicId.hashCode() * 31;
    }
    
    public String toString() {
        final StringBuilder k = a.k("TopicInfo(topicId=");
        k.append(this.topicId);
        k.append(", topicName=");
        return b.k(k, this.topicName, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.topicId);
        parcel.writeString(this.topicName);
    }
}
