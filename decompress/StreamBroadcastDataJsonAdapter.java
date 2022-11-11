// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.model.Link;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamBroadcastDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/streaming/StreamBroadcastData;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/Link;", "linkAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class StreamBroadcastDataJsonAdapter extends JsonAdapter<StreamBroadcastData>
{
    private final JsonAdapter<Link> linkAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public StreamBroadcastDataJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "video_id", "streamer_key", "rtmp_url", "hls_url", "post", "share_link" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "videoId");
        this.linkAdapter = (JsonAdapter<Link>)y.c((Type)Link.class, (Set)instance, "post");
    }
    
    public StreamBroadcastData fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s2;
        String s = s2 = null;
        String s4;
        String s3 = s4 = s2;
        Object o2;
        Object o = o2 = s4;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    o2 = this.stringAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        continue;
                    }
                    throw a.n("shareLink", "share_link", jsonReader);
                }
                case 4: {
                    o = this.linkAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("post", "post", jsonReader);
                }
                case 3: {
                    s4 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s4 != null) {
                        continue;
                    }
                    throw a.n("hlsUrl", "hls_url", jsonReader);
                }
                case 2: {
                    s3 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s3 != null) {
                        continue;
                    }
                    throw a.n("rtmpUrl", "rtmp_url", jsonReader);
                }
                case 1: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("streamerKey", "streamer_key", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("videoId", "video_id", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("videoId", "video_id", jsonReader);
        }
        if (s2 == null) {
            throw a.h("streamerKey", "streamer_key", jsonReader);
        }
        if (s3 == null) {
            throw a.h("rtmpUrl", "rtmp_url", jsonReader);
        }
        if (s4 == null) {
            throw a.h("hlsUrl", "hls_url", jsonReader);
        }
        if (o == null) {
            throw a.h("post", "post", jsonReader);
        }
        if (o2 != null) {
            return new StreamBroadcastData(s, s2, s3, s4, (Link)o, (String)o2);
        }
        throw a.h("shareLink", "share_link", jsonReader);
    }
    
    public void toJson(final x x, final StreamBroadcastData streamBroadcastData) {
        f.f((Object)x, "writer");
        if (streamBroadcastData != null) {
            x.h();
            x.w("video_id");
            this.stringAdapter.toJson(x, (Object)streamBroadcastData.getVideoId());
            x.w("streamer_key");
            this.stringAdapter.toJson(x, (Object)streamBroadcastData.getStreamerKey());
            x.w("rtmp_url");
            this.stringAdapter.toJson(x, (Object)streamBroadcastData.getRtmpUrl());
            x.w("hls_url");
            this.stringAdapter.toJson(x, (Object)streamBroadcastData.getHlsUrl());
            x.w("post");
            this.linkAdapter.toJson(x, (Object)streamBroadcastData.getPost());
            x.w("share_link");
            this.stringAdapter.toJson(x, (Object)streamBroadcastData.getShareLink());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(StreamBroadcastData)";
    }
}
