// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import hg2.j;
import id2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.common.size.MediaSize;
import com.reddit.common.subreddit.SubredditPostType;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$" }, d2 = { "Lcom/reddit/domain/model/UserSubredditJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/UserSubreddit;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableBooleanAdapter", "booleanAdapter", "", "nullableIntAdapter", "Lcom/reddit/common/size/MediaSize;", "nullableMediaSizeAdapter", "", "Lcom/reddit/common/subreddit/SubredditPostType;", "nullableListOfSubredditPostTypeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class UserSubredditJsonAdapter extends JsonAdapter<UserSubreddit>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<UserSubreddit> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<SubredditPostType>> nullableListOfSubredditPostTypeAdapter;
    private final JsonAdapter<MediaSize> nullableMediaSizeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public UserSubredditJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "name", "banner_img", "user_is_banned", "description", "user_is_muted", "display_name", "header_img", "title", "user_is_moderator", "over_18", "icon_img", "display_name_prefixed", "subscribers", "is_default_icon", "key_color", "is_default_banner", "url", "user_is_contributor", "public_description", "subreddit_type", "user_is_subscriber", "default_set", "icon_size", "banner_size", "allowedPostTypes" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "kindWithId");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "bannerImg");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "userIsBanned");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "over18");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "subscribers");
        this.nullableMediaSizeAdapter = (JsonAdapter<MediaSize>)y.c((Type)MediaSize.class, (Set)instance, "iconSize");
        this.nullableListOfSubredditPostTypeAdapter = (JsonAdapter<List<SubredditPostType>>)y.c((Type)a0.d((Class)List.class, new Type[] { SubredditPostType.class }), (Set)instance, "allowedPostTypes");
    }
    
    public UserSubreddit fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        Boolean b2;
        Boolean b = b2 = false;
        int n = -1;
        Object o = null;
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
        Object o21 = null;
        Boolean b3 = b2;
        while (jsonReader.hasNext()) {
            int n2 = 0;
            Label_0979: {
                int n3 = 0;
                switch (jsonReader.E(this.options)) {
                    default: {
                        n2 = n;
                        break Label_0979;
                    }
                    case 24: {
                        o21 = this.nullableListOfSubredditPostTypeAdapter.fromJson(jsonReader);
                        n3 = -16777217;
                        break;
                    }
                    case 23: {
                        o20 = this.nullableMediaSizeAdapter.fromJson(jsonReader);
                        n3 = -8388609;
                        break;
                    }
                    case 22: {
                        o19 = this.nullableMediaSizeAdapter.fromJson(jsonReader);
                        n3 = -4194305;
                        break;
                    }
                    case 21: {
                        b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b2 != null) {
                            n3 = -2097153;
                            break;
                        }
                        throw a.n("showInDefaultSubreddits", "default_set", jsonReader);
                    }
                    case 20: {
                        o18 = this.nullableBooleanAdapter.fromJson(jsonReader);
                        n3 = -1048577;
                        break;
                    }
                    case 19: {
                        o4 = this.stringAdapter.fromJson(jsonReader);
                        if (o4 != null) {
                            n3 = -524289;
                            break;
                        }
                        throw a.n("subredditType", "subreddit_type", jsonReader);
                    }
                    case 18: {
                        o7 = this.stringAdapter.fromJson(jsonReader);
                        if (o7 != null) {
                            n3 = -262145;
                            break;
                        }
                        throw a.n("publicDescription", "public_description", jsonReader);
                    }
                    case 17: {
                        o17 = this.nullableBooleanAdapter.fromJson(jsonReader);
                        n2 = n;
                        break Label_0979;
                    }
                    case 16: {
                        o8 = this.stringAdapter.fromJson(jsonReader);
                        if (o8 != null) {
                            n3 = -65537;
                            break;
                        }
                        throw a.n("url", "url", jsonReader);
                    }
                    case 15: {
                        b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b != null) {
                            n3 = -32769;
                            break;
                        }
                        throw a.n("isDefaultBanner", "is_default_banner", jsonReader);
                    }
                    case 14: {
                        o10 = this.stringAdapter.fromJson(jsonReader);
                        if (o10 != null) {
                            n2 = (n & 0xFFFFBFFF);
                            break Label_0979;
                        }
                        throw a.n("keyColor", "key_color", jsonReader);
                    }
                    case 13: {
                        b3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b3 != null) {
                            n2 = (n & 0xFFFFDFFF);
                            break Label_0979;
                        }
                        throw a.n("isDefaultIcon", "is_default_icon", jsonReader);
                    }
                    case 12: {
                        o15 = this.nullableIntAdapter.fromJson(jsonReader);
                        n2 = n;
                        break Label_0979;
                    }
                    case 11: {
                        o2 = this.stringAdapter.fromJson(jsonReader);
                        if (o2 != null) {
                            n2 = (n & 0xFFFFF7FF);
                            break Label_0979;
                        }
                        throw a.n("displayNamePrefixed", "display_name_prefixed", jsonReader);
                    }
                    case 10: {
                        o = this.stringAdapter.fromJson(jsonReader);
                        if (o != null) {
                            n2 = (n & 0xFFFFFBFF);
                            break Label_0979;
                        }
                        throw a.n("iconImg", "icon_img", jsonReader);
                    }
                    case 9: {
                        false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (false != null) {
                            n2 = (n & 0xFFFFFDFF);
                            break Label_0979;
                        }
                        throw a.n("over18", "over_18", jsonReader);
                    }
                    case 8: {
                        o12 = this.nullableBooleanAdapter.fromJson(jsonReader);
                        n2 = (n & 0xFFFFFEFF);
                        break Label_0979;
                    }
                    case 7: {
                        o3 = this.stringAdapter.fromJson(jsonReader);
                        if (o3 != null) {
                            n2 = (n & 0xFFFFFF7F);
                            break Label_0979;
                        }
                        throw a.n("title", "title", jsonReader);
                    }
                    case 6: {
                        o11 = this.nullableStringAdapter.fromJson(jsonReader);
                        n2 = n;
                        break Label_0979;
                    }
                    case 5: {
                        o5 = this.stringAdapter.fromJson(jsonReader);
                        if (o5 != null) {
                            n &= 0xFFFFFFDF;
                            continue;
                        }
                        throw a.n("displayName", "display_name", jsonReader);
                    }
                    case 4: {
                        o13 = this.nullableBooleanAdapter.fromJson(jsonReader);
                        n2 = n;
                        break Label_0979;
                    }
                    case 3: {
                        o9 = this.stringAdapter.fromJson(jsonReader);
                        if (o9 != null) {
                            n2 = (n & 0xFFFFFFF7);
                            break Label_0979;
                        }
                        throw a.n("description", "description", jsonReader);
                    }
                    case 2: {
                        o14 = this.nullableBooleanAdapter.fromJson(jsonReader);
                        n2 = n;
                        break Label_0979;
                    }
                    case 1: {
                        o16 = this.nullableStringAdapter.fromJson(jsonReader);
                        n2 = n;
                        break Label_0979;
                    }
                    case 0: {
                        o6 = this.stringAdapter.fromJson(jsonReader);
                        if (o6 != null) {
                            n2 = (n & 0xFFFFFFFE);
                            break Label_0979;
                        }
                        throw a.n("kindWithId", "name", jsonReader);
                    }
                    case -1: {
                        jsonReader.H();
                        jsonReader.F1();
                        n2 = n;
                        break Label_0979;
                    }
                }
                n2 = (n & n3);
            }
            n = n2;
        }
        jsonReader.r();
        if (n == -33419178) {
            e.d(o6, "null cannot be cast to non-null type kotlin.String");
            e.d(o9, "null cannot be cast to non-null type kotlin.String");
            e.d(o5, "null cannot be cast to non-null type kotlin.String");
            e.d(o3, "null cannot be cast to non-null type kotlin.String");
            final boolean booleanValue = false;
            e.d(o, "null cannot be cast to non-null type kotlin.String");
            e.d(o2, "null cannot be cast to non-null type kotlin.String");
            final boolean booleanValue2 = b3;
            e.d(o10, "null cannot be cast to non-null type kotlin.String");
            final boolean booleanValue3 = b;
            e.d(o8, "null cannot be cast to non-null type kotlin.String");
            e.d(o7, "null cannot be cast to non-null type kotlin.String");
            e.d(o4, "null cannot be cast to non-null type kotlin.String");
            return new UserSubreddit((String)o6, (String)o16, (Boolean)o14, (String)o9, (Boolean)o13, (String)o5, (String)o11, (String)o3, (Boolean)o12, booleanValue, (String)o, (String)o2, (Integer)o15, booleanValue2, (String)o10, booleanValue3, (String)o8, (Boolean)o17, (String)o7, (String)o4, (Boolean)o18, b2, (MediaSize)o19, (MediaSize)o20, (List<? extends SubredditPostType>)o21);
        }
        Constructor<UserSubreddit> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            final Class<Boolean> type = Boolean.TYPE;
            constructorRef = UserSubreddit.class.getDeclaredConstructor(String.class, String.class, Boolean.class, String.class, Boolean.class, String.class, String.class, String.class, Boolean.class, type, String.class, String.class, Integer.class, type, String.class, type, String.class, Boolean.class, String.class, String.class, Boolean.class, type, MediaSize.class, MediaSize.class, List.class, Integer.TYPE, a.c);
            this.constructorRef = constructorRef;
            final j a = j.a;
            e.e((Object)constructorRef, "UserSubreddit::class.jav\u2026his.constructorRef = it }");
        }
        final UserSubreddit instance = constructorRef.newInstance(o6, o16, o14, o9, o13, o5, o11, o3, o12, false, o, o2, o15, b3, o10, b, o8, o17, o7, o4, o18, b2, o19, o20, o21, n, null);
        e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final UserSubreddit userSubreddit) {
        e.f((Object)x, "writer");
        if (userSubreddit != null) {
            x.h();
            x.u("name");
            this.stringAdapter.toJson(x, (Object)userSubreddit.getKindWithId());
            x.u("banner_img");
            this.nullableStringAdapter.toJson(x, (Object)userSubreddit.getBannerImg());
            x.u("user_is_banned");
            this.nullableBooleanAdapter.toJson(x, (Object)userSubreddit.getUserIsBanned());
            x.u("description");
            this.stringAdapter.toJson(x, (Object)userSubreddit.getDescription());
            x.u("user_is_muted");
            this.nullableBooleanAdapter.toJson(x, (Object)userSubreddit.getUserIsMuted());
            x.u("display_name");
            this.stringAdapter.toJson(x, (Object)userSubreddit.getDisplayName());
            x.u("header_img");
            this.nullableStringAdapter.toJson(x, (Object)userSubreddit.getHeaderImg());
            x.u("title");
            this.stringAdapter.toJson(x, (Object)userSubreddit.getTitle());
            x.u("user_is_moderator");
            this.nullableBooleanAdapter.toJson(x, (Object)userSubreddit.getUserIsModerator());
            x.u("over_18");
            this.booleanAdapter.toJson(x, (Object)userSubreddit.getOver18());
            x.u("icon_img");
            this.stringAdapter.toJson(x, (Object)userSubreddit.getIconImg());
            x.u("display_name_prefixed");
            this.stringAdapter.toJson(x, (Object)userSubreddit.getDisplayNamePrefixed());
            x.u("subscribers");
            this.nullableIntAdapter.toJson(x, (Object)userSubreddit.getSubscribers());
            x.u("is_default_icon");
            this.booleanAdapter.toJson(x, (Object)userSubreddit.isDefaultIcon());
            x.u("key_color");
            this.stringAdapter.toJson(x, (Object)userSubreddit.getKeyColor());
            x.u("is_default_banner");
            this.booleanAdapter.toJson(x, (Object)userSubreddit.isDefaultBanner());
            x.u("url");
            this.stringAdapter.toJson(x, (Object)userSubreddit.getUrl());
            x.u("user_is_contributor");
            this.nullableBooleanAdapter.toJson(x, (Object)userSubreddit.getUserIsContributor());
            x.u("public_description");
            this.stringAdapter.toJson(x, (Object)userSubreddit.getPublicDescription());
            x.u("subreddit_type");
            this.stringAdapter.toJson(x, (Object)userSubreddit.getSubredditType());
            x.u("user_is_subscriber");
            this.nullableBooleanAdapter.toJson(x, (Object)userSubreddit.getUserIsSubscriber());
            x.u("default_set");
            this.booleanAdapter.toJson(x, (Object)userSubreddit.getShowInDefaultSubreddits());
            x.u("icon_size");
            this.nullableMediaSizeAdapter.toJson(x, (Object)userSubreddit.getIconSize());
            x.u("banner_size");
            this.nullableMediaSizeAdapter.toJson(x, (Object)userSubreddit.getBannerSize());
            x.u("allowedPostTypes");
            this.nullableListOfSubredditPostTypeAdapter.toJson(x, (Object)userSubreddit.getAllowedPostTypes());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(UserSubreddit)";
    }
}
