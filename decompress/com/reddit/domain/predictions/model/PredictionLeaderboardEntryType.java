// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.predictions.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/domain/predictions/model/PredictionLeaderboardEntryType;", "", "(Ljava/lang/String;I)V", "LISTING_FEED_UNIT", "SUBREDDIT_PREDICTIONS_TAB", "PREDICTIONS_TOURNAMENT_FEED", "SUBREDDIT_HEADER", "PREDICTION_DETAILS", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum PredictionLeaderboardEntryType
{
    private static final PredictionLeaderboardEntryType[] $VALUES;
    
    LISTING_FEED_UNIT, 
    PREDICTIONS_TOURNAMENT_FEED, 
    PREDICTION_DETAILS, 
    SUBREDDIT_HEADER, 
    SUBREDDIT_PREDICTIONS_TAB;
    
    private static final PredictionLeaderboardEntryType[] $values() {
        return new PredictionLeaderboardEntryType[] { PredictionLeaderboardEntryType.LISTING_FEED_UNIT, PredictionLeaderboardEntryType.SUBREDDIT_PREDICTIONS_TAB, PredictionLeaderboardEntryType.PREDICTIONS_TOURNAMENT_FEED, PredictionLeaderboardEntryType.SUBREDDIT_HEADER, PredictionLeaderboardEntryType.PREDICTION_DETAILS };
    }
    
    static {
        $VALUES = $values();
    }
}
