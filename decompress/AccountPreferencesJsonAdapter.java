// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import pg2.j;
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

@Metadata(bv = {}, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\"" }, d2 = { "Lcom/reddit/domain/model/AccountPreferencesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/AccountPreferences;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "stringAdapter", "", "nullableIntAdapter", "", "nullableLongAdapter", "Lcom/reddit/domain/model/AccountPreferences$AcceptPrivateMessagesPolicy;", "acceptPrivateMessagesPolicyAtSafeEnumAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccountPreferencesJsonAdapter extends JsonAdapter<AccountPreferences>
{
    private final JsonAdapter<AccountPreferences$AcceptPrivateMessagesPolicy> acceptPrivateMessagesPolicyAtSafeEnumAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AccountPreferences> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public AccountPreferencesJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "over_18", "search_include_over_18", "geopopular", "ignore_suggested_sort", "default_comment_sort", "media", "allow_clicktracking", "top_karma_subreddits", "min_comment_score", "hide_from_robots", "activity_relevant_ads", "email_digests", "email_unsubscribe_all", "third_party_site_data_personalized_ads", "third_party_site_data_personalized_content", "third_party_personalized_ads", "third_party_data_personalized_ads", "show_location_based_recommendations", "survey_last_seen_time", "accept_pms", "feed_recommendations_enabled", "live_bar_recommendations_enabled", "show_presence", "country_code", "enable_followers" });
        final Class<Boolean> type = Boolean.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)type, (Set)instance, "over18");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "geopopular");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "defaultCommentSort");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "minCommentScore");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "surveyLastSeenTime");
        this.acceptPrivateMessagesPolicyAtSafeEnumAdapter = (JsonAdapter<AccountPreferences$AcceptPrivateMessagesPolicy>)y.c((Type)AccountPreferences$AcceptPrivateMessagesPolicy.class, u1.Z0((Object)new AccountPreferencesJsonAdapter$annotationImpl$com_reddit_data_common_SafeEnum.AccountPreferencesJsonAdapter$annotationImpl$com_reddit_data_common_SafeEnum$0("everyone")), "acceptPms");
    }
    
    public AccountPreferences fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        Boolean b2;
        Boolean b = b2 = false;
        Boolean b4;
        Boolean b3 = b4 = b2;
        Boolean b6;
        Boolean b5 = b6 = b4;
        Boolean b8;
        Boolean b7 = b8 = b6;
        Boolean b10;
        Boolean b9 = b10 = b8;
        Boolean b12;
        Boolean b11 = b12 = b10;
        Boolean b14;
        Boolean b13 = b14 = b12;
        Boolean b16;
        Boolean b15 = b16 = b14;
        int n = -1;
        Object o = null;
        Object o2 = null;
        String s = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Boolean b17 = b16;
        while (jsonReader.hasNext()) {
            int n2 = 0;
            Label_1119: {
                int n3 = 0;
                switch (jsonReader.F(this.options)) {
                    default: {
                        n2 = n;
                        break Label_1119;
                    }
                    case 24: {
                        b15 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b15 != null) {
                            n3 = -16777217;
                            break;
                        }
                        throw a.n("enableFollowers", "enable_followers", jsonReader);
                    }
                    case 23: {
                        o6 = this.stringAdapter.fromJson(jsonReader);
                        if (o6 != null) {
                            n3 = -8388609;
                            break;
                        }
                        throw a.n("countryCode", "country_code", jsonReader);
                    }
                    case 22: {
                        b14 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b14 != null) {
                            n3 = -4194305;
                            break;
                        }
                        throw a.n("showPresence", "show_presence", jsonReader);
                    }
                    case 21: {
                        b13 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b13 != null) {
                            n3 = -2097153;
                            break;
                        }
                        throw a.n("liveRecommendationsEnabled", "live_bar_recommendations_enabled", jsonReader);
                    }
                    case 20: {
                        b12 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b12 != null) {
                            n3 = -1048577;
                            break;
                        }
                        throw a.n("feedRecommendationsEnabled", "feed_recommendations_enabled", jsonReader);
                    }
                    case 19: {
                        o5 = this.acceptPrivateMessagesPolicyAtSafeEnumAdapter.fromJson(jsonReader);
                        if (o5 != null) {
                            n3 = -524289;
                            break;
                        }
                        throw a.n("acceptPms", "accept_pms", jsonReader);
                    }
                    case 18: {
                        o4 = this.nullableLongAdapter.fromJson(jsonReader);
                        n3 = -262145;
                        break;
                    }
                    case 17: {
                        b11 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b11 != null) {
                            n3 = -131073;
                            break;
                        }
                        throw a.n("locationBasedRecommendations", "show_location_based_recommendations", jsonReader);
                    }
                    case 16: {
                        b10 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b10 != null) {
                            n3 = -65537;
                            break;
                        }
                        throw a.n("thirdPartyDataPersonalizedAds", "third_party_data_personalized_ads", jsonReader);
                    }
                    case 15: {
                        b16 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b16 != null) {
                            n3 = -32769;
                            break;
                        }
                        throw a.n("thirdPartyPersonalizedAds", "third_party_personalized_ads", jsonReader);
                    }
                    case 14: {
                        b9 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b9 != null) {
                            n &= 0xFFFFBFFF;
                            continue;
                        }
                        throw a.n("thirdPartySiteDataPersonalizedContent", "third_party_site_data_personalized_content", jsonReader);
                    }
                    case 13: {
                        b8 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b8 != null) {
                            n2 = (n & 0xFFFFDFFF);
                            break Label_1119;
                        }
                        throw a.n("thirdPartySiteDataPersonalizedAds", "third_party_site_data_personalized_ads", jsonReader);
                    }
                    case 12: {
                        b7 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b7 != null) {
                            n2 = (n & 0xFFFFEFFF);
                            break Label_1119;
                        }
                        throw a.n("emailUnsubscribeAll", "email_unsubscribe_all", jsonReader);
                    }
                    case 11: {
                        b6 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b6 != null) {
                            n2 = (n & 0xFFFFF7FF);
                            break Label_1119;
                        }
                        throw a.n("emailDigestsEnabled", "email_digests", jsonReader);
                    }
                    case 10: {
                        b5 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b5 != null) {
                            n2 = (n & 0xFFFFFBFF);
                            break Label_1119;
                        }
                        throw a.n("activityRelevantAds", "activity_relevant_ads", jsonReader);
                    }
                    case 9: {
                        b4 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b4 != null) {
                            n2 = (n & 0xFFFFFDFF);
                            break Label_1119;
                        }
                        throw a.n("hideFromRobots", "hide_from_robots", jsonReader);
                    }
                    case 8: {
                        o3 = this.nullableIntAdapter.fromJson(jsonReader);
                        n2 = (n & 0xFFFFFEFF);
                        break Label_1119;
                    }
                    case 7: {
                        b3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b3 != null) {
                            n2 = (n & 0xFFFFFF7F);
                            break Label_1119;
                        }
                        throw a.n("showMyActiveCommunities", "top_karma_subreddits", jsonReader);
                    }
                    case 6: {
                        b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b2 != null) {
                            n2 = (n & 0xFFFFFFBF);
                            break Label_1119;
                        }
                        throw a.n("allowClickTracking", "allow_clicktracking", jsonReader);
                    }
                    case 5: {
                        o2 = this.stringAdapter.fromJson(jsonReader);
                        if (o2 != null) {
                            n2 = (n & 0xFFFFFFDF);
                            break Label_1119;
                        }
                        throw a.n("thumbnailPref", "media", jsonReader);
                    }
                    case 4: {
                        o = this.stringAdapter.fromJson(jsonReader);
                        if (o != null) {
                            n2 = (n & 0xFFFFFFEF);
                            break Label_1119;
                        }
                        throw a.n("defaultCommentSort", "default_comment_sort", jsonReader);
                    }
                    case 3: {
                        b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b != null) {
                            n2 = (n & 0xFFFFFFF7);
                            break Label_1119;
                        }
                        throw a.n("ignoreSuggestedSort", "ignore_suggested_sort", jsonReader);
                    }
                    case 2: {
                        s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                        n2 = (n & 0xFFFFFFFB);
                        break Label_1119;
                    }
                    case 1: {
                        b17 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b17 != null) {
                            n2 = (n & 0xFFFFFFFD);
                            break Label_1119;
                        }
                        throw a.n("searchIncludeOver18", "search_include_over_18", jsonReader);
                    }
                    case 0: {
                        false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (false != null) {
                            n2 = (n & 0xFFFFFFFE);
                            break Label_1119;
                        }
                        throw a.n("over18", "over_18", jsonReader);
                    }
                    case -1: {
                        jsonReader.J();
                        jsonReader.z1();
                        n2 = n;
                        break Label_1119;
                    }
                }
                n2 = (n & n3);
            }
            n = n2;
        }
        jsonReader.r();
        if (n == -33554432) {
            final boolean booleanValue = false;
            final boolean booleanValue2 = b17;
            final boolean booleanValue3 = b;
            f.d(o, "null cannot be cast to non-null type kotlin.String");
            f.d(o2, "null cannot be cast to non-null type kotlin.String");
            final boolean booleanValue4 = b2;
            final boolean booleanValue5 = b3;
            final boolean booleanValue6 = b4;
            final boolean booleanValue7 = b5;
            final boolean booleanValue8 = b6;
            final boolean booleanValue9 = b7;
            final boolean booleanValue10 = b8;
            final boolean booleanValue11 = b9;
            final boolean booleanValue12 = b16;
            final boolean booleanValue13 = b10;
            final boolean booleanValue14 = b11;
            f.d(o5, "null cannot be cast to non-null type com.reddit.domain.model.AccountPreferences.AcceptPrivateMessagesPolicy");
            final boolean booleanValue15 = b12;
            final boolean booleanValue16 = b13;
            final boolean booleanValue17 = b14;
            f.d(o6, "null cannot be cast to non-null type kotlin.String");
            return new AccountPreferences(booleanValue, booleanValue2, s, booleanValue3, (String)o, (String)o2, booleanValue4, booleanValue5, (Integer)o3, booleanValue6, booleanValue7, booleanValue8, booleanValue9, booleanValue10, booleanValue11, booleanValue12, booleanValue13, booleanValue14, (Long)o4, (AccountPreferences$AcceptPrivateMessagesPolicy)o5, booleanValue15, booleanValue16, booleanValue17, (String)o6, (boolean)b15);
        }
        Constructor<AccountPreferences> constructorRef = this.constructorRef;
        if (constructorRef == null) {
            final Class<Boolean> type = Boolean.TYPE;
            constructorRef = AccountPreferences.class.getDeclaredConstructor(type, type, String.class, type, String.class, String.class, type, type, Integer.class, type, type, type, type, type, type, type, type, type, Long.class, AccountPreferences$AcceptPrivateMessagesPolicy.class, type, type, type, String.class, type, Integer.TYPE, a.c);
            this.constructorRef = constructorRef;
            final j a = j.a;
            f.e((Object)constructorRef, "AccountPreferences::clas\u2026his.constructorRef = it }");
        }
        final AccountPreferences instance = constructorRef.newInstance(false, b17, s, b, o, o2, b2, b3, o3, b4, b5, b6, b7, b8, b9, b16, b10, b11, o4, o5, b12, b13, b14, o6, b15, n, null);
        f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public void toJson(final x x, final AccountPreferences accountPreferences) {
        f.f((Object)x, "writer");
        if (accountPreferences != null) {
            x.h();
            x.w("over_18");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getOver18());
            x.w("search_include_over_18");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getSearchIncludeOver18());
            x.w("geopopular");
            this.nullableStringAdapter.toJson(x, (Object)accountPreferences.getGeopopular());
            x.w("ignore_suggested_sort");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getIgnoreSuggestedSort());
            x.w("default_comment_sort");
            this.stringAdapter.toJson(x, (Object)accountPreferences.getDefaultCommentSort());
            x.w("media");
            this.stringAdapter.toJson(x, (Object)accountPreferences.getThumbnailPref());
            x.w("allow_clicktracking");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getAllowClickTracking());
            x.w("top_karma_subreddits");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getShowMyActiveCommunities());
            x.w("min_comment_score");
            this.nullableIntAdapter.toJson(x, (Object)accountPreferences.getMinCommentScore());
            x.w("hide_from_robots");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getHideFromRobots());
            x.w("activity_relevant_ads");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getActivityRelevantAds());
            x.w("email_digests");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getEmailDigestsEnabled());
            x.w("email_unsubscribe_all");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getEmailUnsubscribeAll());
            x.w("third_party_site_data_personalized_ads");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getThirdPartySiteDataPersonalizedAds());
            x.w("third_party_site_data_personalized_content");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getThirdPartySiteDataPersonalizedContent());
            x.w("third_party_personalized_ads");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getThirdPartyPersonalizedAds());
            x.w("third_party_data_personalized_ads");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getThirdPartyDataPersonalizedAds());
            x.w("show_location_based_recommendations");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getLocationBasedRecommendations());
            x.w("survey_last_seen_time");
            this.nullableLongAdapter.toJson(x, (Object)accountPreferences.getSurveyLastSeenTime());
            x.w("accept_pms");
            this.acceptPrivateMessagesPolicyAtSafeEnumAdapter.toJson(x, (Object)accountPreferences.getAcceptPms());
            x.w("feed_recommendations_enabled");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getFeedRecommendationsEnabled());
            x.w("live_bar_recommendations_enabled");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getLiveRecommendationsEnabled());
            x.w("show_presence");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getShowPresence());
            x.w("country_code");
            this.stringAdapter.toJson(x, (Object)accountPreferences.getCountryCode());
            x.w("enable_followers");
            this.booleanAdapter.toJson(x, (Object)accountPreferences.getEnableFollowers());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(AccountPreferences)";
    }
}
