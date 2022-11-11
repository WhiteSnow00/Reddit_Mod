// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 " }, d2 = { "Lcom/reddit/domain/model/RedditVideoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/RedditVideo;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/RedditVideoMp4Urls;", "nullableRedditVideoMp4UrlsAdapter", "stringAdapter", "", "intAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditVideoJsonAdapter extends JsonAdapter<RedditVideo>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<RedditVideo> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<RedditVideoMp4Urls> nullableRedditVideoMp4UrlsAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public RedditVideoJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "packaged_mp4_url", "mp4_urls", "dash_url", "duration", "fallback_url", "height", "width", "hls_url", "is_gif", "scrubber_media_url", "transcoding_status", "downloadUrl" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "packagedMp4Url");
        this.nullableRedditVideoMp4UrlsAdapter = (JsonAdapter<RedditVideoMp4Urls>)y.c((Type)RedditVideoMp4Urls.class, (Set)instance, "mp4Urls");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "dashUrl");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "duration");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isGif");
    }
    
    public RedditVideo fromJson(final JsonReader jsonReader) {
        final Class<String> clazz = String.class;
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Integer n2 = null;
        String s = null;
        RedditVideoMp4Urls redditVideoMp4Urls = null;
        Object o = null;
        Integer n3 = null;
        Object o2 = null;
        Integer n4 = null;
        Boolean b = null;
        Object o3 = null;
        String s2 = null;
        Object o4 = null;
        Object o5 = null;
        while (jsonReader.hasNext()) {
            String s4 = null;
            RedditVideoMp4Urls redditVideoMp4Urls9 = null;
            Label_0593: {
                RedditVideoMp4Urls redditVideoMp4Urls3 = null;
                Label_0589: {
                    switch (jsonReader.E(this.options)) {
                        case 11: {
                            o5 = this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFF7FF;
                            break;
                        }
                        case 10: {
                            o4 = this.stringAdapter.fromJson(jsonReader);
                            if (o4 != null) {
                                break;
                            }
                            throw a.n("transcodingStatus", "transcoding_status", jsonReader);
                        }
                        case 9: {
                            final String s3 = (String)this.stringAdapter.fromJson(jsonReader);
                            if (s3 != null) {
                                final RedditVideoMp4Urls redditVideoMp4Urls2 = redditVideoMp4Urls;
                                s4 = s;
                                redditVideoMp4Urls3 = redditVideoMp4Urls2;
                                s2 = s3;
                                break Label_0589;
                            }
                            throw a.n("scrubbedMediaUrl", "scrubber_media_url", jsonReader);
                        }
                        case 8: {
                            b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b != null) {
                                final RedditVideoMp4Urls redditVideoMp4Urls4 = redditVideoMp4Urls;
                                s4 = s;
                                redditVideoMp4Urls3 = redditVideoMp4Urls4;
                                break Label_0589;
                            }
                            throw a.n("isGif", "is_gif", jsonReader);
                        }
                        case 7: {
                            o3 = this.stringAdapter.fromJson(jsonReader);
                            if (o3 != null) {
                                final RedditVideoMp4Urls redditVideoMp4Urls5 = redditVideoMp4Urls;
                                s4 = s;
                                redditVideoMp4Urls3 = redditVideoMp4Urls5;
                                break Label_0589;
                            }
                            throw a.n("hlsUrl", "hls_url", jsonReader);
                        }
                        case 6: {
                            final Integer n5 = (Integer)this.intAdapter.fromJson(jsonReader);
                            if (n5 != null) {
                                final RedditVideoMp4Urls redditVideoMp4Urls6 = redditVideoMp4Urls;
                                s4 = s;
                                redditVideoMp4Urls3 = redditVideoMp4Urls6;
                                n4 = n5;
                                break Label_0589;
                            }
                            throw a.n("width", "width", jsonReader);
                        }
                        case 5: {
                            final Integer n6 = (Integer)this.intAdapter.fromJson(jsonReader);
                            if (n6 != null) {
                                final RedditVideoMp4Urls redditVideoMp4Urls7 = redditVideoMp4Urls;
                                s4 = s;
                                redditVideoMp4Urls3 = redditVideoMp4Urls7;
                                n3 = n6;
                                break Label_0589;
                            }
                            throw a.n("height", "height", jsonReader);
                        }
                        case 4: {
                            o2 = this.stringAdapter.fromJson(jsonReader);
                            if (o2 != null) {
                                final RedditVideoMp4Urls redditVideoMp4Urls8 = redditVideoMp4Urls;
                                s4 = s;
                                redditVideoMp4Urls3 = redditVideoMp4Urls8;
                                break Label_0589;
                            }
                            throw a.n("fallBackUrl", "fallback_url", jsonReader);
                        }
                        case 3: {
                            n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                            if (n2 != null) {
                                redditVideoMp4Urls9 = redditVideoMp4Urls;
                                s4 = s;
                                break Label_0593;
                            }
                            throw a.n("duration", "duration", jsonReader);
                        }
                        case 2: {
                            o = this.stringAdapter.fromJson(jsonReader);
                            if (o != null) {
                                continue;
                            }
                            throw a.n("dashUrl", "dash_url", jsonReader);
                        }
                        case 1: {
                            redditVideoMp4Urls = (RedditVideoMp4Urls)this.nullableRedditVideoMp4UrlsAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFFD;
                            break;
                        }
                        case 0: {
                            final String s5 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFFE;
                            redditVideoMp4Urls3 = redditVideoMp4Urls;
                            s4 = s5;
                            break Label_0589;
                        }
                        case -1: {
                            jsonReader.H();
                            jsonReader.F1();
                            break;
                        }
                    }
                    final String s6 = s;
                    redditVideoMp4Urls3 = redditVideoMp4Urls;
                    s4 = s6;
                }
                redditVideoMp4Urls9 = redditVideoMp4Urls3;
            }
            s = s4;
            redditVideoMp4Urls = redditVideoMp4Urls9;
        }
        jsonReader.r();
        if (n == -2052) {
            if (o == null) {
                throw a.h("dashUrl", "dash_url", jsonReader);
            }
            if (n2 == null) {
                throw a.h("duration", "duration", jsonReader);
            }
            final int intValue = n2;
            if (o2 == null) {
                throw a.h("fallBackUrl", "fallback_url", jsonReader);
            }
            if (n3 == null) {
                throw a.h("height", "height", jsonReader);
            }
            final int intValue2 = n3;
            if (n4 == null) {
                throw a.h("width", "width", jsonReader);
            }
            final int intValue3 = n4;
            if (o3 == null) {
                throw a.h("hlsUrl", "hls_url", jsonReader);
            }
            if (b == null) {
                throw a.h("isGif", "is_gif", jsonReader);
            }
            final boolean booleanValue = b;
            if (s2 == null) {
                throw a.h("scrubbedMediaUrl", "scrubber_media_url", jsonReader);
            }
            if (o4 != null) {
                return new RedditVideo(s, redditVideoMp4Urls, (String)o, intValue, (String)o2, intValue2, intValue3, (String)o3, booleanValue, s2, (String)o4, (String)o5);
            }
            throw a.h("transcodingStatus", "transcoding_status", jsonReader);
        }
        else {
            final Constructor<RedditVideo> constructorRef = this.constructorRef;
            Constructor<RedditVideo> declaredConstructor;
            if (constructorRef == null) {
                final Class<Integer> type = Integer.TYPE;
                declaredConstructor = RedditVideo.class.getDeclaredConstructor(clazz, RedditVideoMp4Urls.class, clazz, type, clazz, type, type, clazz, Boolean.TYPE, clazz, clazz, clazz, type, a.c);
                e.e((Object)(this.constructorRef = declaredConstructor), "RedditVideo::class.java.\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (o == null) {
                throw a.h("dashUrl", "dash_url", jsonReader);
            }
            if (n2 == null) {
                throw a.h("duration", "duration", jsonReader);
            }
            final int intValue4 = n2;
            if (o2 == null) {
                throw a.h("fallBackUrl", "fallback_url", jsonReader);
            }
            if (n3 == null) {
                throw a.h("height", "height", jsonReader);
            }
            final int intValue5 = n3;
            if (n4 == null) {
                throw a.h("width", "width", jsonReader);
            }
            final int intValue6 = n4;
            if (o3 == null) {
                throw a.h("hlsUrl", "hls_url", jsonReader);
            }
            if (b == null) {
                throw a.h("isGif", "is_gif", jsonReader);
            }
            final boolean booleanValue2 = b;
            if (s2 == null) {
                throw a.h("scrubbedMediaUrl", "scrubber_media_url", jsonReader);
            }
            if (o4 != null) {
                final RedditVideo instance = declaredConstructor.newInstance(s, redditVideoMp4Urls, o, intValue4, o2, intValue5, intValue6, o3, booleanValue2, s2, o4, o5, n, null);
                e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("transcodingStatus", "transcoding_status", jsonReader);
        }
    }
    
    public void toJson(final x x, final RedditVideo redditVideo) {
        e.f((Object)x, "writer");
        if (redditVideo != null) {
            x.h();
            x.u("packaged_mp4_url");
            this.nullableStringAdapter.toJson(x, (Object)redditVideo.getPackagedMp4Url());
            x.u("mp4_urls");
            this.nullableRedditVideoMp4UrlsAdapter.toJson(x, (Object)redditVideo.getMp4Urls());
            x.u("dash_url");
            this.stringAdapter.toJson(x, (Object)redditVideo.getDashUrl());
            x.u("duration");
            this.intAdapter.toJson(x, (Object)redditVideo.getDuration());
            x.u("fallback_url");
            this.stringAdapter.toJson(x, (Object)redditVideo.getFallBackUrl());
            x.u("height");
            this.intAdapter.toJson(x, (Object)redditVideo.getHeight());
            x.u("width");
            this.intAdapter.toJson(x, (Object)redditVideo.getWidth());
            x.u("hls_url");
            this.stringAdapter.toJson(x, (Object)redditVideo.getHlsUrl());
            x.u("is_gif");
            this.booleanAdapter.toJson(x, (Object)redditVideo.isGif());
            x.u("scrubber_media_url");
            this.stringAdapter.toJson(x, (Object)redditVideo.getScrubbedMediaUrl());
            x.u("transcoding_status");
            this.stringAdapter.toJson(x, (Object)redditVideo.getTranscodingStatus());
            x.u("downloadUrl");
            this.nullableStringAdapter.toJson(x, (Object)redditVideo.getDownloadUrl());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(RedditVideo)";
    }
}
