// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.settings;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/modtools/settings/ModSettings;", "", "communityInviteTooltipSeen", "", "getCommunityInviteTooltipSeen", "()Z", "setCommunityInviteTooltipSeen", "(Z)V", "mediaInCommentsClicked", "getMediaInCommentsClicked", "setMediaInCommentsClicked", "modPredictionPostsClicked", "getModPredictionPostsClicked", "setModPredictionPostsClicked", "powerupsClicked", "getPowerupsClicked", "setPowerupsClicked", "schedulePostClicked", "getSchedulePostClicked", "setSchedulePostClicked", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public interface ModSettings
{
    boolean getCommunityInviteTooltipSeen();
    
    boolean getMediaInCommentsClicked();
    
    boolean getModPredictionPostsClicked();
    
    boolean getPowerupsClicked();
    
    boolean getSchedulePostClicked();
    
    void setCommunityInviteTooltipSeen(final boolean p0);
    
    void setMediaInCommentsClicked(final boolean p0);
    
    void setModPredictionPostsClicked(final boolean p0);
    
    void setPowerupsClicked(final boolean p0);
    
    void setSchedulePostClicked(final boolean p0);
}
