// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.settings;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015?\u0006\u0016" }, d2 = { "Lcom/reddit/domain/settings/Destination;", "", "(Ljava/lang/String;I)V", "NOTIFICATIONS", "AD_PERSONALIZATION", "ACCOUNT_SETTINGS", "EXPERIMENTS", "PREMIUM_MANAGE", "PREMIUM_BUY", "CONTENT_LANGUAGES", "EXPOSURES", "MOCK_FEED_ELEMENT", "MOCK_GEOLOCATION", "CHOOSE_LAUNCHER_ICON", "SNOOVATAR", "SNOOVATAR_QUICK_CREATE_V2_SELECTION", "MARKETPLACE_NFT_CLAIM", "MARKETPLACE_NFT_DETAIL", "MARKETPLACE_NFT_STOREFRONT_NFT_DETAIL", "SNOOVATAR_MY_STUFF", "SNOOVATAR_EXPLORE", "SNOOVATAR_STOREFRONT", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum Destination
{
    private static final Destination[] $VALUES;
    
    ACCOUNT_SETTINGS, 
    AD_PERSONALIZATION, 
    CHOOSE_LAUNCHER_ICON, 
    CONTENT_LANGUAGES, 
    EXPERIMENTS, 
    EXPOSURES, 
    MARKETPLACE_NFT_CLAIM, 
    MARKETPLACE_NFT_DETAIL, 
    MARKETPLACE_NFT_STOREFRONT_NFT_DETAIL, 
    MOCK_FEED_ELEMENT, 
    MOCK_GEOLOCATION, 
    NOTIFICATIONS, 
    PREMIUM_BUY, 
    PREMIUM_MANAGE, 
    SNOOVATAR, 
    SNOOVATAR_EXPLORE, 
    SNOOVATAR_MY_STUFF, 
    SNOOVATAR_QUICK_CREATE_V2_SELECTION, 
    SNOOVATAR_STOREFRONT;
    
    private static final Destination[] $values() {
        return new Destination[] { Destination.NOTIFICATIONS, Destination.AD_PERSONALIZATION, Destination.ACCOUNT_SETTINGS, Destination.EXPERIMENTS, Destination.PREMIUM_MANAGE, Destination.PREMIUM_BUY, Destination.CONTENT_LANGUAGES, Destination.EXPOSURES, Destination.MOCK_FEED_ELEMENT, Destination.MOCK_GEOLOCATION, Destination.CHOOSE_LAUNCHER_ICON, Destination.SNOOVATAR, Destination.SNOOVATAR_QUICK_CREATE_V2_SELECTION, Destination.MARKETPLACE_NFT_CLAIM, Destination.MARKETPLACE_NFT_DETAIL, Destination.MARKETPLACE_NFT_STOREFRONT_NFT_DETAIL, Destination.SNOOVATAR_MY_STUFF, Destination.SNOOVATAR_EXPLORE, Destination.SNOOVATAR_STOREFRONT };
    }
    
    static {
        $VALUES = $values();
    }
}
