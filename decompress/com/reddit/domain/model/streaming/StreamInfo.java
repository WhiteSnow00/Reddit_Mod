// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import androidx.appcompat.widget.s0;
import ag0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\tH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u0087\u0001\u0010+\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\tH\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u00061" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamInfo;", "", "id", "", "title", "publishedAt", "publishEndAt", "publisherId", "channelId", "", "transcoderHostname", "createdAt", "updatedAt", "updateAt", "publishUrl", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()I", "getCreatedAt", "()Ljava/lang/String;", "getId", "getPublishEndAt", "getPublishUrl", "getPublishedAt", "getPublisherId", "getTitle", "getTranscoderHostname", "getUpdateAt", "getUpdatedAt", "getUrl", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StreamInfo
{
    private final int channelId;
    private final String createdAt;
    private final String id;
    private final String publishEndAt;
    private final String publishUrl;
    private final String publishedAt;
    private final String publisherId;
    private final String title;
    private final String transcoderHostname;
    private final String updateAt;
    private final String updatedAt;
    private final String url;
    
    public StreamInfo(@n(name = "id") final String id, @n(name = "title") final String title, @n(name = "published_at") final String publishedAt, @n(name = "publish_end_at") final String publishEndAt, @n(name = "publisher_id") final String publisherId, @n(name = "channel_id") final int channelId, @n(name = "transcoder_hostname") final String transcoderHostname, @n(name = "created_at") final String createdAt, @n(name = "updated_at") final String updatedAt, @n(name = "update_at") final String updateAt, @n(name = "publish_url") final String publishUrl, @n(name = "url") final String url) {
        f.f((Object)id, "id");
        f.f((Object)title, "title");
        f.f((Object)publishedAt, "publishedAt");
        f.f((Object)publisherId, "publisherId");
        f.f((Object)createdAt, "createdAt");
        f.f((Object)updatedAt, "updatedAt");
        f.f((Object)publishUrl, "publishUrl");
        f.f((Object)url, "url");
        this.id = id;
        this.title = title;
        this.publishedAt = publishedAt;
        this.publishEndAt = publishEndAt;
        this.publisherId = publisherId;
        this.channelId = channelId;
        this.transcoderHostname = transcoderHostname;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updateAt = updateAt;
        this.publishUrl = publishUrl;
        this.url = url;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component10() {
        return this.updateAt;
    }
    
    public final String component11() {
        return this.publishUrl;
    }
    
    public final String component12() {
        return this.url;
    }
    
    public final String component2() {
        return this.title;
    }
    
    public final String component3() {
        return this.publishedAt;
    }
    
    public final String component4() {
        return this.publishEndAt;
    }
    
    public final String component5() {
        return this.publisherId;
    }
    
    public final int component6() {
        return this.channelId;
    }
    
    public final String component7() {
        return this.transcoderHostname;
    }
    
    public final String component8() {
        return this.createdAt;
    }
    
    public final String component9() {
        return this.updatedAt;
    }
    
    public final StreamInfo copy(@n(name = "id") final String s, @n(name = "title") final String s2, @n(name = "published_at") final String s3, @n(name = "publish_end_at") final String s4, @n(name = "publisher_id") final String s5, @n(name = "channel_id") final int n, @n(name = "transcoder_hostname") final String s6, @n(name = "created_at") final String s7, @n(name = "updated_at") final String s8, @n(name = "update_at") final String s9, @n(name = "publish_url") final String s10, @n(name = "url") final String s11) {
        f.f((Object)s, "id");
        f.f((Object)s2, "title");
        f.f((Object)s3, "publishedAt");
        f.f((Object)s5, "publisherId");
        f.f((Object)s7, "createdAt");
        f.f((Object)s8, "updatedAt");
        f.f((Object)s10, "publishUrl");
        f.f((Object)s11, "url");
        return new StreamInfo(s, s2, s3, s4, s5, n, s6, s7, s8, s9, s10, s11);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamInfo)) {
            return false;
        }
        final StreamInfo streamInfo = (StreamInfo)o;
        return f.a((Object)this.id, (Object)streamInfo.id) && f.a((Object)this.title, (Object)streamInfo.title) && f.a((Object)this.publishedAt, (Object)streamInfo.publishedAt) && f.a((Object)this.publishEndAt, (Object)streamInfo.publishEndAt) && f.a((Object)this.publisherId, (Object)streamInfo.publisherId) && this.channelId == streamInfo.channelId && f.a((Object)this.transcoderHostname, (Object)streamInfo.transcoderHostname) && f.a((Object)this.createdAt, (Object)streamInfo.createdAt) && f.a((Object)this.updatedAt, (Object)streamInfo.updatedAt) && f.a((Object)this.updateAt, (Object)streamInfo.updateAt) && f.a((Object)this.publishUrl, (Object)streamInfo.publishUrl) && f.a((Object)this.url, (Object)streamInfo.url);
    }
    
    public final int getChannelId() {
        return this.channelId;
    }
    
    public final String getCreatedAt() {
        return this.createdAt;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getPublishEndAt() {
        return this.publishEndAt;
    }
    
    public final String getPublishUrl() {
        return this.publishUrl;
    }
    
    public final String getPublishedAt() {
        return this.publishedAt;
    }
    
    public final String getPublisherId() {
        return this.publisherId;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final String getTranscoderHostname() {
        return this.transcoderHostname;
    }
    
    public final String getUpdateAt() {
        return this.updateAt;
    }
    
    public final String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.publishedAt, a.f(this.title, this.id.hashCode() * 31, 31), 31);
        final String publishEndAt = this.publishEndAt;
        final int n = 0;
        int hashCode;
        if (publishEndAt == null) {
            hashCode = 0;
        }
        else {
            hashCode = publishEndAt.hashCode();
        }
        final int e = s0.e(this.channelId, a.f(this.publisherId, (f + hashCode) * 31, 31), 31);
        final String transcoderHostname = this.transcoderHostname;
        int hashCode2;
        if (transcoderHostname == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = transcoderHostname.hashCode();
        }
        final int f2 = a.f(this.updatedAt, a.f(this.createdAt, (e + hashCode2) * 31, 31), 31);
        final String updateAt = this.updateAt;
        int hashCode3;
        if (updateAt == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = updateAt.hashCode();
        }
        return this.url.hashCode() + a.f(this.publishUrl, (f2 + hashCode3) * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("StreamInfo(id=");
        k.append(this.id);
        k.append(", title=");
        k.append(this.title);
        k.append(", publishedAt=");
        k.append(this.publishedAt);
        k.append(", publishEndAt=");
        k.append(this.publishEndAt);
        k.append(", publisherId=");
        k.append(this.publisherId);
        k.append(", channelId=");
        k.append(this.channelId);
        k.append(", transcoderHostname=");
        k.append(this.transcoderHostname);
        k.append(", createdAt=");
        k.append(this.createdAt);
        k.append(", updatedAt=");
        k.append(this.updatedAt);
        k.append(", updateAt=");
        k.append(this.updateAt);
        k.append(", publishUrl=");
        k.append(this.publishUrl);
        k.append(", url=");
        return b.k(k, this.url, ')');
    }
}
