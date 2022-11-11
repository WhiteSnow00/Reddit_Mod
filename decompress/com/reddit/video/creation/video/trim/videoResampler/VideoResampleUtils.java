// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.videoResampler;

import java.io.IOException;
import com.reddit.video.creation.video.trim.data.videoEditor.GenericTrackFormat;
import com.reddit.video.creation.video.trim.data.videoEditor.AudioTrackFormat;
import com.reddit.video.creation.video.trim.data.videoEditor.VideoTrackFormat;
import com.reddit.video.creation.state.VideoScale;
import ct.c$a;
import ct.c;
import cj2.j;
import java.util.List;
import com.reddit.video.creation.video.trim.data.videoEditor.MediaTrackFormat;
import java.util.ArrayList;
import java.util.Map;
import android.media.MediaExtractor;
import ct.d;
import com.reddit.video.creation.video.trim.data.videoEditor.SourceMedia;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.media.MediaFormat;
import javax.inject.Inject;
import sg2.e;
import javax.inject.Named;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "Lcom/reddit/video/creation/video/trim/videoResampler/VideoResampleUtils;", "", "Landroid/net/Uri;", "uri", "", "getMediaDuration", "Landroid/media/MediaFormat;", "mediaFormat", "", "key", "", "defaultValue", "getInt", "getDuration", "Lcom/reddit/video/creation/video/trim/data/videoEditor/SourceMedia;", "sourceMedia", "Lhg2/j;", "updateSourceMedia", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class VideoResampleUtils
{
    public static final int $stable = 8;
    private final Context context;
    
    @Inject
    public VideoResampleUtils(@Named("APP_CONTEXT") final Context context) {
        e.f((Object)context, "context");
        this.context = context;
    }
    
    private final long getDuration(final MediaFormat mediaFormat) {
        long long1;
        if (mediaFormat.containsKey("durationUs")) {
            long1 = mediaFormat.getLong("durationUs");
        }
        else {
            long1 = -1L;
        }
        return long1;
    }
    
    private final int getInt(final MediaFormat mediaFormat, final String s, int integer) {
        if (mediaFormat.containsKey(s)) {
            integer = mediaFormat.getInteger(s);
        }
        return integer;
    }
    
    public static /* synthetic */ int getInt$default(final VideoResampleUtils videoResampleUtils, final MediaFormat mediaFormat, final String s, int n, final int n2, final Object o) {
        if ((n2 & 0x4) != 0x0) {
            n = -1;
        }
        return videoResampleUtils.getInt(mediaFormat, s, n);
    }
    
    private final long getMediaDuration(final Uri uri) {
        final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(this.context, uri);
        final String metadata = mediaMetadataRetriever.extractMetadata(9);
        long long1;
        if (metadata != null) {
            long1 = Long.parseLong(metadata);
        }
        else {
            long1 = 0L;
        }
        return long1;
    }
    
    public final void updateSourceMedia(final SourceMedia sourceMedia, final Uri uri) throws IOException {
        e.f((Object)sourceMedia, "sourceMedia");
        e.f((Object)uri, "uri");
        sourceMedia.setSize(d.b(this.context, uri));
        sourceMedia.setDuration(this.getMediaDuration(uri) / 1000.0f);
        final MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(this.context, uri, (Map)null);
        sourceMedia.setTracks(new ArrayList<MediaTrackFormat>(mediaExtractor.getTrackCount()));
        for (int trackCount = mediaExtractor.getTrackCount(), i = 0; i < trackCount; ++i) {
            final MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            e.e((Object)trackFormat, "mediaExtractor.getTrackFormat(track)");
            final String string = trackFormat.getString("mime");
            if (string != null) {
                if (j.O0(string, "video", false)) {
                    final int int$default = getInt$default(this, trackFormat, "width", 0, 4, null);
                    final int int$default2 = getInt$default(this, trackFormat, "height", 0, 4, null);
                    final long duration = this.getDuration(trackFormat);
                    final c$a a = c.a;
                    Number value = -1;
                    a.getClass();
                    e.f((Object)value, "defaultValue");
                    final Number a2 = c$a.a(trackFormat, "frame-rate");
                    if (a2 != null) {
                        value = a2;
                    }
                    final int intValue = value.intValue();
                    Number value2 = -1;
                    e.f((Object)value2, "defaultValue");
                    final Number a3 = c$a.a(trackFormat, "i-frame-interval");
                    if (a3 != null) {
                        value2 = a3;
                    }
                    sourceMedia.getTracks().add((MediaTrackFormat)new VideoTrackFormat(i, string, int$default, int$default2, getInt$default(this, trackFormat, "bitrate", 0, 4, null), intValue, value2.intValue(), duration, this.getInt(trackFormat, "rotation-degrees", 0), VideoScale.FILL));
                }
                else if (j.O0(string, "audio", false)) {
                    sourceMedia.getTracks().add((MediaTrackFormat)new AudioTrackFormat(i, string, getInt$default(this, trackFormat, "channel-count", 0, 4, null), getInt$default(this, trackFormat, "sample-rate", 0, 4, null), getInt$default(this, trackFormat, "bitrate", 0, 4, null), this.getDuration(trackFormat)));
                }
                else {
                    sourceMedia.getTracks().add((MediaTrackFormat)new GenericTrackFormat(i, string));
                }
            }
        }
    }
}
