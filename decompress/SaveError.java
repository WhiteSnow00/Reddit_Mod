// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository.util;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "Lcom/reddit/data/snoovatar/repository/util/SaveError;", "", "reason", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getReason", "()Ljava/lang/String;", "ClosetSlotsOverflow", "ActiveClosetSubscriptionRequired", "CapabilityMissing", "Unknown", "data_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum SaveError
{
    ActiveClosetSubscriptionRequired("ACTIVE_CLOSET_SUBSCRIPTION_REQUIRED"), 
    CapabilityMissing("CAPABILITY_MISSING"), 
    ClosetSlotsOverflow("CLOSET_SLOTS_OVERFLOW"), 
    Unknown("");
    
    private final String reason;
    
    private SaveError(final String reason) {
        this.reason = reason;
    }
    
    public final String getReason() {
        return this.reason;
    }
}
