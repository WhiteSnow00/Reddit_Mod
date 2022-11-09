// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.media;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.a.c;

public class VideoModel
{
    public static final VideoModel.a DEFAULT_COVER_TYPE;
    @c(LIZ = "allow_cache")
    public boolean allowCache;
    @c(LIZ = "avg_color")
    public int avgColor;
    @c(LIZ = "cover_medium")
    public ImageModel coverMediumModel;
    @c(LIZ = "cover")
    public ImageModel coverModel;
    @c(LIZ = "cover_thumb")
    public ImageModel coverThumbModel;
    @c(LIZ = "download_url")
    public List<String> downloadList;
    @c(LIZ = "duration")
    public double duration;
    @c(LIZ = "cover_animated", LIZIZ = { "dynamic_cover" })
    public ImageModel dynamicCoverModel;
    @c(LIZ = "first_frame")
    public ImageModel firstFrame;
    @c(LIZ = "gif_type")
    public int gifType;
    @c(LIZ = "gif_url_list")
    public List<String> gifUrlList;
    @c(LIZ = "height")
    public int height;
    @c(LIZ = "long_duration")
    public float longDuration;
    @c(LIZ = "long_uri")
    public String longUri;
    @c(LIZ = "long_url")
    public List<String> longUrls;
    public VideoModel.a mCoverType;
    @c(LIZ = "preload_size")
    public int preloadSize;
    @c(LIZ = "quality_info")
    public List<Object> qualityInfo;
    @c(LIZ = "uri")
    public String uri;
    @c(LIZ = "url_list")
    public List<String> urlList;
    @c(LIZ = "videoLocalPath")
    public String videoLocalPath;
    @c(LIZ = "watermark")
    public boolean waterMark;
    @c(LIZ = "width")
    public int width;
    
    static {
        Covode.recordClassIndex(4951);
        DEFAULT_COVER_TYPE = VideoModel.a.LARGE;
    }
    
    public VideoModel() {
        this.preloadSize = 512000;
        this.mCoverType = VideoModel.DEFAULT_COVER_TYPE;
    }
    
    public List<Object> getBitRate() {
        return this.qualityInfo;
    }
    
    public ImageModel getCoverMediumModel() {
        return this.coverMediumModel;
    }
    
    public ImageModel getCoverModel() {
        return this.coverModel;
    }
    
    public ImageModel getCoverThumbModel() {
        return this.coverThumbModel;
    }
    
    public VideoModel.a getCoverType() {
        return this.mCoverType;
    }
    
    public List<String> getDownloadList() {
        return this.downloadList;
    }
    
    public double getDuration() {
        return this.duration;
    }
    
    public ImageModel getDynamicCoverModel() {
        return this.dynamicCoverModel;
    }
    
    public ImageModel getFirstFrame() {
        return this.firstFrame;
    }
    
    public int getGifType() {
        return this.gifType;
    }
    
    public List<String> getGifUrlList() {
        return this.gifUrlList;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public float getLongDuration() {
        return this.longDuration;
    }
    
    public String getLongUri() {
        return this.longUri;
    }
    
    public List<String> getLongUrls() {
        return this.longUrls;
    }
    
    public int getPreloadSize() {
        return this.preloadSize;
    }
    
    public List<Object> getQualityInfo() {
        return this.qualityInfo;
    }
    
    public String getUnbitratedUri() {
        if (TextUtils.isEmpty((CharSequence)this.getUri())) {
            return "";
        }
        return this.getUri();
    }
    
    public String getUri() {
        return this.uri;
    }
    
    public List<String> getUrlList() {
        return this.urlList;
    }
    
    public String getVideoLocalPath() {
        return this.videoLocalPath;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public boolean isAllowCache() {
        return this.allowCache;
    }
    
    public boolean isWaterMark() {
        return this.waterMark;
    }
    
    public void setAllowCache(final boolean allowCache) {
        this.allowCache = allowCache;
    }
    
    public void setCoverMediumModel(final ImageModel coverMediumModel) {
        this.coverMediumModel = coverMediumModel;
    }
    
    public void setCoverModel(final ImageModel coverModel) {
        this.coverModel = coverModel;
    }
    
    public void setCoverThumbModel(final ImageModel coverThumbModel) {
        this.coverThumbModel = coverThumbModel;
    }
    
    public void setCoverType(final VideoModel.a mCoverType) {
        this.mCoverType = mCoverType;
    }
    
    public void setDownloadList(final List<String> downloadList) {
        this.downloadList = downloadList;
    }
    
    public void setDuration(final double duration) {
        this.duration = duration;
    }
    
    public void setDynamicCoverModel(final ImageModel dynamicCoverModel) {
        this.dynamicCoverModel = dynamicCoverModel;
    }
    
    public void setFirstFrame(final ImageModel firstFrame) {
        this.firstFrame = firstFrame;
    }
    
    public void setGifType(final int gifType) {
        this.gifType = gifType;
    }
    
    public void setGifUrlList(final List<String> gifUrlList) {
        this.gifUrlList = gifUrlList;
    }
    
    public void setHeight(final int height) {
        this.height = height;
    }
    
    public void setLongDuration(final float longDuration) {
        this.longDuration = longDuration;
    }
    
    public void setLongUri(final String longUri) {
        this.longUri = longUri;
    }
    
    public void setLongUrls(final List<String> longUrls) {
        this.longUrls = longUrls;
    }
    
    public void setPreloadSize(final int preloadSize) {
        this.preloadSize = preloadSize;
    }
    
    public void setQualityInfo(final List<Object> qualityInfo) {
        this.qualityInfo = qualityInfo;
    }
    
    public void setUri(final String uri) {
        this.uri = uri;
    }
    
    public void setUrlList(final List<String> urlList) {
        this.urlList = urlList;
    }
    
    public void setVideoLocalPath(final String videoLocalPath) {
        this.videoLocalPath = videoLocalPath;
    }
    
    public void setWaterMark(final boolean waterMark) {
        this.waterMark = waterMark;
    }
    
    public void setWidth(final int width) {
        this.width = width;
    }
}
