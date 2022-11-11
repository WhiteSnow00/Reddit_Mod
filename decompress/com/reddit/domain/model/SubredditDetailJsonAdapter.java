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

@Metadata(bv = {}, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 " }, d2 = { "Lcom/reddit/domain/model/SubredditDetailJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/SubredditDetail;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "stringAdapter", "", "nullableLongAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditDetailJsonAdapter extends JsonAdapter<SubredditDetail>
{
    private volatile Constructor<SubredditDetail> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public SubredditDetailJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "name", "key_color", "icon_img", "over_18", "user_is_banned", "user_is_moderator", "user_is_subscriber", "display_name", "display_name_prefixed", "primary_color", "banner_img", "community_icon", "public_description", "subscribers", "subreddit_type", "coins", "title", "isTitleSafe" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "kindWithId");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "over18");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "displayName");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "subscribers");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "coins");
    }
    
    public SubredditDetail fromJson(final JsonReader jsonReader) {
        final Class<Boolean> clazz = Boolean.class;
        final Class<String> clazz2 = String.class;
        e.f((Object)jsonReader, "reader");
        Integer value = 0;
        jsonReader.h();
        int n = -1;
        Object o = null;
        String s = null;
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
        while (jsonReader.hasNext()) {
            int n2 = 0;
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 17: {
                    o16 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n2 = -131073;
                    break;
                }
                case 16: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        n2 = -65537;
                        break;
                    }
                    throw a.n("subredditTitle", "title", jsonReader);
                }
                case 15: {
                    value = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (value != null) {
                        n2 = -32769;
                        break;
                    }
                    throw a.n("coins", "coins", jsonReader);
                }
                case 14: {
                    o15 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFBFFF;
                    continue;
                }
                case 13: {
                    o14 = this.nullableLongAdapter.fromJson(jsonReader);
                    n &= 0xFFFFDFFF;
                    continue;
                }
                case 12: {
                    o13 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFEFFF;
                    continue;
                }
                case 11: {
                    o12 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFF7FF;
                    continue;
                }
                case 10: {
                    o11 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFBFF;
                    continue;
                }
                case 9: {
                    o10 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFDFF;
                    continue;
                }
                case 8: {
                    o9 = this.stringAdapter.fromJson(jsonReader);
                    if (o9 != null) {
                        continue;
                    }
                    throw a.n("displayNamePrefixed", "display_name_prefixed", jsonReader);
                }
                case 7: {
                    o8 = this.stringAdapter.fromJson(jsonReader);
                    if (o8 != null) {
                        continue;
                    }
                    throw a.n("displayName", "display_name", jsonReader);
                }
                case 6: {
                    o7 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFBF;
                    continue;
                }
                case 5: {
                    o6 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o5 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    o4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFF7;
                    continue;
                }
                case 2: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFB;
                    continue;
                }
                case 1: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFD;
                    continue;
                }
                case 0: {
                    s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFE;
                    continue;
                }
                case -1: {
                    jsonReader.H();
                    jsonReader.F1();
                    continue;
                }
            }
            n &= n2;
        }
        jsonReader.r();
        if (n == -261760) {
            if (o8 == null) {
                throw a.h("displayName", "display_name", jsonReader);
            }
            if (o9 != null) {
                final int intValue = value;
                e.d(o, "null cannot be cast to non-null type kotlin.String");
                return new SubredditDetail(s, (String)o2, (String)o3, (Boolean)o4, (Boolean)o5, (Boolean)o6, (Boolean)o7, (String)o8, (String)o9, (String)o10, (String)o11, (String)o12, (String)o13, (Long)o14, (String)o15, intValue, (String)o, (Boolean)o16);
            }
            throw a.h("displayNamePrefixed", "display_name_prefixed", jsonReader);
        }
        else {
            final Constructor<SubredditDetail> constructorRef = this.constructorRef;
            Constructor<SubredditDetail> declaredConstructor;
            if (constructorRef == null) {
                final Class<Integer> type = Integer.TYPE;
                declaredConstructor = SubredditDetail.class.getDeclaredConstructor(clazz2, clazz2, clazz2, clazz, clazz, clazz, clazz, clazz2, clazz2, clazz2, clazz2, clazz2, clazz2, Long.class, clazz2, type, clazz2, clazz, type, a.c);
                e.e((Object)(this.constructorRef = declaredConstructor), "SubredditDetail::class.j\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (o8 == null) {
                throw a.h("displayName", "display_name", jsonReader);
            }
            if (o9 != null) {
                final SubredditDetail instance = declaredConstructor.newInstance(s, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, value, o, o16, n, null);
                e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("displayNamePrefixed", "display_name_prefixed", jsonReader);
        }
    }
    
    public void toJson(final x x, final SubredditDetail subredditDetail) {
        e.f((Object)x, "writer");
        if (subredditDetail != null) {
            x.h();
            x.u("name");
            this.nullableStringAdapter.toJson(x, (Object)subredditDetail.getKindWithId());
            x.u("key_color");
            this.nullableStringAdapter.toJson(x, (Object)subredditDetail.getKeyColor());
            x.u("icon_img");
            this.nullableStringAdapter.toJson(x, (Object)subredditDetail.getIconImage());
            x.u("over_18");
            this.nullableBooleanAdapter.toJson(x, (Object)subredditDetail.getOver18());
            x.u("user_is_banned");
            this.nullableBooleanAdapter.toJson(x, (Object)subredditDetail.getUserIsBanned());
            x.u("user_is_moderator");
            this.nullableBooleanAdapter.toJson(x, (Object)subredditDetail.getUserIsModerator());
            x.u("user_is_subscriber");
            this.nullableBooleanAdapter.toJson(x, (Object)subredditDetail.getUserIsSubscriber());
            x.u("display_name");
            this.stringAdapter.toJson(x, (Object)subredditDetail.getDisplayName());
            x.u("display_name_prefixed");
            this.stringAdapter.toJson(x, (Object)subredditDetail.getDisplayNamePrefixed());
            x.u("primary_color");
            this.nullableStringAdapter.toJson(x, (Object)subredditDetail.getPrimaryKeyColor());
            x.u("banner_img");
            this.nullableStringAdapter.toJson(x, (Object)subredditDetail.getBannerBackgroundImageUrl());
            x.u("community_icon");
            this.nullableStringAdapter.toJson(x, (Object)subredditDetail.getCommunityIconUrl());
            x.u("public_description");
            this.nullableStringAdapter.toJson(x, (Object)subredditDetail.getPublicDescription());
            x.u("subscribers");
            this.nullableLongAdapter.toJson(x, (Object)subredditDetail.getSubscribers());
            x.u("subreddit_type");
            this.nullableStringAdapter.toJson(x, (Object)subredditDetail.getSubredditType());
            x.u("coins");
            this.intAdapter.toJson(x, (Object)subredditDetail.getCoins());
            x.u("title");
            this.stringAdapter.toJson(x, (Object)subredditDetail.getSubredditTitle());
            x.u("isTitleSafe");
            this.nullableBooleanAdapter.toJson(x, (Object)subredditDetail.isTitleSafe());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SubredditDetail)";
    }
}
