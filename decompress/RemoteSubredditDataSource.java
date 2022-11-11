// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.domain.model.SubredditActionSource;
import com.reddit.domain.model.SubredditAction;
import av2.o;
import av2.e;
import nf2.a;
import av2.c;
import com.reddit.structuredstyles.model.StructuredStyle;
import com.reddit.data.model.SubredditListingDataModel;
import av2.i;
import av2.u;
import java.util.Map;
import com.reddit.data.adapter.Enveloped;
import av2.s;
import com.reddit.data.adapter.ListingEnveloped;
import com.reddit.domain.model.Subreddit;
import com.reddit.domain.model.listing.Listing;
import av2.t;
import av2.f;
import java.util.Set;
import nf2.c0;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J\u001c\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0002H'J(\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010H'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0002H'JD\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00022\u0014\b\u0003\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00172\b\b\u0003\u0010\u001a\u001a\u00020\u00192\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002H'J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001e0\u0004H'J8\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H'J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H'J\u001c\u0010&\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0003\u0010%\u001a\u00020\u0002H'J\u001c\u0010'\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0003\u0010%\u001a\u00020\u0002H'J\"\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0003\u0010(\u001a\u00020\u0002H'¨\u0006*" }, d2 = { "Lcom/reddit/data/remote/RemoteSubredditDataSource;", "", "", "after", "Lnf2/c0;", "Lcom/reddit/domain/model/listing/Listing;", "Lcom/reddit/domain/model/Subreddit;", "getDefaultSubreddits", "", "makeFavorite", "subredditNames", "Lnf2/a;", "postFavorites", "subredditList", "Lcom/reddit/domain/model/SubredditAction;", "action", "Lcom/reddit/domain/model/SubredditActionSource;", "actionSource", "setSubscriptionState", "subredditName", "Lcom/reddit/structuredstyles/model/StructuredStyle;", "getSubredditStructuredStyle", "path", "", "parameters", "", "rawJson", "correlationId", "Lcom/reddit/data/model/SubredditListingDataModel;", "getSubredditListing", "", "getCrosspostableSubreddits", "city", "region", "country", "getSubredditOnboarding", "getTrendingSubreddits", "optin", "optInQuarantinedSubreddit", "optInGatedSubreddit", "quarantine_optin", "getQuarantinedSubreddit", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteSubredditDataSource
{
    @f("api/crosspostable_subreddits.json")
    c0<Set<String>> getCrosspostableSubreddits();
    
    @f("subreddits/default?limit=100")
    @ListingEnveloped
    c0<Listing<Subreddit>> getDefaultSubreddits(@t("after") final String p0);
    
    @f("r/{subreddit}/about.json")
    @Enveloped
    c0<Subreddit> getQuarantinedSubreddit(@s("subreddit") final String p0, @t("quarantine_optin") final String p1);
    
    @f("{subreddit_listing_path}")
    c0<SubredditListingDataModel> getSubredditListing(@s(encoded = true, value = "subreddit_listing_path") final String p0, @u final Map<String, String> p1, @t("raw_json") final int p2, @i("correlationId") final String p3);
    
    @f("/api/subreddit_onboarding")
    @ListingEnveloped
    c0<Listing<Subreddit>> getSubredditOnboarding(@t("city") final String p0, @t("region") final String p1, @t("country") final String p2);
    
    @f("api/v1/structured_styles/{subreddit}.json")
    @Enveloped
    c0<StructuredStyle> getSubredditStructuredStyle(@s("subreddit") final String p0);
    
    @f("/api/trending_subreddits_carousel")
    @ListingEnveloped
    c0<Listing<Subreddit>> getTrendingSubreddits();
    
    @e
    @o("api/gated_sr_optin")
    a optInGatedSubreddit(@c("sr_name") final String p0, @c("accept") final String p1);
    
    @e
    @o("api/quarantine_optin")
    a optInQuarantinedSubreddit(@c("sr_name") final String p0, @c("accept") final String p1);
    
    @e
    @o("api/favorite")
    a postFavorites(@c("make_favorite") final boolean p0, @c("sr_name") final String p1);
    
    @e
    @o("api/subscribe")
    a setSubscriptionState(@c("sr_name") final String p0, @c("action") final SubredditAction p1, @c("action_source") final SubredditActionSource p2);
}
