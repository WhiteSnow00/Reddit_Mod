// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import qd2.a;
import com.squareup.moshi.JsonReader;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.squareup.moshi.JsonReader$b;
import com.reddit.common.size.MediaSize;
import com.reddit.common.subreddit.SubredditPostType;
import java.util.List;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonAdapter$e;
import kotlin.Metadata;
import y31.b;

@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u001dB\u0089\u0001\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\t\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\t\u0012\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\t\u0012\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/FallbackUserSubredditJsonAdapter;", "Ly31/b;", "Lcom/reddit/domain/model/UserSubreddit;", "getInvalidValue", "Lcom/squareup/moshi/JsonReader;", "reader", "tryParsingUsingLastKnownMapping", "Lcom/squareup/moshi/JsonReader$b;", "getFallbackKeys", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableBooleanAdapter", "booleanAdapter", "", "nullableIntAdapter", "Lcom/reddit/common/size/MediaSize;", "nullableMediaSizeAdapter", "", "Lcom/reddit/common/subreddit/SubredditPostType;", "nullableListOfSubredditPostTypeAdapter", "options", "Lcom/squareup/moshi/JsonReader$b;", "userSubredditJsonAdapter", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class FallbackUserSubredditJsonAdapter extends b<UserSubreddit>
{
    public static final Companion Companion;
    private static final JsonAdapter$e FACTORY;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<SubredditPostType>> nullableListOfSubredditPostTypeAdapter;
    private final JsonAdapter<MediaSize> nullableMediaSizeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    static {
        Companion = new Companion(null);
        FACTORY = (JsonAdapter$e)new FallbackUserSubredditJsonAdapter$Companion$FACTORY$1();
    }
    
    public FallbackUserSubredditJsonAdapter(final JsonAdapter<String> stringAdapter, final JsonAdapter<String> nullableStringAdapter, final JsonAdapter<Boolean> nullableBooleanAdapter, final JsonAdapter<Boolean> booleanAdapter, final JsonAdapter<Integer> nullableIntAdapter, final JsonAdapter<MediaSize> nullableMediaSizeAdapter, final JsonAdapter<List<SubredditPostType>> nullableListOfSubredditPostTypeAdapter, final JsonAdapter<UserSubreddit> jsonAdapter) {
        f.f((Object)stringAdapter, "stringAdapter");
        f.f((Object)nullableStringAdapter, "nullableStringAdapter");
        f.f((Object)nullableBooleanAdapter, "nullableBooleanAdapter");
        f.f((Object)booleanAdapter, "booleanAdapter");
        f.f((Object)nullableIntAdapter, "nullableIntAdapter");
        f.f((Object)nullableMediaSizeAdapter, "nullableMediaSizeAdapter");
        f.f((Object)nullableListOfSubredditPostTypeAdapter, "nullableListOfSubredditPostTypeAdapter");
        f.f((Object)jsonAdapter, "userSubredditJsonAdapter");
        super((JsonAdapter)jsonAdapter);
        this.stringAdapter = stringAdapter;
        this.nullableStringAdapter = nullableStringAdapter;
        this.nullableBooleanAdapter = nullableBooleanAdapter;
        this.booleanAdapter = booleanAdapter;
        this.nullableIntAdapter = nullableIntAdapter;
        this.nullableMediaSizeAdapter = nullableMediaSizeAdapter;
        this.nullableListOfSubredditPostTypeAdapter = nullableListOfSubredditPostTypeAdapter;
        this.options = JsonReader$b.a(new String[] { "kindWithId", "bannerImg", "userIsBanned", "description", "userIsMuted", "displayName", "headerImg", "title", "userIsModerator", "over18", "iconImg", "displayNamePrefixed", "subscribers", "isDefaultIcon", "keyColor", "isDefaultBanner", "url", "userIsContributor", "publicDescription", "subredditType", "userIsSubscriber", "showInDefaultSubreddits", "iconSize", "bannerSize", "allowedPostTypes" });
    }
    
    public static final /* synthetic */ JsonAdapter$e access$getFACTORY$cp() {
        return FallbackUserSubredditJsonAdapter.FACTORY;
    }
    
    public JsonReader$b getFallbackKeys() {
        return this.options;
    }
    
    public UserSubreddit getInvalidValue() {
        return null;
    }
    
    public UserSubreddit tryParsingUsingLastKnownMapping(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Object o2;
        Object o = o2 = null;
        Object o4;
        Object o3 = o4 = o2;
        Object o6;
        Object o5 = o6 = o4;
        Object o8;
        Object o7 = o8 = o6;
        Object o10;
        Object o9 = o10 = o8;
        Object o12;
        Object o11 = o12 = o10;
        Object o14;
        Object o13 = o14 = o12;
        Object o16;
        Object o15 = o16 = o14;
        Object o18;
        Object o17 = o18 = o16;
        Object o20;
        Object o19 = o20 = o18;
        Object o22;
        Object o21 = o22 = o20;
        Object o24;
        Object o23 = o24 = o22;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 24: {
                    o24 = this.nullableListOfSubredditPostTypeAdapter.fromJson(jsonReader);
                    continue;
                }
                case 23: {
                    o23 = this.nullableMediaSizeAdapter.fromJson(jsonReader);
                    continue;
                }
                case 22: {
                    o22 = this.nullableMediaSizeAdapter.fromJson(jsonReader);
                    continue;
                }
                case 21: {
                    o4 = this.booleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 20: {
                    o21 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 19: {
                    o20 = this.stringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 18: {
                    o19 = this.stringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 17: {
                    o18 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 16: {
                    o17 = this.stringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 15: {
                    o3 = this.booleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 14: {
                    o16 = this.stringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 13: {
                    o = this.booleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 12: {
                    o15 = this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 11: {
                    o14 = this.stringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 10: {
                    o13 = this.stringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 9: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    o12 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    o11 = this.stringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    o10 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    o9 = this.stringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o8 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    o7 = this.stringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    o6 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    o2 = this.stringAdapter.fromJson(jsonReader);
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
        if (o2 == null) {
            throw a.h("kindWithId", "name", jsonReader);
        }
        if (o7 == null) {
            throw a.h("description", "description", jsonReader);
        }
        if (o9 == null) {
            throw a.h("displayName", "diplay_name", jsonReader);
        }
        if (o11 == null) {
            throw a.h("title", "title", jsonReader);
        }
        if (b == null) {
            throw a.h("over18", "over18", jsonReader);
        }
        final boolean booleanValue = b;
        if (o13 == null) {
            throw a.h("iconImg", "iconImg", jsonReader);
        }
        if (o14 == null) {
            throw a.h("displayNamePrefixed", "displayNamePrefixed", jsonReader);
        }
        if (o == null) {
            throw a.h("isDefaultIcon", "isDefaultIcon", jsonReader);
        }
        final boolean booleanValue2 = (boolean)o;
        if (o16 == null) {
            throw a.h("keyColor", "keyColor", jsonReader);
        }
        if (o3 == null) {
            throw a.h("isDefaultBanner", "isDefaultBanner", jsonReader);
        }
        final boolean booleanValue3 = (boolean)o3;
        if (o17 == null) {
            throw a.h("url", "url", jsonReader);
        }
        if (o19 == null) {
            throw a.h("publicDescription", "publicDescription", jsonReader);
        }
        if (o20 == null) {
            throw a.h("subredditType", "subredditType", jsonReader);
        }
        if (o4 != null) {
            return new UserSubreddit((String)o2, (String)o5, (Boolean)o6, (String)o7, (Boolean)o8, (String)o9, (String)o10, (String)o11, (Boolean)o12, booleanValue, (String)o13, (String)o14, (Integer)o15, booleanValue2, (String)o16, booleanValue3, (String)o17, (Boolean)o18, (String)o19, (String)o20, (Boolean)o21, (boolean)o4, (MediaSize)o22, (MediaSize)o23, (List<? extends SubredditPostType>)o24);
        }
        throw a.h("showInDefaultSubreddits", "showInDefaultSubreddits", jsonReader);
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/FallbackUserSubredditJsonAdapter$Companion;", "", "Lcom/squareup/moshi/JsonAdapter$e;", "FACTORY", "Lcom/squareup/moshi/JsonAdapter$e;", "getFACTORY", "()Lcom/squareup/moshi/JsonAdapter$e;", "<init>", "()V", "model_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final JsonAdapter$e getFACTORY() {
            return FallbackUserSubredditJsonAdapter.access$getFACTORY$cp();
        }
    }
}
