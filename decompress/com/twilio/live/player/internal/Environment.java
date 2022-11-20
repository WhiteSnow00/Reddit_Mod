// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.live.player.internal;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lcom/twilio/live/player/internal/Environment;", "", "host", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getHost", "()Ljava/lang/String;", "DEV", "STAGE", "PROD", "player_release" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
public enum Environment
{
    private static final Environment[] $VALUES;
    
    DEV("https://media.dev.twilio.com"), 
    PROD("https://media.twilio.com"), 
    STAGE("https://media.stage.twilio.com");
    
    private final String host;
    
    private static final Environment[] $values() {
        return new Environment[] { Environment.DEV, Environment.STAGE, Environment.PROD };
    }
    
    static {
        $VALUES = $values();
    }
    
    private Environment(final String host) {
        this.host = host;
    }
    
    public final String getHost() {
        return this.host;
    }
}
