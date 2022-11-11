// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

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
import java.util.Map;
import com.reddit.domain.model.sociallink.SocialLink;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0011R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0011R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0011R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0011R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006." }, d2 = { "Lcom/reddit/domain/model/AccountJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/Account;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "booleanAdapter", "", "intAdapter", "nullableLongAdapter", "nullableBooleanAdapter", "Lcom/reddit/domain/model/UserSubreddit;", "nullableUserSubredditAdapter", "nullableStringAdapter", "", "", "nullableMapOfStringAnyAdapter", "nullableIntAdapter", "", "nullableListOfStringAdapter", "Lcom/reddit/domain/model/sociallink/SocialLink;", "listOfSocialLinkAdapter", "Lcom/reddit/domain/model/CommunityHub;", "listOfCommunityHubAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccountJsonAdapter extends JsonAdapter<Account>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Account> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<CommunityHub>> listOfCommunityHubAdapter;
    private final JsonAdapter<List<SocialLink>> listOfSocialLinkAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<UserSubreddit> nullableUserSubredditAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public AccountJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "name", "created_utc", "is_employee", "is_friend", "hide_from_robots", "total_karma", "link_karma", "comment_karma", "awarder_karma", "awardee_karma", "is_gold", "has_gold_subscription", "gold_expiration", "premium_since", "is_mod", "has_verified_email", "subreddit", "icon_img", "accept_chats", "accept_pms", "accept_followers", "hasBeenVisited", "email", "features", "is_suspended", "suspension_expiration_utc", "force_password_reset", "inbox_count", "has_mail", "has_mod_mail", "coins", "pref_top_karma_subreddits", "hide_ads", "outbound_clicktracking", "can_create_subreddit", "can_edit_name", "linked_identities", "password_set", "snoovatar_img", "socialLinks", "communityHubs" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "createdUtc");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isEmployee");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "totalKarma");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "premiumExpirationUtcSeconds");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "hasVerifiedEmail");
        this.nullableUserSubredditAdapter = (JsonAdapter<UserSubreddit>)y.c((Type)UserSubreddit.class, (Set)instance, "subreddit");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "email");
        this.nullableMapOfStringAnyAdapter = (JsonAdapter<Map<String, Object>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, Object.class }), (Set)instance, "features");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "suspensionExpirationUtc");
        this.nullableListOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "linkedIdentities");
        this.listOfSocialLinkAdapter = (JsonAdapter<List<SocialLink>>)y.c((Type)a0.d((Class)List.class, new Type[] { SocialLink.class }), (Set)instance, "socialLinks");
        this.listOfCommunityHubAdapter = (JsonAdapter<List<CommunityHub>>)y.c((Type)a0.d((Class)List.class, new Type[] { CommunityHub.class }), (Set)instance, "communityHubs");
    }
    
    public Account fromJson(final JsonReader jsonReader) {
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
        Integer value = 0;
        Integer n2;
        Integer n = n2 = value;
        Integer n4;
        Integer n3 = n4 = n2;
        Integer n6;
        Integer n5 = n6 = n4;
        int n8;
        int n7 = n8 = -1;
        String s = null;
        List<SocialLink> list = null;
        Object o = null;
        String s2 = null;
        Long n9 = null;
        Long n10 = null;
        Long n11 = null;
        Boolean b15 = null;
        UserSubreddit userSubreddit = null;
        Boolean b16 = null;
        Boolean b17 = null;
        String s3 = null;
        Map<String, ?> map = null;
        Integer n12 = null;
        Boolean b18 = null;
        List<String> list2 = null;
        String s4 = null;
        List<CommunityHub> list3 = null;
        Boolean b20;
        Boolean b19 = b20 = b14;
        while (jsonReader.hasNext()) {
            int n13 = 0;
            Boolean b21 = null;
            Boolean b22 = null;
            Label_1913: {
                Boolean b24 = null;
                Boolean b25 = null;
                Boolean b26 = null;
                Label_1901: {
                    Boolean b28 = null;
                    Label_1889: {
                        Boolean b30 = null;
                        Label_1877: {
                            Label_1865: {
                                int n14 = 0;
                                switch (jsonReader.F(this.options)) {
                                    default: {
                                        n13 = n8;
                                        break Label_1865;
                                    }
                                    case 41: {
                                        list3 = (List)this.listOfCommunityHubAdapter.fromJson(jsonReader);
                                        if (list3 != null) {
                                            n7 &= 0xFFFFFDFF;
                                            n13 = n8;
                                            break Label_1865;
                                        }
                                        throw a.n("communityHubs", "communityHubs", jsonReader);
                                    }
                                    case 40: {
                                        list = (List)this.listOfSocialLinkAdapter.fromJson(jsonReader);
                                        if (list != null) {
                                            n7 &= 0xFFFFFEFF;
                                            b21 = b7;
                                            b22 = b4;
                                            n13 = n8;
                                            break Label_1913;
                                        }
                                        throw a.n("socialLinks", "socialLinks", jsonReader);
                                    }
                                    case 39: {
                                        s4 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                        n7 &= 0xFFFFFF7F;
                                        n13 = n8;
                                        break Label_1865;
                                    }
                                    case 38: {
                                        b14 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b14 != null) {
                                            n7 &= 0xFFFFFFBF;
                                            n13 = n8;
                                            break Label_1865;
                                        }
                                        throw a.n("hasPasswordSet", "password_set", jsonReader);
                                    }
                                    case 37: {
                                        list2 = (List)this.nullableListOfStringAdapter.fromJson(jsonReader);
                                        n7 &= 0xFFFFFFDF;
                                        n13 = n8;
                                        break Label_1865;
                                    }
                                    case 36: {
                                        b13 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b13 != null) {
                                            n7 &= 0xFFFFFFEF;
                                            n13 = n8;
                                            break Label_1865;
                                        }
                                        throw a.n("canEditName", "can_edit_name", jsonReader);
                                    }
                                    case 35: {
                                        b12 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b12 != null) {
                                            n7 &= 0xFFFFFFF7;
                                            n13 = n8;
                                            break Label_1865;
                                        }
                                        throw a.n("canCreateSubreddit", "can_create_subreddit", jsonReader);
                                    }
                                    case 34: {
                                        b11 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b11 != null) {
                                            n7 &= 0xFFFFFFFB;
                                            n13 = n8;
                                            break Label_1865;
                                        }
                                        throw a.n("outboundClickTracking", "outbound_clicktracking", jsonReader);
                                    }
                                    case 33: {
                                        b10 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b10 != null) {
                                            n7 &= 0xFFFFFFFD;
                                            n13 = n8;
                                            break Label_1865;
                                        }
                                        throw a.n("hideAds", "hide_ads", jsonReader);
                                    }
                                    case 32: {
                                        b18 = (Boolean)this.nullableBooleanAdapter.fromJson(jsonReader);
                                        n7 &= 0xFFFFFFFE;
                                        n13 = n8;
                                        break Label_1865;
                                    }
                                    case 31: {
                                        n6 = (Integer)this.intAdapter.fromJson(jsonReader);
                                        if (n6 != null) {
                                            n14 = Integer.MAX_VALUE;
                                            break;
                                        }
                                        throw a.n("coins", "coins", jsonReader);
                                    }
                                    case 30: {
                                        b9 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b9 != null) {
                                            n14 = -1073741825;
                                            break;
                                        }
                                        throw a.n("hasModMail", "has_mod_mail", jsonReader);
                                    }
                                    case 29: {
                                        b8 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b8 != null) {
                                            n14 = -536870913;
                                            break;
                                        }
                                        throw a.n("hasMail", "has_mail", jsonReader);
                                    }
                                    case 28: {
                                        n5 = (Integer)this.intAdapter.fromJson(jsonReader);
                                        if (n5 != null) {
                                            n14 = -268435457;
                                            break;
                                        }
                                        throw a.n("inboxCount", "inbox_count", jsonReader);
                                    }
                                    case 27: {
                                        b7 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b7 != null) {
                                            n13 = (n8 & 0xF7FFFFFF);
                                            break Label_1865;
                                        }
                                        throw a.n("forcePasswordReset", "force_password_reset", jsonReader);
                                    }
                                    case 26: {
                                        n12 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                                        n14 = -67108865;
                                        break;
                                    }
                                    case 25: {
                                        final Boolean b23 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b23 != null) {
                                            n13 = (n8 & 0xFDFFFFFF);
                                            b24 = b7;
                                            b22 = b4;
                                            b25 = b5;
                                            b26 = b23;
                                            break Label_1901;
                                        }
                                        throw a.n("isSuspended", "is_suspended", jsonReader);
                                    }
                                    case 24: {
                                        map = (Map)this.nullableMapOfStringAnyAdapter.fromJson(jsonReader);
                                        n14 = -16777217;
                                        break;
                                    }
                                    case 23: {
                                        s3 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                        n14 = -8388609;
                                        break;
                                    }
                                    case 22: {
                                        final Boolean b27 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b27 != null) {
                                            n13 = (n8 & 0xFFBFFFFF);
                                            b28 = b7;
                                            b22 = b4;
                                            b25 = b27;
                                            break Label_1889;
                                        }
                                        throw a.n("hasBeenVisited", "hasBeenVisited", jsonReader);
                                    }
                                    case 21: {
                                        final Boolean b29 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b29 != null) {
                                            n13 = (n8 & 0xFFDFFFFF);
                                            b30 = b7;
                                            b22 = b29;
                                            break Label_1877;
                                        }
                                        throw a.n("acceptFollowers", "accept_followers", jsonReader);
                                    }
                                    case 20: {
                                        b17 = (Boolean)this.nullableBooleanAdapter.fromJson(jsonReader);
                                        n14 = -1048577;
                                        break;
                                    }
                                    case 19: {
                                        b16 = (Boolean)this.nullableBooleanAdapter.fromJson(jsonReader);
                                        n14 = -524289;
                                        break;
                                    }
                                    case 18: {
                                        s = (String)this.stringAdapter.fromJson(jsonReader);
                                        if (s != null) {
                                            n8 &= 0xFFFBFFFF;
                                            continue;
                                        }
                                        throw a.n("iconUrl", "icon_img", jsonReader);
                                    }
                                    case 17: {
                                        userSubreddit = (UserSubreddit)this.nullableUserSubredditAdapter.fromJson(jsonReader);
                                        n14 = -131073;
                                        break;
                                    }
                                    case 16: {
                                        b15 = (Boolean)this.nullableBooleanAdapter.fromJson(jsonReader);
                                        n14 = -65537;
                                        break;
                                    }
                                    case 15: {
                                        b3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b3 != null) {
                                            n14 = -32769;
                                            break;
                                        }
                                        throw a.n("isMod", "is_mod", jsonReader);
                                    }
                                    case 14: {
                                        n11 = (Long)this.nullableLongAdapter.fromJson(jsonReader);
                                        n13 = (n8 & 0xFFFFBFFF);
                                        break Label_1865;
                                    }
                                    case 13: {
                                        n10 = (Long)this.nullableLongAdapter.fromJson(jsonReader);
                                        n13 = (n8 & 0xFFFFDFFF);
                                        break Label_1865;
                                    }
                                    case 12: {
                                        b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b2 != null) {
                                            n13 = (n8 & 0xFFFFEFFF);
                                            break Label_1865;
                                        }
                                        throw a.n("isPremiumSubscriber", "has_gold_subscription", jsonReader);
                                    }
                                    case 11: {
                                        b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b != null) {
                                            n13 = (n8 & 0xFFFFF7FF);
                                            break Label_1865;
                                        }
                                        throw a.n("hasPremium", "is_gold", jsonReader);
                                    }
                                    case 10: {
                                        n4 = (Integer)this.intAdapter.fromJson(jsonReader);
                                        if (n4 != null) {
                                            n13 = (n8 & 0xFFFFFBFF);
                                            break Label_1865;
                                        }
                                        throw a.n("awardeeKarma", "awardee_karma", jsonReader);
                                    }
                                    case 9: {
                                        n3 = (Integer)this.intAdapter.fromJson(jsonReader);
                                        if (n3 != null) {
                                            n13 = (n8 & 0xFFFFFDFF);
                                            break Label_1865;
                                        }
                                        throw a.n("awarderKarma", "awarder_karma", jsonReader);
                                    }
                                    case 8: {
                                        n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                                        if (n2 != null) {
                                            n13 = (n8 & 0xFFFFFEFF);
                                            break Label_1865;
                                        }
                                        throw a.n("commentKarma", "comment_karma", jsonReader);
                                    }
                                    case 7: {
                                        n = (Integer)this.intAdapter.fromJson(jsonReader);
                                        if (n != null) {
                                            n13 = (n8 & 0xFFFFFF7F);
                                            break Label_1865;
                                        }
                                        throw a.n("linkKarma", "link_karma", jsonReader);
                                    }
                                    case 6: {
                                        value = (Integer)this.intAdapter.fromJson(jsonReader);
                                        if (value != null) {
                                            n13 = (n8 & 0xFFFFFFBF);
                                            break Label_1865;
                                        }
                                        throw a.n("totalKarma", "total_karma", jsonReader);
                                    }
                                    case 5: {
                                        b20 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b20 != null) {
                                            n13 = (n8 & 0xFFFFFFDF);
                                            break Label_1865;
                                        }
                                        throw a.n("hideFromRobots", "hide_from_robots", jsonReader);
                                    }
                                    case 4: {
                                        b19 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (b19 != null) {
                                            n13 = (n8 & 0xFFFFFFEF);
                                            break Label_1865;
                                        }
                                        throw a.n("isFriend", "is_friend", jsonReader);
                                    }
                                    case 3: {
                                        false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                        if (false != null) {
                                            n13 = (n8 & 0xFFFFFFF7);
                                            break Label_1865;
                                        }
                                        throw a.n("isEmployee", "is_employee", jsonReader);
                                    }
                                    case 2: {
                                        n9 = (Long)this.longAdapter.fromJson(jsonReader);
                                        if (n9 != null) {
                                            n13 = n8;
                                            break Label_1865;
                                        }
                                        throw a.n("createdUtc", "created_utc", jsonReader);
                                    }
                                    case 1: {
                                        s2 = (String)this.stringAdapter.fromJson(jsonReader);
                                        if (s2 != null) {
                                            n13 = n8;
                                            break Label_1865;
                                        }
                                        throw a.n("username", "name", jsonReader);
                                    }
                                    case 0: {
                                        o = this.stringAdapter.fromJson(jsonReader);
                                        if (o != null) {
                                            n13 = n8;
                                            break Label_1865;
                                        }
                                        throw a.n("id", "id", jsonReader);
                                    }
                                    case -1: {
                                        jsonReader.J();
                                        jsonReader.z1();
                                        n13 = n8;
                                        break Label_1865;
                                    }
                                }
                                n13 = (n8 & n14);
                            }
                            final Boolean b31 = b4;
                            b30 = b7;
                            b22 = b31;
                        }
                        final Boolean b32 = b5;
                        b28 = b30;
                        b25 = b32;
                    }
                    final Boolean b33 = b6;
                    b24 = b28;
                    b26 = b33;
                }
                b21 = b24;
                b6 = b26;
                b5 = b25;
            }
            n8 = n13;
            b4 = b22;
            b7 = b21;
        }
        jsonReader.r();
        if (n8 == 7 && n7 == -1024) {
            if (o == null) {
                throw a.h("id", "id", jsonReader);
            }
            if (s2 == null) {
                throw a.h("username", "name", jsonReader);
            }
            if (n9 != null) {
                final long longValue = n9;
                final boolean booleanValue = false;
                final boolean booleanValue2 = b19;
                final boolean booleanValue3 = b20;
                final int intValue = value;
                final int intValue2 = n;
                final int intValue3 = n2;
                final int intValue4 = n3;
                final int intValue5 = n4;
                final boolean booleanValue4 = b;
                final boolean booleanValue5 = b2;
                final boolean booleanValue6 = b3;
                f.d((Object)s, "null cannot be cast to non-null type kotlin.String");
                final boolean booleanValue7 = b4;
                final boolean booleanValue8 = b5;
                final boolean booleanValue9 = b6;
                final boolean booleanValue10 = b7;
                final int intValue6 = n5;
                final boolean booleanValue11 = b8;
                final boolean booleanValue12 = b9;
                final int intValue7 = n6;
                final boolean booleanValue13 = b10;
                final boolean booleanValue14 = b11;
                final boolean booleanValue15 = b12;
                final boolean booleanValue16 = b13;
                final boolean booleanValue17 = b14;
                f.d((Object)list, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.model.sociallink.SocialLink>");
                f.d((Object)list3, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.model.CommunityHub>");
                return new Account((String)o, s2, longValue, booleanValue, booleanValue2, booleanValue3, intValue, intValue2, intValue3, intValue4, intValue5, booleanValue4, booleanValue5, n10, n11, booleanValue6, b15, userSubreddit, s, b16, b17, booleanValue7, booleanValue8, s3, map, booleanValue9, n12, booleanValue10, intValue6, booleanValue11, booleanValue12, intValue7, b18, booleanValue13, booleanValue14, booleanValue15, booleanValue16, list2, booleanValue17, s4, list, list3);
            }
            throw a.h("createdUtc", "created_utc", jsonReader);
        }
        else {
            Constructor<Account> constructorRef = this.constructorRef;
            if (constructorRef == null) {
                final Class<Long> type = Long.TYPE;
                final Class<Boolean> type2 = Boolean.TYPE;
                final Class<Integer> type3 = Integer.TYPE;
                constructorRef = Account.class.getDeclaredConstructor(String.class, String.class, type, type2, type2, type2, type3, type3, type3, type3, type3, type2, type2, Long.class, Long.class, type2, Boolean.class, UserSubreddit.class, String.class, Boolean.class, Boolean.class, type2, type2, String.class, Map.class, type2, Integer.class, type2, type3, type2, type2, type3, Boolean.class, type2, type2, type2, type2, List.class, type2, String.class, List.class, List.class, type3, type3, a.c);
                this.constructorRef = constructorRef;
                final j a = j.a;
                f.e((Object)constructorRef, "Account::class.java.getD\u2026his.constructorRef = it }");
            }
            if (o == null) {
                throw a.h("id", "id", jsonReader);
            }
            if (s2 == null) {
                throw a.h("username", "name", jsonReader);
            }
            if (n9 != null) {
                final Account instance = constructorRef.newInstance(o, s2, n9, false, b19, b20, value, n, n2, n3, n4, b, b2, n10, n11, b3, b15, userSubreddit, s, b16, b17, b4, b5, s3, map, b6, n12, b7, n5, b8, b9, n6, b18, b10, b11, b12, b13, list2, b14, s4, list, list3, n8, n7, null);
                f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("createdUtc", "created_utc", jsonReader);
        }
    }
    
    public void toJson(final x x, final Account account) {
        f.f((Object)x, "writer");
        if (account != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)account.getId());
            x.w("name");
            this.stringAdapter.toJson(x, (Object)account.getUsername());
            x.w("created_utc");
            this.longAdapter.toJson(x, (Object)account.getCreatedUtc());
            x.w("is_employee");
            this.booleanAdapter.toJson(x, (Object)account.isEmployee());
            x.w("is_friend");
            this.booleanAdapter.toJson(x, (Object)account.isFriend());
            x.w("hide_from_robots");
            this.booleanAdapter.toJson(x, (Object)account.getHideFromRobots());
            x.w("total_karma");
            this.intAdapter.toJson(x, (Object)account.getTotalKarma());
            x.w("link_karma");
            this.intAdapter.toJson(x, (Object)account.getLinkKarma());
            x.w("comment_karma");
            this.intAdapter.toJson(x, (Object)account.getCommentKarma());
            x.w("awarder_karma");
            this.intAdapter.toJson(x, (Object)account.getAwarderKarma());
            x.w("awardee_karma");
            this.intAdapter.toJson(x, (Object)account.getAwardeeKarma());
            x.w("is_gold");
            this.booleanAdapter.toJson(x, (Object)account.getHasPremium());
            x.w("has_gold_subscription");
            this.booleanAdapter.toJson(x, (Object)account.isPremiumSubscriber());
            x.w("gold_expiration");
            this.nullableLongAdapter.toJson(x, (Object)account.getPremiumExpirationUtcSeconds());
            x.w("premium_since");
            this.nullableLongAdapter.toJson(x, (Object)account.getPremiumSinceUtcSeconds());
            x.w("is_mod");
            this.booleanAdapter.toJson(x, (Object)account.isMod());
            x.w("has_verified_email");
            this.nullableBooleanAdapter.toJson(x, (Object)account.getHasVerifiedEmail());
            x.w("subreddit");
            this.nullableUserSubredditAdapter.toJson(x, (Object)account.getSubreddit());
            x.w("icon_img");
            this.stringAdapter.toJson(x, (Object)account.getIconUrl());
            x.w("accept_chats");
            this.nullableBooleanAdapter.toJson(x, (Object)account.getAcceptChats());
            x.w("accept_pms");
            this.nullableBooleanAdapter.toJson(x, (Object)account.getAcceptPrivateMessages());
            x.w("accept_followers");
            this.booleanAdapter.toJson(x, (Object)account.getAcceptFollowers());
            x.w("hasBeenVisited");
            this.booleanAdapter.toJson(x, (Object)account.getHasBeenVisited());
            x.w("email");
            this.nullableStringAdapter.toJson(x, (Object)account.getEmail());
            x.w("features");
            this.nullableMapOfStringAnyAdapter.toJson(x, (Object)account.getFeatures());
            x.w("is_suspended");
            this.booleanAdapter.toJson(x, (Object)account.isSuspended());
            x.w("suspension_expiration_utc");
            this.nullableIntAdapter.toJson(x, (Object)account.getSuspensionExpirationUtc());
            x.w("force_password_reset");
            this.booleanAdapter.toJson(x, (Object)account.getForcePasswordReset());
            x.w("inbox_count");
            this.intAdapter.toJson(x, (Object)account.getInboxCount());
            x.w("has_mail");
            this.booleanAdapter.toJson(x, (Object)account.getHasMail());
            x.w("has_mod_mail");
            this.booleanAdapter.toJson(x, (Object)account.getHasModMail());
            x.w("coins");
            this.intAdapter.toJson(x, (Object)account.getCoins());
            x.w("pref_top_karma_subreddits");
            this.nullableBooleanAdapter.toJson(x, (Object)account.getShowMyActiveCommunities());
            x.w("hide_ads");
            this.booleanAdapter.toJson(x, (Object)account.getHideAds());
            x.w("outbound_clicktracking");
            this.booleanAdapter.toJson(x, (Object)account.getOutboundClickTracking());
            x.w("can_create_subreddit");
            this.booleanAdapter.toJson(x, (Object)account.getCanCreateSubreddit());
            x.w("can_edit_name");
            this.booleanAdapter.toJson(x, (Object)account.getCanEditName());
            x.w("linked_identities");
            this.nullableListOfStringAdapter.toJson(x, (Object)account.getLinkedIdentities());
            x.w("password_set");
            this.booleanAdapter.toJson(x, (Object)account.getHasPasswordSet());
            x.w("snoovatar_img");
            this.nullableStringAdapter.toJson(x, (Object)account.getSnoovatarImg());
            x.w("socialLinks");
            this.listOfSocialLinkAdapter.toJson(x, (Object)account.getSocialLinks());
            x.w("communityHubs");
            this.listOfCommunityHubAdapter.toJson(x, (Object)account.getCommunityHubs());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Account)";
    }
}
