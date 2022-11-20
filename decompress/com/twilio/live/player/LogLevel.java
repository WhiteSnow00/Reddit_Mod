// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.live.player;

import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f" }, d2 = { "Lcom/twilio/live/player/LogLevel;", "", "(Ljava/lang/String;I)V", "enabled", "", "level", "enabled$player_release", "OFF", "ERROR", "WARNING", "INFO", "DEBUG", "player_release" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
public enum LogLevel
{
    private static final LogLevel[] $VALUES;
    
    DEBUG, 
    ERROR, 
    INFO, 
    OFF, 
    WARNING;
    
    private static final LogLevel[] $values() {
        return new LogLevel[] { LogLevel.OFF, LogLevel.ERROR, LogLevel.WARNING, LogLevel.INFO, LogLevel.DEBUG };
    }
    
    static {
        $VALUES = $values();
    }
    
    public final boolean enabled$player_release(final LogLevel logLevel) {
        e.f((Object)logLevel, "level");
        return logLevel != LogLevel.OFF && logLevel.compareTo(this) >= 0;
    }
}
