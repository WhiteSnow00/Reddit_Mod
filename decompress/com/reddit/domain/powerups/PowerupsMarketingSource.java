// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.powerups;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "Lcom/reddit/domain/powerups/PowerupsMarketingSource;", "", "(Ljava/lang/String;I)V", "CUSTOM_EMOJIS", "INFEED_UNIT", "USER_HOVERCARD", "POWERUPS_TAB", "COMMENT_GIFS_EMOJIS", "USER_PROFILE", "LIVEAUDIO_EMOJIS", "POWERUP_MARKETING", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum PowerupsMarketingSource
{
    private static final PowerupsMarketingSource[] $VALUES;
    
    COMMENT_GIFS_EMOJIS, 
    CUSTOM_EMOJIS, 
    INFEED_UNIT, 
    LIVEAUDIO_EMOJIS, 
    POWERUPS_TAB, 
    POWERUP_MARKETING, 
    USER_HOVERCARD, 
    USER_PROFILE;
    
    private static final PowerupsMarketingSource[] $values() {
        return new PowerupsMarketingSource[] { PowerupsMarketingSource.CUSTOM_EMOJIS, PowerupsMarketingSource.INFEED_UNIT, PowerupsMarketingSource.USER_HOVERCARD, PowerupsMarketingSource.POWERUPS_TAB, PowerupsMarketingSource.COMMENT_GIFS_EMOJIS, PowerupsMarketingSource.USER_PROFILE, PowerupsMarketingSource.LIVEAUDIO_EMOJIS, PowerupsMarketingSource.POWERUP_MARKETING };
    }
    
    static {
        $VALUES = $values();
    }
}
