// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.customemojis;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/customemojis/PowerupEmotesAvailability;", "", "(Ljava/lang/String;I)V", "DISABLED", "ENABLED", "LOCKED", "ENABLED_BY_PARENT_COMMENTS", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
enum PowerupEmotesAvailability
{
    private static final PowerupEmotesAvailability[] $VALUES;
    
    DISABLED, 
    ENABLED, 
    ENABLED_BY_PARENT_COMMENTS, 
    LOCKED;
    
    private static final PowerupEmotesAvailability[] $values() {
        return new PowerupEmotesAvailability[] { PowerupEmotesAvailability.DISABLED, PowerupEmotesAvailability.ENABLED, PowerupEmotesAvailability.LOCKED, PowerupEmotesAvailability.ENABLED_BY_PARENT_COMMENTS };
    }
    
    static {
        $VALUES = $values();
    }
}
