// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal.player;

import al0.g7;
import com.reddit.video.player.player.analytics.VideoErrorReport;
import aw.b;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0015\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0015\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,¨\u0006-" }, d2 = { "Lcom/reddit/video/player/internal/player/PlayerEvent;", "", "()V", "AudioBitrateChanged", "Error", "FullscreenClicked", "HasAudioChanged", "MuteClicked", "PauseClicked", "PlayClicked", "PlayerCreated", "PlayerLooped", "PlayerSizeChanged", "ReplayClicked", "Resize", "SeekClicked", "SourceChanged", "ThumbnailLoadFailed", "ThumbnailLoaded", "UnmuteClicked", "VideoBitrateChanged", "VideoFileDownloadCompleted", "VideoFileDownloadFailed", "VideoFileDownloadStarted", "Lcom/reddit/video/player/internal/player/PlayerEvent$AudioBitrateChanged;", "Lcom/reddit/video/player/internal/player/PlayerEvent$Error;", "Lcom/reddit/video/player/internal/player/PlayerEvent$FullscreenClicked;", "Lcom/reddit/video/player/internal/player/PlayerEvent$HasAudioChanged;", "Lcom/reddit/video/player/internal/player/PlayerEvent$MuteClicked;", "Lcom/reddit/video/player/internal/player/PlayerEvent$PauseClicked;", "Lcom/reddit/video/player/internal/player/PlayerEvent$PlayClicked;", "Lcom/reddit/video/player/internal/player/PlayerEvent$PlayerCreated;", "Lcom/reddit/video/player/internal/player/PlayerEvent$PlayerLooped;", "Lcom/reddit/video/player/internal/player/PlayerEvent$PlayerSizeChanged;", "Lcom/reddit/video/player/internal/player/PlayerEvent$ReplayClicked;", "Lcom/reddit/video/player/internal/player/PlayerEvent$Resize;", "Lcom/reddit/video/player/internal/player/PlayerEvent$SeekClicked;", "Lcom/reddit/video/player/internal/player/PlayerEvent$SourceChanged;", "Lcom/reddit/video/player/internal/player/PlayerEvent$ThumbnailLoadFailed;", "Lcom/reddit/video/player/internal/player/PlayerEvent$ThumbnailLoaded;", "Lcom/reddit/video/player/internal/player/PlayerEvent$UnmuteClicked;", "Lcom/reddit/video/player/internal/player/PlayerEvent$VideoBitrateChanged;", "Lcom/reddit/video/player/internal/player/PlayerEvent$VideoFileDownloadCompleted;", "Lcom/reddit/video/player/internal/player/PlayerEvent$VideoFileDownloadFailed;", "Lcom/reddit/video/player/internal/player/PlayerEvent$VideoFileDownloadStarted;", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class PlayerEvent
{
    private PlayerEvent() {
    }
    
    @Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012" }, d2 = { "Lcom/reddit/video/player/internal/player/PlayerEvent$AudioBitrateChanged;", "Lcom/reddit/video/player/internal/player/PlayerEvent;", "bitrate", "", "(Ljava/lang/Integer;)V", "getBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/reddit/video/player/internal/player/PlayerEvent$AudioBitrateChanged;", "equals", "", "other", "", "hashCode", "toString", "", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class AudioBitrateChanged extends PlayerEvent
    {
        private final Integer bitrate;
        
        public AudioBitrateChanged() {
            this(null, 1, null);
        }
        
        public AudioBitrateChanged(final Integer bitrate) {
            super(null);
            this.bitrate = bitrate;
        }
        
        public final Integer component1() {
            return this.bitrate;
        }
        
        public final AudioBitrateChanged copy(final Integer n) {
            return new AudioBitrateChanged(n);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof AudioBitrateChanged && e.a((Object)this.bitrate, (Object)((AudioBitrateChanged)o).bitrate));
        }
        
        public final Integer getBitrate() {
            return this.bitrate;
        }
        
        @Override
        public int hashCode() {
            final Integer bitrate = this.bitrate;
            int hashCode;
            if (bitrate == null) {
                hashCode = 0;
            }
            else {
                hashCode = bitrate.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public String toString() {
            return b.i(a.r("AudioBitrateChanged(bitrate="), this.bitrate, ')');
        }
    }
    
    @Metadata(d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J0\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c" }, d2 = { "Lcom/reddit/video/player/internal/player/PlayerEvent$Error;", "Lcom/reddit/video/player/internal/player/PlayerEvent;", "position", "", "error", "", "videoErrorReport", "Lcom/reddit/video/player/player/analytics/VideoErrorReport;", "(Ljava/lang/Integer;Ljava/lang/Throwable;Lcom/reddit/video/player/player/analytics/VideoErrorReport;)V", "getError", "()Ljava/lang/Throwable;", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVideoErrorReport", "()Lcom/reddit/video/player/player/analytics/VideoErrorReport;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Throwable;Lcom/reddit/video/player/player/analytics/VideoErrorReport;)Lcom/reddit/video/player/internal/player/PlayerEvent$Error;", "equals", "", "other", "", "hashCode", "toString", "", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Error extends PlayerEvent
    {
        private final Throwable error;
        private final Integer position;
        private final VideoErrorReport videoErrorReport;
        
        public Error(final Integer position, final Throwable error, final VideoErrorReport videoErrorReport) {
            e.f((Object)videoErrorReport, "videoErrorReport");
            super(null);
            this.position = position;
            this.error = error;
            this.videoErrorReport = videoErrorReport;
        }
        
        public final Integer component1() {
            return this.position;
        }
        
        public final Throwable component2() {
            return this.error;
        }
        
        public final VideoErrorReport component3() {
            return this.videoErrorReport;
        }
        
        public final Error copy(final Integer n, final Throwable t, final VideoErrorReport videoErrorReport) {
            e.f((Object)videoErrorReport, "videoErrorReport");
            return new Error(n, t, videoErrorReport);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Error)) {
                return false;
            }
            final Error error = (Error)o;
            return e.a((Object)this.position, (Object)error.position) && e.a((Object)this.error, (Object)error.error) && e.a((Object)this.videoErrorReport, (Object)error.videoErrorReport);
        }
        
        public final Throwable getError() {
            return this.error;
        }
        
        public final Integer getPosition() {
            return this.position;
        }
        
        public final VideoErrorReport getVideoErrorReport() {
            return this.videoErrorReport;
        }
        
        @Override
        public int hashCode() {
            final Integer position = this.position;
            int hashCode = 0;
            int hashCode2;
            if (position == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = position.hashCode();
            }
            final Throwable error = this.error;
            if (error != null) {
                hashCode = error.hashCode();
            }
            return this.videoErrorReport.hashCode() + (hashCode2 * 31 + hashCode) * 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("Error(position=");
            r.append(this.position);
            r.append(", error=");
            r.append(this.error);
            r.append(", videoErrorReport=");
            r.append(this.videoErrorReport);
            r.append(')');
            return r.toString();
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/video/player/internal/player/PlayerEvent$FullscreenClicked;", "Lcom/reddit/video/player/internal/player/PlayerEvent;", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class FullscreenClicked extends PlayerEvent
    {
        public static final FullscreenClicked INSTANCE;
        
        static {
            INSTANCE = new FullscreenClicked();
        }
        
        private FullscreenClicked() {
            super(null);
        }
    }
    
    @Metadata(d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010" }, d2 = { "Lcom/reddit/video/player/internal/player/PlayerEvent$HasAudioChanged;", "Lcom/reddit/video/player/internal/player/PlayerEvent;", "hasAudio", "", "(Z)V", "getHasAudio", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class HasAudioChanged extends PlayerEvent
    {
        private final boolean hasAudio;
        
        public HasAudioChanged(final boolean hasAudio) {
            super(null);
            this.hasAudio = hasAudio;
        }
        
        public final boolean component1() {
            return this.hasAudio;
        }
        
        public final HasAudioChanged copy(final boolean b) {
            return new HasAudioChanged(b);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof HasAudioChanged && this.hasAudio == ((HasAudioChanged)o).hasAudio);
        }
        
        public final boolean getHasAudio() {
            return this.hasAudio;
        }
        
        @Override
        public int hashCode() {
            int hasAudio;
            if ((hasAudio = (this.hasAudio ? 1 : 0)) != 0) {
                hasAudio = 1;
            }
            return hasAudio;
        }
        
        @Override
        public String toString() {
            return g7.m(a.r("HasAudioChanged(hasAudio="), this.hasAudio, ')');
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/video/player/internal/player/PlayerEvent$MuteClicked;", "Lcom/reddit/video/player/internal/player/PlayerEvent;", "()V", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class MuteClicked extends PlayerEvent
    {
        public static final MuteClicked INSTANCE;
        
        static {
            INSTANCE = new MuteClicked();
        }
        
        private MuteClicked() {
            super(null);
        }
    }
}
