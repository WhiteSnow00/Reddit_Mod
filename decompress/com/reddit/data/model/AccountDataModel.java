// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import com.reddit.domain.model.MyAccount;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.reddit.domain.model.UserSubreddit;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001eB\u0097\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\f\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010%\u001a\u00020\b\u0012\b\b\u0002\u0010&\u001a\u00020\b\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030(\u0012\b\b\u0002\u0010)\u001a\u00020\b\u0012\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010-\u001a\u00020\b\u0012\b\u0010.\u001a\u0004\u0018\u00010/¢\u0006\u0002\u00100J\u0006\u0010c\u001a\u00020dR\u0015\u0010,\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\u0011\u0010%\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010&\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0015\u0010#\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u001f\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\u001f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010;R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010J\u001a\u0004\bH\u0010IR\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010;R\u0015\u0010!\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00103\u001a\u0004\bL\u00102R\u0015\u0010\"\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00103\u001a\u0004\bM\u00102R\u0011\u0010-\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bN\u0010;R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00103\u001a\u0004\bO\u00102R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bP\u0010;R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010DR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010DR\u0015\u0010 \u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010?\u001a\u0004\bS\u0010>R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010;R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010;R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010;R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010;R\u0011\u0010\u001d\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010;R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bT\u00105R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030(¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010DR\u0011\u0010)\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bX\u0010;R\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0015\u0010$\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00103\u001a\u0004\b[\u00102R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010J\u001a\u0004\b\\\u0010IR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010DR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010?\u001a\u0004\b`\u0010>R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\ba\u00105R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010D¨\u0006f" }, d2 = { "Lcom/reddit/data/model/AccountDataModel;", "", "id", "", "name", "created_utc", "", "is_employee", "", "is_friend", "hide_from_robots", "total_karma", "", "link_karma", "comment_karma", "awarder_karma", "awardee_karma", "is_gold", "has_gold_subscription", "gold_expiration", "premium_since", "is_mod", "has_verified_email", "unverified_email", "email", "subreddit", "Lcom/reddit/domain/model/UserSubreddit;", "icon_img", "snoovatar_img", "is_suspended", "suspension_expiration_utc", "force_password_reset", "inbox_count", "has_mail", "has_mod_mail", "coins", "pref_top_karma_subreddits", "can_create_subreddit", "can_edit_name", "linked_identities", "", "password_set", "features", "", "accept_chats", "has_subscribed_to_premium", "phone_number", "Lcom/reddit/data/model/AccountDataModel$PhoneNumber;", "(Ljava/lang/String;Ljava/lang/String;JZZZIIIIIZZLjava/lang/Long;Ljava/lang/Long;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/UserSubreddit;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;ZZLjava/util/List;ZLjava/util/Map;Ljava/lang/Boolean;ZLcom/reddit/data/model/AccountDataModel$PhoneNumber;)V", "getAccept_chats", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAwardee_karma", "()I", "setAwardee_karma", "(I)V", "getAwarder_karma", "setAwarder_karma", "getCan_create_subreddit", "()Z", "getCan_edit_name", "getCoins", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getComment_karma", "getCreated_utc", "()J", "getEmail", "()Ljava/lang/String;", "getFeatures", "()Ljava/util/Map;", "getForce_password_reset", "getGold_expiration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHas_gold_subscription", "getHas_mail", "getHas_mod_mail", "getHas_subscribed_to_premium", "getHas_verified_email", "getHide_from_robots", "getIcon_img", "getId", "getInbox_count", "getLink_karma", "getLinked_identities", "()Ljava/util/List;", "getName", "getPassword_set", "getPhone_number", "()Lcom/reddit/data/model/AccountDataModel$PhoneNumber;", "getPref_top_karma_subreddits", "getPremium_since", "getSnoovatar_img", "getSubreddit", "()Lcom/reddit/domain/model/UserSubreddit;", "getSuspension_expiration_utc", "getTotal_karma", "getUnverified_email", "toDomainModel", "Lcom/reddit/domain/model/MyAccount;", "PhoneNumber", "data-remote_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AccountDataModel
{
    private final Boolean accept_chats;
    private int awardee_karma;
    private int awarder_karma;
    private final boolean can_create_subreddit;
    private final boolean can_edit_name;
    private final Integer coins;
    private final int comment_karma;
    private final long created_utc;
    private final String email;
    private final Map<String, Object> features;
    private final boolean force_password_reset;
    private final Long gold_expiration;
    private final boolean has_gold_subscription;
    private final Boolean has_mail;
    private final Boolean has_mod_mail;
    private final boolean has_subscribed_to_premium;
    private final Boolean has_verified_email;
    private final boolean hide_from_robots;
    private final String icon_img;
    private final String id;
    private final Integer inbox_count;
    private final boolean is_employee;
    private final boolean is_friend;
    private final boolean is_gold;
    private final boolean is_mod;
    private final boolean is_suspended;
    private final int link_karma;
    private final List<String> linked_identities;
    private final String name;
    private final boolean password_set;
    private final PhoneNumber phone_number;
    private final Boolean pref_top_karma_subreddits;
    private final Long premium_since;
    private final String snoovatar_img;
    private final UserSubreddit subreddit;
    private final Integer suspension_expiration_utc;
    private final int total_karma;
    private final String unverified_email;
    
    public AccountDataModel(final String id, final String name, final long created_utc, final boolean is_employee, final boolean is_friend, final boolean hide_from_robots, final int total_karma, final int link_karma, final int comment_karma, final int awarder_karma, final int awardee_karma, final boolean is_gold, final boolean has_gold_subscription, final Long gold_expiration, final Long premium_since, final boolean is_mod, final Boolean has_verified_email, final String unverified_email, final String email, final UserSubreddit subreddit, final String icon_img, final String snoovatar_img, final boolean is_suspended, final Integer suspension_expiration_utc, final boolean force_password_reset, final Integer inbox_count, final Boolean has_mail, final Boolean has_mod_mail, final Integer coins, final Boolean pref_top_karma_subreddits, final boolean can_create_subreddit, final boolean can_edit_name, final List<String> linked_identities, final boolean password_set, final Map<String, ?> features, final Boolean accept_chats, final boolean has_subscribed_to_premium, final PhoneNumber phone_number) {
        f.f((Object)id, "id");
        f.f((Object)name, "name");
        f.f((Object)icon_img, "icon_img");
        f.f((Object)snoovatar_img, "snoovatar_img");
        f.f((Object)linked_identities, "linked_identities");
        this.id = id;
        this.name = name;
        this.created_utc = created_utc;
        this.is_employee = is_employee;
        this.is_friend = is_friend;
        this.hide_from_robots = hide_from_robots;
        this.total_karma = total_karma;
        this.link_karma = link_karma;
        this.comment_karma = comment_karma;
        this.awarder_karma = awarder_karma;
        this.awardee_karma = awardee_karma;
        this.is_gold = is_gold;
        this.has_gold_subscription = has_gold_subscription;
        this.gold_expiration = gold_expiration;
        this.premium_since = premium_since;
        this.is_mod = is_mod;
        this.has_verified_email = has_verified_email;
        this.unverified_email = unverified_email;
        this.email = email;
        this.subreddit = subreddit;
        this.icon_img = icon_img;
        this.snoovatar_img = snoovatar_img;
        this.is_suspended = is_suspended;
        this.suspension_expiration_utc = suspension_expiration_utc;
        this.force_password_reset = force_password_reset;
        this.inbox_count = inbox_count;
        this.has_mail = has_mail;
        this.has_mod_mail = has_mod_mail;
        this.coins = coins;
        this.pref_top_karma_subreddits = pref_top_karma_subreddits;
        this.can_create_subreddit = can_create_subreddit;
        this.can_edit_name = can_edit_name;
        this.linked_identities = linked_identities;
        this.password_set = password_set;
        this.features = (Map<String, Object>)features;
        this.accept_chats = accept_chats;
        this.has_subscribed_to_premium = has_subscribed_to_premium;
        this.phone_number = phone_number;
    }
    
    public AccountDataModel(String s, String s2, long n, boolean b, boolean b2, boolean b3, int n2, int n3, int n4, int n5, int n6, boolean b4, boolean b5, final Long n7, final Long n8, boolean b6, final Boolean b7, final String s3, final String s4, final UserSubreddit userSubreddit, String s5, String s6, boolean b8, final Integer n9, boolean b9, final Integer n10, final Boolean b10, final Boolean b11, final Integer n11, final Boolean b12, boolean b13, boolean b14, List instance, boolean b15, Map map, Boolean b16, boolean b17, final PhoneNumber phoneNumber, final int n12, final int n13, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n12 & 0x1) != 0x0) {
            s = "";
        }
        if ((n12 & 0x2) != 0x0) {
            s2 = "";
        }
        if ((n12 & 0x4) != 0x0) {
            n = 0L;
        }
        if ((n12 & 0x8) != 0x0) {
            b = false;
        }
        if ((n12 & 0x10) != 0x0) {
            b2 = false;
        }
        if ((n12 & 0x20) != 0x0) {
            b3 = false;
        }
        if ((n12 & 0x40) != 0x0) {
            n2 = 0;
        }
        if ((n12 & 0x80) != 0x0) {
            n3 = 0;
        }
        if ((n12 & 0x100) != 0x0) {
            n4 = 0;
        }
        if ((n12 & 0x200) != 0x0) {
            n5 = 0;
        }
        if ((n12 & 0x400) != 0x0) {
            n6 = 0;
        }
        if ((n12 & 0x800) != 0x0) {
            b4 = false;
        }
        if ((n12 & 0x1000) != 0x0) {
            b5 = false;
        }
        if ((0x8000 & n12) != 0x0) {
            b6 = false;
        }
        if ((0x100000 & n12) != 0x0) {
            s5 = "";
        }
        if ((0x200000 & n12) != 0x0) {
            s6 = "";
        }
        if ((0x400000 & n12) != 0x0) {
            b8 = false;
        }
        if ((0x1000000 & n12) != 0x0) {
            b9 = false;
        }
        if ((0x40000000 & n12) != 0x0) {
            b13 = false;
        }
        if ((n12 & Integer.MIN_VALUE) != 0x0) {
            b14 = false;
        }
        if ((n13 & 0x1) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((n13 & 0x2) != 0x0) {
            b15 = false;
        }
        if ((n13 & 0x4) != 0x0) {
            map = null;
        }
        if ((n13 & 0x8) != 0x0) {
            b16 = null;
        }
        if ((n13 & 0x10) != 0x0) {
            b17 = false;
        }
        this(s, s2, n, b, b2, b3, n2, n3, n4, n5, n6, b4, b5, n7, n8, b6, b7, s3, s4, userSubreddit, s5, s6, b8, n9, b9, n10, b10, b11, n11, b12, b13, b14, (List<String>)instance, b15, map, b16, b17, phoneNumber);
    }
    
    public final Boolean getAccept_chats() {
        return this.accept_chats;
    }
    
    public final int getAwardee_karma() {
        return this.awardee_karma;
    }
    
    public final int getAwarder_karma() {
        return this.awarder_karma;
    }
    
    public final boolean getCan_create_subreddit() {
        return this.can_create_subreddit;
    }
    
    public final boolean getCan_edit_name() {
        return this.can_edit_name;
    }
    
    public final Integer getCoins() {
        return this.coins;
    }
    
    public final int getComment_karma() {
        return this.comment_karma;
    }
    
    public final long getCreated_utc() {
        return this.created_utc;
    }
    
    public final String getEmail() {
        return this.email;
    }
    
    public final Map<String, Object> getFeatures() {
        return this.features;
    }
    
    public final boolean getForce_password_reset() {
        return this.force_password_reset;
    }
    
    public final Long getGold_expiration() {
        return this.gold_expiration;
    }
    
    public final boolean getHas_gold_subscription() {
        return this.has_gold_subscription;
    }
    
    public final Boolean getHas_mail() {
        return this.has_mail;
    }
    
    public final Boolean getHas_mod_mail() {
        return this.has_mod_mail;
    }
    
    public final boolean getHas_subscribed_to_premium() {
        return this.has_subscribed_to_premium;
    }
    
    public final Boolean getHas_verified_email() {
        return this.has_verified_email;
    }
    
    public final boolean getHide_from_robots() {
        return this.hide_from_robots;
    }
    
    public final String getIcon_img() {
        return this.icon_img;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final Integer getInbox_count() {
        return this.inbox_count;
    }
    
    public final int getLink_karma() {
        return this.link_karma;
    }
    
    public final List<String> getLinked_identities() {
        return this.linked_identities;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final boolean getPassword_set() {
        return this.password_set;
    }
    
    public final PhoneNumber getPhone_number() {
        return this.phone_number;
    }
    
    public final Boolean getPref_top_karma_subreddits() {
        return this.pref_top_karma_subreddits;
    }
    
    public final Long getPremium_since() {
        return this.premium_since;
    }
    
    public final String getSnoovatar_img() {
        return this.snoovatar_img;
    }
    
    public final UserSubreddit getSubreddit() {
        return this.subreddit;
    }
    
    public final Integer getSuspension_expiration_utc() {
        return this.suspension_expiration_utc;
    }
    
    public final int getTotal_karma() {
        return this.total_karma;
    }
    
    public final String getUnverified_email() {
        return this.unverified_email;
    }
    
    public final boolean is_employee() {
        return this.is_employee;
    }
    
    public final boolean is_friend() {
        return this.is_friend;
    }
    
    public final boolean is_gold() {
        return this.is_gold;
    }
    
    public final boolean is_mod() {
        return this.is_mod;
    }
    
    public final boolean is_suspended() {
        return this.is_suspended;
    }
    
    public final void setAwardee_karma(final int awardee_karma) {
        this.awardee_karma = awardee_karma;
    }
    
    public final void setAwarder_karma(final int awarder_karma) {
        this.awarder_karma = awarder_karma;
    }
    
    public final MyAccount toDomainModel() {
        final String id = this.id;
        final String name = this.name;
        final long created_utc = this.created_utc;
        final boolean is_employee = this.is_employee;
        final boolean is_friend = this.is_friend;
        final boolean hide_from_robots = this.hide_from_robots;
        final int total_karma = this.total_karma;
        final int link_karma = this.link_karma;
        final int comment_karma = this.comment_karma;
        final int awarder_karma = this.awarder_karma;
        final int awardee_karma = this.awardee_karma;
        final boolean is_gold = this.is_gold;
        final boolean has_gold_subscription = this.has_gold_subscription;
        final Long gold_expiration = this.gold_expiration;
        final Long premium_since = this.premium_since;
        final boolean is_mod = this.is_mod;
        final Boolean has_verified_email = this.has_verified_email;
        String s;
        if (f.a((Object)has_verified_email, (Object)Boolean.TRUE)) {
            s = this.email;
        }
        else {
            s = this.unverified_email;
        }
        final UserSubreddit subreddit = this.subreddit;
        final String icon_img = this.icon_img;
        final String snoovatar_img = this.snoovatar_img;
        final boolean is_suspended = this.is_suspended;
        final Integer suspension_expiration_utc = this.suspension_expiration_utc;
        final boolean force_password_reset = this.force_password_reset;
        final Integer inbox_count = this.inbox_count;
        final Boolean has_mail = this.has_mail;
        final Boolean has_mod_mail = this.has_mod_mail;
        final Integer coins = this.coins;
        int intValue;
        if (coins != null) {
            intValue = coins;
        }
        else {
            intValue = 0;
        }
        final Boolean pref_top_karma_subreddits = this.pref_top_karma_subreddits;
        final boolean can_create_subreddit = this.can_create_subreddit;
        final boolean can_edit_name = this.can_edit_name;
        final List<String> linked_identities = this.linked_identities;
        final boolean password_set = this.password_set;
        final Map<String, Object> features = this.features;
        final Boolean accept_chats = this.accept_chats;
        final boolean has_subscribed_to_premium = this.has_subscribed_to_premium;
        final PhoneNumber phone_number = this.phone_number;
        String code;
        if (phone_number != null) {
            code = phone_number.getCode();
        }
        else {
            code = null;
        }
        final PhoneNumber phone_number2 = this.phone_number;
        String number;
        if (phone_number2 != null) {
            number = phone_number2.getNumber();
        }
        else {
            number = null;
        }
        return new MyAccount(id, name, created_utc, is_employee, is_friend, hide_from_robots, total_karma, link_karma, comment_karma, awarder_karma, awardee_karma, is_gold, has_gold_subscription, gold_expiration, premium_since, has_subscribed_to_premium, is_mod, has_verified_email, s, code, number, subreddit, icon_img, false, features, is_suspended, suspension_expiration_utc, force_password_reset, inbox_count, has_mail, has_mod_mail, intValue, pref_top_karma_subreddits, false, false, can_create_subreddit, can_edit_name, linked_identities, password_set, accept_chats, null, snoovatar_img, 0, 256, null);
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t" }, d2 = { "Lcom/reddit/data/model/AccountDataModel$PhoneNumber;", "", "code", "", "number", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getNumber", "data-remote_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class PhoneNumber
    {
        private final String code;
        private final String number;
        
        public PhoneNumber(final String code, final String number) {
            f.f((Object)code, "code");
            f.f((Object)number, "number");
            this.code = code;
            this.number = number;
        }
        
        public final String getCode() {
            return this.code;
        }
        
        public final String getNumber() {
            return this.number;
        }
    }
}
