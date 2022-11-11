// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import com.reddit.fragment.MyRedditSubredditFragment;
import com.reddit.fragment.RedditorProfileInfo$d$a;
import com.reddit.fragment.RedditorProfileInfo$d;
import com.reddit.fragment.RedditorProfileInfo$c;
import kl0.h00;
import java.util.Iterator;
import com.reddit.fragment.RedditorProfileInfo$f;
import com.reddit.fragment.RedditorProfileInfo$b;
import com.reddit.fragment.RedditorProfileInfo$e;
import com.reddit.fragment.RedditorProfileInfo;
import com.reddit.queries.l9$c$a;
import com.reddit.queries.l9$c;
import java.util.Map;
import java.util.List;
import com.reddit.common.size.MediaSize;
import com.reddit.domain.model.UserSubreddit;
import com.reddit.type.PostType;
import com.reddit.common.subreddit.SubredditPostType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.fragment.RedditorProfileInfo$a;
import com.reddit.domain.model.CommunityHub;
import kotlin.collections.EmptyList;
import com.reddit.fragment.RedditorProfileInfo$g;
import ah2.c;
import com.reddit.domain.model.sociallink.SocialLink;
import java.util.ArrayList;
import qg2.m;
import ah2.f;
import com.reddit.domain.model.Account;
import com.reddit.queries.l9$b;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b" }, d2 = { "Lcom/reddit/data/model/GqlRedditorProfileToAccountDomainModelMapper;", "", "Lcom/reddit/queries/l9$b;", "profileData", "Lcom/reddit/domain/model/Account;", "account", "", "communityHubsEnabled", "mapToProfile", "<init>", "()V", "data-remote_release" }, k = 1, mv = { 1, 7, 1 })
public final class GqlRedditorProfileToAccountDomainModelMapper
{
    public static final GqlRedditorProfileToAccountDomainModelMapper INSTANCE;
    
    static {
        INSTANCE = new GqlRedditorProfileToAccountDomainModelMapper();
    }
    
    private GqlRedditorProfileToAccountDomainModelMapper() {
    }
    
    public final Account mapToProfile(final l9$b l9$b, final Account account, final boolean b) {
        f.f((Object)l9$b, "profileData");
        f.f((Object)account, "account");
        final l9$c a = l9$b.a;
        final UserSubreddit userSubreddit = null;
        final List list = null;
        RedditorProfileInfo a2 = null;
        Label_0048: {
            if (a != null) {
                final l9$c$a b2 = a.b;
                if (b2 != null) {
                    a2 = b2.a;
                    break Label_0048;
                }
            }
            a2 = null;
        }
        RedditorProfileInfo$e g;
        if (a2 != null) {
            g = a2.g;
        }
        else {
            g = null;
        }
        List d;
        if (g != null) {
            d = g.d;
        }
        else {
            d = null;
        }
        RedditorProfileInfo$b h;
        if (a2 != null) {
            h = a2.h;
        }
        else {
            h = null;
        }
        RedditorProfileInfo$f i;
        if (a2 != null) {
            i = a2.i;
        }
        else {
            i = null;
        }
        Object instance = null;
        Label_0278: {
            if (g != null) {
                final List e = g.e;
                if (e != null) {
                    final ArrayList list2 = new ArrayList<SocialLink>(m.P0((Iterable)e, 10));
                    int n = 0;
                    final Iterator iterator = e.iterator();
                    while (true) {
                        instance = list2;
                        if (!iterator.hasNext()) {
                            break Label_0278;
                        }
                        final Object next = iterator.next();
                        final int n2 = n + 1;
                        if (n < 0) {
                            c.x0();
                            throw null;
                        }
                        final h00 a3 = ((RedditorProfileInfo$g)next).b.a;
                        list2.add((Object)new SocialLink(a3.b, a3.f.toString(), n2, a3.d, a3.e, GqlRedditorProfileToAccountDomainModelMapperKt.toSocialLinkType(a3.c)));
                        n = n2;
                    }
                }
            }
            instance = EmptyList.INSTANCE;
        }
        Object o = null;
        Label_0424: {
            if (b) {
                if (a2 != null) {
                    final RedditorProfileInfo$c k = a2.k;
                    if (k != null) {
                        final List b3 = k.b;
                        if (b3 != null) {
                            final ArrayList list3 = new ArrayList<CommunityHub>(m.P0((Iterable)b3, 10));
                            for (final RedditorProfileInfo$a redditorProfileInfo$a : b3) {
                                CommunityHub mapToCommunityHub = null;
                                Label_0394: {
                                    if (redditorProfileInfo$a != null) {
                                        final RedditorProfileInfo$d b4 = redditorProfileInfo$a.b;
                                        if (b4 != null) {
                                            final RedditorProfileInfo$d$a b5 = b4.b;
                                            if (b5 != null) {
                                                final MyRedditSubredditFragment a4 = b5.a;
                                                if (a4 != null) {
                                                    mapToCommunityHub = CommunityHubMapper.INSTANCE.mapToCommunityHub(a4);
                                                    break Label_0394;
                                                }
                                            }
                                        }
                                    }
                                    mapToCommunityHub = null;
                                }
                                list3.add(mapToCommunityHub);
                            }
                            o = CollectionsKt___CollectionsKt.n1((Iterable)list3);
                            break Label_0424;
                        }
                    }
                }
                o = EmptyList.INSTANCE;
            }
            else {
                o = EmptyList.INSTANCE;
            }
        }
        final String id = account.getId();
        final String username = account.getUsername();
        final long createdUtc = account.getCreatedUtc();
        final boolean employee = account.isEmployee();
        final boolean friend = account.isFriend();
        final boolean hideFromRobots = account.getHideFromRobots();
        int totalKarma;
        if (h != null) {
            totalKarma = (int)h.b;
        }
        else {
            totalKarma = account.getTotalKarma();
        }
        int linkKarma;
        if (h != null) {
            linkKarma = (int)h.e;
        }
        else {
            linkKarma = account.getLinkKarma();
        }
        int commentKarma;
        if (h != null) {
            commentKarma = (int)h.f;
        }
        else {
            commentKarma = account.getCommentKarma();
        }
        int awarderKarma;
        if (h != null) {
            awarderKarma = (int)h.c;
        }
        else {
            awarderKarma = account.getAwarderKarma();
        }
        int awardeeKarma;
        if (h != null) {
            awardeeKarma = (int)h.d;
        }
        else {
            awardeeKarma = account.getAwardeeKarma();
        }
        final boolean hasPremium = account.getHasPremium();
        final boolean premiumSubscriber = account.isPremiumSubscriber();
        final Long premiumExpirationUtcSeconds = account.getPremiumExpirationUtcSeconds();
        final Long premiumSinceUtcSeconds = account.getPremiumSinceUtcSeconds();
        final boolean mod = account.isMod();
        final Boolean hasVerifiedEmail = account.getHasVerifiedEmail();
        final UserSubreddit subreddit = account.getSubreddit();
        UserSubreddit copy$default = userSubreddit;
        if (subreddit != null) {
            List<SubredditPostType> list4 = list;
            if (d != null) {
                final ArrayList<SubredditPostType> list5 = new ArrayList<SubredditPostType>();
                final Iterator iterator3 = d.iterator();
                while (true) {
                    list4 = list5;
                    if (!iterator3.hasNext()) {
                        break;
                    }
                    final SubredditPostType access$toDomain = GqlRedditorProfileToAccountDomainModelMapperKt.access$toDomain((PostType)iterator3.next());
                    if (access$toDomain == null) {
                        continue;
                    }
                    list5.add(access$toDomain);
                }
            }
            copy$default = UserSubreddit.copy$default(subreddit, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, false, null, null, null, null, null, false, null, null, list4, 16777215, null);
        }
        final String iconUrl = account.getIconUrl();
        final boolean hasBeenVisited = account.getHasBeenVisited();
        final String email = account.getEmail();
        final Map<String, Object> features = account.getFeatures();
        final boolean suspended = account.isSuspended();
        final Integer suspensionExpirationUtc = account.getSuspensionExpirationUtc();
        final boolean forcePasswordReset = account.getForcePasswordReset();
        final int inboxCount = account.getInboxCount();
        final boolean hasMail = account.getHasMail();
        final boolean hasModMail = account.getHasModMail();
        final int coins = account.getCoins();
        final Boolean showMyActiveCommunities = account.getShowMyActiveCommunities();
        final boolean hideAds = account.getHideAds();
        final boolean outboundClickTracking = account.getOutboundClickTracking();
        final boolean canCreateSubreddit = account.getCanCreateSubreddit();
        final boolean canEditName = account.getCanEditName();
        final List<String> linkedIdentities = account.getLinkedIdentities();
        final boolean hasPasswordSet = account.getHasPasswordSet();
        final Boolean acceptChats = account.getAcceptChats();
        final Boolean acceptPrivateMessages = account.getAcceptPrivateMessages();
        String s = null;
        Label_0889: {
            if (i != null) {
                final Object b6 = i.b;
                if (b6 != null && (s = b6.toString()) != null) {
                    break Label_0889;
                }
            }
            s = account.getSnoovatarImg();
        }
        boolean b7;
        if (a2 != null) {
            b7 = a2.j;
        }
        else {
            b7 = account.getAcceptFollowers();
        }
        return new Account(id, username, createdUtc, employee, friend, hideFromRobots, totalKarma, linkKarma, commentKarma, awarderKarma, awardeeKarma, hasPremium, premiumSubscriber, premiumExpirationUtcSeconds, premiumSinceUtcSeconds, mod, hasVerifiedEmail, copy$default, iconUrl, acceptChats, acceptPrivateMessages, b7, hasBeenVisited, email, features, suspended, suspensionExpirationUtc, forcePasswordReset, inboxCount, hasMail, hasModMail, coins, showMyActiveCommunities, hideAds, outboundClickTracking, canCreateSubreddit, canEditName, linkedIdentities, hasPasswordSet, s, (List<SocialLink>)instance, (List<CommunityHub>)o);
    }
}
