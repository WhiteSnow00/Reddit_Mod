// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import androidx.viewpager.widget.c;
import android.os.Parcel;
import ag0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b?\u0010@J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b\u0011\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J¨\u0001\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0014\u001a\u00020\u00022\b\b\u0003\u0010\u0015\u001a\u00020\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0001¢\u0006\u0004\b!\u0010\"J\t\u0010#\u001a\u00020\u0002H\u00d6\u0001J\t\u0010%\u001a\u00020$H\u00d6\u0001J\u0013\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010)\u001a\u00020$H\u00d6\u0001J\u0019\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020$H\u00d6\u0001R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b2\u00101R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010/\u001a\u0004\b4\u00101R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u00105\u001a\u0004\b\u0018\u0010\tR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\b7\u0010\fR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\b8\u0010\fR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\b9\u0010\fR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\b:\u0010\fR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001d\u00106\u001a\u0004\b;\u0010\fR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u00106\u001a\u0004\b<\u0010\fR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010/\u001a\u0004\b=\u00101R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010/\u001a\u0004\b>\u00101¨\u0006A" }, d2 = { "Lcom/reddit/domain/model/streaming/Stream;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Boolean;", "", "component6", "()Ljava/lang/Long;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "streamId", "hlsUrl", "endedReason", "streamEndedBy", "isVideoOnDemand", "publishAt", "hlsExistsAt", "killedAt", "purgedAt", "updateAt", "endedAt", "thumbnail", "state", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/reddit/domain/model/streaming/Stream;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getStreamId", "()Ljava/lang/String;", "getHlsUrl", "getEndedReason", "getStreamEndedBy", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "getPublishAt", "getHlsExistsAt", "getKilledAt", "getPurgedAt", "getUpdateAt", "getEndedAt", "getThumbnail", "getState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class Stream implements Parcelable
{
    public static final Parcelable$Creator<Stream> CREATOR;
    private final Long endedAt;
    private final String endedReason;
    private final Long hlsExistsAt;
    private final String hlsUrl;
    private final Boolean isVideoOnDemand;
    private final Long killedAt;
    private final Long publishAt;
    private final Long purgedAt;
    private final String state;
    private final String streamEndedBy;
    private final String streamId;
    private final String thumbnail;
    private final Long updateAt;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Stream(@n(name = "stream_id") final String streamId, @n(name = "hls_url") final String hlsUrl, @n(name = "ended_reason") final String endedReason, @n(name = "finished_by") final String streamEndedBy, @n(name = "vod_accessible") final Boolean isVideoOnDemand, @n(name = "publish_at") final Long publishAt, @n(name = "hls_exists_at") final Long hlsExistsAt, @n(name = "killed_at") final Long killedAt, @n(name = "purged_at") final Long purgedAt, @n(name = "update_at") final Long updateAt, @n(name = "ended_at") final Long endedAt, @n(name = "thumbnail") final String thumbnail, final String state) {
        f.f((Object)streamId, "streamId");
        f.f((Object)hlsUrl, "hlsUrl");
        this.streamId = streamId;
        this.hlsUrl = hlsUrl;
        this.endedReason = endedReason;
        this.streamEndedBy = streamEndedBy;
        this.isVideoOnDemand = isVideoOnDemand;
        this.publishAt = publishAt;
        this.hlsExistsAt = hlsExistsAt;
        this.killedAt = killedAt;
        this.purgedAt = purgedAt;
        this.updateAt = updateAt;
        this.endedAt = endedAt;
        this.thumbnail = thumbnail;
        this.state = state;
    }
    
    public final String component1() {
        return this.streamId;
    }
    
    public final Long component10() {
        return this.updateAt;
    }
    
    public final Long component11() {
        return this.endedAt;
    }
    
    public final String component12() {
        return this.thumbnail;
    }
    
    public final String component13() {
        return this.state;
    }
    
    public final String component2() {
        return this.hlsUrl;
    }
    
    public final String component3() {
        return this.endedReason;
    }
    
    public final String component4() {
        return this.streamEndedBy;
    }
    
    public final Boolean component5() {
        return this.isVideoOnDemand;
    }
    
    public final Long component6() {
        return this.publishAt;
    }
    
    public final Long component7() {
        return this.hlsExistsAt;
    }
    
    public final Long component8() {
        return this.killedAt;
    }
    
    public final Long component9() {
        return this.purgedAt;
    }
    
    public final Stream copy(@n(name = "stream_id") final String s, @n(name = "hls_url") final String s2, @n(name = "ended_reason") final String s3, @n(name = "finished_by") final String s4, @n(name = "vod_accessible") final Boolean b, @n(name = "publish_at") final Long n, @n(name = "hls_exists_at") final Long n2, @n(name = "killed_at") final Long n3, @n(name = "purged_at") final Long n4, @n(name = "update_at") final Long n5, @n(name = "ended_at") final Long n6, @n(name = "thumbnail") final String s5, final String s6) {
        f.f((Object)s, "streamId");
        f.f((Object)s2, "hlsUrl");
        return new Stream(s, s2, s3, s4, b, n, n2, n3, n4, n5, n6, s5, s6);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Stream)) {
            return false;
        }
        final Stream stream = (Stream)o;
        return f.a((Object)this.streamId, (Object)stream.streamId) && f.a((Object)this.hlsUrl, (Object)stream.hlsUrl) && f.a((Object)this.endedReason, (Object)stream.endedReason) && f.a((Object)this.streamEndedBy, (Object)stream.streamEndedBy) && f.a((Object)this.isVideoOnDemand, (Object)stream.isVideoOnDemand) && f.a((Object)this.publishAt, (Object)stream.publishAt) && f.a((Object)this.hlsExistsAt, (Object)stream.hlsExistsAt) && f.a((Object)this.killedAt, (Object)stream.killedAt) && f.a((Object)this.purgedAt, (Object)stream.purgedAt) && f.a((Object)this.updateAt, (Object)stream.updateAt) && f.a((Object)this.endedAt, (Object)stream.endedAt) && f.a((Object)this.thumbnail, (Object)stream.thumbnail) && f.a((Object)this.state, (Object)stream.state);
    }
    
    public final Long getEndedAt() {
        return this.endedAt;
    }
    
    public final String getEndedReason() {
        return this.endedReason;
    }
    
    public final Long getHlsExistsAt() {
        return this.hlsExistsAt;
    }
    
    public final String getHlsUrl() {
        return this.hlsUrl;
    }
    
    public final Long getKilledAt() {
        return this.killedAt;
    }
    
    public final Long getPublishAt() {
        return this.publishAt;
    }
    
    public final Long getPurgedAt() {
        return this.purgedAt;
    }
    
    public final String getState() {
        return this.state;
    }
    
    public final String getStreamEndedBy() {
        return this.streamEndedBy;
    }
    
    public final String getStreamId() {
        return this.streamId;
    }
    
    public final String getThumbnail() {
        return this.thumbnail;
    }
    
    public final Long getUpdateAt() {
        return this.updateAt;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.hlsUrl, this.streamId.hashCode() * 31, 31);
        final String endedReason = this.endedReason;
        int hashCode = 0;
        int hashCode2;
        if (endedReason == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = endedReason.hashCode();
        }
        final String streamEndedBy = this.streamEndedBy;
        int hashCode3;
        if (streamEndedBy == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = streamEndedBy.hashCode();
        }
        final Boolean isVideoOnDemand = this.isVideoOnDemand;
        int hashCode4;
        if (isVideoOnDemand == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = isVideoOnDemand.hashCode();
        }
        final Long publishAt = this.publishAt;
        int hashCode5;
        if (publishAt == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = publishAt.hashCode();
        }
        final Long hlsExistsAt = this.hlsExistsAt;
        int hashCode6;
        if (hlsExistsAt == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = hlsExistsAt.hashCode();
        }
        final Long killedAt = this.killedAt;
        int hashCode7;
        if (killedAt == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = killedAt.hashCode();
        }
        final Long purgedAt = this.purgedAt;
        int hashCode8;
        if (purgedAt == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = purgedAt.hashCode();
        }
        final Long updateAt = this.updateAt;
        int hashCode9;
        if (updateAt == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = updateAt.hashCode();
        }
        final Long endedAt = this.endedAt;
        int hashCode10;
        if (endedAt == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = endedAt.hashCode();
        }
        final String thumbnail = this.thumbnail;
        int hashCode11;
        if (thumbnail == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = thumbnail.hashCode();
        }
        final String state = this.state;
        if (state != null) {
            hashCode = state.hashCode();
        }
        return ((((((((((f + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode;
    }
    
    public final Boolean isVideoOnDemand() {
        return this.isVideoOnDemand;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Stream(streamId=");
        k.append(this.streamId);
        k.append(", hlsUrl=");
        k.append(this.hlsUrl);
        k.append(", endedReason=");
        k.append(this.endedReason);
        k.append(", streamEndedBy=");
        k.append(this.streamEndedBy);
        k.append(", isVideoOnDemand=");
        k.append(this.isVideoOnDemand);
        k.append(", publishAt=");
        k.append(this.publishAt);
        k.append(", hlsExistsAt=");
        k.append(this.hlsExistsAt);
        k.append(", killedAt=");
        k.append(this.killedAt);
        k.append(", purgedAt=");
        k.append(this.purgedAt);
        k.append(", updateAt=");
        k.append(this.updateAt);
        k.append(", endedAt=");
        k.append(this.endedAt);
        k.append(", thumbnail=");
        k.append(this.thumbnail);
        k.append(", state=");
        return b.k(k, this.state, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.streamId);
        parcel.writeString(this.hlsUrl);
        parcel.writeString(this.endedReason);
        parcel.writeString(this.streamEndedBy);
        final Boolean isVideoOnDemand = this.isVideoOnDemand;
        if (isVideoOnDemand == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, isVideoOnDemand);
        }
        final Long publishAt = this.publishAt;
        if (publishAt == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, publishAt);
        }
        final Long hlsExistsAt = this.hlsExistsAt;
        if (hlsExistsAt == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, hlsExistsAt);
        }
        final Long killedAt = this.killedAt;
        if (killedAt == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, killedAt);
        }
        final Long purgedAt = this.purgedAt;
        if (purgedAt == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, purgedAt);
        }
        final Long updateAt = this.updateAt;
        if (updateAt == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, updateAt);
        }
        final Long endedAt = this.endedAt;
        if (endedAt == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, endedAt);
        }
        parcel.writeString(this.thumbnail);
        parcel.writeString(this.state);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Stream>
    {
        public final Stream createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            final int int1 = parcel.readInt();
            Long value = null;
            Boolean value2;
            if (int1 == 0) {
                value2 = null;
            }
            else {
                value2 = (parcel.readInt() != 0);
            }
            Long value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = parcel.readLong();
            }
            Long value4;
            if (parcel.readInt() == 0) {
                value4 = null;
            }
            else {
                value4 = parcel.readLong();
            }
            Long value5;
            if (parcel.readInt() == 0) {
                value5 = null;
            }
            else {
                value5 = parcel.readLong();
            }
            Long value6;
            if (parcel.readInt() == 0) {
                value6 = null;
            }
            else {
                value6 = parcel.readLong();
            }
            Long value7;
            if (parcel.readInt() == 0) {
                value7 = null;
            }
            else {
                value7 = parcel.readLong();
            }
            if (parcel.readInt() != 0) {
                value = parcel.readLong();
            }
            return new Stream(string, string2, string3, string4, value2, value3, value4, value5, value6, value7, value, parcel.readString(), parcel.readString());
        }
        
        public final Stream[] newArray(final int n) {
            return new Stream[n];
        }
    }
}
