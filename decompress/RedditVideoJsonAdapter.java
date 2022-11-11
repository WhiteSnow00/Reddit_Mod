// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d" }, d2 = { "Lcom/reddit/data/model/v1/RedditVideoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/model/v1/RedditVideo;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditVideoJsonAdapter extends JsonAdapter<RedditVideo>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<RedditVideo> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public RedditVideoJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "transcoding_status", "width", "height", "duration", "fallback_url", "hls_url", "dash_url", "scrubber_media_url", "is_gif" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "transcodingStatus");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "width");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isGif");
    }
    
    public RedditVideo fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Integer value = 0;
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Integer n3;
        Integer n2 = n3 = value;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 8: {
                    false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (false != null) {
                        n &= 0xFFFFFEFF;
                        continue;
                    }
                    throw a.n("isGif", "is_gif", jsonReader);
                }
                case 7: {
                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFF7F;
                    continue;
                }
                case 6: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFBF;
                    continue;
                }
                case 5: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    n3 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n3 != null) {
                        n &= 0xFFFFFFF7;
                        continue;
                    }
                    throw a.n("duration", "duration", jsonReader);
                }
                case 2: {
                    n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        n &= 0xFFFFFFFB;
                        continue;
                    }
                    throw a.n("height", "height", jsonReader);
                }
                case 1: {
                    value = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (value != null) {
                        n &= 0xFFFFFFFD;
                        continue;
                    }
                    throw a.n("width", "width", jsonReader);
                }
                case 0: {
                    s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFE;
                    continue;
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -512) {
            return new RedditVideo(s, value, n2, n3, (String)o, (String)o2, (String)o3, (String)o4, false);
        }
        Constructor<RedditVideo> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            final Class<Integer> type = Integer.TYPE;
            constructorRef = RedditVideo.class.getDeclaredConstructor(String.class, type, type, type, String.class, String.class, String.class, String.class, Boolean.TYPE, type, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "RedditVideo::class.java.\u2026his.constructorRef = it }");
        }
        final RedditVideo instance = constructorRef.newInstance(s, value, n2, n3, o, o2, o3, o4, false, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final RedditVideo redditVideo) {
        f.f((Object)x, "writer");
        if (redditVideo != null) {
            x.h();
            x.w("transcoding_status");
            this.nullableStringAdapter.toJson(x, (Object)redditVideo.getTranscodingStatus());
            x.w("width");
            this.intAdapter.toJson(x, (Object)redditVideo.getWidth());
            x.w("height");
            this.intAdapter.toJson(x, (Object)redditVideo.getHeight());
            x.w("duration");
            this.intAdapter.toJson(x, (Object)redditVideo.getDuration());
            x.w("fallback_url");
            this.nullableStringAdapter.toJson(x, (Object)redditVideo.getFallbackUrl());
            x.w("hls_url");
            this.nullableStringAdapter.toJson(x, (Object)redditVideo.getHlsUrl());
            x.w("dash_url");
            this.nullableStringAdapter.toJson(x, (Object)redditVideo.getDashUrl());
            x.w("scrubber_media_url");
            this.nullableStringAdapter.toJson(x, (Object)redditVideo.getScrubberMediaUrl());
            x.w("is_gif");
            this.booleanAdapter.toJson(x, (Object)redditVideo.isGif());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(RedditVideo)";
    }
}
