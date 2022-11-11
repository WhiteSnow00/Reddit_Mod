// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video;

import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import android.graphics.Bitmap;
import com.reddit.video.creation.models.video.VideoScaleType;
import com.reddit.video.creation.video.render.models.TextStickerData;
import java.util.List;
import android.util.Size;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\u0010\u0015J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0011H\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\fH\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00104\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0088\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u00c6\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0006H\u00d6\u0001J\t\u0010:\u001a\u00020;H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006<" }, d2 = { "Lcom/reddit/video/creation/video/VideoRenderParams;", "", "inputVideo", "Ljava/io/File;", "outputVideo", "videoWidth", "", "videoHeight", "watermarkBitmap", "Landroid/graphics/Bitmap;", "cameraOrientation", "highBitrate", "", "originalBitrate", "originalSize", "Landroid/util/Size;", "videoScaleType", "Lcom/reddit/video/creation/models/video/VideoScaleType;", "stickerBitmaps", "", "Lcom/reddit/video/creation/video/render/models/TextStickerData;", "(Ljava/io/File;Ljava/io/File;IILandroid/graphics/Bitmap;IZLjava/lang/Integer;Landroid/util/Size;Lcom/reddit/video/creation/models/video/VideoScaleType;Ljava/util/List;)V", "getCameraOrientation", "()I", "getHighBitrate", "()Z", "getInputVideo", "()Ljava/io/File;", "getOriginalBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOriginalSize", "()Landroid/util/Size;", "getOutputVideo", "getStickerBitmaps", "()Ljava/util/List;", "getVideoHeight", "getVideoScaleType", "()Lcom/reddit/video/creation/models/video/VideoScaleType;", "getVideoWidth", "getWatermarkBitmap", "()Landroid/graphics/Bitmap;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/io/File;Ljava/io/File;IILandroid/graphics/Bitmap;IZLjava/lang/Integer;Landroid/util/Size;Lcom/reddit/video/creation/models/video/VideoScaleType;Ljava/util/List;)Lcom/reddit/video/creation/video/VideoRenderParams;", "equals", "other", "hashCode", "toString", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class VideoRenderParams
{
    public static final int $stable = 8;
    private final int cameraOrientation;
    private final boolean highBitrate;
    private final File inputVideo;
    private final Integer originalBitrate;
    private final Size originalSize;
    private final File outputVideo;
    private final List<TextStickerData> stickerBitmaps;
    private final int videoHeight;
    private final VideoScaleType videoScaleType;
    private final int videoWidth;
    private final Bitmap watermarkBitmap;
    
    public VideoRenderParams(final File inputVideo, final File outputVideo, final int videoWidth, final int videoHeight, final Bitmap watermarkBitmap, final int cameraOrientation, final boolean highBitrate, final Integer originalBitrate, final Size originalSize, final VideoScaleType videoScaleType, final List<TextStickerData> stickerBitmaps) {
        e.f((Object)inputVideo, "inputVideo");
        e.f((Object)outputVideo, "outputVideo");
        e.f((Object)videoScaleType, "videoScaleType");
        e.f((Object)stickerBitmaps, "stickerBitmaps");
        this.inputVideo = inputVideo;
        this.outputVideo = outputVideo;
        this.videoWidth = videoWidth;
        this.videoHeight = videoHeight;
        this.watermarkBitmap = watermarkBitmap;
        this.cameraOrientation = cameraOrientation;
        this.highBitrate = highBitrate;
        this.originalBitrate = originalBitrate;
        this.originalSize = originalSize;
        this.videoScaleType = videoScaleType;
        this.stickerBitmaps = stickerBitmaps;
    }
    
    public VideoRenderParams(final File file, final File file2, final int n, final int n2, Bitmap bitmap, int n3, boolean b, Integer n4, Size size, VideoScaleType center_CROP, List instance, final int n5, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n5 & 0x10) != 0x0) {
            bitmap = null;
        }
        if ((n5 & 0x20) != 0x0) {
            n3 = 0;
        }
        if ((n5 & 0x40) != 0x0) {
            b = false;
        }
        if ((n5 & 0x80) != 0x0) {
            n4 = null;
        }
        if ((n5 & 0x100) != 0x0) {
            size = null;
        }
        if ((n5 & 0x200) != 0x0) {
            center_CROP = VideoScaleType.CENTER_CROP;
        }
        if ((n5 & 0x400) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        this(file, file2, n, n2, bitmap, n3, b, n4, size, center_CROP, (List<TextStickerData>)instance);
    }
    
    public final File component1() {
        return this.inputVideo;
    }
    
    public final VideoScaleType component10() {
        return this.videoScaleType;
    }
    
    public final List<TextStickerData> component11() {
        return this.stickerBitmaps;
    }
    
    public final File component2() {
        return this.outputVideo;
    }
    
    public final int component3() {
        return this.videoWidth;
    }
    
    public final int component4() {
        return this.videoHeight;
    }
    
    public final Bitmap component5() {
        return this.watermarkBitmap;
    }
    
    public final int component6() {
        return this.cameraOrientation;
    }
    
    public final boolean component7() {
        return this.highBitrate;
    }
    
    public final Integer component8() {
        return this.originalBitrate;
    }
    
    public final Size component9() {
        return this.originalSize;
    }
    
    public final VideoRenderParams copy(final File file, final File file2, final int n, final int n2, final Bitmap bitmap, final int n3, final boolean b, final Integer n4, final Size size, final VideoScaleType videoScaleType, final List<TextStickerData> list) {
        e.f((Object)file, "inputVideo");
        e.f((Object)file2, "outputVideo");
        e.f((Object)videoScaleType, "videoScaleType");
        e.f((Object)list, "stickerBitmaps");
        return new VideoRenderParams(file, file2, n, n2, bitmap, n3, b, n4, size, videoScaleType, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoRenderParams)) {
            return false;
        }
        final VideoRenderParams videoRenderParams = (VideoRenderParams)o;
        return e.a((Object)this.inputVideo, (Object)videoRenderParams.inputVideo) && e.a((Object)this.outputVideo, (Object)videoRenderParams.outputVideo) && this.videoWidth == videoRenderParams.videoWidth && this.videoHeight == videoRenderParams.videoHeight && e.a((Object)this.watermarkBitmap, (Object)videoRenderParams.watermarkBitmap) && this.cameraOrientation == videoRenderParams.cameraOrientation && this.highBitrate == videoRenderParams.highBitrate && e.a((Object)this.originalBitrate, (Object)videoRenderParams.originalBitrate) && e.a((Object)this.originalSize, (Object)videoRenderParams.originalSize) && this.videoScaleType == videoRenderParams.videoScaleType && e.a((Object)this.stickerBitmaps, (Object)videoRenderParams.stickerBitmaps);
    }
    
    public final int getCameraOrientation() {
        return this.cameraOrientation;
    }
    
    public final boolean getHighBitrate() {
        return this.highBitrate;
    }
    
    public final File getInputVideo() {
        return this.inputVideo;
    }
    
    public final Integer getOriginalBitrate() {
        return this.originalBitrate;
    }
    
    public final Size getOriginalSize() {
        return this.originalSize;
    }
    
    public final File getOutputVideo() {
        return this.outputVideo;
    }
    
    public final List<TextStickerData> getStickerBitmaps() {
        return this.stickerBitmaps;
    }
    
    public final int getVideoHeight() {
        return this.videoHeight;
    }
    
    public final VideoScaleType getVideoScaleType() {
        return this.videoScaleType;
    }
    
    public final int getVideoWidth() {
        return this.videoWidth;
    }
    
    public final Bitmap getWatermarkBitmap() {
        return this.watermarkBitmap;
    }
    
    @Override
    public int hashCode() {
        final int c = a.c(this.videoHeight, a.c(this.videoWidth, (this.outputVideo.hashCode() + this.inputVideo.hashCode() * 31) * 31, 31), 31);
        final Bitmap watermarkBitmap = this.watermarkBitmap;
        int hashCode = 0;
        int hashCode2;
        if (watermarkBitmap == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = watermarkBitmap.hashCode();
        }
        final int c2 = a.c(this.cameraOrientation, (c + hashCode2) * 31, 31);
        int highBitrate;
        if ((highBitrate = (this.highBitrate ? 1 : 0)) != 0) {
            highBitrate = 1;
        }
        final Integer originalBitrate = this.originalBitrate;
        int hashCode3;
        if (originalBitrate == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = originalBitrate.hashCode();
        }
        final Size originalSize = this.originalSize;
        if (originalSize != null) {
            hashCode = originalSize.hashCode();
        }
        return this.stickerBitmaps.hashCode() + (this.videoScaleType.hashCode() + (((c2 + highBitrate) * 31 + hashCode3) * 31 + hashCode) * 31) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("VideoRenderParams(inputVideo=");
        r.append(this.inputVideo);
        r.append(", outputVideo=");
        r.append(this.outputVideo);
        r.append(", videoWidth=");
        r.append(this.videoWidth);
        r.append(", videoHeight=");
        r.append(this.videoHeight);
        r.append(", watermarkBitmap=");
        r.append(this.watermarkBitmap);
        r.append(", cameraOrientation=");
        r.append(this.cameraOrientation);
        r.append(", highBitrate=");
        r.append(this.highBitrate);
        r.append(", originalBitrate=");
        r.append(this.originalBitrate);
        r.append(", originalSize=");
        r.append(this.originalSize);
        r.append(", videoScaleType=");
        r.append(this.videoScaleType);
        r.append(", stickerBitmaps=");
        return d.o(r, (List)this.stickerBitmaps, ')');
    }
}
