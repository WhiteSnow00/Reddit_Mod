// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import a4.u1;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/AccountPreferencesPatchJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/AccountPreferencesPatch;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableLongAdapter", "Lcom/reddit/domain/model/AccountPreferences$AcceptPrivateMessagesPolicy;", "nullableAcceptPrivateMessagesPolicyAtSafeEnumAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccountPreferencesPatchJsonAdapter extends JsonAdapter<AccountPreferencesPatch>
{
    private volatile Constructor<AccountPreferencesPatch> constructorRef;
    private final JsonAdapter<AccountPreferences$AcceptPrivateMessagesPolicy> nullableAcceptPrivateMessagesPolicyAtSafeEnumAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public AccountPreferencesPatchJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "over_18", "search_include_over_18", "geopopular", "default_comment_sort", "media", "top_karma_subreddits", "hide_from_robots", "activity_relevant_ads", "email_digests", "email_unsubscribe_all", "third_party_site_data_personalized_ads", "third_party_site_data_personalized_content", "third_party_data_personalized_ads", "third_party_personalized_ads", "show_location_based_recommendations", "survey_last_seen_time", "accept_pms", "feed_recommendations_enabled", "live_bar_recommendations_enabled", "show_presence", "country_code", "enable_followers" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "over18");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "geopopular");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "surveyLastSeenTime");
        this.nullableAcceptPrivateMessagesPolicyAtSafeEnumAdapter = (JsonAdapter<AccountPreferences$AcceptPrivateMessagesPolicy>)y.c((Type)AccountPreferences$AcceptPrivateMessagesPolicy.class, u1.Z0((Object)new AccountPreferencesPatchJsonAdapter$annotationImpl$com_reddit_data_common_SafeEnum.AccountPreferencesPatchJsonAdapter$annotationImpl$com_reddit_data_common_SafeEnum$0("UNKNOWN__")), "acceptPms");
    }
    
    public AccountPreferencesPatch fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Boolean b = null;
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
        while (jsonReader.hasNext()) {
            int n2 = 0;
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 21: {
                    o21 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n2 = -2097153;
                    break;
                }
                case 20: {
                    o20 = this.nullableStringAdapter.fromJson(jsonReader);
                    n2 = -1048577;
                    break;
                }
                case 19: {
                    o19 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n2 = -524289;
                    break;
                }
                case 18: {
                    o18 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n2 = -262145;
                    break;
                }
                case 17: {
                    o17 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n2 = -131073;
                    break;
                }
                case 16: {
                    o16 = this.nullableAcceptPrivateMessagesPolicyAtSafeEnumAdapter.fromJson(jsonReader);
                    n2 = -65537;
                    break;
                }
                case 15: {
                    o15 = this.nullableLongAdapter.fromJson(jsonReader);
                    n2 = -32769;
                    break;
                }
                case 14: {
                    o14 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFBFFF;
                    continue;
                }
                case 13: {
                    o13 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFDFFF;
                    continue;
                }
                case 12: {
                    o12 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFEFFF;
                    continue;
                }
                case 11: {
                    o11 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFF7FF;
                    continue;
                }
                case 10: {
                    o10 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFBFF;
                    continue;
                }
                case 9: {
                    o9 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFDFF;
                    continue;
                }
                case 8: {
                    o8 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFEFF;
                    continue;
                }
                case 7: {
                    o7 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFF7F;
                    continue;
                }
                case 6: {
                    o6 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFBF;
                    continue;
                }
                case 5: {
                    o5 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFF7;
                    continue;
                }
                case 2: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFB;
                    continue;
                }
                case 1: {
                    o = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFD;
                    continue;
                }
                case 0: {
                    b = (Boolean)this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFE;
                    continue;
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
            n &= n2;
        }
        jsonReader.r();
        if (n == -4194304) {
            return new AccountPreferencesPatch(b, (Boolean)o, (String)o2, (String)o3, (String)o4, (Boolean)o5, (Boolean)o6, (Boolean)o7, (Boolean)o8, (Boolean)o9, (Boolean)o10, (Boolean)o11, (Boolean)o12, (Boolean)o13, (Boolean)o14, (Long)o15, (AccountPreferences$AcceptPrivateMessagesPolicy)o16, (Boolean)o17, (Boolean)o18, (Boolean)o19, (String)o20, (Boolean)o21);
        }
        Constructor<AccountPreferencesPatch> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            constructorRef = AccountPreferencesPatch.class.getDeclaredConstructor(Boolean.class, Boolean.class, String.class, String.class, String.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Long.class, AccountPreferences$AcceptPrivateMessagesPolicy.class, Boolean.class, Boolean.class, Boolean.class, String.class, Boolean.class, Integer.TYPE, a.c);
            f.e((Object)(this.constructorRef = constructorRef), "AccountPreferencesPatch:\u2026his.constructorRef = it }");
        }
        final AccountPreferencesPatch instance = constructorRef.newInstance(b, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final AccountPreferencesPatch accountPreferencesPatch) {
        f.f((Object)x, "writer");
        if (accountPreferencesPatch != null) {
            x.h();
            x.w("over_18");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getOver18());
            x.w("search_include_over_18");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getSearchIncludeOver18());
            x.w("geopopular");
            this.nullableStringAdapter.toJson(x, (Object)accountPreferencesPatch.getGeopopular());
            x.w("default_comment_sort");
            this.nullableStringAdapter.toJson(x, (Object)accountPreferencesPatch.getDefaultCommentSort());
            x.w("media");
            this.nullableStringAdapter.toJson(x, (Object)accountPreferencesPatch.getMedia());
            x.w("top_karma_subreddits");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getShowMyActiveCommunities());
            x.w("hide_from_robots");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getHideFromRobots());
            x.w("activity_relevant_ads");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getActivityRelevantAds());
            x.w("email_digests");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getEmailDigestsEnabled());
            x.w("email_unsubscribe_all");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getEmailUnsubscribeAll());
            x.w("third_party_site_data_personalized_ads");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getThirdPartySiteDataPersonalizedAds());
            x.w("third_party_site_data_personalized_content");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getThirdPartySiteDataPersonalizedContent());
            x.w("third_party_data_personalized_ads");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getThirdPartyDataPersonalizedAds());
            x.w("third_party_personalized_ads");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getThirdPartyPersonalizedAds());
            x.w("show_location_based_recommendations");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getLocationBasedRecommendations());
            x.w("survey_last_seen_time");
            this.nullableLongAdapter.toJson(x, (Object)accountPreferencesPatch.getSurveyLastSeenTime());
            x.w("accept_pms");
            this.nullableAcceptPrivateMessagesPolicyAtSafeEnumAdapter.toJson(x, (Object)accountPreferencesPatch.getAcceptPms());
            x.w("feed_recommendations_enabled");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getFeedRecommendationsEnabled());
            x.w("live_bar_recommendations_enabled");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getLiveRecommendationsEnabled());
            x.w("show_presence");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getShowPresence());
            x.w("country_code");
            this.nullableStringAdapter.toJson(x, (Object)accountPreferencesPatch.getCountryCode());
            x.w("enable_followers");
            this.nullableBooleanAdapter.toJson(x, (Object)accountPreferencesPatch.getEnableFollowers());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(AccountPreferencesPatch)";
    }
}
