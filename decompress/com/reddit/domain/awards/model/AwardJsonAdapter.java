// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.awards.model;

import com.squareup.moshi.x;
import pg2.j;
import qd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.image.model.ImageResolution;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\bR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\"" }, d2 = { "Lcom/reddit/domain/awards/model/AwardJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/awards/model/Award;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/awards/model/AwardType;", "awardTypeAdapter", "Lcom/reddit/domain/awards/model/AwardSubType;", "nullableAwardSubTypeAdapter", "", "Lcom/reddit/domain/image/model/ImageResolution;", "listOfImageResolutionAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "", "nullableLongAdapter", "booleanAdapter", "Lcom/reddit/domain/awards/model/GroupAwardTier;", "nullableListOfGroupAwardTierAdapter", "Lcom/reddit/domain/awards/model/CurrentUserAwarding;", "nullableListOfCurrentUserAwardingAdapter", "nullableListOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class AwardJsonAdapter extends JsonAdapter<Award>
{
    private final JsonAdapter<AwardType> awardTypeAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Award> constructorRef;
    private final JsonAdapter<List<ImageResolution>> listOfImageResolutionAdapter;
    private final JsonAdapter<AwardSubType> nullableAwardSubTypeAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<CurrentUserAwarding>> nullableListOfCurrentUserAwardingAdapter;
    private final JsonAdapter<List<GroupAwardTier>> nullableListOfGroupAwardTierAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public AwardJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "award_type", "award_sub_type", "name", "icon_url", "resized_icons", "is_enabled", "description", "coin_price", "days_of_premium", "count", "subreddit_id", "is_new", "icon_format", "sticky_duration_seconds", "tiers_by_required_awardings", "awarding_by_current_user", "startsAtUtc", "endsAtUtc", "tags" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.awardTypeAdapter = (JsonAdapter<AwardType>)y.c((Type)AwardType.class, (Set)instance, "awardType");
        this.nullableAwardSubTypeAdapter = (JsonAdapter<AwardSubType>)y.c((Type)AwardSubType.class, (Set)instance, "awardSubType");
        this.listOfImageResolutionAdapter = (JsonAdapter<List<ImageResolution>>)y.c((Type)a0.d((Class)List.class, new Type[] { ImageResolution.class }), (Set)instance, "resizedIcons");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "isEnabled");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "description");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "coinPrice");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isNew");
        this.nullableListOfGroupAwardTierAdapter = (JsonAdapter<List<GroupAwardTier>>)y.c((Type)a0.d((Class)List.class, new Type[] { GroupAwardTier.class }), (Set)instance, "groupAwardTiers");
        this.nullableListOfCurrentUserAwardingAdapter = (JsonAdapter<List<CurrentUserAwarding>>)y.c((Type)a0.d((Class)List.class, new Type[] { CurrentUserAwarding.class }), (Set)instance, "awardingsByCurrentUser");
        this.nullableListOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "awardTags");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        final Class<Long> clazz = Long.class;
        final Class<String> clazz2 = String.class;
        f.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        int n = -1;
        String s = null;
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
        while (jsonReader.hasNext()) {
            int n2 = 0;
            Label_0747: {
                int n3 = 0;
                switch (jsonReader.F(this.options)) {
                    default: {
                        n2 = n;
                        break Label_0747;
                    }
                    case 19: {
                        o18 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                        n3 = -524289;
                        break;
                    }
                    case 18: {
                        o17 = this.nullableLongAdapter.fromJson(jsonReader);
                        n3 = -262145;
                        break;
                    }
                    case 17: {
                        o16 = this.nullableLongAdapter.fromJson(jsonReader);
                        n3 = -131073;
                        break;
                    }
                    case 16: {
                        o15 = this.nullableListOfCurrentUserAwardingAdapter.fromJson(jsonReader);
                        n3 = -65537;
                        break;
                    }
                    case 15: {
                        o14 = this.nullableListOfGroupAwardTierAdapter.fromJson(jsonReader);
                        n3 = -32769;
                        break;
                    }
                    case 14: {
                        o13 = this.nullableLongAdapter.fromJson(jsonReader);
                        n2 = (n & 0xFFFFBFFF);
                        break Label_0747;
                    }
                    case 13: {
                        o12 = this.nullableStringAdapter.fromJson(jsonReader);
                        n2 = (n & 0xFFFFDFFF);
                        break Label_0747;
                    }
                    case 12: {
                        false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (false != null) {
                            n2 = (n & 0xFFFFEFFF);
                            break Label_0747;
                        }
                        throw a.n("isNew", "is_new", jsonReader);
                    }
                    case 11: {
                        o11 = this.nullableStringAdapter.fromJson(jsonReader);
                        n2 = (n & 0xFFFFF7FF);
                        break Label_0747;
                    }
                    case 10: {
                        o10 = this.nullableLongAdapter.fromJson(jsonReader);
                        n2 = (n & 0xFFFFFBFF);
                        break Label_0747;
                    }
                    case 9: {
                        o9 = this.nullableLongAdapter.fromJson(jsonReader);
                        n2 = (n & 0xFFFFFDFF);
                        break Label_0747;
                    }
                    case 8: {
                        o8 = this.nullableLongAdapter.fromJson(jsonReader);
                        n2 = (n & 0xFFFFFEFF);
                        break Label_0747;
                    }
                    case 7: {
                        o7 = this.nullableStringAdapter.fromJson(jsonReader);
                        n2 = (n & 0xFFFFFF7F);
                        break Label_0747;
                    }
                    case 6: {
                        o6 = this.nullableBooleanAdapter.fromJson(jsonReader);
                        n &= 0xFFFFFFBF;
                        continue;
                    }
                    case 5: {
                        o5 = this.listOfImageResolutionAdapter.fromJson(jsonReader);
                        if (o5 != null) {
                            n2 = (n & 0xFFFFFFDF);
                            break Label_0747;
                        }
                        throw a.n("resizedIcons", "resized_icons", jsonReader);
                    }
                    case 4: {
                        o4 = this.stringAdapter.fromJson(jsonReader);
                        if (o4 != null) {
                            n2 = n;
                            break Label_0747;
                        }
                        throw a.n("iconUrl", "icon_url", jsonReader);
                    }
                    case 3: {
                        o3 = this.stringAdapter.fromJson(jsonReader);
                        if (o3 != null) {
                            n2 = n;
                            break Label_0747;
                        }
                        throw a.n("name", "name", jsonReader);
                    }
                    case 2: {
                        o2 = this.nullableAwardSubTypeAdapter.fromJson(jsonReader);
                        n &= 0xFFFFFFFB;
                        continue;
                    }
                    case 1: {
                        o = this.awardTypeAdapter.fromJson(jsonReader);
                        if (o != null) {
                            n2 = n;
                            break Label_0747;
                        }
                        throw a.n("awardType", "award_type", jsonReader);
                    }
                    case 0: {
                        s = (String)this.stringAdapter.fromJson(jsonReader);
                        if (s != null) {
                            n2 = n;
                            break Label_0747;
                        }
                        throw a.n("id", "id", jsonReader);
                    }
                    case -1: {
                        jsonReader.J();
                        jsonReader.z1();
                        n2 = n;
                        break Label_0747;
                    }
                }
                n2 = (n & n3);
            }
            n = n2;
        }
        jsonReader.r();
        Award award;
        if (n == -1048549) {
            if (s == null) {
                throw a.h("id", "id", jsonReader);
            }
            if (o == null) {
                throw a.h("awardType", "award_type", jsonReader);
            }
            if (o3 == null) {
                throw a.h("name", "name", jsonReader);
            }
            if (o4 == null) {
                throw a.h("iconUrl", "icon_url", jsonReader);
            }
            f.d(o5, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.image.model.ImageResolution>");
            award = new Award(s, (AwardType)o, (AwardSubType)o2, (String)o3, (String)o4, (List<ImageResolution>)o5, (Boolean)o6, (String)o7, (Long)o8, (Long)o9, (Long)o10, (String)o11, false, (String)o12, (Long)o13, (List<GroupAwardTier>)o14, (List<CurrentUserAwarding>)o15, (Long)o16, (Long)o17, (List<String>)o18);
        }
        else {
            final Constructor<Award> constructorRef = this.constructorRef;
            Constructor<Award> declaredConstructor;
            if (constructorRef == null) {
                declaredConstructor = Award.class.getDeclaredConstructor(clazz2, AwardType.class, AwardSubType.class, clazz2, clazz2, List.class, Boolean.class, clazz2, clazz, clazz, clazz, clazz2, Boolean.TYPE, clazz2, clazz, List.class, List.class, clazz, clazz, List.class, Integer.TYPE, a.c);
                this.constructorRef = declaredConstructor;
                final j a = j.a;
                f.e((Object)declaredConstructor, "Award::class.java.getDec\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("id", "id", jsonReader);
            }
            if (o == null) {
                throw a.h("awardType", "award_type", jsonReader);
            }
            if (o3 == null) {
                throw a.h("name", "name", jsonReader);
            }
            if (o4 == null) {
                throw a.h("iconUrl", "icon_url", jsonReader);
            }
            final Award instance = declaredConstructor.newInstance(s, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, false, o12, o13, o14, o15, o16, o17, o18, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            award = instance;
        }
        return award;
    }
    
    public final void toJson(final x x, final Object o) {
        final Award award = (Award)o;
        f.f((Object)x, "writer");
        if (award != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)award.getId());
            x.w("award_type");
            this.awardTypeAdapter.toJson(x, (Object)award.getAwardType());
            x.w("award_sub_type");
            this.nullableAwardSubTypeAdapter.toJson(x, (Object)award.getAwardSubType());
            x.w("name");
            this.stringAdapter.toJson(x, (Object)award.getName());
            x.w("icon_url");
            this.stringAdapter.toJson(x, (Object)award.getIconUrl());
            x.w("resized_icons");
            this.listOfImageResolutionAdapter.toJson(x, (Object)award.getResizedIcons());
            x.w("is_enabled");
            this.nullableBooleanAdapter.toJson(x, (Object)award.isEnabled());
            x.w("description");
            this.nullableStringAdapter.toJson(x, (Object)award.getDescription());
            x.w("coin_price");
            this.nullableLongAdapter.toJson(x, (Object)award.getCoinPrice());
            x.w("days_of_premium");
            this.nullableLongAdapter.toJson(x, (Object)award.getDaysOfPremium());
            x.w("count");
            this.nullableLongAdapter.toJson(x, (Object)award.getCount());
            x.w("subreddit_id");
            this.nullableStringAdapter.toJson(x, (Object)award.getSubredditId());
            x.w("is_new");
            this.booleanAdapter.toJson(x, (Object)award.isNew());
            x.w("icon_format");
            this.nullableStringAdapter.toJson(x, (Object)award.getIconFormatRaw());
            x.w("sticky_duration_seconds");
            this.nullableLongAdapter.toJson(x, (Object)award.getStickyDurationSeconds());
            x.w("tiers_by_required_awardings");
            this.nullableListOfGroupAwardTierAdapter.toJson(x, (Object)award.getGroupAwardTiers());
            x.w("awarding_by_current_user");
            this.nullableListOfCurrentUserAwardingAdapter.toJson(x, (Object)award.getAwardingsByCurrentUser());
            x.w("startsAtUtc");
            this.nullableLongAdapter.toJson(x, (Object)award.getStartsAtUtc());
            x.w("endsAtUtc");
            this.nullableLongAdapter.toJson(x, (Object)award.getEndsAtUtc());
            x.w("tags");
            this.nullableListOfStringAdapter.toJson(x, (Object)award.getAwardTags());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(Award)";
    }
}
