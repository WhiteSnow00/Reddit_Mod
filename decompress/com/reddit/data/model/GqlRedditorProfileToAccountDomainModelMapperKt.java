// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import kotlin.NoWhenBranchMatchedException;
import ah2.f;
import com.reddit.type.SocialLinkType;
import com.reddit.common.subreddit.SubredditPostType;
import com.reddit.type.PostType;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u0004*\u00060\u0005j\u0002`\u0006*\n\u0010\u0007\"\u00020\u00052\u00020\u0005¨\u0006\b" }, d2 = { "toDomain", "Lcom/reddit/common/subreddit/SubredditPostType;", "Lcom/reddit/type/PostType;", "toSocialLinkType", "Lcom/reddit/domain/model/sociallink/SocialLinkType;", "Lcom/reddit/type/SocialLinkType;", "Lcom/reddit/data/model/GQLSocialLinkType;", "GQLSocialLinkType", "data-remote_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class GqlRedditorProfileToAccountDomainModelMapperKt
{
    private static final SubredditPostType toDomain(final PostType postType) {
        SubredditPostType subredditPostType = null;
        switch (WhenMappings.$EnumSwitchMapping$0[((Enum)postType).ordinal()]) {
            default: {
                subredditPostType = null;
                break;
            }
            case 7: {
                subredditPostType = SubredditPostType.TALK;
                break;
            }
            case 6: {
                subredditPostType = SubredditPostType.POLL;
                break;
            }
            case 5: {
                subredditPostType = SubredditPostType.SPOILER;
                break;
            }
            case 4: {
                subredditPostType = SubredditPostType.TEXT;
                break;
            }
            case 3: {
                subredditPostType = SubredditPostType.VIDEO;
                break;
            }
            case 2: {
                subredditPostType = SubredditPostType.IMAGE;
                break;
            }
            case 1: {
                subredditPostType = SubredditPostType.LINK;
                break;
            }
        }
        return subredditPostType;
    }
    
    public static final com.reddit.domain.model.sociallink.SocialLinkType toSocialLinkType(final SocialLinkType socialLinkType) {
        f.f((Object)socialLinkType, "<this>");
        com.reddit.domain.model.sociallink.SocialLinkType socialLinkType2 = null;
        switch (WhenMappings.$EnumSwitchMapping$1[((Enum)socialLinkType).ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 27: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.BUY_ME_A_COFFEE;
                break;
            }
            case 26: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.KICKSTARTER;
                break;
            }
            case 25: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.SOUNDCLOUD;
                break;
            }
            case 24: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.INDIEGOGO;
                break;
            }
            case 23: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.INSTAGRAM;
                break;
            }
            case 22: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.FACEBOOK;
                break;
            }
            case 21: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.LINKTREE;
                break;
            }
            case 20: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.CASH_APP;
                break;
            }
            case 19: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.ONLYFANS;
                break;
            }
            case 18: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.SUBSTACK;
                break;
            }
            case 17: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.CUSTOM;
                break;
            }
            case 16: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.SHOPIFY;
                break;
            }
            case 15: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.PATREON;
                break;
            }
            case 14: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.TWITTER;
                break;
            }
            case 13: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.DISCORD;
                break;
            }
            case 12: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.BEACONS;
                break;
            }
            case 11: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.YOUTUBE;
                break;
            }
            case 10: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.SPOTIFY;
                break;
            }
            case 9: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.PAYPAL;
                break;
            }
            case 8: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.REDDIT;
                break;
            }
            case 7: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.TUMBLR;
                break;
            }
            case 6: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.TWITCH;
                break;
            }
            case 5: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.TIKTOK;
                break;
            }
            case 4: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.CUSTOM;
                break;
            }
            case 3: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.CAMEO;
                break;
            }
            case 2: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.VENMO;
                break;
            }
            case 1: {
                socialLinkType2 = com.reddit.domain.model.sociallink.SocialLinkType.KOFI;
                break;
            }
        }
        return socialLinkType2;
    }
}
