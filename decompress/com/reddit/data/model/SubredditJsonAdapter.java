// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import com.squareup.moshi.x;
import java.io.Serializable;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011¨\u0006 " }, d2 = { "Lcom/reddit/data/model/SubredditJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/model/Subreddit;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Lcom/reddit/data/model/ModPermissions;", "nullableModPermissionsAdapter", "Lcom/reddit/data/model/SubredditStyles;", "nullableSubredditStylesAdapter", "Lcom/reddit/data/model/Content;", "nullableContentAdapter", "", "nullableFloatAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditJsonAdapter extends JsonAdapter<Subreddit>
{
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Content> nullableContentAdapter;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<ModPermissions> nullableModPermissionsAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<SubredditStyles> nullableSubredditStylesAdapter;
    private final JsonReader$b options;
    
    public SubredditJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "name", "id", "prefixedName", "isThumbnailsEnabled", "isQuarantined", "modPermissions", "styles", "isNsfw", "publicDescription", "subscribersCount", "type" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "name");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "isThumbnailsEnabled");
        this.nullableModPermissionsAdapter = (JsonAdapter<ModPermissions>)y.c((Type)ModPermissions.class, (Set)instance, "modPermissions");
        this.nullableSubredditStylesAdapter = (JsonAdapter<SubredditStyles>)y.c((Type)SubredditStyles.class, (Set)instance, "styles");
        this.nullableContentAdapter = (JsonAdapter<Content>)y.c((Type)Content.class, (Set)instance, "publicDescription");
        this.nullableFloatAdapter = (JsonAdapter<Float>)y.c((Type)Float.class, (Set)instance, "subscribersCount");
    }
    
    public Subreddit fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Object o = null;
        Object o2;
        String s = (String)(o2 = o);
        Object o3;
        Serializable s2 = (Serializable)(o3 = o2);
        Object o5;
        Object o4 = o5 = o3;
        Object o7;
        Object o6 = o7 = o5;
        Object o9;
        Object o8 = o9 = o7;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 10: {
                    o9 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 9: {
                    o8 = this.nullableFloatAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    o7 = this.nullableContentAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    o6 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    o5 = this.nullableSubredditStylesAdapter.fromJson(jsonReader);
                    continue;
                }
                case 5: {
                    o4 = this.nullableModPermissionsAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    s2 = (Boolean)this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
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
        return new Subreddit((String)o, s, (String)o2, (Boolean)s2, (Boolean)o3, (ModPermissions)o4, (SubredditStyles)o5, (Boolean)o6, (Content)o7, (Float)o8, (String)o9);
    }
    
    public void toJson(final x x, final Subreddit subreddit) {
        f.f((Object)x, "writer");
        if (subreddit != null) {
            x.h();
            x.w("name");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getName());
            x.w("id");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getId());
            x.w("prefixedName");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getPrefixedName());
            x.w("isThumbnailsEnabled");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.isThumbnailsEnabled());
            x.w("isQuarantined");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.isQuarantined());
            x.w("modPermissions");
            this.nullableModPermissionsAdapter.toJson(x, (Object)subreddit.getModPermissions());
            x.w("styles");
            this.nullableSubredditStylesAdapter.toJson(x, (Object)subreddit.getStyles());
            x.w("isNsfw");
            this.nullableBooleanAdapter.toJson(x, (Object)subreddit.isNsfw());
            x.w("publicDescription");
            this.nullableContentAdapter.toJson(x, (Object)subreddit.getPublicDescription());
            x.w("subscribersCount");
            this.nullableFloatAdapter.toJson(x, (Object)subreddit.getSubscribersCount());
            x.w("type");
            this.nullableStringAdapter.toJson(x, (Object)subreddit.getType());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Subreddit)";
    }
}
