// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.models;

import java.util.List;
import ij.a;

public class Tweet implements Identifiable
{
    public static final long INVALID_ID = -1L;
    @a("card")
    public final Card card;
    @a("coordinates")
    public final Coordinates coordinates;
    @a("created_at")
    public final String createdAt;
    @a("current_user_retweet")
    public final Object currentUserRetweet;
    @a("display_text_range")
    public final List<Integer> displayTextRange;
    @a("entities")
    public final TweetEntities entities;
    @a("extended_entities")
    public final TweetEntities extendedEntities;
    @a("favorite_count")
    public final Integer favoriteCount;
    @a("favorited")
    public final boolean favorited;
    @a("filter_level")
    public final String filterLevel;
    @a("id")
    public final long id;
    @a("id_str")
    public final String idStr;
    @a("in_reply_to_screen_name")
    public final String inReplyToScreenName;
    @a("in_reply_to_status_id")
    public final long inReplyToStatusId;
    @a("in_reply_to_status_id_str")
    public final String inReplyToStatusIdStr;
    @a("in_reply_to_user_id")
    public final long inReplyToUserId;
    @a("in_reply_to_user_id_str")
    public final String inReplyToUserIdStr;
    @a("lang")
    public final String lang;
    @a("place")
    public final Place place;
    @a("possibly_sensitive")
    public final boolean possiblySensitive;
    @a("quoted_status")
    public final Tweet quotedStatus;
    @a("quoted_status_id")
    public final long quotedStatusId;
    @a("quoted_status_id_str")
    public final String quotedStatusIdStr;
    @a("retweet_count")
    public final int retweetCount;
    @a("retweeted")
    public final boolean retweeted;
    @a("retweeted_status")
    public final Tweet retweetedStatus;
    @a("scopes")
    public final Object scopes;
    @a("source")
    public final String source;
    @a(alternate = { "full_text" }, value = "text")
    public final String text;
    @a("truncated")
    public final boolean truncated;
    @a("user")
    public final User user;
    @a("withheld_copyright")
    public final boolean withheldCopyright;
    @a("withheld_in_countries")
    public final List<String> withheldInCountries;
    @a("withheld_scope")
    public final String withheldScope;
    
    private Tweet() {
        final TweetEntities empty = TweetEntities.EMPTY;
        this(null, null, null, empty, empty, 0, false, null, 0L, "0", null, 0L, "0", 0L, "0", null, null, false, null, 0L, "0", null, 0, false, null, null, null, null, false, null, false, null, null, null);
    }
    
    public Tweet(final Coordinates coordinates, final String createdAt, final Object currentUserRetweet, TweetEntities empty, TweetEntities empty2, final Integer favoriteCount, final boolean favorited, final String filterLevel, final long id, final String idStr, final String inReplyToScreenName, final long inReplyToStatusId, final String inReplyToStatusIdStr, final long inReplyToUserId, final String inReplyToUserIdStr, final String lang, final Place place, final boolean possiblySensitive, final Object scopes, final long quotedStatusId, final String quotedStatusIdStr, final Tweet quotedStatus, final int retweetCount, final boolean retweeted, final Tweet retweetedStatus, final String source, final String text, final List<Integer> list, final boolean truncated, final User user, final boolean withheldCopyright, final List<String> list2, final String withheldScope, final Card card) {
        this.coordinates = coordinates;
        this.createdAt = createdAt;
        this.currentUserRetweet = currentUserRetweet;
        if (empty == null) {
            empty = TweetEntities.EMPTY;
        }
        this.entities = empty;
        if (empty2 == null) {
            empty2 = TweetEntities.EMPTY;
        }
        this.extendedEntities = empty2;
        this.favoriteCount = favoriteCount;
        this.favorited = favorited;
        this.filterLevel = filterLevel;
        this.id = id;
        this.idStr = idStr;
        this.inReplyToScreenName = inReplyToScreenName;
        this.inReplyToStatusId = inReplyToStatusId;
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
        this.inReplyToUserId = inReplyToUserId;
        this.inReplyToUserIdStr = inReplyToUserIdStr;
        this.lang = lang;
        this.place = place;
        this.possiblySensitive = possiblySensitive;
        this.scopes = scopes;
        this.quotedStatusId = quotedStatusId;
        this.quotedStatusIdStr = quotedStatusIdStr;
        this.quotedStatus = quotedStatus;
        this.retweetCount = retweetCount;
        this.retweeted = retweeted;
        this.retweetedStatus = retweetedStatus;
        this.source = source;
        this.text = text;
        this.displayTextRange = ModelUtils.getSafeList((List)list);
        this.truncated = truncated;
        this.user = user;
        this.withheldCopyright = withheldCopyright;
        this.withheldInCountries = ModelUtils.getSafeList((List)list2);
        this.withheldScope = withheldScope;
        this.card = card;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = false;
        if (o == null) {
            return false;
        }
        if (!(o instanceof Tweet)) {
            return false;
        }
        if (this.id == ((Tweet)o).id) {
            b = true;
        }
        return b;
    }
    
    public long getId() {
        return this.id;
    }
    
    @Override
    public int hashCode() {
        return (int)this.id;
    }
}
