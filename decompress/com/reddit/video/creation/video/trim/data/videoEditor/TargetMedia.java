// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.data.videoEditor;

import java.util.ArrayList;
import ig2.m;
import com.reddit.video.creation.state.VideoScale;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ<\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\r\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f" }, d2 = { "Lcom/reddit/video/creation/video/trim/data/videoEditor/TargetMedia;", "", "", "Lcom/reddit/video/creation/video/trim/data/videoEditor/MediaTrackFormat;", "sourceTracks", "", "bitrate", "width", "height", "frameRate", "Lcom/reddit/video/creation/state/VideoScale;", "scale", "Lhg2/j;", "setTracks", "Ljava/io/File;", "targetFile", "Ljava/io/File;", "getTargetFile", "()Ljava/io/File;", "Lcom/reddit/video/creation/video/trim/data/videoEditor/TargetTrack;", "tracks", "Ljava/util/List;", "getTracks", "()Ljava/util/List;", "(Ljava/util/List;)V", "getIncludedTrackCount", "()I", "includedTrackCount", "<init>", "(Ljava/io/File;)V", "Companion", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class TargetMedia
{
    public static final int $stable;
    public static final Companion Companion;
    public static final int DEFAULT_AUDIO_BITRATE = 128000;
    public static final int DEFAULT_FRAME_RATE = 24;
    public static final int DEFAULT_KEY_FRAME_INTERVAL = 1;
    public static final int DEFAULT_VIDEO_BITRATE = 5000000;
    public static final int DEFAULT_VIDEO_HEIGHT = 720;
    public static final int DEFAULT_VIDEO_WIDTH = 1280;
    private final File targetFile;
    private List<? extends TargetTrack> tracks;
    
    static {
        Companion = new Companion(null);
        $stable = 8;
    }
    
    public TargetMedia(final File targetFile) {
        e.f((Object)targetFile, "targetFile");
        this.targetFile = targetFile;
        this.tracks = (List<? extends TargetTrack>)EmptyList.INSTANCE;
    }
    
    public final int getIncludedTrackCount() {
        final Iterator<? extends TargetTrack> iterator = this.tracks.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (((TargetTrack)iterator.next()).getShouldInclude()) {
                ++n;
            }
        }
        return n;
    }
    
    public final File getTargetFile() {
        return this.targetFile;
    }
    
    public final List<TargetTrack> getTracks() {
        return (List<TargetTrack>)this.tracks;
    }
    
    public final void setTracks(final List<? extends TargetTrack> tracks) {
        e.f((Object)tracks, "<set-?>");
        this.tracks = tracks;
    }
    
    public final void setTracks(final List<? extends MediaTrackFormat> list, final int n, final int n2, final int n3, final int n4, final VideoScale videoScale) {
        e.f((Object)list, "sourceTracks");
        e.f((Object)videoScale, "scale");
        final ArrayList tracks = new ArrayList(m.c3((Iterable)list, 10));
        for (final MediaTrackFormat mediaTrackFormat : list) {
            Object o;
            if (mediaTrackFormat instanceof VideoTrackFormat) {
                final VideoTrackFormat videoTrackFormat = (VideoTrackFormat)mediaTrackFormat;
                int n5;
                if (n2 > 0) {
                    n5 = n2;
                }
                else {
                    n5 = 1280;
                }
                int n6;
                if (n3 > 0) {
                    n6 = n3;
                }
                else {
                    n6 = 720;
                }
                int n7;
                if (n > 0) {
                    n7 = n;
                }
                else {
                    n7 = 5000000;
                }
                int n8;
                if (n4 > 0) {
                    n8 = n4;
                }
                else {
                    n8 = 24;
                }
                o = new TargetVideoTrack(mediaTrackFormat.getIndex(), true, true, VideoTrackFormat.copy$default(videoTrackFormat, 0, (String)null, n5, n6, n7, n8, 1, 0L, 0, videoScale, 131, (Object)null));
            }
            else if (mediaTrackFormat instanceof AudioTrackFormat) {
                o = new TargetAudioTrack(mediaTrackFormat.getIndex(), true, true, AudioTrackFormat.copy$default((AudioTrackFormat)mediaTrackFormat, 0, (String)null, 0, 0, 128000, 0L, 47, (Object)null));
            }
            else {
                final int index = mediaTrackFormat.getIndex();
                GenericTrackFormat genericTrackFormat;
                if (mediaTrackFormat instanceof GenericTrackFormat) {
                    genericTrackFormat = (GenericTrackFormat)mediaTrackFormat;
                }
                else {
                    genericTrackFormat = null;
                }
                GenericTrackFormat copy$default;
                if (genericTrackFormat == null || (copy$default = GenericTrackFormat.copy$default(genericTrackFormat, 0, (String)null, 3, (Object)null)) == null) {
                    copy$default = new GenericTrackFormat(0, "");
                }
                o = new TargetTrack(index, false, false, (MediaTrackFormat)copy$default);
            }
            tracks.add(o);
        }
        this.tracks = (List<? extends TargetTrack>)tracks;
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n" }, d2 = { "Lcom/reddit/video/creation/video/trim/data/videoEditor/TargetMedia$Companion;", "", "()V", "DEFAULT_AUDIO_BITRATE", "", "DEFAULT_FRAME_RATE", "DEFAULT_KEY_FRAME_INTERVAL", "DEFAULT_VIDEO_BITRATE", "DEFAULT_VIDEO_HEIGHT", "DEFAULT_VIDEO_WIDTH", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
}
