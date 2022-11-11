// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ag0.a;
import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 " }, d2 = { "Lcom/reddit/data/model/Data;", "", "video_id", "", "streamer_key", "rtmp_url", "hls_url", "post", "Lcom/reddit/data/model/StreamingPost;", "share_link", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/data/model/StreamingPost;Ljava/lang/String;)V", "getHls_url", "()Ljava/lang/String;", "getPost", "()Lcom/reddit/data/model/StreamingPost;", "getRtmp_url", "getShare_link", "getStreamer_key", "getVideo_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Data
{
    private final String hls_url;
    private final StreamingPost post;
    private final String rtmp_url;
    private final String share_link;
    private final String streamer_key;
    private final String video_id;
    
    public Data(final String video_id, final String streamer_key, final String rtmp_url, final String hls_url, final StreamingPost post, final String share_link) {
        f.f((Object)video_id, "video_id");
        f.f((Object)streamer_key, "streamer_key");
        f.f((Object)rtmp_url, "rtmp_url");
        f.f((Object)hls_url, "hls_url");
        f.f((Object)post, "post");
        f.f((Object)share_link, "share_link");
        this.video_id = video_id;
        this.streamer_key = streamer_key;
        this.rtmp_url = rtmp_url;
        this.hls_url = hls_url;
        this.post = post;
        this.share_link = share_link;
    }
    
    public final String component1() {
        return this.video_id;
    }
    
    public final String component2() {
        return this.streamer_key;
    }
    
    public final String component3() {
        return this.rtmp_url;
    }
    
    public final String component4() {
        return this.hls_url;
    }
    
    public final StreamingPost component5() {
        return this.post;
    }
    
    public final String component6() {
        return this.share_link;
    }
    
    public final Data copy(final String s, final String s2, final String s3, final String s4, final StreamingPost streamingPost, final String s5) {
        f.f((Object)s, "video_id");
        f.f((Object)s2, "streamer_key");
        f.f((Object)s3, "rtmp_url");
        f.f((Object)s4, "hls_url");
        f.f((Object)streamingPost, "post");
        f.f((Object)s5, "share_link");
        return new Data(s, s2, s3, s4, streamingPost, s5);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Data)) {
            return false;
        }
        final Data data = (Data)o;
        return f.a((Object)this.video_id, (Object)data.video_id) && f.a((Object)this.streamer_key, (Object)data.streamer_key) && f.a((Object)this.rtmp_url, (Object)data.rtmp_url) && f.a((Object)this.hls_url, (Object)data.hls_url) && f.a((Object)this.post, (Object)data.post) && f.a((Object)this.share_link, (Object)data.share_link);
    }
    
    public final String getHls_url() {
        return this.hls_url;
    }
    
    public final StreamingPost getPost() {
        return this.post;
    }
    
    public final String getRtmp_url() {
        return this.rtmp_url;
    }
    
    public final String getShare_link() {
        return this.share_link;
    }
    
    public final String getStreamer_key() {
        return this.streamer_key;
    }
    
    public final String getVideo_id() {
        return this.video_id;
    }
    
    @Override
    public int hashCode() {
        return this.share_link.hashCode() + (this.post.hashCode() + a.f(this.hls_url, a.f(this.rtmp_url, a.f(this.streamer_key, this.video_id.hashCode() * 31, 31), 31), 31)) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Data(video_id=");
        k.append(this.video_id);
        k.append(", streamer_key=");
        k.append(this.streamer_key);
        k.append(", rtmp_url=");
        k.append(this.rtmp_url);
        k.append(", hls_url=");
        k.append(this.hls_url);
        k.append(", post=");
        k.append(this.post);
        k.append(", share_link=");
        return b.k(k, this.share_link, ')');
    }
}
