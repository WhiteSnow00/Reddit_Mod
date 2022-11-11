// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video;

import com.reddit.video.creation.api.configuration.WatermarkConfig;
import ff2.t;
import android.graphics.Bitmap;
import ff2.c0;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u0012" }, d2 = { "Lcom/reddit/video/creation/video/VideoRenderApi;", "", "Lcom/reddit/video/creation/video/VideoRenderParams;", "videoRenderParams", "Lff2/t;", "", "renderVideo", "Lcom/reddit/video/creation/api/configuration/WatermarkConfig;", "watermarkConfig", "", "username", "renderWithWatermark", "Ljava/io/File;", "videoFile", "Lff2/c0;", "createThumbnail", "Landroid/graphics/Bitmap;", "createThumbnailBmp", "creation_release" }, k = 1, mv = { 1, 7, 1 })
public interface VideoRenderApi
{
    c0<File> createThumbnail(final File p0);
    
    c0<Bitmap> createThumbnailBmp(final File p0);
    
    t<Integer> renderVideo(final VideoRenderParams p0);
    
    t<Integer> renderWithWatermark(final VideoRenderParams p0, final WatermarkConfig p1, final String p2);
}
