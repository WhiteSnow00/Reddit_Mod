// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.awards.model;

import java.util.ArrayList;
import java.util.Iterator;
import androidx.viewpager.widget.c;
import android.os.Parcel;
import ak0.m;
import a2.b;
import ag0.a;
import com.reddit.domain.image.model.ImageFormat;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.squareup.moshi.n;
import com.reddit.domain.image.model.ImageResolution;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import java.io.Serializable;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0083\u0002\u0012\b\b\u0001\u0010\"\u001a\u00020\u0003\u0012\b\b\u0001\u0010#\u001a\u00020\u0005\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010%\u001a\u00020\u0003\u0012\b\b\u0001\u0010&\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010.\u001a\u00020\u000e\u0012\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0003\u00101\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000b\u0012\u0010\b\u0003\u00102\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000b\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0003\u00105\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0004\bf\u0010gJ\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000bH\u00c6\u0003J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b \u0010\u0014J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u00c6\u0003J\u008c\u0002\u00106\u001a\u00020\u00002\b\b\u0003\u0010\"\u001a\u00020\u00032\b\b\u0003\u0010#\u001a\u00020\u00052\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010%\u001a\u00020\u00032\b\b\u0003\u0010&\u001a\u00020\u00032\u000e\b\u0003\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010.\u001a\u00020\u000e2\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00122\u0010\b\u0003\u00101\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000b2\u0010\b\u0003\u00102\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00122\u0010\b\u0003\u00105\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u00c6\u0001¢\u0006\u0004\b6\u00107J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\t\u0010:\u001a\u000209H\u00d6\u0001J\u0013\u0010=\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010;H\u00d6\u0003J\t\u0010>\u001a\u000209H\u00d6\u0001J\u0019\u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u000209H\u00d6\u0001R\u0017\u0010\"\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010#\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010$\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010%\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010D\u001a\u0004\bM\u0010FR\u0017\u0010&\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010D\u001a\u0004\bN\u0010FR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010(\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010R\u001a\u0004\b(\u0010\u0010R\u0019\u0010)\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b)\u0010D\u001a\u0004\bS\u0010FR\u0019\u0010*\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b*\u0010T\u001a\u0004\bU\u0010\u0014R\u0019\u0010+\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b+\u0010T\u001a\u0004\bV\u0010\u0014R\u0019\u0010,\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b,\u0010T\u001a\u0004\bW\u0010\u0014R\u0019\u0010-\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b-\u0010D\u001a\u0004\bX\u0010FR\u0017\u0010.\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010Y\u001a\u0004\b.\u0010ZR\u0019\u0010/\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b/\u0010D\u001a\u0004\b[\u0010FR\u0019\u00100\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b0\u0010T\u001a\u0004\b\\\u0010\u0014R\u001f\u00101\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b1\u0010O\u001a\u0004\b]\u0010QR\u001f\u00102\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b2\u0010O\u001a\u0004\b^\u0010QR\u0019\u00103\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b3\u0010T\u001a\u0004\b_\u0010\u0014R\u0019\u00104\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b4\u0010T\u001a\u0004\b`\u0010\u0014R\u001f\u00105\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b5\u0010O\u001a\u0004\ba\u0010QR\u0011\u0010e\u001a\u00020b8F¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006h" }, d2 = { "Lcom/reddit/domain/awards/model/Award;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "component1", "Lcom/reddit/domain/awards/model/AwardType;", "component2", "Lcom/reddit/domain/awards/model/AwardSubType;", "component3", "component4", "component5", "", "Lcom/reddit/domain/image/model/ImageResolution;", "component6", "", "component7", "()Ljava/lang/Boolean;", "component8", "", "component9", "()Ljava/lang/Long;", "component10", "component11", "component12", "component13", "component14", "component15", "Lcom/reddit/domain/awards/model/GroupAwardTier;", "component16", "Lcom/reddit/domain/awards/model/CurrentUserAwarding;", "component17", "component18", "component19", "component20", "id", "awardType", "awardSubType", "name", "iconUrl", "resizedIcons", "isEnabled", "description", "coinPrice", "daysOfPremium", "count", "subredditId", "isNew", "iconFormatRaw", "stickyDurationSeconds", "groupAwardTiers", "awardingsByCurrentUser", "startsAtUtc", "endsAtUtc", "awardTags", "copy", "(Ljava/lang/String;Lcom/reddit/domain/awards/model/AwardType;Lcom/reddit/domain/awards/model/AwardSubType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)Lcom/reddit/domain/awards/model/Award;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/reddit/domain/awards/model/AwardType;", "getAwardType", "()Lcom/reddit/domain/awards/model/AwardType;", "Lcom/reddit/domain/awards/model/AwardSubType;", "getAwardSubType", "()Lcom/reddit/domain/awards/model/AwardSubType;", "getName", "getIconUrl", "Ljava/util/List;", "getResizedIcons", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getDescription", "Ljava/lang/Long;", "getCoinPrice", "getDaysOfPremium", "getCount", "getSubredditId", "Z", "()Z", "getIconFormatRaw", "getStickyDurationSeconds", "getGroupAwardTiers", "getAwardingsByCurrentUser", "getStartsAtUtc", "getEndsAtUtc", "getAwardTags", "Lcom/reddit/domain/image/model/ImageFormat;", "getIconFormat", "()Lcom/reddit/domain/image/model/ImageFormat;", "iconFormat", "<init>", "(Ljava/lang/String;Lcom/reddit/domain/awards/model/AwardType;Lcom/reddit/domain/awards/model/AwardSubType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class Award implements Parcelable, Serializable
{
    public static final Parcelable$Creator<Award> CREATOR;
    private final AwardSubType awardSubType;
    private final List<String> awardTags;
    private final AwardType awardType;
    private final List<CurrentUserAwarding> awardingsByCurrentUser;
    private final Long coinPrice;
    private final Long count;
    private final Long daysOfPremium;
    private final String description;
    private final Long endsAtUtc;
    private final List<GroupAwardTier> groupAwardTiers;
    private final String iconFormatRaw;
    private final String iconUrl;
    private final String id;
    private final Boolean isEnabled;
    private final boolean isNew;
    private final String name;
    private final List<ImageResolution> resizedIcons;
    private final Long startsAtUtc;
    private final Long stickyDurationSeconds;
    private final String subredditId;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public Award(@n(name = "id") final String id, @n(name = "award_type") final AwardType awardType, @n(name = "award_sub_type") final AwardSubType awardSubType, @n(name = "name") String name, @n(name = "icon_url") final String iconUrl, @n(name = "resized_icons") final List<ImageResolution> resizedIcons, @n(name = "is_enabled") final Boolean isEnabled, @n(name = "description") final String description, @n(name = "coin_price") final Long coinPrice, @n(name = "days_of_premium") final Long daysOfPremium, @n(name = "count") final Long count, @n(name = "subreddit_id") final String subredditId, @n(name = "is_new") final boolean isNew, @n(name = "icon_format") final String iconFormatRaw, @n(name = "sticky_duration_seconds") final Long stickyDurationSeconds, @n(name = "tiers_by_required_awardings") final List<GroupAwardTier> groupAwardTiers, @n(name = "awarding_by_current_user") final List<CurrentUserAwarding> awardingsByCurrentUser, final Long startsAtUtc, final Long endsAtUtc, @n(name = "tags") final List<String> awardTags) {
        f.f((Object)id, "id");
        f.f((Object)awardType, "awardType");
        f.f((Object)name, "name");
        f.f((Object)iconUrl, "iconUrl");
        f.f((Object)resizedIcons, "resizedIcons");
        this.id = id;
        this.awardType = awardType;
        this.awardSubType = awardSubType;
        this.name = name;
        this.iconUrl = iconUrl;
        this.resizedIcons = resizedIcons;
        this.isEnabled = isEnabled;
        this.description = description;
        this.coinPrice = coinPrice;
        this.daysOfPremium = daysOfPremium;
        this.count = count;
        this.subredditId = subredditId;
        this.isNew = isNew;
        this.iconFormatRaw = iconFormatRaw;
        this.stickyDurationSeconds = stickyDurationSeconds;
        this.groupAwardTiers = groupAwardTiers;
        this.awardingsByCurrentUser = awardingsByCurrentUser;
        this.startsAtUtc = startsAtUtc;
        this.endsAtUtc = endsAtUtc;
        this.awardTags = awardTags;
    }
    
    public Award(final String s, final AwardType awardType, AwardSubType awardSubType, final String s2, final String s3, List instance, Boolean b, String s4, Long n, Long n2, Long n3, String s5, boolean b2, String s6, Long n4, List list, List list2, Long n5, Long n6, List list3, final int n7, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n7 & 0x4) != 0x0) {
            awardSubType = null;
        }
        if ((n7 & 0x20) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((n7 & 0x40) != 0x0) {
            b = null;
        }
        if ((n7 & 0x80) != 0x0) {
            s4 = null;
        }
        if ((n7 & 0x100) != 0x0) {
            n = null;
        }
        if ((n7 & 0x200) != 0x0) {
            n2 = null;
        }
        if ((n7 & 0x400) != 0x0) {
            n3 = null;
        }
        if ((n7 & 0x800) != 0x0) {
            s5 = null;
        }
        if ((n7 & 0x1000) != 0x0) {
            b2 = false;
        }
        if ((n7 & 0x2000) != 0x0) {
            s6 = null;
        }
        if ((n7 & 0x4000) != 0x0) {
            n4 = null;
        }
        if ((0x8000 & n7) != 0x0) {
            list = null;
        }
        if ((0x10000 & n7) != 0x0) {
            list2 = null;
        }
        if ((0x20000 & n7) != 0x0) {
            n5 = null;
        }
        if ((0x40000 & n7) != 0x0) {
            n6 = null;
        }
        if ((n7 & 0x80000) != 0x0) {
            list3 = null;
        }
        this(s, awardType, awardSubType, s2, s3, (List<ImageResolution>)instance, b, s4, n, n2, n3, s5, b2, s6, n4, list, list2, n5, n6, list3);
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final Long component10() {
        return this.daysOfPremium;
    }
    
    public final Long component11() {
        return this.count;
    }
    
    public final String component12() {
        return this.subredditId;
    }
    
    public final boolean component13() {
        return this.isNew;
    }
    
    public final String component14() {
        return this.iconFormatRaw;
    }
    
    public final Long component15() {
        return this.stickyDurationSeconds;
    }
    
    public final List<GroupAwardTier> component16() {
        return this.groupAwardTiers;
    }
    
    public final List<CurrentUserAwarding> component17() {
        return this.awardingsByCurrentUser;
    }
    
    public final Long component18() {
        return this.startsAtUtc;
    }
    
    public final Long component19() {
        return this.endsAtUtc;
    }
    
    public final AwardType component2() {
        return this.awardType;
    }
    
    public final List<String> component20() {
        return this.awardTags;
    }
    
    public final AwardSubType component3() {
        return this.awardSubType;
    }
    
    public final String component4() {
        return this.name;
    }
    
    public final String component5() {
        return this.iconUrl;
    }
    
    public final List<ImageResolution> component6() {
        return this.resizedIcons;
    }
    
    public final Boolean component7() {
        return this.isEnabled;
    }
    
    public final String component8() {
        return this.description;
    }
    
    public final Long component9() {
        return this.coinPrice;
    }
    
    public final Award copy(@n(name = "id") final String s, @n(name = "award_type") final AwardType awardType, @n(name = "award_sub_type") final AwardSubType awardSubType, @n(name = "name") final String s2, @n(name = "icon_url") final String s3, @n(name = "resized_icons") final List<ImageResolution> list, @n(name = "is_enabled") final Boolean b, @n(name = "description") final String s4, @n(name = "coin_price") final Long n, @n(name = "days_of_premium") final Long n2, @n(name = "count") final Long n3, @n(name = "subreddit_id") final String s5, @n(name = "is_new") final boolean b2, @n(name = "icon_format") final String s6, @n(name = "sticky_duration_seconds") final Long n4, @n(name = "tiers_by_required_awardings") final List<GroupAwardTier> list2, @n(name = "awarding_by_current_user") final List<CurrentUserAwarding> list3, final Long n5, final Long n6, @n(name = "tags") final List<String> list4) {
        f.f((Object)s, "id");
        f.f((Object)awardType, "awardType");
        f.f((Object)s2, "name");
        f.f((Object)s3, "iconUrl");
        f.f((Object)list, "resizedIcons");
        return new Award(s, awardType, awardSubType, s2, s3, list, b, s4, n, n2, n3, s5, b2, s6, n4, list2, list3, n5, n6, list4);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Award)) {
            return false;
        }
        final Award award = (Award)o;
        return f.a((Object)this.id, (Object)award.id) && this.awardType == award.awardType && this.awardSubType == award.awardSubType && f.a((Object)this.name, (Object)award.name) && f.a((Object)this.iconUrl, (Object)award.iconUrl) && f.a((Object)this.resizedIcons, (Object)award.resizedIcons) && f.a((Object)this.isEnabled, (Object)award.isEnabled) && f.a((Object)this.description, (Object)award.description) && f.a((Object)this.coinPrice, (Object)award.coinPrice) && f.a((Object)this.daysOfPremium, (Object)award.daysOfPremium) && f.a((Object)this.count, (Object)award.count) && f.a((Object)this.subredditId, (Object)award.subredditId) && this.isNew == award.isNew && f.a((Object)this.iconFormatRaw, (Object)award.iconFormatRaw) && f.a((Object)this.stickyDurationSeconds, (Object)award.stickyDurationSeconds) && f.a((Object)this.groupAwardTiers, (Object)award.groupAwardTiers) && f.a((Object)this.awardingsByCurrentUser, (Object)award.awardingsByCurrentUser) && f.a((Object)this.startsAtUtc, (Object)award.startsAtUtc) && f.a((Object)this.endsAtUtc, (Object)award.endsAtUtc) && f.a((Object)this.awardTags, (Object)award.awardTags);
    }
    
    public final AwardSubType getAwardSubType() {
        return this.awardSubType;
    }
    
    public final List<String> getAwardTags() {
        return this.awardTags;
    }
    
    public final AwardType getAwardType() {
        return this.awardType;
    }
    
    public final List<CurrentUserAwarding> getAwardingsByCurrentUser() {
        return this.awardingsByCurrentUser;
    }
    
    public final Long getCoinPrice() {
        return this.coinPrice;
    }
    
    public final Long getCount() {
        return this.count;
    }
    
    public final Long getDaysOfPremium() {
        return this.daysOfPremium;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final Long getEndsAtUtc() {
        return this.endsAtUtc;
    }
    
    public final List<GroupAwardTier> getGroupAwardTiers() {
        return this.groupAwardTiers;
    }
    
    public final ImageFormat getIconFormat() {
        return ImageFormat.Companion.parse(this.iconFormatRaw);
    }
    
    public final String getIconFormatRaw() {
        return this.iconFormatRaw;
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final List<ImageResolution> getResizedIcons() {
        return this.resizedIcons;
    }
    
    public final Long getStartsAtUtc() {
        return this.startsAtUtc;
    }
    
    public final Long getStickyDurationSeconds() {
        return this.stickyDurationSeconds;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final int hashCode2 = this.awardType.hashCode();
        final AwardSubType awardSubType = this.awardSubType;
        int hashCode3 = 0;
        int hashCode4;
        if (awardSubType == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = awardSubType.hashCode();
        }
        final int a = b.a((List)this.resizedIcons, ag0.a.f(this.iconUrl, ag0.a.f(this.name, ((hashCode2 + hashCode * 31) * 31 + hashCode4) * 31, 31), 31), 31);
        final Boolean isEnabled = this.isEnabled;
        int hashCode5;
        if (isEnabled == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = isEnabled.hashCode();
        }
        final String description = this.description;
        int hashCode6;
        if (description == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = description.hashCode();
        }
        final Long coinPrice = this.coinPrice;
        int hashCode7;
        if (coinPrice == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = coinPrice.hashCode();
        }
        final Long daysOfPremium = this.daysOfPremium;
        int hashCode8;
        if (daysOfPremium == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = daysOfPremium.hashCode();
        }
        final Long count = this.count;
        int hashCode9;
        if (count == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = count.hashCode();
        }
        final String subredditId = this.subredditId;
        int hashCode10;
        if (subredditId == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = subredditId.hashCode();
        }
        int isNew;
        if ((isNew = (this.isNew ? 1 : 0)) != 0) {
            isNew = 1;
        }
        final String iconFormatRaw = this.iconFormatRaw;
        int hashCode11;
        if (iconFormatRaw == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = iconFormatRaw.hashCode();
        }
        final Long stickyDurationSeconds = this.stickyDurationSeconds;
        int hashCode12;
        if (stickyDurationSeconds == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = stickyDurationSeconds.hashCode();
        }
        final List<GroupAwardTier> groupAwardTiers = this.groupAwardTiers;
        int hashCode13;
        if (groupAwardTiers == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = groupAwardTiers.hashCode();
        }
        final List<CurrentUserAwarding> awardingsByCurrentUser = this.awardingsByCurrentUser;
        int hashCode14;
        if (awardingsByCurrentUser == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = awardingsByCurrentUser.hashCode();
        }
        final Long startsAtUtc = this.startsAtUtc;
        int hashCode15;
        if (startsAtUtc == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = startsAtUtc.hashCode();
        }
        final Long endsAtUtc = this.endsAtUtc;
        int hashCode16;
        if (endsAtUtc == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = endsAtUtc.hashCode();
        }
        final List<String> awardTags = this.awardTags;
        if (awardTags != null) {
            hashCode3 = awardTags.hashCode();
        }
        return (((((((((((((a + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + isNew) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode3;
    }
    
    public final Boolean isEnabled() {
        return this.isEnabled;
    }
    
    public final boolean isNew() {
        return this.isNew;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Award(id=");
        k.append(this.id);
        k.append(", awardType=");
        k.append(this.awardType);
        k.append(", awardSubType=");
        k.append(this.awardSubType);
        k.append(", name=");
        k.append(this.name);
        k.append(", iconUrl=");
        k.append(this.iconUrl);
        k.append(", resizedIcons=");
        k.append(this.resizedIcons);
        k.append(", isEnabled=");
        k.append(this.isEnabled);
        k.append(", description=");
        k.append(this.description);
        k.append(", coinPrice=");
        k.append(this.coinPrice);
        k.append(", daysOfPremium=");
        k.append(this.daysOfPremium);
        k.append(", count=");
        k.append(this.count);
        k.append(", subredditId=");
        k.append(this.subredditId);
        k.append(", isNew=");
        k.append(this.isNew);
        k.append(", iconFormatRaw=");
        k.append(this.iconFormatRaw);
        k.append(", stickyDurationSeconds=");
        k.append(this.stickyDurationSeconds);
        k.append(", groupAwardTiers=");
        k.append(this.groupAwardTiers);
        k.append(", awardingsByCurrentUser=");
        k.append(this.awardingsByCurrentUser);
        k.append(", startsAtUtc=");
        k.append(this.startsAtUtc);
        k.append(", endsAtUtc=");
        k.append(this.endsAtUtc);
        k.append(", awardTags=");
        return m.n(k, (List)this.awardTags, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.awardType.name());
        final AwardSubType awardSubType = this.awardSubType;
        if (awardSubType == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeString(awardSubType.name());
        }
        parcel.writeString(this.name);
        parcel.writeString(this.iconUrl);
        final Iterator n2 = b.n((List)this.resizedIcons, parcel);
        while (n2.hasNext()) {
            parcel.writeParcelable((Parcelable)n2.next(), n);
        }
        final Boolean isEnabled = this.isEnabled;
        if (isEnabled == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.w(parcel, 1, isEnabled);
        }
        parcel.writeString(this.description);
        final Long coinPrice = this.coinPrice;
        if (coinPrice == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, coinPrice);
        }
        final Long daysOfPremium = this.daysOfPremium;
        if (daysOfPremium == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, daysOfPremium);
        }
        final Long count = this.count;
        if (count == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, count);
        }
        parcel.writeString(this.subredditId);
        parcel.writeInt((int)(this.isNew ? 1 : 0));
        parcel.writeString(this.iconFormatRaw);
        final Long stickyDurationSeconds = this.stickyDurationSeconds;
        if (stickyDurationSeconds == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, stickyDurationSeconds);
        }
        final List<GroupAwardTier> groupAwardTiers = this.groupAwardTiers;
        if (groupAwardTiers == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator o = b.o(parcel, 1, (List)groupAwardTiers);
            while (o.hasNext()) {
                ((GroupAwardTier)o.next()).writeToParcel(parcel, n);
            }
        }
        final List<CurrentUserAwarding> awardingsByCurrentUser = this.awardingsByCurrentUser;
        if (awardingsByCurrentUser == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator o2 = b.o(parcel, 1, (List)awardingsByCurrentUser);
            while (o2.hasNext()) {
                ((CurrentUserAwarding)o2.next()).writeToParcel(parcel, n);
            }
        }
        final Long startsAtUtc = this.startsAtUtc;
        if (startsAtUtc == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, startsAtUtc);
        }
        final Long endsAtUtc = this.endsAtUtc;
        if (endsAtUtc == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, endsAtUtc);
        }
        parcel.writeStringList((List)this.awardTags);
    }
    
    public static final class a implements Parcelable$Creator<Award>
    {
        public final Object createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final AwardType value = AwardType.valueOf(parcel.readString());
            AwardSubType value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = AwardSubType.valueOf(parcel.readString());
            }
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = d.e((Class)Award.class, parcel, list, i, 1)) {}
            Boolean value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = (parcel.readInt() != 0);
            }
            final String string4 = parcel.readString();
            Long value4;
            if (parcel.readInt() == 0) {
                value4 = null;
            }
            else {
                value4 = parcel.readLong();
            }
            Long value5;
            if (parcel.readInt() == 0) {
                value5 = null;
            }
            else {
                value5 = parcel.readLong();
            }
            Long value6;
            if (parcel.readInt() == 0) {
                value6 = null;
            }
            else {
                value6 = parcel.readLong();
            }
            final String string5 = parcel.readString();
            final boolean b = parcel.readInt() != 0;
            final String string6 = parcel.readString();
            Long value7;
            if (parcel.readInt() == 0) {
                value7 = null;
            }
            else {
                value7 = parcel.readLong();
            }
            ArrayList list2;
            if (parcel.readInt() == 0) {
                list2 = null;
            }
            else {
                final int int2 = parcel.readInt();
                list2 = new ArrayList<GroupAwardTier>(int2);
                for (int j = 0; j != int2; j = a.c((Parcelable$Creator)GroupAwardTier.CREATOR, parcel, list2, j, 1)) {}
            }
            ArrayList list3;
            if (parcel.readInt() == 0) {
                list3 = null;
            }
            else {
                final int int3 = parcel.readInt();
                list3 = new ArrayList<CurrentUserAwarding>(int3);
                for (int k = 0; k != int3; k = a.c((Parcelable$Creator)CurrentUserAwarding.CREATOR, parcel, list3, k, 1)) {}
            }
            Long value8;
            if (parcel.readInt() == 0) {
                value8 = null;
            }
            else {
                value8 = parcel.readLong();
            }
            Long value9;
            if (parcel.readInt() == 0) {
                value9 = null;
            }
            else {
                value9 = parcel.readLong();
            }
            return new Award(string, value, value2, string2, string3, (List<ImageResolution>)list, value3, string4, value4, value5, value6, string5, b, string6, value7, list2, list3, value8, value9, parcel.createStringArrayList());
        }
        
        public final Object[] newArray(final int n) {
            return new Award[n];
        }
    }
}
