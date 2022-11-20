// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.predictions.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/predictions/model/PredictionChatLockReason;", "", "(Ljava/lang/String;I)V", "RESOLVED", "NO_PREDICTION_BEFORE_VOTING_PERIOD_ENDED", "NO_PREDICTION_AND_VOTING_PERIOD_ACTIVE", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum PredictionChatLockReason
{
    private static final PredictionChatLockReason[] $VALUES;
    
    NO_PREDICTION_AND_VOTING_PERIOD_ACTIVE, 
    NO_PREDICTION_BEFORE_VOTING_PERIOD_ENDED, 
    RESOLVED;
    
    private static final PredictionChatLockReason[] $values() {
        return new PredictionChatLockReason[] { PredictionChatLockReason.RESOLVED, PredictionChatLockReason.NO_PREDICTION_BEFORE_VOTING_PERIOD_ENDED, PredictionChatLockReason.NO_PREDICTION_AND_VOTING_PERIOD_ACTIVE };
    }
    
    static {
        $VALUES = $values();
    }
}
