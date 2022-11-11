// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.domain.model.listing.RemovalReason;
import com.reddit.domain.model.listing.ContentRemovalMessage;
import av2.j;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.listing.model.sort.SortType;
import com.reddit.domain.model.LinkTitleResponse;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.HistorySortType;
import com.reddit.domain.model.LinkDuplicates;
import av2.f;
import com.reddit.domain.model.discovery.DiscoveryUnitListing;
import av2.i;
import av2.u;
import java.util.Map;
import av2.s;
import com.reddit.data.adapter.ListingEnveloped;
import com.reddit.ads.commentspage.CommentsPageEnveloped;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.listing.Listing;
import nf2.a;
import av2.t;
import av2.o;
import av2.e;
import com.reddit.domain.model.CreateEditLinkResponse;
import nf2.c0;
import av2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'J\u0012\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J¡\u0001\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\b\b\u0003\u0010\u0011\u001a\u00020\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0016\u001a\u00020\u000b2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0003\u0010\u0019\u001a\u00020\u00022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u001d\u001a\u00020\u00022\u0014\b\u0003\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001eH'¢\u0006\u0004\b#\u0010$J\u009a\u0001\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\b\b\u0001\u0010%\u001a\u00020\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0003\u0010\u0016\u001a\u00020\u000b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001e2\b\b\u0003\u0010\u001d\u001a\u00020\u00022\b\b\u0003\u0010&\u001a\u00020\u0002H'J\u0090\u0001\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\b\b\u0001\u0010(\u001a\u00020\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0003\u0010\u0016\u001a\u00020\u000b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001e2\b\b\u0003\u0010\u001d\u001a\u00020\u0002H'Jx\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\b\b\u0001\u0010*\u001a\u00020\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0003\u0010\u0016\u001a\u00020\u000b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u001d\u001a\u00020\u00022\b\b\u0003\u0010,\u001a\u00020\u0002H'JB\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\b\b\u0001\u0010.\u001a\u00020\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002H'J\u001e\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\b\b\u0001\u00100\u001a\u00020\u0002H'J:\u00104\u001a\b\u0012\u0004\u0012\u0002030 2\b\b\u0001\u0010.\u001a\u00020\u00022\u0014\b\u0003\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001e2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0002H'JV\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\b\b\u0001\u0010*\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u00102\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0003\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001eH'J4\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\b\b\u0001\u0010*\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u0002062\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002H'JB\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\b\b\u0003\u00109\u001a\u0002082\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u0002H'JQ\u0010>\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\b\u0003\u00109\u001a\u0002082\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010=\u001a\u000208H§@\u00f8\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001c\u0010B\u001a\u00020\u00042\b\b\u0001\u0010@\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u000208H'J\u0012\u0010C\u001a\u00020\u00042\b\b\u0001\u0010@\u001a\u00020\u0002H'J\u0012\u0010D\u001a\u00020\u00042\b\b\u0001\u0010@\u001a\u00020\u0002H'J,\u0010H\u001a\b\u0012\u0004\u0012\u00020G0 2\b\b\u0001\u0010@\u001a\u00020\u00022\b\b\u0001\u0010E\u001a\u00020\u00022\b\b\u0003\u0010F\u001a\u00020\u0002H'J,\u0010M\u001a\b\u0012\u0004\u0012\u00020L0 2\b\b\u0001\u0010I\u001a\u00020\u00022\b\b\u0001\u0010J\u001a\u00020\u00022\b\b\u0001\u0010K\u001a\u00020\u0002H'J\u001c\u0010N\u001a\u00020\u00042\b\b\u0001\u0010@\u001a\u00020\u00022\b\b\u0001\u0010N\u001a\u00020\u000bH'J\u0012\u0010Q\u001a\u00020\u00042\b\b\u0001\u0010P\u001a\u00020OH'J\u0012\u0010S\u001a\u00020\u00042\b\b\u0001\u0010P\u001a\u00020RH'J\u001d\u0010V\u001a\u00020U2\b\b\u0001\u0010T\u001a\u00020\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\bV\u0010W\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X" }, d2 = { "Lcom/reddit/data/remote/RemoteLinkDataSource;", "", "", "id", "Lnf2/a;", "modMarkNsfw", "modUnMarkNsfw", "modMarkSpoiler", "modUnMarkSpoiler", "modLockComments", "modUnlockComments", "", "spam", "modRemove", "modUncollapseComment", "modApprove", "Lcom/reddit/listing/model/sort/SortType;", "sort", "Lcom/reddit/listing/model/sort/SortTimeFrame;", "sortTimeFrame", "after", "dist", "withAds", "Lcom/reddit/listing/common/ListingViewMode;", "layout", "geoFilter", "", "userInitiated", "ad", "rtjson", "", "headers", "Lnf2/c0;", "Lcom/reddit/domain/model/listing/Listing;", "Lcom/reddit/domain/model/Link;", "getPopularLinks", "(Lcom/reddit/listing/model/sort/SortType;Lcom/reddit/listing/model/sort/SortTimeFrame;Ljava/lang/String;Ljava/lang/String;ZLcom/reddit/listing/common/ListingViewMode;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lnf2/c0;", "subreddit", "quarantineOptin", "getSubredditLinks", "multiredditPath", "getMultiredditLinks", "username", "correlationId", "type", "getSavedPosts", "path", "getLinkListing", "kindWithIds", "getLinksByIds", "options", "Lcom/reddit/domain/model/discovery/DiscoveryUnitListing;", "getDiscoveryUnitListing", "getUserSubmittedPosts", "Lcom/reddit/listing/model/sort/HistorySortType;", "getHistoryListing", "", "count", "linkKindWithId", "forcedAd", "getCommentPageAdsListingLegacy", "isFullBleedPlayer", "getCommentPageAdsListing", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILtg2/c;)Ljava/lang/Object;", "kindWithId", "direction", "vote", "save", "unsave", "text", "apiType", "Lcom/reddit/domain/model/CreateEditLinkResponse;", "edit", "prefixedSubredditName", "linkId", "linkLastPathSegment", "Lcom/reddit/domain/model/LinkDuplicates;", "getDuplicates", "follow", "Lcom/reddit/domain/model/listing/ContentRemovalMessage;", "model", "sendRemovalMessage", "Lcom/reddit/domain/model/listing/RemovalReason;", "sendRemovalReason", "url", "Lcom/reddit/domain/model/LinkTitleResponse;", "getLinkTitle", "(Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteLinkDataSource
{
    @e
    @o("api/editusertext")
    c0<CreateEditLinkResponse> edit(@c("thing_id") final String p0, @c("text") final String p1, @c("api_type") final String p2);
    
    @o("/api/follow_post")
    a follow(@t("fullname") final String p0, @t("follow") final boolean p1);
    
    @e
    @o("api/comments_page_ads")
    @CommentsPageEnveloped
    @ListingEnveloped
    Object getCommentPageAdsListing(@c("count") final int p0, @c("r") final String p1, @c("post_id") final String p2, @c("comments_ad") final String p3, @c("is_full_bleed") final int p4, final tg2.c<? super Listing<Link>> p5);
    
    @e
    @o("api/comments_page_ads")
    @CommentsPageEnveloped
    @ListingEnveloped
    c0<Listing<Link>> getCommentPageAdsListingLegacy(@c("count") final int p0, @c("r") final String p1, @c("post_id") final String p2, @c("comments_ad") final String p3);
    
    @f("{path}")
    c0<DiscoveryUnitListing> getDiscoveryUnitListing(@s(encoded = true, value = "path") final String p0, @u final Map<String, String> p1, @i("correlationId") final String p2);
    
    @f("/{name}/duplicates/{link_id}/{path_segment}?limit=100&sort=new")
    c0<LinkDuplicates> getDuplicates(@s("name") final String p0, @s("link_id") final String p1, @s("path_segment") final String p2);
    
    @f("user/{username}/{type}")
    @ListingEnveloped
    c0<Listing<Link>> getHistoryListing(@s("username") final String p0, @s("type") final HistorySortType p1, @t("after") final String p2);
    
    @f("{link_listing_path}/{sort}")
    @ListingEnveloped
    c0<Listing<Link>> getLinkListing(@s(encoded = true, value = "link_listing_path") final String p0, @s("sort") final String p1, @t("t") final SortTimeFrame p2, @t("after") final String p3);
    
    @e
    @o("/api/fetch_title")
    Object getLinkTitle(@c("url") final String p0, final tg2.c<? super LinkTitleResponse> p1);
    
    @f("by_id/{kindWithIds}")
    @ListingEnveloped
    c0<Listing<Link>> getLinksByIds(@s("kindWithIds") final String p0);
    
    @f("{multiredditpath}{sort}")
    @ListingEnveloped
    c0<Listing<Link>> getMultiredditLinks(@s(encoded = true, value = "multiredditpath") final String p0, @s("sort") final SortType p1, @t("t") final SortTimeFrame p2, @t("after") final String p3, @t("dist") final String p4, @t("layout") final ListingViewMode p5, @t("withAds") final boolean p6, @t("ad") final String p7, @j final Map<String, String> p8, @t("rtj") final String p9);
    
    @f("r/popular/{sort}")
    @ListingEnveloped
    c0<Listing<Link>> getPopularLinks(@s("sort") final SortType p0, @t("t") final SortTimeFrame p1, @t("after") final String p2, @t("dist") final String p3, @t("withAds") final boolean p4, @t("layout") final ListingViewMode p5, @t("geo_filter") final String p6, @t("user_initiated") final Long p7, @t("ad") final String p8, @t("rtj") final String p9, @j final Map<String, String> p10);
    
    @f("user/{username}/saved")
    @ListingEnveloped
    c0<Listing<Link>> getSavedPosts(@s("username") final String p0, @t("after") final String p1, @t("dist") final String p2, @t("layout") final ListingViewMode p3, @t("withAds") final boolean p4, @t("ad") final String p5, @i("correlationId") final String p6, @t("rtj") final String p7, @t("type") final String p8);
    
    @f("r/{subreddit}/{sort}")
    @ListingEnveloped
    c0<Listing<Link>> getSubredditLinks(@s("subreddit") final String p0, @s("sort") final SortType p1, @t("t") final SortTimeFrame p2, @t("after") final String p3, @t("dist") final String p4, @t("layout") final ListingViewMode p5, @t("withAds") final boolean p6, @t("ad") final String p7, @j final Map<String, String> p8, @t("rtj") final String p9, @t("quarantine_optin") final String p10);
    
    @f("user/{username}/submitted/{sort}")
    @ListingEnveloped
    c0<Listing<Link>> getUserSubmittedPosts(@s("username") final String p0, @s("sort") final SortType p1, @t("after") final String p2, @t("t") final SortTimeFrame p3, @j final Map<String, String> p4);
    
    @o("/api/approve")
    a modApprove(@t("id") final String p0);
    
    @o("/api/lock")
    a modLockComments(@t("id") final String p0);
    
    @o("api/marknsfw")
    a modMarkNsfw(@t("id") final String p0);
    
    @o("api/spoiler")
    a modMarkSpoiler(@t("id") final String p0);
    
    @o("/api/remove")
    a modRemove(@t("id") final String p0, @t("spam") final boolean p1);
    
    @o("api/unmarknsfw")
    a modUnMarkNsfw(@t("id") final String p0);
    
    @o("/api/unspoiler")
    a modUnMarkSpoiler(@t("id") final String p0);
    
    @o("/api/show_comment")
    a modUncollapseComment(@t("id") final String p0);
    
    @o("/api/unlock")
    a modUnlockComments(@t("id") final String p0);
    
    @o("/api/save")
    a save(@t("id") final String p0);
    
    @o("/api/v1/modactions/removal_link_message")
    a sendRemovalMessage(@av2.a final ContentRemovalMessage p0);
    
    @o("/api/v1/modactions/removal_reasons")
    a sendRemovalReason(@av2.a final RemovalReason p0);
    
    @o("/api/unsave")
    a unsave(@t("id") final String p0);
    
    @e
    @o("api/vote")
    a vote(@c("id") final String p0, @c("dir") final int p1);
}
