// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import ah2.f;
import com.squareup.moshi.n;
import com.reddit.domain.model.Link;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamBroadcastData;", "", "videoId", "", "streamerKey", "rtmpUrl", "hlsUrl", "post", "Lcom/reddit/domain/model/Link;", "shareLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/Link;Ljava/lang/String;)V", "getHlsUrl", "()Ljava/lang/String;", "getPost", "()Lcom/reddit/domain/model/Link;", "getRtmpUrl", "getShareLink", "getStreamerKey", "getVideoId", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StreamBroadcastData
{
    private final String hlsUrl;
    private final Link post;
    private final String rtmpUrl;
    private final String shareLink;
    private final String streamerKey;
    private final String videoId;
    
    public StreamBroadcastData(@n(name = "video_id") final String videoId, @n(name = "streamer_key") final String streamerKey, @n(name = "rtmp_url") final String rtmpUrl, @n(name = "hls_url") final String hlsUrl, final Link post, @n(name = "share_link") final String shareLink) {
        f.f((Object)videoId, "videoId");
        f.f((Object)streamerKey, "streamerKey");
        f.f((Object)rtmpUrl, "rtmpUrl");
        f.f((Object)hlsUrl, "hlsUrl");
        f.f((Object)post, "post");
        f.f((Object)shareLink, "shareLink");
        this.videoId = videoId;
        this.streamerKey = streamerKey;
        this.rtmpUrl = rtmpUrl;
        this.hlsUrl = hlsUrl;
        this.post = post;
        this.shareLink = shareLink;
    }
    
    public final String getHlsUrl() {
        return this.hlsUrl;
    }
    
    public final Link getPost() {
        return this.post;
    }
    
    public final String getRtmpUrl() {
        return this.rtmpUrl;
    }
    
    public final String getShareLink() {
        return this.shareLink;
    }
    
    public final String getStreamerKey() {
        return this.streamerKey;
    }
    
    public final String getVideoId() {
        return this.videoId;
    }
}
