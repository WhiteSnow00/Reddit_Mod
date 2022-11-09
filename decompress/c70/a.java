// 
// Decompiled by Procyon v0.6.0
// 

package c70;

import kotlin.NoWhenBranchMatchedException;
import com.reddit.domain.model.sociallink.SocialLinkType;
import javax.inject.Inject;
import ur0.g;
import lb0.c;

public final class a implements c
{
    public final g a;
    
    @Inject
    public a(final g a) {
        this.a = a;
    }
    
    public static com.reddit.type.SocialLinkType a(final SocialLinkType socialLinkType) {
        com.reddit.type.SocialLinkType socialLinkType2 = null;
        switch (a.a[socialLinkType.ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 26: {
                socialLinkType2 = com.reddit.type.SocialLinkType.BUY_ME_A_COFFEE;
                break;
            }
            case 25: {
                socialLinkType2 = com.reddit.type.SocialLinkType.KICKSTARTER;
                break;
            }
            case 24: {
                socialLinkType2 = com.reddit.type.SocialLinkType.SOUNDCLOUD;
                break;
            }
            case 23: {
                socialLinkType2 = com.reddit.type.SocialLinkType.INSTAGRAM;
                break;
            }
            case 22: {
                socialLinkType2 = com.reddit.type.SocialLinkType.INDIEGOGO;
                break;
            }
            case 21: {
                socialLinkType2 = com.reddit.type.SocialLinkType.FACEBOOK;
                break;
            }
            case 20: {
                socialLinkType2 = com.reddit.type.SocialLinkType.LINKTREE;
                break;
            }
            case 19: {
                socialLinkType2 = com.reddit.type.SocialLinkType.CASH_APP;
                break;
            }
            case 18: {
                socialLinkType2 = com.reddit.type.SocialLinkType.SUBSTACK;
                break;
            }
            case 17: {
                socialLinkType2 = com.reddit.type.SocialLinkType.ONLYFANS;
                break;
            }
            case 16: {
                socialLinkType2 = com.reddit.type.SocialLinkType.YOUTUBE;
                break;
            }
            case 15: {
                socialLinkType2 = com.reddit.type.SocialLinkType.DISCORD;
                break;
            }
            case 14: {
                socialLinkType2 = com.reddit.type.SocialLinkType.BEACONS;
                break;
            }
            case 13: {
                socialLinkType2 = com.reddit.type.SocialLinkType.TWITTER;
                break;
            }
            case 12: {
                socialLinkType2 = com.reddit.type.SocialLinkType.SPOTIFY;
                break;
            }
            case 11: {
                socialLinkType2 = com.reddit.type.SocialLinkType.PATREON;
                break;
            }
            case 10: {
                socialLinkType2 = com.reddit.type.SocialLinkType.SHOPIFY;
                break;
            }
            case 9: {
                socialLinkType2 = com.reddit.type.SocialLinkType.TUMBLR;
                break;
            }
            case 8: {
                socialLinkType2 = com.reddit.type.SocialLinkType.TWITCH;
                break;
            }
            case 7: {
                socialLinkType2 = com.reddit.type.SocialLinkType.TIKTOK;
                break;
            }
            case 6: {
                socialLinkType2 = com.reddit.type.SocialLinkType.REDDIT;
                break;
            }
            case 5: {
                socialLinkType2 = com.reddit.type.SocialLinkType.CUSTOM;
                break;
            }
            case 4: {
                socialLinkType2 = com.reddit.type.SocialLinkType.PAYPAL;
                break;
            }
            case 3: {
                socialLinkType2 = com.reddit.type.SocialLinkType.VENMO;
                break;
            }
            case 2: {
                socialLinkType2 = com.reddit.type.SocialLinkType.CAMEO;
                break;
            }
            case 1: {
                socialLinkType2 = com.reddit.type.SocialLinkType.KOFI;
                break;
            }
        }
        return socialLinkType2;
    }
}
