// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import cg2.j;
import dd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%" }, d2 = { "Lcom/reddit/domain/model/VideoUploadJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/VideoUpload;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "nullableLongAdapter", "", "intAdapter", "", "nullableBooleanAdapter", "nullableIntAdapter", "Lcom/reddit/domain/model/DiscussionType;", "nullableDiscussionTypeAdapter", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class VideoUploadJsonAdapter extends JsonAdapter<VideoUpload>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<VideoUpload> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<DiscussionType> nullableDiscussionTypeAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public VideoUploadJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "requestId", "filePath", "title", "bodyText", "subreddit", "uploadUrl", "posterUrl", "thumbnail", "videoKey", "timestamp", "status", "isGif", "attempts", "originalDuration", "duration", "source", "uploadDuration", "uploadError", "videoWidth", "videoHeight", "flairText", "flairId", "discussionType", "isNsfw", "isSpoiler", "parentPostId", "isReactAllowed" });
        final Class<Long> type = Long.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)type, (Set)instance, "id");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "requestId");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "filePath");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "timestamp");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "status");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "isGif");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "attempts");
        this.nullableDiscussionTypeAdapter = (JsonAdapter<DiscussionType>)y.c((Type)DiscussionType.class, (Set)instance, "discussionType");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isNsfw");
    }
    
    public VideoUpload fromJson(final JsonReader jsonReader) {
        final Class<Integer> clazz = Integer.class;
        final Class<String> clazz2 = String.class;
        e.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        int n = -1;
        Long n2 = null;
        Integer n3 = null;
        Boolean b = null;
        Boolean b2 = null;
        String s = null;
        String s2 = null;
        Object o = null;
        String s3 = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        Object o8 = null;
        Object o9 = null;
        Object o10 = null;
        Object o11 = null;
        Object o12 = null;
        Object o13 = null;
        Object o14 = null;
        Object o15 = null;
        Object o16 = null;
        Object o17 = null;
        Object o18 = null;
        Object o19 = null;
        Object o20 = null;
        while (jsonReader.hasNext()) {
            Boolean b4 = null;
            Integer n5 = null;
            String s5 = null;
            Label_0931: {
                String s4 = null;
                Label_0927: {
                    String s8 = null;
                    Label_0915: {
                        String s6 = null;
                        Label_0911: {
                            switch (jsonReader.E(this.options)) {
                                case 27: {
                                    final Boolean b3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                    if (b3 != null) {
                                        n &= 0xF7FFFFFF;
                                        final Integer n4 = n3;
                                        s4 = s3;
                                        b4 = b3;
                                        n5 = n4;
                                        break Label_0927;
                                    }
                                    throw a.n("isReactAllowed", "isReactAllowed", jsonReader);
                                }
                                case 26: {
                                    o20 = this.nullableStringAdapter.fromJson(jsonReader);
                                    n &= 0xFBFFFFFF;
                                    break;
                                }
                                case 25: {
                                    final Boolean b5 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                    if (b5 != null) {
                                        final Integer n6 = n3;
                                        s5 = s3;
                                        b4 = false;
                                        n5 = n6;
                                        b2 = b5;
                                        break Label_0931;
                                    }
                                    throw a.n("isSpoiler", "isSpoiler", jsonReader);
                                }
                                case 24: {
                                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                    if (b != null) {
                                        continue;
                                    }
                                    throw a.n("isNsfw", "isNsfw", jsonReader);
                                }
                                case 23: {
                                    o19 = this.nullableDiscussionTypeAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 22: {
                                    o18 = this.nullableStringAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 21: {
                                    o17 = this.nullableStringAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 20: {
                                    o16 = this.nullableIntAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 19: {
                                    o15 = this.nullableIntAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 18: {
                                    o14 = this.nullableStringAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 17: {
                                    o13 = this.nullableLongAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 16: {
                                    o12 = this.nullableStringAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 15: {
                                    o11 = this.nullableIntAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 14: {
                                    o10 = this.nullableIntAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 13: {
                                    o9 = this.nullableIntAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 12: {
                                    o8 = this.nullableBooleanAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 11: {
                                    n3 = (Integer)this.intAdapter.fromJson(jsonReader);
                                    if (n3 != null) {
                                        break;
                                    }
                                    throw a.n("status", "status", jsonReader);
                                }
                                case 10: {
                                    o7 = this.nullableLongAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 9: {
                                    o6 = this.nullableStringAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 8: {
                                    o5 = this.stringAdapter.fromJson(jsonReader);
                                    if (o5 != null) {
                                        break;
                                    }
                                    throw a.n("thumbnail", "thumbnail", jsonReader);
                                }
                                case 7: {
                                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 6: {
                                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                                    break;
                                }
                                case 5: {
                                    o2 = this.stringAdapter.fromJson(jsonReader);
                                    if (o2 != null) {
                                        break;
                                    }
                                    throw a.n("subreddit", "subreddit", jsonReader);
                                }
                                case 4: {
                                    s6 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                    n5 = n3;
                                    break Label_0911;
                                }
                                case 3: {
                                    o = this.stringAdapter.fromJson(jsonReader);
                                    if (o != null) {
                                        break;
                                    }
                                    throw a.n("title", "title", jsonReader);
                                }
                                case 2: {
                                    final String s7 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                    final Integer n7 = n3;
                                    s8 = s3;
                                    n5 = n7;
                                    s2 = s7;
                                    break Label_0915;
                                }
                                case 1: {
                                    s = (String)this.stringAdapter.fromJson(jsonReader);
                                    if (s != null) {
                                        break;
                                    }
                                    throw a.n("requestId", "requestId", jsonReader);
                                }
                                case 0: {
                                    n2 = (Long)this.longAdapter.fromJson(jsonReader);
                                    if (n2 != null) {
                                        break;
                                    }
                                    throw a.n("id", "id", jsonReader);
                                }
                                case -1: {
                                    jsonReader.H();
                                    jsonReader.G1();
                                    break;
                                }
                            }
                            s6 = s3;
                            n5 = n3;
                        }
                        s8 = s6;
                    }
                    final Boolean b6 = false;
                    s4 = s8;
                    b4 = b6;
                }
                s5 = s4;
            }
            false = b4;
            n3 = n5;
            s3 = s5;
        }
        jsonReader.r();
        if (n == -201326593) {
            if (n2 == null) {
                throw a.h("id", "id", jsonReader);
            }
            final long longValue = n2;
            if (s == null) {
                throw a.h("requestId", "requestId", jsonReader);
            }
            if (o == null) {
                throw a.h("title", "title", jsonReader);
            }
            if (o2 == null) {
                throw a.h("subreddit", "subreddit", jsonReader);
            }
            if (o5 == null) {
                throw a.h("thumbnail", "thumbnail", jsonReader);
            }
            if (n3 == null) {
                throw a.h("status", "status", jsonReader);
            }
            final int intValue = n3;
            if (b == null) {
                throw a.h("isNsfw", "isNsfw", jsonReader);
            }
            final boolean booleanValue = b;
            if (b2 != null) {
                return new VideoUpload(longValue, s, s2, (String)o, s3, (String)o2, (String)o3, (String)o4, (String)o5, (String)o6, (Long)o7, intValue, (Boolean)o8, (Integer)o9, (Integer)o10, (Integer)o11, (String)o12, (Long)o13, (String)o14, (Integer)o15, (Integer)o16, (String)o17, (String)o18, (DiscussionType)o19, booleanValue, (boolean)b2, (String)o20, (boolean)false);
            }
            throw a.h("isSpoiler", "isSpoiler", jsonReader);
        }
        else {
            final Constructor<VideoUpload> constructorRef = this.constructorRef;
            Constructor<VideoUpload> declaredConstructor;
            if (constructorRef == null) {
                final Class<Long> type = Long.TYPE;
                final Class<Integer> type2 = Integer.TYPE;
                final Class<Boolean> type3 = Boolean.TYPE;
                declaredConstructor = VideoUpload.class.getDeclaredConstructor(type, clazz2, clazz2, clazz2, clazz2, clazz2, clazz2, clazz2, clazz2, clazz2, Long.class, type2, Boolean.class, clazz, clazz, clazz, clazz2, Long.class, clazz2, clazz, clazz, clazz2, clazz2, DiscussionType.class, type3, type3, clazz2, type3, type2, a.c);
                this.constructorRef = declaredConstructor;
                final j a = j.a;
                e.e((Object)declaredConstructor, "VideoUpload::class.java.\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (n2 == null) {
                throw a.h("id", "id", jsonReader);
            }
            final long longValue2 = n2;
            if (s == null) {
                throw a.h("requestId", "requestId", jsonReader);
            }
            if (o == null) {
                throw a.h("title", "title", jsonReader);
            }
            if (o2 == null) {
                throw a.h("subreddit", "subreddit", jsonReader);
            }
            if (o5 == null) {
                throw a.h("thumbnail", "thumbnail", jsonReader);
            }
            if (n3 == null) {
                throw a.h("status", "status", jsonReader);
            }
            final int intValue2 = n3;
            if (b == null) {
                throw a.h("isNsfw", "isNsfw", jsonReader);
            }
            final boolean booleanValue2 = b;
            if (b2 != null) {
                final VideoUpload instance = declaredConstructor.newInstance(longValue2, s, s2, o, s3, o2, o3, o4, o5, o6, o7, intValue2, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, booleanValue2, Boolean.valueOf(b2), o20, false, n, null);
                e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("isSpoiler", "isSpoiler", jsonReader);
        }
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final VideoUpload videoUpload) {
        e.f((Object)x, "writer");
        if (videoUpload != null) {
            x.h();
            x.v("id");
            this.longAdapter.toJson(x, (Object)videoUpload.getId());
            x.v("requestId");
            this.stringAdapter.toJson(x, (Object)videoUpload.getRequestId());
            x.v("filePath");
            this.nullableStringAdapter.toJson(x, (Object)videoUpload.getFilePath());
            x.v("title");
            this.stringAdapter.toJson(x, (Object)videoUpload.getTitle());
            x.v("bodyText");
            this.nullableStringAdapter.toJson(x, (Object)videoUpload.getBodyText());
            x.v("subreddit");
            this.stringAdapter.toJson(x, (Object)videoUpload.getSubreddit());
            x.v("uploadUrl");
            this.nullableStringAdapter.toJson(x, (Object)videoUpload.getUploadUrl());
            x.v("posterUrl");
            this.nullableStringAdapter.toJson(x, (Object)videoUpload.getPosterUrl());
            x.v("thumbnail");
            this.stringAdapter.toJson(x, (Object)videoUpload.getThumbnail());
            x.v("videoKey");
            this.nullableStringAdapter.toJson(x, (Object)videoUpload.getVideoKey());
            x.v("timestamp");
            this.nullableLongAdapter.toJson(x, (Object)videoUpload.getTimestamp());
            x.v("status");
            this.intAdapter.toJson(x, (Object)videoUpload.getStatus());
            x.v("isGif");
            this.nullableBooleanAdapter.toJson(x, (Object)videoUpload.isGif());
            x.v("attempts");
            this.nullableIntAdapter.toJson(x, (Object)videoUpload.getAttempts());
            x.v("originalDuration");
            this.nullableIntAdapter.toJson(x, (Object)videoUpload.getOriginalDuration());
            x.v("duration");
            this.nullableIntAdapter.toJson(x, (Object)videoUpload.getDuration());
            x.v("source");
            this.nullableStringAdapter.toJson(x, (Object)videoUpload.getSource());
            x.v("uploadDuration");
            this.nullableLongAdapter.toJson(x, (Object)videoUpload.getUploadDuration());
            x.v("uploadError");
            this.nullableStringAdapter.toJson(x, (Object)videoUpload.getUploadError());
            x.v("videoWidth");
            this.nullableIntAdapter.toJson(x, (Object)videoUpload.getVideoWidth());
            x.v("videoHeight");
            this.nullableIntAdapter.toJson(x, (Object)videoUpload.getVideoHeight());
            x.v("flairText");
            this.nullableStringAdapter.toJson(x, (Object)videoUpload.getFlairText());
            x.v("flairId");
            this.nullableStringAdapter.toJson(x, (Object)videoUpload.getFlairId());
            x.v("discussionType");
            this.nullableDiscussionTypeAdapter.toJson(x, (Object)videoUpload.getDiscussionType());
            x.v("isNsfw");
            this.booleanAdapter.toJson(x, (Object)videoUpload.isNsfw());
            x.v("isSpoiler");
            this.booleanAdapter.toJson(x, (Object)videoUpload.isSpoiler());
            x.v("parentPostId");
            this.nullableStringAdapter.toJson(x, (Object)videoUpload.getParentPostId());
            x.v("isReactAllowed");
            this.booleanAdapter.toJson(x, (Object)videoUpload.isReactAllowed());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (VideoUpload)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(VideoUpload)";
    }
}
