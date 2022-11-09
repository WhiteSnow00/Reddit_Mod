// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003�\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003�\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b�\u0006\f" }, d2 = { "Lcom/reddit/domain/model/streaming/AutoMuteViolationLevel;", "", "level", "", "(Ljava/lang/String;II)V", "getLevel", "()I", "NO_VIOLATIONS", "WARNING", "SINGLE_STREAM_AUTO_MUTE", "SITE_WIDE_AUTO_MUTE", "DEFAULT", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum AutoMuteViolationLevel
{
    DEFAULT(-1), 
    NO_VIOLATIONS(0), 
    SINGLE_STREAM_AUTO_MUTE(2), 
    SITE_WIDE_AUTO_MUTE(3), 
    WARNING(1);
    
    private final int level;
    
    private AutoMuteViolationLevel(final int level) {
        this.level = level;
    }
    
    public final int getLevel() {
        return this.level;
    }
}