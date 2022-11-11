// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.liveaudio;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import a2.b;
import androidx.appcompat.widget.s0;
import ag0.a;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.squareup.moshi.n;
import com.reddit.domain.model.Redditor;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u001d\u001a\u00020\t\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u001f\u001a\u00020\r\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0003\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bM\u0010NJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J®\u0001\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0018\u001a\u00020\u00022\b\b\u0003\u0010\u0019\u001a\u00020\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u001b\u001a\u00020\u00022\b\b\u0003\u0010\u001c\u001a\u00020\u00072\b\b\u0003\u0010\u001d\u001a\u00020\t2\b\b\u0003\u0010\u001e\u001a\u00020\u000b2\b\b\u0003\u0010\u001f\u001a\u00020\r2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00072\u000e\b\u0003\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001¢\u0006\u0004\b&\u0010'J\t\u0010(\u001a\u00020\u0002H\u00d6\u0001J\t\u0010)\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010-\u001a\u00020\u0007H\u00d6\u0001J\u0019\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u00103\u001a\u0004\b7\u00105R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u00103\u001a\u0004\b8\u00105R\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010<\u001a\u0004\b\u001d\u0010=R\u0017\u0010\u001e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u001f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u00103\u001a\u0004\bD\u00105R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u00103\u001a\u0004\bE\u00105R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u00103\u001a\u0004\bF\u00105R\u0019\u0010#\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010G\u001a\u0004\bH\u0010\u0013R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b$\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u00103\u001a\u0004\bL\u00105¨\u0006O" }, d2 = { "Lcom/reddit/domain/model/liveaudio/AudioRoom;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "", "component5", "", "component6", "Lcom/reddit/domain/model/liveaudio/TalkRoomStatus;", "component7", "Lcom/reddit/domain/model/liveaudio/AudioRecordingStatus;", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Integer;", "", "Lcom/reddit/domain/model/Redditor;", "component13", "component14", "roomId", "roomTitle", "metadataJson", "notificationPath", "participantCount", "isLive", "status", "recordingStatus", "recordingHlsUrl", "recordingDashUrl", "recordingFallbackUrl", "recordingDuration", "topUsers", "startedAt", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/reddit/domain/model/liveaudio/TalkRoomStatus;Lcom/reddit/domain/model/liveaudio/AudioRecordingStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lcom/reddit/domain/model/liveaudio/AudioRoom;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getRoomId", "()Ljava/lang/String;", "getRoomTitle", "getMetadataJson", "getNotificationPath", "I", "getParticipantCount", "()I", "Z", "()Z", "Lcom/reddit/domain/model/liveaudio/TalkRoomStatus;", "getStatus", "()Lcom/reddit/domain/model/liveaudio/TalkRoomStatus;", "Lcom/reddit/domain/model/liveaudio/AudioRecordingStatus;", "getRecordingStatus", "()Lcom/reddit/domain/model/liveaudio/AudioRecordingStatus;", "getRecordingHlsUrl", "getRecordingDashUrl", "getRecordingFallbackUrl", "Ljava/lang/Integer;", "getRecordingDuration", "Ljava/util/List;", "getTopUsers", "()Ljava/util/List;", "getStartedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/reddit/domain/model/liveaudio/TalkRoomStatus;Lcom/reddit/domain/model/liveaudio/AudioRecordingStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class AudioRoom implements Parcelable
{
    public static final Parcelable$Creator<AudioRoom> CREATOR;
    private final boolean isLive;
    private final String metadataJson;
    private final String notificationPath;
    private final int participantCount;
    private final String recordingDashUrl;
    private final Integer recordingDuration;
    private final String recordingFallbackUrl;
    private final String recordingHlsUrl;
    private final AudioRecordingStatus recordingStatus;
    private final String roomId;
    private final String roomTitle;
    private final String startedAt;
    private final TalkRoomStatus status;
    private final List<Redditor> topUsers;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public AudioRoom(@n(name = "room_id") final String roomId, @n(name = "room_title") final String roomTitle, @n(name = "metadata") final String metadataJson, @n(name = "notification_path") final String notificationPath, @n(name = "participant_count") final int participantCount, @n(name = "is_live") final boolean isLive, @n(name = "status") final TalkRoomStatus status, @n(name = "recording_status") final AudioRecordingStatus recordingStatus, @n(name = "recording_hls_url") final String recordingHlsUrl, @n(name = "recording_dash_url") final String recordingDashUrl, @n(name = "recording_fallback_url") final String recordingFallbackUrl, @n(name = "recording_duration") final Integer recordingDuration, @n(name = "top_users") final List<Redditor> topUsers, @n(name = "started_at") final String startedAt) {
        f.f((Object)roomId, "roomId");
        f.f((Object)roomTitle, "roomTitle");
        f.f((Object)notificationPath, "notificationPath");
        f.f((Object)status, "status");
        f.f((Object)recordingStatus, "recordingStatus");
        f.f((Object)topUsers, "topUsers");
        this.roomId = roomId;
        this.roomTitle = roomTitle;
        this.metadataJson = metadataJson;
        this.notificationPath = notificationPath;
        this.participantCount = participantCount;
        this.isLive = isLive;
        this.status = status;
        this.recordingStatus = recordingStatus;
        this.recordingHlsUrl = recordingHlsUrl;
        this.recordingDashUrl = recordingDashUrl;
        this.recordingFallbackUrl = recordingFallbackUrl;
        this.recordingDuration = recordingDuration;
        this.topUsers = topUsers;
        this.startedAt = startedAt;
    }
    
    public AudioRoom(final String s, final String s2, String s3, final String s4, final int n, final boolean b, TalkRoomStatus unknown, AudioRecordingStatus notAvailable, String s5, String s6, String s7, Integer n2, List instance, String s8, final int n3, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 0x4) != 0x0) {
            s3 = null;
        }
        if ((n3 & 0x40) != 0x0) {
            unknown = TalkRoomStatus.Unknown;
        }
        if ((n3 & 0x80) != 0x0) {
            notAvailable = AudioRecordingStatus.NotAvailable;
        }
        if ((n3 & 0x100) != 0x0) {
            s5 = null;
        }
        if ((n3 & 0x200) != 0x0) {
            s6 = null;
        }
        if ((n3 & 0x400) != 0x0) {
            s7 = null;
        }
        if ((n3 & 0x800) != 0x0) {
            n2 = null;
        }
        if ((n3 & 0x1000) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((n3 & 0x2000) != 0x0) {
            s8 = null;
        }
        this(s, s2, s3, s4, n, b, unknown, notAvailable, s5, s6, s7, n2, (List<Redditor>)instance, s8);
    }
    
    public final String component1() {
        return this.roomId;
    }
    
    public final String component10() {
        return this.recordingDashUrl;
    }
    
    public final String component11() {
        return this.recordingFallbackUrl;
    }
    
    public final Integer component12() {
        return this.recordingDuration;
    }
    
    public final List<Redditor> component13() {
        return this.topUsers;
    }
    
    public final String component14() {
        return this.startedAt;
    }
    
    public final String component2() {
        return this.roomTitle;
    }
    
    public final String component3() {
        return this.metadataJson;
    }
    
    public final String component4() {
        return this.notificationPath;
    }
    
    public final int component5() {
        return this.participantCount;
    }
    
    public final boolean component6() {
        return this.isLive;
    }
    
    public final TalkRoomStatus component7() {
        return this.status;
    }
    
    public final AudioRecordingStatus component8() {
        return this.recordingStatus;
    }
    
    public final String component9() {
        return this.recordingHlsUrl;
    }
    
    public final AudioRoom copy(@n(name = "room_id") final String s, @n(name = "room_title") final String s2, @n(name = "metadata") final String s3, @n(name = "notification_path") final String s4, @n(name = "participant_count") final int n, @n(name = "is_live") final boolean b, @n(name = "status") final TalkRoomStatus talkRoomStatus, @n(name = "recording_status") final AudioRecordingStatus audioRecordingStatus, @n(name = "recording_hls_url") final String s5, @n(name = "recording_dash_url") final String s6, @n(name = "recording_fallback_url") final String s7, @n(name = "recording_duration") final Integer n2, @n(name = "top_users") final List<Redditor> list, @n(name = "started_at") final String s8) {
        f.f((Object)s, "roomId");
        f.f((Object)s2, "roomTitle");
        f.f((Object)s4, "notificationPath");
        f.f((Object)talkRoomStatus, "status");
        f.f((Object)audioRecordingStatus, "recordingStatus");
        f.f((Object)list, "topUsers");
        return new AudioRoom(s, s2, s3, s4, n, b, talkRoomStatus, audioRecordingStatus, s5, s6, s7, n2, list, s8);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AudioRoom)) {
            return false;
        }
        final AudioRoom audioRoom = (AudioRoom)o;
        return f.a((Object)this.roomId, (Object)audioRoom.roomId) && f.a((Object)this.roomTitle, (Object)audioRoom.roomTitle) && f.a((Object)this.metadataJson, (Object)audioRoom.metadataJson) && f.a((Object)this.notificationPath, (Object)audioRoom.notificationPath) && this.participantCount == audioRoom.participantCount && this.isLive == audioRoom.isLive && this.status == audioRoom.status && this.recordingStatus == audioRoom.recordingStatus && f.a((Object)this.recordingHlsUrl, (Object)audioRoom.recordingHlsUrl) && f.a((Object)this.recordingDashUrl, (Object)audioRoom.recordingDashUrl) && f.a((Object)this.recordingFallbackUrl, (Object)audioRoom.recordingFallbackUrl) && f.a((Object)this.recordingDuration, (Object)audioRoom.recordingDuration) && f.a((Object)this.topUsers, (Object)audioRoom.topUsers) && f.a((Object)this.startedAt, (Object)audioRoom.startedAt);
    }
    
    public final String getMetadataJson() {
        return this.metadataJson;
    }
    
    public final String getNotificationPath() {
        return this.notificationPath;
    }
    
    public final int getParticipantCount() {
        return this.participantCount;
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
    
    public final AudioRecordingStatus getRecordingStatus() {
        return this.recordingStatus;
    }
    
    public final String getRoomId() {
        return this.roomId;
    }
    
    public final String getRoomTitle() {
        return this.roomTitle;
    }
    
    public final String getStartedAt() {
        return this.startedAt;
    }
    
    public final TalkRoomStatus getStatus() {
        return this.status;
    }
    
    public final List<Redditor> getTopUsers() {
        return this.topUsers;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.roomTitle, this.roomId.hashCode() * 31, 31);
        final String metadataJson = this.metadataJson;
        final int n = 0;
        int hashCode;
        if (metadataJson == null) {
            hashCode = 0;
        }
        else {
            hashCode = metadataJson.hashCode();
        }
        final int e = s0.e(this.participantCount, a.f(this.notificationPath, (f + hashCode) * 31, 31), 31);
        int isLive;
        if ((isLive = (this.isLive ? 1 : 0)) != 0) {
            isLive = 1;
        }
        final int hashCode2 = this.status.hashCode();
        final int hashCode3 = this.recordingStatus.hashCode();
        final String recordingHlsUrl = this.recordingHlsUrl;
        int hashCode4;
        if (recordingHlsUrl == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = recordingHlsUrl.hashCode();
        }
        final String recordingDashUrl = this.recordingDashUrl;
        int hashCode5;
        if (recordingDashUrl == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = recordingDashUrl.hashCode();
        }
        final String recordingFallbackUrl = this.recordingFallbackUrl;
        int hashCode6;
        if (recordingFallbackUrl == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = recordingFallbackUrl.hashCode();
        }
        final Integer recordingDuration = this.recordingDuration;
        int hashCode7;
        if (recordingDuration == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = recordingDuration.hashCode();
        }
        final int a = b.a((List)this.topUsers, (((((hashCode3 + (hashCode2 + (e + isLive) * 31) * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31, 31);
        final String startedAt = this.startedAt;
        int hashCode8;
        if (startedAt == null) {
            hashCode8 = n;
        }
        else {
            hashCode8 = startedAt.hashCode();
        }
        return a + hashCode8;
    }
    
    public final boolean isLive() {
        return this.isLive;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AudioRoom(roomId=");
        k.append(this.roomId);
        k.append(", roomTitle=");
        k.append(this.roomTitle);
        k.append(", metadataJson=");
        k.append(this.metadataJson);
        k.append(", notificationPath=");
        k.append(this.notificationPath);
        k.append(", participantCount=");
        k.append(this.participantCount);
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
        k.append(this.recordingDuration);
        k.append(", topUsers=");
        k.append(this.topUsers);
        k.append(", startedAt=");
        return b.k(k, this.startedAt, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.roomId);
        parcel.writeString(this.roomTitle);
        parcel.writeString(this.metadataJson);
        parcel.writeString(this.notificationPath);
        parcel.writeInt(this.participantCount);
        parcel.writeInt((int)(this.isLive ? 1 : 0));
        parcel.writeString(((Enum)this.status).name());
        parcel.writeString(this.recordingStatus.name());
        parcel.writeString(this.recordingHlsUrl);
        parcel.writeString(this.recordingDashUrl);
        parcel.writeString(this.recordingFallbackUrl);
        final Integer recordingDuration = this.recordingDuration;
        int intValue;
        if (recordingDuration == null) {
            intValue = 0;
        }
        else {
            parcel.writeInt(1);
            intValue = recordingDuration;
        }
        parcel.writeInt(intValue);
        final Iterator n2 = b.n((List)this.topUsers, parcel);
        while (n2.hasNext()) {
            ((Redditor)n2.next()).writeToParcel(parcel, n);
        }
        parcel.writeString(this.startedAt);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<AudioRoom>
    {
        public final AudioRoom createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            final int int1 = parcel.readInt();
            final int int2 = parcel.readInt();
            int i = 0;
            final boolean b = int2 != 0;
            final TalkRoomStatus value = TalkRoomStatus.valueOf(parcel.readString());
            final AudioRecordingStatus value2 = AudioRecordingStatus.valueOf(parcel.readString());
            final String string5 = parcel.readString();
            final String string6 = parcel.readString();
            final String string7 = parcel.readString();
            Integer value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = parcel.readInt();
            }
            int int3;
            ArrayList list;
            for (int3 = parcel.readInt(), list = new ArrayList(int3); i != int3; i = a.c(Redditor.CREATOR, parcel, list, i, 1)) {}
            return new AudioRoom(string, string2, string3, string4, int1, b, value, value2, string5, string6, string7, value3, (List<Redditor>)list, parcel.readString());
        }
        
        public final AudioRoom[] newArray(final int n) {
            return new AudioRoom[n];
        }
    }
}
