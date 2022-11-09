// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.Map;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R(\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!" }, d2 = { "Lcom/reddit/domain/model/UserCommentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/UserComment;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "Lcom/reddit/domain/model/MediaMetaData;", "nullableMapOfStringMediaMetaDataAdapter", "", "longAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class UserCommentJsonAdapter extends JsonAdapter<UserComment>
{
    private volatile Constructor<UserComment> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Map<String, MediaMetaData>> nullableMapOfStringMediaMetaDataAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public UserCommentJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "link_id", "link_title", "body_html", "body", "media_metadata", "created_utc", "subreddit_name_prefixed", "score" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "linkTitle");
        this.nullableMapOfStringMediaMetaDataAdapter = (JsonAdapter<Map<String, MediaMetaData>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, MediaMetaData.class }), (Set)instance, "mediaMetadata");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "createdUtc");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "score");
    }
    
    public UserComment fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Long value = 0L;
        Integer value2 = 0;
        jsonReader.h();
        int n = -1;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 8: {
                    value2 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (value2 != null) {
                        n &= 0xFFFFFEFF;
                        continue;
                    }
                    throw a.n("score", "score", jsonReader);
                }
                case 7: {
                    o7 = this.stringAdapter.fromJson(jsonReader);
                    if (o7 != null) {
                        n &= 0xFFFFFF7F;
                        continue;
                    }
                    throw a.n("subredditNamePrefixed", "subreddit_name_prefixed", jsonReader);
                }
                case 6: {
                    value = (Long)this.longAdapter.fromJson(jsonReader);
                    if (value != null) {
                        n &= 0xFFFFFFBF;
                        continue;
                    }
                    throw a.n("createdUtc", "created_utc", jsonReader);
                }
                case 5: {
                    o6 = this.nullableMapOfStringMediaMetaDataAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o5 = this.stringAdapter.fromJson(jsonReader);
                    if (o5 != null) {
                        n &= 0xFFFFFFEF;
                        continue;
                    }
                    throw a.n("body", "body", jsonReader);
                }
                case 3: {
                    o4 = this.stringAdapter.fromJson(jsonReader);
                    if (o4 != null) {
                        n &= 0xFFFFFFF7;
                        continue;
                    }
                    throw a.n("bodyHtml", "body_html", jsonReader);
                }
                case 2: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFB;
                    continue;
                }
                case 1: {
                    o2 = this.stringAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        n &= 0xFFFFFFFD;
                        continue;
                    }
                    throw a.n("linkKindWithId", "link_id", jsonReader);
                }
                case 0: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        n &= 0xFFFFFFFE;
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
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
            f.d(o, "null cannot be cast to non-null type kotlin.String");
            f.d(o2, "null cannot be cast to non-null type kotlin.String");
            f.d(o4, "null cannot be cast to non-null type kotlin.String");
            f.d(o5, "null cannot be cast to non-null type kotlin.String");
            final long longValue = value;
            f.d(o7, "null cannot be cast to non-null type kotlin.String");
            return new UserComment((String)o, (String)o2, (String)o3, (String)o4, (String)o5, (Map<String, MediaMetaData>)o6, longValue, (String)o7, value2);
        }
        Constructor<UserComment> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            final Class<Long> type = Long.TYPE;
            final Class<Integer> type2 = Integer.TYPE;
            constructorRef = UserComment.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Map.class, type, String.class, type2, type2, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "UserComment::class.java.\u2026his.constructorRef = it }");
        }
        final UserComment instance = constructorRef.newInstance(o, o2, o3, o4, o5, o6, value, o7, value2, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final UserComment userComment) {
        f.f((Object)x, "writer");
        if (userComment != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)userComment.getId());
            x.w("link_id");
            this.stringAdapter.toJson(x, (Object)userComment.getLinkKindWithId());
            x.w("link_title");
            this.nullableStringAdapter.toJson(x, (Object)userComment.getLinkTitle());
            x.w("body_html");
            this.stringAdapter.toJson(x, (Object)userComment.getBodyHtml());
            x.w("body");
            this.stringAdapter.toJson(x, (Object)userComment.getBody());
            x.w("media_metadata");
            this.nullableMapOfStringMediaMetaDataAdapter.toJson(x, (Object)userComment.getMediaMetadata());
            x.w("created_utc");
            this.longAdapter.toJson(x, (Object)userComment.getCreatedUtc());
            x.w("subreddit_name_prefixed");
            this.stringAdapter.toJson(x, (Object)userComment.getSubredditNamePrefixed());
            x.w("score");
            this.intAdapter.toJson(x, (Object)userComment.getScore());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(UserComment)";
    }
}
