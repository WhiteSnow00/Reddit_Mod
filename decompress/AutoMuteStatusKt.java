// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0001¨\u0006\u0006" }, d2 = { "intToViolationLevelEnum", "Lcom/reddit/domain/model/streaming/AutoMuteViolationLevel;", "violationLevel", "", "isBlockingViolation", "", "temp_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class AutoMuteStatusKt
{
    public static final AutoMuteViolationLevel intToViolationLevelEnum(final int n) {
        AutoMuteViolationLevel autoMuteViolationLevel;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    autoMuteViolationLevel = AutoMuteViolationLevel.NO_VIOLATIONS;
                }
                else {
                    autoMuteViolationLevel = AutoMuteViolationLevel.SITE_WIDE_AUTO_MUTE;
                }
            }
            else {
                autoMuteViolationLevel = AutoMuteViolationLevel.SINGLE_STREAM_AUTO_MUTE;
            }
        }
        else {
            autoMuteViolationLevel = AutoMuteViolationLevel.WARNING;
        }
        return autoMuteViolationLevel;
    }
    
    public static final boolean isBlockingViolation(final AutoMuteViolationLevel autoMuteViolationLevel) {
        f.f((Object)autoMuteViolationLevel, "<this>");
        return autoMuteViolationLevel == AutoMuteViolationLevel.SINGLE_STREAM_AUTO_MUTE || autoMuteViolationLevel == AutoMuteViolationLevel.SITE_WIDE_AUTO_MUTE;
    }
}
