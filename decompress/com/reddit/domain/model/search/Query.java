// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import android.os.Parcel;
import ag0.a;
import com.reddit.domain.model.Subreddit;
import com.reddit.domain.model.Account;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0001OB\u00c3\u0001\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bM\u0010NJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b\n\u0010\tJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b\r\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0004\b\u0013\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u00cc\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u0002H\u00d6\u0001J\t\u0010)\u001a\u00020(H\u00d6\u0001J\u0013\u0010,\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010-\u001a\u00020(H\u00d6\u0001J\u0019\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020(H\u00d6\u0001R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b8\u00105R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u00109\u001a\u0004\b:\u0010\tR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\b;\u0010\tR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u00103\u001a\u0004\b<\u00105R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u00103\u001a\u0004\b=\u00105R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u00109\u001a\u0004\b>\u0010\tR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u00103\u001a\u0004\b?\u00105R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u00103\u001a\u0004\b@\u00105R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u00103\u001a\u0004\bA\u00105R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u00103\u001a\u0004\bB\u00105R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u00103\u001a\u0004\bC\u00105R\u0019\u0010#\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u00109\u001a\u0004\bD\u0010\tR\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\bE\u00105R\u0011\u0010F\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010H\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bH\u0010GR\u0011\u0010I\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0011\u0010K\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bJ\u0010GR\u0011\u0010L\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bL\u0010G¨\u0006P" }, d2 = { "Lcom/reddit/domain/model/search/Query;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "displayQuery", "query", "subredditId", "subreddit", "subredditQuarantined", "subredditNsfw", "userSubreddit", "userSubredditKindWithId", "userSubredditNsfw", "flairText", "flairRichText", "flairTextColor", "flairBackgroundColorHex", "flairApiText", "safeSearch", "iconUrl", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/reddit/domain/model/search/Query;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getDisplayQuery", "()Ljava/lang/String;", "getQuery", "getSubredditId", "getSubreddit", "Ljava/lang/Boolean;", "getSubredditQuarantined", "getSubredditNsfw", "getUserSubreddit", "getUserSubredditKindWithId", "getUserSubredditNsfw", "getFlairText", "getFlairRichText", "getFlairTextColor", "getFlairBackgroundColorHex", "getFlairApiText", "getSafeSearch", "getIconUrl", "isUserSubredditOnly", "()Z", "isSubredditOnly", "isQueryTextOnly", "getHasFlair", "hasFlair", "isScoped", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Query implements Parcelable
{
    public static final Parcelable$Creator<Query> CREATOR;
    public static final Query.Query$Companion Companion;
    private final String displayQuery;
    private final String flairApiText;
    private final String flairBackgroundColorHex;
    private final String flairRichText;
    private final String flairText;
    private final String flairTextColor;
    private final String iconUrl;
    private final String query;
    private final Boolean safeSearch;
    private final String subreddit;
    private final String subredditId;
    private final Boolean subredditNsfw;
    private final Boolean subredditQuarantined;
    private final String userSubreddit;
    private final String userSubredditKindWithId;
    private final Boolean userSubredditNsfw;
    
    static {
        Companion = new Query.Query$Companion((DefaultConstructorMarker)null);
        CREATOR = (Parcelable$Creator)new Query$Creator();
    }
    
    public Query() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }
    
    public Query(final String displayQuery, final String query, final String subredditId, final String subreddit, final Boolean subredditQuarantined, final Boolean subredditNsfw, final String userSubreddit, final String userSubredditKindWithId, final Boolean userSubredditNsfw, final String flairText, final String flairRichText, final String flairTextColor, final String flairBackgroundColorHex, final String flairApiText, final Boolean safeSearch, final String iconUrl) {
        f.f((Object)displayQuery, "displayQuery");
        f.f((Object)query, "query");
        this.displayQuery = displayQuery;
        this.query = query;
        this.subredditId = subredditId;
        this.subreddit = subreddit;
        this.subredditQuarantined = subredditQuarantined;
        this.subredditNsfw = subredditNsfw;
        this.userSubreddit = userSubreddit;
        this.userSubredditKindWithId = userSubredditKindWithId;
        this.userSubredditNsfw = userSubredditNsfw;
        this.flairText = flairText;
        this.flairRichText = flairRichText;
        this.flairTextColor = flairTextColor;
        this.flairBackgroundColorHex = flairBackgroundColorHex;
        this.flairApiText = flairApiText;
        this.safeSearch = safeSearch;
        this.iconUrl = iconUrl;
    }
    
    public static final Query from(final Account account) {
        return Query.Companion.from(account);
    }
    
    public static final Query from(final Subreddit subreddit) {
        return Query.Companion.from(subreddit);
    }
    
    public static final Query from(final String s) {
        return Query.Companion.from(s);
    }
    
    public final String component1() {
        return this.displayQuery;
    }
    
    public final String component10() {
        return this.flairText;
    }
    
    public final String component11() {
        return this.flairRichText;
    }
    
    public final String component12() {
        return this.flairTextColor;
    }
    
    public final String component13() {
        return this.flairBackgroundColorHex;
    }
    
    public final String component14() {
        return this.flairApiText;
    }
    
    public final Boolean component15() {
        return this.safeSearch;
    }
    
    public final String component16() {
        return this.iconUrl;
    }
    
    public final String component2() {
        return this.query;
    }
    
    public final String component3() {
        return this.subredditId;
    }
    
    public final String component4() {
        return this.subreddit;
    }
    
    public final Boolean component5() {
        return this.subredditQuarantined;
    }
    
    public final Boolean component6() {
        return this.subredditNsfw;
    }
    
    public final String component7() {
        return this.userSubreddit;
    }
    
    public final String component8() {
        return this.userSubredditKindWithId;
    }
    
    public final Boolean component9() {
        return this.userSubredditNsfw;
    }
    
    public final Query copy(final String s, final String s2, final String s3, final String s4, final Boolean b, final Boolean b2, final String s5, final String s6, final Boolean b3, final String s7, final String s8, final String s9, final String s10, final String s11, final Boolean b4, final String s12) {
        f.f((Object)s, "displayQuery");
        f.f((Object)s2, "query");
        return new Query(s, s2, s3, s4, b, b2, s5, s6, b3, s7, s8, s9, s10, s11, b4, s12);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Query)) {
            return false;
        }
        final Query query = (Query)o;
        return f.a((Object)this.displayQuery, (Object)query.displayQuery) && f.a((Object)this.query, (Object)query.query) && f.a((Object)this.subredditId, (Object)query.subredditId) && f.a((Object)this.subreddit, (Object)query.subreddit) && f.a((Object)this.subredditQuarantined, (Object)query.subredditQuarantined) && f.a((Object)this.subredditNsfw, (Object)query.subredditNsfw) && f.a((Object)this.userSubreddit, (Object)query.userSubreddit) && f.a((Object)this.userSubredditKindWithId, (Object)query.userSubredditKindWithId) && f.a((Object)this.userSubredditNsfw, (Object)query.userSubredditNsfw) && f.a((Object)this.flairText, (Object)query.flairText) && f.a((Object)this.flairRichText, (Object)query.flairRichText) && f.a((Object)this.flairTextColor, (Object)query.flairTextColor) && f.a((Object)this.flairBackgroundColorHex, (Object)query.flairBackgroundColorHex) && f.a((Object)this.flairApiText, (Object)query.flairApiText) && f.a((Object)this.safeSearch, (Object)query.safeSearch) && f.a((Object)this.iconUrl, (Object)query.iconUrl);
    }
    
    public final String getDisplayQuery() {
        return this.displayQuery;
    }
    
    public final String getFlairApiText() {
        return this.flairApiText;
    }
    
    public final String getFlairBackgroundColorHex() {
        return this.flairBackgroundColorHex;
    }
    
    public final String getFlairRichText() {
        return this.flairRichText;
    }
    
    public final String getFlairText() {
        return this.flairText;
    }
    
    public final String getFlairTextColor() {
        return this.flairTextColor;
    }
    
    public final boolean getHasFlair() {
        final String flairText = this.flairText;
        return (flairText == null || flairText.length() == 0) ^ true;
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public final String getQuery() {
        return this.query;
    }
    
    public final Boolean getSafeSearch() {
        return this.safeSearch;
    }
    
    public final String getSubreddit() {
        return this.subreddit;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    public final Boolean getSubredditNsfw() {
        return this.subredditNsfw;
    }
    
    public final Boolean getSubredditQuarantined() {
        return this.subredditQuarantined;
    }
    
    public final String getUserSubreddit() {
        return this.userSubreddit;
    }
    
    public final String getUserSubredditKindWithId() {
        return this.userSubredditKindWithId;
    }
    
    public final Boolean getUserSubredditNsfw() {
        return this.userSubredditNsfw;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.query, this.displayQuery.hashCode() * 31, 31);
        final String subredditId = this.subredditId;
        int hashCode = 0;
        int hashCode2;
        if (subredditId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subredditId.hashCode();
        }
        final String subreddit = this.subreddit;
        int hashCode3;
        if (subreddit == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = subreddit.hashCode();
        }
        final Boolean subredditQuarantined = this.subredditQuarantined;
        int hashCode4;
        if (subredditQuarantined == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = subredditQuarantined.hashCode();
        }
        final Boolean subredditNsfw = this.subredditNsfw;
        int hashCode5;
        if (subredditNsfw == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = subredditNsfw.hashCode();
        }
        final String userSubreddit = this.userSubreddit;
        int hashCode6;
        if (userSubreddit == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = userSubreddit.hashCode();
        }
        final String userSubredditKindWithId = this.userSubredditKindWithId;
        int hashCode7;
        if (userSubredditKindWithId == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = userSubredditKindWithId.hashCode();
        }
        final Boolean userSubredditNsfw = this.userSubredditNsfw;
        int hashCode8;
        if (userSubredditNsfw == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = userSubredditNsfw.hashCode();
        }
        final String flairText = this.flairText;
        int hashCode9;
        if (flairText == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = flairText.hashCode();
        }
        final String flairRichText = this.flairRichText;
        int hashCode10;
        if (flairRichText == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = flairRichText.hashCode();
        }
        final String flairTextColor = this.flairTextColor;
        int hashCode11;
        if (flairTextColor == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = flairTextColor.hashCode();
        }
        final String flairBackgroundColorHex = this.flairBackgroundColorHex;
        int hashCode12;
        if (flairBackgroundColorHex == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = flairBackgroundColorHex.hashCode();
        }
        final String flairApiText = this.flairApiText;
        int hashCode13;
        if (flairApiText == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = flairApiText.hashCode();
        }
        final Boolean safeSearch = this.safeSearch;
        int hashCode14;
        if (safeSearch == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = safeSearch.hashCode();
        }
        final String iconUrl = this.iconUrl;
        if (iconUrl != null) {
            hashCode = iconUrl.hashCode();
        }
        return (((((((((((((f + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode;
    }
    
    public final boolean isQueryTextOnly() {
        return this.subreddit == null && this.userSubreddit == null && this.flairText == null;
    }
    
    public final boolean isScoped() {
        return this.isSubredditOnly() || this.getHasFlair() || this.subreddit != null;
    }
    
    public final boolean isSubredditOnly() {
        final String subreddit = this.subreddit;
        boolean b = true;
        if (subreddit == null || this.userSubreddit != null || this.query.length() != 0 || this.flairText != null) {
            b = false;
        }
        return b;
    }
    
    public final boolean isUserSubredditOnly() {
        final String userSubreddit = this.userSubreddit;
        boolean b = true;
        if (userSubreddit == null || this.subreddit != null || this.query.length() != 0 || this.flairText != null) {
            b = false;
        }
        return b;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Query(displayQuery=");
        k.append(this.displayQuery);
        k.append(", query=");
        k.append(this.query);
        k.append(", subredditId=");
        k.append(this.subredditId);
        k.append(", subreddit=");
        k.append(this.subreddit);
        k.append(", subredditQuarantined=");
        k.append(this.subredditQuarantined);
        k.append(", subredditNsfw=");
        k.append(this.subredditNsfw);
        k.append(", userSubreddit=");
        k.append(this.userSubreddit);
        k.append(", userSubredditKindWithId=");
        k.append(this.userSubredditKindWithId);
        k.append(", userSubredditNsfw=");
        k.append(this.userSubredditNsfw);
        k.append(", flairText=");
        k.append(this.flairText);
        k.append(", flairRichText=");
        k.append(this.flairRichText);
        k.append(", flairTextColor=");
        k.append(this.flairTextColor);
        k.append(", flairBackgroundColorHex=");
        k.append(this.flairBackgroundColorHex);
        k.append(", flairApiText=");
        k.append(this.flairApiText);
        k.append(", safeSearch=");
        k.append(this.safeSearch);
        k.append(", iconUrl=");
        return b.k(k, this.iconUrl, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.displayQuery);
        parcel.writeString(this.query);
        parcel.writeString(this.subredditId);
        parcel.writeString(this.subreddit);
        final Boolean subredditQuarantined = this.subredditQuarantined;
        if (subredditQuarantined == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, subredditQuarantined);
        }
        final Boolean subredditNsfw = this.subredditNsfw;
        if (subredditNsfw == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, subredditNsfw);
        }
        parcel.writeString(this.userSubreddit);
        parcel.writeString(this.userSubredditKindWithId);
        final Boolean userSubredditNsfw = this.userSubredditNsfw;
        if (userSubredditNsfw == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, userSubredditNsfw);
        }
        parcel.writeString(this.flairText);
        parcel.writeString(this.flairRichText);
        parcel.writeString(this.flairTextColor);
        parcel.writeString(this.flairBackgroundColorHex);
        parcel.writeString(this.flairApiText);
        final Boolean safeSearch = this.safeSearch;
        if (safeSearch == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, safeSearch);
        }
        parcel.writeString(this.iconUrl);
    }
}
