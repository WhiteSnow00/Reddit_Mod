// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.videoResampler;

import vz.b;
import java.util.concurrent.TimeUnit;
import ff2.w;
import com.reddit.video.creation.video.trim.Progress;
import ff2.t;
import com.reddit.video.creation.video.trim.data.videoEditor.TrimConfig;
import al0.g7;
import com.reddit.video.creation.video.trim.data.videoEditor.MediaTrackFormat;
import java.util.List;
import com.reddit.video.creation.state.VideoScale;
import com.reddit.video.creation.video.trim.data.videoEditor.TargetMedia;
import com.reddit.video.creation.video.trim.data.videoEditor.SourceMedia;
import com.reddit.video.creation.widgets.utils.VideoEditorUtils;
import java.io.File;
import ff2.v;
import android.util.Size;
import android.net.Uri;
import javax.inject.Inject;
import sg2.e;
import com.reddit.video.creation.state.AspectRatioConfig;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a" }, d2 = { "Lcom/reddit/video/creation/video/trim/videoResampler/LitrVideoEditor;", "", "Landroid/net/Uri;", "sourceUri", "", "cutFromMillis", "cutAtMillis", "", "destPath", "Landroid/util/Size;", "requestedSize", "Lff2/t;", "Lcom/reddit/video/creation/video/trim/Progress;", "compressAndCutVideo", "normalizeVideo", "Lcom/reddit/video/creation/state/AspectRatioConfig;", "aspectRatioConfig", "Lcom/reddit/video/creation/state/AspectRatioConfig;", "Lcom/reddit/video/creation/video/trim/videoResampler/VideoResampleUtils;", "videoResampleUtils", "Lcom/reddit/video/creation/video/trim/videoResampler/VideoResampleUtils;", "Lcom/reddit/video/creation/video/trim/videoResampler/VideoTranscoder;", "videoTranscoder", "Lcom/reddit/video/creation/video/trim/videoResampler/VideoTranscoder;", "<init>", "(Lcom/reddit/video/creation/state/AspectRatioConfig;Lcom/reddit/video/creation/video/trim/videoResampler/VideoResampleUtils;Lcom/reddit/video/creation/video/trim/videoResampler/VideoTranscoder;)V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public final class LitrVideoEditor
{
    public static final int $stable = 8;
    private final AspectRatioConfig aspectRatioConfig;
    private final VideoResampleUtils videoResampleUtils;
    private final VideoTranscoder videoTranscoder;
    
    @Inject
    public LitrVideoEditor(final AspectRatioConfig aspectRatioConfig, final VideoResampleUtils videoResampleUtils, final VideoTranscoder videoTranscoder) {
        e.f((Object)aspectRatioConfig, "aspectRatioConfig");
        e.f((Object)videoResampleUtils, "videoResampleUtils");
        e.f((Object)videoTranscoder, "videoTranscoder");
        this.aspectRatioConfig = aspectRatioConfig;
        this.videoResampleUtils = videoResampleUtils;
        this.videoTranscoder = videoTranscoder;
    }
    
    private static final void compressAndCutVideo$lambda-0(final String s, final Uri uri, final LitrVideoEditor litrVideoEditor, final Size size, final long n, final long n2, final v v) {
        e.f((Object)s, "$destPath");
        e.f((Object)uri, "$sourceUri");
        e.f((Object)litrVideoEditor, "this$0");
        e.f((Object)size, "$requestedSize");
        e.f((Object)v, "it");
        final File file = new File(s);
        final Uri sanitizeUri = VideoEditorUtils.INSTANCE.sanitizeUri(uri);
        final SourceMedia sourceMedia = new SourceMedia(sanitizeUri);
        litrVideoEditor.videoResampleUtils.updateSourceMedia(sourceMedia, sanitizeUri);
        final int height = size.getHeight();
        final int width = size.getWidth();
        final TargetMedia targetMedia = new TargetMedia(file);
        final List<MediaTrackFormat> tracks = sourceMedia.getTracks();
        VideoScale fill;
        if ((fill = litrVideoEditor.aspectRatioConfig.getVideoScales().get(uri.toString())) == null) {
            fill = VideoScale.FILL;
        }
        targetMedia.setTracks(tracks, 2500000, width, height, 30, fill);
        litrVideoEditor.videoTranscoder.transcodeVideo(sourceMedia, targetMedia, g7.d("randomUUID().toString()"), (us.e)new LitrVideoEditor$compressAndCutVideo$1$1(v, file), new TrimConfig(n, n2));
    }
    
    private static final void normalizeVideo$lambda-1(final String s, final Uri uri, final LitrVideoEditor litrVideoEditor, final Size size, final v v) {
        e.f((Object)s, "$destPath");
        e.f((Object)uri, "$sourceUri");
        e.f((Object)litrVideoEditor, "this$0");
        e.f((Object)size, "$requestedSize");
        e.f((Object)v, "it");
        final File file = new File(s);
        final Uri sanitizeUri = VideoEditorUtils.INSTANCE.sanitizeUri(uri);
        final SourceMedia sourceMedia = new SourceMedia(sanitizeUri);
        litrVideoEditor.videoResampleUtils.updateSourceMedia(sourceMedia, sanitizeUri);
        final TargetMedia targetMedia = new TargetMedia(file);
        targetMedia.setTracks(sourceMedia.getTracks(), 2500000, size.getWidth(), size.getHeight(), 30, VideoScale.FILL);
        VideoTranscoder.transcodeVideo$default(litrVideoEditor.videoTranscoder, sourceMedia, targetMedia, g7.d("randomUUID().toString()"), (us.e)new LitrVideoEditor$normalizeVideo$1$1(v, file), (TrimConfig)null, 16, (Object)null);
    }
    
    public final t<Progress> compressAndCutVideo(final Uri uri, final long n, final long n2, final String s, final Size size) {
        e.f((Object)uri, "sourceUri");
        e.f((Object)s, "destPath");
        e.f((Object)size, "requestedSize");
        final t timeout = t.create((w)new a(s, uri, this, size, n, n2)).distinctUntilChanged().subscribeOn(eg2.a.b()).timeout(100L, TimeUnit.MINUTES);
        e.e((Object)timeout, "create<Progress> {\n     \u2026INUTES, TimeUnit.MINUTES)");
        return (t<Progress>)timeout;
    }
    
    public final t<Progress> normalizeVideo(final Uri uri, final String s, final Size size) {
        e.f((Object)uri, "sourceUri");
        e.f((Object)s, "destPath");
        e.f((Object)size, "requestedSize");
        final t timeout = t.create((w)new b(s, uri, this, size)).distinctUntilChanged().subscribeOn(eg2.a.b()).timeout(100L, TimeUnit.MINUTES);
        e.e((Object)timeout, "create<Progress> {\n     \u2026INUTES, TimeUnit.MINUTES)");
        return (t<Progress>)timeout;
    }
}
