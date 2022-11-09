// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import androidx.viewpager.widget.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0012H\u00c6\u0003J\t\u00109\u001a\u00020\u0014H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\t\u0010=\u001a\u00020\u001aH\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\fH\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J¿\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u00c6\u0001J\u0013\u0010G\u001a\u00020\f2\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010I\u001a\u00020JH\u00d6\u0001J\t\u0010K\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\"R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001f¨\u0006L" }, d2 = { "Lcom/reddit/domain/model/streaming/PlaybackInfo;", "", "id", "", "scrubbingStartMs", "", "scrubbingEndMs", "sessionDurationMs", "watchDurationMs", "heartbeatDurationMs", "lastHeartbeatMs", "isLive", "", "playheadOffsetMs", "timestampMs", "startTimeMs", "volume", "chatState", "Lcom/reddit/domain/model/streaming/ChatState;", "playerType", "Lcom/reddit/domain/model/streaming/PlayerType;", "playStartMs", "previousHeartbeatStartValue", "playbackState", "Lcom/reddit/domain/model/streaming/PlaybackState;", "playbackSpeed", "", "(Ljava/lang/String;JJJJJJZJJJJLcom/reddit/domain/model/streaming/ChatState;Lcom/reddit/domain/model/streaming/PlayerType;JJLcom/reddit/domain/model/streaming/PlaybackState;F)V", "getChatState", "()Lcom/reddit/domain/model/streaming/ChatState;", "getHeartbeatDurationMs", "()J", "getId", "()Ljava/lang/String;", "()Z", "getLastHeartbeatMs", "getPlayStartMs", "getPlaybackSpeed", "()F", "getPlaybackState", "()Lcom/reddit/domain/model/streaming/PlaybackState;", "getPlayerType", "()Lcom/reddit/domain/model/streaming/PlayerType;", "getPlayheadOffsetMs", "getPreviousHeartbeatStartValue", "getScrubbingEndMs", "getScrubbingStartMs", "getSessionDurationMs", "getStartTimeMs", "getTimestampMs", "getVolume", "getWatchDurationMs", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class PlaybackInfo
{
    private final ChatState chatState;
    private final long heartbeatDurationMs;
    private final String id;
    private final boolean isLive;
    private final long lastHeartbeatMs;
    private final long playStartMs;
    private final float playbackSpeed;
    private final PlaybackState playbackState;
    private final PlayerType playerType;
    private final long playheadOffsetMs;
    private final long previousHeartbeatStartValue;
    private final long scrubbingEndMs;
    private final long scrubbingStartMs;
    private final long sessionDurationMs;
    private final long startTimeMs;
    private final long timestampMs;
    private final long volume;
    private final long watchDurationMs;
    
    public PlaybackInfo(final String id, final long scrubbingStartMs, final long scrubbingEndMs, final long sessionDurationMs, final long watchDurationMs, final long heartbeatDurationMs, final long lastHeartbeatMs, final boolean isLive, final long playheadOffsetMs, final long timestampMs, final long startTimeMs, final long volume, final ChatState chatState, final PlayerType playerType, final long playStartMs, final long previousHeartbeatStartValue, final PlaybackState playbackState, final float playbackSpeed) {
        f.f((Object)id, "id");
        f.f((Object)chatState, "chatState");
        f.f((Object)playerType, "playerType");
        this.id = id;
        this.scrubbingStartMs = scrubbingStartMs;
        this.scrubbingEndMs = scrubbingEndMs;
        this.sessionDurationMs = sessionDurationMs;
        this.watchDurationMs = watchDurationMs;
        this.heartbeatDurationMs = heartbeatDurationMs;
        this.lastHeartbeatMs = lastHeartbeatMs;
        this.isLive = isLive;
        this.playheadOffsetMs = playheadOffsetMs;
        this.timestampMs = timestampMs;
        this.startTimeMs = startTimeMs;
        this.volume = volume;
        this.chatState = chatState;
        this.playerType = playerType;
        this.playStartMs = playStartMs;
        this.previousHeartbeatStartValue = previousHeartbeatStartValue;
        this.playbackState = playbackState;
        this.playbackSpeed = playbackSpeed;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final long component10() {
        return this.timestampMs;
    }
    
    public final long component11() {
        return this.startTimeMs;
    }
    
    public final long component12() {
        return this.volume;
    }
    
    public final ChatState component13() {
        return this.chatState;
    }
    
    public final PlayerType component14() {
        return this.playerType;
    }
    
    public final long component15() {
        return this.playStartMs;
    }
    
    public final long component16() {
        return this.previousHeartbeatStartValue;
    }
    
    public final PlaybackState component17() {
        return this.playbackState;
    }
    
    public final float component18() {
        return this.playbackSpeed;
    }
    
    public final long component2() {
        return this.scrubbingStartMs;
    }
    
    public final long component3() {
        return this.scrubbingEndMs;
    }
    
    public final long component4() {
        return this.sessionDurationMs;
    }
    
    public final long component5() {
        return this.watchDurationMs;
    }
    
    public final long component6() {
        return this.heartbeatDurationMs;
    }
    
    public final long component7() {
        return this.lastHeartbeatMs;
    }
    
    public final boolean component8() {
        return this.isLive;
    }
    
    public final long component9() {
        return this.playheadOffsetMs;
    }
    
    public final PlaybackInfo copy(final String s, final long n, final long n2, final long n3, final long n4, final long n5, final long n6, final boolean b, final long n7, final long n8, final long n9, final long n10, final ChatState chatState, final PlayerType playerType, final long n11, final long n12, final PlaybackState playbackState, final float n13) {
        f.f((Object)s, "id");
        f.f((Object)chatState, "chatState");
        f.f((Object)playerType, "playerType");
        return new PlaybackInfo(s, n, n2, n3, n4, n5, n6, b, n7, n8, n9, n10, chatState, playerType, n11, n12, playbackState, n13);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlaybackInfo)) {
            return false;
        }
        final PlaybackInfo playbackInfo = (PlaybackInfo)o;
        return f.a((Object)this.id, (Object)playbackInfo.id) && this.scrubbingStartMs == playbackInfo.scrubbingStartMs && this.scrubbingEndMs == playbackInfo.scrubbingEndMs && this.sessionDurationMs == playbackInfo.sessionDurationMs && this.watchDurationMs == playbackInfo.watchDurationMs && this.heartbeatDurationMs == playbackInfo.heartbeatDurationMs && this.lastHeartbeatMs == playbackInfo.lastHeartbeatMs && this.isLive == playbackInfo.isLive && this.playheadOffsetMs == playbackInfo.playheadOffsetMs && this.timestampMs == playbackInfo.timestampMs && this.startTimeMs == playbackInfo.startTimeMs && this.volume == playbackInfo.volume && this.chatState == playbackInfo.chatState && this.playerType == playbackInfo.playerType && this.playStartMs == playbackInfo.playStartMs && this.previousHeartbeatStartValue == playbackInfo.previousHeartbeatStartValue && this.playbackState == playbackInfo.playbackState && f.a((Object)this.playbackSpeed, (Object)playbackInfo.playbackSpeed);
    }
    
    public final ChatState getChatState() {
        return this.chatState;
    }
    
    public final long getHeartbeatDurationMs() {
        return this.heartbeatDurationMs;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final long getLastHeartbeatMs() {
        return this.lastHeartbeatMs;
    }
    
    public final long getPlayStartMs() {
        return this.playStartMs;
    }
    
    public final float getPlaybackSpeed() {
        return this.playbackSpeed;
    }
    
    public final PlaybackState getPlaybackState() {
        return this.playbackState;
    }
    
    public final PlayerType getPlayerType() {
        return this.playerType;
    }
    
    public final long getPlayheadOffsetMs() {
        return this.playheadOffsetMs;
    }
    
    public final long getPreviousHeartbeatStartValue() {
        return this.previousHeartbeatStartValue;
    }
    
    public final long getScrubbingEndMs() {
        return this.scrubbingEndMs;
    }
    
    public final long getScrubbingStartMs() {
        return this.scrubbingStartMs;
    }
    
    public final long getSessionDurationMs() {
        return this.sessionDurationMs;
    }
    
    public final long getStartTimeMs() {
        return this.startTimeMs;
    }
    
    public final long getTimestampMs() {
        return this.timestampMs;
    }
    
    public final long getVolume() {
        return this.volume;
    }
    
    public final long getWatchDurationMs() {
        return this.watchDurationMs;
    }
    
    @Override
    public int hashCode() {
        final int c = b.c(this.lastHeartbeatMs, b.c(this.heartbeatDurationMs, b.c(this.watchDurationMs, b.c(this.sessionDurationMs, b.c(this.scrubbingEndMs, b.c(this.scrubbingStartMs, this.id.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        int isLive;
        if ((isLive = (this.isLive ? 1 : 0)) != 0) {
            isLive = 1;
        }
        final int c2 = b.c(this.previousHeartbeatStartValue, b.c(this.playStartMs, (this.playerType.hashCode() + (this.chatState.hashCode() + b.c(this.volume, b.c(this.startTimeMs, b.c(this.timestampMs, b.c(this.playheadOffsetMs, (c + isLive) * 31, 31), 31), 31), 31)) * 31) * 31, 31), 31);
        final PlaybackState playbackState = this.playbackState;
        int hashCode;
        if (playbackState == null) {
            hashCode = 0;
        }
        else {
            hashCode = playbackState.hashCode();
        }
        return Float.hashCode(this.playbackSpeed) + (c2 + hashCode) * 31;
    }
    
    public final boolean isLive() {
        return this.isLive;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("PlaybackInfo(id=");
        k.append(this.id);
        k.append(", scrubbingStartMs=");
        k.append(this.scrubbingStartMs);
        k.append(", scrubbingEndMs=");
        k.append(this.scrubbingEndMs);
        k.append(", sessionDurationMs=");
        k.append(this.sessionDurationMs);
        k.append(", watchDurationMs=");
        k.append(this.watchDurationMs);
        k.append(", heartbeatDurationMs=");
        k.append(this.heartbeatDurationMs);
        k.append(", lastHeartbeatMs=");
        k.append(this.lastHeartbeatMs);
        k.append(", isLive=");
        k.append(this.isLive);
        k.append(", playheadOffsetMs=");
        k.append(this.playheadOffsetMs);
        k.append(", timestampMs=");
        k.append(this.timestampMs);
        k.append(", startTimeMs=");
        k.append(this.startTimeMs);
        k.append(", volume=");
        k.append(this.volume);
        k.append(", chatState=");
        k.append(this.chatState);
        k.append(", playerType=");
        k.append(this.playerType);
        k.append(", playStartMs=");
        k.append(this.playStartMs);
        k.append(", previousHeartbeatStartValue=");
        k.append(this.previousHeartbeatStartValue);
        k.append(", playbackState=");
        k.append(this.playbackState);
        k.append(", playbackSpeed=");
        return c.j(k, this.playbackSpeed, ')');
    }
}
