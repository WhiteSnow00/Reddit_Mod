// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.liveaudio;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b/\u00100J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\t\u0010\bJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\r\u0010\bJl\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u000e\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b\u000f\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010\bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b*\u0010\bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b+\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b,\u0010%R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b-\u0010%R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b.\u0010\b¨\u00061" }, d2 = { "Lcom/reddit/domain/model/liveaudio/LegacyAudioRoom;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "roomId", "isLive", "status", "recordingStatus", "recordingHlsUrl", "recordingDashUrl", "recordingFallbackUrl", "recordingDuration", "copy", "(Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/reddit/domain/model/liveaudio/LegacyAudioRoom;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getRoomId", "()Ljava/lang/String;", "Z", "()Z", "Ljava/lang/Integer;", "getStatus", "getRecordingStatus", "getRecordingHlsUrl", "getRecordingDashUrl", "getRecordingFallbackUrl", "getRecordingDuration", "<init>", "(Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class LegacyAudioRoom implements Parcelable
{
    public static final Parcelable$Creator<LegacyAudioRoom> CREATOR;
    private final boolean isLive;
    private final String recordingDashUrl;
    private final Integer recordingDuration;
    private final String recordingFallbackUrl;
    private final String recordingHlsUrl;
    private final Integer recordingStatus;
    private final String roomId;
    private final Integer status;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public LegacyAudioRoom(@n(name = "room_id") final String roomId, @n(name = "is_live") final boolean isLive, @n(name = "room_status") final Integer status, @n(name = "recording_status") final Integer recordingStatus, @n(name = "recording_hls_url") final String recordingHlsUrl, @n(name = "recording_dash_url") final String recordingDashUrl, @n(name = "recording_fallback_url") final String recordingFallbackUrl, @n(name = "recording_duration_seconds") final Integer recordingDuration) {
        f.f((Object)roomId, "roomId");
        this.roomId = roomId;
        this.isLive = isLive;
        this.status = status;
        this.recordingStatus = recordingStatus;
        this.recordingHlsUrl = recordingHlsUrl;
        this.recordingDashUrl = recordingDashUrl;
        this.recordingFallbackUrl = recordingFallbackUrl;
        this.recordingDuration = recordingDuration;
    }
    
    public final String component1() {
        return this.roomId;
    }
    
    public final boolean component2() {
        return this.isLive;
    }
    
    public final Integer component3() {
        return this.status;
    }
    
    public final Integer component4() {
        return this.recordingStatus;
    }
    
    public final String component5() {
        return this.recordingHlsUrl;
    }
    
    public final String component6() {
        return this.recordingDashUrl;
    }
    
    public final String component7() {
        return this.recordingFallbackUrl;
    }
    
    public final Integer component8() {
        return this.recordingDuration;
    }
    
    public final LegacyAudioRoom copy(@n(name = "room_id") final String s, @n(name = "is_live") final boolean b, @n(name = "room_status") final Integer n, @n(name = "recording_status") final Integer n2, @n(name = "recording_hls_url") final String s2, @n(name = "recording_dash_url") final String s3, @n(name = "recording_fallback_url") final String s4, @n(name = "recording_duration_seconds") final Integer n3) {
        f.f((Object)s, "roomId");
        return new LegacyAudioRoom(s, b, n, n2, s2, s3, s4, n3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LegacyAudioRoom)) {
            return false;
        }
        final LegacyAudioRoom legacyAudioRoom = (LegacyAudioRoom)o;
        return f.a((Object)this.roomId, (Object)legacyAudioRoom.roomId) && this.isLive == legacyAudioRoom.isLive && f.a((Object)this.status, (Object)legacyAudioRoom.status) && f.a((Object)this.recordingStatus, (Object)legacyAudioRoom.recordingStatus) && f.a((Object)this.recordingHlsUrl, (Object)legacyAudioRoom.recordingHlsUrl) && f.a((Object)this.recordingDashUrl, (Object)legacyAudioRoom.recordingDashUrl) && f.a((Object)this.recordingFallbackUrl, (Object)legacyAudioRoom.recordingFallbackUrl) && f.a((Object)this.recordingDuration, (Object)legacyAudioRoom.recordingDuration);
    }
    
    public final String getRecordingDashUrl() {
        return this.recordingDashUrl;
    }
    
    public final Integer getRecordingDuration() {
        return this.recordingDuration;
    }
    
    public final String getRecordingFallbackUrl() {
        return this.recordingFallbackUrl;
    }
    
    public final String getRecordingHlsUrl() {
        return this.recordingHlsUrl;
    }
    
    public final Integer getRecordingStatus() {
        return this.recordingStatus;
    }
    
    public final String getRoomId() {
        return this.roomId;
    }
    
    public final Integer getStatus() {
        return this.status;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.roomId.hashCode();
        int isLive;
        if ((isLive = (this.isLive ? 1 : 0)) != 0) {
            isLive = 1;
        }
        final Integer status = this.status;
        int hashCode2 = 0;
        int hashCode3;
        if (status == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = status.hashCode();
        }
        final Integer recordingStatus = this.recordingStatus;
        int hashCode4;
        if (recordingStatus == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = recordingStatus.hashCode();
        }
        final String recordingHlsUrl = this.recordingHlsUrl;
        int hashCode5;
        if (recordingHlsUrl == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = recordingHlsUrl.hashCode();
        }
        final String recordingDashUrl = this.recordingDashUrl;
        int hashCode6;
        if (recordingDashUrl == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = recordingDashUrl.hashCode();
        }
        final String recordingFallbackUrl = this.recordingFallbackUrl;
        int hashCode7;
        if (recordingFallbackUrl == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = recordingFallbackUrl.hashCode();
        }
        final Integer recordingDuration = this.recordingDuration;
        if (recordingDuration != null) {
            hashCode2 = recordingDuration.hashCode();
        }
        return ((((((hashCode * 31 + isLive) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode2;
    }
    
    public final boolean isLive() {
        return this.isLive;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("LegacyAudioRoom(roomId=");
        k.append(this.roomId);
        k.append(", isLive=");
        k.append(this.isLive);
        k.append(", status=");
        k.append(this.status);
        k.append(", recordingStatus=");
        k.append(this.recordingStatus);
        k.append(", recordingHlsUrl=");
        k.append(this.recordingHlsUrl);
        k.append(", recordingDashUrl=");
        k.append(this.recordingDashUrl);
        k.append(", recordingFallbackUrl=");
        k.append(this.recordingFallbackUrl);
        k.append(", recordingDuration=");
        return s0.m(k, this.recordingDuration, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.roomId);
        parcel.writeInt((int)(this.isLive ? 1 : 0));
        final Integer status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, status);
        }
        final Integer recordingStatus = this.recordingStatus;
        if (recordingStatus == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, recordingStatus);
        }
        parcel.writeString(this.recordingHlsUrl);
        parcel.writeString(this.recordingDashUrl);
        parcel.writeString(this.recordingFallbackUrl);
        final Integer recordingDuration = this.recordingDuration;
        if (recordingDuration == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, recordingDuration);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<LegacyAudioRoom>
    {
        public final LegacyAudioRoom createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final boolean b = parcel.readInt() != 0;
            Integer value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = parcel.readInt();
            }
            Integer value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = parcel.readInt();
            }
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            Integer value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = parcel.readInt();
            }
            return new LegacyAudioRoom(string, b, value, value2, string2, string3, string4, value3);
        }
        
        public final LegacyAudioRoom[] newArray(final int n) {
            return new LegacyAudioRoom[n];
        }
    }
}
